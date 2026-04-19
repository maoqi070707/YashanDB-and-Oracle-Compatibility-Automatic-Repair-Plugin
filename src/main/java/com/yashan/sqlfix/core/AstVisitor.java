package com.yashan.sqlfix.core;

import com.yashan.sqlfix.core.parser.OracleSqlBaseVisitor;
import com.yashan.sqlfix.core.parser.OracleSqlParser;

public class AstVisitor extends OracleSqlBaseVisitor<String> {
    @Override
    public String visitSql_script(OracleSqlParser.Sql_scriptContext ctx) {
        StringBuilder result = new StringBuilder();
        for (OracleSqlParser.Sql_statementContext stmt : ctx.sql_statement()) {
            result.append(visit(stmt)).append("\n");
        }
        return result.toString();
    }
    
    @Override
    public String visitSql_statement(OracleSqlParser.Sql_statementContext ctx) {
        if (ctx.select_statement() != null) {
            return visit(ctx.select_statement());
        } else if (ctx.insert_statement() != null) {
            return visit(ctx.insert_statement());
        } else if (ctx.update_statement() != null) {
            return visit(ctx.update_statement());
        } else if (ctx.delete_statement() != null) {
            return visit(ctx.delete_statement());
        } else if (ctx.create_statement() != null) {
            return visit(ctx.create_statement());
        } else if (ctx.alter_statement() != null) {
            return visit(ctx.alter_statement());
        } else if (ctx.drop_statement() != null) {
            return visit(ctx.drop_statement());
        } else if (ctx.commit_statement() != null) {
            return visit(ctx.commit_statement());
        } else if (ctx.rollback_statement() != null) {
            return visit(ctx.rollback_statement());
        } else if (ctx.create_procedure_statement() != null) {
            return visit(ctx.create_procedure_statement());
        } else if (ctx.create_function_statement() != null) {
            return visit(ctx.create_function_statement());
        } else if (ctx.create_trigger_statement() != null) {
            return visit(ctx.create_trigger_statement());
        }
        return ctx.getText();
    }
    
    @Override
    public String visitSelect_statement(OracleSqlParser.Select_statementContext ctx) {
        String selectList = visit(ctx.select_list());
        String fromClause = visit(ctx.from_clause());
        String result = "SELECT " + selectList + " FROM " + fromClause;
        
        // 处理WHERE子句
        if (ctx.condition() != null) {
            String condition = visit(ctx.condition());
            result += " WHERE " + condition;
        }
        
        // 转换ROWNUM限制
        if (result.contains("ROWNUM")) {
            result = result.replace("WHERE ROWNUM <= ", "LIMIT ");
            result = result.replace("WHERE ROWNUM<=", "LIMIT ");
            result = result.replace("WHERE ROWNUM = 1", "LIMIT 1");
            result = result.replace("WHERE ROWNUM=1", "LIMIT 1");
        }
        
        return result;
    }
    
    @Override
    public String visitSelect_list(OracleSqlParser.Select_listContext ctx) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ctx.select_element().size(); i++) {
            if (i > 0) result.append(", ");
            result.append(visit(ctx.select_element(i)));
        }
        return result.toString();
    }
    
    @Override
    public String visitSelect_element(OracleSqlParser.Select_elementContext ctx) {
        String text = ctx.getText();
        // 转换函数（使用简单的字符串替换）
        text = text.replace("DECODE(", "CASE(");
        text = text.replace("NVL(", "COALESCE(");
        text = text.replace("SYSDATE", "CURRENT_TIMESTAMP");
        text = text.replace("TO_DATE(", "TO_TIMESTAMP(");
        text = text.replace("TO_CHAR(", "CAST(");
        return text;
    }
    
    @Override
    public String visitFrom_clause(OracleSqlParser.From_clauseContext ctx) {
        String text = ctx.getText();
        // 转换DUAL表
        text = text.replace("dual", "(SELECT 1 AS dummy)");
        return text;
    }
    
    @Override
    public String visitInsert_statement(OracleSqlParser.Insert_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitUpdate_statement(OracleSqlParser.Update_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitDelete_statement(OracleSqlParser.Delete_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitCreate_statement(OracleSqlParser.Create_statementContext ctx) {
        String text = ctx.getText();
        // 转换类型
        text = text.replace("VARCHAR2", "VARCHAR");
        text = text.replace("NUMBER", "INTEGER");
        text = text.replace("DATE", "TIMESTAMP");
        text = text.replace("CLOB", "TEXT");
        text = text.replace("BLOB", "BYTEA");
        return text;
    }
    
    @Override
    public String visitAlter_statement(OracleSqlParser.Alter_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitDrop_statement(OracleSqlParser.Drop_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitCommit_statement(OracleSqlParser.Commit_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitRollback_statement(OracleSqlParser.Rollback_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitCreate_procedure_statement(OracleSqlParser.Create_procedure_statementContext ctx) {
        String text = ctx.getText();
        // 转换存储过程定义
        text = text.replace("CREATE PROCEDURE", "CREATE OR REPLACE PROCEDURE");
        // 转换类型
        text = text.replace("VARCHAR2", "VARCHAR");
        text = text.replace("NUMBER", "INTEGER");
        text = text.replace("DATE", "TIMESTAMP");
        text = text.replace("CLOB", "TEXT");
        text = text.replace("BLOB", "BYTEA");
        text = text.replace("PLS_INTEGER", "INTEGER");
        return text;
    }
    
    @Override
    public String visitCreate_function_statement(OracleSqlParser.Create_function_statementContext ctx) {
        String text = ctx.getText();
        // 转换函数定义
        text = text.replace("CREATE FUNCTION", "CREATE OR REPLACE FUNCTION");
        // 转换类型
        text = text.replace("VARCHAR2", "VARCHAR");
        text = text.replace("NUMBER", "INTEGER");
        text = text.replace("DATE", "TIMESTAMP");
        text = text.replace("CLOB", "TEXT");
        text = text.replace("BLOB", "BYTEA");
        text = text.replace("PLS_INTEGER", "INTEGER");
        return text;
    }
    
    @Override
    public String visitCreate_trigger_statement(OracleSqlParser.Create_trigger_statementContext ctx) {
        String text = ctx.getText();
        // 转换触发器定义
        text = text.replace("CREATE TRIGGER", "CREATE OR REPLACE TRIGGER");
        return text;
    }
    
    @Override
    public String visitParameter(OracleSqlParser.ParameterContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitDeclare_section(OracleSqlParser.Declare_sectionContext ctx) {
        String text = ctx.getText();
        // 转换类型
        text = text.replace("VARCHAR2", "VARCHAR");
        text = text.replace("NUMBER", "INTEGER");
        text = text.replace("DATE", "TIMESTAMP");
        text = text.replace("CLOB", "TEXT");
        text = text.replace("BLOB", "BYTEA");
        text = text.replace("PLS_INTEGER", "INTEGER");
        return text;
    }
    
    @Override
    public String visitVariable_declaration(OracleSqlParser.Variable_declarationContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitBegin_section(OracleSqlParser.Begin_sectionContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitStatement(OracleSqlParser.StatementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitIf_statement(OracleSqlParser.If_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitLoop_statement(OracleSqlParser.Loop_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitWhile_statement(OracleSqlParser.While_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitReturn_statement(OracleSqlParser.Return_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitAssignment_statement(OracleSqlParser.Assignment_statementContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitCondition(OracleSqlParser.ConditionContext ctx) {
        return ctx.getText();
    }
}