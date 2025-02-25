// $ANTLR 3.5.1 C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g 2025-02-24 19:40:48

	package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GRADLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int CHAR=4;
	public static final int CLOSE_CUB=5;
	public static final int CLOSE_SQB=6;
	public static final int DATE=7;
	public static final int DOTCOMMA=8;
	public static final int ERROR_TOKEN=9;
	public static final int ESC_SEQ=10;
	public static final int HEX_DIGIT=11;
	public static final int INT=12;
	public static final int OCTAL_ESC=13;
	public static final int OPEN_CUB=14;
	public static final int OPEN_SQB=15;
	public static final int STATUS=16;
	public static final int STRING=17;
	public static final int UNICODE_ESC=18;
	public static final int WS=19;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GRADLexer() {} 
	public GRADLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GRADLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g"; }

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:11:7: ( 'ADDRESS' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:11:9: 'ADDRESS'
			{
			match("ADDRESS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:12:7: ( 'BIRTHDATE:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:12:9: 'BIRTHDATE:'
			{
			match("BIRTHDATE:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:13:7: ( 'CFU' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:13:9: 'CFU'
			{
			match("CFU"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:14:7: ( 'CITY' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:14:9: 'CITY'
			{
			match("CITY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:15:7: ( 'COUNTRY' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:15:9: 'COUNTRY'
			{
			match("COUNTRY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:16:7: ( 'DAILY_HOURS:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:16:9: 'DAILY_HOURS:'
			{
			match("DAILY_HOURS:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:17:7: ( 'DATE' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:17:9: 'DATE'
			{
			match("DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:18:7: ( 'DEGREE:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:18:9: 'DEGREE:'
			{
			match("DEGREE:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:19:7: ( 'EMAIL:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:19:9: 'EMAIL:'
			{
			match("EMAIL:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:20:7: ( 'EXAM' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:20:9: 'EXAM'
			{
			match("EXAM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:21:7: ( 'EXAMS:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:21:9: 'EXAMS:'
			{
			match("EXAMS:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:22:7: ( 'MILESTONE' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:22:9: 'MILESTONE'
			{
			match("MILESTONE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:23:7: ( 'NAME:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:23:9: 'NAME:'
			{
			match("NAME:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:24:7: ( 'NUMBER' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:24:9: 'NUMBER'
			{
			match("NUMBER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:25:7: ( 'SERIAL:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:25:9: 'SERIAL:'
			{
			match("SERIAL:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:26:7: ( 'STATUS' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:26:9: 'STATUS'
			{
			match("STATUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:27:7: ( 'STREET' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:27:9: 'STREET'
			{
			match("STREET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:28:7: ( 'STUDENT' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:28:9: 'STUDENT'
			{
			match("STUDENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:29:7: ( 'SURNAME:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:29:9: 'SURNAME:'
			{
			match("SURNAME:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:30:7: ( 'UNIVERSITY' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:30:9: 'UNIVERSITY'
			{
			match("UNIVERSITY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:31:7: ( 'YEAR' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:31:9: 'YEAR'
			{
			match("YEAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:32:7: ( 'YEARS:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:32:9: 'YEARS:'
			{
			match("YEARS:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:33:7: ( 'ZIP' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:33:9: 'ZIP'
			{
			match("ZIP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:38:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:38:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:46:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:46:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:46:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\\') ) {
					alt1=1;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:46:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:46:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:49:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:49:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:49:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\\') ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:49:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:49:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:54:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:58:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt3=1;
					}
					break;
				case 'u':
					{
					alt3=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt3=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:58:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:59:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:60:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:65:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\\') ) {
				int LA4_1 = input.LA(2);
				if ( ((LA4_1 >= '0' && LA4_1 <= '3')) ) {
					int LA4_2 = input.LA(3);
					if ( ((LA4_2 >= '0' && LA4_2 <= '7')) ) {
						int LA4_4 = input.LA(4);
						if ( ((LA4_4 >= '0' && LA4_4 <= '7')) ) {
							alt4=1;
						}

						else {
							alt4=2;
						}

					}

					else {
						alt4=3;
					}

				}
				else if ( ((LA4_1 >= '4' && LA4_1 <= '7')) ) {
					int LA4_3 = input.LA(3);
					if ( ((LA4_3 >= '0' && LA4_3 <= '7')) ) {
						alt4=2;
					}

					else {
						alt4=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:65:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:66:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:67:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:72:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:72:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:75:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:75:7: ( '0' .. '9' )+
			{
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:75:7: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:78:7: ( INT '-' INT '-' INT )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:78:9: INT '-' INT '-' INT
			{
			mINT(); 

			match('-'); 
			mINT(); 

			match('-'); 
			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "STATUS"
	public final void mSTATUS() throws RecognitionException {
		try {
			int _type = STATUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:80:8: ( 'PASSED' | 'NOT_PASSED' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='P') ) {
				alt6=1;
			}
			else if ( (LA6_0=='N') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:80:10: 'PASSED'
					{
					match("PASSED"); 

					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:80:21: 'NOT_PASSED'
					{
					match("NOT_PASSED"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATUS"

	// $ANTLR start "OPEN_SQB"
	public final void mOPEN_SQB() throws RecognitionException {
		try {
			int _type = OPEN_SQB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:83:2: ( '[' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:83:4: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_SQB"

	// $ANTLR start "CLOSE_SQB"
	public final void mCLOSE_SQB() throws RecognitionException {
		try {
			int _type = CLOSE_SQB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:85:2: ( ']' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:85:4: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_SQB"

	// $ANTLR start "OPEN_CUB"
	public final void mOPEN_CUB() throws RecognitionException {
		try {
			int _type = OPEN_CUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:88:2: ( '{' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:88:4: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_CUB"

	// $ANTLR start "CLOSE_CUB"
	public final void mCLOSE_CUB() throws RecognitionException {
		try {
			int _type = CLOSE_CUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:90:2: ( '}' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:90:4: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_CUB"

	// $ANTLR start "DOTCOMMA"
	public final void mDOTCOMMA() throws RecognitionException {
		try {
			int _type = DOTCOMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:93:2: ( ';' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:93:4: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOTCOMMA"

	// $ANTLR start "ERROR_TOKEN"
	public final void mERROR_TOKEN() throws RecognitionException {
		try {
			int _type = ERROR_TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:96:2: ( . )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:96:4: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TOKEN"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | WS | STRING | CHAR | INT | DATE | STATUS | OPEN_SQB | CLOSE_SQB | OPEN_CUB | CLOSE_CUB | DOTCOMMA | ERROR_TOKEN )
		int alt7=35;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:10: T__20
				{
				mT__20(); 

				}
				break;
			case 2 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:16: T__21
				{
				mT__21(); 

				}
				break;
			case 3 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:22: T__22
				{
				mT__22(); 

				}
				break;
			case 4 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:28: T__23
				{
				mT__23(); 

				}
				break;
			case 5 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:34: T__24
				{
				mT__24(); 

				}
				break;
			case 6 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:40: T__25
				{
				mT__25(); 

				}
				break;
			case 7 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:46: T__26
				{
				mT__26(); 

				}
				break;
			case 8 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:52: T__27
				{
				mT__27(); 

				}
				break;
			case 9 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:58: T__28
				{
				mT__28(); 

				}
				break;
			case 10 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:64: T__29
				{
				mT__29(); 

				}
				break;
			case 11 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:70: T__30
				{
				mT__30(); 

				}
				break;
			case 12 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:76: T__31
				{
				mT__31(); 

				}
				break;
			case 13 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:82: T__32
				{
				mT__32(); 

				}
				break;
			case 14 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:88: T__33
				{
				mT__33(); 

				}
				break;
			case 15 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:94: T__34
				{
				mT__34(); 

				}
				break;
			case 16 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:100: T__35
				{
				mT__35(); 

				}
				break;
			case 17 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:106: T__36
				{
				mT__36(); 

				}
				break;
			case 18 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:112: T__37
				{
				mT__37(); 

				}
				break;
			case 19 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:118: T__38
				{
				mT__38(); 

				}
				break;
			case 20 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:124: T__39
				{
				mT__39(); 

				}
				break;
			case 21 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:130: T__40
				{
				mT__40(); 

				}
				break;
			case 22 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:136: T__41
				{
				mT__41(); 

				}
				break;
			case 23 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:142: T__42
				{
				mT__42(); 

				}
				break;
			case 24 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:148: WS
				{
				mWS(); 

				}
				break;
			case 25 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:151: STRING
				{
				mSTRING(); 

				}
				break;
			case 26 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:158: CHAR
				{
				mCHAR(); 

				}
				break;
			case 27 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:163: INT
				{
				mINT(); 

				}
				break;
			case 28 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:167: DATE
				{
				mDATE(); 

				}
				break;
			case 29 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:172: STATUS
				{
				mSTATUS(); 

				}
				break;
			case 30 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:179: OPEN_SQB
				{
				mOPEN_SQB(); 

				}
				break;
			case 31 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:188: CLOSE_SQB
				{
				mCLOSE_SQB(); 

				}
				break;
			case 32 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:198: OPEN_CUB
				{
				mOPEN_CUB(); 

				}
				break;
			case 33 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:207: CLOSE_CUB
				{
				mCLOSE_CUB(); 

				}
				break;
			case 34 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:217: DOTCOMMA
				{
				mDOTCOMMA(); 

				}
				break;
			case 35 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:1:226: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\13\26\1\uffff\2\26\1\55\1\26\35\uffff\1\55\15\uffff\1\77\1\101"+
		"\4\uffff";
	static final String DFA7_eofS =
		"\102\uffff";
	static final String DFA7_minS =
		"\1\0\1\104\1\111\1\106\1\101\1\115\1\111\1\101\1\105\1\116\1\105\1\111"+
		"\1\uffff\2\0\1\55\1\101\13\uffff\1\111\2\uffff\1\101\5\uffff\1\101\2\uffff"+
		"\1\101\5\uffff\1\55\10\uffff\1\115\3\uffff\1\122\2\123\4\uffff";
	static final String DFA7_maxS =
		"\1\uffff\1\104\1\111\1\117\1\105\1\130\1\111\2\125\1\116\1\105\1\111\1"+
		"\uffff\2\uffff\1\71\1\101\13\uffff\1\124\2\uffff\1\101\5\uffff\1\125\2"+
		"\uffff\1\101\5\uffff\1\71\10\uffff\1\115\3\uffff\1\122\2\123\4\uffff";
	static final String DFA7_acceptS =
		"\14\uffff\1\30\4\uffff\1\36\1\37\1\40\1\41\1\42\1\43\1\1\1\2\1\3\1\4\1"+
		"\5\1\uffff\1\10\1\11\1\uffff\1\14\1\15\1\16\1\35\1\17\1\uffff\1\23\1\24"+
		"\1\uffff\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34\1\36\1\37\1\40\1\41\1\42"+
		"\1\6\1\7\1\uffff\1\20\1\21\1\22\3\uffff\1\13\1\12\1\26\1\25";
	static final String DFA7_specialS =
		"\1\1\14\uffff\1\2\1\0\63\uffff}>";
	static final String[] DFA7_transitionS = {
			"\11\26\2\14\2\26\1\14\22\26\1\14\1\26\1\15\4\26\1\16\10\26\12\17\1\26"+
			"\1\25\5\26\1\1\1\2\1\3\1\4\1\5\7\26\1\6\1\7\1\26\1\20\2\26\1\10\1\26"+
			"\1\11\3\26\1\12\1\13\1\21\1\26\1\22\35\26\1\23\1\26\1\24\uff82\26",
			"\1\27",
			"\1\30",
			"\1\31\2\uffff\1\32\5\uffff\1\33",
			"\1\34\3\uffff\1\35",
			"\1\36\12\uffff\1\37",
			"\1\40",
			"\1\41\15\uffff\1\43\5\uffff\1\42",
			"\1\44\16\uffff\1\45\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"",
			"\0\53",
			"\47\54\1\uffff\uffd8\54",
			"\1\57\2\uffff\12\56",
			"\1\43",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\65\12\uffff\1\66",
			"",
			"",
			"\1\67",
			"",
			"",
			"",
			"",
			"",
			"\1\70\20\uffff\1\71\2\uffff\1\72",
			"",
			"",
			"\1\73",
			"",
			"",
			"",
			"",
			"",
			"\1\57\2\uffff\12\56",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\74",
			"",
			"",
			"",
			"\1\75",
			"\1\76",
			"\1\100",
			"",
			"",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | WS | STRING | CHAR | INT | DATE | STATUS | OPEN_SQB | CLOSE_SQB | OPEN_CUB | CLOSE_CUB | DOTCOMMA | ERROR_TOKEN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA7_14 = input.LA(1);
						s = -1;
						if ( ((LA7_14 >= '\u0000' && LA7_14 <= '&')||(LA7_14 >= '(' && LA7_14 <= '\uFFFF')) ) {s = 44;}
						else s = 22;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA7_0 = input.LA(1);
						s = -1;
						if ( (LA7_0=='A') ) {s = 1;}
						else if ( (LA7_0=='B') ) {s = 2;}
						else if ( (LA7_0=='C') ) {s = 3;}
						else if ( (LA7_0=='D') ) {s = 4;}
						else if ( (LA7_0=='E') ) {s = 5;}
						else if ( (LA7_0=='M') ) {s = 6;}
						else if ( (LA7_0=='N') ) {s = 7;}
						else if ( (LA7_0=='S') ) {s = 8;}
						else if ( (LA7_0=='U') ) {s = 9;}
						else if ( (LA7_0=='Y') ) {s = 10;}
						else if ( (LA7_0=='Z') ) {s = 11;}
						else if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {s = 12;}
						else if ( (LA7_0=='\"') ) {s = 13;}
						else if ( (LA7_0=='\'') ) {s = 14;}
						else if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {s = 15;}
						else if ( (LA7_0=='P') ) {s = 16;}
						else if ( (LA7_0=='[') ) {s = 17;}
						else if ( (LA7_0==']') ) {s = 18;}
						else if ( (LA7_0=='{') ) {s = 19;}
						else if ( (LA7_0=='}') ) {s = 20;}
						else if ( (LA7_0==';') ) {s = 21;}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\b')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\u001F')||LA7_0=='!'||(LA7_0 >= '#' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '/')||LA7_0==':'||(LA7_0 >= '<' && LA7_0 <= '@')||(LA7_0 >= 'F' && LA7_0 <= 'L')||LA7_0=='O'||(LA7_0 >= 'Q' && LA7_0 <= 'R')||LA7_0=='T'||(LA7_0 >= 'V' && LA7_0 <= 'X')||LA7_0=='\\'||(LA7_0 >= '^' && LA7_0 <= 'z')||LA7_0=='|'||(LA7_0 >= '~' && LA7_0 <= '\uFFFF')) ) {s = 22;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA7_13 = input.LA(1);
						s = -1;
						if ( ((LA7_13 >= '\u0000' && LA7_13 <= '\uFFFF')) ) {s = 43;}
						else s = 22;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 7, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
