package demo;

import static spark.Spark.*;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.*;

import java.util.*;

//杨子霄负责
public class Main {
	public static void main(String[] args) {
		// 启用 CORS
		options("/*", (request, response) -> {
			String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
			if (accessControlRequestHeaders != null) {
				response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
			}

			String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
			if (accessControlRequestMethod != null) {
				response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
			}

			return "OK";
		});

		before((request, response) -> {
			response.header("Access-Control-Allow-Origin", "*");
			response.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
			response.header("Access-Control-Allow-Headers", "Content-Type, Authorization, Accept");
			response.header("Access-Control-Allow-Credentials", "true");
		});

		// 添加新的API端点
		post("/compile", (req, res) -> {
			JsonObject requestBody = new Gson().fromJson(req.body(), JsonObject.class);
			String code = requestBody.get("code").getAsString();

			try {
				// 创建词法分析器和语法分析器
				CharStream input = CharStreams.fromString(code);
				RustLexer lexer = new RustLexer(input);

				// 创建自定义错误收集器
				List<String> errors = new ArrayList<>();
				lexer.removeErrorListeners();
				lexer.addErrorListener(new BaseErrorListener() {
					@Override
					public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
											int line, int charPositionInLine,
											String msg, RecognitionException e) {
						errors.add("行 " + line + ":" + charPositionInLine + " - " + msg);
					}
				});

				CommonTokenStream tokens = new CommonTokenStream(lexer);
				RustParser parser = new RustParser(tokens);

				parser.removeErrorListeners();
				parser.addErrorListener(new BaseErrorListener() {
					@Override
					public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
											int line, int charPositionInLine,
											String msg, RecognitionException e) {
						errors.add("行 " + line + ":" + charPositionInLine + " - " + msg);
					}
				});

				// 解析代码
				ParseTree tree = parser.crate();

				// 检查是否有错误
				if (!errors.isEmpty()) {
					res.status(400); // 客户端错误
					JsonObject response = new JsonObject();
					response.add("errors", new Gson().toJsonTree(errors));
					return response;
				}

				// 准备响应数据
				JsonObject response = new JsonObject();

				// Token流
				List<Map<String, Object>> tokenList = new ArrayList<>();
				for (Token token : tokens.getTokens()) {
					if (token.getType() != Token.EOF) {
						Map<String, Object> tokenData = new HashMap<>();
						tokenData.put("type", RustLexer.VOCABULARY.getSymbolicName(token.getType()));
						tokenData.put("value", token.getText());
						tokenData.put("line", token.getLine());
						tokenData.put("col", token.getCharPositionInLine());
						tokenList.add(tokenData);
					}
				}
				response.add("tokens", new Gson().toJsonTree(tokenList));

				// 语法树（LISP格式）
				String parseTree = tree.toStringTree(parser);
				response.addProperty("parseTree", parseTree);

				// AST（使用自定义遍历器）
				AstNode ast = buildAst(tree);
				response.add("ast", new Gson().toJsonTree(ast));

				// 字符绘制的ParseTree
				String charTree = generateCharTree(tree, parser);
				response.addProperty("charTree", charTree);

				res.type("application/json");
				return response;
			} catch (Exception e) {
				res.status(500);
				JsonObject error = new JsonObject();
				error.addProperty("error", "内部服务器错误: " + e.getMessage());
				return error;
			}
		});

		// 设置端口
		port(4567);
		System.out.println("Server running on http://localhost:4567");
	}

	// AST节点类
	static class AstNode {
		String type;
		String value;
		List<AstNode> children = new ArrayList<>();

		public AstNode(String type) {
			this.type = type;
		}

		public AstNode(String type, String value) {
			this.type = type;
			this.value = value;
		}
	}

	// 构建AST的递归方法
	private static AstNode buildAst(ParseTree tree) {
		if (tree instanceof TerminalNode) {
			Token token = ((TerminalNode) tree).getSymbol();
			return new AstNode(
					RustLexer.VOCABULARY.getSymbolicName(token.getType()),
					token.getText()
			);
		}

		RuleContext ctx = (RuleContext) tree;
		AstNode node = new AstNode(RustParser.ruleNames[ctx.getRuleIndex()]);

		for (int i = 0; i < tree.getChildCount(); i++) {
			node.children.add(buildAst(tree.getChild(i)));
		}

		return node;
	}

	// 生成字符绘制的ParseTree
	private static String generateCharTree(ParseTree tree, Parser parser) {
		StringBuilder sb = new StringBuilder();
		generateCharTreeHelper(tree, parser, "", true, sb);
		return sb.toString();
	}

	private static void generateCharTreeHelper(ParseTree tree, Parser parser, String indent, boolean last, StringBuilder sb) {
		String nodeName = tree instanceof TerminalNode ?
				((TerminalNode) tree).getSymbol().getText() :
				parser.getRuleNames()[((RuleContext) tree).getRuleIndex()];

		sb.append(indent);
		if (last) {
			sb.append("└─ ");
			indent += "   ";
		} else {
			sb.append("├─ ");
			indent += "│  ";
		}
		sb.append(nodeName).append("\n");

		int count = tree.getChildCount();
		for (int i = 0; i < count; i++) {
			generateCharTreeHelper(tree.getChild(i), parser, indent, i == count - 1, sb);
		}
	}
}
