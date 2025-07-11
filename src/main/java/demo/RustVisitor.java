//// Generated from D:/【】作业/【】编译技术/大作业/proj/src/main/java/Rust.g4 by ANTLR 4.13.2
//import org.antlr.v4.runtime.tree.ParseTreeVisitor;
//
///**
// * This interface defines a complete generic visitor for a parse tree produced
// * by {@link RustParser}.
// *
// * @param <T> The return type of the visit operation. Use {@link Void} for
// * operations with no return type.
// */
//public interface RustVisitor<T> extends ParseTreeVisitor<T> {
//	/**
//	 * Visit a parse tree produced by {@link RustParser#compilationUnit}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitCompilationUnit(RustParser.CompilationUnitContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#item}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitItem(RustParser.ItemContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#function}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitFunction(RustParser.FunctionContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#parameterList}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitParameterList(RustParser.ParameterListContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#parameter}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitParameter(RustParser.ParameterContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#pattern}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitPattern(RustParser.PatternContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#structDef}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitStructDef(RustParser.StructDefContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#structBody}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitStructBody(RustParser.StructBodyContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#structFieldList}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitStructFieldList(RustParser.StructFieldListContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#structField}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitStructField(RustParser.StructFieldContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#typeList}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitTypeList(RustParser.TypeListContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#enumDef}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitEnumDef(RustParser.EnumDefContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#enumVariantList}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitEnumVariantList(RustParser.EnumVariantListContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#enumVariant}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitEnumVariant(RustParser.EnumVariantContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#moduleDef}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitModuleDef(RustParser.ModuleDefContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#useDecl}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitUseDecl(RustParser.UseDeclContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#path}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitPath(RustParser.PathContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#traitDef}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitTraitDef(RustParser.TraitDefContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#traitItem}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitTraitItem(RustParser.TraitItemContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#functionSignature}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitFunctionSignature(RustParser.FunctionSignatureContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#implBlock}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitImplBlock(RustParser.ImplBlockContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#implItem}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitImplItem(RustParser.ImplItemContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#constDef}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitConstDef(RustParser.ConstDefContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#staticDef}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitStaticDef(RustParser.StaticDefContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#typeAlias}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitTypeAlias(RustParser.TypeAliasContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#block}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitBlock(RustParser.BlockContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#statement}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitStatement(RustParser.StatementContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#local}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitLocal(RustParser.LocalContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#expression}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitExpression(RustParser.ExpressionContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#expressionList}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitExpressionList(RustParser.ExpressionListContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#matchArmList}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitMatchArmList(RustParser.MatchArmListContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#matchArm}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitMatchArm(RustParser.MatchArmContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#type}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitType(RustParser.TypeContext ctx);
//	/**
//	 * Visit a parse tree produced by {@link RustParser#literal}.
//	 * @param ctx the parse tree
//	 * @return the visitor result
//	 */
//	T visitLiteral(RustParser.LiteralContext ctx);
//}