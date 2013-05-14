grammar TL4;

@header {
package tl4.grammar;
}

parse
    : .* EOF
    ;

block
    : ( statement | functionDecl )* (Return expression ';')?
    ;

statement
    : assignment ';'
    | functionCall ';'
    | ifStatement
    | forStatement
    | whileStatement
    ;

assignment
    : Identifier indexses? '=' expression
    ;

indexses
    : ( '[' expression ']')+
    ;

expression
    : condExpr
    ;

condExpr
    : orExpr ( '?' expression ':' expression
             | In expression
             )
    ;

orExpr
    : andExpr ( '||' andExpr)*
    ;

andExpr
    : equExpr ( '&&' equExpr)*
    ;

equExpr
    : relExpr (('==' | '!=') relExpr)*
    ;

relExpr
    : addExpr ( ('>='|'<='|'>'|'<') addExpr)*
    ;

addExpr
    : mulExpr ( ('+'|'-') mulExpr)*
    ;

mulExpr
    : powExpr ( ('*' | '/' | '%') powExpr)*
    ;

powExpr
    : unaryExpr ( '^' unaryExpr)*
    ;

unaryExpr
    : '-' atom
    | '!' atom
    | atom
    ;

atom
    : Null
    | Number
    | Bool
    | lookup
    ;

lookup
    : functionCall indexses?
    | '(' expression ')' indexses?
    | list indexses?
    | Identifier indexses?
    | String indexses?
    ;

list
    : '[' exprList? ']'
    ;

exprList
    : expression (',' expression)*
    ;

functionCall
    : Identifier '(' exprList? ')'
    | Println '(' expression? ')'
    | Print '(' expression ')'
    | Assert '(' expression ')'
    | Size '(' expression ')'
    ;


ifStatement
    : ifStat elseIfStat* elseStat? End
    ;
ifStat
    : If expression Do block
    ;
elseIfStat
    : Else If expression Do block
    ;
elseStat
    : Else Do block
    ;

forStatement
    : For Identifier '=' expression To expression Do block End
    ;

whileStatement
    : While expression Do block End
    ;





functionDecl
    : Def Identifier '(' idList? ')' block End
    ;

idList
    : Identifier (',' Identifier)*
    ;
  
Println  : 'println';
Print    : 'print';
Assert   : 'assert';
Size     : 'size';
Def      : 'def';
If       : 'if';
Else     : 'else';
Return   : 'return';
For      : 'for';
While    : 'while';
To       : 'to';
Do       : 'do';
End      : 'end';
In       : 'in';
Null     : 'null';

Or       : '||';
And      : '&&';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pow      : '^';
Excl     : '!';
GT       : '>';
LT       : '<';
Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
OBrace   : '{';
CBrace   : '}';
OBracket : '[';
CBracket : ']';
OParen   : '(';
CParen   : ')';
SColon   : ';';
Assign   : '=';
Comma    : ',';
QMark    : '?';
Colon    : ':';

Bool
  :  'true' 
  |  'false'
  ;

Number
    : Int ('.' Digit*)?  
    ;

Identifier
    : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | Digit)*
    ;

HexChar
    :  '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;



Space
    : (' ' | '\t' | '\r' | '\n' | '\u000C') -> channel(HIDDEN)
    ;


fragment Digit
    : '0' .. '9'
    ;

fragment Int
    : '1' .. '9' Digit*
    | '0'
    ;
fragment HexDigit
  :  '0'..'9' | 'a'..'f' | 'A'..'F'
  ;

LineComment
    : '//' ~('\r' | '\n')* -> channel(HIDDEN)
    ;

Comment
    : '/*' .* '*/' -> channel(HIDDEN)
    ;