package com.yashan.sqlfix.core;

import com.yashan.sqlfix.core.parser.OracleSqlLexer;
import com.yashan.sqlfix.core.parser.OracleSqlParser;
import com.yashan.sqlfix.core.rule.Rule;
import com.yashan.sqlfix.core.rule.TypeRule;
import com.yashan.sqlfix.core.rule.FunctionRule;
import com.yashan.sqlfix.core.rule.SyntaxRule;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.List;

public class SqlFixEngine {
    private List<Rule> rules;
    
    public SqlFixEngine() {
        // 初始化规则列表
        rules = new ArrayList<>();
        rules.add(new TypeRule());
        rules.add(new FunctionRule());
        rules.add(new SyntaxRule());
    }
    
    public String fixSql(String oracleSql) {
        if (oracleSql == null || oracleSql.isEmpty()) {
            return oracleSql;
        }
        
        // 应用所有规则
        String result = oracleSql;
        for (Rule rule : rules) {
            if (rule.canApply(result)) {
                result = rule.apply(result);
            }
        }
        
        // 移除SQL语句末尾的分号，以便ANTLR解析
        result = result.trim();
        if (result.endsWith(";")) {
            result = result.substring(0, result.length() - 1);
        }
        
        // 处理空字符串情况
        if (result.isEmpty()) {
            return oracleSql;
        }
        
        // 使用ANTLR解析和转换
        try {
            OracleSqlLexer lexer = new OracleSqlLexer(CharStreams.fromString(result));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            OracleSqlParser parser = new OracleSqlParser(tokens);
            
            AstVisitor visitor = new AstVisitor();
            String parsedResult = visitor.visit(parser.sql_script());
            return parsedResult != null ? parsedResult : result;
        } catch (Exception e) {
            // 如果解析失败，返回原始SQL
            return oracleSql;
        }
    }
    
    // 添加规则的方法，支持动态添加规则
    public void addRule(Rule rule) {
        rules.add(rule);
    }
    
    // 获取规则列表的方法
    public List<Rule> getRules() {
        return rules;
    }
}