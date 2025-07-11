//// Generated from D:/【】作业/【】编译技术/大作业/proj/src/main/java/Rust.g4 by ANTLR 4.13.2
//import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
//
///**
// * This class provides an empty implementation of {@link RustVisitor},
// * which can be extended to create a visitor which only needs to handle a subset
// * of the available methods.
// *
// * @param <T> The return type of the visit operation. Use {@link Void} for
// * operations with no return type.
// */
//@SuppressWarnings("CheckReturnValue")
//public class RustBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements RustVisitor<T> {
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitCompilationUnit(RustParser.CompilationUnitContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitItem(RustParser.ItemContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitFunction(RustParser.FunctionContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitParameterList(RustParser.ParameterListContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitParameter(RustParser.ParameterContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitPattern(RustParser.PatternContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitStructDef(RustParser.StructDefContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitStructBody(RustParser.StructBodyContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitStructFieldList(RustParser.StructFieldListContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitStructField(RustParser.StructFieldContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitTypeList(RustParser.TypeListContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitEnumDef(RustParser.EnumDefContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitEnumVariantList(RustParser.EnumVariantListContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitEnumVariant(RustParser.EnumVariantContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitModuleDef(RustParser.ModuleDefContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitUseDecl(RustParser.UseDeclContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitPath(RustParser.PathContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitTraitDef(RustParser.TraitDefContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitTraitItem(RustParser.TraitItemContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitFunctionSignature(RustParser.FunctionSignatureContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitImplBlock(RustParser.ImplBlockContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitImplItem(RustParser.ImplItemContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitConstDef(RustParser.ConstDefContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitStaticDef(RustParser.StaticDefContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitTypeAlias(RustParser.TypeAliasContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitBlock(RustParser.BlockContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitStatement(RustParser.StatementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitLocal(RustParser.LocalContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitExpression(RustParser.ExpressionContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitExpressionList(RustParser.ExpressionListContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitMatchArmList(RustParser.MatchArmListContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitMatchArm(RustParser.MatchArmContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitType(RustParser.TypeContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitLiteral(RustParser.LiteralContext ctx) { return visitChildren(ctx); }
//}