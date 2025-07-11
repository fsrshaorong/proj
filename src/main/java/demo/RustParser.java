//// Generated from D:/【】作业/【】编译技术/大作业/proj/src/main/java/Rust.g4 by ANTLR 4.13.2
//import org.antlr.v4.runtime.atn.*;
//import org.antlr.v4.runtime.dfa.DFA;
//import org.antlr.v4.runtime.*;
//import org.antlr.v4.runtime.misc.*;
//import org.antlr.v4.runtime.tree.*;
//import java.util.List;
//import java.util.Iterator;
//import java.util.ArrayList;
//
//@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
//public class RustParser extends Parser {
//	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }
//
//	protected static final DFA[] _decisionToDFA;
//	protected static final PredictionContextCache _sharedContextCache =
//		new PredictionContextCache();
//	public static final int
//		FN=1, STRUCT=2, ENUM=3, MOD=4, USE=5, TRAIT=6, IMPL=7, CONST=8, STATIC=9,
//		TYPE=10, LET=11, IF=12, ELSE=13, MATCH=14, WHILE=15, FOR=16, IN=17, LOOP=18,
//		RETURN=19, BREAK=20, CONTINUE=21, UNSAFE=22, BOX=23, REF=24, MOVE=25,
//		SOME=26, NONE=27, OK=28, ERR=29, TRUE=30, FALSE=31, NULL=32, LPAREN=33,
//		RPAREN=34, LBRACE=35, RBRACE=36, LBRACK=37, RBRACK=38, COLON=39, SEMICOLON=40,
//		COMMA=41, DOT=42, RARROW=43, PLUS=44, MINUS=45, STAR=46, SLASH=47, EQ=48,
//		AND=49, MUT=50, PIPE=51, LT=52, GT=53, DOUBLECOLON=54, STAR_SYM=55, BOX_LT=56,
//		VEC_LT=57, OPTION_LT=58, RESULT_LT=59, IDENTIFIER=60, NUMBER=61, STRING=62,
//		LINE_COMMENT=63, BLOCK_COMMENT=64, WS=65;
//	public static final int
//		RULE_compilationUnit = 0, RULE_item = 1, RULE_function = 2, RULE_parameterList = 3,
//		RULE_parameter = 4, RULE_pattern = 5, RULE_structDef = 6, RULE_structBody = 7,
//		RULE_structFieldList = 8, RULE_structField = 9, RULE_typeList = 10, RULE_enumDef = 11,
//		RULE_enumVariantList = 12, RULE_enumVariant = 13, RULE_moduleDef = 14,
//		RULE_useDecl = 15, RULE_path = 16, RULE_traitDef = 17, RULE_traitItem = 18,
//		RULE_functionSignature = 19, RULE_implBlock = 20, RULE_implItem = 21,
//		RULE_constDef = 22, RULE_staticDef = 23, RULE_typeAlias = 24, RULE_block = 25,
//		RULE_statement = 26, RULE_local = 27, RULE_expression = 28, RULE_expressionList = 29,
//		RULE_matchArmList = 30, RULE_matchArm = 31, RULE_type = 32, RULE_literal = 33;
//	private static String[] makeRuleNames() {
//		return new String[] {
//			"compilationUnit", "item", "function", "parameterList", "parameter",
//			"pattern", "structDef", "structBody", "structFieldList", "structField",
//			"typeList", "enumDef", "enumVariantList", "enumVariant", "moduleDef",
//			"useDecl", "path", "traitDef", "traitItem", "functionSignature", "implBlock",
//			"implItem", "constDef", "staticDef", "typeAlias", "block", "statement",
//			"local", "expression", "expressionList", "matchArmList", "matchArm",
//			"type", "literal"
//		};
//	}
//	public static final String[] ruleNames = makeRuleNames();
//
//	private static String[] makeLiteralNames() {
//		return new String[] {
//			null, "'fn'", "'struct'", "'enum'", "'mod'", "'use'", "'trait'", "'impl'",
//			"'const'", "'static'", "'type'", "'let'", "'if'", "'else'", "'match'",
//			"'while'", "'for'", "'in'", "'loop'", "'return'", "'break'", "'continue'",
//			"'unsafe'", "'box'", "'ref'", "'move'", "'Some'", "'None'", "'Ok'", "'Err'",
//			"'true'", "'false'", "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'",
//			"':'", "';'", "','", "'.'", "'->'", "'+'", "'-'", null, "'/'", "'='",
//			"'&'", "'mut'", "'|'", "'<'", "'>'", "'::'"
//		};
//	}
//	private static final String[] _LITERAL_NAMES = makeLiteralNames();
//	private static String[] makeSymbolicNames() {
//		return new String[] {
//			null, "FN", "STRUCT", "ENUM", "MOD", "USE", "TRAIT", "IMPL", "CONST",
//			"STATIC", "TYPE", "LET", "IF", "ELSE", "MATCH", "WHILE", "FOR", "IN",
//			"LOOP", "RETURN", "BREAK", "CONTINUE", "UNSAFE", "BOX", "REF", "MOVE",
//			"SOME", "NONE", "OK", "ERR", "TRUE", "FALSE", "NULL", "LPAREN", "RPAREN",
//			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "COLON", "SEMICOLON", "COMMA",
//			"DOT", "RARROW", "PLUS", "MINUS", "STAR", "SLASH", "EQ", "AND", "MUT",
//			"PIPE", "LT", "GT", "DOUBLECOLON", "STAR_SYM", "BOX_LT", "VEC_LT", "OPTION_LT",
//			"RESULT_LT", "IDENTIFIER", "NUMBER", "STRING", "LINE_COMMENT", "BLOCK_COMMENT",
//			"WS"
//		};
//	}
//	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
//	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
//
//	/**
//	 * @deprecated Use {@link #VOCABULARY} instead.
//	 */
//	@Deprecated
//	public static final String[] tokenNames;
//	static {
//		tokenNames = new String[_SYMBOLIC_NAMES.length];
//		for (int i = 0; i < tokenNames.length; i++) {
//			tokenNames[i] = VOCABULARY.getLiteralName(i);
//			if (tokenNames[i] == null) {
//				tokenNames[i] = VOCABULARY.getSymbolicName(i);
//			}
//
//			if (tokenNames[i] == null) {
//				tokenNames[i] = "<INVALID>";
//			}
//		}
//	}
//
//	@Override
//	@Deprecated
//	public String[] getTokenNames() {
//		return tokenNames;
//	}
//
//	@Override
//
//	public Vocabulary getVocabulary() {
//		return VOCABULARY;
//	}
//
//	@Override
//	public String getGrammarFileName() { return "Rust.g4"; }
//
//	@Override
//	public String[] getRuleNames() { return ruleNames; }
//
//	@Override
//	public String getSerializedATN() { return _serializedATN; }
//
//	@Override
//	public ATN getATN() { return _ATN; }
//
//	public RustParser(TokenStream input) {
//		super(input);
//		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class CompilationUnitContext extends ParserRuleContext {
//		public TerminalNode EOF() { return getToken(RustParser.EOF, 0); }
//		public List<ItemContext> item() {
//			return getRuleContexts(ItemContext.class);
//		}
//		public ItemContext item(int i) {
//			return getRuleContext(ItemContext.class,i);
//		}
//		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_compilationUnit; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterCompilationUnit(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitCompilationUnit(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitCompilationUnit(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final CompilationUnitContext compilationUnit() throws RecognitionException {
//		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
//		enterRule(_localctx, 0, RULE_compilationUnit);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(69);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			do {
//				{
//				{
//				setState(68);
//				item();
//				}
//				}
//				setState(71);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2046L) != 0) );
//			setState(73);
//			match(EOF);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class ItemContext extends ParserRuleContext {
//		public FunctionContext function() {
//			return getRuleContext(FunctionContext.class,0);
//		}
//		public StructDefContext structDef() {
//			return getRuleContext(StructDefContext.class,0);
//		}
//		public EnumDefContext enumDef() {
//			return getRuleContext(EnumDefContext.class,0);
//		}
//		public ModuleDefContext moduleDef() {
//			return getRuleContext(ModuleDefContext.class,0);
//		}
//		public UseDeclContext useDecl() {
//			return getRuleContext(UseDeclContext.class,0);
//		}
//		public TraitDefContext traitDef() {
//			return getRuleContext(TraitDefContext.class,0);
//		}
//		public ImplBlockContext implBlock() {
//			return getRuleContext(ImplBlockContext.class,0);
//		}
//		public ConstDefContext constDef() {
//			return getRuleContext(ConstDefContext.class,0);
//		}
//		public StaticDefContext staticDef() {
//			return getRuleContext(StaticDefContext.class,0);
//		}
//		public TypeAliasContext typeAlias() {
//			return getRuleContext(TypeAliasContext.class,0);
//		}
//		public ItemContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_item; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterItem(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitItem(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitItem(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final ItemContext item() throws RecognitionException {
//		ItemContext _localctx = new ItemContext(_ctx, getState());
//		enterRule(_localctx, 2, RULE_item);
//		try {
//			setState(85);
//			_errHandler.sync(this);
//			switch (_input.LA(1)) {
//			case FN:
//				enterOuterAlt(_localctx, 1);
//				{
//				setState(75);
//				function();
//				}
//				break;
//			case STRUCT:
//				enterOuterAlt(_localctx, 2);
//				{
//				setState(76);
//				structDef();
//				}
//				break;
//			case ENUM:
//				enterOuterAlt(_localctx, 3);
//				{
//				setState(77);
//				enumDef();
//				}
//				break;
//			case MOD:
//				enterOuterAlt(_localctx, 4);
//				{
//				setState(78);
//				moduleDef();
//				}
//				break;
//			case USE:
//				enterOuterAlt(_localctx, 5);
//				{
//				setState(79);
//				useDecl();
//				}
//				break;
//			case TRAIT:
//				enterOuterAlt(_localctx, 6);
//				{
//				setState(80);
//				traitDef();
//				}
//				break;
//			case IMPL:
//				enterOuterAlt(_localctx, 7);
//				{
//				setState(81);
//				implBlock();
//				}
//				break;
//			case CONST:
//				enterOuterAlt(_localctx, 8);
//				{
//				setState(82);
//				constDef();
//				}
//				break;
//			case STATIC:
//				enterOuterAlt(_localctx, 9);
//				{
//				setState(83);
//				staticDef();
//				}
//				break;
//			case TYPE:
//				enterOuterAlt(_localctx, 10);
//				{
//				setState(84);
//				typeAlias();
//				}
//				break;
//			default:
//				throw new NoViableAltException(this);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class FunctionContext extends ParserRuleContext {
//		public TerminalNode FN() { return getToken(RustParser.FN, 0); }
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
//		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
//		public BlockContext block() {
//			return getRuleContext(BlockContext.class,0);
//		}
//		public ParameterListContext parameterList() {
//			return getRuleContext(ParameterListContext.class,0);
//		}
//		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
//		public TypeContext type() {
//			return getRuleContext(TypeContext.class,0);
//		}
//		public FunctionContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_function; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterFunction(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitFunction(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitFunction(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final FunctionContext function() throws RecognitionException {
//		FunctionContext _localctx = new FunctionContext(_ctx, getState());
//		enterRule(_localctx, 4, RULE_function);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(87);
//			match(FN);
//			setState(88);
//			match(IDENTIFIER);
//			setState(89);
//			match(LPAREN);
//			setState(91);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==IDENTIFIER) {
//				{
//				setState(90);
//				parameterList();
//				}
//			}
//
//			setState(93);
//			match(RPAREN);
//			setState(96);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==RARROW) {
//				{
//				setState(94);
//				match(RARROW);
//				setState(95);
//				type(0);
//				}
//			}
//
//			setState(98);
//			block();
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class ParameterListContext extends ParserRuleContext {
//		public List<ParameterContext> parameter() {
//			return getRuleContexts(ParameterContext.class);
//		}
//		public ParameterContext parameter(int i) {
//			return getRuleContext(ParameterContext.class,i);
//		}
//		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
//		public TerminalNode COMMA(int i) {
//			return getToken(RustParser.COMMA, i);
//		}
//		public ParameterListContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_parameterList; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterParameterList(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitParameterList(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitParameterList(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final ParameterListContext parameterList() throws RecognitionException {
//		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
//		enterRule(_localctx, 6, RULE_parameterList);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(100);
//			parameter();
//			setState(105);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			while (_la==COMMA) {
//				{
//				{
//				setState(101);
//				match(COMMA);
//				setState(102);
//				parameter();
//				}
//				}
//				setState(107);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//			}
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class ParameterContext extends ParserRuleContext {
//		public PatternContext pattern() {
//			return getRuleContext(PatternContext.class,0);
//		}
//		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
//		public TypeContext type() {
//			return getRuleContext(TypeContext.class,0);
//		}
//		public ParameterContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_parameter; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterParameter(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitParameter(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitParameter(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final ParameterContext parameter() throws RecognitionException {
//		ParameterContext _localctx = new ParameterContext(_ctx, getState());
//		enterRule(_localctx, 8, RULE_parameter);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(108);
//			pattern();
//			setState(109);
//			match(COLON);
//			setState(110);
//			type(0);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class PatternContext extends ParserRuleContext {
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public PatternContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_pattern; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterPattern(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitPattern(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitPattern(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final PatternContext pattern() throws RecognitionException {
//		PatternContext _localctx = new PatternContext(_ctx, getState());
//		enterRule(_localctx, 10, RULE_pattern);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(112);
//			match(IDENTIFIER);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class StructDefContext extends ParserRuleContext {
//		public TerminalNode STRUCT() { return getToken(RustParser.STRUCT, 0); }
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public StructBodyContext structBody() {
//			return getRuleContext(StructBodyContext.class,0);
//		}
//		public StructDefContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_structDef; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterStructDef(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitStructDef(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitStructDef(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final StructDefContext structDef() throws RecognitionException {
//		StructDefContext _localctx = new StructDefContext(_ctx, getState());
//		enterRule(_localctx, 12, RULE_structDef);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(114);
//			match(STRUCT);
//			setState(115);
//			match(IDENTIFIER);
//			setState(116);
//			structBody();
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class StructBodyContext extends ParserRuleContext {
//		public TerminalNode LBRACE() { return getToken(RustParser.LBRACE, 0); }
//		public TerminalNode RBRACE() { return getToken(RustParser.RBRACE, 0); }
//		public StructFieldListContext structFieldList() {
//			return getRuleContext(StructFieldListContext.class,0);
//		}
//		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
//		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
//		public TypeListContext typeList() {
//			return getRuleContext(TypeListContext.class,0);
//		}
//		public StructBodyContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_structBody; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterStructBody(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitStructBody(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitStructBody(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final StructBodyContext structBody() throws RecognitionException {
//		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
//		enterRule(_localctx, 14, RULE_structBody);
//		int _la;
//		try {
//			setState(128);
//			_errHandler.sync(this);
//			switch (_input.LA(1)) {
//			case LBRACE:
//				enterOuterAlt(_localctx, 1);
//				{
//				setState(118);
//				match(LBRACE);
//				setState(120);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				if (_la==IDENTIFIER) {
//					{
//					setState(119);
//					structFieldList();
//					}
//				}
//
//				setState(122);
//				match(RBRACE);
//				}
//				break;
//			case LPAREN:
//				enterOuterAlt(_localctx, 2);
//				{
//				setState(123);
//				match(LPAREN);
//				setState(125);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234348511158075392L) != 0)) {
//					{
//					setState(124);
//					typeList();
//					}
//				}
//
//				setState(127);
//				match(RPAREN);
//				}
//				break;
//			default:
//				throw new NoViableAltException(this);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class StructFieldListContext extends ParserRuleContext {
//		public List<StructFieldContext> structField() {
//			return getRuleContexts(StructFieldContext.class);
//		}
//		public StructFieldContext structField(int i) {
//			return getRuleContext(StructFieldContext.class,i);
//		}
//		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
//		public TerminalNode COMMA(int i) {
//			return getToken(RustParser.COMMA, i);
//		}
//		public StructFieldListContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_structFieldList; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterStructFieldList(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitStructFieldList(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitStructFieldList(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final StructFieldListContext structFieldList() throws RecognitionException {
//		StructFieldListContext _localctx = new StructFieldListContext(_ctx, getState());
//		enterRule(_localctx, 16, RULE_structFieldList);
//		int _la;
//		try {
//			int _alt;
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(130);
//			structField();
//			setState(135);
//			_errHandler.sync(this);
//			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
//			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
//				if ( _alt==1 ) {
//					{
//					{
//					setState(131);
//					match(COMMA);
//					setState(132);
//					structField();
//					}
//					}
//				}
//				setState(137);
//				_errHandler.sync(this);
//				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
//			}
//			setState(139);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==COMMA) {
//				{
//				setState(138);
//				match(COMMA);
//				}
//			}
//
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class StructFieldContext extends ParserRuleContext {
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
//		public TypeContext type() {
//			return getRuleContext(TypeContext.class,0);
//		}
//		public StructFieldContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_structField; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterStructField(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitStructField(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitStructField(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final StructFieldContext structField() throws RecognitionException {
//		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
//		enterRule(_localctx, 18, RULE_structField);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(141);
//			match(IDENTIFIER);
//			setState(142);
//			match(COLON);
//			setState(143);
//			type(0);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class TypeListContext extends ParserRuleContext {
//		public List<TypeContext> type() {
//			return getRuleContexts(TypeContext.class);
//		}
//		public TypeContext type(int i) {
//			return getRuleContext(TypeContext.class,i);
//		}
//		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
//		public TerminalNode COMMA(int i) {
//			return getToken(RustParser.COMMA, i);
//		}
//		public TypeListContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_typeList; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterTypeList(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitTypeList(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitTypeList(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final TypeListContext typeList() throws RecognitionException {
//		TypeListContext _localctx = new TypeListContext(_ctx, getState());
//		enterRule(_localctx, 20, RULE_typeList);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(145);
//			type(0);
//			setState(150);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			while (_la==COMMA) {
//				{
//				{
//				setState(146);
//				match(COMMA);
//				setState(147);
//				type(0);
//				}
//				}
//				setState(152);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//			}
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class EnumDefContext extends ParserRuleContext {
//		public TerminalNode ENUM() { return getToken(RustParser.ENUM, 0); }
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode LBRACE() { return getToken(RustParser.LBRACE, 0); }
//		public EnumVariantListContext enumVariantList() {
//			return getRuleContext(EnumVariantListContext.class,0);
//		}
//		public TerminalNode RBRACE() { return getToken(RustParser.RBRACE, 0); }
//		public EnumDefContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_enumDef; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterEnumDef(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitEnumDef(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitEnumDef(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final EnumDefContext enumDef() throws RecognitionException {
//		EnumDefContext _localctx = new EnumDefContext(_ctx, getState());
//		enterRule(_localctx, 22, RULE_enumDef);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(153);
//			match(ENUM);
//			setState(154);
//			match(IDENTIFIER);
//			setState(155);
//			match(LBRACE);
//			setState(156);
//			enumVariantList();
//			setState(157);
//			match(RBRACE);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class EnumVariantListContext extends ParserRuleContext {
//		public List<EnumVariantContext> enumVariant() {
//			return getRuleContexts(EnumVariantContext.class);
//		}
//		public EnumVariantContext enumVariant(int i) {
//			return getRuleContext(EnumVariantContext.class,i);
//		}
//		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
//		public TerminalNode COMMA(int i) {
//			return getToken(RustParser.COMMA, i);
//		}
//		public EnumVariantListContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_enumVariantList; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterEnumVariantList(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitEnumVariantList(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitEnumVariantList(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final EnumVariantListContext enumVariantList() throws RecognitionException {
//		EnumVariantListContext _localctx = new EnumVariantListContext(_ctx, getState());
//		enterRule(_localctx, 24, RULE_enumVariantList);
//		int _la;
//		try {
//			int _alt;
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(159);
//			enumVariant();
//			setState(164);
//			_errHandler.sync(this);
//			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
//			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
//				if ( _alt==1 ) {
//					{
//					{
//					setState(160);
//					match(COMMA);
//					setState(161);
//					enumVariant();
//					}
//					}
//				}
//				setState(166);
//				_errHandler.sync(this);
//				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
//			}
//			setState(168);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==COMMA) {
//				{
//				setState(167);
//				match(COMMA);
//				}
//			}
//
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class EnumVariantContext extends ParserRuleContext {
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
//		public TypeListContext typeList() {
//			return getRuleContext(TypeListContext.class,0);
//		}
//		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
//		public EnumVariantContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_enumVariant; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterEnumVariant(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitEnumVariant(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitEnumVariant(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final EnumVariantContext enumVariant() throws RecognitionException {
//		EnumVariantContext _localctx = new EnumVariantContext(_ctx, getState());
//		enterRule(_localctx, 26, RULE_enumVariant);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(170);
//			match(IDENTIFIER);
//			setState(175);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==LPAREN) {
//				{
//				setState(171);
//				match(LPAREN);
//				setState(172);
//				typeList();
//				setState(173);
//				match(RPAREN);
//				}
//			}
//
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class ModuleDefContext extends ParserRuleContext {
//		public TerminalNode MOD() { return getToken(RustParser.MOD, 0); }
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode LBRACE() { return getToken(RustParser.LBRACE, 0); }
//		public TerminalNode RBRACE() { return getToken(RustParser.RBRACE, 0); }
//		public List<ItemContext> item() {
//			return getRuleContexts(ItemContext.class);
//		}
//		public ItemContext item(int i) {
//			return getRuleContext(ItemContext.class,i);
//		}
//		public ModuleDefContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_moduleDef; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterModuleDef(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitModuleDef(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitModuleDef(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final ModuleDefContext moduleDef() throws RecognitionException {
//		ModuleDefContext _localctx = new ModuleDefContext(_ctx, getState());
//		enterRule(_localctx, 28, RULE_moduleDef);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(177);
//			match(MOD);
//			setState(178);
//			match(IDENTIFIER);
//			setState(179);
//			match(LBRACE);
//			setState(183);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2046L) != 0)) {
//				{
//				{
//				setState(180);
//				item();
//				}
//				}
//				setState(185);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//			}
//			setState(186);
//			match(RBRACE);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class UseDeclContext extends ParserRuleContext {
//		public TerminalNode USE() { return getToken(RustParser.USE, 0); }
//		public PathContext path() {
//			return getRuleContext(PathContext.class,0);
//		}
//		public TerminalNode SEMICOLON() { return getToken(RustParser.SEMICOLON, 0); }
//		public UseDeclContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_useDecl; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterUseDecl(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitUseDecl(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitUseDecl(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final UseDeclContext useDecl() throws RecognitionException {
//		UseDeclContext _localctx = new UseDeclContext(_ctx, getState());
//		enterRule(_localctx, 30, RULE_useDecl);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(188);
//			match(USE);
//			setState(189);
//			path();
//			setState(190);
//			match(SEMICOLON);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class PathContext extends ParserRuleContext {
//		public List<TerminalNode> IDENTIFIER() { return getTokens(RustParser.IDENTIFIER); }
//		public TerminalNode IDENTIFIER(int i) {
//			return getToken(RustParser.IDENTIFIER, i);
//		}
//		public List<TerminalNode> DOUBLECOLON() { return getTokens(RustParser.DOUBLECOLON); }
//		public TerminalNode DOUBLECOLON(int i) {
//			return getToken(RustParser.DOUBLECOLON, i);
//		}
//		public List<TerminalNode> STAR() { return getTokens(RustParser.STAR); }
//		public TerminalNode STAR(int i) {
//			return getToken(RustParser.STAR, i);
//		}
//		public PathContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_path; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterPath(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitPath(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitPath(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final PathContext path() throws RecognitionException {
//		PathContext _localctx = new PathContext(_ctx, getState());
//		enterRule(_localctx, 32, RULE_path);
//		try {
//			int _alt;
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(192);
//			match(IDENTIFIER);
//			setState(197);
//			_errHandler.sync(this);
//			_alt = 1;
//			do {
//				switch (_alt) {
//				case 1:
//					{
//					setState(197);
//					_errHandler.sync(this);
//					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
//					case 1:
//						{
//						{
//						setState(193);
//						match(DOUBLECOLON);
//						setState(194);
//						match(IDENTIFIER);
//						}
//						}
//						break;
//					case 2:
//						{
//						{
//						setState(195);
//						match(DOUBLECOLON);
//						setState(196);
//						match(STAR);
//						}
//						}
//						break;
//					}
//					}
//					break;
//				default:
//					throw new NoViableAltException(this);
//				}
//				setState(199);
//				_errHandler.sync(this);
//				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
//			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class TraitDefContext extends ParserRuleContext {
//		public TerminalNode TRAIT() { return getToken(RustParser.TRAIT, 0); }
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode LBRACE() { return getToken(RustParser.LBRACE, 0); }
//		public TerminalNode RBRACE() { return getToken(RustParser.RBRACE, 0); }
//		public List<TraitItemContext> traitItem() {
//			return getRuleContexts(TraitItemContext.class);
//		}
//		public TraitItemContext traitItem(int i) {
//			return getRuleContext(TraitItemContext.class,i);
//		}
//		public TraitDefContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_traitDef; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterTraitDef(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitTraitDef(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitTraitDef(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final TraitDefContext traitDef() throws RecognitionException {
//		TraitDefContext _localctx = new TraitDefContext(_ctx, getState());
//		enterRule(_localctx, 34, RULE_traitDef);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(201);
//			match(TRAIT);
//			setState(202);
//			match(IDENTIFIER);
//			setState(203);
//			match(LBRACE);
//			setState(207);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			while (_la==FN) {
//				{
//				{
//				setState(204);
//				traitItem();
//				}
//				}
//				setState(209);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//			}
//			setState(210);
//			match(RBRACE);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class TraitItemContext extends ParserRuleContext {
//		public FunctionSignatureContext functionSignature() {
//			return getRuleContext(FunctionSignatureContext.class,0);
//		}
//		public TerminalNode SEMICOLON() { return getToken(RustParser.SEMICOLON, 0); }
//		public FunctionContext function() {
//			return getRuleContext(FunctionContext.class,0);
//		}
//		public TraitItemContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_traitItem; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterTraitItem(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitTraitItem(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitTraitItem(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final TraitItemContext traitItem() throws RecognitionException {
//		TraitItemContext _localctx = new TraitItemContext(_ctx, getState());
//		enterRule(_localctx, 36, RULE_traitItem);
//		try {
//			setState(216);
//			_errHandler.sync(this);
//			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
//			case 1:
//				enterOuterAlt(_localctx, 1);
//				{
//				setState(212);
//				functionSignature();
//				setState(213);
//				match(SEMICOLON);
//				}
//				break;
//			case 2:
//				enterOuterAlt(_localctx, 2);
//				{
//				setState(215);
//				function();
//				}
//				break;
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class FunctionSignatureContext extends ParserRuleContext {
//		public TerminalNode FN() { return getToken(RustParser.FN, 0); }
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
//		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
//		public ParameterListContext parameterList() {
//			return getRuleContext(ParameterListContext.class,0);
//		}
//		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
//		public TypeContext type() {
//			return getRuleContext(TypeContext.class,0);
//		}
//		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_functionSignature; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterFunctionSignature(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitFunctionSignature(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitFunctionSignature(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final FunctionSignatureContext functionSignature() throws RecognitionException {
//		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
//		enterRule(_localctx, 38, RULE_functionSignature);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(218);
//			match(FN);
//			setState(219);
//			match(IDENTIFIER);
//			setState(220);
//			match(LPAREN);
//			setState(222);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==IDENTIFIER) {
//				{
//				setState(221);
//				parameterList();
//				}
//			}
//
//			setState(224);
//			match(RPAREN);
//			setState(227);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==RARROW) {
//				{
//				setState(225);
//				match(RARROW);
//				setState(226);
//				type(0);
//				}
//			}
//
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class ImplBlockContext extends ParserRuleContext {
//		public TerminalNode IMPL() { return getToken(RustParser.IMPL, 0); }
//		public List<TypeContext> type() {
//			return getRuleContexts(TypeContext.class);
//		}
//		public TypeContext type(int i) {
//			return getRuleContext(TypeContext.class,i);
//		}
//		public TerminalNode LBRACE() { return getToken(RustParser.LBRACE, 0); }
//		public TerminalNode RBRACE() { return getToken(RustParser.RBRACE, 0); }
//		public TerminalNode FOR() { return getToken(RustParser.FOR, 0); }
//		public List<ImplItemContext> implItem() {
//			return getRuleContexts(ImplItemContext.class);
//		}
//		public ImplItemContext implItem(int i) {
//			return getRuleContext(ImplItemContext.class,i);
//		}
//		public ImplBlockContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_implBlock; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterImplBlock(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitImplBlock(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitImplBlock(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final ImplBlockContext implBlock() throws RecognitionException {
//		ImplBlockContext _localctx = new ImplBlockContext(_ctx, getState());
//		enterRule(_localctx, 40, RULE_implBlock);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(229);
//			match(IMPL);
//			setState(230);
//			type(0);
//			setState(233);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==FOR) {
//				{
//				setState(231);
//				match(FOR);
//				setState(232);
//				type(0);
//				}
//			}
//
//			setState(235);
//			match(LBRACE);
//			setState(239);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			while (_la==FN) {
//				{
//				{
//				setState(236);
//				implItem();
//				}
//				}
//				setState(241);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//			}
//			setState(242);
//			match(RBRACE);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class ImplItemContext extends ParserRuleContext {
//		public FunctionContext function() {
//			return getRuleContext(FunctionContext.class,0);
//		}
//		public TraitItemContext traitItem() {
//			return getRuleContext(TraitItemContext.class,0);
//		}
//		public ImplItemContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_implItem; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterImplItem(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitImplItem(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitImplItem(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final ImplItemContext implItem() throws RecognitionException {
//		ImplItemContext _localctx = new ImplItemContext(_ctx, getState());
//		enterRule(_localctx, 42, RULE_implItem);
//		try {
//			setState(246);
//			_errHandler.sync(this);
//			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
//			case 1:
//				enterOuterAlt(_localctx, 1);
//				{
//				setState(244);
//				function();
//				}
//				break;
//			case 2:
//				enterOuterAlt(_localctx, 2);
//				{
//				setState(245);
//				traitItem();
//				}
//				break;
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class ConstDefContext extends ParserRuleContext {
//		public TerminalNode CONST() { return getToken(RustParser.CONST, 0); }
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
//		public TypeContext type() {
//			return getRuleContext(TypeContext.class,0);
//		}
//		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
//		public ExpressionContext expression() {
//			return getRuleContext(ExpressionContext.class,0);
//		}
//		public TerminalNode SEMICOLON() { return getToken(RustParser.SEMICOLON, 0); }
//		public ConstDefContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_constDef; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterConstDef(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitConstDef(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitConstDef(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final ConstDefContext constDef() throws RecognitionException {
//		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
//		enterRule(_localctx, 44, RULE_constDef);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(248);
//			match(CONST);
//			setState(249);
//			match(IDENTIFIER);
//			setState(250);
//			match(COLON);
//			setState(251);
//			type(0);
//			setState(252);
//			match(EQ);
//			setState(253);
//			expression(0);
//			setState(254);
//			match(SEMICOLON);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class StaticDefContext extends ParserRuleContext {
//		public TerminalNode STATIC() { return getToken(RustParser.STATIC, 0); }
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
//		public TypeContext type() {
//			return getRuleContext(TypeContext.class,0);
//		}
//		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
//		public ExpressionContext expression() {
//			return getRuleContext(ExpressionContext.class,0);
//		}
//		public TerminalNode SEMICOLON() { return getToken(RustParser.SEMICOLON, 0); }
//		public StaticDefContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_staticDef; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterStaticDef(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitStaticDef(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitStaticDef(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final StaticDefContext staticDef() throws RecognitionException {
//		StaticDefContext _localctx = new StaticDefContext(_ctx, getState());
//		enterRule(_localctx, 46, RULE_staticDef);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(256);
//			match(STATIC);
//			setState(257);
//			match(IDENTIFIER);
//			setState(258);
//			match(COLON);
//			setState(259);
//			type(0);
//			setState(260);
//			match(EQ);
//			setState(261);
//			expression(0);
//			setState(262);
//			match(SEMICOLON);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class TypeAliasContext extends ParserRuleContext {
//		public TerminalNode TYPE() { return getToken(RustParser.TYPE, 0); }
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
//		public TypeContext type() {
//			return getRuleContext(TypeContext.class,0);
//		}
//		public TerminalNode SEMICOLON() { return getToken(RustParser.SEMICOLON, 0); }
//		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_typeAlias; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterTypeAlias(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitTypeAlias(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitTypeAlias(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final TypeAliasContext typeAlias() throws RecognitionException {
//		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
//		enterRule(_localctx, 48, RULE_typeAlias);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(264);
//			match(TYPE);
//			setState(265);
//			match(IDENTIFIER);
//			setState(266);
//			match(EQ);
//			setState(267);
//			type(0);
//			setState(268);
//			match(SEMICOLON);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class BlockContext extends ParserRuleContext {
//		public TerminalNode LBRACE() { return getToken(RustParser.LBRACE, 0); }
//		public TerminalNode RBRACE() { return getToken(RustParser.RBRACE, 0); }
//		public List<StatementContext> statement() {
//			return getRuleContexts(StatementContext.class);
//		}
//		public StatementContext statement(int i) {
//			return getRuleContext(StatementContext.class,i);
//		}
//		public BlockContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_block; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterBlock(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitBlock(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitBlock(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final BlockContext block() throws RecognitionException {
//		BlockContext _localctx = new BlockContext(_ctx, getState());
//		enterRule(_localctx, 50, RULE_block);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(270);
//			match(LBRACE);
//			setState(274);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8073266433066129408L) != 0)) {
//				{
//				{
//				setState(271);
//				statement();
//				}
//				}
//				setState(276);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//			}
//			setState(277);
//			match(RBRACE);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class StatementContext extends ParserRuleContext {
//		public LocalContext local() {
//			return getRuleContext(LocalContext.class,0);
//		}
//		public ExpressionContext expression() {
//			return getRuleContext(ExpressionContext.class,0);
//		}
//		public TerminalNode SEMICOLON() { return getToken(RustParser.SEMICOLON, 0); }
//		public BlockContext block() {
//			return getRuleContext(BlockContext.class,0);
//		}
//		public StatementContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_statement; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterStatement(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitStatement(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitStatement(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final StatementContext statement() throws RecognitionException {
//		StatementContext _localctx = new StatementContext(_ctx, getState());
//		enterRule(_localctx, 52, RULE_statement);
//		try {
//			setState(285);
//			_errHandler.sync(this);
//			switch (_input.LA(1)) {
//			case LET:
//				enterOuterAlt(_localctx, 1);
//				{
//				setState(279);
//				local();
//				}
//				break;
//			case IF:
//			case MATCH:
//			case WHILE:
//			case FOR:
//			case LOOP:
//			case RETURN:
//			case BREAK:
//			case CONTINUE:
//			case UNSAFE:
//			case BOX:
//			case REF:
//			case MOVE:
//			case SOME:
//			case NONE:
//			case OK:
//			case ERR:
//			case TRUE:
//			case FALSE:
//			case NULL:
//			case LPAREN:
//			case AND:
//			case PIPE:
//			case IDENTIFIER:
//			case NUMBER:
//			case STRING:
//				enterOuterAlt(_localctx, 2);
//				{
//				setState(280);
//				expression(0);
//				setState(281);
//				match(SEMICOLON);
//				}
//				break;
//			case LBRACE:
//				enterOuterAlt(_localctx, 3);
//				{
//				setState(283);
//				block();
//				}
//				break;
//			case SEMICOLON:
//				enterOuterAlt(_localctx, 4);
//				{
//				setState(284);
//				match(SEMICOLON);
//				}
//				break;
//			default:
//				throw new NoViableAltException(this);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class LocalContext extends ParserRuleContext {
//		public TerminalNode LET() { return getToken(RustParser.LET, 0); }
//		public PatternContext pattern() {
//			return getRuleContext(PatternContext.class,0);
//		}
//		public TerminalNode SEMICOLON() { return getToken(RustParser.SEMICOLON, 0); }
//		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
//		public TypeContext type() {
//			return getRuleContext(TypeContext.class,0);
//		}
//		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
//		public ExpressionContext expression() {
//			return getRuleContext(ExpressionContext.class,0);
//		}
//		public LocalContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_local; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterLocal(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitLocal(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitLocal(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final LocalContext local() throws RecognitionException {
//		LocalContext _localctx = new LocalContext(_ctx, getState());
//		enterRule(_localctx, 54, RULE_local);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(287);
//			match(LET);
//			setState(288);
//			pattern();
//			setState(291);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==COLON) {
//				{
//				setState(289);
//				match(COLON);
//				setState(290);
//				type(0);
//				}
//			}
//
//			setState(295);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==EQ) {
//				{
//				setState(293);
//				match(EQ);
//				setState(294);
//				expression(0);
//				}
//			}
//
//			setState(297);
//			match(SEMICOLON);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class ExpressionContext extends ParserRuleContext {
//		public LiteralContext literal() {
//			return getRuleContext(LiteralContext.class,0);
//		}
//		public PathContext path() {
//			return getRuleContext(PathContext.class,0);
//		}
//		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
//		public List<ExpressionContext> expression() {
//			return getRuleContexts(ExpressionContext.class);
//		}
//		public ExpressionContext expression(int i) {
//			return getRuleContext(ExpressionContext.class,i);
//		}
//		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
//		public TerminalNode IF() { return getToken(RustParser.IF, 0); }
//		public List<BlockContext> block() {
//			return getRuleContexts(BlockContext.class);
//		}
//		public BlockContext block(int i) {
//			return getRuleContext(BlockContext.class,i);
//		}
//		public TerminalNode ELSE() { return getToken(RustParser.ELSE, 0); }
//		public TerminalNode MATCH() { return getToken(RustParser.MATCH, 0); }
//		public TerminalNode LBRACE() { return getToken(RustParser.LBRACE, 0); }
//		public MatchArmListContext matchArmList() {
//			return getRuleContext(MatchArmListContext.class,0);
//		}
//		public TerminalNode RBRACE() { return getToken(RustParser.RBRACE, 0); }
//		public TerminalNode WHILE() { return getToken(RustParser.WHILE, 0); }
//		public TerminalNode FOR() { return getToken(RustParser.FOR, 0); }
//		public PatternContext pattern() {
//			return getRuleContext(PatternContext.class,0);
//		}
//		public TerminalNode IN() { return getToken(RustParser.IN, 0); }
//		public TerminalNode LOOP() { return getToken(RustParser.LOOP, 0); }
//		public TerminalNode RETURN() { return getToken(RustParser.RETURN, 0); }
//		public TerminalNode SEMICOLON() { return getToken(RustParser.SEMICOLON, 0); }
//		public TerminalNode BREAK() { return getToken(RustParser.BREAK, 0); }
//		public TerminalNode CONTINUE() { return getToken(RustParser.CONTINUE, 0); }
//		public TerminalNode UNSAFE() { return getToken(RustParser.UNSAFE, 0); }
//		public TerminalNode BOX() { return getToken(RustParser.BOX, 0); }
//		public TerminalNode REF() { return getToken(RustParser.REF, 0); }
//		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
//		public TerminalNode MUT() { return getToken(RustParser.MUT, 0); }
//		public List<TerminalNode> PIPE() { return getTokens(RustParser.PIPE); }
//		public TerminalNode PIPE(int i) {
//			return getToken(RustParser.PIPE, i);
//		}
//		public TerminalNode MOVE() { return getToken(RustParser.MOVE, 0); }
//		public ParameterListContext parameterList() {
//			return getRuleContext(ParameterListContext.class,0);
//		}
//		public TerminalNode PLUS() { return getToken(RustParser.PLUS, 0); }
//		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
//		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
//		public TerminalNode SLASH() { return getToken(RustParser.SLASH, 0); }
//		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
//		public TerminalNode LBRACK() { return getToken(RustParser.LBRACK, 0); }
//		public TerminalNode RBRACK() { return getToken(RustParser.RBRACK, 0); }
//		public ExpressionListContext expressionList() {
//			return getRuleContext(ExpressionListContext.class,0);
//		}
//		public TerminalNode DOUBLECOLON() { return getToken(RustParser.DOUBLECOLON, 0); }
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
//		public ExpressionContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_expression; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterExpression(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitExpression(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitExpression(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final ExpressionContext expression() throws RecognitionException {
//		return expression(0);
//	}
//
//	private ExpressionContext expression(int _p) throws RecognitionException {
//		ParserRuleContext _parentctx = _ctx;
//		int _parentState = getState();
//		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
//		ExpressionContext _prevctx = _localctx;
//		int _startState = 56;
//		enterRecursionRule(_localctx, 56, RULE_expression, _p);
//		int _la;
//		try {
//			int _alt;
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(366);
//			_errHandler.sync(this);
//			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
//			case 1:
//				{
//				setState(300);
//				literal();
//				}
//				break;
//			case 2:
//				{
//				setState(301);
//				path();
//				}
//				break;
//			case 3:
//				{
//				setState(302);
//				match(LPAREN);
//				setState(303);
//				expression(0);
//				setState(304);
//				match(RPAREN);
//				}
//				break;
//			case 4:
//				{
//				setState(306);
//				match(IF);
//				setState(307);
//				expression(0);
//				setState(308);
//				block();
//				setState(314);
//				_errHandler.sync(this);
//				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
//				case 1:
//					{
//					setState(309);
//					match(ELSE);
//					setState(312);
//					_errHandler.sync(this);
//					switch (_input.LA(1)) {
//					case LBRACE:
//						{
//						setState(310);
//						block();
//						}
//						break;
//					case IF:
//					case MATCH:
//					case WHILE:
//					case FOR:
//					case LOOP:
//					case RETURN:
//					case BREAK:
//					case CONTINUE:
//					case UNSAFE:
//					case BOX:
//					case REF:
//					case MOVE:
//					case SOME:
//					case NONE:
//					case OK:
//					case ERR:
//					case TRUE:
//					case FALSE:
//					case NULL:
//					case LPAREN:
//					case AND:
//					case PIPE:
//					case IDENTIFIER:
//					case NUMBER:
//					case STRING:
//						{
//						setState(311);
//						expression(0);
//						}
//						break;
//					default:
//						throw new NoViableAltException(this);
//					}
//					}
//					break;
//				}
//				}
//				break;
//			case 5:
//				{
//				setState(316);
//				match(MATCH);
//				setState(317);
//				expression(0);
//				setState(318);
//				match(LBRACE);
//				setState(319);
//				matchArmList();
//				setState(320);
//				match(RBRACE);
//				}
//				break;
//			case 6:
//				{
//				setState(322);
//				match(WHILE);
//				setState(323);
//				expression(0);
//				setState(324);
//				block();
//				}
//				break;
//			case 7:
//				{
//				setState(326);
//				match(FOR);
//				setState(327);
//				pattern();
//				setState(328);
//				match(IN);
//				setState(329);
//				expression(0);
//				setState(330);
//				block();
//				}
//				break;
//			case 8:
//				{
//				setState(332);
//				match(LOOP);
//				setState(333);
//				block();
//				}
//				break;
//			case 9:
//				{
//				setState(334);
//				match(RETURN);
//				setState(336);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8073265299194761216L) != 0)) {
//					{
//					setState(335);
//					expression(0);
//					}
//				}
//
//				setState(338);
//				match(SEMICOLON);
//				}
//				break;
//			case 10:
//				{
//				setState(339);
//				match(BREAK);
//				setState(341);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8073265299194761216L) != 0)) {
//					{
//					setState(340);
//					expression(0);
//					}
//				}
//
//				setState(343);
//				match(SEMICOLON);
//				}
//				break;
//			case 11:
//				{
//				setState(344);
//				match(CONTINUE);
//				setState(345);
//				match(SEMICOLON);
//				}
//				break;
//			case 12:
//				{
//				setState(346);
//				match(UNSAFE);
//				setState(347);
//				block();
//				}
//				break;
//			case 13:
//				{
//				setState(348);
//				match(BOX);
//				setState(349);
//				expression(5);
//				}
//				break;
//			case 14:
//				{
//				setState(350);
//				match(REF);
//				setState(351);
//				expression(4);
//				}
//				break;
//			case 15:
//				{
//				setState(352);
//				match(AND);
//				setState(353);
//				expression(3);
//				}
//				break;
//			case 16:
//				{
//				setState(354);
//				match(AND);
//				setState(355);
//				match(MUT);
//				setState(356);
//				expression(2);
//				}
//				break;
//			case 17:
//				{
//				setState(358);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				if (_la==MOVE) {
//					{
//					setState(357);
//					match(MOVE);
//					}
//				}
//
//				setState(360);
//				match(PIPE);
//				setState(362);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				if (_la==IDENTIFIER) {
//					{
//					setState(361);
//					parameterList();
//					}
//				}
//
//				setState(364);
//				match(PIPE);
//				setState(365);
//				block();
//				}
//				break;
//			}
//			_ctx.stop = _input.LT(-1);
//			setState(402);
//			_errHandler.sync(this);
//			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
//			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
//				if ( _alt==1 ) {
//					if ( _parseListeners!=null ) triggerExitRuleEvent();
//					_prevctx = _localctx;
//					{
//					setState(400);
//					_errHandler.sync(this);
//					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
//					case 1:
//						{
//						_localctx = new ExpressionContext(_parentctx, _parentState);
//						pushNewRecursionContext(_localctx, _startState, RULE_expression);
//						setState(368);
//						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
//						setState(369);
//						match(PLUS);
//						setState(370);
//						expression(20);
//						}
//						break;
//					case 2:
//						{
//						_localctx = new ExpressionContext(_parentctx, _parentState);
//						pushNewRecursionContext(_localctx, _startState, RULE_expression);
//						setState(371);
//						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
//						setState(372);
//						match(MINUS);
//						setState(373);
//						expression(19);
//						}
//						break;
//					case 3:
//						{
//						_localctx = new ExpressionContext(_parentctx, _parentState);
//						pushNewRecursionContext(_localctx, _startState, RULE_expression);
//						setState(374);
//						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
//						setState(375);
//						match(STAR);
//						setState(376);
//						expression(18);
//						}
//						break;
//					case 4:
//						{
//						_localctx = new ExpressionContext(_parentctx, _parentState);
//						pushNewRecursionContext(_localctx, _startState, RULE_expression);
//						setState(377);
//						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
//						setState(378);
//						match(SLASH);
//						setState(379);
//						expression(17);
//						}
//						break;
//					case 5:
//						{
//						_localctx = new ExpressionContext(_parentctx, _parentState);
//						pushNewRecursionContext(_localctx, _startState, RULE_expression);
//						setState(380);
//						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
//						setState(381);
//						match(EQ);
//						setState(382);
//						expression(16);
//						}
//						break;
//					case 6:
//						{
//						_localctx = new ExpressionContext(_parentctx, _parentState);
//						pushNewRecursionContext(_localctx, _startState, RULE_expression);
//						setState(383);
//						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
//						setState(384);
//						match(LBRACK);
//						setState(385);
//						expression(0);
//						setState(386);
//						match(RBRACK);
//						}
//						break;
//					case 7:
//						{
//						_localctx = new ExpressionContext(_parentctx, _parentState);
//						pushNewRecursionContext(_localctx, _startState, RULE_expression);
//						setState(388);
//						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
//						setState(389);
//						match(LPAREN);
//						setState(391);
//						_errHandler.sync(this);
//						_la = _input.LA(1);
//						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8073265299194761216L) != 0)) {
//							{
//							setState(390);
//							expressionList();
//							}
//						}
//
//						setState(393);
//						match(RPAREN);
//						}
//						break;
//					case 8:
//						{
//						_localctx = new ExpressionContext(_parentctx, _parentState);
//						pushNewRecursionContext(_localctx, _startState, RULE_expression);
//						setState(394);
//						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
//						setState(395);
//						match(DOUBLECOLON);
//						setState(396);
//						match(IDENTIFIER);
//						}
//						break;
//					case 9:
//						{
//						_localctx = new ExpressionContext(_parentctx, _parentState);
//						pushNewRecursionContext(_localctx, _startState, RULE_expression);
//						setState(397);
//						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
//						setState(398);
//						match(DOT);
//						setState(399);
//						match(IDENTIFIER);
//						}
//						break;
//					}
//					}
//				}
//				setState(404);
//				_errHandler.sync(this);
//				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
//			}
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			unrollRecursionContexts(_parentctx);
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class ExpressionListContext extends ParserRuleContext {
//		public List<ExpressionContext> expression() {
//			return getRuleContexts(ExpressionContext.class);
//		}
//		public ExpressionContext expression(int i) {
//			return getRuleContext(ExpressionContext.class,i);
//		}
//		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
//		public TerminalNode COMMA(int i) {
//			return getToken(RustParser.COMMA, i);
//		}
//		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_expressionList; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterExpressionList(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitExpressionList(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitExpressionList(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final ExpressionListContext expressionList() throws RecognitionException {
//		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
//		enterRule(_localctx, 58, RULE_expressionList);
//		int _la;
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(405);
//			expression(0);
//			setState(410);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			while (_la==COMMA) {
//				{
//				{
//				setState(406);
//				match(COMMA);
//				setState(407);
//				expression(0);
//				}
//				}
//				setState(412);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//			}
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class MatchArmListContext extends ParserRuleContext {
//		public List<MatchArmContext> matchArm() {
//			return getRuleContexts(MatchArmContext.class);
//		}
//		public MatchArmContext matchArm(int i) {
//			return getRuleContext(MatchArmContext.class,i);
//		}
//		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
//		public TerminalNode COMMA(int i) {
//			return getToken(RustParser.COMMA, i);
//		}
//		public MatchArmListContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_matchArmList; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterMatchArmList(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitMatchArmList(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitMatchArmList(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final MatchArmListContext matchArmList() throws RecognitionException {
//		MatchArmListContext _localctx = new MatchArmListContext(_ctx, getState());
//		enterRule(_localctx, 60, RULE_matchArmList);
//		int _la;
//		try {
//			int _alt;
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(413);
//			matchArm();
//			setState(418);
//			_errHandler.sync(this);
//			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
//			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
//				if ( _alt==1 ) {
//					{
//					{
//					setState(414);
//					match(COMMA);
//					setState(415);
//					matchArm();
//					}
//					}
//				}
//				setState(420);
//				_errHandler.sync(this);
//				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
//			}
//			setState(422);
//			_errHandler.sync(this);
//			_la = _input.LA(1);
//			if (_la==COMMA) {
//				{
//				setState(421);
//				match(COMMA);
//				}
//			}
//
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class MatchArmContext extends ParserRuleContext {
//		public PatternContext pattern() {
//			return getRuleContext(PatternContext.class,0);
//		}
//		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
//		public ExpressionContext expression() {
//			return getRuleContext(ExpressionContext.class,0);
//		}
//		public TerminalNode SEMICOLON() { return getToken(RustParser.SEMICOLON, 0); }
//		public MatchArmContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_matchArm; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterMatchArm(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitMatchArm(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitMatchArm(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final MatchArmContext matchArm() throws RecognitionException {
//		MatchArmContext _localctx = new MatchArmContext(_ctx, getState());
//		enterRule(_localctx, 62, RULE_matchArm);
//		try {
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(424);
//			pattern();
//			setState(425);
//			match(RARROW);
//			setState(426);
//			expression(0);
//			setState(427);
//			match(SEMICOLON);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class TypeContext extends ParserRuleContext {
//		public TerminalNode IDENTIFIER() { return getToken(RustParser.IDENTIFIER, 0); }
//		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
//		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
//		public TypeListContext typeList() {
//			return getRuleContext(TypeListContext.class,0);
//		}
//		public TerminalNode LBRACK() { return getToken(RustParser.LBRACK, 0); }
//		public List<TypeContext> type() {
//			return getRuleContexts(TypeContext.class);
//		}
//		public TypeContext type(int i) {
//			return getRuleContext(TypeContext.class,i);
//		}
//		public TerminalNode SEMICOLON() { return getToken(RustParser.SEMICOLON, 0); }
//		public ExpressionContext expression() {
//			return getRuleContext(ExpressionContext.class,0);
//		}
//		public TerminalNode RBRACK() { return getToken(RustParser.RBRACK, 0); }
//		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
//		public TerminalNode MUT() { return getToken(RustParser.MUT, 0); }
//		public TerminalNode BOX_LT() { return getToken(RustParser.BOX_LT, 0); }
//		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
//		public TerminalNode VEC_LT() { return getToken(RustParser.VEC_LT, 0); }
//		public TerminalNode OPTION_LT() { return getToken(RustParser.OPTION_LT, 0); }
//		public TerminalNode RESULT_LT() { return getToken(RustParser.RESULT_LT, 0); }
//		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
//		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
//		public TypeContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_type; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterType(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitType(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitType(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final TypeContext type() throws RecognitionException {
//		return type(0);
//	}
//
//	private TypeContext type(int _p) throws RecognitionException {
//		ParserRuleContext _parentctx = _ctx;
//		int _parentState = getState();
//		TypeContext _localctx = new TypeContext(_ctx, _parentState);
//		TypeContext _prevctx = _localctx;
//		int _startState = 64;
//		enterRecursionRule(_localctx, 64, RULE_type, _p);
//		int _la;
//		try {
//			int _alt;
//			enterOuterAlt(_localctx, 1);
//			{
//			setState(465);
//			_errHandler.sync(this);
//			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
//			case 1:
//				{
//				setState(430);
//				match(IDENTIFIER);
//				}
//				break;
//			case 2:
//				{
//				setState(431);
//				match(LPAREN);
//				setState(433);
//				_errHandler.sync(this);
//				_la = _input.LA(1);
//				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234348511158075392L) != 0)) {
//					{
//					setState(432);
//					typeList();
//					}
//				}
//
//				setState(435);
//				match(RPAREN);
//				}
//				break;
//			case 3:
//				{
//				setState(436);
//				match(LBRACK);
//				setState(437);
//				type(0);
//				setState(438);
//				match(SEMICOLON);
//				setState(439);
//				expression(0);
//				setState(440);
//				match(RBRACK);
//				}
//				break;
//			case 4:
//				{
//				setState(442);
//				match(AND);
//				setState(443);
//				type(6);
//				}
//				break;
//			case 5:
//				{
//				setState(444);
//				match(AND);
//				setState(445);
//				match(MUT);
//				setState(446);
//				type(5);
//				}
//				break;
//			case 6:
//				{
//				setState(447);
//				match(BOX_LT);
//				setState(448);
//				type(0);
//				setState(449);
//				match(GT);
//				}
//				break;
//			case 7:
//				{
//				setState(451);
//				match(VEC_LT);
//				setState(452);
//				type(0);
//				setState(453);
//				match(GT);
//				}
//				break;
//			case 8:
//				{
//				setState(455);
//				match(OPTION_LT);
//				setState(456);
//				type(0);
//				setState(457);
//				match(GT);
//				}
//				break;
//			case 9:
//				{
//				setState(459);
//				match(RESULT_LT);
//				setState(460);
//				type(0);
//				setState(461);
//				match(COMMA);
//				setState(462);
//				type(0);
//				setState(463);
//				match(GT);
//				}
//				break;
//			}
//			_ctx.stop = _input.LT(-1);
//			setState(472);
//			_errHandler.sync(this);
//			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
//			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
//				if ( _alt==1 ) {
//					if ( _parseListeners!=null ) triggerExitRuleEvent();
//					_prevctx = _localctx;
//					{
//					{
//					_localctx = new TypeContext(_parentctx, _parentState);
//					pushNewRecursionContext(_localctx, _startState, RULE_type);
//					setState(467);
//					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
//					setState(468);
//					match(RARROW);
//					setState(469);
//					type(9);
//					}
//					}
//				}
//				setState(474);
//				_errHandler.sync(this);
//				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
//			}
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			unrollRecursionContexts(_parentctx);
//		}
//		return _localctx;
//	}
//
//	@SuppressWarnings("CheckReturnValue")
//	public static class LiteralContext extends ParserRuleContext {
//		public TerminalNode NUMBER() { return getToken(RustParser.NUMBER, 0); }
//		public TerminalNode STRING() { return getToken(RustParser.STRING, 0); }
//		public TerminalNode TRUE() { return getToken(RustParser.TRUE, 0); }
//		public TerminalNode FALSE() { return getToken(RustParser.FALSE, 0); }
//		public TerminalNode NULL() { return getToken(RustParser.NULL, 0); }
//		public TerminalNode NONE() { return getToken(RustParser.NONE, 0); }
//		public TerminalNode SOME() { return getToken(RustParser.SOME, 0); }
//		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
//		public ExpressionContext expression() {
//			return getRuleContext(ExpressionContext.class,0);
//		}
//		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
//		public TerminalNode OK() { return getToken(RustParser.OK, 0); }
//		public TerminalNode ERR() { return getToken(RustParser.ERR, 0); }
//		public LiteralContext(ParserRuleContext parent, int invokingState) {
//			super(parent, invokingState);
//		}
//		@Override public int getRuleIndex() { return RULE_literal; }
//		@Override
//		public void enterRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).enterLiteral(this);
//		}
//		@Override
//		public void exitRule(ParseTreeListener listener) {
//			if ( listener instanceof RustListener ) ((RustListener)listener).exitLiteral(this);
//		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RustVisitor ) return ((RustVisitor<? extends T>)visitor).visitLiteral(this);
//			else return visitor.visitChildren(this);
//		}
//	}
//
//	public final LiteralContext literal() throws RecognitionException {
//		LiteralContext _localctx = new LiteralContext(_ctx, getState());
//		enterRule(_localctx, 66, RULE_literal);
//		try {
//			setState(496);
//			_errHandler.sync(this);
//			switch (_input.LA(1)) {
//			case NUMBER:
//				enterOuterAlt(_localctx, 1);
//				{
//				setState(475);
//				match(NUMBER);
//				}
//				break;
//			case STRING:
//				enterOuterAlt(_localctx, 2);
//				{
//				setState(476);
//				match(STRING);
//				}
//				break;
//			case TRUE:
//				enterOuterAlt(_localctx, 3);
//				{
//				setState(477);
//				match(TRUE);
//				}
//				break;
//			case FALSE:
//				enterOuterAlt(_localctx, 4);
//				{
//				setState(478);
//				match(FALSE);
//				}
//				break;
//			case NULL:
//				enterOuterAlt(_localctx, 5);
//				{
//				setState(479);
//				match(NULL);
//				}
//				break;
//			case NONE:
//				enterOuterAlt(_localctx, 6);
//				{
//				setState(480);
//				match(NONE);
//				}
//				break;
//			case SOME:
//				enterOuterAlt(_localctx, 7);
//				{
//				setState(481);
//				match(SOME);
//				setState(482);
//				match(LPAREN);
//				setState(483);
//				expression(0);
//				setState(484);
//				match(RPAREN);
//				}
//				break;
//			case OK:
//				enterOuterAlt(_localctx, 8);
//				{
//				setState(486);
//				match(OK);
//				setState(487);
//				match(LPAREN);
//				setState(488);
//				expression(0);
//				setState(489);
//				match(RPAREN);
//				}
//				break;
//			case ERR:
//				enterOuterAlt(_localctx, 9);
//				{
//				setState(491);
//				match(ERR);
//				setState(492);
//				match(LPAREN);
//				setState(493);
//				expression(0);
//				setState(494);
//				match(RPAREN);
//				}
//				break;
//			default:
//				throw new NoViableAltException(this);
//			}
//		}
//		catch (RecognitionException re) {
//			_localctx.exception = re;
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
//		}
//		finally {
//			exitRule();
//		}
//		return _localctx;
//	}
//
//	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
//		switch (ruleIndex) {
//		case 28:
//			return expression_sempred((ExpressionContext)_localctx, predIndex);
//		case 32:
//			return type_sempred((TypeContext)_localctx, predIndex);
//		}
//		return true;
//	}
//	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
//		switch (predIndex) {
//		case 0:
//			return precpred(_ctx, 19);
//		case 1:
//			return precpred(_ctx, 18);
//		case 2:
//			return precpred(_ctx, 17);
//		case 3:
//			return precpred(_ctx, 16);
//		case 4:
//			return precpred(_ctx, 15);
//		case 5:
//			return precpred(_ctx, 23);
//		case 6:
//			return precpred(_ctx, 22);
//		case 7:
//			return precpred(_ctx, 21);
//		case 8:
//			return precpred(_ctx, 20);
//		}
//		return true;
//	}
//	private boolean type_sempred(TypeContext _localctx, int predIndex) {
//		switch (predIndex) {
//		case 9:
//			return precpred(_ctx, 8);
//		}
//		return true;
//	}
//
//	public static final String _serializedATN =
//		"\u0004\u0001A\u01f3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
//		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
//		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
//		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
//		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
//		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
//		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
//		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
//		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
//		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
//		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0004"+
//		"\u0000F\b\u0000\u000b\u0000\f\u0000G\u0001\u0000\u0001\u0000\u0001\u0001"+
//		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
//		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0002"+
//		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002\u0001\u0002"+
//		"\u0001\u0002\u0001\u0002\u0003\u0002a\b\u0002\u0001\u0002\u0001\u0002"+
//		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003h\b\u0003\n\u0003\f\u0003"+
//		"k\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
//		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
//		"\u0001\u0007\u0003\u0007y\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
//		"\u0003\u0007~\b\u0007\u0001\u0007\u0003\u0007\u0081\b\u0007\u0001\b\u0001"+
//		"\b\u0001\b\u0005\b\u0086\b\b\n\b\f\b\u0089\t\b\u0001\b\u0003\b\u008c\b"+
//		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u0095"+
//		"\b\n\n\n\f\n\u0098\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
//		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00a3\b\f\n\f"+
//		"\f\f\u00a6\t\f\u0001\f\u0003\f\u00a9\b\f\u0001\r\u0001\r\u0001\r\u0001"+
//		"\r\u0001\r\u0003\r\u00b0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
//		"\u000e\u0005\u000e\u00b6\b\u000e\n\u000e\f\u000e\u00b9\t\u000e\u0001\u000e"+
//		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
//		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00c6\b\u0010"+
//		"\u000b\u0010\f\u0010\u00c7\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
//		"\u0005\u0011\u00ce\b\u0011\n\u0011\f\u0011\u00d1\t\u0011\u0001\u0011\u0001"+
//		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d9"+
//		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00df"+
//		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e4\b\u0013"+
//		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ea\b\u0014"+
//		"\u0001\u0014\u0001\u0014\u0005\u0014\u00ee\b\u0014\n\u0014\f\u0014\u00f1"+
//		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00f7"+
//		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
//		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
//		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
//		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
//		"\u0019\u0005\u0019\u0111\b\u0019\n\u0019\f\u0019\u0114\t\u0019\u0001\u0019"+
//		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
//		"\u0001\u001a\u0003\u001a\u011e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
//		"\u0001\u001b\u0003\u001b\u0124\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
//		"\u0128\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
//		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
//		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0139\b\u001c"+
//		"\u0003\u001c\u013b\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
//		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
//		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
//		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0151\b\u001c"+
//		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0156\b\u001c\u0001\u001c"+
//		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
//		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
//		"\u0001\u001c\u0001\u001c\u0003\u001c\u0167\b\u001c\u0001\u001c\u0001\u001c"+
//		"\u0003\u001c\u016b\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u016f\b"+
//		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
//		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
//		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
//		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
//		"\u001c\u0188\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
//		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0191\b\u001c\n\u001c\f\u001c"+
//		"\u0194\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0199\b"+
//		"\u001d\n\u001d\f\u001d\u019c\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
//		"\u0005\u001e\u01a1\b\u001e\n\u001e\f\u001e\u01a4\t\u001e\u0001\u001e\u0003"+
//		"\u001e\u01a7\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
//		"\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01b2\b \u0001 \u0001 \u0001"+
//		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
//		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
//		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01d2\b \u0001"+
//		" \u0001 \u0001 \u0005 \u01d7\b \n \f \u01da\t \u0001!\u0001!\u0001!\u0001"+
//		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
//		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01f1\b!\u0001"+
//		"!\u0000\u00028@\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
//		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0000\u022b\u0000"+
//		"E\u0001\u0000\u0000\u0000\u0002U\u0001\u0000\u0000\u0000\u0004W\u0001"+
//		"\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000"+
//		"\u0000\np\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000e\u0080"+
//		"\u0001\u0000\u0000\u0000\u0010\u0082\u0001\u0000\u0000\u0000\u0012\u008d"+
//		"\u0001\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u0099"+
//		"\u0001\u0000\u0000\u0000\u0018\u009f\u0001\u0000\u0000\u0000\u001a\u00aa"+
//		"\u0001\u0000\u0000\u0000\u001c\u00b1\u0001\u0000\u0000\u0000\u001e\u00bc"+
//		"\u0001\u0000\u0000\u0000 \u00c0\u0001\u0000\u0000\u0000\"\u00c9\u0001"+
//		"\u0000\u0000\u0000$\u00d8\u0001\u0000\u0000\u0000&\u00da\u0001\u0000\u0000"+
//		"\u0000(\u00e5\u0001\u0000\u0000\u0000*\u00f6\u0001\u0000\u0000\u0000,"+
//		"\u00f8\u0001\u0000\u0000\u0000.\u0100\u0001\u0000\u0000\u00000\u0108\u0001"+
//		"\u0000\u0000\u00002\u010e\u0001\u0000\u0000\u00004\u011d\u0001\u0000\u0000"+
//		"\u00006\u011f\u0001\u0000\u0000\u00008\u016e\u0001\u0000\u0000\u0000:"+
//		"\u0195\u0001\u0000\u0000\u0000<\u019d\u0001\u0000\u0000\u0000>\u01a8\u0001"+
//		"\u0000\u0000\u0000@\u01d1\u0001\u0000\u0000\u0000B\u01f0\u0001\u0000\u0000"+
//		"\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000"+
//		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001"+
//		"\u0000\u0000\u0000IJ\u0005\u0000\u0000\u0001J\u0001\u0001\u0000\u0000"+
//		"\u0000KV\u0003\u0004\u0002\u0000LV\u0003\f\u0006\u0000MV\u0003\u0016\u000b"+
//		"\u0000NV\u0003\u001c\u000e\u0000OV\u0003\u001e\u000f\u0000PV\u0003\"\u0011"+
//		"\u0000QV\u0003(\u0014\u0000RV\u0003,\u0016\u0000SV\u0003.\u0017\u0000"+
//		"TV\u00030\u0018\u0000UK\u0001\u0000\u0000\u0000UL\u0001\u0000\u0000\u0000"+
//		"UM\u0001\u0000\u0000\u0000UN\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000"+
//		"\u0000UP\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000UR\u0001\u0000"+
//		"\u0000\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\u0003"+
//		"\u0001\u0000\u0000\u0000WX\u0005\u0001\u0000\u0000XY\u0005<\u0000\u0000"+
//		"Y[\u0005!\u0000\u0000Z\\\u0003\u0006\u0003\u0000[Z\u0001\u0000\u0000\u0000"+
//		"[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]`\u0005\"\u0000"+
//		"\u0000^_\u0005+\u0000\u0000_a\u0003@ \u0000`^\u0001\u0000\u0000\u0000"+
//		"`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u00032\u0019\u0000"+
//		"c\u0005\u0001\u0000\u0000\u0000di\u0003\b\u0004\u0000ef\u0005)\u0000\u0000"+
//		"fh\u0003\b\u0004\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
//		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0007\u0001\u0000"+
//		"\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0003\n\u0005\u0000mn\u0005\'"+
//		"\u0000\u0000no\u0003@ \u0000o\t\u0001\u0000\u0000\u0000pq\u0005<\u0000"+
//		"\u0000q\u000b\u0001\u0000\u0000\u0000rs\u0005\u0002\u0000\u0000st\u0005"+
//		"<\u0000\u0000tu\u0003\u000e\u0007\u0000u\r\u0001\u0000\u0000\u0000vx\u0005"+
//		"#\u0000\u0000wy\u0003\u0010\b\u0000xw\u0001\u0000\u0000\u0000xy\u0001"+
//		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0081\u0005$\u0000\u0000"+
//		"{}\u0005!\u0000\u0000|~\u0003\u0014\n\u0000}|\u0001\u0000\u0000\u0000"+
//		"}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081"+
//		"\u0005\"\u0000\u0000\u0080v\u0001\u0000\u0000\u0000\u0080{\u0001\u0000"+
//		"\u0000\u0000\u0081\u000f\u0001\u0000\u0000\u0000\u0082\u0087\u0003\u0012"+
//		"\t\u0000\u0083\u0084\u0005)\u0000\u0000\u0084\u0086\u0003\u0012\t\u0000"+
//		"\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000"+
//		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
//		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
//		"\u008a\u008c\u0005)\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b"+
//		"\u008c\u0001\u0000\u0000\u0000\u008c\u0011\u0001\u0000\u0000\u0000\u008d"+
//		"\u008e\u0005<\u0000\u0000\u008e\u008f\u0005\'\u0000\u0000\u008f\u0090"+
//		"\u0003@ \u0000\u0090\u0013\u0001\u0000\u0000\u0000\u0091\u0096\u0003@"+
//		" \u0000\u0092\u0093\u0005)\u0000\u0000\u0093\u0095\u0003@ \u0000\u0094"+
//		"\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096"+
//		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
//		"\u0015\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099"+
//		"\u009a\u0005\u0003\u0000\u0000\u009a\u009b\u0005<\u0000\u0000\u009b\u009c"+
//		"\u0005#\u0000\u0000\u009c\u009d\u0003\u0018\f\u0000\u009d\u009e\u0005"+
//		"$\u0000\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a4\u0003\u001a"+
//		"\r\u0000\u00a0\u00a1\u0005)\u0000\u0000\u00a1\u00a3\u0003\u001a\r\u0000"+
//		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000"+
//		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
//		"\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
//		"\u00a7\u00a9\u0005)\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8"+
//		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u0019\u0001\u0000\u0000\u0000\u00aa"+
//		"\u00af\u0005<\u0000\u0000\u00ab\u00ac\u0005!\u0000\u0000\u00ac\u00ad\u0003"+
//		"\u0014\n\u0000\u00ad\u00ae\u0005\"\u0000\u0000\u00ae\u00b0\u0001\u0000"+
//		"\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
//		"\u0000\u0000\u00b0\u001b\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0004"+
//		"\u0000\u0000\u00b2\u00b3\u0005<\u0000\u0000\u00b3\u00b7\u0005#\u0000\u0000"+
//		"\u00b4\u00b6\u0003\u0002\u0001\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
//		"\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
//		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000"+
//		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005$\u0000\u0000\u00bb"+
//		"\u001d\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0005\u0000\u0000\u00bd"+
//		"\u00be\u0003 \u0010\u0000\u00be\u00bf\u0005(\u0000\u0000\u00bf\u001f\u0001"+
//		"\u0000\u0000\u0000\u00c0\u00c5\u0005<\u0000\u0000\u00c1\u00c2\u00056\u0000"+
//		"\u0000\u00c2\u00c6\u0005<\u0000\u0000\u00c3\u00c4\u00056\u0000\u0000\u00c4"+
//		"\u00c6\u0005.\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c3"+
//		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c5"+
//		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8!\u0001"+
//		"\u0000\u0000\u0000\u00c9\u00ca\u0005\u0006\u0000\u0000\u00ca\u00cb\u0005"+
//		"<\u0000\u0000\u00cb\u00cf\u0005#\u0000\u0000\u00cc\u00ce\u0003$\u0012"+
//		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000"+
//		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
//		"\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
//		"\u0000\u00d2\u00d3\u0005$\u0000\u0000\u00d3#\u0001\u0000\u0000\u0000\u00d4"+
//		"\u00d5\u0003&\u0013\u0000\u00d5\u00d6\u0005(\u0000\u0000\u00d6\u00d9\u0001"+
//		"\u0000\u0000\u0000\u00d7\u00d9\u0003\u0004\u0002\u0000\u00d8\u00d4\u0001"+
//		"\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9%\u0001\u0000"+
//		"\u0000\u0000\u00da\u00db\u0005\u0001\u0000\u0000\u00db\u00dc\u0005<\u0000"+
//		"\u0000\u00dc\u00de\u0005!\u0000\u0000\u00dd\u00df\u0003\u0006\u0003\u0000"+
//		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
//		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e3\u0005\"\u0000\u0000\u00e1"+
//		"\u00e2\u0005+\u0000\u0000\u00e2\u00e4\u0003@ \u0000\u00e3\u00e1\u0001"+
//		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\'\u0001\u0000"+
//		"\u0000\u0000\u00e5\u00e6\u0005\u0007\u0000\u0000\u00e6\u00e9\u0003@ \u0000"+
//		"\u00e7\u00e8\u0005\u0010\u0000\u0000\u00e8\u00ea\u0003@ \u0000\u00e9\u00e7"+
//		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb"+
//		"\u0001\u0000\u0000\u0000\u00eb\u00ef\u0005#\u0000\u0000\u00ec\u00ee\u0003"+
//		"*\u0015\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000"+
//		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
//		"\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
//		"\u0000\u0000\u00f2\u00f3\u0005$\u0000\u0000\u00f3)\u0001\u0000\u0000\u0000"+
//		"\u00f4\u00f7\u0003\u0004\u0002\u0000\u00f5\u00f7\u0003$\u0012\u0000\u00f6"+
//		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7"+
//		"+\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\b\u0000\u0000\u00f9\u00fa"+
//		"\u0005<\u0000\u0000\u00fa\u00fb\u0005\'\u0000\u0000\u00fb\u00fc\u0003"+
//		"@ \u0000\u00fc\u00fd\u00050\u0000\u0000\u00fd\u00fe\u00038\u001c\u0000"+
//		"\u00fe\u00ff\u0005(\u0000\u0000\u00ff-\u0001\u0000\u0000\u0000\u0100\u0101"+
//		"\u0005\t\u0000\u0000\u0101\u0102\u0005<\u0000\u0000\u0102\u0103\u0005"+
//		"\'\u0000\u0000\u0103\u0104\u0003@ \u0000\u0104\u0105\u00050\u0000\u0000"+
//		"\u0105\u0106\u00038\u001c\u0000\u0106\u0107\u0005(\u0000\u0000\u0107/"+
//		"\u0001\u0000\u0000\u0000\u0108\u0109\u0005\n\u0000\u0000\u0109\u010a\u0005"+
//		"<\u0000\u0000\u010a\u010b\u00050\u0000\u0000\u010b\u010c\u0003@ \u0000"+
//		"\u010c\u010d\u0005(\u0000\u0000\u010d1\u0001\u0000\u0000\u0000\u010e\u0112"+
//		"\u0005#\u0000\u0000\u010f\u0111\u00034\u001a\u0000\u0110\u010f\u0001\u0000"+
//		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
//		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000"+
//		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0005$\u0000"+
//		"\u0000\u01163\u0001\u0000\u0000\u0000\u0117\u011e\u00036\u001b\u0000\u0118"+
//		"\u0119\u00038\u001c\u0000\u0119\u011a\u0005(\u0000\u0000\u011a\u011e\u0001"+
//		"\u0000\u0000\u0000\u011b\u011e\u00032\u0019\u0000\u011c\u011e\u0005(\u0000"+
//		"\u0000\u011d\u0117\u0001\u0000\u0000\u0000\u011d\u0118\u0001\u0000\u0000"+
//		"\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000"+
//		"\u0000\u011e5\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u000b\u0000\u0000"+
//		"\u0120\u0123\u0003\n\u0005\u0000\u0121\u0122\u0005\'\u0000\u0000\u0122"+
//		"\u0124\u0003@ \u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
//		"\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0126\u0005"+
//		"0\u0000\u0000\u0126\u0128\u00038\u001c\u0000\u0127\u0125\u0001\u0000\u0000"+
//		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
//		"\u0000\u0129\u012a\u0005(\u0000\u0000\u012a7\u0001\u0000\u0000\u0000\u012b"+
//		"\u012c\u0006\u001c\uffff\uffff\u0000\u012c\u016f\u0003B!\u0000\u012d\u016f"+
//		"\u0003 \u0010\u0000\u012e\u012f\u0005!\u0000\u0000\u012f\u0130\u00038"+
//		"\u001c\u0000\u0130\u0131\u0005\"\u0000\u0000\u0131\u016f\u0001\u0000\u0000"+
//		"\u0000\u0132\u0133\u0005\f\u0000\u0000\u0133\u0134\u00038\u001c\u0000"+
//		"\u0134\u013a\u00032\u0019\u0000\u0135\u0138\u0005\r\u0000\u0000\u0136"+
//		"\u0139\u00032\u0019\u0000\u0137\u0139\u00038\u001c\u0000\u0138\u0136\u0001"+
//		"\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013b\u0001"+
//		"\u0000\u0000\u0000\u013a\u0135\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
//		"\u0000\u0000\u0000\u013b\u016f\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
//		"\u000e\u0000\u0000\u013d\u013e\u00038\u001c\u0000\u013e\u013f\u0005#\u0000"+
//		"\u0000\u013f\u0140\u0003<\u001e\u0000\u0140\u0141\u0005$\u0000\u0000\u0141"+
//		"\u016f\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u000f\u0000\u0000\u0143"+
//		"\u0144\u00038\u001c\u0000\u0144\u0145\u00032\u0019\u0000\u0145\u016f\u0001"+
//		"\u0000\u0000\u0000\u0146\u0147\u0005\u0010\u0000\u0000\u0147\u0148\u0003"+
//		"\n\u0005\u0000\u0148\u0149\u0005\u0011\u0000\u0000\u0149\u014a\u00038"+
//		"\u001c\u0000\u014a\u014b\u00032\u0019\u0000\u014b\u016f\u0001\u0000\u0000"+
//		"\u0000\u014c\u014d\u0005\u0012\u0000\u0000\u014d\u016f\u00032\u0019\u0000"+
//		"\u014e\u0150\u0005\u0013\u0000\u0000\u014f\u0151\u00038\u001c\u0000\u0150"+
//		"\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151"+
//		"\u0152\u0001\u0000\u0000\u0000\u0152\u016f\u0005(\u0000\u0000\u0153\u0155"+
//		"\u0005\u0014\u0000\u0000\u0154\u0156\u00038\u001c\u0000\u0155\u0154\u0001"+
//		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
//		"\u0000\u0000\u0000\u0157\u016f\u0005(\u0000\u0000\u0158\u0159\u0005\u0015"+
//		"\u0000\u0000\u0159\u016f\u0005(\u0000\u0000\u015a\u015b\u0005\u0016\u0000"+
//		"\u0000\u015b\u016f\u00032\u0019\u0000\u015c\u015d\u0005\u0017\u0000\u0000"+
//		"\u015d\u016f\u00038\u001c\u0005\u015e\u015f\u0005\u0018\u0000\u0000\u015f"+
//		"\u016f\u00038\u001c\u0004\u0160\u0161\u00051\u0000\u0000\u0161\u016f\u0003"+
//		"8\u001c\u0003\u0162\u0163\u00051\u0000\u0000\u0163\u0164\u00052\u0000"+
//		"\u0000\u0164\u016f\u00038\u001c\u0002\u0165\u0167\u0005\u0019\u0000\u0000"+
//		"\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000"+
//		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u00053\u0000\u0000\u0169"+
//		"\u016b\u0003\u0006\u0003\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a"+
//		"\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c"+
//		"\u016d\u00053\u0000\u0000\u016d\u016f\u00032\u0019\u0000\u016e\u012b\u0001"+
//		"\u0000\u0000\u0000\u016e\u012d\u0001\u0000\u0000\u0000\u016e\u012e\u0001"+
//		"\u0000\u0000\u0000\u016e\u0132\u0001\u0000\u0000\u0000\u016e\u013c\u0001"+
//		"\u0000\u0000\u0000\u016e\u0142\u0001\u0000\u0000\u0000\u016e\u0146\u0001"+
//		"\u0000\u0000\u0000\u016e\u014c\u0001\u0000\u0000\u0000\u016e\u014e\u0001"+
//		"\u0000\u0000\u0000\u016e\u0153\u0001\u0000\u0000\u0000\u016e\u0158\u0001"+
//		"\u0000\u0000\u0000\u016e\u015a\u0001\u0000\u0000\u0000\u016e\u015c\u0001"+
//		"\u0000\u0000\u0000\u016e\u015e\u0001\u0000\u0000\u0000\u016e\u0160\u0001"+
//		"\u0000\u0000\u0000\u016e\u0162\u0001\u0000\u0000\u0000\u016e\u0166\u0001"+
//		"\u0000\u0000\u0000\u016f\u0192\u0001\u0000\u0000\u0000\u0170\u0171\n\u0013"+
//		"\u0000\u0000\u0171\u0172\u0005,\u0000\u0000\u0172\u0191\u00038\u001c\u0014"+
//		"\u0173\u0174\n\u0012\u0000\u0000\u0174\u0175\u0005-\u0000\u0000\u0175"+
//		"\u0191\u00038\u001c\u0013\u0176\u0177\n\u0011\u0000\u0000\u0177\u0178"+
//		"\u0005.\u0000\u0000\u0178\u0191\u00038\u001c\u0012\u0179\u017a\n\u0010"+
//		"\u0000\u0000\u017a\u017b\u0005/\u0000\u0000\u017b\u0191\u00038\u001c\u0011"+
//		"\u017c\u017d\n\u000f\u0000\u0000\u017d\u017e\u00050\u0000\u0000\u017e"+
//		"\u0191\u00038\u001c\u0010\u017f\u0180\n\u0017\u0000\u0000\u0180\u0181"+
//		"\u0005%\u0000\u0000\u0181\u0182\u00038\u001c\u0000\u0182\u0183\u0005&"+
//		"\u0000\u0000\u0183\u0191\u0001\u0000\u0000\u0000\u0184\u0185\n\u0016\u0000"+
//		"\u0000\u0185\u0187\u0005!\u0000\u0000\u0186\u0188\u0003:\u001d\u0000\u0187"+
//		"\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
//		"\u0189\u0001\u0000\u0000\u0000\u0189\u0191\u0005\"\u0000\u0000\u018a\u018b"+
//		"\n\u0015\u0000\u0000\u018b\u018c\u00056\u0000\u0000\u018c\u0191\u0005"+
//		"<\u0000\u0000\u018d\u018e\n\u0014\u0000\u0000\u018e\u018f\u0005*\u0000"+
//		"\u0000\u018f\u0191\u0005<\u0000\u0000\u0190\u0170\u0001\u0000\u0000\u0000"+
//		"\u0190\u0173\u0001\u0000\u0000\u0000\u0190\u0176\u0001\u0000\u0000\u0000"+
//		"\u0190\u0179\u0001\u0000\u0000\u0000\u0190\u017c\u0001\u0000\u0000\u0000"+
//		"\u0190\u017f\u0001\u0000\u0000\u0000\u0190\u0184\u0001\u0000\u0000\u0000"+
//		"\u0190\u018a\u0001\u0000\u0000\u0000\u0190\u018d\u0001\u0000\u0000\u0000"+
//		"\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000"+
//		"\u0192\u0193\u0001\u0000\u0000\u0000\u01939\u0001\u0000\u0000\u0000\u0194"+
//		"\u0192\u0001\u0000\u0000\u0000\u0195\u019a\u00038\u001c\u0000\u0196\u0197"+
//		"\u0005)\u0000\u0000\u0197\u0199\u00038\u001c\u0000\u0198\u0196\u0001\u0000"+
//		"\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000"+
//		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b;\u0001\u0000\u0000"+
//		"\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u01a2\u0003>\u001f\u0000"+
//		"\u019e\u019f\u0005)\u0000\u0000\u019f\u01a1\u0003>\u001f\u0000\u01a0\u019e"+
//		"\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0"+
//		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a6"+
//		"\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a7"+
//		"\u0005)\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001"+
//		"\u0000\u0000\u0000\u01a7=\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003\n"+
//		"\u0005\u0000\u01a9\u01aa\u0005+\u0000\u0000\u01aa\u01ab\u00038\u001c\u0000"+
//		"\u01ab\u01ac\u0005(\u0000\u0000\u01ac?\u0001\u0000\u0000\u0000\u01ad\u01ae"+
//		"\u0006 \uffff\uffff\u0000\u01ae\u01d2\u0005<\u0000\u0000\u01af\u01b1\u0005"+
//		"!\u0000\u0000\u01b0\u01b2\u0003\u0014\n\u0000\u01b1\u01b0\u0001\u0000"+
//		"\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000"+
//		"\u0000\u0000\u01b3\u01d2\u0005\"\u0000\u0000\u01b4\u01b5\u0005%\u0000"+
//		"\u0000\u01b5\u01b6\u0003@ \u0000\u01b6\u01b7\u0005(\u0000\u0000\u01b7"+
//		"\u01b8\u00038\u001c\u0000\u01b8\u01b9\u0005&\u0000\u0000\u01b9\u01d2\u0001"+
//		"\u0000\u0000\u0000\u01ba\u01bb\u00051\u0000\u0000\u01bb\u01d2\u0003@ "+
//		"\u0006\u01bc\u01bd\u00051\u0000\u0000\u01bd\u01be\u00052\u0000\u0000\u01be"+
//		"\u01d2\u0003@ \u0005\u01bf\u01c0\u00058\u0000\u0000\u01c0\u01c1\u0003"+
//		"@ \u0000\u01c1\u01c2\u00055\u0000\u0000\u01c2\u01d2\u0001\u0000\u0000"+
//		"\u0000\u01c3\u01c4\u00059\u0000\u0000\u01c4\u01c5\u0003@ \u0000\u01c5"+
//		"\u01c6\u00055\u0000\u0000\u01c6\u01d2\u0001\u0000\u0000\u0000\u01c7\u01c8"+
//		"\u0005:\u0000\u0000\u01c8\u01c9\u0003@ \u0000\u01c9\u01ca\u00055\u0000"+
//		"\u0000\u01ca\u01d2\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005;\u0000\u0000"+
//		"\u01cc\u01cd\u0003@ \u0000\u01cd\u01ce\u0005)\u0000\u0000\u01ce\u01cf"+
//		"\u0003@ \u0000\u01cf\u01d0\u00055\u0000\u0000\u01d0\u01d2\u0001\u0000"+
//		"\u0000\u0000\u01d1\u01ad\u0001\u0000\u0000\u0000\u01d1\u01af\u0001\u0000"+
//		"\u0000\u0000\u01d1\u01b4\u0001\u0000\u0000\u0000\u01d1\u01ba\u0001\u0000"+
//		"\u0000\u0000\u01d1\u01bc\u0001\u0000\u0000\u0000\u01d1\u01bf\u0001\u0000"+
//		"\u0000\u0000\u01d1\u01c3\u0001\u0000\u0000\u0000\u01d1\u01c7\u0001\u0000"+
//		"\u0000\u0000\u01d1\u01cb\u0001\u0000\u0000\u0000\u01d2\u01d8\u0001\u0000"+
//		"\u0000\u0000\u01d3\u01d4\n\b\u0000\u0000\u01d4\u01d5\u0005+\u0000\u0000"+
//		"\u01d5\u01d7\u0003@ \t\u01d6\u01d3\u0001\u0000\u0000\u0000\u01d7\u01da"+
//		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
//		"\u0001\u0000\u0000\u0000\u01d9A\u0001\u0000\u0000\u0000\u01da\u01d8\u0001"+
//		"\u0000\u0000\u0000\u01db\u01f1\u0005=\u0000\u0000\u01dc\u01f1\u0005>\u0000"+
//		"\u0000\u01dd\u01f1\u0005\u001e\u0000\u0000\u01de\u01f1\u0005\u001f\u0000"+
//		"\u0000\u01df\u01f1\u0005 \u0000\u0000\u01e0\u01f1\u0005\u001b\u0000\u0000"+
//		"\u01e1\u01e2\u0005\u001a\u0000\u0000\u01e2\u01e3\u0005!\u0000\u0000\u01e3"+
//		"\u01e4\u00038\u001c\u0000\u01e4\u01e5\u0005\"\u0000\u0000\u01e5\u01f1"+
//		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005\u001c\u0000\u0000\u01e7\u01e8"+
//		"\u0005!\u0000\u0000\u01e8\u01e9\u00038\u001c\u0000\u01e9\u01ea\u0005\""+
//		"\u0000\u0000\u01ea\u01f1\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005\u001d"+
//		"\u0000\u0000\u01ec\u01ed\u0005!\u0000\u0000\u01ed\u01ee\u00038\u001c\u0000"+
//		"\u01ee\u01ef\u0005\"\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0"+
//		"\u01db\u0001\u0000\u0000\u0000\u01f0\u01dc\u0001\u0000\u0000\u0000\u01f0"+
//		"\u01dd\u0001\u0000\u0000\u0000\u01f0\u01de\u0001\u0000\u0000\u0000\u01f0"+
//		"\u01df\u0001\u0000\u0000\u0000\u01f0\u01e0\u0001\u0000\u0000\u0000\u01f0"+
//		"\u01e1\u0001\u0000\u0000\u0000\u01f0\u01e6\u0001\u0000\u0000\u0000\u01f0"+
//		"\u01eb\u0001\u0000\u0000\u0000\u01f1C\u0001\u0000\u0000\u0000-GU[`ix}"+
//		"\u0080\u0087\u008b\u0096\u00a4\u00a8\u00af\u00b7\u00c5\u00c7\u00cf\u00d8"+
//		"\u00de\u00e3\u00e9\u00ef\u00f6\u0112\u011d\u0123\u0127\u0138\u013a\u0150"+
//		"\u0155\u0166\u016a\u016e\u0187\u0190\u0192\u019a\u01a2\u01a6\u01b1\u01d1"+
//		"\u01d8\u01f0";
//	public static final ATN _ATN =
//		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
//	static {
//		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
//		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
//			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
//		}
//	}
//}