// $ANTLR 3.5.1 C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g 2025-02-19 17:34:44

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



	// $ANTLR start "startRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:106:1: startRule : ( studentRule )? degreeRule ;
	public final void startRule() throws RecognitionException {
		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:107:2: ( ( studentRule )? degreeRule )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:107:4: ( studentRule )? degreeRule
			{
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:107:4: ( studentRule )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==37) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:107:5: studentRule
					{
					pushFollow(FOLLOW_studentRule_in_startRule492);
					studentRule();
					state._fsp--;

					}
					break;

			}

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

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:111:2: ( 'STUDENT' OPEN_CUB 'NAME:' name= STRING 'SURNAME:' sur= STRING 'SERIAL:' serial= INT 'BIRTHDATE:' birthdate= DATE 'EMAIL:' email= STRING u= universityRule CLOSE_CUB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:111:4: 'STUDENT' OPEN_CUB 'NAME:' name= STRING 'SURNAME:' sur= STRING 'SERIAL:' serial= INT 'BIRTHDATE:' birthdate= DATE 'EMAIL:' email= STRING u= universityRule CLOSE_CUB
			{
			match(input,37,FOLLOW_37_in_studentRule508); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_studentRule510); 
			match(input,32,FOLLOW_32_in_studentRule512); 
			name=(Token)match(input,STRING,FOLLOW_STRING_in_studentRule516); 
			match(input,38,FOLLOW_38_in_studentRule518); 
			sur=(Token)match(input,STRING,FOLLOW_STRING_in_studentRule522); 
			match(input,34,FOLLOW_34_in_studentRule528); 
			serial=(Token)match(input,INT,FOLLOW_INT_in_studentRule532); 
			match(input,21,FOLLOW_21_in_studentRule537); 
			birthdate=(Token)match(input,DATE,FOLLOW_DATE_in_studentRule541); 
			match(input,28,FOLLOW_28_in_studentRule547); 
			email=(Token)match(input,STRING,FOLLOW_STRING_in_studentRule551); 
			pushFollow(FOLLOW_universityRule_in_studentRule559);
			u=universityRule();
			state._fsp--;

			h.createStudent(name,sur,serial,birthdate,email,u);
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
	}
	// $ANTLR end "studentRule"



	// $ANTLR start "universityRule"
	// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:119:1: universityRule returns [University u] : 'UNIVERSITY' OPEN_CUB 'NAME:' uname= STRING a= addressRule CLOSE_CUB ;
	public final University universityRule() throws RecognitionException {
		University u = null;


		Token uname=null;
		Address a =null;

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:120:2: ( 'UNIVERSITY' OPEN_CUB 'NAME:' uname= STRING a= addressRule CLOSE_CUB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:120:4: 'UNIVERSITY' OPEN_CUB 'NAME:' uname= STRING a= addressRule CLOSE_CUB
			{
			match(input,39,FOLLOW_39_in_universityRule581); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_universityRule583); 
			match(input,32,FOLLOW_32_in_universityRule585); 
			uname=(Token)match(input,STRING,FOLLOW_STRING_in_universityRule589); 
			pushFollow(FOLLOW_addressRule_in_universityRule597);
			a=addressRule();
			state._fsp--;

			u=h.createUniversity(uname,a);
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

		try {
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:126:2: ( 'ADDRESS' OPEN_CUB 'STREET' street= STRING 'NUMBER' number= INT 'ZIP' zip= INT 'CITY' city= STRING 'COUNTRY' country= STRING CLOSE_CUB )
			// C:\\Users\\gchir\\OneDrive\\Desktop\\uni\\linguaggi compilatori\\esercizi\\GRAD\\src\\compiler\\GRAD.g:126:4: 'ADDRESS' OPEN_CUB 'STREET' street= STRING 'NUMBER' number= INT 'ZIP' zip= INT 'CITY' city= STRING 'COUNTRY' country= STRING CLOSE_CUB
			{
			match(input,20,FOLLOW_20_in_addressRule619); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_addressRule621); 
			match(input,36,FOLLOW_36_in_addressRule623); 
			street=(Token)match(input,STRING,FOLLOW_STRING_in_addressRule627); 
			match(input,33,FOLLOW_33_in_addressRule633); 
			number=(Token)match(input,INT,FOLLOW_INT_in_addressRule637); 
			match(input,42,FOLLOW_42_in_addressRule643); 
			zip=(Token)match(input,INT,FOLLOW_INT_in_addressRule647); 
			match(input,23,FOLLOW_23_in_addressRule652); 
			city=(Token)match(input,STRING,FOLLOW_STRING_in_addressRule656); 
			match(input,24,FOLLOW_24_in_addressRule662); 
			country=(Token)match(input,STRING,FOLLOW_STRING_in_addressRule666); 
			a=h.createAddress(street,number,zip,city,country);
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
			match(input,27,FOLLOW_27_in_degreeRule684); 
			deg=(Token)match(input,STRING,FOLLOW_STRING_in_degreeRule688); 
			h.createDegree(deg);
			match(input,25,FOLLOW_25_in_degreeRule692); 
			st=(Token)match(input,INT,FOLLOW_INT_in_degreeRule696); 
			h.setDailyStudyHours(st);
			match(input,41,FOLLOW_41_in_degreeRule700); 
			match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_degreeRule702); 
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
					pushFollow(FOLLOW_yearRule_in_degreeRule708);
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

			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_degreeRule715); 
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
			yt=(Token)match(input,40,FOLLOW_40_in_yearRule735); 
			 y=h.createYear(); 
			match(input,OPEN_CUB,FOLLOW_OPEN_CUB_in_yearRule739); 
			match(input,30,FOLLOW_30_in_yearRule741); 
			ex=(Token)match(input,OPEN_SQB,FOLLOW_OPEN_SQB_in_yearRule745); 
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
					pushFollow(FOLLOW_examRule_in_yearRule751);
					e=examRule();
					state._fsp--;

					 if(e!=null)y.addExam(e); 
					match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_yearRule755); 
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
			match(input,CLOSE_SQB,FOLLOW_CLOSE_SQB_in_yearRule761); 
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
			match(input,29,FOLLOW_29_in_examRule781); 
			nome=(Token)match(input,STRING,FOLLOW_STRING_in_examRule785); 
			match(input,22,FOLLOW_22_in_examRule787); 
			cfu=(Token)match(input,INT,FOLLOW_INT_in_examRule791); 
			match(input,26,FOLLOW_26_in_examRule793); 
			stringdate=(Token)match(input,DATE,FOLLOW_DATE_in_examRule797); 
			e=h.createExam(nome,cfu,stringdate);
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
					pushFollow(FOLLOW_setMilestoneRule_in_facultativeInfoRule816);
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
							pushFollow(FOLLOW_setStatusRule_in_facultativeInfoRule820);
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
					pushFollow(FOLLOW_setStatusRule_in_facultativeInfoRule830);
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
							pushFollow(FOLLOW_setMilestoneRule_in_facultativeInfoRule834);
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
			match(input,35,FOLLOW_35_in_setStatusRule856); 
			status=(Token)match(input,STATUS,FOLLOW_STATUS_in_setStatusRule860); 
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
			match(input,31,FOLLOW_31_in_setMilestoneRule875); 
			mil=(Token)match(input,STRING,FOLLOW_STRING_in_setMilestoneRule879); 
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
