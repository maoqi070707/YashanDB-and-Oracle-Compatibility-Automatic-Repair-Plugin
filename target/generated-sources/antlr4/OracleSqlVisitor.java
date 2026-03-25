// Generated from OracleSql.g4 by ANTLR 4.13.1

package com.yashan.sqlfix.core.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OracleSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OracleSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#sql_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_script(OracleSqlParser.Sql_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(OracleSqlParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(OracleSqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(OracleSqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#select_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_element(OracleSqlParser.Select_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(OracleSqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(OracleSqlParser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(OracleSqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(OracleSqlParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(OracleSqlParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(OracleSqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(OracleSqlParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(OracleSqlParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#column_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_value(OracleSqlParser.Column_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(OracleSqlParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#create_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statement(OracleSqlParser.Create_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(OracleSqlParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(OracleSqlParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#drop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statement(OracleSqlParser.Drop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#alter_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_statement(OracleSqlParser.Alter_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_statement(OracleSqlParser.Commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_statement(OracleSqlParser.Rollback_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(OracleSqlParser.ConditionContext ctx);
}