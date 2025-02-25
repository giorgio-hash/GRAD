// $ANTLR 3.5.1 C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g 2025-02-24 19:40:48

	package compiler;
	import model.compiler.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class GRADParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "CLOSE_CUB", "CLOSE_SQB", 
		"DATE", "DOTCOMMA", "ERROR_TOKEN", "ESC_SEQ", "HEX_DIGIT", "INT", "OCTAL_ESC", 
		"OPEN_CUB", "OPEN_SQB", "STATUS", "STRING", "UNICODE_ESC", "WS", "'ADDRESS'", 
		"'BIRTHDATE:'", "'CFU'", "'CITY'", "'COUNTRY'", "'DAILY_HOURS:'", "'DATE'", 
		"'DEGREE:'", "'EMAIL:'", "'EXAM'", "'EXAMS:'", "'MILESTONE'", "'NAME:'", 
		"'NUMBER'", "'SERIAL:'", "'STATUS'", "'STREET'", "'STUDENT'", "'SURNAME:'", 
		"'UNIVERSITY'", "'YEAR'", "'YEARS:'", "'ZIP'"
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "setStatusRule", "startRule", "degreeRule", "setMilestoneRule", 
		"addressRule", "facultativeInfoRule", "yearRule", "studentRule", "universityRule", 
		"examRule"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public GRADParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public GRADParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public GRADParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return GRADParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g"; }


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



	// $ANTLR start "startRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:106:1: startRule : ( studentRule )? degreeRule ;
	public final void startRule() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "startRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:107:2: ( ( studentRule )? degreeRule )
			dbg.enterAlt(1);

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:107:4: ( studentRule )? degreeRule
			{
			dbg.location(107,4);
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:107:4: ( studentRule )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==37) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:107:5: studentRule
					{
					dbg.location(107,5);
					pushFollow(FOLLOW_studentRule_in_startRule492);
					studentRule();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(107,19);
			pushFollow(FOLLOW_degreeRule_in_startRule496);
			degreeRule();
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
		dbg.location(108, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "startRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "startRule"



	// $ANTLR start "studentRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:110:1: studentRule : 'STUDENT' OPEN_CUB 'NAME:' name= STRING 'SURNAME:' sur= STRING 'SERIAL:' serial= INT 'BIRTHDATE:' birthdate= DATE 'EMAIL:' email= STRING u= universityRule CLOSE_CUB ;
	public final void studentRule() throws RecognitionException {
		Token name=null;
		Token sur=null;
		Token serial=null;
		Token birthdate=null;
		Token email=null;
		University u =null;

		try { dbg.enterRule(getGrammarFileName(), "studentRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(110, 0);

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:111:2: ( 'STUDENT' OPEN_CUB 'NAME:' name= STRING 'SURNAME:' sur= STRING 'SERIAL:' serial= INT 'BIRTHDATE:' birthdate= DATE 'EMAIL:' email= STRING u= universityRule CLOSE_CUB )
			dbg.enterAlt(1);

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:111:4: 'STUDENT' OPEN_CUB 'NAME:' name= STRING 'SURNAME:' sur= STRING 'SERIAL:' serial= INT 'BIRTHDATE:' birthdate= DATE 'EMAIL:' email= STRING u= universityRule CLOSE_CUB
			{
			dbg.location(111,4);
			match(input,37,FOLLOW_37_in_studentRule508); dbg.location(111,14);
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_studentRule510); dbg.location(111,23);
			match(input,32,FOLLOW_32_in_studentRule512); dbg.location(111,35);
			name=(Token)match(input,STRING,FOLLOW_STRING_in_studentRule516); dbg.location(111,43);
			match(input,38,FOLLOW_38_in_studentRule518); dbg.location(111,57);
			sur=(Token)match(input,STRING,FOLLOW_STRING_in_studentRule522); dbg.location(112,4);
			match(input,34,FOLLOW_34_in_studentRule528); dbg.location(112,20);
			serial=(Token)match(input,INT,FOLLOW_INT_in_studentRule532); dbg.location(113,4);
			match(input,21,FOLLOW_21_in_studentRule537); dbg.location(113,26);
			birthdate=(Token)match(input,DATE,FOLLOW_DATE_in_studentRule541); dbg.location(114,4);
			match(input,28,FOLLOW_28_in_studentRule547); dbg.location(114,18);
			email=(Token)match(input,STRING,FOLLOW_STRING_in_studentRule551); dbg.location(115,5);
			pushFollow(FOLLOW_universityRule_in_studentRule559);
			u=universityRule();
			state._fsp--;
			dbg.location(115,21);
			h.createStudent(name,sur,serial,birthdate,email,u);dbg.location(116,4);
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_studentRule566); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(117, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "studentRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "studentRule"



	// $ANTLR start "universityRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:119:1: universityRule returns [University u] : 'UNIVERSITY' OPEN_CUB 'NAME:' uname= STRING a= addressRule CLOSE_CUB ;
	public final University universityRule() throws RecognitionException {
		University u = null;


		Token uname=null;
		Address a =null;

		try { dbg.enterRule(getGrammarFileName(), "universityRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(119, 0);

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:120:2: ( 'UNIVERSITY' OPEN_CUB 'NAME:' uname= STRING a= addressRule CLOSE_CUB )
			dbg.enterAlt(1);

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:120:4: 'UNIVERSITY' OPEN_CUB 'NAME:' uname= STRING a= addressRule CLOSE_CUB
			{
			dbg.location(120,4);
			match(input,39,FOLLOW_39_in_universityRule581); dbg.location(120,17);
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_universityRule583); dbg.location(120,26);
			match(input,32,FOLLOW_32_in_universityRule585); dbg.location(120,39);
			uname=(Token)match(input,STRING,FOLLOW_STRING_in_universityRule589); dbg.location(121,5);
			pushFollow(FOLLOW_addressRule_in_universityRule597);
			a=addressRule();
			state._fsp--;
			dbg.location(121,18);
			u=h.createUniversity(uname,a);dbg.location(122,4);
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_universityRule604); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(123, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "universityRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return u;
	}
	// $ANTLR end "universityRule"



	// $ANTLR start "addressRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:125:1: addressRule returns [Address a] : 'ADDRESS' OPEN_CUB 'STREET' street= STRING 'NUMBER' number= INT 'ZIP' zip= INT 'CITY' city= STRING 'COUNTRY' country= STRING CLOSE_CUB ;
	public final Address addressRule() throws RecognitionException {
		Address a = null;


		Token street=null;
		Token number=null;
		Token zip=null;
		Token city=null;
		Token country=null;

		try { dbg.enterRule(getGrammarFileName(), "addressRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:126:2: ( 'ADDRESS' OPEN_CUB 'STREET' street= STRING 'NUMBER' number= INT 'ZIP' zip= INT 'CITY' city= STRING 'COUNTRY' country= STRING CLOSE_CUB )
			dbg.enterAlt(1);

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:126:4: 'ADDRESS' OPEN_CUB 'STREET' street= STRING 'NUMBER' number= INT 'ZIP' zip= INT 'CITY' city= STRING 'COUNTRY' country= STRING CLOSE_CUB
			{
			dbg.location(126,4);
			match(input,20,FOLLOW_20_in_addressRule619); dbg.location(126,14);
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_addressRule621); dbg.location(126,23);
			match(input,36,FOLLOW_36_in_addressRule623); dbg.location(126,38);
			street=(Token)match(input,STRING,FOLLOW_STRING_in_addressRule627); dbg.location(127,4);
			match(input,33,FOLLOW_33_in_addressRule633); dbg.location(127,19);
			number=(Token)match(input,INT,FOLLOW_INT_in_addressRule637); dbg.location(128,4);
			match(input,42,FOLLOW_42_in_addressRule643); dbg.location(128,13);
			zip=(Token)match(input,INT,FOLLOW_INT_in_addressRule647); dbg.location(129,4);
			match(input,23,FOLLOW_23_in_addressRule652); dbg.location(129,15);
			city=(Token)match(input,STRING,FOLLOW_STRING_in_addressRule656); dbg.location(130,4);
			match(input,24,FOLLOW_24_in_addressRule662); dbg.location(130,21);
			country=(Token)match(input,STRING,FOLLOW_STRING_in_addressRule666); dbg.location(130,29);
			a=h.createAddress(street,number,zip,city,country);dbg.location(131,4);
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_addressRule673); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(132, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "addressRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return a;
	}
	// $ANTLR end "addressRule"


	public static class degreeRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "degreeRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:134:1: degreeRule : 'DEGREE:' deg= STRING 'DAILY_HOURS:' st= INT 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB ;
	public final GRADParser.degreeRule_return degreeRule() throws RecognitionException {
		GRADParser.degreeRule_return retval = new GRADParser.degreeRule_return();
		retval.start = input.LT(1);

		Token deg=null;
		Token st=null;
		Year y =null;

		try { dbg.enterRule(getGrammarFileName(), "degreeRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(134, 0);

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:135:2: ( 'DEGREE:' deg= STRING 'DAILY_HOURS:' st= INT 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB )
			dbg.enterAlt(1);

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:135:4: 'DEGREE:' deg= STRING 'DAILY_HOURS:' st= INT 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB
			{
			dbg.location(135,4);
			match(input,27,FOLLOW_27_in_degreeRule684); dbg.location(135,17);
			deg=(Token)match(input,STRING,FOLLOW_STRING_in_degreeRule688); dbg.location(135,25);
			h.createDegree(deg);dbg.location(135,49);
			match(input,25,FOLLOW_25_in_degreeRule692); dbg.location(135,66);
			st=(Token)match(input,INT,FOLLOW_INT_in_degreeRule696); dbg.location(135,71);
			h.setDailyStudyHours(st);dbg.location(135,100);
			match(input,41,FOLLOW_41_in_degreeRule700); dbg.location(135,109);
			match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_degreeRule702); dbg.location(135,118);
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:135:118: (y= yearRule )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==40) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:135:120: y= yearRule
					{
					dbg.location(135,121);
					pushFollow(FOLLOW_yearRule_in_degreeRule708);
					y=yearRule();
					state._fsp--;
					dbg.location(135,131);
					 if(y!=null)h.addYear(y); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt2++;
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(135,163);
			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_degreeRule715); dbg.location(135,173);
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
		dbg.location(136, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "degreeRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "degreeRule"



	// $ANTLR start "yearRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:138:1: yearRule returns [Year y] : yt= 'YEAR' OPEN_CUB 'EXAMS:' ex= OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB ;
	public final Year yearRule() throws RecognitionException {
		Year y = null;


		Token yt=null;
		Token ex=null;
		Exam e =null;

		try { dbg.enterRule(getGrammarFileName(), "yearRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(138, 0);

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:139:2: (yt= 'YEAR' OPEN_CUB 'EXAMS:' ex= OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB )
			dbg.enterAlt(1);

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:139:4: yt= 'YEAR' OPEN_CUB 'EXAMS:' ex= OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB
			{
			dbg.location(139,6);
			yt=(Token)match(input,40,FOLLOW_40_in_yearRule735); dbg.location(139,14);
			 y=h.createYear(); dbg.location(139,36);
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_yearRule739); dbg.location(139,45);
			match(input,30,FOLLOW_30_in_yearRule741); dbg.location(139,56);
			ex=(Token)match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_yearRule745); dbg.location(139,66);
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:139:66: (e= examRule DOTCOMMA )+
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==29) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:139:68: e= examRule DOTCOMMA
					{
					dbg.location(139,69);
					pushFollow(FOLLOW_examRule_in_yearRule751);
					e=examRule();
					state._fsp--;
					dbg.location(139,79);
					 if(e!=null)y.addExam(e); dbg.location(139,108);
					match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_yearRule755); 
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt3++;
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(139,119);
			y=h.checkYear(y,yt);dbg.location(139,143);
			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_yearRule761); dbg.location(139,153);
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_yearRule763); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(140, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "yearRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return y;
	}
	// $ANTLR end "yearRule"



	// $ANTLR start "examRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:143:1: examRule returns [Exam e] : 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE facultativeInfoRule[e] ;
	public final Exam examRule() throws RecognitionException {
		Exam e = null;


		Token nome=null;
		Token cfu=null;
		Token stringdate=null;

		try { dbg.enterRule(getGrammarFileName(), "examRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(143, 0);

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:144:2: ( 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE facultativeInfoRule[e] )
			dbg.enterAlt(1);

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:144:5: 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE facultativeInfoRule[e]
			{
			dbg.location(144,5);
			match(input,29,FOLLOW_29_in_examRule781); dbg.location(144,16);
			nome=(Token)match(input,STRING,FOLLOW_STRING_in_examRule785); dbg.location(144,24);
			match(input,22,FOLLOW_22_in_examRule787); dbg.location(144,33);
			cfu=(Token)match(input,INT,FOLLOW_INT_in_examRule791); dbg.location(144,38);
			match(input,26,FOLLOW_26_in_examRule793); dbg.location(144,55);
			stringdate=(Token)match(input,DATE,FOLLOW_DATE_in_examRule797); dbg.location(144,61);
			e=h.createExam(nome,cfu,stringdate);dbg.location(144,103);
			pushFollow(FOLLOW_facultativeInfoRule_in_examRule801);
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
		dbg.location(145, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "examRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return e;
	}
	// $ANTLR end "examRule"



	// $ANTLR start "facultativeInfoRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:147:1: facultativeInfoRule[Exam e] : ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )? ;
	public final void facultativeInfoRule(Exam e) throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "facultativeInfoRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(147, 0);

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:2: ( ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )? )
			dbg.enterAlt(1);

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:4: ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )?
			{
			dbg.location(148,4);
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:4: ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )?
			int alt6=3;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==31) ) {
				alt6=1;
			}
			else if ( (LA6_0==35) ) {
				alt6=2;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:5: setMilestoneRule[e] ( setStatusRule[e] )?
					{
					dbg.location(148,5);
					pushFollow(FOLLOW_setMilestoneRule_in_facultativeInfoRule816);
					setMilestoneRule(e);
					state._fsp--;
					dbg.location(148,25);
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:25: ( setStatusRule[e] )?
					int alt4=2;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					int LA4_0 = input.LA(1);
					if ( (LA4_0==35) ) {
						alt4=1;
					}
					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:26: setStatusRule[e]
							{
							dbg.location(148,26);
							pushFollow(FOLLOW_setStatusRule_in_facultativeInfoRule820);
							setStatusRule(e);
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(4);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:149:5: setStatusRule[e] ( setMilestoneRule[e] )?
					{
					dbg.location(149,5);
					pushFollow(FOLLOW_setStatusRule_in_facultativeInfoRule830);
					setStatusRule(e);
					state._fsp--;
					dbg.location(149,22);
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:149:22: ( setMilestoneRule[e] )?
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==31) ) {
						alt5=1;
					}
					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:149:23: setMilestoneRule[e]
							{
							dbg.location(149,23);
							pushFollow(FOLLOW_setMilestoneRule_in_facultativeInfoRule834);
							setMilestoneRule(e);
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(5);}

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(151, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "facultativeInfoRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "facultativeInfoRule"



	// $ANTLR start "setStatusRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:153:1: setStatusRule[Exam e] : 'STATUS' status= STATUS ;
	public final void setStatusRule(Exam e) throws RecognitionException {
		Token status=null;

		try { dbg.enterRule(getGrammarFileName(), "setStatusRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(153, 0);

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:154:2: ( 'STATUS' status= STATUS )
			dbg.enterAlt(1);

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:154:4: 'STATUS' status= STATUS
			{
			dbg.location(154,4);
			match(input,35,FOLLOW_35_in_setStatusRule856); dbg.location(154,19);
			status=(Token)match(input,STATUS,FOLLOW_STATUS_in_setStatusRule860); dbg.location(154,27);
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
		dbg.location(155, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "setStatusRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "setStatusRule"



	// $ANTLR start "setMilestoneRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:157:1: setMilestoneRule[Exam e] : 'MILESTONE' mil= STRING ;
	public final void setMilestoneRule(Exam e) throws RecognitionException {
		Token mil=null;

		try { dbg.enterRule(getGrammarFileName(), "setMilestoneRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(157, 0);

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:158:2: ( 'MILESTONE' mil= STRING )
			dbg.enterAlt(1);

			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:158:4: 'MILESTONE' mil= STRING
			{
			dbg.location(158,4);
			match(input,31,FOLLOW_31_in_setMilestoneRule875); dbg.location(158,19);
			mil=(Token)match(input,STRING,FOLLOW_STRING_in_setMilestoneRule879); dbg.location(158,27);
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
		dbg.location(159, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "setMilestoneRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "setMilestoneRule"

	// Delegated rules



	public static final BitSet FOLLOW_studentRule_in_startRule492 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_degreeRule_in_startRule496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_studentRule508 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_studentRule510 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_studentRule512 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_studentRule516 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_studentRule518 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_studentRule522 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_studentRule528 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_studentRule532 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_studentRule537 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_studentRule541 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_studentRule547 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_studentRule551 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_universityRule_in_studentRule559 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_studentRule566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_universityRule581 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_universityRule583 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_universityRule585 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_universityRule589 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_addressRule_in_universityRule597 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_universityRule604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_addressRule619 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_addressRule621 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_addressRule623 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_addressRule627 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_addressRule633 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_addressRule637 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_addressRule643 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_addressRule647 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_addressRule652 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_addressRule656 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_addressRule662 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_addressRule666 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_addressRule673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_degreeRule684 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_degreeRule688 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_degreeRule692 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_degreeRule696 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_degreeRule700 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_OPEN_SQB_in_degreeRule702 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_yearRule_in_degreeRule708 = new BitSet(new long[]{0x0000010000000040L});
	public static final BitSet FOLLOW_CLOSE_SQB_in_degreeRule715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_yearRule735 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_yearRule739 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_yearRule741 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_OPEN_SQB_in_yearRule745 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_examRule_in_yearRule751 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DOTCOMMA_in_yearRule755 = new BitSet(new long[]{0x0000000020000040L});
	public static final BitSet FOLLOW_CLOSE_SQB_in_yearRule761 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_yearRule763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_examRule781 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_examRule785 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_examRule787 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_examRule791 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_examRule793 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_examRule797 = new BitSet(new long[]{0x0000000880000000L});
	public static final BitSet FOLLOW_facultativeInfoRule_in_examRule801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setMilestoneRule_in_facultativeInfoRule816 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_setStatusRule_in_facultativeInfoRule820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setStatusRule_in_facultativeInfoRule830 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_setMilestoneRule_in_facultativeInfoRule834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_setStatusRule856 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STATUS_in_setStatusRule860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_setMilestoneRule875 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_setMilestoneRule879 = new BitSet(new long[]{0x0000000000000002L});
}
