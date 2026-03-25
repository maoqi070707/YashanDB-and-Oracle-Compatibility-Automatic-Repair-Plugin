// Generated from OracleSql.g4 by ANTLR 4.13.1

package com.yashan.sqlfix.core.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OracleSqlParser}.
 */
public interface OracleSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(OracleSqlParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(OracleSqlParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(OracleSqlParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(OracleSqlParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(OracleSqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(OracleSqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(OracleSqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(OracleSqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#select_element}.
	 * @param ctx the parse tree
	 */
	void enterSelect_element(OracleSqlParser.Select_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#select_element}.
	 * @param ctx the parse tree
	 */
	void exitSelect_element(OracleSqlParser.Select_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(OracleSqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(OracleSqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(OracleSqlParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(OracleSqlParser.Table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(OracleSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(OracleSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(OracleSqlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(OracleSqlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(OracleSqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(OracleSqlParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OracleSqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OracleSqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(OracleSqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(OracleSqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(OracleSqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(OracleSqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#column_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_value(OracleSqlParser.Column_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#column_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_value(OracleSqlParser.Column_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(OracleSqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(OracleSqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statement(OracleSqlParser.Create_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statement(OracleSqlParser.Create_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(OracleSqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(OracleSqlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(OracleSqlParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(OracleSqlParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#drop_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statement(OracleSqlParser.Drop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#drop_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statement(OracleSqlParser.Drop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#alter_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_statement(OracleSqlParser.Alter_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#alter_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_statement(OracleSqlParser.Alter_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(OracleSqlParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(OracleSqlParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(OracleSqlParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(OracleSqlParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(OracleSqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(OracleSqlParser.ConditionContext ctx);
}