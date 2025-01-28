grammar GRAD;

options {
	language = Java;
	k=1;
}

@lexer::header{
	package myCompilerPackage;
	//import myCompilerPackage.util.*;
}

@parser::header{
	package myCompilerPackage;
	//import myCompilerPackage.util.*;
}

@members {
	//SemanticHandler h = SemanticHandler.getHandler();
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


DATE 	:	INT '-' INT '-' INT; 

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
	:	'DEGREE:' STRING 'YEARS:' OPEN_SQB (yearRule)+ CLOSE_SQB;
	
yearRule
	:	'YEAR' INT OPEN_CUB 'EXAMS:' OPEN_SQB examsArgListRule CLOSE_SQB CLOSE_CUB;
	
examsArgListRule
	:	examRule DOTCOMMA (examRule DOTCOMMA)*
	;

examRule
	:	 'EXAM' STRING 'CFU' INT 'DATE' DATE ('STATUS' STATUS)?;
