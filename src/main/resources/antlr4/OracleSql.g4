grammar OracleSql;

@header {
package com.yashan.sqlfix.core.parser;
}

// 词法规则
SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
INSERT: 'INSERT';
INTO: 'INTO';
VALUES: 'VALUES';
UPDATE: 'UPDATE';
SET: 'SET';
DELETE: 'DELETE';
CREATE: 'CREATE';
TABLE: 'TABLE';
DROP: 'DROP';
ALTER: 'ALTER';
ADD: 'ADD';
COMMIT: 'COMMIT';
ROLLBACK: 'ROLLBACK';
AS: 'AS';
NOT: 'NOT';
NULL: 'NULL';
AND: 'AND';
OR: 'OR';
VARCHAR2: 'VARCHAR2';
NUMBER: 'NUMBER';
DATE: 'DATE';
TIMESTAMP: 'TIMESTAMP';

// 操作符和标点符号
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
EQUALS: '=';
NOT_EQUALS: '<>';
LESS_THAN: '<';
GREATER_THAN: '>';
LESS_EQUALS: '<=';
GREATER_EQUALS: '>=';

// 字面量
STRING:
    '\'' ( ~['\\] | '\\' . )* '\''
    ;

NUMERIC_LITERAL:
    DIGIT+ ( '.' DIGIT* )?
    ;

DATE_LITERAL:
    'DATE' '\'' DATE_FORMAT '\''
    ;

IDENTIFIER:
    [a-zA-Z_] [a-zA-Z0-9_]*
    ;

WS:
    [ \t\r\n]+
    -> skip
    ;

fragment DIGIT:
    [0-9]
    ;

fragment DATE_FORMAT:
    DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT
    ;

// 语法规则
sql_script:
    sql_statement+ EOF
    ;

sql_statement:
    select_statement
    | insert_statement
    | update_statement
    | delete_statement
    | create_statement
    | drop_statement
    | alter_statement
    | commit_statement
    | rollback_statement
    ;

select_statement:
    SELECT select_list FROM from_clause
    ;

select_list:
    select_element (COMMA select_element)*
    ;

select_element:
    expression (AS? identifier)?
    ;

from_clause:
    table_reference (COMMA table_reference)*
    ;

table_reference:
    identifier (AS? identifier)?
    ;

expression:
    literal
    | identifier
    | function_call
    | expression PLUS expression
    | expression MINUS expression
    | expression MULT expression
    | expression DIV expression
    | LPAREN expression RPAREN
    ;

function_call:
    identifier LPAREN (expression (COMMA expression)*)? RPAREN
    ;

literal:
    STRING
    | NUMERIC_LITERAL
    | DATE_LITERAL
    ;

identifier:
    IDENTIFIER
    ;

insert_statement:
    INSERT INTO table_reference VALUES LPAREN expression (COMMA expression)* RPAREN
    ;

update_statement:
    UPDATE table_reference SET column_value (COMMA column_value)* (WHERE condition)?
    ;

column_value:
    identifier EQUALS expression
    ;

delete_statement:
    DELETE FROM table_reference (WHERE condition)?
    ;

create_statement:
    CREATE TABLE identifier LPAREN column_definition (COMMA column_definition)* RPAREN
    ;

column_definition:
    identifier data_type (NOT NULL)?
    ;

data_type:
    VARCHAR2 LPAREN NUMERIC_LITERAL RPAREN
    | NUMBER (LPAREN NUMERIC_LITERAL (COMMA NUMERIC_LITERAL)? RPAREN)?
    | DATE
    | TIMESTAMP
    ;

drop_statement:
    DROP TABLE identifier
    ;

alter_statement:
    ALTER TABLE identifier ADD column_definition
    ;

commit_statement:
    COMMIT
    ;

rollback_statement:
    ROLLBACK
    ;

condition:
    expression (EQUALS | NOT_EQUALS | LESS_THAN | GREATER_THAN | LESS_EQUALS | GREATER_EQUALS) expression
    | condition AND condition
    | condition OR condition
    | NOT condition
    | LPAREN condition RPAREN
    ;