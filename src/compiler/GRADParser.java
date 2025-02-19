// $ANTLR 3.5.1 C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g 2025-02-19 15:29:59

	package compiler;
	import model.compiler.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GRADParser extends Parser {
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


	public GRADParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GRADParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
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



	// $ANTLR start "programRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:105:1: programRule : ( studentRule )? degreeRule ;
	public final void programRule() throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:106:2: ( ( studentRule )? degreeRule )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:106:4: ( studentRule )? degreeRule
			{
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:106:4: ( studentRule )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==37) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:106:5: studentRule
					{
					pushFollow(FOLLOW_studentRule_in_programRule509);
					studentRule();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_degreeRule_in_programRule513);
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
	}
	// $ANTLR end "programRule"



	// $ANTLR start "studentRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:109:1: studentRule : 'STUDENT' OPEN_CUB 'NAME:' name= STRING 'SURNAME:' sur= STRING 'SERIAL:' serial= INT 'BIRTHDATE:' birthdate= DATE 'EMAIL:' email= STRING u= universityRule CLOSE_CUB ;
	public final void studentRule() throws RecognitionException {
		Token name=null;
		Token sur=null;
		Token serial=null;
		Token birthdate=null;
		Token email=null;
		University u =null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:110:2: ( 'STUDENT' OPEN_CUB 'NAME:' name= STRING 'SURNAME:' sur= STRING 'SERIAL:' serial= INT 'BIRTHDATE:' birthdate= DATE 'EMAIL:' email= STRING u= universityRule CLOSE_CUB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:110:4: 'STUDENT' OPEN_CUB 'NAME:' name= STRING 'SURNAME:' sur= STRING 'SERIAL:' serial= INT 'BIRTHDATE:' birthdate= DATE 'EMAIL:' email= STRING u= universityRule CLOSE_CUB
			{
			match(input,37,FOLLOW_37_in_studentRule524); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_studentRule526); 
			match(input,32,FOLLOW_32_in_studentRule528); 
			name=(Token)match(input,STRING,FOLLOW_STRING_in_studentRule532); 
			match(input,38,FOLLOW_38_in_studentRule534); 
			sur=(Token)match(input,STRING,FOLLOW_STRING_in_studentRule538); 
			match(input,34,FOLLOW_34_in_studentRule544); 
			serial=(Token)match(input,INT,FOLLOW_INT_in_studentRule548); 
			match(input,21,FOLLOW_21_in_studentRule553); 
			birthdate=(Token)match(input,DATE,FOLLOW_DATE_in_studentRule557); 
			match(input,28,FOLLOW_28_in_studentRule563); 
			email=(Token)match(input,STRING,FOLLOW_STRING_in_studentRule567); 
			pushFollow(FOLLOW_universityRule_in_studentRule575);
			u=universityRule();
			state._fsp--;

			h.createStudent(name,sur,serial,birthdate,email,u);
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_studentRule582); 
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
	// $ANTLR end "studentRule"



	// $ANTLR start "universityRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:118:1: universityRule returns [University u] : 'UNIVERSITY' OPEN_CUB 'NAME:' uname= STRING a= addressRule CLOSE_CUB ;
	public final University universityRule() throws RecognitionException {
		University u = null;


		Token uname=null;
		Address a =null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:119:2: ( 'UNIVERSITY' OPEN_CUB 'NAME:' uname= STRING a= addressRule CLOSE_CUB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:119:4: 'UNIVERSITY' OPEN_CUB 'NAME:' uname= STRING a= addressRule CLOSE_CUB
			{
			match(input,39,FOLLOW_39_in_universityRule597); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_universityRule599); 
			match(input,32,FOLLOW_32_in_universityRule601); 
			uname=(Token)match(input,STRING,FOLLOW_STRING_in_universityRule605); 
			pushFollow(FOLLOW_addressRule_in_universityRule613);
			a=addressRule();
			state._fsp--;

			u=h.createUniversity(uname,a);
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_universityRule620); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return u;
	}
	// $ANTLR end "universityRule"



	// $ANTLR start "addressRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:124:1: addressRule returns [Address a] : 'ADDRESS' OPEN_CUB 'STREET' street= STRING 'NUMBER' number= INT 'ZIP' zip= INT 'CITY' city= STRING 'COUNTRY' country= STRING CLOSE_CUB ;
	public final Address addressRule() throws RecognitionException {
		Address a = null;


		Token street=null;
		Token number=null;
		Token zip=null;
		Token city=null;
		Token country=null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:125:2: ( 'ADDRESS' OPEN_CUB 'STREET' street= STRING 'NUMBER' number= INT 'ZIP' zip= INT 'CITY' city= STRING 'COUNTRY' country= STRING CLOSE_CUB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:125:4: 'ADDRESS' OPEN_CUB 'STREET' street= STRING 'NUMBER' number= INT 'ZIP' zip= INT 'CITY' city= STRING 'COUNTRY' country= STRING CLOSE_CUB
			{
			match(input,20,FOLLOW_20_in_addressRule635); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_addressRule637); 
			match(input,36,FOLLOW_36_in_addressRule639); 
			street=(Token)match(input,STRING,FOLLOW_STRING_in_addressRule643); 
			match(input,33,FOLLOW_33_in_addressRule649); 
			number=(Token)match(input,INT,FOLLOW_INT_in_addressRule653); 
			match(input,42,FOLLOW_42_in_addressRule659); 
			zip=(Token)match(input,INT,FOLLOW_INT_in_addressRule663); 
			match(input,23,FOLLOW_23_in_addressRule669); 
			city=(Token)match(input,STRING,FOLLOW_STRING_in_addressRule673); 
			match(input,24,FOLLOW_24_in_addressRule679); 
			country=(Token)match(input,STRING,FOLLOW_STRING_in_addressRule683); 
			a=h.createAddress(street,number,zip,city,country);
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_addressRule690); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
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

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:135:2: ( 'DEGREE:' deg= STRING 'DAILY_HOURS:' st= INT 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:135:4: 'DEGREE:' deg= STRING 'DAILY_HOURS:' st= INT 'YEARS:' OPEN_SQB (y= yearRule )+ CLOSE_SQB
			{
			match(input,27,FOLLOW_27_in_degreeRule702); 
			deg=(Token)match(input,STRING,FOLLOW_STRING_in_degreeRule706); 
			h.createDegree(deg);
			match(input,25,FOLLOW_25_in_degreeRule710); 
			st=(Token)match(input,INT,FOLLOW_INT_in_degreeRule714); 
			h.setDailyStudyHours(st);
			match(input,41,FOLLOW_41_in_degreeRule718); 
			match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_degreeRule720); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:135:118: (y= yearRule )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==40) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:135:120: y= yearRule
					{
					pushFollow(FOLLOW_yearRule_in_degreeRule726);
					y=yearRule();
					state._fsp--;

					 if(y!=null)h.addYear(y); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_degreeRule733); 
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
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:138:1: yearRule returns [Year y] : yt= 'YEAR' OPEN_CUB 'EXAMS:' ex= OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB ;
	public final Year yearRule() throws RecognitionException {
		Year y = null;


		Token yt=null;
		Token ex=null;
		Exam e =null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:139:2: (yt= 'YEAR' OPEN_CUB 'EXAMS:' ex= OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:139:4: yt= 'YEAR' OPEN_CUB 'EXAMS:' ex= OPEN_SQB (e= examRule DOTCOMMA )+ CLOSE_SQB CLOSE_CUB
			{
			yt=(Token)match(input,40,FOLLOW_40_in_yearRule753); 
			 y=h.createYear(); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_yearRule757); 
			match(input,30,FOLLOW_30_in_yearRule759); 
			ex=(Token)match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_yearRule763); 
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:139:66: (e= examRule DOTCOMMA )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==29) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:139:68: e= examRule DOTCOMMA
					{
					pushFollow(FOLLOW_examRule_in_yearRule769);
					e=examRule();
					state._fsp--;

					 if(e!=null)y.addExam(e); 
					match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_yearRule773); 
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			y=h.checkYear(y,yt);
			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_yearRule779); 
			match(input,CLOSE_CUB,FOLLOW_CLOSE_CUB_in_yearRule781); 
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
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:143:1: examRule returns [Exam e] : 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE facultativeInfoRule[e] ;
	public final Exam examRule() throws RecognitionException {
		Exam e = null;


		Token nome=null;
		Token cfu=null;
		Token stringdate=null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:144:2: ( 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE facultativeInfoRule[e] )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:144:5: 'EXAM' nome= STRING 'CFU' cfu= INT 'DATE' stringdate= DATE facultativeInfoRule[e]
			{
			match(input,29,FOLLOW_29_in_examRule799); 
			nome=(Token)match(input,STRING,FOLLOW_STRING_in_examRule803); 
			match(input,22,FOLLOW_22_in_examRule805); 
			cfu=(Token)match(input,INT,FOLLOW_INT_in_examRule809); 
			match(input,26,FOLLOW_26_in_examRule811); 
			stringdate=(Token)match(input,DATE,FOLLOW_DATE_in_examRule815); 
			e=h.createExam(nome,cfu,stringdate);
			pushFollow(FOLLOW_facultativeInfoRule_in_examRule819);
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
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:147:1: facultativeInfoRule[Exam e] : ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )? ;
	public final void facultativeInfoRule(Exam e) throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:2: ( ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )? )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:4: ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )?
			{
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:4: ( setMilestoneRule[e] ( setStatusRule[e] )? | setStatusRule[e] ( setMilestoneRule[e] )? )?
			int alt6=3;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==31) ) {
				alt6=1;
			}
			else if ( (LA6_0==35) ) {
				alt6=2;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:5: setMilestoneRule[e] ( setStatusRule[e] )?
					{
					pushFollow(FOLLOW_setMilestoneRule_in_facultativeInfoRule834);
					setMilestoneRule(e);
					state._fsp--;

					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:25: ( setStatusRule[e] )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==35) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:148:26: setStatusRule[e]
							{
							pushFollow(FOLLOW_setStatusRule_in_facultativeInfoRule838);
							setStatusRule(e);
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:149:5: setStatusRule[e] ( setMilestoneRule[e] )?
					{
					pushFollow(FOLLOW_setStatusRule_in_facultativeInfoRule848);
					setStatusRule(e);
					state._fsp--;

					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:149:22: ( setMilestoneRule[e] )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==31) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:149:23: setMilestoneRule[e]
							{
							pushFollow(FOLLOW_setMilestoneRule_in_facultativeInfoRule852);
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
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:153:1: setStatusRule[Exam e] : 'STATUS' status= STATUS ;
	public final void setStatusRule(Exam e) throws RecognitionException {
		Token status=null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:154:2: ( 'STATUS' status= STATUS )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:154:4: 'STATUS' status= STATUS
			{
			match(input,35,FOLLOW_35_in_setStatusRule874); 
			status=(Token)match(input,STATUS,FOLLOW_STATUS_in_setStatusRule878); 
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
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:157:1: setMilestoneRule[Exam e] : 'MILESTONE' mil= STRING ;
	public final void setMilestoneRule(Exam e) throws RecognitionException {
		Token mil=null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:158:2: ( 'MILESTONE' mil= STRING )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:158:4: 'MILESTONE' mil= STRING
			{
			match(input,31,FOLLOW_31_in_setMilestoneRule893); 
			mil=(Token)match(input,STRING,FOLLOW_STRING_in_setMilestoneRule897); 
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



	public static final BitSet FOLLOW_studentRule_in_programRule509 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_degreeRule_in_programRule513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_studentRule524 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_studentRule526 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_studentRule528 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_studentRule532 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_studentRule534 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_studentRule538 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_studentRule544 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_studentRule548 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_studentRule553 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_studentRule557 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_studentRule563 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_studentRule567 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_universityRule_in_studentRule575 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_studentRule582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_universityRule597 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_universityRule599 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_universityRule601 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_universityRule605 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_addressRule_in_universityRule613 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_universityRule620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_addressRule635 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_addressRule637 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_addressRule639 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_addressRule643 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_addressRule649 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_addressRule653 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_addressRule659 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_addressRule663 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_addressRule669 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_addressRule673 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_addressRule679 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_addressRule683 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_addressRule690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_degreeRule702 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_degreeRule706 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_degreeRule710 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_degreeRule714 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_degreeRule718 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_OPEN_SQB_in_degreeRule720 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_yearRule_in_degreeRule726 = new BitSet(new long[]{0x0000010000000040L});
	public static final BitSet FOLLOW_CLOSE_SQB_in_degreeRule733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_yearRule753 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_CUB_in_yearRule757 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_yearRule759 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_OPEN_SQB_in_yearRule763 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_examRule_in_yearRule769 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DOTCOMMA_in_yearRule773 = new BitSet(new long[]{0x0000000020000040L});
	public static final BitSet FOLLOW_CLOSE_SQB_in_yearRule779 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_CUB_in_yearRule781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_examRule799 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_examRule803 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_examRule805 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_examRule809 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_examRule811 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_examRule815 = new BitSet(new long[]{0x0000000880000000L});
	public static final BitSet FOLLOW_facultativeInfoRule_in_examRule819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setMilestoneRule_in_facultativeInfoRule834 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_setStatusRule_in_facultativeInfoRule838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setStatusRule_in_facultativeInfoRule848 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_setMilestoneRule_in_facultativeInfoRule852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_setStatusRule874 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STATUS_in_setStatusRule878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_setMilestoneRule893 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_setMilestoneRule897 = new BitSet(new long[]{0x0000000000000002L});
}
