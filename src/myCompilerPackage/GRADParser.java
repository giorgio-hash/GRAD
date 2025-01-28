// $ANTLR 3.5.1 C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g 2025-01-28 14:20:05

	package myCompilerPackage;
	//import myCompilerPackage.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GRADParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "CLOSE_CUB", "CLOSE_SQB", 
		"DATE", "DOTCOMMA", "ESC_SEQ", "HEX_DIGIT", "INT", "OCTAL_ESC", "OPEN_CUB", 
		"OPEN_SQB", "STATUS", "STRING", "UNICODE_ESC", "WS", "'CFU'", "'DATE'", 
		"'DEGREE:'", "'EXAM'", "'EXAMS:'", "'STATUS'", "'YEAR'", "'YEARS:'"
	};
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GRADParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GRADParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GRADParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g"; }


		//SemanticHandler h = SemanticHandler.getHandler();



	// $ANTLR start "degreeRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:81:1: degreeRule : 'DEGREE:' STRING 'YEARS:' OPEN_SQB ( yearRule )+ CLOSE_SQB ;
	public final void degreeRule() throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:82:2: ( 'DEGREE:' STRING 'YEARS:' OPEN_SQB ( yearRule )+ CLOSE_SQB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:82:4: 'DEGREE:' STRING 'YEARS:' OPEN_SQB ( yearRule )+ CLOSE_SQB
			{
			match(input,21,FOLLOW_21_in_degreeRule479); 
			match(input,STRING,FOLLOW_STRING_in_degreeRule481); 
			match(input,26,FOLLOW_26_in_degreeRule483); 
			match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_degreeRule485); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:82:39: ( yearRule )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==25) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:82:40: yearRule
					{
					pushFollow(FOLLOW_yearRule_in_degreeRule488);
					yearRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_degreeRule492); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "degreeRule"



	// $ANTLR start "yearRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:84:1: yearRule : 'YEAR' INT OPEN_CUB 'EXAMS:' OPEN_SQB examsArgListRule CLOSE_SQB CLOSE_CUB ;
	public final void yearRule() throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:85:2: ( 'YEAR' INT OPEN_CUB 'EXAMS:' OPEN_SQB examsArgListRule CLOSE_SQB CLOSE_CUB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:85:4: 'YEAR' INT OPEN_CUB 'EXAMS:' OPEN_SQB examsArgListRule CLOSE_SQB CLOSE_CUB
			{
			match(input,25,FOLLOW_25_in_yearRule502); 
			match(input,INT,FOLLOW_INT_in_yearRule504); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_yearRule506); 
			match(input,23,FOLLOW_23_in_yearRule508); 
			match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_yearRule510); 
			pushFollow(FOLLOW_examsArgListRule_in_yearRule512);
			examsArgListRule();
			state._fsp--;

			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_yearRule514); 
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_yearRule516); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "yearRule"



	// $ANTLR start "examsArgListRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:87:1: examsArgListRule : examRule DOTCOMMA ( examRule DOTCOMMA )* ;
	public final void examsArgListRule() throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:88:2: ( examRule DOTCOMMA ( examRule DOTCOMMA )* )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:88:4: examRule DOTCOMMA ( examRule DOTCOMMA )*
			{
			pushFollow(FOLLOW_examRule_in_examsArgListRule526);
			examRule();
			state._fsp--;

			match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_examsArgListRule528); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:88:22: ( examRule DOTCOMMA )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==22) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:88:23: examRule DOTCOMMA
					{
					pushFollow(FOLLOW_examRule_in_examsArgListRule531);
					examRule();
					state._fsp--;

					match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_examsArgListRule533); 
					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "examsArgListRule"



	// $ANTLR start "examRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:91:1: examRule : 'EXAM' STRING 'CFU' INT 'DATE' DATE ( 'STATUS' STATUS )? ;
	public final void examRule() throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:92:2: ( 'EXAM' STRING 'CFU' INT 'DATE' DATE ( 'STATUS' STATUS )? )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:92:5: 'EXAM' STRING 'CFU' INT 'DATE' DATE ( 'STATUS' STATUS )?
			{
			match(input,22,FOLLOW_22_in_examRule547); 
			match(input,STRING,FOLLOW_STRING_in_examRule549); 
			match(input,19,FOLLOW_19_in_examRule551); 
			match(input,INT,FOLLOW_INT_in_examRule553); 
			match(input,20,FOLLOW_20_in_examRule555); 
			match(input,DATE,FOLLOW_DATE_in_examRule557); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:92:41: ( 'STATUS' STATUS )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==24) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:92:42: 'STATUS' STATUS
					{
					match(input,24,FOLLOW_24_in_examRule560); 
					match(input,STATUS,FOLLOW_STATUS_in_examRule562); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "examRule"

	// Delegated rules



	public static final BitSet FOLLOW_21_in_degreeRule479 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_degreeRule481 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_degreeRule483 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_SQB_in_degreeRule485 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_yearRule_in_degreeRule488 = new BitSet(new long[]{0x0000000002000040L});
	public static final BitSet FOLLOW_CLOSE_SQB_in_degreeRule492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_yearRule502 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_yearRule504 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_yearRule506 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_yearRule508 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_SQB_in_yearRule510 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_examsArgListRule_in_yearRule512 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLOSE_SQB_in_yearRule514 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_yearRule516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_examRule_in_examsArgListRule526 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DOTCOMMA_in_examsArgListRule528 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_examRule_in_examsArgListRule531 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DOTCOMMA_in_examsArgListRule533 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_examRule547 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_examRule549 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_examRule551 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_examRule553 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_examRule555 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_examRule557 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_examRule560 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_STATUS_in_examRule562 = new BitSet(new long[]{0x0000000000000002L});
}
