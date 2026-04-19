package com.yashan.sqlfix.core.rule;

public interface Rule {
    String apply(String sql);
    boolean canApply(String sql);
}