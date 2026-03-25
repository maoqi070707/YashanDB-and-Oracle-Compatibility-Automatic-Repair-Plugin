package com.yashan.sqlfix.core;

import com.yashan.sqlfix.core.parser.OracleSqlLexer;
import com.yashan.sqlfix.core.parser.OracleSqlParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class SqlFixEngine {
    public String fixSql(String oracleSql) {
        if (oracleSql == null || oracleSql.isEmpty()) {
            return oracleSql;
        }
        
        OracleSqlLexer lexer = new OracleSqlLexer(CharStreams.fromString(oracleSql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OracleSqlParser parser = new OracleSqlParser(tokens);
        
        AstVisitor visitor = new AstVisitor();
        String result = visitor.visit(parser.sql_script());
        return result != null ? result : oracleSql;
    }
}