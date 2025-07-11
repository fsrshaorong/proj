grammar Rust;

// 语法规则
compilationUnit : item+ EOF;

item : function
     | structDef
     | enumDef
     | moduleDef
     | useDecl
     | traitDef
     | implBlock
     | constDef
     | staticDef
     | typeAlias
     ;

function : FN IDENTIFIER LPAREN parameterList? RPAREN (RARROW type)? block;
parameterList : parameter (COMMA parameter)*;
parameter : pattern COLON type;
pattern : IDENTIFIER;

structDef : STRUCT IDENTIFIER structBody;
structBody : LBRACE structFieldList? RBRACE | LPAREN typeList? RPAREN;
structFieldList : structField (COMMA structField)* COMMA?;
structField : IDENTIFIER COLON type;
typeList : type (COMMA type)*;

enumDef : ENUM IDENTIFIER LBRACE enumVariantList RBRACE;
enumVariantList : enumVariant (COMMA enumVariant)* COMMA?;
enumVariant : IDENTIFIER (LPAREN typeList RPAREN)?;

moduleDef : MOD IDENTIFIER LBRACE item* RBRACE;
useDecl : USE path SEMICOLON;
path : IDENTIFIER ((DOUBLECOLON IDENTIFIER) | (DOUBLECOLON STAR))+;

traitDef : TRAIT IDENTIFIER LBRACE traitItem* RBRACE;
traitItem : functionSignature SEMICOLON | function;
functionSignature : FN IDENTIFIER LPAREN parameterList? RPAREN (RARROW type)?;

implBlock : IMPL type (FOR type)? LBRACE implItem* RBRACE;
implItem : function | traitItem;

constDef : CONST IDENTIFIER COLON type EQ expression SEMICOLON;
staticDef : STATIC IDENTIFIER COLON type EQ expression SEMICOLON;
typeAlias : TYPE IDENTIFIER EQ type SEMICOLON;

block : LBRACE statement* RBRACE;
statement : local
          | expression SEMICOLON
          | block
          | SEMICOLON
          ;

local : LET pattern (COLON type)? (EQ expression)? SEMICOLON;

expression : literal
           | path
           | LPAREN expression RPAREN
           | expression LBRACK expression RBRACK
           | expression LPAREN expressionList? RPAREN
           | expression DOUBLECOLON IDENTIFIER
           | expression DOT IDENTIFIER
           | expression PLUS expression
           | expression MINUS expression
           | expression STAR expression
           | expression SLASH expression
           | expression EQ expression
           | IF expression block (ELSE (block | expression))?
           | MATCH expression LBRACE matchArmList RBRACE
           | WHILE expression block
           | FOR pattern IN expression block
           | LOOP block
           | RETURN expression? SEMICOLON
           | BREAK expression? SEMICOLON
           | CONTINUE SEMICOLON
           | UNSAFE block
           | BOX expression
           | REF expression
           | AND expression
           | AND MUT expression
           | MOVE? PIPE parameterList? PIPE block
           ;

expressionList : expression (COMMA expression)*;
matchArmList : matchArm (COMMA matchArm)* COMMA?;
matchArm : pattern RARROW expression SEMICOLON;

type : IDENTIFIER
     | LPAREN typeList? RPAREN
     | type RARROW type
     | LBRACK type SEMICOLON expression RBRACK
     | AND type
     | AND MUT type
     | BOX_LT type GT
     | VEC_LT type GT
     | OPTION_LT type GT
     | RESULT_LT type COMMA type GT
     ;

literal : NUMBER
        | STRING
        | TRUE
        | FALSE
        | NULL
        | NONE
        | SOME LPAREN expression RPAREN
        | OK LPAREN expression RPAREN
        | ERR LPAREN expression RPAREN
        ;

// 词法规则
FN : 'fn';
STRUCT : 'struct';
ENUM : 'enum';
MOD : 'mod';
USE : 'use';
TRAIT : 'trait';
IMPL : 'impl';
CONST : 'const';
STATIC : 'static';
TYPE : 'type';
LET : 'let';
IF : 'if';
ELSE : 'else';
MATCH : 'match';
WHILE : 'while';
FOR : 'for';
IN : 'in';
LOOP : 'loop';
RETURN : 'return';
BREAK : 'break';
CONTINUE : 'continue';
UNSAFE : 'unsafe';
BOX : 'box';
REF : 'ref';
MOVE : 'move';
SOME : 'Some';
NONE : 'None';
OK : 'Ok';
ERR : 'Err';
TRUE : 'true';
FALSE : 'false';
NULL : 'null';

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
COLON : ':';
SEMICOLON : ';';
COMMA : ',';
DOT : '.';
RARROW : '->';
PLUS : '+';
MINUS : '-';
STAR : '*';
SLASH : '/';
EQ : '=';
AND : '&';
MUT : 'mut';
PIPE : '|';
LT : '<';
GT : '>';
DOUBLECOLON : '::';
STAR_SYM : '*';

BOX_LT : 'Box' '<';
VEC_LT : 'Vec' '<';
OPTION_LT : 'Option' '<';
RESULT_LT : 'Result' '<';

IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER : [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
STRING : '"' (~["\r\n])* '"';
LINE_COMMENT : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
WS : [ \t\r\n]+ -> skip;
