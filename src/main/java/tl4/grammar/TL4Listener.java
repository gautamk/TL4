// Generated from /home/gautam/personal/projects/TL4/src/main/java/tl4/grammar/TL4.g4 by ANTLR 4.0

package tl4.grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TL4Listener extends ParseTreeListener {
	void enterExpression(TL4Parser.ExpressionContext ctx);
	void exitExpression(TL4Parser.ExpressionContext ctx);

	void enterAndExpr(TL4Parser.AndExprContext ctx);
	void exitAndExpr(TL4Parser.AndExprContext ctx);

	void enterAtom(TL4Parser.AtomContext ctx);
	void exitAtom(TL4Parser.AtomContext ctx);

	void enterForStatement(TL4Parser.ForStatementContext ctx);
	void exitForStatement(TL4Parser.ForStatementContext ctx);

	void enterBlock(TL4Parser.BlockContext ctx);
	void exitBlock(TL4Parser.BlockContext ctx);

	void enterMulExpr(TL4Parser.MulExprContext ctx);
	void exitMulExpr(TL4Parser.MulExprContext ctx);

	void enterIdList(TL4Parser.IdListContext ctx);
	void exitIdList(TL4Parser.IdListContext ctx);

	void enterLookup(TL4Parser.LookupContext ctx);
	void exitLookup(TL4Parser.LookupContext ctx);

	void enterFunctionCall(TL4Parser.FunctionCallContext ctx);
	void exitFunctionCall(TL4Parser.FunctionCallContext ctx);

	void enterAddExpr(TL4Parser.AddExprContext ctx);
	void exitAddExpr(TL4Parser.AddExprContext ctx);

	void enterParse(TL4Parser.ParseContext ctx);
	void exitParse(TL4Parser.ParseContext ctx);

	void enterExprList(TL4Parser.ExprListContext ctx);
	void exitExprList(TL4Parser.ExprListContext ctx);

	void enterIndexses(TL4Parser.IndexsesContext ctx);
	void exitIndexses(TL4Parser.IndexsesContext ctx);

	void enterEquExpr(TL4Parser.EquExprContext ctx);
	void exitEquExpr(TL4Parser.EquExprContext ctx);

	void enterElseIfStat(TL4Parser.ElseIfStatContext ctx);
	void exitElseIfStat(TL4Parser.ElseIfStatContext ctx);

	void enterElseStat(TL4Parser.ElseStatContext ctx);
	void exitElseStat(TL4Parser.ElseStatContext ctx);

	void enterList(TL4Parser.ListContext ctx);
	void exitList(TL4Parser.ListContext ctx);

	void enterRelExpr(TL4Parser.RelExprContext ctx);
	void exitRelExpr(TL4Parser.RelExprContext ctx);

	void enterFunctionDecl(TL4Parser.FunctionDeclContext ctx);
	void exitFunctionDecl(TL4Parser.FunctionDeclContext ctx);

	void enterOrExpr(TL4Parser.OrExprContext ctx);
	void exitOrExpr(TL4Parser.OrExprContext ctx);

	void enterPowExpr(TL4Parser.PowExprContext ctx);
	void exitPowExpr(TL4Parser.PowExprContext ctx);

	void enterIfStatement(TL4Parser.IfStatementContext ctx);
	void exitIfStatement(TL4Parser.IfStatementContext ctx);

	void enterStatement(TL4Parser.StatementContext ctx);
	void exitStatement(TL4Parser.StatementContext ctx);

	void enterAssignment(TL4Parser.AssignmentContext ctx);
	void exitAssignment(TL4Parser.AssignmentContext ctx);

	void enterWhileStatement(TL4Parser.WhileStatementContext ctx);
	void exitWhileStatement(TL4Parser.WhileStatementContext ctx);

	void enterUnaryExpr(TL4Parser.UnaryExprContext ctx);
	void exitUnaryExpr(TL4Parser.UnaryExprContext ctx);

	void enterCondExpr(TL4Parser.CondExprContext ctx);
	void exitCondExpr(TL4Parser.CondExprContext ctx);

	void enterIfStat(TL4Parser.IfStatContext ctx);
	void exitIfStat(TL4Parser.IfStatContext ctx);
}