// Generated from /home/gautam/personal/projects/TL4/src/main/java/tl4/grammar/TL4.g4 by ANTLR 4.0

package tl4.grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TL4Visitor<T> extends ParseTreeVisitor<T> {
	T visitExpression(TL4Parser.ExpressionContext ctx);

	T visitAndExpr(TL4Parser.AndExprContext ctx);

	T visitAtom(TL4Parser.AtomContext ctx);

	T visitForStatement(TL4Parser.ForStatementContext ctx);

	T visitBlock(TL4Parser.BlockContext ctx);

	T visitMulExpr(TL4Parser.MulExprContext ctx);

	T visitIdList(TL4Parser.IdListContext ctx);

	T visitLookup(TL4Parser.LookupContext ctx);

	T visitFunctionCall(TL4Parser.FunctionCallContext ctx);

	T visitAddExpr(TL4Parser.AddExprContext ctx);

	T visitParse(TL4Parser.ParseContext ctx);

	T visitExprList(TL4Parser.ExprListContext ctx);

	T visitIndexses(TL4Parser.IndexsesContext ctx);

	T visitEquExpr(TL4Parser.EquExprContext ctx);

	T visitElseIfStat(TL4Parser.ElseIfStatContext ctx);

	T visitElseStat(TL4Parser.ElseStatContext ctx);

	T visitList(TL4Parser.ListContext ctx);

	T visitRelExpr(TL4Parser.RelExprContext ctx);

	T visitFunctionDecl(TL4Parser.FunctionDeclContext ctx);

	T visitOrExpr(TL4Parser.OrExprContext ctx);

	T visitPowExpr(TL4Parser.PowExprContext ctx);

	T visitIfStatement(TL4Parser.IfStatementContext ctx);

	T visitStatement(TL4Parser.StatementContext ctx);

	T visitAssignment(TL4Parser.AssignmentContext ctx);

	T visitWhileStatement(TL4Parser.WhileStatementContext ctx);

	T visitUnaryExpr(TL4Parser.UnaryExprContext ctx);

	T visitCondExpr(TL4Parser.CondExprContext ctx);

	T visitIfStat(TL4Parser.IfStatContext ctx);
}