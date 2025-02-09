grammar GRAD;

options {
	language = Java;
	k=1;
}

@lexer::header{
	package myCompilerPackage;
	import myCompilerPackage.util.*;
}

@parser::header{
	package myCompilerPackage;
	import myCompilerPackage.util.*;
}

@members {
	SemanticHandler h = SemanticHandler.getHandler();
	
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
}

	
/* ***********************************************
			Tokens defintion part starts here
************************************************** */

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;


INT	:	'0'|('1'.. '9')('0'.. '9')*;

DATE 	:	('0'INT|INT) '-' ('0'INT|INT) '-' INT; 

STATUS	:	'PASSED' | 'NOT_PASSED';

OPEN_SQB 
	:	'[';	//open square bracket
CLOSE_SQB
	:	']'; //closed square bracket

OPEN_CUB
	:	'{'; //open curly braces
CLOSE_CUB
	:	'}'; //closed curly braces

DOTCOMMA
	:	';';	
	
ERROR_TOKEN
	:	. ;

/* ***********************************************
			Tokens defintion part ends here
************************************************** */

/* ***********************************************
			Rules defintion part starts here
************************************************** */

degreeRule
	:	'DEGREE:' deg=STRING {h.createDegree($deg);} 'DAILY_HOURS:' st=INT {h.setDailyStudyHours($st);} 'YEARS:' OPEN_SQB ( y=yearRule { if(y!=null)h.addYear(y); } )+ CLOSE_SQB {h.checkDegree($deg);}
	;
	
yearRule returns [Year y]
	:	yt='YEAR' { y=h.createYear(); } OPEN_CUB 'EXAMS:' ex=OPEN_SQB ( e=examRule { if(e!=null)y.addExam(e); } DOTCOMMA)+ {y=h.checkYear(y,$yt);} CLOSE_SQB CLOSE_CUB
	;
	

examRule returns [Exam e]
	:	 'EXAM' nome=STRING 'CFU' cfu=INT 'DATE' stringdate=DATE {e=h.createExam($nome,$cfu,$stringdate);} facultativeInfoRule[e]
	;

facultativeInfoRule [Exam e]
	:	(setMilestoneRule[e] (setStatusRule[e])? 
		| setStatusRule[e] (setMilestoneRule[e])? 
		)?
	;
	
setStatusRule[Exam e]
	:	'STATUS' status=STATUS { if(e!=null)h.setExamStatus(e,$status); }
	;

setMilestoneRule [Exam e]
	:	'MILESTONE' mil=STRING {if(e!=null)h.assignExamToMilestone(e,$mil);}
	;

/* ***********************************************
			Rules defintion part ends here
************************************************** */