// Generated from D:/【】作业/【】编译技术/大作业/proj/src/main/java/Rust.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RustParser}.
 */
public interface RustListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RustParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(RustParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(RustParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(RustParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(RustParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(RustParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(RustParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(RustParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(RustParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(RustParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(RustParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(RustParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(RustParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#structDef}.
	 * @param ctx the parse tree
	 */
	void enterStructDef(RustParser.StructDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#structDef}.
	 * @param ctx the parse tree
	 */
	void exitStructDef(RustParser.StructDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(RustParser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(RustParser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#structFieldList}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldList(RustParser.StructFieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#structFieldList}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldList(RustParser.StructFieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#structField}.
	 * @param ctx the parse tree
	 */
	void enterStructField(RustParser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#structField}.
	 * @param ctx the parse tree
	 */
	void exitStructField(RustParser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(RustParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(RustParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enumDef}.
	 * @param ctx the parse tree
	 */
	void enterEnumDef(RustParser.EnumDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enumDef}.
	 * @param ctx the parse tree
	 */
	void exitEnumDef(RustParser.EnumDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enumVariantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumVariantList(RustParser.EnumVariantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enumVariantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumVariantList(RustParser.EnumVariantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enumVariant}.
	 * @param ctx the parse tree
	 */
	void enterEnumVariant(RustParser.EnumVariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enumVariant}.
	 * @param ctx the parse tree
	 */
	void exitEnumVariant(RustParser.EnumVariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#moduleDef}.
	 * @param ctx the parse tree
	 */
	void enterModuleDef(RustParser.ModuleDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#moduleDef}.
	 * @param ctx the parse tree
	 */
	void exitModuleDef(RustParser.ModuleDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#useDecl}.
	 * @param ctx the parse tree
	 */
	void enterUseDecl(RustParser.UseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#useDecl}.
	 * @param ctx the parse tree
	 */
	void exitUseDecl(RustParser.UseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(RustParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(RustParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#traitDef}.
	 * @param ctx the parse tree
	 */
	void enterTraitDef(RustParser.TraitDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#traitDef}.
	 * @param ctx the parse tree
	 */
	void exitTraitDef(RustParser.TraitDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#traitItem}.
	 * @param ctx the parse tree
	 */
	void enterTraitItem(RustParser.TraitItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#traitItem}.
	 * @param ctx the parse tree
	 */
	void exitTraitItem(RustParser.TraitItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(RustParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(RustParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#implBlock}.
	 * @param ctx the parse tree
	 */
	void enterImplBlock(RustParser.ImplBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#implBlock}.
	 * @param ctx the parse tree
	 */
	void exitImplBlock(RustParser.ImplBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#implItem}.
	 * @param ctx the parse tree
	 */
	void enterImplItem(RustParser.ImplItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#implItem}.
	 * @param ctx the parse tree
	 */
	void exitImplItem(RustParser.ImplItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(RustParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(RustParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#staticDef}.
	 * @param ctx the parse tree
	 */
	void enterStaticDef(RustParser.StaticDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#staticDef}.
	 * @param ctx the parse tree
	 */
	void exitStaticDef(RustParser.StaticDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(RustParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(RustParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RustParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RustParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RustParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RustParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(RustParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(RustParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RustParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RustParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(RustParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(RustParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#matchArmList}.
	 * @param ctx the parse tree
	 */
	void enterMatchArmList(RustParser.MatchArmListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#matchArmList}.
	 * @param ctx the parse tree
	 */
	void exitMatchArmList(RustParser.MatchArmListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#matchArm}.
	 * @param ctx the parse tree
	 */
	void enterMatchArm(RustParser.MatchArmContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#matchArm}.
	 * @param ctx the parse tree
	 */
	void exitMatchArm(RustParser.MatchArmContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RustParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RustParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RustParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RustParser.LiteralContext ctx);
}