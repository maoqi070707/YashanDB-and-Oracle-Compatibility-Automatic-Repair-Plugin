// Generated from OracleSql.g4 by ANTLR 4.13.1

package com.yashan.sqlfix.core.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OracleSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, INSERT=4, INTO=5, VALUES=6, UPDATE=7, SET=8, 
		DELETE=9, CREATE=10, TABLE=11, DROP=12, ALTER=13, ADD=14, COMMIT=15, ROLLBACK=16, 
		AS=17, NOT=18, NULL=19, AND=20, OR=21, VARCHAR2=22, NUMBER=23, DATE=24, 
		TIMESTAMP=25, LPAREN=26, RPAREN=27, COMMA=28, PLUS=29, MINUS=30, MULT=31, 
		DIV=32, EQUALS=33, NOT_EQUALS=34, LESS_THAN=35, GREATER_THAN=36, LESS_EQUALS=37, 
		GREATER_EQUALS=38, STRING=39, NUMERIC_LITERAL=40, DATE_LITERAL=41, IDENTIFIER=42, 
		WS=43;
	public static final int
		RULE_sql_script = 0, RULE_sql_statement = 1, RULE_select_statement = 2, 
		RULE_select_list = 3, RULE_select_element = 4, RULE_from_clause = 5, RULE_table_reference = 6, 
		RULE_expression = 7, RULE_function_call = 8, RULE_literal = 9, RULE_identifier = 10, 
		RULE_insert_statement = 11, RULE_update_statement = 12, RULE_column_value = 13, 
		RULE_delete_statement = 14, RULE_create_statement = 15, RULE_column_definition = 16, 
		RULE_data_type = 17, RULE_drop_statement = 18, RULE_alter_statement = 19, 
		RULE_commit_statement = 20, RULE_rollback_statement = 21, RULE_condition = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql_script", "sql_statement", "select_statement", "select_list", "select_element", 
			"from_clause", "table_reference", "expression", "function_call", "literal", 
			"identifier", "insert_statement", "update_statement", "column_value", 
			"delete_statement", "create_statement", "column_definition", "data_type", 
			"drop_statement", "alter_statement", "commit_statement", "rollback_statement", 
			"condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'FROM'", "'WHERE'", "'INSERT'", "'INTO'", "'VALUES'", 
			"'UPDATE'", "'SET'", "'DELETE'", "'CREATE'", "'TABLE'", "'DROP'", "'ALTER'", 
			"'ADD'", "'COMMIT'", "'ROLLBACK'", "'AS'", "'NOT'", "'NULL'", "'AND'", 
			"'OR'", "'VARCHAR2'", "'NUMBER'", "'DATE'", "'TIMESTAMP'", "'('", "')'", 
			"','", "'+'", "'-'", "'*'", "'/'", "'='", "'<>'", "'<'", "'>'", "'<='", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "INSERT", "INTO", "VALUES", "UPDATE", 
			"SET", "DELETE", "CREATE", "TABLE", "DROP", "ALTER", "ADD", "COMMIT", 
			"ROLLBACK", "AS", "NOT", "NULL", "AND", "OR", "VARCHAR2", "NUMBER", "DATE", 
			"TIMESTAMP", "LPAREN", "RPAREN", "COMMA", "PLUS", "MINUS", "MULT", "DIV", 
			"EQUALS", "NOT_EQUALS", "LESS_THAN", "GREATER_THAN", "LESS_EQUALS", "GREATER_EQUALS", 
			"STRING", "NUMERIC_LITERAL", "DATE_LITERAL", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "OracleSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OracleSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_scriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OracleSqlParser.EOF, 0); }
		public List<Sql_statementContext> sql_statement() {
			return getRuleContexts(Sql_statementContext.class);
		}
		public Sql_statementContext sql_statement(int i) {
			return getRuleContext(Sql_statementContext.class,i);
		}
		public Sql_scriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSql_script(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSql_script(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSql_script(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_scriptContext sql_script() throws RecognitionException {
		Sql_scriptContext _localctx = new Sql_scriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				sql_statement();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 112274L) != 0) );
			setState(51);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_statementContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Create_statementContext create_statement() {
			return getRuleContext(Create_statementContext.class,0);
		}
		public Drop_statementContext drop_statement() {
			return getRuleContext(Drop_statementContext.class,0);
		}
		public Alter_statementContext alter_statement() {
			return getRuleContext(Alter_statementContext.class,0);
		}
		public Commit_statementContext commit_statement() {
			return getRuleContext(Commit_statementContext.class,0);
		}
		public Rollback_statementContext rollback_statement() {
			return getRuleContext(Rollback_statementContext.class,0);
		}
		public Sql_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSql_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSql_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSql_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_statementContext sql_statement() throws RecognitionException {
		Sql_statementContext _localctx = new Sql_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_statement);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				insert_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				update_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				delete_statement();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				create_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				drop_statement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				alter_statement();
				}
				break;
			case COMMIT:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				commit_statement();
				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				rollback_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(OracleSqlParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleSqlParser.FROM, 0); }
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(SELECT);
			setState(65);
			select_list();
			setState(66);
			match(FROM);
			setState(67);
			from_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_listContext extends ParserRuleContext {
		public List<Select_elementContext> select_element() {
			return getRuleContexts(Select_elementContext.class);
		}
		public Select_elementContext select_element(int i) {
			return getRuleContext(Select_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			select_element();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(70);
				match(COMMA);
				setState(71);
				select_element();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleSqlParser.AS, 0); }
		public Select_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterSelect_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitSelect_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitSelect_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_elementContext select_element() throws RecognitionException {
		Select_elementContext _localctx = new Select_elementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			expression(0);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(78);
					match(AS);
					}
				}

				setState(81);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_clauseContext extends ParserRuleContext {
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			table_reference();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				table_reference();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_referenceContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode AS() { return getToken(OracleSqlParser.AS, 0); }
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitTable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_table_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			identifier();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(93);
					match(AS);
					}
				}

				setState(96);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode PLUS() { return getToken(OracleSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(OracleSqlParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(OracleSqlParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(OracleSqlParser.DIV, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(100);
				literal();
				}
				break;
			case 2:
				{
				setState(101);
				identifier();
				}
				break;
			case 3:
				{
				setState(102);
				function_call();
				}
				break;
			case 4:
				{
				setState(103);
				match(LPAREN);
				setState(104);
				expression(0);
				setState(105);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(110);
						match(PLUS);
						setState(111);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(113);
						match(MINUS);
						setState(114);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(116);
						match(MULT);
						setState(117);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(119);
						match(DIV);
						setState(120);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			identifier();
			setState(127);
			match(LPAREN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246404317184L) != 0)) {
				{
				setState(128);
				expression(0);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(129);
					match(COMMA);
					setState(130);
					expression(0);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(138);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OracleSqlParser.STRING, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(OracleSqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode DATE_LITERAL() { return getToken(OracleSqlParser.DATE_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OracleSqlParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_statementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(OracleSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(OracleSqlParser.INTO, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(OracleSqlParser.VALUES, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitInsert_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(INSERT);
			setState(145);
			match(INTO);
			setState(146);
			table_reference();
			setState(147);
			match(VALUES);
			setState(148);
			match(LPAREN);
			setState(149);
			expression(0);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				expression(0);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_statementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(OracleSqlParser.UPDATE, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode SET() { return getToken(OracleSqlParser.SET, 0); }
		public List<Column_valueContext> column_value() {
			return getRuleContexts(Column_valueContext.class);
		}
		public Column_valueContext column_value(int i) {
			return getRuleContext(Column_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(OracleSqlParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitUpdate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitUpdate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(UPDATE);
			setState(160);
			table_reference();
			setState(161);
			match(SET);
			setState(162);
			column_value();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(163);
				match(COMMA);
				setState(164);
				column_value();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(170);
				match(WHERE);
				setState(171);
				condition(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_valueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(OracleSqlParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterColumn_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitColumn_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitColumn_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_valueContext column_value() throws RecognitionException {
		Column_valueContext _localctx = new Column_valueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_column_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			identifier();
			setState(175);
			match(EQUALS);
			setState(176);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_statementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(OracleSqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(OracleSqlParser.FROM, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(OracleSqlParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDelete_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(DELETE);
			setState(179);
			match(FROM);
			setState(180);
			table_reference();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(181);
				match(WHERE);
				setState(182);
				condition(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(OracleSqlParser.TABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OracleSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OracleSqlParser.COMMA, i);
		}
		public Create_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCreate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCreate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCreate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_statementContext create_statement() throws RecognitionException {
		Create_statementContext _localctx = new Create_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(CREATE);
			setState(186);
			match(TABLE);
			setState(187);
			identifier();
			setState(188);
			match(LPAREN);
			setState(189);
			column_definition();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(190);
				match(COMMA);
				setState(191);
				column_definition();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_definitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(OracleSqlParser.NULL, 0); }
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitColumn_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			identifier();
			setState(200);
			data_type();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(201);
				match(NOT);
				setState(202);
				match(NULL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode VARCHAR2() { return getToken(OracleSqlParser.VARCHAR2, 0); }
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(OracleSqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(OracleSqlParser.NUMERIC_LITERAL, i);
		}
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(OracleSqlParser.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(OracleSqlParser.COMMA, 0); }
		public TerminalNode DATE() { return getToken(OracleSqlParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleSqlParser.TIMESTAMP, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_data_type);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARCHAR2:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(VARCHAR2);
				setState(206);
				match(LPAREN);
				setState(207);
				match(NUMERIC_LITERAL);
				setState(208);
				match(RPAREN);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(NUMBER);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(210);
					match(LPAREN);
					setState(211);
					match(NUMERIC_LITERAL);
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(212);
						match(COMMA);
						setState(213);
						match(NUMERIC_LITERAL);
						}
					}

					setState(216);
					match(RPAREN);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(TIMESTAMP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleSqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(OracleSqlParser.TABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Drop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterDrop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitDrop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitDrop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_statementContext drop_statement() throws RecognitionException {
		Drop_statementContext _localctx = new Drop_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_drop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(DROP);
			setState(224);
			match(TABLE);
			setState(225);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_statementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(OracleSqlParser.TABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(OracleSqlParser.ADD, 0); }
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Alter_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterAlter_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitAlter_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitAlter_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_statementContext alter_statement() throws RecognitionException {
		Alter_statementContext _localctx = new Alter_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alter_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ALTER);
			setState(228);
			match(TABLE);
			setState(229);
			identifier();
			setState(230);
			match(ADD);
			setState(231);
			column_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Commit_statementContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(OracleSqlParser.COMMIT, 0); }
		public Commit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCommit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCommit_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCommit_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_statementContext commit_statement() throws RecognitionException {
		Commit_statementContext _localctx = new Commit_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_commit_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(COMMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rollback_statementContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(OracleSqlParser.ROLLBACK, 0); }
		public Rollback_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterRollback_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitRollback_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitRollback_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_statementContext rollback_statement() throws RecognitionException {
		Rollback_statementContext _localctx = new Rollback_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rollback_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ROLLBACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(OracleSqlParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(OracleSqlParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(OracleSqlParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(OracleSqlParser.GREATER_THAN, 0); }
		public TerminalNode LESS_EQUALS() { return getToken(OracleSqlParser.LESS_EQUALS, 0); }
		public TerminalNode GREATER_EQUALS() { return getToken(OracleSqlParser.GREATER_EQUALS, 0); }
		public TerminalNode NOT() { return getToken(OracleSqlParser.NOT, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(OracleSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OracleSqlParser.RPAREN, 0); }
		public TerminalNode AND() { return getToken(OracleSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(OracleSqlParser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OracleSqlListener ) ((OracleSqlListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleSqlVisitor ) return ((OracleSqlVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(238);
				expression(0);
				setState(239);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				expression(0);
				}
				break;
			case 2:
				{
				setState(242);
				match(NOT);
				setState(243);
				condition(2);
				}
				break;
			case 3:
				{
				setState(244);
				match(LPAREN);
				setState(245);
				condition(0);
				setState(246);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(250);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(251);
						match(AND);
						setState(252);
						condition(5);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(253);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(254);
						match(OR);
						setState(255);
						condition(4);
						}
						break;
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 22:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0106\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0004\u00000\b\u0000\u000b\u0000"+
		"\f\u00001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003I\b\u0003"+
		"\n\u0003\f\u0003L\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004P\b\u0004"+
		"\u0001\u0004\u0003\u0004S\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005X\b\u0005\n\u0005\f\u0005[\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006_\b\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007l\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007z\b\u0007\n\u0007\f\u0007}\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0084\b\b\n\b\f"+
		"\b\u0087\t\b\u0003\b\u0089\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0099\b\u000b\n\u000b\f\u000b"+
		"\u009c\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u00a6\b\f\n\f\f\f\u00a9\t\f\u0001\f\u0001\f\u0003"+
		"\f\u00ad\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b8\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00c1\b\u000f\n\u000f\f\u000f\u00c4\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00cc\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d7\b\u0011\u0001\u0011"+
		"\u0003\u0011\u00da\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00de\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00f9\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0101\b\u0016\n"+
		"\u0016\f\u0016\u0104\t\u0016\u0001\u0016\u0000\u0002\u000e,\u0017\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,\u0000\u0002\u0001\u0000\')\u0001\u0000!&\u0115\u0000/\u0001"+
		"\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000"+
		"\u0000\u0006E\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nT\u0001"+
		"\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000"+
		"\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000\u0000"+
		"\u0014\u008e\u0001\u0000\u0000\u0000\u0016\u0090\u0001\u0000\u0000\u0000"+
		"\u0018\u009f\u0001\u0000\u0000\u0000\u001a\u00ae\u0001\u0000\u0000\u0000"+
		"\u001c\u00b2\u0001\u0000\u0000\u0000\u001e\u00b9\u0001\u0000\u0000\u0000"+
		" \u00c7\u0001\u0000\u0000\u0000\"\u00dd\u0001\u0000\u0000\u0000$\u00df"+
		"\u0001\u0000\u0000\u0000&\u00e3\u0001\u0000\u0000\u0000(\u00e9\u0001\u0000"+
		"\u0000\u0000*\u00eb\u0001\u0000\u0000\u0000,\u00f8\u0001\u0000\u0000\u0000"+
		".0\u0003\u0002\u0001\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000034\u0005\u0000\u0000\u00014\u0001\u0001\u0000\u0000\u0000"+
		"5?\u0003\u0004\u0002\u00006?\u0003\u0016\u000b\u00007?\u0003\u0018\f\u0000"+
		"8?\u0003\u001c\u000e\u00009?\u0003\u001e\u000f\u0000:?\u0003$\u0012\u0000"+
		";?\u0003&\u0013\u0000<?\u0003(\u0014\u0000=?\u0003*\u0015\u0000>5\u0001"+
		"\u0000\u0000\u0000>6\u0001\u0000\u0000\u0000>7\u0001\u0000\u0000\u0000"+
		">8\u0001\u0000\u0000\u0000>9\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000"+
		"\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0005\u0001\u0000\u0000"+
		"AB\u0003\u0006\u0003\u0000BC\u0005\u0002\u0000\u0000CD\u0003\n\u0005\u0000"+
		"D\u0005\u0001\u0000\u0000\u0000EJ\u0003\b\u0004\u0000FG\u0005\u001c\u0000"+
		"\u0000GI\u0003\b\u0004\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0007\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MR\u0003\u000e\u0007\u0000"+
		"NP\u0005\u0011\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QS\u0003\u0014\n\u0000RO\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000S\t\u0001\u0000\u0000\u0000TY\u0003\f"+
		"\u0006\u0000UV\u0005\u001c\u0000\u0000VX\u0003\f\u0006\u0000WU\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\u000b\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\a\u0003\u0014\n\u0000]_\u0005\u0011\u0000\u0000^]\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0003"+
		"\u0014\n\u0000a^\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\r"+
		"\u0001\u0000\u0000\u0000cd\u0006\u0007\uffff\uffff\u0000dl\u0003\u0012"+
		"\t\u0000el\u0003\u0014\n\u0000fl\u0003\u0010\b\u0000gh\u0005\u001a\u0000"+
		"\u0000hi\u0003\u000e\u0007\u0000ij\u0005\u001b\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000kc\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000kf\u0001"+
		"\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000l{\u0001\u0000\u0000\u0000"+
		"mn\n\u0005\u0000\u0000no\u0005\u001d\u0000\u0000oz\u0003\u000e\u0007\u0006"+
		"pq\n\u0004\u0000\u0000qr\u0005\u001e\u0000\u0000rz\u0003\u000e\u0007\u0005"+
		"st\n\u0003\u0000\u0000tu\u0005\u001f\u0000\u0000uz\u0003\u000e\u0007\u0004"+
		"vw\n\u0002\u0000\u0000wx\u0005 \u0000\u0000xz\u0003\u000e\u0007\u0003"+
		"ym\u0001\u0000\u0000\u0000yp\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000"+
		"\u0000yv\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|\u000f\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000~\u007f\u0003\u0014\n\u0000\u007f\u0088\u0005"+
		"\u001a\u0000\u0000\u0080\u0085\u0003\u000e\u0007\u0000\u0081\u0082\u0005"+
		"\u001c\u0000\u0000\u0082\u0084\u0003\u000e\u0007\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0080\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u001b\u0000\u0000\u008b\u0011\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0007\u0000\u0000\u0000\u008d\u0013\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005*\u0000\u0000\u008f\u0015\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0092\u0005\u0005"+
		"\u0000\u0000\u0092\u0093\u0003\f\u0006\u0000\u0093\u0094\u0005\u0006\u0000"+
		"\u0000\u0094\u0095\u0005\u001a\u0000\u0000\u0095\u009a\u0003\u000e\u0007"+
		"\u0000\u0096\u0097\u0005\u001c\u0000\u0000\u0097\u0099\u0003\u000e\u0007"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u001b\u0000\u0000\u009e\u0017\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005\u0007\u0000\u0000\u00a0\u00a1\u0003\f\u0006\u0000"+
		"\u00a1\u00a2\u0005\b\u0000\u0000\u00a2\u00a7\u0003\u001a\r\u0000\u00a3"+
		"\u00a4\u0005\u001c\u0000\u0000\u00a4\u00a6\u0003\u001a\r\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ac"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0003\u0000\u0000\u00ab\u00ad\u0003,\u0016\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u0019\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0003\u0014\n\u0000\u00af\u00b0\u0005!"+
		"\u0000\u0000\u00b0\u00b1\u0003\u000e\u0007\u0000\u00b1\u001b\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\t\u0000\u0000\u00b3\u00b4\u0005\u0002\u0000"+
		"\u0000\u00b4\u00b7\u0003\f\u0006\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000"+
		"\u00b6\u00b8\u0003,\u0016\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u001d\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\n\u0000\u0000\u00ba\u00bb\u0005\u000b\u0000\u0000\u00bb\u00bc"+
		"\u0003\u0014\n\u0000\u00bc\u00bd\u0005\u001a\u0000\u0000\u00bd\u00c2\u0003"+
		" \u0010\u0000\u00be\u00bf\u0005\u001c\u0000\u0000\u00bf\u00c1\u0003 \u0010"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005\u001b\u0000\u0000\u00c6\u001f\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0003\u0014\n\u0000\u00c8\u00cb\u0003\"\u0011\u0000"+
		"\u00c9\u00ca\u0005\u0012\u0000\u0000\u00ca\u00cc\u0005\u0013\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc!\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0016\u0000\u0000\u00ce"+
		"\u00cf\u0005\u001a\u0000\u0000\u00cf\u00d0\u0005(\u0000\u0000\u00d0\u00de"+
		"\u0005\u001b\u0000\u0000\u00d1\u00d9\u0005\u0017\u0000\u0000\u00d2\u00d3"+
		"\u0005\u001a\u0000\u0000\u00d3\u00d6\u0005(\u0000\u0000\u00d4\u00d5\u0005"+
		"\u001c\u0000\u0000\u00d5\u00d7\u0005(\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u0005\u001b\u0000\u0000\u00d9\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00de\u0001\u0000"+
		"\u0000\u0000\u00db\u00de\u0005\u0018\u0000\u0000\u00dc\u00de\u0005\u0019"+
		"\u0000\u0000\u00dd\u00cd\u0001\u0000\u0000\u0000\u00dd\u00d1\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de#\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\f\u0000"+
		"\u0000\u00e0\u00e1\u0005\u000b\u0000\u0000\u00e1\u00e2\u0003\u0014\n\u0000"+
		"\u00e2%\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\r\u0000\u0000\u00e4"+
		"\u00e5\u0005\u000b\u0000\u0000\u00e5\u00e6\u0003\u0014\n\u0000\u00e6\u00e7"+
		"\u0005\u000e\u0000\u0000\u00e7\u00e8\u0003 \u0010\u0000\u00e8\'\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005\u000f\u0000\u0000\u00ea)\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec+\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0006\u0016\uffff\uffff\u0000\u00ee\u00ef\u0003\u000e"+
		"\u0007\u0000\u00ef\u00f0\u0007\u0001\u0000\u0000\u00f0\u00f1\u0003\u000e"+
		"\u0007\u0000\u00f1\u00f9\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0012"+
		"\u0000\u0000\u00f3\u00f9\u0003,\u0016\u0002\u00f4\u00f5\u0005\u001a\u0000"+
		"\u0000\u00f5\u00f6\u0003,\u0016\u0000\u00f6\u00f7\u0005\u001b\u0000\u0000"+
		"\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f9\u0102\u0001\u0000\u0000\u0000\u00fa\u00fb\n\u0004\u0000\u0000\u00fb"+
		"\u00fc\u0005\u0014\u0000\u0000\u00fc\u0101\u0003,\u0016\u0005\u00fd\u00fe"+
		"\n\u0003\u0000\u0000\u00fe\u00ff\u0005\u0015\u0000\u0000\u00ff\u0101\u0003"+
		",\u0016\u0004\u0100\u00fa\u0001\u0000\u0000\u0000\u0100\u00fd\u0001\u0000"+
		"\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103-\u0001\u0000\u0000"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u00191>JORY^aky{\u0085\u0088"+
		"\u009a\u00a7\u00ac\u00b7\u00c2\u00cb\u00d6\u00d9\u00dd\u00f8\u0100\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}