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
	int years=0;
}

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

DATE 	:	('0'.. '9')('0'.. '9')('0'.. '9')('0'.. '9') '-' ('0'.. '9')('0'.. '9') '-' ('0'.. '9')('0'.. '9'); 

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



degreeRule
	:	'DEGREE:' deg=STRING {h.createDegree($deg);} 'DAILY_HOURS:' st=INT {h.setDailyStudyHours($st);} 'YEARS:' OPEN_SQB ( y=yearRule { h.addYear(y); } )+ CLOSE_SQB
	;
	
yearRule returns [Year y]
	:	'YEAR' { y=h.createYear(); } OPEN_CUB 'EXAMS:' OPEN_SQB ( e=examRule { y.addExam(e); } DOTCOMMA)+ CLOSE_SQB CLOSE_CUB
	;
	

examRule returns [Exam e]
	:	 'EXAM' nome=STRING 'CFU' cfu=INT 'DATE' stringdate=DATE {e=h.createExam($nome,$cfu,$stringdate);} ('STATUS' status=STATUS {h.setExamStatus(e,$status); })? ('MILESTONE' mil=STRING {h.assignExamToMilestone(e,$mil);}  )?
	;
