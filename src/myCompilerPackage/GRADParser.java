// $ANTLR 3.5.1 C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g 2025-02-04 12:20:14

	package myCompilerPackage;
	import myCompilerPackage.util.*;


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
		"'DEGREE:'", "'EXAM'", "'EXAMS:'", "'MILESTONE'", "'STATUS'", "'YEAR'", 
		"'YEARS:'"
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
	public static final int T__27=27;
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


		SemanticHandler h = SemanticHandler.getHandler();
		int years=0;



	// $ANTLR start "degreeRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:81:1: degreeRule : 'DEGREE:' deg= STRING 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB ;
	public final void degreeRule() throws RecognitionException {
		Token deg=null;
		Year y =null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:82:2: ( 'DEGREE:' deg= STRING 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:82:4: 'DEGREE:' deg= STRING 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB
			{
			match(input,21,FOLLOW_21_in_degreeRule523); 
			deg=(Token)match(input,STRING,FOLLOW_STRING_in_degreeRule527); 
			h.createDegree(deg);
			match(input,27,FOLLOW_27_in_degreeRule531); 
			match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_degreeRule533); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:82:67: (y= yearRule )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==26) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:82:69: y= yearRule
					{
					pushFollow(FOLLOW_yearRule_in_degreeRule539);
					y=yearRule();
					state._fsp--;

					 h.addYear(y); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_degreeRule546); 
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
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:85:1: yearRule returns [Year y] : 'YEAR' OPEN_CUB 'EXAMS:' OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB ;
	public final Year yearRule() throws RecognitionException {
		Year y = null;


		Exam e =null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:86:2: ( 'YEAR' OPEN_CUB 'EXAMS:' OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:86:4: 'YEAR' OPEN_CUB 'EXAMS:' OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB
			{
			match(input,26,FOLLOW_26_in_yearRule562); 
			 y=h.createYear(); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_yearRule566); 
			match(input,23,FOLLOW_23_in_yearRule568); 
			match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_yearRule570); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:86:60: (e= examRule DOTCOMMA )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==22) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:86:62: e= examRule DOTCOMMA
					{
					pushFollow(FOLLOW_examRule_in_yearRule576);
					e=examRule();
					state._fsp--;

					 y.addExam(e); 
					match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_yearRule580); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_yearRule584); 
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_yearRule586); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return y;
	}
	// $ANTLR end "yearRule"



	// $ANTLR start "examRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:90:1: examRule returns [Exam e] : 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE ( 'STATUS' status= STATUS )? ( 'MILESTONE' mil= STRING )? ;
	public final Exam examRule() throws RecognitionException {
		Exam e = null;


		Token nome=null;
		Token cfu=null;
		Token stringdate=null;
		Token status=null;
		Token mil=null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:91:2: ( 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE ( 'STATUS' status= STATUS )? ( 'MILESTONE' mil= STRING )? )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:91:5: 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE ( 'STATUS' status= STATUS )? ( 'MILESTONE' mil= STRING )?
			{
			match(input,22,FOLLOW_22_in_examRule604); 
			nome=(Token)match(input,STRING,FOLLOW_STRING_in_examRule608); 
			match(input,19,FOLLOW_19_in_examRule610); 
			cfu=(Token)match(input,INT,FOLLOW_INT_in_examRule614); 
			match(input,20,FOLLOW_20_in_examRule616); 
			stringdate=(Token)match(input,DATE,FOLLOW_DATE_in_examRule620); 
			e=h.createExam(nome,cfu,stringdate);
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:91:103: ( 'STATUS' status= STATUS )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==25) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:91:104: 'STATUS' status= STATUS
					{
					match(input,25,FOLLOW_25_in_examRule625); 
					status=(Token)match(input,STATUS,FOLLOW_STATUS_in_examRule629); 
					h.setExamStatus(e,status); 
					}
					break;

			}

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:91:160: ( 'MILESTONE' mil= STRING )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==24) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:91:161: 'MILESTONE' mil= STRING
					{
					match(input,24,FOLLOW_24_in_examRule636); 
					mil=(Token)match(input,STRING,FOLLOW_STRING_in_examRule640); 
					h.assignExamToMilestone(e,mil);
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
		return e;
	}
	// $ANTLR end "examRule"

	// Delegated rules



	public static final BitSet FOLLOW_21_in_degreeRule523 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_degreeRule527 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_degreeRule531 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_SQB_in_degreeRule533 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_yearRule_in_degreeRule539 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_CLOSE_SQB_in_degreeRule546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_yearRule562 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_yearRule566 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_yearRule568 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_SQB_in_yearRule570 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_examRule_in_yearRule576 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DOTCOMMA_in_yearRule580 = new BitSet(new long[]{0x0000000000400040L});
	public static final BitSet FOLLOW_CLOSE_SQB_in_yearRule584 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_yearRule586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_examRule604 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_examRule608 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_examRule610 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_examRule614 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_examRule616 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_examRule620 = new BitSet(new long[]{0x0000000003000002L});
	public static final BitSet FOLLOW_25_in_examRule625 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_STATUS_in_examRule629 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_examRule636 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_examRule640 = new BitSet(new long[]{0x0000000000000002L});
}
