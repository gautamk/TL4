// Generated from /home/gautam/personal/projects/TL4/src/main/java/tl4/grammar/TL4.g4 by ANTLR 4.0

package tl4.grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class TL4BaseVisitor<T> extends AbstractParseTreeVisitor<T> implements TL4Visitor<T> {
	@Override public T visitExpression(TL4Parser.ExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitAndExpr(TL4Parser.AndExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitAtom(TL4Parser.AtomContext ctx) { return visitChildren(ctx); }

	@Override public T visitForStatement(TL4Parser.ForStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlock(TL4Parser.BlockContext ctx) { return visitChildren(ctx); }

	@Override public T visitMulExpr(TL4Parser.MulExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitIdList(TL4Parser.IdListContext ctx) { return visitChildren(ctx); }

	@Override public T visitLookup(TL4Parser.LookupContext ctx) { return visitChildren(ctx); }

	@Override public T visitFunctionCall(TL4Parser.FunctionCallContext ctx) { return visitChildren(ctx); }

	@Override public T visitAddExpr(TL4Parser.AddExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitParse(TL4Parser.ParseContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprList(TL4Parser.ExprListContext ctx) { return visitChildren(ctx); }

	@Override public T visitIndexses(TL4Parser.IndexsesContext ctx) { return visitChildren(ctx); }

	@Override public T visitEquExpr(TL4Parser.EquExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitElseIfStat(TL4Parser.ElseIfStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitElseStat(TL4Parser.ElseStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitList(TL4Parser.ListContext ctx) { return visitChildren(ctx); }

	@Override public T visitRelExpr(TL4Parser.RelExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitFunctionDecl(TL4Parser.FunctionDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitOrExpr(TL4Parser.OrExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitPowExpr(TL4Parser.PowExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitIfStatement(TL4Parser.IfStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatement(TL4Parser.StatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignment(TL4Parser.AssignmentContext ctx) { return visitChildren(ctx); }

	@Override public T visitWhileStatement(TL4Parser.WhileStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitUnaryExpr(TL4Parser.UnaryExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitCondExpr(TL4Parser.CondExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitIfStat(TL4Parser.IfStatContext ctx) { return visitChildren(ctx); }
}