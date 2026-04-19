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
// 新增词法规则
PROCEDURE: 'PROCEDURE';
FUNCTION: 'FUNCTION';
TRIGGER: 'TRIGGER';
BEGIN: 'BEGIN';
END: 'END';
DECLARE: 'DECLARE';
RETURN: 'RETURN';
IS: 'IS';
PLS_INTEGER: 'PLS_INTEGER';
BOOLEAN: 'BOOLEAN';
VARCHAR: 'VARCHAR';
INTEGER: 'INTEGER';
TEXT: 'TEXT';
BYTEA: 'BYTEA';
CURSOR: 'CURSOR';
FOR: 'FOR';
LOOP: 'LOOP';
EXIT: 'EXIT';
WHILE: 'WHILE';
IF: 'IF';
THEN: 'THEN';
ELSE: 'ELSE';
ELSIF: 'ELSIF';
END_IF: 'END IF';
END_LOOP: 'END LOOP';
END_PROC: 'END PROCEDURE';
END_FUNC: 'END FUNCTION';
END_TRIG: 'END TRIGGER';
IN: 'IN';
OUT: 'OUT';
INOUT: 'IN OUT';
CLOB: 'CLOB';
BLOB: 'BLOB';
SYSDATE: 'SYSDATE';
CURRENT_TIMESTAMP: 'CURRENT_TIMESTAMP';
TO_DATE: 'TO_DATE';
TO_TIMESTAMP: 'TO_TIMESTAMP';
TO_CHAR: 'TO_CHAR';
CAST: 'CAST';
DECODE: 'DECODE';
CASE: 'CASE';
NVL: 'NVL';
COALESCE: 'COALESCE';
ROWNUM: 'ROWNUM';
LIMIT: 'LIMIT';
DUAL: 'DUAL';
BEFORE: 'BEFORE';
AFTER: 'AFTER';
ON: 'ON';
EACH: 'EACH';
ROW: 'ROW';
WHEN: 'WHEN';

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
    | create_procedure_statement
    | create_function_statement
    | create_trigger_statement
    ;

select_statement:
    SELECT select_list FROM from_clause (WHERE condition)?
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

condition:
    expression (EQUALS | NOT_EQUALS | LESS_THAN | GREATER_THAN | LESS_EQUALS | GREATER_EQUALS) expression
    | condition AND condition
    | condition OR condition
    | NOT condition
    | LPAREN condition RPAREN
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

// 存储过程定义
create_procedure_statement:
    CREATE PROCEDURE identifier LPAREN (parameter (COMMA parameter)*)? RPAREN (IS | AS)
    (declare_section)?
    begin_section
    END_PROC
    ;

// 函数定义
create_function_statement:
    CREATE FUNCTION identifier LPAREN (parameter (COMMA parameter)*)? RPAREN RETURN data_type (IS | AS)
    (declare_section)?
    begin_section
    END_FUNC
    ;

// 触发器定义
create_trigger_statement:
    CREATE TRIGGER identifier
    (BEFORE | AFTER) (INSERT | UPDATE | DELETE) ON table_reference
    (FOR EACH ROW)?
    (WHEN LPAREN condition RPAREN)?
    (DECLARE)?
    begin_section
    END_TRIG
    ;

// 参数定义
parameter:
    (IN | OUT | INOUT)? identifier data_type
    ;

// 声明部分
declare_section:
    DECLARE
    variable_declaration (COMMA variable_declaration)*
    ;

// 变量声明
variable_declaration:
    identifier data_type (EQUALS expression)?
    ;

// 开始部分
begin_section:
    BEGIN
    statement+
    END
    ;

// 语句
statement:
    sql_statement
    | if_statement
    | loop_statement
    | while_statement
    | return_statement
    | assignment_statement
    ;

// if语句
if_statement:
    IF condition THEN
    statement+
    (ELSIF condition THEN statement+)*
    (ELSE statement+)?
    END_IF
    ;

// loop语句
loop_statement:
    LOOP
    statement+
    (EXIT WHEN condition)?
    END_LOOP
    ;

// while语句
while_statement:
    WHILE condition LOOP
    statement+
    END_LOOP
    ;

// return语句
return_statement:
    RETURN (expression)?
    ;

// 赋值语句
assignment_statement:
    identifier EQUALS expression
    ;