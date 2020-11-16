/* Generated By:JJTree&JavaCC: Do not edit this line. XParserConstants.java */
package org.w3c.xqparser;

public interface XParserConstants {

  int EOF = 0;
  int DirCommentContentDoubleDashError = 76;
  int RbraceError = 77;
  int AmpersandError = 78;
  int PITargetError = 79;
  int NumericLiteralError = 80;
  int Slash = 81;
  int SlashSlash = 82;
  int Greatest = 83;
  int Least = 84;
  int External = 85;
  int Lbrace = 86;
  int Rbrace = 87;
  int Ascending = 88;
  int Descending = 89;
  int LeftAngleBracket = 90;
  int Plus = 91;
  int Minus = 92;
  int PragmaOpen = 93;
  int PragmaClose = 94;
  int NCNameColonStar = 95;
  int StarColonNCName = 96;
  int OpenQuot = 97;
  int CloseQuot = 98;
  int DirCommentContentChar = 99;
  int DirCommentContentDashChar = 100;
  int ProcessingInstructionStart = 101;
  int ProcessingInstructionEnd = 102;
  int CdataSectionStart = 103;
  int CdataSectionEnd = 104;
  int IntegerLiteral = 105;
  int DecimalLiteral = 106;
  int DoubleLiteral = 107;
  int StringLiteral = 108;
  int EscapeQuot = 109;
  int EscapeApos = 110;
  int ElementContentChar = 111;
  int QuotAttrContentChar = 112;
  int AposAttrContentChar = 113;
  int PITarget = 114;
  int QNameToken = 115;
  int NCNameTok = 116;
  int S = 117;
  int Char = 118;
  int Digits = 119;
  int WhitespaceChar = 120;
  int LocalPart = 121;
  int Nmstart = 122;
  int Nmchar = 123;
  int Letter = 124;
  int BaseChar = 125;
  int Ideographic = 126;
  int CombiningChar = 127;
  int Digit = 128;
  int Extender = 129;
  int CommentStart = 130;
  int CommentEnd = 131;
  int CommentContent = 132;
  int ImplicitlyAllowedWhitespace = 133;

  int DEFAULT = 0;
  int XML_COMMENT = 1;
  int QUOT_ATTRIBUTE_CONTENT = 2;
  int APOS_ATTRIBUTE_CONTENT = 3;
  int ELEMENT_CONTENT = 4;
  int PROCESSING_INSTRUCTION = 5;
  int PRAGMA_2 = 6;
  int PRAGMA_3 = 7;
  int START_TAG = 8;
  int PROCESSING_INSTRUCTION_CONTENT = 9;
  int CDATA_SECTION = 10;
  int PRAGMA_1 = 11;
  int END_TAG = 12;
  int EXPR_COMMENT = 13;

  String[] tokenImage = {
    "<EOF>",
    "\"module\"",
    "\"namespace\"",
    "\"=\"",
    "\";\"",
    "\"declare\"",
    "\"default\"",
    "\"collation\"",
    "\"base-uri\"",
    "\"construction\"",
    "\"strip\"",
    "\"preserve\"",
    "\"ordering\"",
    "\"ordered\"",
    "\"unordered\"",
    "\"order\"",
    "\"empty\"",
    "\"copy-namespaces\"",
    "\",\"",
    "\"no-preserve\"",
    "\"inherit\"",
    "\"no-inherit\"",
    "\"import\"",
    "\"schema\"",
    "\"at\"",
    "\"element\"",
    "\"function\"",
    "\"variable\"",
    "\"$\"",
    "\":=\"",
    "\"(\"",
    "\")\"",
    "\"as\"",
    "\"option\"",
    "\"return\"",
    "\"for\"",
    "\"in\"",
    "\"let\"",
    "\"by\"",
    "\"stable\"",
    "\"some\"",
    "\"every\"",
    "\"satisfies\"",
    "\"typeswitch\"",
    "\"case\"",
    "\"if\"",
    "\"then\"",
    "\"else\"",
    "\"or\"",
    "\"and\"",
    "\"castable\"",
    "\"cast\"",
    "\"validate\"",
    "\"lax\"",
    "\"strict\"",
    "\"child\"",
    "\"::\"",
    "\"descendant\"",
    "\"attribute\"",
    "\"self\"",
    "\"descendant-or-self\"",
    "\"parent\"",
    "\"ancestor\"",
    "\"ancestor-or-self\"",
    "\"*\"",
    "\"document\"",
    "\"text\"",
    "\"comment\"",
    "\"processing-instruction\"",
    "\"?\"",
    "\"empty-sequence\"",
    "\"item\"",
    "\"node\"",
    "\"document-node\"",
    "\"schema-attribute\"",
    "\"schema-element\"",
    "<DirCommentContentDoubleDashError>",
    "\"}\"",
    "\"&\"",
    "<PITargetError>",
    "<NumericLiteralError>",
    "\"/\"",
    "\"//\"",
    "\"greatest\"",
    "\"least\"",
    "\"external\"",
    "\"{\"",
    "\"}\"",
    "\"ascending\"",
    "\"descending\"",
    "\"<\"",
    "\"+\"",
    "\"-\"",
    "\"(#\"",
    "\"#)\"",
    "<NCNameColonStar>",
    "<StarColonNCName>",
    "\"\\\"\"",
    "\"\\\"\"",
    "<DirCommentContentChar>",
    "<DirCommentContentDashChar>",
    "\"<?\"",
    "\"?>\"",
    "\"<![CDATA[\"",
    "<CdataSectionEnd>",
    "<IntegerLiteral>",
    "<DecimalLiteral>",
    "<DoubleLiteral>",
    "<StringLiteral>",
    "\"\\\"\\\"\"",
    "\"\\\'\\\'\"",
    "<ElementContentChar>",
    "<QuotAttrContentChar>",
    "<AposAttrContentChar>",
    "<PITarget>",
    "<QNameToken>",
    "<NCNameTok>",
    "<S>",
    "<Char>",
    "<Digits>",
    "<WhitespaceChar>",
    "<LocalPart>",
    "<Nmstart>",
    "<Nmchar>",
    "<Letter>",
    "<BaseChar>",
    "<Ideographic>",
    "<CombiningChar>",
    "<Digit>",
    "<Extender>",
    "\"(:\"",
    "\":)\"",
    "<CommentContent>",
    "<ImplicitlyAllowedWhitespace>",
  };

}
