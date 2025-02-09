// $ANTLR 3.5.1 C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g 2025-02-09 21:04:30

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
		"DATE", "DOTCOMMA", "ERROR_TOKEN", "ESC_SEQ", "HEX_DIGIT", "INT", "OCTAL_ESC", 
		"OPEN_CUB", "OPEN_SQB", "STATUS", "STRING", "UNICODE_ESC", "WS", "'CFU'", 
		"'DAILY_HOURS:'", "'DATE'", "'DEGREE:'", "'EXAM'", "'EXAMS:'", "'MILESTONE'", 
		"'STATUS'", "'YEAR'", "'YEARS:'"
	};
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


		SemanticHandler h = new SemanticHandler();
		
		  public void displayRecognitionError(String[] tokenNames,
	                                       RecognitionException e) {
			Token tk = input.LT(1);
			String hdr = getErrorHeader(e);
			String msg = getErrorMessage(e, tokenNames);
			h.handleError(tokenNames, tk, e, hdr, msg);
	  	}
	  	
	  	public SemanticHandler getHandler(){
	  		return h;
	  	}


	public static class degreeRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "degreeRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:106:1: degreeRule : 'DEGREE:' deg= STRING 'DAILY_HOURS:' st= INT 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB ;
	public final GRADParser.degreeRule_return degreeRule() throws RecognitionException {
		GRADParser.degreeRule_return retval = new GRADParser.degreeRule_return();
		retval.start = input.LT(1);

		Token deg=null;
		Token st=null;
		Year y =null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:107:2: ( 'DEGREE:' deg= STRING 'DAILY_HOURS:' st= INT 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:107:4: 'DEGREE:' deg= STRING 'DAILY_HOURS:' st= INT 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB
			{
			match(input,23,FOLLOW_23_in_degreeRule508); 
			deg=(Token)match(input,STRING,FOLLOW_STRING_in_degreeRule512); 
			h.createDegree(deg);
			match(input,21,FOLLOW_21_in_degreeRule516); 
			st=(Token)match(input,INT,FOLLOW_INT_in_degreeRule520); 
			h.setDailyStudyHours(st);
			match(input,29,FOLLOW_29_in_degreeRule524); 
			match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_degreeRule526); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:107:118: (y= yearRule )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==28) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:107:120: y= yearRule
					{
					pushFollow(FOLLOW_yearRule_in_degreeRule532);
					y=yearRule();
					state._fsp--;

					 if(y!=null)h.addYear(y); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_degreeRule539); 
			h.checkDegree(deg);
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "degreeRule"



	// $ANTLR start "yearRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:110:1: yearRule returns [Year y] : yt= 'YEAR' OPEN_CUB 'EXAMS:' ex= OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB ;
	public final Year yearRule() throws RecognitionException {
		Year y = null;


		Token yt=null;
		Token ex=null;
		Exam e =null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:111:2: (yt= 'YEAR' OPEN_CUB 'EXAMS:' ex= OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:111:4: yt= 'YEAR' OPEN_CUB 'EXAMS:' ex= OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB
			{
			yt=(Token)match(input,28,FOLLOW_28_in_yearRule559); 
			 y=h.createYear(); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_yearRule563); 
			match(input,25,FOLLOW_25_in_yearRule565); 
			ex=(Token)match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_yearRule569); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:111:66: (e= examRule DOTCOMMA )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==24) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:111:68: e= examRule DOTCOMMA
					{
					pushFollow(FOLLOW_examRule_in_yearRule575);
					e=examRule();
					state._fsp--;

					 if(e!=null)y.addExam(e); 
					match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_yearRule579); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			y=h.checkYear(y,yt);
			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_yearRule585); 
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_yearRule587); 
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
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:115:1: examRule returns [Exam e] : 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE facultativeInfoRule[e] ;
	public final Exam examRule() throws RecognitionException {
		Exam e = null;


		Token nome=null;
		Token cfu=null;
		Token stringdate=null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:116:2: ( 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE facultativeInfoRule[e] )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:116:5: 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE facultativeInfoRule[e]
			{
			match(input,24,FOLLOW_24_in_examRule605); 
			nome=(Token)match(input,STRING,FOLLOW_STRING_in_examRule609); 
			match(input,20,FOLLOW_20_in_examRule611); 
			cfu=(Token)match(input,INT,FOLLOW_INT_in_examRule615); 
			match(input,22,FOLLOW_22_in_examRule617); 
			stringdate=(Token)match(input,DATE,FOLLOW_DATE_in_examRule621); 
			e=h.createExam(nome,cfu,stringdate);
			pushFollow(FOLLOW_facultativeInfoRule_in_examRule625);
			facultativeInfoRule(e);
			state._fsp--;

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



	// $ANTLR start "facultativeInfoRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:119:1: facultativeInfoRule[Exam e] : ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )? ;
	public final void facultativeInfoRule(Exam e) throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:120:2: ( ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )? )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:120:4: ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )?
			{
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:120:4: ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )?
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==26) ) {
				alt5=1;
			}
			else if ( (LA5_0==27) ) {
				alt5=2;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:120:5: setMilestoneRule[e] ( setStatusRule[e] )?
					{
					pushFollow(FOLLOW_setMilestoneRule_in_facultativeInfoRule640);
					setMilestoneRule(e);
					state._fsp--;

					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:120:25: ( setStatusRule[e] )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==27) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:120:26: setStatusRule[e]
							{
							pushFollow(FOLLOW_setStatusRule_in_facultativeInfoRule644);
							setStatusRule(e);
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:121:5: setStatusRule[e] ( setMilestoneRule[e] )?
					{
					pushFollow(FOLLOW_setStatusRule_in_facultativeInfoRule654);
					setStatusRule(e);
					state._fsp--;

					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:121:22: ( setMilestoneRule[e] )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==26) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:121:23: setMilestoneRule[e]
							{
							pushFollow(FOLLOW_setMilestoneRule_in_facultativeInfoRule658);
							setMilestoneRule(e);
							state._fsp--;

							}
							break;

					}

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
	// $ANTLR end "facultativeInfoRule"



	// $ANTLR start "setStatusRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:125:1: setStatusRule[Exam e] : 'STATUS' status= STATUS ;
	public final void setStatusRule(Exam e) throws RecognitionException {
		Token status=null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:126:2: ( 'STATUS' status= STATUS )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:126:4: 'STATUS' status= STATUS
			{
			match(input,27,FOLLOW_27_in_setStatusRule680); 
			status=(Token)match(input,STATUS,FOLLOW_STATUS_in_setStatusRule684); 
			 if(e!=null)h.setExamStatus(e,status); 
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
	// $ANTLR end "setStatusRule"



	// $ANTLR start "setMilestoneRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:129:1: setMilestoneRule[Exam e] : 'MILESTONE' mil= STRING ;
	public final void setMilestoneRule(Exam e) throws RecognitionException {
		Token mil=null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:130:2: ( 'MILESTONE' mil= STRING )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\myCompilerPackage\\GRAD.g:130:4: 'MILESTONE' mil= STRING
			{
			match(input,26,FOLLOW_26_in_setMilestoneRule699); 
			mil=(Token)match(input,STRING,FOLLOW_STRING_in_setMilestoneRule703); 
			if(e!=null)h.assignExamToMilestone(e,mil);
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
	// $ANTLR end "setMilestoneRule"

	// Delegated rules



	public static final BitSet FOLLOW_23_in_degreeRule508 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_degreeRule512 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_degreeRule516 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_degreeRule520 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_degreeRule524 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_OPEN_SQB_in_degreeRule526 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_yearRule_in_degreeRule532 = new BitSet(new long[]{0x0000000010000040L});
	public static final BitSet FOLLOW_CLOSE_SQB_in_degreeRule539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_yearRule559 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_yearRule563 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_yearRule565 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_OPEN_SQB_in_yearRule569 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_examRule_in_yearRule575 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DOTCOMMA_in_yearRule579 = new BitSet(new long[]{0x0000000001000040L});
	public static final BitSet FOLLOW_CLOSE_SQB_in_yearRule585 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_yearRule587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_examRule605 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_examRule609 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_examRule611 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_examRule615 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_examRule617 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_examRule621 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_facultativeInfoRule_in_examRule625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setMilestoneRule_in_facultativeInfoRule640 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_setStatusRule_in_facultativeInfoRule644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setStatusRule_in_facultativeInfoRule654 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_setMilestoneRule_in_facultativeInfoRule658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_setStatusRule680 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STATUS_in_setStatusRule684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_setMilestoneRule699 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_setMilestoneRule703 = new BitSet(new long[]{0x0000000000000002L});
}
