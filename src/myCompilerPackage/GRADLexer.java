// $ANTLR 3.5.1 C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g 2025-02-04 12:33:25

	package myCompilerPackage;
	import myCompilerPackage.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GRADLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int CHAR=4;
	public static final int CLOSE_CUB=5;
	public static final int CLOSE_SQB=6;
	public static final int DATE=7;
	public static final int DOTCOMMA=8;
	public static final int ESC_SEQ=9;
	public static final int HEX_DIGIT=10;
	public static final int INT=11;
	public static final int OCTAL_ESC=12;
	public static final int OPEN_CUB=13;
	public static final int OPEN_SQB=14;
	public static final int STATUS=15;
	public static final int STRING=16;
	public static final int UNICODE_ESC=17;
	public static final int WS=18;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g"; }

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:12:7: ( 'CFU' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:12:9: 'CFU'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:13:7: ( 'DAILY_HOURS:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:13:9: 'DAILY_HOURS:'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:14:7: ( 'DATE' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:14:9: 'DATE'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:15:7: ( 'DEGREE:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:15:9: 'DEGREE:'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:16:7: ( 'EXAM' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:16:9: 'EXAM'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:17:7: ( 'EXAMS:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:17:9: 'EXAMS:'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:18:7: ( 'MILESTONE' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:18:9: 'MILESTONE'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:19:7: ( 'STATUS' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:19:9: 'STATUS'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:20:7: ( 'YEAR' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:20:9: 'YEAR'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:21:7: ( 'YEARS:' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:21:9: 'YEARS:'
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
	// $ANTLR end "T__28"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:22:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:22:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:30:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:30:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:30:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:30:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:30:24: ~ ( '\\\\' | '\"' )
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:33:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:33:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:33:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
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
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:33:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:33:25: ~ ( '\\'' | '\\\\' )
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:38:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:42:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:42:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:43:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:44:9: OCTAL_ESC
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:49:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:49:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:50:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:51:9: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:56:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:56:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:59:5: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='0') ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= '1' && LA6_0 <= '9')) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:59:7: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:59:11: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:59:22: ( '0' .. '9' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:
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
							break loop5;
						}
					}

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
	// $ANTLR end "INT"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:61:7: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) '-' ( '0' .. '9' ) ( '0' .. '9' ) '-' ( '0' .. '9' ) ( '0' .. '9' ) )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:61:9: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) '-' ( '0' .. '9' ) ( '0' .. '9' ) '-' ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('-'); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('-'); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:63:8: ( 'PASSED' | 'NOT_PASSED' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='P') ) {
				alt7=1;
			}
			else if ( (LA7_0=='N') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:63:10: 'PASSED'
					{
					match("PASSED"); 

					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:63:21: 'NOT_PASSED'
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:66:2: ( '[' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:66:4: '['
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:68:2: ( ']' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:68:4: ']'
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:71:2: ( '{' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:71:4: '{'
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:73:2: ( '}' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:73:4: '}'
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
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:76:2: ( ';' )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:76:4: ';'
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

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | WS | STRING | CHAR | INT | DATE | STATUS | OPEN_SQB | CLOSE_SQB | OPEN_CUB | CLOSE_CUB | DOTCOMMA )
		int alt8=21;
		switch ( input.LA(1) ) {
		case 'C':
			{
			alt8=1;
			}
			break;
		case 'D':
			{
			int LA8_2 = input.LA(2);
			if ( (LA8_2=='A') ) {
				int LA8_18 = input.LA(3);
				if ( (LA8_18=='I') ) {
					alt8=2;
				}
				else if ( (LA8_18=='T') ) {
					alt8=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA8_2=='E') ) {
				alt8=4;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 8, 2, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'E':
			{
			int LA8_3 = input.LA(2);
			if ( (LA8_3=='X') ) {
				int LA8_20 = input.LA(3);
				if ( (LA8_20=='A') ) {
					int LA8_27 = input.LA(4);
					if ( (LA8_27=='M') ) {
						int LA8_30 = input.LA(5);
						if ( (LA8_30=='S') ) {
							alt8=6;
						}

						else {
							alt8=5;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 27, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 8, 3, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'M':
			{
			alt8=7;
			}
			break;
		case 'S':
			{
			alt8=8;
			}
			break;
		case 'Y':
			{
			int LA8_6 = input.LA(2);
			if ( (LA8_6=='E') ) {
				int LA8_21 = input.LA(3);
				if ( (LA8_21=='A') ) {
					int LA8_28 = input.LA(4);
					if ( (LA8_28=='R') ) {
						int LA8_31 = input.LA(5);
						if ( (LA8_31=='S') ) {
							alt8=10;
						}

						else {
							alt8=9;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 28, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 8, 6, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt8=11;
			}
			break;
		case '\"':
			{
			alt8=12;
			}
			break;
		case '\'':
			{
			alt8=13;
			}
			break;
		case '0':
			{
			int LA8_10 = input.LA(2);
			if ( ((LA8_10 >= '0' && LA8_10 <= '9')) ) {
				alt8=15;
			}

			else {
				alt8=14;
			}

			}
			break;
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			int LA8_11 = input.LA(2);
			if ( ((LA8_11 >= '0' && LA8_11 <= '9')) ) {
				int LA8_24 = input.LA(3);
				if ( ((LA8_24 >= '0' && LA8_24 <= '9')) ) {
					int LA8_29 = input.LA(4);
					if ( ((LA8_29 >= '0' && LA8_29 <= '9')) ) {
						int LA8_32 = input.LA(5);
						if ( (LA8_32=='-') ) {
							alt8=15;
						}

						else {
							alt8=14;
						}

					}

					else {
						alt8=14;
					}

				}

				else {
					alt8=14;
				}

			}

			else {
				alt8=14;
			}

			}
			break;
		case 'N':
		case 'P':
			{
			alt8=16;
			}
			break;
		case '[':
			{
			alt8=17;
			}
			break;
		case ']':
			{
			alt8=18;
			}
			break;
		case '{':
			{
			alt8=19;
			}
			break;
		case '}':
			{
			alt8=20;
			}
			break;
		case ';':
			{
			alt8=21;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 8, 0, input);
			throw nvae;
		}
		switch (alt8) {
			case 1 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:10: T__19
				{
				mT__19(); 

				}
				break;
			case 2 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:16: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:22: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:28: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:34: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:40: T__24
				{
				mT__24(); 

				}
				break;
			case 7 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:46: T__25
				{
				mT__25(); 

				}
				break;
			case 8 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:52: T__26
				{
				mT__26(); 

				}
				break;
			case 9 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:58: T__27
				{
				mT__27(); 

				}
				break;
			case 10 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:64: T__28
				{
				mT__28(); 

				}
				break;
			case 11 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:70: WS
				{
				mWS(); 

				}
				break;
			case 12 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:73: STRING
				{
				mSTRING(); 

				}
				break;
			case 13 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:80: CHAR
				{
				mCHAR(); 

				}
				break;
			case 14 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:85: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:89: DATE
				{
				mDATE(); 

				}
				break;
			case 16 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:94: STATUS
				{
				mSTATUS(); 

				}
				break;
			case 17 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:101: OPEN_SQB
				{
				mOPEN_SQB(); 

				}
				break;
			case 18 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:110: CLOSE_SQB
				{
				mCLOSE_SQB(); 

				}
				break;
			case 19 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:120: OPEN_CUB
				{
				mOPEN_CUB(); 

				}
				break;
			case 20 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:129: CLOSE_CUB
				{
				mCLOSE_CUB(); 

				}
				break;
			case 21 :
				// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:1:139: DOTCOMMA
				{
				mDOTCOMMA(); 

				}
				break;

		}
	}



}
