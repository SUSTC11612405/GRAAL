// Generated from D:/IdeaProjects/GRAAL/src/main/resources/edu/graal/antlr4\Java8.g4 by ANTLR 4.8
package edu.graal.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90, 
		ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, 
		OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, 
		URSHIFT_ASSIGN=101, Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106, 
		LINE_COMMENT=107;
	public static final int
		RULE_literal = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17, 
		RULE_typeParameterModifier = 18, RULE_typeBound = 19, RULE_additionalBound = 20, 
		RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23, 
		RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_packageName = 26, RULE_typeName = 27, 
		RULE_packageOrTypeName = 28, RULE_expressionName = 29, RULE_methodName = 30, 
		RULE_ambiguousName = 31, RULE_compilationUnit = 32, RULE_packageDeclaration = 33, 
		RULE_packageModifier = 34, RULE_importDeclaration = 35, RULE_singleTypeImportDeclaration = 36, 
		RULE_typeImportOnDemandDeclaration = 37, RULE_singleStaticImportDeclaration = 38, 
		RULE_staticImportOnDemandDeclaration = 39, RULE_typeDeclaration = 40, 
		RULE_classDeclaration = 41, RULE_normalClassDeclaration = 42, RULE_classModifier = 43, 
		RULE_typeParameters = 44, RULE_typeParameterList = 45, RULE_superclass = 46, 
		RULE_superinterfaces = 47, RULE_interfaceTypeList = 48, RULE_classBody = 49, 
		RULE_classBodyDeclaration = 50, RULE_classMemberDeclaration = 51, RULE_fieldDeclaration = 52, 
		RULE_fieldModifier = 53, RULE_variableDeclaratorList = 54, RULE_variableDeclarator = 55, 
		RULE_variableDeclaratorId = 56, RULE_variableInitializer = 57, RULE_unannType = 58, 
		RULE_unannPrimitiveType = 59, RULE_unannReferenceType = 60, RULE_unannClassOrInterfaceType = 61, 
		RULE_unannClassType = 62, RULE_unannClassType_lf_unannClassOrInterfaceType = 63, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 64, RULE_unannInterfaceType = 65, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67, 
		RULE_unannTypeVariable = 68, RULE_unannArrayType = 69, RULE_methodDeclaration = 70, 
		RULE_methodModifier = 71, RULE_methodHeader = 72, RULE_result = 73, RULE_methodDeclarator = 74, 
		RULE_formalParameterList = 75, RULE_formalParameters = 76, RULE_formalParameter = 77, 
		RULE_variableModifier = 78, RULE_lastFormalParameter = 79, RULE_receiverParameter = 80, 
		RULE_throws_ = 81, RULE_exceptionTypeList = 82, RULE_exceptionType = 83, 
		RULE_methodBody = 84, RULE_instanceInitializer = 85, RULE_staticInitializer = 86, 
		RULE_constructorDeclaration = 87, RULE_constructorModifier = 88, RULE_constructorDeclarator = 89, 
		RULE_simpleTypeName = 90, RULE_constructorBody = 91, RULE_explicitConstructorInvocation = 92, 
		RULE_enumDeclaration = 93, RULE_enumBody = 94, RULE_enumConstantList = 95, 
		RULE_enumConstant = 96, RULE_enumConstantModifier = 97, RULE_enumBodyDeclarations = 98, 
		RULE_interfaceDeclaration = 99, RULE_normalInterfaceDeclaration = 100, 
		RULE_interfaceModifier = 101, RULE_extendsInterfaces = 102, RULE_interfaceBody = 103, 
		RULE_interfaceMemberDeclaration = 104, RULE_constantDeclaration = 105, 
		RULE_constantModifier = 106, RULE_interfaceMethodDeclaration = 107, RULE_interfaceMethodModifier = 108, 
		RULE_annotationTypeDeclaration = 109, RULE_annotationTypeBody = 110, RULE_annotationTypeMemberDeclaration = 111, 
		RULE_annotationTypeElementDeclaration = 112, RULE_annotationTypeElementModifier = 113, 
		RULE_defaultValue = 114, RULE_annotation = 115, RULE_normalAnnotation = 116, 
		RULE_elementValuePairList = 117, RULE_elementValuePair = 118, RULE_elementValue = 119, 
		RULE_elementValueArrayInitializer = 120, RULE_elementValueList = 121, 
		RULE_markerAnnotation = 122, RULE_singleElementAnnotation = 123, RULE_arrayInitializer = 124, 
		RULE_variableInitializerList = 125, RULE_block = 126, RULE_blockStatements = 127, 
		RULE_blockStatement = 128, RULE_localVariableDeclarationStatement = 129, 
		RULE_localVariableDeclaration = 130, RULE_statement = 131, RULE_statementNoShortIf = 132, 
		RULE_statementWithoutTrailingSubstatement = 133, RULE_emptyStatement = 134, 
		RULE_labeledStatement = 135, RULE_labeledStatementNoShortIf = 136, RULE_expressionStatement = 137, 
		RULE_statementExpression = 138, RULE_ifThenStatement = 139, RULE_ifThenElseStatement = 140, 
		RULE_ifThenElseStatementNoShortIf = 141, RULE_ifCondition = 142, RULE_assertStatement = 143, 
		RULE_switchStatement = 144, RULE_switchBlock = 145, RULE_switchBlockStatementGroup = 146, 
		RULE_switchLabels = 147, RULE_switchLabel = 148, RULE_enumConstantName = 149, 
		RULE_whileStatement = 150, RULE_whileStatementNoShortIf = 151, RULE_whileCondition = 152, 
		RULE_doStatement = 153, RULE_forStatement = 154, RULE_forStatementNoShortIf = 155, 
		RULE_basicForStatement = 156, RULE_basicForStatementNoShortIf = 157, RULE_forExpression = 158, 
		RULE_forInit = 159, RULE_forUpdate = 160, RULE_statementExpressionList = 161, 
		RULE_enhancedForStatement = 162, RULE_enhancedForStatementNoShortIf = 163, 
		RULE_breakStatement = 164, RULE_continueStatement = 165, RULE_returnStatement = 166, 
		RULE_throwStatement = 167, RULE_synchronizedStatement = 168, RULE_tryStatement = 169, 
		RULE_catches = 170, RULE_catchClause = 171, RULE_catchFormalParameter = 172, 
		RULE_catchType = 173, RULE_finally_ = 174, RULE_tryWithResourcesStatement = 175, 
		RULE_resourceSpecification = 176, RULE_resourceList = 177, RULE_resource = 178, 
		RULE_primary = 179, RULE_primaryNoNewArray = 180, RULE_primaryNoNewArray_lf_arrayAccess = 181, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 182, RULE_primaryNoNewArray_lf_primary = 183, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 184, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 185, 
		RULE_primaryNoNewArray_lfno_primary = 186, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 187, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 188, 
		RULE_classInstanceCreationExpression = 189, RULE_classInstanceCreationExpression_lf_primary = 190, 
		RULE_classInstanceCreationExpression_lfno_primary = 191, RULE_typeArgumentsOrDiamond = 192, 
		RULE_fieldAccess = 193, RULE_fieldAccess_lf_primary = 194, RULE_fieldAccess_lfno_primary = 195, 
		RULE_arrayAccess = 196, RULE_arrayAccess_lf_primary = 197, RULE_arrayAccess_lfno_primary = 198, 
		RULE_methodInvocation = 199, RULE_methodInvocation_lf_primary = 200, RULE_methodInvocation_lfno_primary = 201, 
		RULE_argumentList = 202, RULE_methodReference = 203, RULE_methodReference_lf_primary = 204, 
		RULE_methodReference_lfno_primary = 205, RULE_arrayCreationExpression = 206, 
		RULE_dimExprs = 207, RULE_dimExpr = 208, RULE_constantExpression = 209, 
		RULE_expression = 210, RULE_lambdaExpression = 211, RULE_lambdaParameters = 212, 
		RULE_inferredFormalParameterList = 213, RULE_lambdaBody = 214, RULE_assignmentExpression = 215, 
		RULE_assignment = 216, RULE_leftHandSide = 217, RULE_assignmentOperator = 218, 
		RULE_conditionalExpression = 219, RULE_conditionalOrExpression = 220, 
		RULE_conditionalAndExpression = 221, RULE_inclusiveOrExpression = 222, 
		RULE_exclusiveOrExpression = 223, RULE_andExpression = 224, RULE_equalityExpression = 225, 
		RULE_relationalExpression = 226, RULE_shiftExpression = 227, RULE_additiveExpression = 228, 
		RULE_multiplicativeExpression = 229, RULE_unaryExpression = 230, RULE_preIncrementExpression = 231, 
		RULE_preDecrementExpression = 232, RULE_unaryExpressionNotPlusMinus = 233, 
		RULE_postfixExpression = 234, RULE_postIncrementExpression = 235, RULE_postIncrementExpression_lf_postfixExpression = 236, 
		RULE_postDecrementExpression = 237, RULE_postDecrementExpression_lf_postfixExpression = 238, 
		RULE_castExpression = 239;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "type", "primitiveType", "numericType", "integralType", "floatingPointType", 
			"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
			"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
			"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
			"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
			"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
			"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
			"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", 
			"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", 
			"singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", 
			"classDeclaration", "normalClassDeclaration", "classModifier", "typeParameters", 
			"typeParameterList", "superclass", "superinterfaces", "interfaceTypeList", 
			"classBody", "classBodyDeclaration", "classMemberDeclaration", "fieldDeclaration", 
			"fieldModifier", "variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "unannType", "unannPrimitiveType", "unannReferenceType", 
			"unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
			"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
			"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
			"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
			"methodHeader", "result", "methodDeclarator", "formalParameterList", 
			"formalParameters", "formalParameter", "variableModifier", "lastFormalParameter", 
			"receiverParameter", "throws_", "exceptionTypeList", "exceptionType", 
			"methodBody", "instanceInitializer", "staticInitializer", "constructorDeclaration", 
			"constructorModifier", "constructorDeclarator", "simpleTypeName", "constructorBody", 
			"explicitConstructorInvocation", "enumDeclaration", "enumBody", "enumConstantList", 
			"enumConstant", "enumConstantModifier", "enumBodyDeclarations", "interfaceDeclaration", 
			"normalInterfaceDeclaration", "interfaceModifier", "extendsInterfaces", 
			"interfaceBody", "interfaceMemberDeclaration", "constantDeclaration", 
			"constantModifier", "interfaceMethodDeclaration", "interfaceMethodModifier", 
			"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeMemberDeclaration", 
			"annotationTypeElementDeclaration", "annotationTypeElementModifier", 
			"defaultValue", "annotation", "normalAnnotation", "elementValuePairList", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "elementValueList", 
			"markerAnnotation", "singleElementAnnotation", "arrayInitializer", "variableInitializerList", 
			"block", "blockStatements", "blockStatement", "localVariableDeclarationStatement", 
			"localVariableDeclaration", "statement", "statementNoShortIf", "statementWithoutTrailingSubstatement", 
			"emptyStatement", "labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
			"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
			"ifCondition", "assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
			"switchLabels", "switchLabel", "enumConstantName", "whileStatement", 
			"whileStatementNoShortIf", "whileCondition", "doStatement", "forStatement", 
			"forStatementNoShortIf", "basicForStatement", "basicForStatementNoShortIf", 
			"forExpression", "forInit", "forUpdate", "statementExpressionList", "enhancedForStatement", 
			"enhancedForStatementNoShortIf", "breakStatement", "continueStatement", 
			"returnStatement", "throwStatement", "synchronizedStatement", "tryStatement", 
			"catches", "catchClause", "catchFormalParameter", "catchType", "finally_", 
			"tryWithResourcesStatement", "resourceSpecification", "resourceList", 
			"resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
			"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
			"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
			"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
			"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
			"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
			"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", 
			"methodInvocation", "methodInvocation_lf_primary", "methodInvocation_lfno_primary", 
			"argumentList", "methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
			"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
			"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
			"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
			"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
			"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
			"postDecrementExpression_lf_postfixExpression", "castExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				referenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(Java8Parser.BOOLEAN, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(486);
					annotation();
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(492);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(493);
					annotation();
					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(499);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(Java8Parser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(Java8Parser.SHORT, 0); }
		public TerminalNode INT() { return getToken(Java8Parser.INT, 0); }
		public TerminalNode LONG() { return getToken(Java8Parser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(Java8Parser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(Java8Parser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(Java8Parser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(515);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(516);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(519);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(520);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(526);
					annotation();
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(532);
				match(Identifier);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(533);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				classOrInterfaceType();
				setState(537);
				match(DOT);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(538);
					annotation();
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(544);
				match(Identifier);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(545);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(DOT);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(551);
				annotation();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(557);
			match(Identifier);
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(558);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(561);
				annotation();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			match(Identifier);
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(568);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(577);
				annotation();
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				primitiveType();
				setState(586);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				classOrInterfaceType();
				setState(589);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				typeVariable();
				setState(592);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(596);
				annotation();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			match(LBRACK);
			setState(603);
			match(RBRACK);
			setState(614);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(604);
						annotation();
						}
						}
						setState(609);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(610);
					match(LBRACK);
					setState(611);
					match(RBRACK);
					}
					} 
				}
				setState(616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(617);
				typeParameterModifier();
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623);
			match(Identifier);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(624);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(EXTENDS);
				setState(630);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(EXTENDS);
				setState(632);
				classOrInterfaceType();
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(633);
					additionalBound();
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(Java8Parser.BITAND, 0); }
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditionalBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(BITAND);
			setState(642);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(LT);
			setState(645);
			typeArgumentList();
			setState(646);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			typeArgument();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(649);
				match(COMMA);
				setState(650);
				typeArgument();
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(Java8Parser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(660);
				annotation();
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666);
			match(QUESTION);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(667);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				match(EXTENDS);
				setState(671);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(SUPER);
				setState(673);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(677);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(679);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(680);
					match(DOT);
					setState(681);
					match(Identifier);
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				packageOrTypeName(0);
				setState(689);
				match(DOT);
				setState(690);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(695);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(697);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(698);
					match(DOT);
					setState(699);
					match(Identifier);
					}
					} 
				}
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				ambiguousName(0);
				setState(707);
				match(DOT);
				setState(708);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(715);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(717);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(718);
					match(DOT);
					setState(719);
					match(Identifier);
					}
					} 
				}
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(725);
				packageDeclaration();
				}
				break;
			}
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(728);
				importDeclaration();
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(734);
				typeDeclaration();
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(Java8Parser.PACKAGE, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(742);
				packageModifier();
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(748);
			match(PACKAGE);
			setState(749);
			match(Identifier);
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(750);
				match(DOT);
				setState(751);
				match(Identifier);
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(757);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_importDeclaration);
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(764);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleTypeImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleTypeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(IMPORT);
			setState(768);
			typeName();
			setState(769);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode MUL() { return getToken(Java8Parser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(IMPORT);
			setState(772);
			packageOrTypeName(0);
			setState(773);
			match(DOT);
			setState(774);
			match(MUL);
			setState(775);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleStaticImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleStaticImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(IMPORT);
			setState(778);
			match(STATIC);
			setState(779);
			typeName();
			setState(780);
			match(DOT);
			setState(781);
			match(Identifier);
			setState(782);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode MUL() { return getToken(Java8Parser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStaticImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(IMPORT);
			setState(785);
			match(STATIC);
			setState(786);
			typeName();
			setState(787);
			match(DOT);
			setState(788);
			match(MUL);
			setState(789);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeDeclaration);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classDeclaration);
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(800);
				classModifier();
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			match(CLASS);
			setState(807);
			match(Identifier);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(808);
				typeParameters();
				}
			}

			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(811);
				superclass();
				}
			}

			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(814);
				superinterfaces();
				}
			}

			setState(817);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classModifier);
		try {
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(823);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(824);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(825);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(826);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(LT);
			setState(830);
			typeParameterList();
			setState(831);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			typeParameter();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(834);
				match(COMMA);
				setState(835);
				typeParameter();
				}
				}
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(EXTENDS);
			setState(842);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(Java8Parser.IMPLEMENTS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperinterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(IMPLEMENTS);
			setState(845);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			interfaceType();
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(848);
				match(COMMA);
				setState(849);
				interfaceType();
				}
				}
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(LBRACE);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(856);
				classBodyDeclaration();
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(862);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(866);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(867);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(873);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(874);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(877);
				fieldModifier();
				}
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(883);
			unannType();
			setState(884);
			variableDeclaratorList();
			setState(885);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(Java8Parser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(Java8Parser.VOLATILE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(889);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(890);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(891);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(892);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(893);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(894);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			variableDeclarator();
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(898);
				match(COMMA);
				setState(899);
				variableDeclarator();
				}
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			variableDeclaratorId();
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(906);
				match(ASSIGN);
				setState(907);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(Identifier);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(911);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(Java8Parser.BOOLEAN, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(928);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(931);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(932);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(939);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(937);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(935);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(936);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(941);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				match(Identifier);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(943);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				unannClassOrInterfaceType();
				setState(947);
				match(DOT);
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(948);
					annotation();
					}
					}
					setState(953);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(954);
				match(Identifier);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(955);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(DOT);
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(961);
				annotation();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(967);
			match(Identifier);
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(968);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(Identifier);
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(972);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				unannPrimitiveType();
				setState(984);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				unannClassOrInterfaceType();
				setState(987);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
				unannTypeVariable();
				setState(990);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(994);
				methodModifier();
				}
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1000);
			methodHeader();
			setState(1001);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(Java8Parser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(Java8Parser.NATIVE, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1005);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1006);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1007);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1008);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1009);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1010);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1011);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1012);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1032);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				result();
				setState(1016);
				methodDeclarator();
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1017);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				typeParameters();
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1021);
					annotation();
					}
					}
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1027);
				result();
				setState(1028);
				methodDeclarator();
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1029);
					throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(Identifier);
			setState(1039);
			match(LPAREN);
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1040);
				formalParameterList();
				}
			}

			setState(1043);
			match(RPAREN);
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1044);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				formalParameters();
				setState(1048);
				match(COMMA);
				setState(1049);
				lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				formalParameter();
				setState(1059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1055);
						match(COMMA);
						setState(1056);
						formalParameter();
						}
						} 
					}
					setState(1061);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				receiverParameter();
				setState(1067);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1063);
						match(COMMA);
						setState(1064);
						formalParameter();
						}
						} 
					}
					setState(1069);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1072);
				variableModifier();
				}
				}
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1078);
			unannType();
			setState(1079);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(Java8Parser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1085);
					variableModifier();
					}
					}
					setState(1090);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1091);
				unannType();
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1092);
					annotation();
					}
					}
					setState(1097);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1098);
				match(ELLIPSIS);
				setState(1099);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1104);
				annotation();
				}
				}
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1110);
			unannType();
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1111);
				match(Identifier);
				setState(1112);
				match(DOT);
				}
			}

			setState(1115);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(Java8Parser.THROWS, 0); }
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(THROWS);
			setState(1118);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			exceptionType();
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1121);
				match(COMMA);
				setState(1122);
				exceptionType();
				}
				}
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1133);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInstanceInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInstanceInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			match(STATIC);
			setState(1139);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1141);
				constructorModifier();
				}
				}
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1147);
			constructorDeclarator();
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1148);
				throws_();
				}
			}

			setState(1151);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1155);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1156);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1159);
				typeParameters();
				}
			}

			setState(1162);
			simpleTypeName();
			setState(1163);
			match(LPAREN);
			setState(1165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1164);
				formalParameterList();
				}
			}

			setState(1167);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			match(LBRACE);
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1172);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1175);
				blockStatements();
				}
			}

			setState(1178);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1180);
					typeArguments();
					}
				}

				setState(1183);
				match(THIS);
				setState(1184);
				match(LPAREN);
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1185);
					argumentList();
					}
				}

				setState(1188);
				match(RPAREN);
				setState(1189);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1190);
					typeArguments();
					}
				}

				setState(1193);
				match(SUPER);
				setState(1194);
				match(LPAREN);
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1195);
					argumentList();
					}
				}

				setState(1198);
				match(RPAREN);
				setState(1199);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1200);
				expressionName();
				setState(1201);
				match(DOT);
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1202);
					typeArguments();
					}
				}

				setState(1205);
				match(SUPER);
				setState(1206);
				match(LPAREN);
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1207);
					argumentList();
					}
				}

				setState(1210);
				match(RPAREN);
				setState(1211);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1213);
				primary();
				setState(1214);
				match(DOT);
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1215);
					typeArguments();
					}
				}

				setState(1218);
				match(SUPER);
				setState(1219);
				match(LPAREN);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1220);
					argumentList();
					}
				}

				setState(1223);
				match(RPAREN);
				setState(1224);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Java8Parser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1228);
				classModifier();
				}
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1234);
			match(ENUM);
			setState(1235);
			match(Identifier);
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1236);
				superinterfaces();
				}
			}

			setState(1239);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(LBRACE);
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1242);
				enumConstantList();
				}
			}

			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1245);
				match(COMMA);
				}
			}

			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1248);
				enumBodyDeclarations();
				}
			}

			setState(1251);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			enumConstant();
			setState(1258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1254);
					match(COMMA);
					setState(1255);
					enumConstant();
					}
					} 
				}
				setState(1260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1261);
				enumConstantModifier();
				}
				}
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1267);
			match(Identifier);
			setState(1273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1268);
				match(LPAREN);
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1269);
					argumentList();
					}
				}

				setState(1272);
				match(RPAREN);
				}
			}

			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1275);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(SEMI);
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1281);
				classBodyDeclaration();
				}
				}
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(Java8Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1291);
				interfaceModifier();
				}
				}
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1297);
			match(INTERFACE);
			setState(1298);
			match(Identifier);
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1299);
				typeParameters();
				}
			}

			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1302);
				extendsInterfaces();
				}
			}

			setState(1305);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_interfaceModifier);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1307);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1309);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1310);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1311);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1312);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1313);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExtendsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(EXTENDS);
			setState(1317);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			match(LBRACE);
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1320);
				interfaceMemberDeclaration();
				}
				}
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1326);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceMemberDeclaration);
		try {
			setState(1333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1330);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1331);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1332);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1335);
				constantModifier();
				}
				}
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1341);
			unannType();
			setState(1342);
			variableDeclaratorList();
			setState(1343);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantModifier);
		try {
			setState(1349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1347);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1348);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1351);
				interfaceMethodModifier();
				}
				}
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1357);
			methodHeader();
			setState(1358);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(Java8Parser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodModifier);
		try {
			setState(1366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1361);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1362);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1363);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1364);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1365);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(Java8Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1368);
					interfaceModifier();
					}
					} 
				}
				setState(1373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1374);
			match(AT);
			setState(1375);
			match(INTERFACE);
			setState(1376);
			match(Identifier);
			setState(1377);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(LBRACE);
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1380);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1386);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1388);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1389);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1390);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1391);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1392);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1395);
				annotationTypeElementModifier();
				}
				}
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1401);
			unannType();
			setState(1402);
			match(Identifier);
			setState(1403);
			match(LPAREN);
			setState(1404);
			match(RPAREN);
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1405);
				dims();
				}
			}

			setState(1409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1408);
				defaultValue();
				}
			}

			setState(1411);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeElementModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementModifier);
		try {
			setState(1416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1415);
				match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(Java8Parser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			match(DEFAULT);
			setState(1419);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotation);
		try {
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1422);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1423);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			match(AT);
			setState(1427);
			typeName();
			setState(1428);
			match(LPAREN);
			setState(1430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1429);
				elementValuePairList();
				}
			}

			setState(1432);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePairList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValuePairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			elementValuePair();
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1435);
				match(COMMA);
				setState(1436);
				elementValuePair();
				}
				}
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(Identifier);
			setState(1443);
			match(ASSIGN);
			setState(1444);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValue);
		try {
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1446);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1448);
				annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(LBRACE);
			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1452);
				elementValueList();
				}
			}

			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1455);
				match(COMMA);
				}
			}

			setState(1458);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			elementValue();
			setState(1465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1461);
					match(COMMA);
					setState(1462);
					elementValue();
					}
					} 
				}
				setState(1467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMarkerAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMarkerAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			match(AT);
			setState(1469);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleElementAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleElementAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			match(AT);
			setState(1472);
			typeName();
			setState(1473);
			match(LPAREN);
			setState(1474);
			elementValue();
			setState(1475);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(LBRACE);
			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1478);
				variableInitializerList();
				}
			}

			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1481);
				match(COMMA);
				}
			}

			setState(1484);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			variableInitializer();
			setState(1491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1487);
					match(COMMA);
					setState(1488);
					variableInitializer();
					}
					} 
				}
				setState(1493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(LBRACE);
			setState(1496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1495);
				blockStatements();
				}
			}

			setState(1498);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			blockStatement();
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				{
				setState(1501);
				blockStatement();
				}
				}
				setState(1506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatement);
		try {
			setState(1510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1509);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			localVariableDeclaration();
			setState(1513);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1515);
				variableModifier();
				}
				}
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1521);
			unannType();
			setState(1522);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_statement);
		try {
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1524);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1525);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1526);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1527);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1528);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1529);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statementNoShortIf);
		try {
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1533);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1534);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1535);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1536);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540);
				emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1541);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1542);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1543);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1544);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1545);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1546);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1547);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1548);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1549);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1550);
				tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(Identifier);
			setState(1556);
			match(COLON);
			setState(1557);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			match(Identifier);
			setState(1560);
			match(COLON);
			setState(1561);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			statementExpression();
			setState(1564);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statementExpression);
		try {
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1568);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1569);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1570);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1571);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1572);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			match(IF);
			setState(1576);
			match(LPAREN);
			setState(1577);
			ifCondition();
			setState(1578);
			match(RPAREN);
			setState(1579);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(Java8Parser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			match(IF);
			setState(1582);
			match(LPAREN);
			setState(1583);
			ifCondition();
			setState(1584);
			match(RPAREN);
			setState(1585);
			statementNoShortIf();
			setState(1586);
			match(ELSE);
			setState(1587);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Java8Parser.ELSE, 0); }
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(IF);
			setState(1590);
			match(LPAREN);
			setState(1591);
			ifCondition();
			setState(1592);
			match(RPAREN);
			setState(1593);
			statementNoShortIf();
			setState(1594);
			match(ELSE);
			setState(1595);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(Java8Parser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_assertStatement);
		try {
			setState(1609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1599);
				match(ASSERT);
				setState(1600);
				expression();
				setState(1601);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1603);
				match(ASSERT);
				setState(1604);
				expression();
				setState(1605);
				match(COLON);
				setState(1606);
				expression();
				setState(1607);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(Java8Parser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			match(SWITCH);
			setState(1612);
			match(LPAREN);
			setState(1613);
			expression();
			setState(1614);
			match(RPAREN);
			setState(1615);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			match(LBRACE);
			setState(1621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1618);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1624);
				switchLabel();
				}
				}
				setState(1629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1630);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			switchLabels();
			setState(1633);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			switchLabel();
			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1636);
				switchLabel();
				}
				}
				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Java8Parser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(Java8Parser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_switchLabel);
		try {
			setState(1652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1642);
				match(CASE);
				setState(1643);
				constantExpression();
				setState(1644);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1646);
				match(CASE);
				setState(1647);
				enumConstantName();
				setState(1648);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1650);
				match(DEFAULT);
				setState(1651);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Java8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			match(WHILE);
			setState(1657);
			match(LPAREN);
			setState(1658);
			whileCondition();
			setState(1659);
			match(RPAREN);
			setState(1660);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Java8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			match(WHILE);
			setState(1663);
			match(LPAREN);
			setState(1664);
			whileCondition();
			setState(1665);
			match(RPAREN);
			setState(1666);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_whileCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(Java8Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Java8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(DO);
			setState(1671);
			statement();
			setState(1672);
			match(WHILE);
			setState(1673);
			match(LPAREN);
			setState(1674);
			expression();
			setState(1675);
			match(RPAREN);
			setState(1676);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_forStatement);
		try {
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1678);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1679);
				enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_forStatementNoShortIf);
		try {
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1682);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1683);
				enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Java8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java8Parser.SEMI, i);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			match(FOR);
			setState(1687);
			match(LPAREN);
			setState(1689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1688);
				forInit();
				}
			}

			setState(1691);
			match(SEMI);
			setState(1692);
			forExpression();
			setState(1693);
			match(SEMI);
			setState(1695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1694);
				forUpdate();
				}
			}

			setState(1697);
			match(RPAREN);
			setState(1698);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Java8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java8Parser.SEMI, i);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBasicForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			match(FOR);
			setState(1701);
			match(LPAREN);
			setState(1703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1702);
				forInit();
				}
			}

			setState(1705);
			match(SEMI);
			setState(1706);
			forExpression();
			setState(1707);
			match(SEMI);
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1708);
				forUpdate();
				}
			}

			setState(1711);
			match(RPAREN);
			setState(1712);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1714);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_forInit);
		try {
			setState(1719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1717);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1718);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			statementExpression();
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1724);
				match(COMMA);
				setState(1725);
				statementExpression();
				}
				}
				setState(1730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(FOR);
			setState(1732);
			match(LPAREN);
			setState(1736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1733);
				variableModifier();
				}
				}
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1739);
			unannType();
			setState(1740);
			variableDeclaratorId();
			setState(1741);
			match(COLON);
			setState(1742);
			expression();
			setState(1743);
			match(RPAREN);
			setState(1744);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnhancedForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(FOR);
			setState(1747);
			match(LPAREN);
			setState(1751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1748);
				variableModifier();
				}
				}
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1754);
			unannType();
			setState(1755);
			variableDeclaratorId();
			setState(1756);
			match(COLON);
			setState(1757);
			expression();
			setState(1758);
			match(RPAREN);
			setState(1759);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(Java8Parser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			match(BREAK);
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1762);
				match(Identifier);
				}
			}

			setState(1765);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(Java8Parser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			match(CONTINUE);
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1768);
				match(Identifier);
				}
			}

			setState(1771);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Java8Parser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			match(RETURN);
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1774);
				expression();
				}
			}

			setState(1777);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(Java8Parser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			match(THROW);
			setState(1780);
			expression();
			setState(1781);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(Java8Parser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(SYNCHRONIZED);
			setState(1784);
			match(LPAREN);
			setState(1785);
			expression();
			setState(1786);
			match(RPAREN);
			setState(1787);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(Java8Parser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_tryStatement);
		int _la;
		try {
			setState(1801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1789);
				match(TRY);
				setState(1790);
				block();
				setState(1791);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793);
				match(TRY);
				setState(1794);
				block();
				setState(1796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1795);
					catches();
					}
				}

				setState(1798);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1800);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			catchClause();
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1804);
				catchClause();
				}
				}
				setState(1809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(Java8Parser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(CATCH);
			setState(1811);
			match(LPAREN);
			setState(1812);
			catchFormalParameter();
			setState(1813);
			match(RPAREN);
			setState(1814);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1816);
				variableModifier();
				}
				}
				setState(1821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1822);
			catchType();
			setState(1823);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<TerminalNode> BITOR() { return getTokens(Java8Parser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(Java8Parser.BITOR, i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			unannClassType();
			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1826);
				match(BITOR);
				setState(1827);
				classType();
				}
				}
				setState(1832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(Java8Parser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinally_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFinally_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 348, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			match(FINALLY);
			setState(1834);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(Java8Parser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryWithResourcesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTryWithResourcesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			match(TRY);
			setState(1837);
			resourceSpecification();
			setState(1838);
			block();
			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1839);
				catches();
				}
			}

			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1842);
				finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(LPAREN);
			setState(1846);
			resourceList();
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1847);
				match(SEMI);
				}
			}

			setState(1850);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(Java8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java8Parser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			resource();
			setState(1857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1853);
					match(SEMI);
					setState(1854);
					resource();
					}
					} 
				}
				setState(1859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1860);
				variableModifier();
				}
				}
				setState(1865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1866);
			unannType();
			setState(1867);
			variableDeclaratorId();
			setState(1868);
			match(ASSIGN);
			setState(1869);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1871);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1872);
				arrayCreationExpression();
				}
				break;
			}
			setState(1878);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1875);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882);
				typeName();
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1883);
					match(LBRACK);
					setState(1884);
					match(RBRACK);
					}
					}
					setState(1889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1890);
				match(DOT);
				setState(1891);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1893);
				match(VOID);
				setState(1894);
				match(DOT);
				setState(1895);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1896);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1897);
				typeName();
				setState(1898);
				match(DOT);
				setState(1899);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1901);
				match(LPAREN);
				setState(1902);
				expression();
				setState(1903);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1905);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1906);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1907);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1908);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1909);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1914);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1915);
				typeName();
				setState(1920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1916);
					match(LBRACK);
					setState(1917);
					match(RBRACK);
					}
					}
					setState(1922);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1923);
				match(DOT);
				setState(1924);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1926);
				match(VOID);
				setState(1927);
				match(DOT);
				setState(1928);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1929);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1930);
				typeName();
				setState(1931);
				match(DOT);
				setState(1932);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1934);
				match(LPAREN);
				setState(1935);
				expression();
				setState(1936);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1938);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1939);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1940);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1941);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1944);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1945);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1946);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1947);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1948);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1953);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1954);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1955);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1956);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(1999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1960);
				typeName();
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1961);
					match(LBRACK);
					setState(1962);
					match(RBRACK);
					}
					}
					setState(1967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1968);
				match(DOT);
				setState(1969);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1971);
				unannPrimitiveType();
				setState(1976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1972);
					match(LBRACK);
					setState(1973);
					match(RBRACK);
					}
					}
					setState(1978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1979);
				match(DOT);
				setState(1980);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1982);
				match(VOID);
				setState(1983);
				match(DOT);
				setState(1984);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1985);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1986);
				typeName();
				setState(1987);
				match(DOT);
				setState(1988);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1990);
				match(LPAREN);
				setState(1991);
				expression();
				setState(1992);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1994);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1995);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1996);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1997);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1998);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2003);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2004);
				typeName();
				setState(2009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2005);
					match(LBRACK);
					setState(2006);
					match(RBRACK);
					}
					}
					setState(2011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2012);
				match(DOT);
				setState(2013);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2015);
				unannPrimitiveType();
				setState(2020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2016);
					match(LBRACK);
					setState(2017);
					match(RBRACK);
					}
					}
					setState(2022);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2023);
				match(DOT);
				setState(2024);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2026);
				match(VOID);
				setState(2027);
				match(DOT);
				setState(2028);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2029);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2030);
				typeName();
				setState(2031);
				match(DOT);
				setState(2032);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2034);
				match(LPAREN);
				setState(2035);
				expression();
				setState(2036);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2038);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2039);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2040);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2041);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2044);
				match(NEW);
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2045);
					typeArguments();
					}
				}

				setState(2051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2048);
					annotation();
					}
					}
					setState(2053);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2054);
				match(Identifier);
				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2055);
					match(DOT);
					setState(2059);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2056);
						annotation();
						}
						}
						setState(2061);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2062);
					match(Identifier);
					}
					}
					setState(2067);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2068);
					typeArgumentsOrDiamond();
					}
				}

				setState(2071);
				match(LPAREN);
				setState(2073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2072);
					argumentList();
					}
				}

				setState(2075);
				match(RPAREN);
				setState(2077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2076);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2079);
				expressionName();
				setState(2080);
				match(DOT);
				setState(2081);
				match(NEW);
				setState(2083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2082);
					typeArguments();
					}
				}

				setState(2088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2085);
					annotation();
					}
					}
					setState(2090);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2091);
				match(Identifier);
				setState(2093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2092);
					typeArgumentsOrDiamond();
					}
				}

				setState(2095);
				match(LPAREN);
				setState(2097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2096);
					argumentList();
					}
				}

				setState(2099);
				match(RPAREN);
				setState(2101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2100);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2103);
				primary();
				setState(2104);
				match(DOT);
				setState(2105);
				match(NEW);
				setState(2107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2106);
					typeArguments();
					}
				}

				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2109);
					annotation();
					}
					}
					setState(2114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2115);
				match(Identifier);
				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2116);
					typeArgumentsOrDiamond();
					}
				}

				setState(2119);
				match(LPAREN);
				setState(2121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2120);
					argumentList();
					}
				}

				setState(2123);
				match(RPAREN);
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2124);
					classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			match(DOT);
			setState(2130);
			match(NEW);
			setState(2132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2131);
				typeArguments();
				}
			}

			setState(2137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2134);
				annotation();
				}
				}
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2140);
			match(Identifier);
			setState(2142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2141);
				typeArgumentsOrDiamond();
				}
			}

			setState(2144);
			match(LPAREN);
			setState(2146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2145);
				argumentList();
				}
			}

			setState(2148);
			match(RPAREN);
			setState(2150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(2149);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2152);
				match(NEW);
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2153);
					typeArguments();
					}
				}

				setState(2159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2156);
					annotation();
					}
					}
					setState(2161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2162);
				match(Identifier);
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2163);
					match(DOT);
					setState(2167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2164);
						annotation();
						}
						}
						setState(2169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2170);
					match(Identifier);
					}
					}
					setState(2175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2176);
					typeArgumentsOrDiamond();
					}
				}

				setState(2179);
				match(LPAREN);
				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2180);
					argumentList();
					}
				}

				setState(2183);
				match(RPAREN);
				setState(2185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(2184);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187);
				expressionName();
				setState(2188);
				match(DOT);
				setState(2189);
				match(NEW);
				setState(2191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2190);
					typeArguments();
					}
				}

				setState(2196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2193);
					annotation();
					}
					}
					setState(2198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2199);
				match(Identifier);
				setState(2201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2200);
					typeArgumentsOrDiamond();
					}
				}

				setState(2203);
				match(LPAREN);
				setState(2205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2204);
					argumentList();
					}
				}

				setState(2207);
				match(RPAREN);
				setState(2209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(2208);
					classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_typeArgumentsOrDiamond);
		try {
			setState(2216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2213);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2214);
				match(LT);
				setState(2215);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_fieldAccess);
		try {
			setState(2231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2218);
				primary();
				setState(2219);
				match(DOT);
				setState(2220);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2222);
				match(SUPER);
				setState(2223);
				match(DOT);
				setState(2224);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2225);
				typeName();
				setState(2226);
				match(DOT);
				setState(2227);
				match(SUPER);
				setState(2228);
				match(DOT);
				setState(2229);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233);
			match(DOT);
			setState(2234);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_fieldAccess_lfno_primary);
		try {
			setState(2245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2236);
				match(SUPER);
				setState(2237);
				match(DOT);
				setState(2238);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2239);
				typeName();
				setState(2240);
				match(DOT);
				setState(2241);
				match(SUPER);
				setState(2242);
				match(DOT);
				setState(2243);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(2247);
				expressionName();
				setState(2248);
				match(LBRACK);
				setState(2249);
				expression();
				setState(2250);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2252);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2253);
				match(LBRACK);
				setState(2254);
				expression();
				setState(2255);
				match(RBRACK);
				}
				break;
			}
			setState(2266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2259);
				primaryNoNewArray_lf_arrayAccess();
				setState(2260);
				match(LBRACK);
				setState(2261);
				expression();
				setState(2262);
				match(RBRACK);
				}
				}
				setState(2268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2269);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2270);
			match(LBRACK);
			setState(2271);
			expression();
			setState(2272);
			match(RBRACK);
			}
			setState(2281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2274);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2275);
					match(LBRACK);
					setState(2276);
					expression();
					setState(2277);
					match(RBRACK);
					}
					} 
				}
				setState(2283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2284);
				expressionName();
				setState(2285);
				match(LBRACK);
				setState(2286);
				expression();
				setState(2287);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2289);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2290);
				match(LBRACK);
				setState(2291);
				expression();
				setState(2292);
				match(RBRACK);
				}
				break;
			}
			setState(2303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2296);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2297);
					match(LBRACK);
					setState(2298);
					expression();
					setState(2299);
					match(RBRACK);
					}
					} 
				}
				setState(2305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_methodInvocation);
		int _la;
		try {
			setState(2374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2306);
				methodName();
				setState(2307);
				match(LPAREN);
				setState(2309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2308);
					argumentList();
					}
				}

				setState(2311);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2313);
				typeName();
				setState(2314);
				match(DOT);
				setState(2316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2315);
					typeArguments();
					}
				}

				setState(2318);
				match(Identifier);
				setState(2319);
				match(LPAREN);
				setState(2321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2320);
					argumentList();
					}
				}

				setState(2323);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2325);
				expressionName();
				setState(2326);
				match(DOT);
				setState(2328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2327);
					typeArguments();
					}
				}

				setState(2330);
				match(Identifier);
				setState(2331);
				match(LPAREN);
				setState(2333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2332);
					argumentList();
					}
				}

				setState(2335);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2337);
				primary();
				setState(2338);
				match(DOT);
				setState(2340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2339);
					typeArguments();
					}
				}

				setState(2342);
				match(Identifier);
				setState(2343);
				match(LPAREN);
				setState(2345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2344);
					argumentList();
					}
				}

				setState(2347);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2349);
				match(SUPER);
				setState(2350);
				match(DOT);
				setState(2352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2351);
					typeArguments();
					}
				}

				setState(2354);
				match(Identifier);
				setState(2355);
				match(LPAREN);
				setState(2357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2356);
					argumentList();
					}
				}

				setState(2359);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2360);
				typeName();
				setState(2361);
				match(DOT);
				setState(2362);
				match(SUPER);
				setState(2363);
				match(DOT);
				setState(2365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2364);
					typeArguments();
					}
				}

				setState(2367);
				match(Identifier);
				setState(2368);
				match(LPAREN);
				setState(2370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2369);
					argumentList();
					}
				}

				setState(2372);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2376);
			match(DOT);
			setState(2378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2377);
				typeArguments();
				}
			}

			setState(2380);
			match(Identifier);
			setState(2381);
			match(LPAREN);
			setState(2383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2382);
				argumentList();
				}
			}

			setState(2385);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2387);
				methodName();
				setState(2388);
				match(LPAREN);
				setState(2390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2389);
					argumentList();
					}
				}

				setState(2392);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2394);
				typeName();
				setState(2395);
				match(DOT);
				setState(2397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2396);
					typeArguments();
					}
				}

				setState(2399);
				match(Identifier);
				setState(2400);
				match(LPAREN);
				setState(2402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2401);
					argumentList();
					}
				}

				setState(2404);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2406);
				expressionName();
				setState(2407);
				match(DOT);
				setState(2409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2408);
					typeArguments();
					}
				}

				setState(2411);
				match(Identifier);
				setState(2412);
				match(LPAREN);
				setState(2414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2413);
					argumentList();
					}
				}

				setState(2416);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2418);
				match(SUPER);
				setState(2419);
				match(DOT);
				setState(2421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2420);
					typeArguments();
					}
				}

				setState(2423);
				match(Identifier);
				setState(2424);
				match(LPAREN);
				setState(2426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2425);
					argumentList();
					}
				}

				setState(2428);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2429);
				typeName();
				setState(2430);
				match(DOT);
				setState(2431);
				match(SUPER);
				setState(2432);
				match(DOT);
				setState(2434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2433);
					typeArguments();
					}
				}

				setState(2436);
				match(Identifier);
				setState(2437);
				match(LPAREN);
				setState(2439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2438);
					argumentList();
					}
				}

				setState(2441);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2445);
			expression();
			setState(2450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2446);
				match(COMMA);
				setState(2447);
				expression();
				}
				}
				setState(2452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(Java8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_methodReference);
		int _la;
		try {
			setState(2500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2453);
				expressionName();
				setState(2454);
				match(COLONCOLON);
				setState(2456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2455);
					typeArguments();
					}
				}

				setState(2458);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2460);
				referenceType();
				setState(2461);
				match(COLONCOLON);
				setState(2463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2462);
					typeArguments();
					}
				}

				setState(2465);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2467);
				primary();
				setState(2468);
				match(COLONCOLON);
				setState(2470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2469);
					typeArguments();
					}
				}

				setState(2472);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2474);
				match(SUPER);
				setState(2475);
				match(COLONCOLON);
				setState(2477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2476);
					typeArguments();
					}
				}

				setState(2479);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2480);
				typeName();
				setState(2481);
				match(DOT);
				setState(2482);
				match(SUPER);
				setState(2483);
				match(COLONCOLON);
				setState(2485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2484);
					typeArguments();
					}
				}

				setState(2487);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2489);
				classType();
				setState(2490);
				match(COLONCOLON);
				setState(2492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2491);
					typeArguments();
					}
				}

				setState(2494);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2496);
				arrayType();
				setState(2497);
				match(COLONCOLON);
				setState(2498);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(Java8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
			match(COLONCOLON);
			setState(2504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2503);
				typeArguments();
				}
			}

			setState(2506);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(Java8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2508);
				expressionName();
				setState(2509);
				match(COLONCOLON);
				setState(2511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2510);
					typeArguments();
					}
				}

				setState(2513);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2515);
				referenceType();
				setState(2516);
				match(COLONCOLON);
				setState(2518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2517);
					typeArguments();
					}
				}

				setState(2520);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2522);
				match(SUPER);
				setState(2523);
				match(COLONCOLON);
				setState(2525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2524);
					typeArguments();
					}
				}

				setState(2527);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2528);
				typeName();
				setState(2529);
				match(DOT);
				setState(2530);
				match(SUPER);
				setState(2531);
				match(COLONCOLON);
				setState(2533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2532);
					typeArguments();
					}
				}

				setState(2535);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2537);
				classType();
				setState(2538);
				match(COLONCOLON);
				setState(2540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2539);
					typeArguments();
					}
				}

				setState(2542);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2544);
				arrayType();
				setState(2545);
				match(COLONCOLON);
				setState(2546);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_arrayCreationExpression);
		try {
			setState(2572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2550);
				match(NEW);
				setState(2551);
				primitiveType();
				setState(2552);
				dimExprs();
				setState(2554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2553);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2556);
				match(NEW);
				setState(2557);
				classOrInterfaceType();
				setState(2558);
				dimExprs();
				setState(2560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2559);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2562);
				match(NEW);
				setState(2563);
				primitiveType();
				setState(2564);
				dims();
				setState(2565);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2567);
				match(NEW);
				setState(2568);
				classOrInterfaceType();
				setState(2569);
				dims();
				setState(2570);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2574);
			dimExpr();
			setState(2578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2575);
					dimExpr();
					}
					} 
				}
				setState(2580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Java8Parser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Java8Parser.RBRACK, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2581);
				annotation();
				}
				}
				setState(2586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2587);
			match(LBRACK);
			setState(2588);
			expression();
			setState(2589);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2591);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_expression);
		try {
			setState(2595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2593);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2594);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(Java8Parser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2597);
			lambdaParameters();
			setState(2598);
			match(ARROW);
			setState(2599);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_lambdaParameters);
		int _la;
		try {
			setState(2611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2601);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2602);
				match(LPAREN);
				setState(2604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2603);
					formalParameterList();
					}
				}

				setState(2606);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2607);
				match(LPAREN);
				setState(2608);
				inferredFormalParameterList();
				setState(2609);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInferredFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2613);
			match(Identifier);
			setState(2618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2614);
				match(COMMA);
				setState(2615);
				match(Identifier);
				}
				}
				setState(2620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_lambdaBody);
		try {
			setState(2623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2621);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2622);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_assignmentExpression);
		try {
			setState(2627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2625);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2626);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
			leftHandSide();
			setState(2630);
			assignmentOperator();
			setState(2631);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_leftHandSide);
		try {
			setState(2636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2633);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2634);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2635);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(Java8Parser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(Java8Parser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(Java8Parser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(Java8Parser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(Java8Parser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(Java8Parser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(Java8Parser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(Java8Parser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(Java8Parser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(Java8Parser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(Java8Parser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Java8Parser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_conditionalExpression);
		try {
			setState(2647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2640);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2641);
				conditionalOrExpression(0);
				setState(2642);
				match(QUESTION);
				setState(2643);
				expression();
				setState(2644);
				match(COLON);
				setState(2645);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(Java8Parser.OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2650);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2652);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2653);
					match(OR);
					setState(2654);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(Java8Parser.AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2661);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2663);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2664);
					match(AND);
					setState(2665);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(Java8Parser.BITOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2672);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2674);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2675);
					match(BITOR);
					setState(2676);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(Java8Parser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2683);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2685);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2686);
					match(CARET);
					setState(2687);
					andExpression(0);
					}
					} 
				}
				setState(2692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(Java8Parser.BITAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2694);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2696);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2697);
					match(BITAND);
					setState(2698);
					equalityExpression(0);
					}
					} 
				}
				setState(2703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Java8Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Java8Parser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2705);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2713);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2707);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2708);
						match(EQUAL);
						setState(2709);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2710);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2711);
						match(NOTEQUAL);
						setState(2712);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TerminalNode LE() { return getToken(Java8Parser.LE, 0); }
		public TerminalNode GE() { return getToken(Java8Parser.GE, 0); }
		public TerminalNode INSTANCEOF() { return getToken(Java8Parser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2719);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2736);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2721);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2722);
						match(LT);
						setState(2723);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2724);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2725);
						match(GT);
						setState(2726);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2727);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2728);
						match(LE);
						setState(2729);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2730);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2731);
						match(GE);
						setState(2732);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2733);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2734);
						match(INSTANCEOF);
						setState(2735);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(Java8Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Java8Parser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(Java8Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(Java8Parser.GT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2742);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2757);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2744);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2745);
						match(LT);
						setState(2746);
						match(LT);
						setState(2747);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2748);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2749);
						match(GT);
						setState(2750);
						match(GT);
						setState(2751);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2752);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2753);
						match(GT);
						setState(2754);
						match(GT);
						setState(2755);
						match(GT);
						setState(2756);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(Java8Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Java8Parser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 456;
		enterRecursionRule(_localctx, 456, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2763);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2771);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2765);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2766);
						match(ADD);
						setState(2767);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2768);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2769);
						match(SUB);
						setState(2770);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(Java8Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Java8Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Java8Parser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 458;
		enterRecursionRule(_localctx, 458, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2777);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2788);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2779);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2780);
						match(MUL);
						setState(2781);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2782);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2783);
						match(DIV);
						setState(2784);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2785);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2786);
						match(MOD);
						setState(2787);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(Java8Parser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(Java8Parser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_unaryExpression);
		try {
			setState(2800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2793);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2794);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2795);
				match(ADD);
				setState(2796);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2797);
				match(SUB);
				setState(2798);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2799);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2802);
			match(INC);
			setState(2803);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2805);
			match(DEC);
			setState(2806);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(Java8Parser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(Java8Parser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2808);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2809);
				match(TILDE);
				setState(2810);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2811);
				match(BANG);
				setState(2812);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2813);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(2816);
				primary();
				}
				break;
			case 2:
				{
				setState(2817);
				expressionName();
				}
				break;
			}
			setState(2824);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2822);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2820);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2821);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			postfixExpression();
			setState(2828);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2830);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2832);
			postfixExpression();
			setState(2833);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2835);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_castExpression);
		int _la;
		try {
			setState(2864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2837);
				match(LPAREN);
				setState(2838);
				primitiveType();
				setState(2839);
				match(RPAREN);
				setState(2840);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2842);
				match(LPAREN);
				setState(2843);
				referenceType();
				setState(2847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2844);
					additionalBound();
					}
					}
					setState(2849);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2850);
				match(RPAREN);
				setState(2851);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2853);
				match(LPAREN);
				setState(2854);
				referenceType();
				setState(2858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2855);
					additionalBound();
					}
					}
					setState(2860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2861);
				match(RPAREN);
				setState(2862);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 28:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 31:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 220:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 221:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 222:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 223:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 224:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 225:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 226:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 227:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 228:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 229:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3m\u0b35\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\3\2\3\2\3\3\3\3\5\3\u01e7\n\3\3\4\7\4\u01ea\n\4\f\4\16\4\u01ed"+
		"\13\4\3\4\3\4\7\4\u01f1\n\4\f\4\16\4\u01f4\13\4\3\4\5\4\u01f7\n\4\3\5"+
		"\3\5\5\5\u01fb\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b\u0204\n\b\3\t\3\t\5"+
		"\t\u0208\n\t\3\t\3\t\7\t\u020c\n\t\f\t\16\t\u020f\13\t\3\n\7\n\u0212\n"+
		"\n\f\n\16\n\u0215\13\n\3\n\3\n\5\n\u0219\n\n\3\n\3\n\3\n\7\n\u021e\n\n"+
		"\f\n\16\n\u0221\13\n\3\n\3\n\5\n\u0225\n\n\5\n\u0227\n\n\3\13\3\13\7\13"+
		"\u022b\n\13\f\13\16\13\u022e\13\13\3\13\3\13\5\13\u0232\n\13\3\f\7\f\u0235"+
		"\n\f\f\f\16\f\u0238\13\f\3\f\3\f\5\f\u023c\n\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\7\20\u0245\n\20\f\20\16\20\u0248\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0255\n\21\3\22\7\22\u0258\n"+
		"\22\f\22\16\22\u025b\13\22\3\22\3\22\3\22\7\22\u0260\n\22\f\22\16\22\u0263"+
		"\13\22\3\22\3\22\7\22\u0267\n\22\f\22\16\22\u026a\13\22\3\23\7\23\u026d"+
		"\n\23\f\23\16\23\u0270\13\23\3\23\3\23\5\23\u0274\n\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u027d\n\25\f\25\16\25\u0280\13\25\5\25\u0282"+
		"\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u028e\n\30"+
		"\f\30\16\30\u0291\13\30\3\31\3\31\5\31\u0295\n\31\3\32\7\32\u0298\n\32"+
		"\f\32\16\32\u029b\13\32\3\32\3\32\5\32\u029f\n\32\3\33\3\33\3\33\3\33"+
		"\5\33\u02a5\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u02ad\n\34\f\34\16"+
		"\34\u02b0\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u02b7\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u02bf\n\36\f\36\16\36\u02c2\13\36\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u02c9\n\37\3 \3 \3!\3!\3!\3!\3!\3!\7!\u02d3\n!\f!\16!"+
		"\u02d6\13!\3\"\5\"\u02d9\n\"\3\"\7\"\u02dc\n\"\f\"\16\"\u02df\13\"\3\""+
		"\7\"\u02e2\n\"\f\"\16\"\u02e5\13\"\3\"\3\"\3#\7#\u02ea\n#\f#\16#\u02ed"+
		"\13#\3#\3#\3#\3#\7#\u02f3\n#\f#\16#\u02f6\13#\3#\3#\3$\3$\3%\3%\3%\3%"+
		"\5%\u0300\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\5*\u031d\n*\3+\3+\5+\u0321\n+\3,\7,\u0324"+
		"\n,\f,\16,\u0327\13,\3,\3,\3,\5,\u032c\n,\3,\5,\u032f\n,\3,\5,\u0332\n"+
		",\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u033e\n-\3.\3.\3.\3.\3/\3/\3/\7/\u0347"+
		"\n/\f/\16/\u034a\13/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\7\62"+
		"\u0355\n\62\f\62\16\62\u0358\13\62\3\63\3\63\7\63\u035c\n\63\f\63\16\63"+
		"\u035f\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0367\n\64\3\65\3\65\3"+
		"\65\3\65\3\65\5\65\u036e\n\65\3\66\7\66\u0371\n\66\f\66\16\66\u0374\13"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0382"+
		"\n\67\38\38\38\78\u0387\n8\f8\168\u038a\138\39\39\39\59\u038f\n9\3:\3"+
		":\5:\u0393\n:\3;\3;\5;\u0397\n;\3<\3<\5<\u039b\n<\3=\3=\5=\u039f\n=\3"+
		">\3>\3>\5>\u03a4\n>\3?\3?\5?\u03a8\n?\3?\3?\7?\u03ac\n?\f?\16?\u03af\13"+
		"?\3@\3@\5@\u03b3\n@\3@\3@\3@\7@\u03b8\n@\f@\16@\u03bb\13@\3@\3@\5@\u03bf"+
		"\n@\5@\u03c1\n@\3A\3A\7A\u03c5\nA\fA\16A\u03c8\13A\3A\3A\5A\u03cc\nA\3"+
		"B\3B\5B\u03d0\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\5"+
		"G\u03e3\nG\3H\7H\u03e6\nH\fH\16H\u03e9\13H\3H\3H\3H\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\5I\u03f8\nI\3J\3J\3J\5J\u03fd\nJ\3J\3J\7J\u0401\nJ\fJ\16"+
		"J\u0404\13J\3J\3J\3J\5J\u0409\nJ\5J\u040b\nJ\3K\3K\5K\u040f\nK\3L\3L\3"+
		"L\5L\u0414\nL\3L\3L\5L\u0418\nL\3M\3M\3M\3M\3M\5M\u041f\nM\3N\3N\3N\7"+
		"N\u0424\nN\fN\16N\u0427\13N\3N\3N\3N\7N\u042c\nN\fN\16N\u042f\13N\5N\u0431"+
		"\nN\3O\7O\u0434\nO\fO\16O\u0437\13O\3O\3O\3O\3P\3P\5P\u043e\nP\3Q\7Q\u0441"+
		"\nQ\fQ\16Q\u0444\13Q\3Q\3Q\7Q\u0448\nQ\fQ\16Q\u044b\13Q\3Q\3Q\3Q\3Q\5"+
		"Q\u0451\nQ\3R\7R\u0454\nR\fR\16R\u0457\13R\3R\3R\3R\5R\u045c\nR\3R\3R"+
		"\3S\3S\3S\3T\3T\3T\7T\u0466\nT\fT\16T\u0469\13T\3U\3U\5U\u046d\nU\3V\3"+
		"V\5V\u0471\nV\3W\3W\3X\3X\3X\3Y\7Y\u0479\nY\fY\16Y\u047c\13Y\3Y\3Y\5Y"+
		"\u0480\nY\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u0488\nZ\3[\5[\u048b\n[\3[\3[\3[\5[\u0490"+
		"\n[\3[\3[\3\\\3\\\3]\3]\5]\u0498\n]\3]\5]\u049b\n]\3]\3]\3^\5^\u04a0\n"+
		"^\3^\3^\3^\5^\u04a5\n^\3^\3^\3^\5^\u04aa\n^\3^\3^\3^\5^\u04af\n^\3^\3"+
		"^\3^\3^\3^\5^\u04b6\n^\3^\3^\3^\5^\u04bb\n^\3^\3^\3^\3^\3^\3^\5^\u04c3"+
		"\n^\3^\3^\3^\5^\u04c8\n^\3^\3^\3^\5^\u04cd\n^\3_\7_\u04d0\n_\f_\16_\u04d3"+
		"\13_\3_\3_\3_\5_\u04d8\n_\3_\3_\3`\3`\5`\u04de\n`\3`\5`\u04e1\n`\3`\5"+
		"`\u04e4\n`\3`\3`\3a\3a\3a\7a\u04eb\na\fa\16a\u04ee\13a\3b\7b\u04f1\nb"+
		"\fb\16b\u04f4\13b\3b\3b\3b\5b\u04f9\nb\3b\5b\u04fc\nb\3b\5b\u04ff\nb\3"+
		"c\3c\3d\3d\7d\u0505\nd\fd\16d\u0508\13d\3e\3e\5e\u050c\ne\3f\7f\u050f"+
		"\nf\ff\16f\u0512\13f\3f\3f\3f\5f\u0517\nf\3f\5f\u051a\nf\3f\3f\3g\3g\3"+
		"g\3g\3g\3g\3g\5g\u0525\ng\3h\3h\3h\3i\3i\7i\u052c\ni\fi\16i\u052f\13i"+
		"\3i\3i\3j\3j\3j\3j\3j\5j\u0538\nj\3k\7k\u053b\nk\fk\16k\u053e\13k\3k\3"+
		"k\3k\3k\3l\3l\3l\3l\5l\u0548\nl\3m\7m\u054b\nm\fm\16m\u054e\13m\3m\3m"+
		"\3m\3n\3n\3n\3n\3n\3n\5n\u0559\nn\3o\7o\u055c\no\fo\16o\u055f\13o\3o\3"+
		"o\3o\3o\3o\3p\3p\7p\u0568\np\fp\16p\u056b\13p\3p\3p\3q\3q\3q\3q\3q\5q"+
		"\u0574\nq\3r\7r\u0577\nr\fr\16r\u057a\13r\3r\3r\3r\3r\3r\5r\u0581\nr\3"+
		"r\5r\u0584\nr\3r\3r\3s\3s\3s\5s\u058b\ns\3t\3t\3t\3u\3u\3u\5u\u0593\n"+
		"u\3v\3v\3v\3v\5v\u0599\nv\3v\3v\3w\3w\3w\7w\u05a0\nw\fw\16w\u05a3\13w"+
		"\3x\3x\3x\3x\3y\3y\3y\5y\u05ac\ny\3z\3z\5z\u05b0\nz\3z\5z\u05b3\nz\3z"+
		"\3z\3{\3{\3{\7{\u05ba\n{\f{\16{\u05bd\13{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3"+
		"~\3~\5~\u05ca\n~\3~\5~\u05cd\n~\3~\3~\3\177\3\177\3\177\7\177\u05d4\n"+
		"\177\f\177\16\177\u05d7\13\177\3\u0080\3\u0080\5\u0080\u05db\n\u0080\3"+
		"\u0080\3\u0080\3\u0081\3\u0081\7\u0081\u05e1\n\u0081\f\u0081\16\u0081"+
		"\u05e4\13\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u05e9\n\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\7\u0084\u05ef\n\u0084\f\u0084\16\u0084\u05f2"+
		"\13\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u05fd\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0604\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0612\n\u0087"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u0628\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\5\u0091\u064c\n\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\7\u0093\u0656\n\u0093\f\u0093"+
		"\16\u0093\u0659\13\u0093\3\u0093\7\u0093\u065c\n\u0093\f\u0093\16\u0093"+
		"\u065f\13\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\7\u0095\u0668\n\u0095\f\u0095\16\u0095\u066b\13\u0095\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096"+
		"\u0677\n\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\5\u009c\u0693\n\u009c\3\u009d\3\u009d\5\u009d\u0697\n\u009d\3"+
		"\u009e\3\u009e\3\u009e\5\u009e\u069c\n\u009e\3\u009e\3\u009e\3\u009e\3"+
		"\u009e\5\u009e\u06a2\n\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3"+
		"\u009f\5\u009f\u06aa\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u06b0"+
		"\n\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\5\u00a0\u06b6\n\u00a0\3\u00a1"+
		"\3\u00a1\5\u00a1\u06ba\n\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\7\u00a3\u06c1\n\u00a3\f\u00a3\16\u00a3\u06c4\13\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a4\7\u00a4\u06c9\n\u00a4\f\u00a4\16\u00a4\u06cc\13\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\7\u00a5\u06d8\n\u00a5\f\u00a5\16\u00a5\u06db\13\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\5\u00a6\u06e6"+
		"\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\5\u00a7\u06ec\n\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a8\3\u00a8\5\u00a8\u06f2\n\u00a8\3\u00a8\3\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0707"+
		"\n\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u070c\n\u00ab\3\u00ac\3\u00ac"+
		"\7\u00ac\u0710\n\u00ac\f\u00ac\16\u00ac\u0713\13\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\7\u00ae\u071c\n\u00ae\f\u00ae"+
		"\16\u00ae\u071f\13\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af"+
		"\7\u00af\u0727\n\u00af\f\u00af\16\u00af\u072a\13\u00af\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0733\n\u00b1\3\u00b1"+
		"\5\u00b1\u0736\n\u00b1\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u073b\n\u00b2\3"+
		"\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0742\n\u00b3\f\u00b3\16"+
		"\u00b3\u0745\13\u00b3\3\u00b4\7\u00b4\u0748\n\u00b4\f\u00b4\16\u00b4\u074b"+
		"\13\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\5\u00b5"+
		"\u0754\n\u00b5\3\u00b5\7\u00b5\u0757\n\u00b5\f\u00b5\16\u00b5\u075a\13"+
		"\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u0760\n\u00b6\f\u00b6\16"+
		"\u00b6\u0763\13\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0779\n\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u0781\n\u00b8\f\u00b8"+
		"\16\u00b8\u0784\13\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0799\n\u00b8\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u07a0\n\u00b9\3\u00ba\3\u00ba\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u07a8\n\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\7\u00bc\u07ae\n\u00bc\f\u00bc\16\u00bc\u07b1\13\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u07b9\n\u00bc\f\u00bc"+
		"\16\u00bc\u07bc\13\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u07d2\n\u00bc\3\u00bd"+
		"\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u07da\n\u00be\f\u00be"+
		"\16\u00be\u07dd\13\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\7\u00be\u07e5\n\u00be\f\u00be\16\u00be\u07e8\13\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u07fd\n\u00be\3\u00bf\3\u00bf\5\u00bf\u0801\n\u00bf\3\u00bf\7\u00bf\u0804"+
		"\n\u00bf\f\u00bf\16\u00bf\u0807\13\u00bf\3\u00bf\3\u00bf\3\u00bf\7\u00bf"+
		"\u080c\n\u00bf\f\u00bf\16\u00bf\u080f\13\u00bf\3\u00bf\7\u00bf\u0812\n"+
		"\u00bf\f\u00bf\16\u00bf\u0815\13\u00bf\3\u00bf\5\u00bf\u0818\n\u00bf\3"+
		"\u00bf\3\u00bf\5\u00bf\u081c\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0820\n\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0826\n\u00bf\3\u00bf\7\u00bf"+
		"\u0829\n\u00bf\f\u00bf\16\u00bf\u082c\13\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u0830\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0834\n\u00bf\3\u00bf\3\u00bf\5"+
		"\u00bf\u0838\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u083e\n\u00bf"+
		"\3\u00bf\7\u00bf\u0841\n\u00bf\f\u00bf\16\u00bf\u0844\13\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u0848\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u084c\n\u00bf\3"+
		"\u00bf\3\u00bf\5\u00bf\u0850\n\u00bf\5\u00bf\u0852\n\u00bf\3\u00c0\3\u00c0"+
		"\3\u00c0\5\u00c0\u0857\n\u00c0\3\u00c0\7\u00c0\u085a\n\u00c0\f\u00c0\16"+
		"\u00c0\u085d\13\u00c0\3\u00c0\3\u00c0\5\u00c0\u0861\n\u00c0\3\u00c0\3"+
		"\u00c0\5\u00c0\u0865\n\u00c0\3\u00c0\3\u00c0\5\u00c0\u0869\n\u00c0\3\u00c1"+
		"\3\u00c1\5\u00c1\u086d\n\u00c1\3\u00c1\7\u00c1\u0870\n\u00c1\f\u00c1\16"+
		"\u00c1\u0873\13\u00c1\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u0878\n\u00c1\f"+
		"\u00c1\16\u00c1\u087b\13\u00c1\3\u00c1\7\u00c1\u087e\n\u00c1\f\u00c1\16"+
		"\u00c1\u0881\13\u00c1\3\u00c1\5\u00c1\u0884\n\u00c1\3\u00c1\3\u00c1\5"+
		"\u00c1\u0888\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u088c\n\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\5\u00c1\u0892\n\u00c1\3\u00c1\7\u00c1\u0895\n\u00c1\f"+
		"\u00c1\16\u00c1\u0898\13\u00c1\3\u00c1\3\u00c1\5\u00c1\u089c\n\u00c1\3"+
		"\u00c1\3\u00c1\5\u00c1\u08a0\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u08a4\n\u00c1"+
		"\5\u00c1\u08a6\n\u00c1\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u08ab\n\u00c2\3"+
		"\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u08ba\n\u00c3\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u08c8\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u08d4\n\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u08db\n\u00c6\f\u00c6\16\u00c6"+
		"\u08de\13\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\7\u00c7\u08ea\n\u00c7\f\u00c7\16\u00c7\u08ed"+
		"\13\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u08f9\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\7\u00c8\u0900\n\u00c8\f\u00c8\16\u00c8\u0903\13\u00c8\3\u00c9"+
		"\3\u00c9\3\u00c9\5\u00c9\u0908\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u090f\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0914\n"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u091b\n\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\5\u00c9\u0920\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\5\u00c9\u0927\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u092c"+
		"\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0933\n\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0938\n\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0940\n\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\5\u00c9\u0945\n\u00c9\3\u00c9\3\u00c9\5\u00c9\u0949\n\u00c9\3\u00ca\3"+
		"\u00ca\5\u00ca\u094d\n\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0952\n\u00ca"+
		"\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0959\n\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0960\n\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\5\u00cb\u0965\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u096c\n\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0971\n\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0978\n\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\5\u00cb\u097d\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\5\u00cb\u0985\n\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u098a"+
		"\n\u00cb\3\u00cb\3\u00cb\5\u00cb\u098e\n\u00cb\3\u00cc\3\u00cc\3\u00cc"+
		"\7\u00cc\u0993\n\u00cc\f\u00cc\16\u00cc\u0996\13\u00cc\3\u00cd\3\u00cd"+
		"\3\u00cd\5\u00cd\u099b\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\5\u00cd\u09a2\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u09a9\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09b0\n"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09b8\n"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09bf\n\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09c7\n\u00cd\3"+
		"\u00ce\3\u00ce\5\u00ce\u09cb\n\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3"+
		"\u00cf\5\u00cf\u09d2\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5"+
		"\u00cf\u09d9\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09e0"+
		"\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09e8"+
		"\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09ef\n\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09f7\n\u00cf"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u09fd\n\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\5\u00d0\u0a03\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0a0f\n\u00d0"+
		"\3\u00d1\3\u00d1\7\u00d1\u0a13\n\u00d1\f\u00d1\16\u00d1\u0a16\13\u00d1"+
		"\3\u00d2\7\u00d2\u0a19\n\u00d2\f\u00d2\16\u00d2\u0a1c\13\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d4\3\u00d4\5\u00d4\u0a26"+
		"\n\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\5\u00d6"+
		"\u0a2f\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a36\n"+
		"\u00d6\3\u00d7\3\u00d7\3\u00d7\7\u00d7\u0a3b\n\u00d7\f\u00d7\16\u00d7"+
		"\u0a3e\13\u00d7\3\u00d8\3\u00d8\5\u00d8\u0a42\n\u00d8\3\u00d9\3\u00d9"+
		"\5\u00d9\u0a46\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db"+
		"\3\u00db\5\u00db\u0a4f\n\u00db\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0a5a\n\u00dd\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0a62\n\u00de\f\u00de\16\u00de"+
		"\u0a65\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\7\u00df"+
		"\u0a6d\n\u00df\f\u00df\16\u00df\u0a70\13\u00df\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0a78\n\u00e0\f\u00e0\16\u00e0\u0a7b"+
		"\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0a83"+
		"\n\u00e1\f\u00e1\16\u00e1\u0a86\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\7\u00e2\u0a8e\n\u00e2\f\u00e2\16\u00e2\u0a91\13\u00e2"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\7\u00e3\u0a9c\n\u00e3\f\u00e3\16\u00e3\u0a9f\13\u00e3\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0ab3"+
		"\n\u00e4\f\u00e4\16\u00e4\u0ab6\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\7\u00e5\u0ac8\n\u00e5\f\u00e5\16\u00e5\u0acb"+
		"\13\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\7\u00e6\u0ad6\n\u00e6\f\u00e6\16\u00e6\u0ad9\13\u00e6\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\7\u00e7\u0ae7\n\u00e7\f\u00e7\16\u00e7\u0aea\13\u00e7"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0af3"+
		"\n\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\5\u00eb\u0b01\n\u00eb\3\u00ec\3\u00ec"+
		"\5\u00ec\u0b05\n\u00ec\3\u00ec\3\u00ec\7\u00ec\u0b09\n\u00ec\f\u00ec\16"+
		"\u00ec\u0b0c\13\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f1\3\u00f1\7\u00f1\u0b20\n\u00f1\f\u00f1\16\u00f1\u0b23"+
		"\13\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\7\u00f1\u0b2b"+
		"\n\u00f1\f\u00f1\16\u00f1\u0b2e\13\u00f1\3\u00f1\3\u00f1\3\u00f1\5\u00f1"+
		"\u0b33\n\u00f1\3\u00f1\2\17\66:@\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\u00f2\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\u01dc\u01de\u01e0\2\6\3\2\65:\7\2\7\7\n\n\35\35\37"+
		"\37\'\'\4\2\20\20\26\26\4\2DD]g\2\u0c22\2\u01e2\3\2\2\2\4\u01e6\3\2\2"+
		"\2\6\u01f6\3\2\2\2\b\u01fa\3\2\2\2\n\u01fc\3\2\2\2\f\u01fe\3\2\2\2\16"+
		"\u0203\3\2\2\2\20\u0207\3\2\2\2\22\u0226\3\2\2\2\24\u0228\3\2\2\2\26\u0236"+
		"\3\2\2\2\30\u023d\3\2\2\2\32\u023f\3\2\2\2\34\u0241\3\2\2\2\36\u0246\3"+
		"\2\2\2 \u0254\3\2\2\2\"\u0259\3\2\2\2$\u026e\3\2\2\2&\u0275\3\2\2\2(\u0281"+
		"\3\2\2\2*\u0283\3\2\2\2,\u0286\3\2\2\2.\u028a\3\2\2\2\60\u0294\3\2\2\2"+
		"\62\u0299\3\2\2\2\64\u02a4\3\2\2\2\66\u02a6\3\2\2\28\u02b6\3\2\2\2:\u02b8"+
		"\3\2\2\2<\u02c8\3\2\2\2>\u02ca\3\2\2\2@\u02cc\3\2\2\2B\u02d8\3\2\2\2D"+
		"\u02eb\3\2\2\2F\u02f9\3\2\2\2H\u02ff\3\2\2\2J\u0301\3\2\2\2L\u0305\3\2"+
		"\2\2N\u030b\3\2\2\2P\u0312\3\2\2\2R\u031c\3\2\2\2T\u0320\3\2\2\2V\u0325"+
		"\3\2\2\2X\u033d\3\2\2\2Z\u033f\3\2\2\2\\\u0343\3\2\2\2^\u034b\3\2\2\2"+
		"`\u034e\3\2\2\2b\u0351\3\2\2\2d\u0359\3\2\2\2f\u0366\3\2\2\2h\u036d\3"+
		"\2\2\2j\u0372\3\2\2\2l\u0381\3\2\2\2n\u0383\3\2\2\2p\u038b\3\2\2\2r\u0390"+
		"\3\2\2\2t\u0396\3\2\2\2v\u039a\3\2\2\2x\u039e\3\2\2\2z\u03a3\3\2\2\2|"+
		"\u03a7\3\2\2\2~\u03c0\3\2\2\2\u0080\u03c2\3\2\2\2\u0082\u03cd\3\2\2\2"+
		"\u0084\u03d1\3\2\2\2\u0086\u03d3\3\2\2\2\u0088\u03d5\3\2\2\2\u008a\u03d7"+
		"\3\2\2\2\u008c\u03e2\3\2\2\2\u008e\u03e7\3\2\2\2\u0090\u03f7\3\2\2\2\u0092"+
		"\u040a\3\2\2\2\u0094\u040e\3\2\2\2\u0096\u0410\3\2\2\2\u0098\u041e\3\2"+
		"\2\2\u009a\u0430\3\2\2\2\u009c\u0435\3\2\2\2\u009e\u043d\3\2\2\2\u00a0"+
		"\u0450\3\2\2\2\u00a2\u0455\3\2\2\2\u00a4\u045f\3\2\2\2\u00a6\u0462\3\2"+
		"\2\2\u00a8\u046c\3\2\2\2\u00aa\u0470\3\2\2\2\u00ac\u0472\3\2\2\2\u00ae"+
		"\u0474\3\2\2\2\u00b0\u047a\3\2\2\2\u00b2\u0487\3\2\2\2\u00b4\u048a\3\2"+
		"\2\2\u00b6\u0493\3\2\2\2\u00b8\u0495\3\2\2\2\u00ba\u04cc\3\2\2\2\u00bc"+
		"\u04d1\3\2\2\2\u00be\u04db\3\2\2\2\u00c0\u04e7\3\2\2\2\u00c2\u04f2\3\2"+
		"\2\2\u00c4\u0500\3\2\2\2\u00c6\u0502\3\2\2\2\u00c8\u050b\3\2\2\2\u00ca"+
		"\u0510\3\2\2\2\u00cc\u0524\3\2\2\2\u00ce\u0526\3\2\2\2\u00d0\u0529\3\2"+
		"\2\2\u00d2\u0537\3\2\2\2\u00d4\u053c\3\2\2\2\u00d6\u0547\3\2\2\2\u00d8"+
		"\u054c\3\2\2\2\u00da\u0558\3\2\2\2\u00dc\u055d\3\2\2\2\u00de\u0565\3\2"+
		"\2\2\u00e0\u0573\3\2\2\2\u00e2\u0578\3\2\2\2\u00e4\u058a\3\2\2\2\u00e6"+
		"\u058c\3\2\2\2\u00e8\u0592\3\2\2\2\u00ea\u0594\3\2\2\2\u00ec\u059c\3\2"+
		"\2\2\u00ee\u05a4\3\2\2\2\u00f0\u05ab\3\2\2\2\u00f2\u05ad\3\2\2\2\u00f4"+
		"\u05b6\3\2\2\2\u00f6\u05be\3\2\2\2\u00f8\u05c1\3\2\2\2\u00fa\u05c7\3\2"+
		"\2\2\u00fc\u05d0\3\2\2\2\u00fe\u05d8\3\2\2\2\u0100\u05de\3\2\2\2\u0102"+
		"\u05e8\3\2\2\2\u0104\u05ea\3\2\2\2\u0106\u05f0\3\2\2\2\u0108\u05fc\3\2"+
		"\2\2\u010a\u0603\3\2\2\2\u010c\u0611\3\2\2\2\u010e\u0613\3\2\2\2\u0110"+
		"\u0615\3\2\2\2\u0112\u0619\3\2\2\2\u0114\u061d\3\2\2\2\u0116\u0627\3\2"+
		"\2\2\u0118\u0629\3\2\2\2\u011a\u062f\3\2\2\2\u011c\u0637\3\2\2\2\u011e"+
		"\u063f\3\2\2\2\u0120\u064b\3\2\2\2\u0122\u064d\3\2\2\2\u0124\u0653\3\2"+
		"\2\2\u0126\u0662\3\2\2\2\u0128\u0665\3\2\2\2\u012a\u0676\3\2\2\2\u012c"+
		"\u0678\3\2\2\2\u012e\u067a\3\2\2\2\u0130\u0680\3\2\2\2\u0132\u0686\3\2"+
		"\2\2\u0134\u0688\3\2\2\2\u0136\u0692\3\2\2\2\u0138\u0696\3\2\2\2\u013a"+
		"\u0698\3\2\2\2\u013c\u06a6\3\2\2\2\u013e\u06b5\3\2\2\2\u0140\u06b9\3\2"+
		"\2\2\u0142\u06bb\3\2\2\2\u0144\u06bd\3\2\2\2\u0146\u06c5\3\2\2\2\u0148"+
		"\u06d4\3\2\2\2\u014a\u06e3\3\2\2\2\u014c\u06e9\3\2\2\2\u014e\u06ef\3\2"+
		"\2\2\u0150\u06f5\3\2\2\2\u0152\u06f9\3\2\2\2\u0154\u070b\3\2\2\2\u0156"+
		"\u070d\3\2\2\2\u0158\u0714\3\2\2\2\u015a\u071d\3\2\2\2\u015c\u0723\3\2"+
		"\2\2\u015e\u072b\3\2\2\2\u0160\u072e\3\2\2\2\u0162\u0737\3\2\2\2\u0164"+
		"\u073e\3\2\2\2\u0166\u0749\3\2\2\2\u0168\u0753\3\2\2\2\u016a\u0778\3\2"+
		"\2\2\u016c\u077a\3\2\2\2\u016e\u0798\3\2\2\2\u0170\u079f\3\2\2\2\u0172"+
		"\u07a1\3\2\2\2\u0174\u07a7\3\2\2\2\u0176\u07d1\3\2\2\2\u0178\u07d3\3\2"+
		"\2\2\u017a\u07fc\3\2\2\2\u017c\u0851\3\2\2\2\u017e\u0853\3\2\2\2\u0180"+
		"\u08a5\3\2\2\2\u0182\u08aa\3\2\2\2\u0184\u08b9\3\2\2\2\u0186\u08bb\3\2"+
		"\2\2\u0188\u08c7\3\2\2\2\u018a\u08d3\3\2\2\2\u018c\u08df\3\2\2\2\u018e"+
		"\u08f8\3\2\2\2\u0190\u0948\3\2\2\2\u0192\u094a\3\2\2\2\u0194\u098d\3\2"+
		"\2\2\u0196\u098f\3\2\2\2\u0198\u09c6\3\2\2\2\u019a\u09c8\3\2\2\2\u019c"+
		"\u09f6\3\2\2\2\u019e\u0a0e\3\2\2\2\u01a0\u0a10\3\2\2\2\u01a2\u0a1a\3\2"+
		"\2\2\u01a4\u0a21\3\2\2\2\u01a6\u0a25\3\2\2\2\u01a8\u0a27\3\2\2\2\u01aa"+
		"\u0a35\3\2\2\2\u01ac\u0a37\3\2\2\2\u01ae\u0a41\3\2\2\2\u01b0\u0a45\3\2"+
		"\2\2\u01b2\u0a47\3\2\2\2\u01b4\u0a4e\3\2\2\2\u01b6\u0a50\3\2\2\2\u01b8"+
		"\u0a59\3\2\2\2\u01ba\u0a5b\3\2\2\2\u01bc\u0a66\3\2\2\2\u01be\u0a71\3\2"+
		"\2\2\u01c0\u0a7c\3\2\2\2\u01c2\u0a87\3\2\2\2\u01c4\u0a92\3\2\2\2\u01c6"+
		"\u0aa0\3\2\2\2\u01c8\u0ab7\3\2\2\2\u01ca\u0acc\3\2\2\2\u01cc\u0ada\3\2"+
		"\2\2\u01ce\u0af2\3\2\2\2\u01d0\u0af4\3\2\2\2\u01d2\u0af7\3\2\2\2\u01d4"+
		"\u0b00\3\2\2\2\u01d6\u0b04\3\2\2\2\u01d8\u0b0d\3\2\2\2\u01da\u0b10\3\2"+
		"\2\2\u01dc\u0b12\3\2\2\2\u01de\u0b15\3\2\2\2\u01e0\u0b32\3\2\2\2\u01e2"+
		"\u01e3\t\2\2\2\u01e3\3\3\2\2\2\u01e4\u01e7\5\6\4\2\u01e5\u01e7\5\16\b"+
		"\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\5\3\2\2\2\u01e8\u01ea"+
		"\5\u00e8u\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2"+
		"\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f7"+
		"\5\b\5\2\u01ef\u01f1\5\u00e8u\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2\2"+
		"\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2"+
		"\3\2\2\2\u01f5\u01f7\7\5\2\2\u01f6\u01eb\3\2\2\2\u01f6\u01f2\3\2\2\2\u01f7"+
		"\7\3\2\2\2\u01f8\u01fb\5\n\6\2\u01f9\u01fb\5\f\7\2\u01fa\u01f8\3\2\2\2"+
		"\u01fa\u01f9\3\2\2\2\u01fb\t\3\2\2\2\u01fc\u01fd\t\3\2\2\u01fd\13\3\2"+
		"\2\2\u01fe\u01ff\t\4\2\2\u01ff\r\3\2\2\2\u0200\u0204\5\20\t\2\u0201\u0204"+
		"\5\36\20\2\u0202\u0204\5 \21\2\u0203\u0200\3\2\2\2\u0203\u0201\3\2\2\2"+
		"\u0203\u0202\3\2\2\2\u0204\17\3\2\2\2\u0205\u0208\5\26\f\2\u0206\u0208"+
		"\5\34\17\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208\u020d\3\2\2\2"+
		"\u0209\u020c\5\24\13\2\u020a\u020c\5\32\16\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\21\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212\5\u00e8u\2\u0211"+
		"\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0218\7h\2\2\u0217"+
		"\u0219\5,\27\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0227\3\2"+
		"\2\2\u021a\u021b\5\20\t\2\u021b\u021f\7C\2\2\u021c\u021e\5\u00e8u\2\u021d"+
		"\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\7h\2\2\u0223"+
		"\u0225\5,\27\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2"+
		"\2\2\u0226\u0213\3\2\2\2\u0226\u021a\3\2\2\2\u0227\23\3\2\2\2\u0228\u022c"+
		"\7C\2\2\u0229\u022b\5\u00e8u\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2"+
		"\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c"+
		"\3\2\2\2\u022f\u0231\7h\2\2\u0230\u0232\5,\27\2\u0231\u0230\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\25\3\2\2\2\u0233\u0235\5\u00e8u\2\u0234\u0233\3\2"+
		"\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023b\7h\2\2\u023a\u023c\5,\27"+
		"\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\27\3\2\2\2\u023d\u023e"+
		"\5\22\n\2\u023e\31\3\2\2\2\u023f\u0240\5\24\13\2\u0240\33\3\2\2\2\u0241"+
		"\u0242\5\26\f\2\u0242\35\3\2\2\2\u0243\u0245\5\u00e8u\2\u0244\u0243\3"+
		"\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0249\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\7h\2\2\u024a\37\3\2\2\2"+
		"\u024b\u024c\5\6\4\2\u024c\u024d\5\"\22\2\u024d\u0255\3\2\2\2\u024e\u024f"+
		"\5\20\t\2\u024f\u0250\5\"\22\2\u0250\u0255\3\2\2\2\u0251\u0252\5\36\20"+
		"\2\u0252\u0253\5\"\22\2\u0253\u0255\3\2\2\2\u0254\u024b\3\2\2\2\u0254"+
		"\u024e\3\2\2\2\u0254\u0251\3\2\2\2\u0255!\3\2\2\2\u0256\u0258\5\u00e8"+
		"u\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\7?"+
		"\2\2\u025d\u0268\7@\2\2\u025e\u0260\5\u00e8u\2\u025f\u025e\3\2\2\2\u0260"+
		"\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2"+
		"\2\2\u0263\u0261\3\2\2\2\u0264\u0265\7?\2\2\u0265\u0267\7@\2\2\u0266\u0261"+
		"\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"#\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026d\5&\24\2\u026c\u026b\3\2\2\2"+
		"\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271"+
		"\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0273\7h\2\2\u0272\u0274\5(\25\2\u0273"+
		"\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274%\3\2\2\2\u0275\u0276\5\u00e8"+
		"u\2\u0276\'\3\2\2\2\u0277\u0278\7\23\2\2\u0278\u0282\5\36\20\2\u0279\u027a"+
		"\7\23\2\2\u027a\u027e\5\20\t\2\u027b\u027d\5*\26\2\u027c\u027b\3\2\2\2"+
		"\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0282"+
		"\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0277\3\2\2\2\u0281\u0279\3\2\2\2\u0282"+
		")\3\2\2\2\u0283\u0284\7W\2\2\u0284\u0285\5\30\r\2\u0285+\3\2\2\2\u0286"+
		"\u0287\7F\2\2\u0287\u0288\5.\30\2\u0288\u0289\7E\2\2\u0289-\3\2\2\2\u028a"+
		"\u028f\5\60\31\2\u028b\u028c\7B\2\2\u028c\u028e\5\60\31\2\u028d\u028b"+
		"\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"/\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0295\5\16\b\2\u0293\u0295\5\62\32"+
		"\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295\61\3\2\2\2\u0296\u0298"+
		"\5\u00e8u\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2"+
		"\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029e"+
		"\7I\2\2\u029d\u029f\5\64\33\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2"+
		"\u029f\63\3\2\2\2\u02a0\u02a1\7\23\2\2\u02a1\u02a5\5\16\b\2\u02a2\u02a3"+
		"\7*\2\2\u02a3\u02a5\5\16\b\2\u02a4\u02a0\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5"+
		"\65\3\2\2\2\u02a6\u02a7\b\34\1\2\u02a7\u02a8\7h\2\2\u02a8\u02ae\3\2\2"+
		"\2\u02a9\u02aa\f\3\2\2\u02aa\u02ab\7C\2\2\u02ab\u02ad\7h\2\2\u02ac\u02a9"+
		"\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\67\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b7\7h\2\2\u02b2\u02b3\5:\36\2"+
		"\u02b3\u02b4\7C\2\2\u02b4\u02b5\7h\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b1"+
		"\3\2\2\2\u02b6\u02b2\3\2\2\2\u02b79\3\2\2\2\u02b8\u02b9\b\36\1\2\u02b9"+
		"\u02ba\7h\2\2\u02ba\u02c0\3\2\2\2\u02bb\u02bc\f\3\2\2\u02bc\u02bd\7C\2"+
		"\2\u02bd\u02bf\7h\2\2\u02be\u02bb\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be"+
		"\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1;\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3"+
		"\u02c9\7h\2\2\u02c4\u02c5\5@!\2\u02c5\u02c6\7C\2\2\u02c6\u02c7\7h\2\2"+
		"\u02c7\u02c9\3\2\2\2\u02c8\u02c3\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9=\3"+
		"\2\2\2\u02ca\u02cb\7h\2\2\u02cb?\3\2\2\2\u02cc\u02cd\b!\1\2\u02cd\u02ce"+
		"\7h\2\2\u02ce\u02d4\3\2\2\2\u02cf\u02d0\f\3\2\2\u02d0\u02d1\7C\2\2\u02d1"+
		"\u02d3\7h\2\2\u02d2\u02cf\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2"+
		"\2\2\u02d4\u02d5\3\2\2\2\u02d5A\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d9"+
		"\5D#\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dd\3\2\2\2\u02da"+
		"\u02dc\5H%\2\u02db\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2"+
		"\2\u02dd\u02de\3\2\2\2\u02de\u02e3\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e2"+
		"\5R*\2\u02e1\u02e0\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\7\2"+
		"\2\3\u02e7C\3\2\2\2\u02e8\u02ea\5F$\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed"+
		"\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02ef\7\"\2\2\u02ef\u02f4\7h\2\2\u02f0\u02f1\7C\2"+
		"\2\u02f1\u02f3\7h\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02f8\7A\2\2\u02f8E\3\2\2\2\u02f9\u02fa\5\u00e8u\2\u02faG\3\2\2\2\u02fb"+
		"\u0300\5J&\2\u02fc\u0300\5L\'\2\u02fd\u0300\5N(\2\u02fe\u0300\5P)\2\u02ff"+
		"\u02fb\3\2\2\2\u02ff\u02fc\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2"+
		"\2\2\u0300I\3\2\2\2\u0301\u0302\7\33\2\2\u0302\u0303\58\35\2\u0303\u0304"+
		"\7A\2\2\u0304K\3\2\2\2\u0305\u0306\7\33\2\2\u0306\u0307\5:\36\2\u0307"+
		"\u0308\7C\2\2\u0308\u0309\7U\2\2\u0309\u030a\7A\2\2\u030aM\3\2\2\2\u030b"+
		"\u030c\7\33\2\2\u030c\u030d\7(\2\2\u030d\u030e\58\35\2\u030e\u030f\7C"+
		"\2\2\u030f\u0310\7h\2\2\u0310\u0311\7A\2\2\u0311O\3\2\2\2\u0312\u0313"+
		"\7\33\2\2\u0313\u0314\7(\2\2\u0314\u0315\58\35\2\u0315\u0316\7C\2\2\u0316"+
		"\u0317\7U\2\2\u0317\u0318\7A\2\2\u0318Q\3\2\2\2\u0319\u031d\5T+\2\u031a"+
		"\u031d\5\u00c8e\2\u031b\u031d\7A\2\2\u031c\u0319\3\2\2\2\u031c\u031a\3"+
		"\2\2\2\u031c\u031b\3\2\2\2\u031dS\3\2\2\2\u031e\u0321\5V,\2\u031f\u0321"+
		"\5\u00bc_\2\u0320\u031e\3\2\2\2\u0320\u031f\3\2\2\2\u0321U\3\2\2\2\u0322"+
		"\u0324\5X-\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2"+
		"\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u0329"+
		"\7\13\2\2\u0329\u032b\7h\2\2\u032a\u032c\5Z.\2\u032b\u032a\3\2\2\2\u032b"+
		"\u032c\3\2\2\2\u032c\u032e\3\2\2\2\u032d\u032f\5^\60\2\u032e\u032d\3\2"+
		"\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u0332\5`\61\2\u0331"+
		"\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\5d"+
		"\63\2\u0334W\3\2\2\2\u0335\u033e\5\u00e8u\2\u0336\u033e\7%\2\2\u0337\u033e"+
		"\7$\2\2\u0338\u033e\7#\2\2\u0339\u033e\7\3\2\2\u033a\u033e\7(\2\2\u033b"+
		"\u033e\7\24\2\2\u033c\u033e\7)\2\2\u033d\u0335\3\2\2\2\u033d\u0336\3\2"+
		"\2\2\u033d\u0337\3\2\2\2\u033d\u0338\3\2\2\2\u033d\u0339\3\2\2\2\u033d"+
		"\u033a\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033c\3\2\2\2\u033eY\3\2\2\2"+
		"\u033f\u0340\7F\2\2\u0340\u0341\5\\/\2\u0341\u0342\7E\2\2\u0342[\3\2\2"+
		"\2\u0343\u0348\5$\23\2\u0344\u0345\7B\2\2\u0345\u0347\5$\23\2\u0346\u0344"+
		"\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"]\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u034c\7\23\2\2\u034c\u034d\5\22\n"+
		"\2\u034d_\3\2\2\2\u034e\u034f\7\32\2\2\u034f\u0350\5b\62\2\u0350a\3\2"+
		"\2\2\u0351\u0356\5\30\r\2\u0352\u0353\7B\2\2\u0353\u0355\5\30\r\2\u0354"+
		"\u0352\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2"+
		"\2\2\u0357c\3\2\2\2\u0358\u0356\3\2\2\2\u0359\u035d\7=\2\2\u035a\u035c"+
		"\5f\64\2\u035b\u035a\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u0361\7>"+
		"\2\2\u0361e\3\2\2\2\u0362\u0367\5h\65\2\u0363\u0367\5\u00acW\2\u0364\u0367"+
		"\5\u00aeX\2\u0365\u0367\5\u00b0Y\2\u0366\u0362\3\2\2\2\u0366\u0363\3\2"+
		"\2\2\u0366\u0364\3\2\2\2\u0366\u0365\3\2\2\2\u0367g\3\2\2\2\u0368\u036e"+
		"\5j\66\2\u0369\u036e\5\u008eH\2\u036a\u036e\5T+\2\u036b\u036e\5\u00c8"+
		"e\2\u036c\u036e\7A\2\2\u036d\u0368\3\2\2\2\u036d\u0369\3\2\2\2\u036d\u036a"+
		"\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036c\3\2\2\2\u036ei\3\2\2\2\u036f"+
		"\u0371\5l\67\2\u0370\u036f\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u0372\3\2\2\2\u0375"+
		"\u0376\5v<\2\u0376\u0377\5n8\2\u0377\u0378\7A\2\2\u0378k\3\2\2\2\u0379"+
		"\u0382\5\u00e8u\2\u037a\u0382\7%\2\2\u037b\u0382\7$\2\2\u037c\u0382\7"+
		"#\2\2\u037d\u0382\7(\2\2\u037e\u0382\7\24\2\2\u037f\u0382\7\60\2\2\u0380"+
		"\u0382\7\63\2\2\u0381\u0379\3\2\2\2\u0381\u037a\3\2\2\2\u0381\u037b\3"+
		"\2\2\2\u0381\u037c\3\2\2\2\u0381\u037d\3\2\2\2\u0381\u037e\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0381\u0380\3\2\2\2\u0382m\3\2\2\2\u0383\u0388\5p9\2\u0384"+
		"\u0385\7B\2\2\u0385\u0387\5p9\2\u0386\u0384\3\2\2\2\u0387\u038a\3\2\2"+
		"\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389o\3\2\2\2\u038a\u0388"+
		"\3\2\2\2\u038b\u038e\5r:\2\u038c\u038d\7D\2\2\u038d\u038f\5t;\2\u038e"+
		"\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038fq\3\2\2\2\u0390\u0392\7h\2\2\u0391"+
		"\u0393\5\"\22\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393s\3\2\2\2"+
		"\u0394\u0397\5\u01a6\u00d4\2\u0395\u0397\5\u00fa~\2\u0396\u0394\3\2\2"+
		"\2\u0396\u0395\3\2\2\2\u0397u\3\2\2\2\u0398\u039b\5x=\2\u0399\u039b\5"+
		"z>\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039bw\3\2\2\2\u039c\u039f"+
		"\5\b\5\2\u039d\u039f\7\5\2\2\u039e\u039c\3\2\2\2\u039e\u039d\3\2\2\2\u039f"+
		"y\3\2\2\2\u03a0\u03a4\5|?\2\u03a1\u03a4\5\u008aF\2\u03a2\u03a4\5\u008c"+
		"G\2\u03a3\u03a0\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a2\3\2\2\2\u03a4"+
		"{\3\2\2\2\u03a5\u03a8\5\u0082B\2\u03a6\u03a8\5\u0088E\2\u03a7\u03a5\3"+
		"\2\2\2\u03a7\u03a6\3\2\2\2\u03a8\u03ad\3\2\2\2\u03a9\u03ac\5\u0080A\2"+
		"\u03aa\u03ac\5\u0086D\2\u03ab\u03a9\3\2\2\2\u03ab\u03aa\3\2\2\2\u03ac"+
		"\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae}\3\2\2\2"+
		"\u03af\u03ad\3\2\2\2\u03b0\u03b2\7h\2\2\u03b1\u03b3\5,\27\2\u03b2\u03b1"+
		"\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03c1\3\2\2\2\u03b4\u03b5\5|?\2\u03b5"+
		"\u03b9\7C\2\2\u03b6\u03b8\5\u00e8u\2\u03b7\u03b6\3\2\2\2\u03b8\u03bb\3"+
		"\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb"+
		"\u03b9\3\2\2\2\u03bc\u03be\7h\2\2\u03bd\u03bf\5,\27\2\u03be\u03bd\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03b0\3\2\2\2\u03c0"+
		"\u03b4\3\2\2\2\u03c1\177\3\2\2\2\u03c2\u03c6\7C\2\2\u03c3\u03c5\5\u00e8"+
		"u\2\u03c4\u03c3\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6"+
		"\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03cb\7h"+
		"\2\2\u03ca\u03cc\5,\27\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u0081\3\2\2\2\u03cd\u03cf\7h\2\2\u03ce\u03d0\5,\27\2\u03cf\u03ce\3\2"+
		"\2\2\u03cf\u03d0\3\2\2\2\u03d0\u0083\3\2\2\2\u03d1\u03d2\5~@\2\u03d2\u0085"+
		"\3\2\2\2\u03d3\u03d4\5\u0080A\2\u03d4\u0087\3\2\2\2\u03d5\u03d6\5\u0082"+
		"B\2\u03d6\u0089\3\2\2\2\u03d7\u03d8\7h\2\2\u03d8\u008b\3\2\2\2\u03d9\u03da"+
		"\5x=\2\u03da\u03db\5\"\22\2\u03db\u03e3\3\2\2\2\u03dc\u03dd\5|?\2\u03dd"+
		"\u03de\5\"\22\2\u03de\u03e3\3\2\2\2\u03df\u03e0\5\u008aF\2\u03e0\u03e1"+
		"\5\"\22\2\u03e1\u03e3\3\2\2\2\u03e2\u03d9\3\2\2\2\u03e2\u03dc\3\2\2\2"+
		"\u03e2\u03df\3\2\2\2\u03e3\u008d\3\2\2\2\u03e4\u03e6\5\u0090I\2\u03e5"+
		"\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2"+
		"\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\5\u0092J\2\u03eb"+
		"\u03ec\5\u00aaV\2\u03ec\u008f\3\2\2\2\u03ed\u03f8\5\u00e8u\2\u03ee\u03f8"+
		"\7%\2\2\u03ef\u03f8\7$\2\2\u03f0\u03f8\7#\2\2\u03f1\u03f8\7\3\2\2\u03f2"+
		"\u03f8\7(\2\2\u03f3\u03f8\7\24\2\2\u03f4\u03f8\7,\2\2\u03f5\u03f8\7 \2"+
		"\2\u03f6\u03f8\7)\2\2\u03f7\u03ed\3\2\2\2\u03f7\u03ee\3\2\2\2\u03f7\u03ef"+
		"\3\2\2\2\u03f7\u03f0\3\2\2\2\u03f7\u03f1\3\2\2\2\u03f7\u03f2\3\2\2\2\u03f7"+
		"\u03f3\3\2\2\2\u03f7\u03f4\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f6\3\2"+
		"\2\2\u03f8\u0091\3\2\2\2\u03f9\u03fa\5\u0094K\2\u03fa\u03fc\5\u0096L\2"+
		"\u03fb\u03fd\5\u00a4S\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u040b\3\2\2\2\u03fe\u0402\5Z.\2\u03ff\u0401\5\u00e8u\2\u0400\u03ff\3"+
		"\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"\u0405\3\2\2\2\u0404\u0402\3\2\2\2\u0405\u0406\5\u0094K\2\u0406\u0408"+
		"\5\u0096L\2\u0407\u0409\5\u00a4S\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2"+
		"\2\2\u0409\u040b\3\2\2\2\u040a\u03f9\3\2\2\2\u040a\u03fe\3\2\2\2\u040b"+
		"\u0093\3\2\2\2\u040c\u040f\5v<\2\u040d\u040f\7\62\2\2\u040e\u040c\3\2"+
		"\2\2\u040e\u040d\3\2\2\2\u040f\u0095\3\2\2\2\u0410\u0411\7h\2\2\u0411"+
		"\u0413\7;\2\2\u0412\u0414\5\u0098M\2\u0413\u0412\3\2\2\2\u0413\u0414\3"+
		"\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\7<\2\2\u0416\u0418\5\"\22\2\u0417"+
		"\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0097\3\2\2\2\u0419\u041a\5\u009a"+
		"N\2\u041a\u041b\7B\2\2\u041b\u041c\5\u00a0Q\2\u041c\u041f\3\2\2\2\u041d"+
		"\u041f\5\u00a0Q\2\u041e\u0419\3\2\2\2\u041e\u041d\3\2\2\2\u041f\u0099"+
		"\3\2\2\2\u0420\u0425\5\u009cO\2\u0421\u0422\7B\2\2\u0422\u0424\5\u009c"+
		"O\2\u0423\u0421\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423\3\2\2\2\u0425"+
		"\u0426\3\2\2\2\u0426\u0431\3\2\2\2\u0427\u0425\3\2\2\2\u0428\u042d\5\u00a2"+
		"R\2\u0429\u042a\7B\2\2\u042a\u042c\5\u009cO\2\u042b\u0429\3\2\2\2\u042c"+
		"\u042f\3\2\2\2\u042d\u042b\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0431\3\2"+
		"\2\2\u042f\u042d\3\2\2\2\u0430\u0420\3\2\2\2\u0430\u0428\3\2\2\2\u0431"+
		"\u009b\3\2\2\2\u0432\u0434\5\u009eP\2\u0433\u0432\3\2\2\2\u0434\u0437"+
		"\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\3\2\2\2\u0437"+
		"\u0435\3\2\2\2\u0438\u0439\5v<\2\u0439\u043a\5r:\2\u043a\u009d\3\2\2\2"+
		"\u043b\u043e\5\u00e8u\2\u043c\u043e\7\24\2\2\u043d\u043b\3\2\2\2\u043d"+
		"\u043c\3\2\2\2\u043e\u009f\3\2\2\2\u043f\u0441\5\u009eP\2\u0440\u043f"+
		"\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443"+
		"\u0445\3\2\2\2\u0444\u0442\3\2\2\2\u0445\u0449\5v<\2\u0446\u0448\5\u00e8"+
		"u\2\u0447\u0446\3\2\2\2\u0448\u044b\3\2\2\2\u0449\u0447\3\2\2\2\u0449"+
		"\u044a\3\2\2\2\u044a\u044c\3\2\2\2\u044b\u0449\3\2\2\2\u044c\u044d\7j"+
		"\2\2\u044d\u044e\5r:\2\u044e\u0451\3\2\2\2\u044f\u0451\5\u009cO\2\u0450"+
		"\u0442\3\2\2\2\u0450\u044f\3\2\2\2\u0451\u00a1\3\2\2\2\u0452\u0454\5\u00e8"+
		"u\2\u0453\u0452\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0453\3\2\2\2\u0455"+
		"\u0456\3\2\2\2\u0456\u0458\3\2\2\2\u0457\u0455\3\2\2\2\u0458\u045b\5v"+
		"<\2\u0459\u045a\7h\2\2\u045a\u045c\7C\2\2\u045b\u0459\3\2\2\2\u045b\u045c"+
		"\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\7-\2\2\u045e\u00a3\3\2\2\2\u045f"+
		"\u0460\7/\2\2\u0460\u0461\5\u00a6T\2\u0461\u00a5\3\2\2\2\u0462\u0467\5"+
		"\u00a8U\2\u0463\u0464\7B\2\2\u0464\u0466\5\u00a8U\2\u0465\u0463\3\2\2"+
		"\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u00a7"+
		"\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046d\5\22\n\2\u046b\u046d\5\36\20"+
		"\2\u046c\u046a\3\2\2\2\u046c\u046b\3\2\2\2\u046d\u00a9\3\2\2\2\u046e\u0471"+
		"\5\u00fe\u0080\2\u046f\u0471\7A\2\2\u0470\u046e\3\2\2\2\u0470\u046f\3"+
		"\2\2\2\u0471\u00ab\3\2\2\2\u0472\u0473\5\u00fe\u0080\2\u0473\u00ad\3\2"+
		"\2\2\u0474\u0475\7(\2\2\u0475\u0476\5\u00fe\u0080\2\u0476\u00af\3\2\2"+
		"\2\u0477\u0479\5\u00b2Z\2\u0478\u0477\3\2\2\2\u0479\u047c\3\2\2\2\u047a"+
		"\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047d\3\2\2\2\u047c\u047a\3\2"+
		"\2\2\u047d\u047f\5\u00b4[\2\u047e\u0480\5\u00a4S\2\u047f\u047e\3\2\2\2"+
		"\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\5\u00b8]\2\u0482"+
		"\u00b1\3\2\2\2\u0483\u0488\5\u00e8u\2\u0484\u0488\7%\2\2\u0485\u0488\7"+
		"$\2\2\u0486\u0488\7#\2\2\u0487\u0483\3\2\2\2\u0487\u0484\3\2\2\2\u0487"+
		"\u0485\3\2\2\2\u0487\u0486\3\2\2\2\u0488\u00b3\3\2\2\2\u0489\u048b\5Z"+
		".\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\3\2\2\2\u048c"+
		"\u048d\5\u00b6\\\2\u048d\u048f\7;\2\2\u048e\u0490\5\u0098M\2\u048f\u048e"+
		"\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\7<\2\2\u0492"+
		"\u00b5\3\2\2\2\u0493\u0494\7h\2\2\u0494\u00b7\3\2\2\2\u0495\u0497\7=\2"+
		"\2\u0496\u0498\5\u00ba^\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2\2\u0498"+
		"\u049a\3\2\2\2\u0499\u049b\5\u0100\u0081\2\u049a\u0499\3\2\2\2\u049a\u049b"+
		"\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\7>\2\2\u049d\u00b9\3\2\2\2\u049e"+
		"\u04a0\5,\27\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2"+
		"\2\2\u04a1\u04a2\7-\2\2\u04a2\u04a4\7;\2\2\u04a3\u04a5\5\u0196\u00cc\2"+
		"\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7"+
		"\7<\2\2\u04a7\u04cd\7A\2\2\u04a8\u04aa\5,\27\2\u04a9\u04a8\3\2\2\2\u04a9"+
		"\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\7*\2\2\u04ac\u04ae\7;\2"+
		"\2\u04ad\u04af\5\u0196\u00cc\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2"+
		"\u04af\u04b0\3\2\2\2\u04b0\u04b1\7<\2\2\u04b1\u04cd\7A\2\2\u04b2\u04b3"+
		"\5<\37\2\u04b3\u04b5\7C\2\2\u04b4\u04b6\5,\27\2\u04b5\u04b4\3\2\2\2\u04b5"+
		"\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7*\2\2\u04b8\u04ba\7;\2"+
		"\2\u04b9\u04bb\5\u0196\u00cc\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2"+
		"\u04bb\u04bc\3\2\2\2\u04bc\u04bd\7<\2\2\u04bd\u04be\7A\2\2\u04be\u04cd"+
		"\3\2\2\2\u04bf\u04c0\5\u0168\u00b5\2\u04c0\u04c2\7C\2\2\u04c1\u04c3\5"+
		",\27\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"\u04c5\7*\2\2\u04c5\u04c7\7;\2\2\u04c6\u04c8\5\u0196\u00cc\2\u04c7\u04c6"+
		"\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\7<\2\2\u04ca"+
		"\u04cb\7A\2\2\u04cb\u04cd\3\2\2\2\u04cc\u049f\3\2\2\2\u04cc\u04a9\3\2"+
		"\2\2\u04cc\u04b2\3\2\2\2\u04cc\u04bf\3\2\2\2\u04cd\u00bb\3\2\2\2\u04ce"+
		"\u04d0\5X-\2\u04cf\u04ce\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2"+
		"\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d5"+
		"\7\22\2\2\u04d5\u04d7\7h\2\2\u04d6\u04d8\5`\61\2\u04d7\u04d6\3\2\2\2\u04d7"+
		"\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\5\u00be`\2\u04da\u00bd"+
		"\3\2\2\2\u04db\u04dd\7=\2\2\u04dc\u04de\5\u00c0a\2\u04dd\u04dc\3\2\2\2"+
		"\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df\u04e1\7B\2\2\u04e0\u04df"+
		"\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04e4\5\u00c6d"+
		"\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6"+
		"\7>\2\2\u04e6\u00bf\3\2\2\2\u04e7\u04ec\5\u00c2b\2\u04e8\u04e9\7B\2\2"+
		"\u04e9\u04eb\5\u00c2b\2\u04ea\u04e8\3\2\2\2\u04eb\u04ee\3\2\2\2\u04ec"+
		"\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u00c1\3\2\2\2\u04ee\u04ec\3\2"+
		"\2\2\u04ef\u04f1\5\u00c4c\2\u04f0\u04ef\3\2\2\2\u04f1\u04f4\3\2\2\2\u04f2"+
		"\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\3\2\2\2\u04f4\u04f2\3\2"+
		"\2\2\u04f5\u04fb\7h\2\2\u04f6\u04f8\7;\2\2\u04f7\u04f9\5\u0196\u00cc\2"+
		"\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fc"+
		"\7<\2\2\u04fb\u04f6\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd"+
		"\u04ff\5d\63\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u00c3\3\2"+
		"\2\2\u0500\u0501\5\u00e8u\2\u0501\u00c5\3\2\2\2\u0502\u0506\7A\2\2\u0503"+
		"\u0505\5f\64\2\u0504\u0503\3\2\2\2\u0505\u0508\3\2\2\2\u0506\u0504\3\2"+
		"\2\2\u0506\u0507\3\2\2\2\u0507\u00c7\3\2\2\2\u0508\u0506\3\2\2\2\u0509"+
		"\u050c\5\u00caf\2\u050a\u050c\5\u00dco\2\u050b\u0509\3\2\2\2\u050b\u050a"+
		"\3\2\2\2\u050c\u00c9\3\2\2\2\u050d\u050f\5\u00ccg\2\u050e\u050d\3\2\2"+
		"\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513"+
		"\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u0514\7\36\2\2\u0514\u0516\7h\2\2\u0515"+
		"\u0517\5Z.\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519\3\2\2"+
		"\2\u0518\u051a\5\u00ceh\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"\u051b\3\2\2\2\u051b\u051c\5\u00d0i\2\u051c\u00cb\3\2\2\2\u051d\u0525"+
		"\5\u00e8u\2\u051e\u0525\7%\2\2\u051f\u0525\7$\2\2\u0520\u0525\7#\2\2\u0521"+
		"\u0525\7\3\2\2\u0522\u0525\7(\2\2\u0523\u0525\7)\2\2\u0524\u051d\3\2\2"+
		"\2\u0524\u051e\3\2\2\2\u0524\u051f\3\2\2\2\u0524\u0520\3\2\2\2\u0524\u0521"+
		"\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0523\3\2\2\2\u0525\u00cd\3\2\2\2\u0526"+
		"\u0527\7\23\2\2\u0527\u0528\5b\62\2\u0528\u00cf\3\2\2\2\u0529\u052d\7"+
		"=\2\2\u052a\u052c\5\u00d2j\2\u052b\u052a\3\2\2\2\u052c\u052f\3\2\2\2\u052d"+
		"\u052b\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0530\3\2\2\2\u052f\u052d\3\2"+
		"\2\2\u0530\u0531\7>\2\2\u0531\u00d1\3\2\2\2\u0532\u0538\5\u00d4k\2\u0533"+
		"\u0538\5\u00d8m\2\u0534\u0538\5T+\2\u0535\u0538\5\u00c8e\2\u0536\u0538"+
		"\7A\2\2\u0537\u0532\3\2\2\2\u0537\u0533\3\2\2\2\u0537\u0534\3\2\2\2\u0537"+
		"\u0535\3\2\2\2\u0537\u0536\3\2\2\2\u0538\u00d3\3\2\2\2\u0539\u053b\5\u00d6"+
		"l\2\u053a\u0539\3\2\2\2\u053b\u053e\3\2\2\2\u053c\u053a\3\2\2\2\u053c"+
		"\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e\u053c\3\2\2\2\u053f\u0540\5v"+
		"<\2\u0540\u0541\5n8\2\u0541\u0542\7A\2\2\u0542\u00d5\3\2\2\2\u0543\u0548"+
		"\5\u00e8u\2\u0544\u0548\7%\2\2\u0545\u0548\7(\2\2\u0546\u0548\7\24\2\2"+
		"\u0547\u0543\3\2\2\2\u0547\u0544\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0546"+
		"\3\2\2\2\u0548\u00d7\3\2\2\2\u0549\u054b\5\u00dan\2\u054a\u0549\3\2\2"+
		"\2\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054f"+
		"\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0550\5\u0092J\2\u0550\u0551\5\u00aa"+
		"V\2\u0551\u00d9\3\2\2\2\u0552\u0559\5\u00e8u\2\u0553\u0559\7%\2\2\u0554"+
		"\u0559\7\3\2\2\u0555\u0559\7\16\2\2\u0556\u0559\7(\2\2\u0557\u0559\7)"+
		"\2\2\u0558\u0552\3\2\2\2\u0558\u0553\3\2\2\2\u0558\u0554\3\2\2\2\u0558"+
		"\u0555\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0557\3\2\2\2\u0559\u00db\3\2"+
		"\2\2\u055a\u055c\5\u00ccg\2\u055b\u055a\3\2\2\2\u055c\u055f\3\2\2\2\u055d"+
		"\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0560\3\2\2\2\u055f\u055d\3\2"+
		"\2\2\u0560\u0561\7i\2\2\u0561\u0562\7\36\2\2\u0562\u0563\7h\2\2\u0563"+
		"\u0564\5\u00dep\2\u0564\u00dd\3\2\2\2\u0565\u0569\7=\2\2\u0566\u0568\5"+
		"\u00e0q\2\u0567\u0566\3\2\2\2\u0568\u056b\3\2\2\2\u0569\u0567\3\2\2\2"+
		"\u0569\u056a\3\2\2\2\u056a\u056c\3\2\2\2\u056b\u0569\3\2\2\2\u056c\u056d"+
		"\7>\2\2\u056d\u00df\3\2\2\2\u056e\u0574\5\u00e2r\2\u056f\u0574\5\u00d4"+
		"k\2\u0570\u0574\5T+\2\u0571\u0574\5\u00c8e\2\u0572\u0574\7A\2\2\u0573"+
		"\u056e\3\2\2\2\u0573\u056f\3\2\2\2\u0573\u0570\3\2\2\2\u0573\u0571\3\2"+
		"\2\2\u0573\u0572\3\2\2\2\u0574\u00e1\3\2\2\2\u0575\u0577\5\u00e4s\2\u0576"+
		"\u0575\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2"+
		"\2\2\u0579\u057b\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057c\5v<\2\u057c\u057d"+
		"\7h\2\2\u057d\u057e\7;\2\2\u057e\u0580\7<\2\2\u057f\u0581\5\"\22\2\u0580"+
		"\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0583\3\2\2\2\u0582\u0584\5\u00e6"+
		"t\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u0586\7A\2\2\u0586\u00e3\3\2\2\2\u0587\u058b\5\u00e8u\2\u0588\u058b\7"+
		"%\2\2\u0589\u058b\7\3\2\2\u058a\u0587\3\2\2\2\u058a\u0588\3\2\2\2\u058a"+
		"\u0589\3\2\2\2\u058b\u00e5\3\2\2\2\u058c\u058d\7\16\2\2\u058d\u058e\5"+
		"\u00f0y\2\u058e\u00e7\3\2\2\2\u058f\u0593\5\u00eav\2\u0590\u0593\5\u00f6"+
		"|\2\u0591\u0593\5\u00f8}\2\u0592\u058f\3\2\2\2\u0592\u0590\3\2\2\2\u0592"+
		"\u0591\3\2\2\2\u0593\u00e9\3\2\2\2\u0594\u0595\7i\2\2\u0595\u0596\58\35"+
		"\2\u0596\u0598\7;\2\2\u0597\u0599\5\u00ecw\2\u0598\u0597\3\2\2\2\u0598"+
		"\u0599\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\7<\2\2\u059b\u00eb\3\2"+
		"\2\2\u059c\u05a1\5\u00eex\2\u059d\u059e\7B\2\2\u059e\u05a0\5\u00eex\2"+
		"\u059f\u059d\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a2"+
		"\3\2\2\2\u05a2\u00ed\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4\u05a5\7h\2\2\u05a5"+
		"\u05a6\7D\2\2\u05a6\u05a7\5\u00f0y\2\u05a7\u00ef\3\2\2\2\u05a8\u05ac\5"+
		"\u01b8\u00dd\2\u05a9\u05ac\5\u00f2z\2\u05aa\u05ac\5\u00e8u\2\u05ab\u05a8"+
		"\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ab\u05aa\3\2\2\2\u05ac\u00f1\3\2\2\2\u05ad"+
		"\u05af\7=\2\2\u05ae\u05b0\5\u00f4{\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3"+
		"\2\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05b3\7B\2\2\u05b2\u05b1\3\2\2\2\u05b2"+
		"\u05b3\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\7>\2\2\u05b5\u00f3\3\2"+
		"\2\2\u05b6\u05bb\5\u00f0y\2\u05b7\u05b8\7B\2\2\u05b8\u05ba\5\u00f0y\2"+
		"\u05b9\u05b7\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05bc"+
		"\3\2\2\2\u05bc\u00f5\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05bf\7i\2\2\u05bf"+
		"\u05c0\58\35\2\u05c0\u00f7\3\2\2\2\u05c1\u05c2\7i\2\2\u05c2\u05c3\58\35"+
		"\2\u05c3\u05c4\7;\2\2\u05c4\u05c5\5\u00f0y\2\u05c5\u05c6\7<\2\2\u05c6"+
		"\u00f9\3\2\2\2\u05c7\u05c9\7=\2\2\u05c8\u05ca\5\u00fc\177\2\u05c9\u05c8"+
		"\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05cd\7B\2\2\u05cc"+
		"\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\7>"+
		"\2\2\u05cf\u00fb\3\2\2\2\u05d0\u05d5\5t;\2\u05d1\u05d2\7B\2\2\u05d2\u05d4"+
		"\5t;\2\u05d3\u05d1\3\2\2\2\u05d4\u05d7\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5"+
		"\u05d6\3\2\2\2\u05d6\u00fd\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d8\u05da\7="+
		"\2\2\u05d9\u05db\5\u0100\u0081\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2"+
		"\2\u05db\u05dc\3\2\2\2\u05dc\u05dd\7>\2\2\u05dd\u00ff\3\2\2\2\u05de\u05e2"+
		"\5\u0102\u0082\2\u05df\u05e1\5\u0102\u0082\2\u05e0\u05df\3\2\2\2\u05e1"+
		"\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u0101\3\2"+
		"\2\2\u05e4\u05e2\3\2\2\2\u05e5\u05e9\5\u0104\u0083\2\u05e6\u05e9\5T+\2"+
		"\u05e7\u05e9\5\u0108\u0085\2\u05e8\u05e5\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e8"+
		"\u05e7\3\2\2\2\u05e9\u0103\3\2\2\2\u05ea\u05eb\5\u0106\u0084\2\u05eb\u05ec"+
		"\7A\2\2\u05ec\u0105\3\2\2\2\u05ed\u05ef\5\u009eP\2\u05ee\u05ed\3\2\2\2"+
		"\u05ef\u05f2\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3"+
		"\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f3\u05f4\5v<\2\u05f4\u05f5\5n8\2\u05f5"+
		"\u0107\3\2\2\2\u05f6\u05fd\5\u010c\u0087\2\u05f7\u05fd\5\u0110\u0089\2"+
		"\u05f8\u05fd\5\u0118\u008d\2\u05f9\u05fd\5\u011a\u008e\2\u05fa\u05fd\5"+
		"\u012e\u0098\2\u05fb\u05fd\5\u0136\u009c\2\u05fc\u05f6\3\2\2\2\u05fc\u05f7"+
		"\3\2\2\2\u05fc\u05f8\3\2\2\2\u05fc\u05f9\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc"+
		"\u05fb\3\2\2\2\u05fd\u0109\3\2\2\2\u05fe\u0604\5\u010c\u0087\2\u05ff\u0604"+
		"\5\u0112\u008a\2\u0600\u0604\5\u011c\u008f\2\u0601\u0604\5\u0130\u0099"+
		"\2\u0602\u0604\5\u0138\u009d\2\u0603\u05fe\3\2\2\2\u0603\u05ff\3\2\2\2"+
		"\u0603\u0600\3\2\2\2\u0603\u0601\3\2\2\2\u0603\u0602\3\2\2\2\u0604\u010b"+
		"\3\2\2\2\u0605\u0612\5\u00fe\u0080\2\u0606\u0612\5\u010e\u0088\2\u0607"+
		"\u0612\5\u0114\u008b\2\u0608\u0612\5\u0120\u0091\2\u0609\u0612\5\u0122"+
		"\u0092\2\u060a\u0612\5\u0134\u009b\2\u060b\u0612\5\u014a\u00a6\2\u060c"+
		"\u0612\5\u014c\u00a7\2\u060d\u0612\5\u014e\u00a8\2\u060e\u0612\5\u0152"+
		"\u00aa\2\u060f\u0612\5\u0150\u00a9\2\u0610\u0612\5\u0154\u00ab\2\u0611"+
		"\u0605\3\2\2\2\u0611\u0606\3\2\2\2\u0611\u0607\3\2\2\2\u0611\u0608\3\2"+
		"\2\2\u0611\u0609\3\2\2\2\u0611\u060a\3\2\2\2\u0611\u060b\3\2\2\2\u0611"+
		"\u060c\3\2\2\2\u0611\u060d\3\2\2\2\u0611\u060e\3\2\2\2\u0611\u060f\3\2"+
		"\2\2\u0611\u0610\3\2\2\2\u0612\u010d\3\2\2\2\u0613\u0614\7A\2\2\u0614"+
		"\u010f\3\2\2\2\u0615\u0616\7h\2\2\u0616\u0617\7J\2\2\u0617\u0618\5\u0108"+
		"\u0085\2\u0618\u0111\3\2\2\2\u0619\u061a\7h\2\2\u061a\u061b\7J\2\2\u061b"+
		"\u061c\5\u010a\u0086\2\u061c\u0113\3\2\2\2\u061d\u061e\5\u0116\u008c\2"+
		"\u061e\u061f\7A\2\2\u061f\u0115\3\2\2\2\u0620\u0628\5\u01b2\u00da\2\u0621"+
		"\u0628\5\u01d0\u00e9\2\u0622\u0628\5\u01d2\u00ea\2\u0623\u0628\5\u01d8"+
		"\u00ed\2\u0624\u0628\5\u01dc\u00ef\2\u0625\u0628\5\u0190\u00c9\2\u0626"+
		"\u0628\5\u017c\u00bf\2\u0627\u0620\3\2\2\2\u0627\u0621\3\2\2\2\u0627\u0622"+
		"\3\2\2\2\u0627\u0623\3\2\2\2\u0627\u0624\3\2\2\2\u0627\u0625\3\2\2\2\u0627"+
		"\u0626\3\2\2\2\u0628\u0117\3\2\2\2\u0629\u062a\7\30\2\2\u062a\u062b\7"+
		";\2\2\u062b\u062c\5\u011e\u0090\2\u062c\u062d\7<\2\2\u062d\u062e\5\u0108"+
		"\u0085\2\u062e\u0119\3\2\2\2\u062f\u0630\7\30\2\2\u0630\u0631\7;\2\2\u0631"+
		"\u0632\5\u011e\u0090\2\u0632\u0633\7<\2\2\u0633\u0634\5\u010a\u0086\2"+
		"\u0634\u0635\7\21\2\2\u0635\u0636\5\u0108\u0085\2\u0636\u011b\3\2\2\2"+
		"\u0637\u0638\7\30\2\2\u0638\u0639\7;\2\2\u0639\u063a\5\u011e\u0090\2\u063a"+
		"\u063b\7<\2\2\u063b\u063c\5\u010a\u0086\2\u063c\u063d\7\21\2\2\u063d\u063e"+
		"\5\u010a\u0086\2\u063e\u011d\3\2\2\2\u063f\u0640\5\u01a6\u00d4\2\u0640"+
		"\u011f\3\2\2\2\u0641\u0642\7\4\2\2\u0642\u0643\5\u01a6\u00d4\2\u0643\u0644"+
		"\7A\2\2\u0644\u064c\3\2\2\2\u0645\u0646\7\4\2\2\u0646\u0647\5\u01a6\u00d4"+
		"\2\u0647\u0648\7J\2\2\u0648\u0649\5\u01a6\u00d4\2\u0649\u064a\7A\2\2\u064a"+
		"\u064c\3\2\2\2\u064b\u0641\3\2\2\2\u064b\u0645\3\2\2\2\u064c\u0121\3\2"+
		"\2\2\u064d\u064e\7+\2\2\u064e\u064f\7;\2\2\u064f\u0650\5\u01a6\u00d4\2"+
		"\u0650\u0651\7<\2\2\u0651\u0652\5\u0124\u0093\2\u0652\u0123\3\2\2\2\u0653"+
		"\u0657\7=\2\2\u0654\u0656\5\u0126\u0094\2\u0655\u0654\3\2\2\2\u0656\u0659"+
		"\3\2\2\2\u0657\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065d\3\2\2\2\u0659"+
		"\u0657\3\2\2\2\u065a\u065c\5\u012a\u0096\2\u065b\u065a\3\2\2\2\u065c\u065f"+
		"\3\2\2\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0660\3\2\2\2\u065f"+
		"\u065d\3\2\2\2\u0660\u0661\7>\2\2\u0661\u0125\3\2\2\2\u0662\u0663\5\u0128"+
		"\u0095\2\u0663\u0664\5\u0100\u0081\2\u0664\u0127\3\2\2\2\u0665\u0669\5"+
		"\u012a\u0096\2\u0666\u0668\5\u012a\u0096\2\u0667\u0666\3\2\2\2\u0668\u066b"+
		"\3\2\2\2\u0669\u0667\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u0129\3\2\2\2\u066b"+
		"\u0669\3\2\2\2\u066c\u066d\7\b\2\2\u066d\u066e\5\u01a4\u00d3\2\u066e\u066f"+
		"\7J\2\2\u066f\u0677\3\2\2\2\u0670\u0671\7\b\2\2\u0671\u0672\5\u012c\u0097"+
		"\2\u0672\u0673\7J\2\2\u0673\u0677\3\2\2\2\u0674\u0675\7\16\2\2\u0675\u0677"+
		"\7J\2\2\u0676\u066c\3\2\2\2\u0676\u0670\3\2\2\2\u0676\u0674\3\2\2\2\u0677"+
		"\u012b\3\2\2\2\u0678\u0679\7h\2\2\u0679\u012d\3\2\2\2\u067a\u067b\7\64"+
		"\2\2\u067b\u067c\7;\2\2\u067c\u067d\5\u0132\u009a\2\u067d\u067e\7<\2\2"+
		"\u067e\u067f\5\u0108\u0085\2\u067f\u012f\3\2\2\2\u0680\u0681\7\64\2\2"+
		"\u0681\u0682\7;\2\2\u0682\u0683\5\u0132\u009a\2\u0683\u0684\7<\2\2\u0684"+
		"\u0685\5\u010a\u0086\2\u0685\u0131\3\2\2\2\u0686\u0687\5\u01a6\u00d4\2"+
		"\u0687\u0133\3\2\2\2\u0688\u0689\7\17\2\2\u0689\u068a\5\u0108\u0085\2"+
		"\u068a\u068b\7\64\2\2\u068b\u068c\7;\2\2\u068c\u068d\5\u01a6\u00d4\2\u068d"+
		"\u068e\7<\2\2\u068e\u068f\7A\2\2\u068f\u0135\3\2\2\2\u0690\u0693\5\u013a"+
		"\u009e\2\u0691\u0693\5\u0146\u00a4\2\u0692\u0690\3\2\2\2\u0692\u0691\3"+
		"\2\2\2\u0693\u0137\3\2\2\2\u0694\u0697\5\u013c\u009f\2\u0695\u0697\5\u0148"+
		"\u00a5\2\u0696\u0694\3\2\2\2\u0696\u0695\3\2\2\2\u0697\u0139\3\2\2\2\u0698"+
		"\u0699\7\27\2\2\u0699\u069b\7;\2\2\u069a\u069c\5\u0140\u00a1\2\u069b\u069a"+
		"\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\7A\2\2\u069e"+
		"\u069f\5\u013e\u00a0\2\u069f\u06a1\7A\2\2\u06a0\u06a2\5\u0142\u00a2\2"+
		"\u06a1\u06a0\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4"+
		"\7<\2\2\u06a4\u06a5\5\u0108\u0085\2\u06a5\u013b\3\2\2\2\u06a6\u06a7\7"+
		"\27\2\2\u06a7\u06a9\7;\2\2\u06a8\u06aa\5\u0140\u00a1\2\u06a9\u06a8\3\2"+
		"\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ac\7A\2\2\u06ac"+
		"\u06ad\5\u013e\u00a0\2\u06ad\u06af\7A\2\2\u06ae\u06b0\5\u0142\u00a2\2"+
		"\u06af\u06ae\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2"+
		"\7<\2\2\u06b2\u06b3\5\u010a\u0086\2\u06b3\u013d\3\2\2\2\u06b4\u06b6\5"+
		"\u01a6\u00d4\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u013f\3\2"+
		"\2\2\u06b7\u06ba\5\u0144\u00a3\2\u06b8\u06ba\5\u0106\u0084\2\u06b9\u06b7"+
		"\3\2\2\2\u06b9\u06b8\3\2\2\2\u06ba\u0141\3\2\2\2\u06bb\u06bc\5\u0144\u00a3"+
		"\2\u06bc\u0143\3\2\2\2\u06bd\u06c2\5\u0116\u008c\2\u06be\u06bf\7B\2\2"+
		"\u06bf\u06c1\5\u0116\u008c\2\u06c0\u06be\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2"+
		"\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u0145\3\2\2\2\u06c4\u06c2\3\2"+
		"\2\2\u06c5\u06c6\7\27\2\2\u06c6\u06ca\7;\2\2\u06c7\u06c9\5\u009eP\2\u06c8"+
		"\u06c7\3\2\2\2\u06c9\u06cc\3\2\2\2\u06ca\u06c8\3\2\2\2\u06ca\u06cb\3\2"+
		"\2\2\u06cb\u06cd\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cd\u06ce\5v<\2\u06ce\u06cf"+
		"\5r:\2\u06cf\u06d0\7J\2\2\u06d0\u06d1\5\u01a6\u00d4\2\u06d1\u06d2\7<\2"+
		"\2\u06d2\u06d3\5\u0108\u0085\2\u06d3\u0147\3\2\2\2\u06d4\u06d5\7\27\2"+
		"\2\u06d5\u06d9\7;\2\2\u06d6\u06d8\5\u009eP\2\u06d7\u06d6\3\2\2\2\u06d8"+
		"\u06db\3\2\2\2\u06d9\u06d7\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\3\2"+
		"\2\2\u06db\u06d9\3\2\2\2\u06dc\u06dd\5v<\2\u06dd\u06de\5r:\2\u06de\u06df"+
		"\7J\2\2\u06df\u06e0\5\u01a6\u00d4\2\u06e0\u06e1\7<\2\2\u06e1\u06e2\5\u010a"+
		"\u0086\2\u06e2\u0149\3\2\2\2\u06e3\u06e5\7\6\2\2\u06e4\u06e6\7h\2\2\u06e5"+
		"\u06e4\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e8\7A"+
		"\2\2\u06e8\u014b\3\2\2\2\u06e9\u06eb\7\r\2\2\u06ea\u06ec\7h\2\2\u06eb"+
		"\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\7A"+
		"\2\2\u06ee\u014d\3\2\2\2\u06ef\u06f1\7&\2\2\u06f0\u06f2\5\u01a6\u00d4"+
		"\2\u06f1\u06f0\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4"+
		"\7A\2\2\u06f4\u014f\3\2\2\2\u06f5\u06f6\7.\2\2\u06f6\u06f7\5\u01a6\u00d4"+
		"\2\u06f7\u06f8\7A\2\2\u06f8\u0151\3\2\2\2\u06f9\u06fa\7,\2\2\u06fa\u06fb"+
		"\7;\2\2\u06fb\u06fc\5\u01a6\u00d4\2\u06fc\u06fd\7<\2\2\u06fd\u06fe\5\u00fe"+
		"\u0080\2\u06fe\u0153\3\2\2\2\u06ff\u0700\7\61\2\2\u0700\u0701\5\u00fe"+
		"\u0080\2\u0701\u0702\5\u0156\u00ac\2\u0702\u070c\3\2\2\2\u0703\u0704\7"+
		"\61\2\2\u0704\u0706\5\u00fe\u0080\2\u0705\u0707\5\u0156\u00ac\2\u0706"+
		"\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0709\5\u015e"+
		"\u00b0\2\u0709\u070c\3\2\2\2\u070a\u070c\5\u0160\u00b1\2\u070b\u06ff\3"+
		"\2\2\2\u070b\u0703\3\2\2\2\u070b\u070a\3\2\2\2\u070c\u0155\3\2\2\2\u070d"+
		"\u0711\5\u0158\u00ad\2\u070e\u0710\5\u0158\u00ad\2\u070f\u070e\3\2\2\2"+
		"\u0710\u0713\3\2\2\2\u0711\u070f\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0157"+
		"\3\2\2\2\u0713\u0711\3\2\2\2\u0714\u0715\7\t\2\2\u0715\u0716\7;\2\2\u0716"+
		"\u0717\5\u015a\u00ae\2\u0717\u0718\7<\2\2\u0718\u0719\5\u00fe\u0080\2"+
		"\u0719\u0159\3\2\2\2\u071a\u071c\5\u009eP\2\u071b\u071a\3\2\2\2\u071c"+
		"\u071f\3\2\2\2\u071d\u071b\3\2\2\2\u071d\u071e\3\2\2\2\u071e\u0720\3\2"+
		"\2\2\u071f\u071d\3\2\2\2\u0720\u0721\5\u015c\u00af\2\u0721\u0722\5r:\2"+
		"\u0722\u015b\3\2\2\2\u0723\u0728\5~@\2\u0724\u0725\7X\2\2\u0725\u0727"+
		"\5\22\n\2\u0726\u0724\3\2\2\2\u0727\u072a\3\2\2\2\u0728\u0726\3\2\2\2"+
		"\u0728\u0729\3\2\2\2\u0729\u015d\3\2\2\2\u072a\u0728\3\2\2\2\u072b\u072c"+
		"\7\25\2\2\u072c\u072d\5\u00fe\u0080\2\u072d\u015f\3\2\2\2\u072e\u072f"+
		"\7\61\2\2\u072f\u0730\5\u0162\u00b2\2\u0730\u0732\5\u00fe\u0080\2\u0731"+
		"\u0733\5\u0156\u00ac\2\u0732\u0731\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0735"+
		"\3\2\2\2\u0734\u0736\5\u015e\u00b0\2\u0735\u0734\3\2\2\2\u0735\u0736\3"+
		"\2\2\2\u0736\u0161\3\2\2\2\u0737\u0738\7;\2\2\u0738\u073a\5\u0164\u00b3"+
		"\2\u0739\u073b\7A\2\2\u073a\u0739\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073c"+
		"\3\2\2\2\u073c\u073d\7<\2\2\u073d\u0163\3\2\2\2\u073e\u0743\5\u0166\u00b4"+
		"\2\u073f\u0740\7A\2\2\u0740\u0742\5\u0166\u00b4\2\u0741\u073f\3\2\2\2"+
		"\u0742\u0745\3\2\2\2\u0743\u0741\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0165"+
		"\3\2\2\2\u0745\u0743\3\2\2\2\u0746\u0748\5\u009eP\2\u0747\u0746\3\2\2"+
		"\2\u0748\u074b\3\2\2\2\u0749\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074c"+
		"\3\2\2\2\u074b\u0749\3\2\2\2\u074c\u074d\5v<\2\u074d\u074e\5r:\2\u074e"+
		"\u074f\7D\2\2\u074f\u0750\5\u01a6\u00d4\2\u0750\u0167\3\2\2\2\u0751\u0754"+
		"\5\u0176\u00bc\2\u0752\u0754\5\u019e\u00d0\2\u0753\u0751\3\2\2\2\u0753"+
		"\u0752\3\2\2\2\u0754\u0758\3\2\2\2\u0755\u0757\5\u0170\u00b9\2\u0756\u0755"+
		"\3\2\2\2\u0757\u075a\3\2\2\2\u0758\u0756\3\2\2\2\u0758\u0759\3\2\2\2\u0759"+
		"\u0169\3\2\2\2\u075a\u0758\3\2\2\2\u075b\u0779\5\2\2\2\u075c\u0761\58"+
		"\35\2\u075d\u075e\7?\2\2\u075e\u0760\7@\2\2\u075f\u075d\3\2\2\2\u0760"+
		"\u0763\3\2\2\2\u0761\u075f\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0764\3\2"+
		"\2\2\u0763\u0761\3\2\2\2\u0764\u0765\7C\2\2\u0765\u0766\7\13\2\2\u0766"+
		"\u0779\3\2\2\2\u0767\u0768\7\62\2\2\u0768\u0769\7C\2\2\u0769\u0779\7\13"+
		"\2\2\u076a\u0779\7-\2\2\u076b\u076c\58\35\2\u076c\u076d\7C\2\2\u076d\u076e"+
		"\7-\2\2\u076e\u0779\3\2\2\2\u076f\u0770\7;\2\2\u0770\u0771\5\u01a6\u00d4"+
		"\2\u0771\u0772\7<\2\2\u0772\u0779\3\2\2\2\u0773\u0779\5\u017c\u00bf\2"+
		"\u0774\u0779\5\u0184\u00c3\2\u0775\u0779\5\u018a\u00c6\2\u0776\u0779\5"+
		"\u0190\u00c9\2\u0777\u0779\5\u0198\u00cd\2\u0778\u075b\3\2\2\2\u0778\u075c"+
		"\3\2\2\2\u0778\u0767\3\2\2\2\u0778\u076a\3\2\2\2\u0778\u076b\3\2\2\2\u0778"+
		"\u076f\3\2\2\2\u0778\u0773\3\2\2\2\u0778\u0774\3\2\2\2\u0778\u0775\3\2"+
		"\2\2\u0778\u0776\3\2\2\2\u0778\u0777\3\2\2\2\u0779\u016b\3\2\2\2\u077a"+
		"\u077b\3\2\2\2\u077b\u016d\3\2\2\2\u077c\u0799\5\2\2\2\u077d\u0782\58"+
		"\35\2\u077e\u077f\7?\2\2\u077f\u0781\7@\2\2\u0780\u077e\3\2\2\2\u0781"+
		"\u0784\3\2\2\2\u0782\u0780\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0785\3\2"+
		"\2\2\u0784\u0782\3\2\2\2\u0785\u0786\7C\2\2\u0786\u0787\7\13\2\2\u0787"+
		"\u0799\3\2\2\2\u0788\u0789\7\62\2\2\u0789\u078a\7C\2\2\u078a\u0799\7\13"+
		"\2\2\u078b\u0799\7-\2\2\u078c\u078d\58\35\2\u078d\u078e\7C\2\2\u078e\u078f"+
		"\7-\2\2\u078f\u0799\3\2\2\2\u0790\u0791\7;\2\2\u0791\u0792\5\u01a6\u00d4"+
		"\2\u0792\u0793\7<\2\2\u0793\u0799\3\2\2\2\u0794\u0799\5\u017c\u00bf\2"+
		"\u0795\u0799\5\u0184\u00c3\2\u0796\u0799\5\u0190\u00c9\2\u0797\u0799\5"+
		"\u0198\u00cd\2\u0798\u077c\3\2\2\2\u0798\u077d\3\2\2\2\u0798\u0788\3\2"+
		"\2\2\u0798\u078b\3\2\2\2\u0798\u078c\3\2\2\2\u0798\u0790\3\2\2\2\u0798"+
		"\u0794\3\2\2\2\u0798\u0795\3\2\2\2\u0798\u0796\3\2\2\2\u0798\u0797\3\2"+
		"\2\2\u0799\u016f\3\2\2\2\u079a\u07a0\5\u017e\u00c0\2\u079b\u07a0\5\u0186"+
		"\u00c4\2\u079c\u07a0\5\u018c\u00c7\2\u079d\u07a0\5\u0192\u00ca\2\u079e"+
		"\u07a0\5\u019a\u00ce\2\u079f\u079a\3\2\2\2\u079f\u079b\3\2\2\2\u079f\u079c"+
		"\3\2\2\2\u079f\u079d\3\2\2\2\u079f\u079e\3\2\2\2\u07a0\u0171\3\2\2\2\u07a1"+
		"\u07a2\3\2\2\2\u07a2\u0173\3\2\2\2\u07a3\u07a8\5\u017e\u00c0\2\u07a4\u07a8"+
		"\5\u0186\u00c4\2\u07a5\u07a8\5\u0192\u00ca\2\u07a6\u07a8\5\u019a\u00ce"+
		"\2\u07a7\u07a3\3\2\2\2\u07a7\u07a4\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a6"+
		"\3\2\2\2\u07a8\u0175\3\2\2\2\u07a9\u07d2\5\2\2\2\u07aa\u07af\58\35\2\u07ab"+
		"\u07ac\7?\2\2\u07ac\u07ae\7@\2\2\u07ad\u07ab\3\2\2\2\u07ae\u07b1\3\2\2"+
		"\2\u07af\u07ad\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b2\3\2\2\2\u07b1\u07af"+
		"\3\2\2\2\u07b2\u07b3\7C\2\2\u07b3\u07b4\7\13\2\2\u07b4\u07d2\3\2\2\2\u07b5"+
		"\u07ba\5x=\2\u07b6\u07b7\7?\2\2\u07b7\u07b9\7@\2\2\u07b8\u07b6\3\2\2\2"+
		"\u07b9\u07bc\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bd"+
		"\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bd\u07be\7C\2\2\u07be\u07bf\7\13\2\2\u07bf"+
		"\u07d2\3\2\2\2\u07c0\u07c1\7\62\2\2\u07c1\u07c2\7C\2\2\u07c2\u07d2\7\13"+
		"\2\2\u07c3\u07d2\7-\2\2\u07c4\u07c5\58\35\2\u07c5\u07c6\7C\2\2\u07c6\u07c7"+
		"\7-\2\2\u07c7\u07d2\3\2\2\2\u07c8\u07c9\7;\2\2\u07c9\u07ca\5\u01a6\u00d4"+
		"\2\u07ca\u07cb\7<\2\2\u07cb\u07d2\3\2\2\2\u07cc\u07d2\5\u0180\u00c1\2"+
		"\u07cd\u07d2\5\u0188\u00c5\2\u07ce\u07d2\5\u018e\u00c8\2\u07cf\u07d2\5"+
		"\u0194\u00cb\2\u07d0\u07d2\5\u019c\u00cf\2\u07d1\u07a9\3\2\2\2\u07d1\u07aa"+
		"\3\2\2\2\u07d1\u07b5\3\2\2\2\u07d1\u07c0\3\2\2\2\u07d1\u07c3\3\2\2\2\u07d1"+
		"\u07c4\3\2\2\2\u07d1\u07c8\3\2\2\2\u07d1\u07cc\3\2\2\2\u07d1\u07cd\3\2"+
		"\2\2\u07d1\u07ce\3\2\2\2\u07d1\u07cf\3\2\2\2\u07d1\u07d0\3\2\2\2\u07d2"+
		"\u0177\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u0179\3\2\2\2\u07d5\u07fd\5\2"+
		"\2\2\u07d6\u07db\58\35\2\u07d7\u07d8\7?\2\2\u07d8\u07da\7@\2\2\u07d9\u07d7"+
		"\3\2\2\2\u07da\u07dd\3\2\2\2\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc"+
		"\u07de\3\2\2\2\u07dd\u07db\3\2\2\2\u07de\u07df\7C\2\2\u07df\u07e0\7\13"+
		"\2\2\u07e0\u07fd\3\2\2\2\u07e1\u07e6\5x=\2\u07e2\u07e3\7?\2\2\u07e3\u07e5"+
		"\7@\2\2\u07e4\u07e2\3\2\2\2\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6"+
		"\u07e7\3\2\2\2\u07e7\u07e9\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9\u07ea\7C"+
		"\2\2\u07ea\u07eb\7\13\2\2\u07eb\u07fd\3\2\2\2\u07ec\u07ed\7\62\2\2\u07ed"+
		"\u07ee\7C\2\2\u07ee\u07fd\7\13\2\2\u07ef\u07fd\7-\2\2\u07f0\u07f1\58\35"+
		"\2\u07f1\u07f2\7C\2\2\u07f2\u07f3\7-\2\2\u07f3\u07fd\3\2\2\2\u07f4\u07f5"+
		"\7;\2\2\u07f5\u07f6\5\u01a6\u00d4\2\u07f6\u07f7\7<\2\2\u07f7\u07fd\3\2"+
		"\2\2\u07f8\u07fd\5\u0180\u00c1\2\u07f9\u07fd\5\u0188\u00c5\2\u07fa\u07fd"+
		"\5\u0194\u00cb\2\u07fb\u07fd\5\u019c\u00cf\2\u07fc\u07d5\3\2\2\2\u07fc"+
		"\u07d6\3\2\2\2\u07fc\u07e1\3\2\2\2\u07fc\u07ec\3\2\2\2\u07fc\u07ef\3\2"+
		"\2\2\u07fc\u07f0\3\2\2\2\u07fc\u07f4\3\2\2\2\u07fc\u07f8\3\2\2\2\u07fc"+
		"\u07f9\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fc\u07fb\3\2\2\2\u07fd\u017b\3\2"+
		"\2\2\u07fe\u0800\7!\2\2\u07ff\u0801\5,\27\2\u0800\u07ff\3\2\2\2\u0800"+
		"\u0801\3\2\2\2\u0801\u0805\3\2\2\2\u0802\u0804\5\u00e8u\2\u0803\u0802"+
		"\3\2\2\2\u0804\u0807\3\2\2\2\u0805\u0803\3\2\2\2\u0805\u0806\3\2\2\2\u0806"+
		"\u0808\3\2\2\2\u0807\u0805\3\2\2\2\u0808\u0813\7h\2\2\u0809\u080d\7C\2"+
		"\2\u080a\u080c\5\u00e8u\2\u080b\u080a\3\2\2\2\u080c\u080f\3\2\2\2\u080d"+
		"\u080b\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u0810\3\2\2\2\u080f\u080d\3\2"+
		"\2\2\u0810\u0812\7h\2\2\u0811\u0809\3\2\2\2\u0812\u0815\3\2\2\2\u0813"+
		"\u0811\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0817\3\2\2\2\u0815\u0813\3\2"+
		"\2\2\u0816\u0818\5\u0182\u00c2\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2"+
		"\2\u0818\u0819\3\2\2\2\u0819\u081b\7;\2\2\u081a\u081c\5\u0196\u00cc\2"+
		"\u081b\u081a\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081f"+
		"\7<\2\2\u081e\u0820\5d\63\2\u081f\u081e\3\2\2\2\u081f\u0820\3\2\2\2\u0820"+
		"\u0852\3\2\2\2\u0821\u0822\5<\37\2\u0822\u0823\7C\2\2\u0823\u0825\7!\2"+
		"\2\u0824\u0826\5,\27\2\u0825\u0824\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u082a"+
		"\3\2\2\2\u0827\u0829\5\u00e8u\2\u0828\u0827\3\2\2\2\u0829\u082c\3\2\2"+
		"\2\u082a\u0828\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082d\3\2\2\2\u082c\u082a"+
		"\3\2\2\2\u082d\u082f\7h\2\2\u082e\u0830\5\u0182\u00c2\2\u082f\u082e\3"+
		"\2\2\2\u082f\u0830\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0833\7;\2\2\u0832"+
		"\u0834\5\u0196\u00cc\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835"+
		"\3\2\2\2\u0835\u0837\7<\2\2\u0836\u0838\5d\63\2\u0837\u0836\3\2\2\2\u0837"+
		"\u0838\3\2\2\2\u0838\u0852\3\2\2\2\u0839\u083a\5\u0168\u00b5\2\u083a\u083b"+
		"\7C\2\2\u083b\u083d\7!\2\2\u083c\u083e\5,\27\2\u083d\u083c\3\2\2\2\u083d"+
		"\u083e\3\2\2\2\u083e\u0842\3\2\2\2\u083f\u0841\5\u00e8u\2\u0840\u083f"+
		"\3\2\2\2\u0841\u0844\3\2\2\2\u0842\u0840\3\2\2\2\u0842\u0843\3\2\2\2\u0843"+
		"\u0845\3\2\2\2\u0844\u0842\3\2\2\2\u0845\u0847\7h\2\2\u0846\u0848\5\u0182"+
		"\u00c2\2\u0847\u0846\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849\3\2\2\2\u0849"+
		"\u084b\7;\2\2\u084a\u084c\5\u0196\u00cc\2\u084b\u084a\3\2\2\2\u084b\u084c"+
		"\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084f\7<\2\2\u084e\u0850\5d\63\2\u084f"+
		"\u084e\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0852\3\2\2\2\u0851\u07fe\3\2"+
		"\2\2\u0851\u0821\3\2\2\2\u0851\u0839\3\2\2\2\u0852\u017d\3\2\2\2\u0853"+
		"\u0854\7C\2\2\u0854\u0856\7!\2\2\u0855\u0857\5,\27\2\u0856\u0855\3\2\2"+
		"\2\u0856\u0857\3\2\2\2\u0857\u085b\3\2\2\2\u0858\u085a\5\u00e8u\2\u0859"+
		"\u0858\3\2\2\2\u085a\u085d\3\2\2\2\u085b\u0859\3\2\2\2\u085b\u085c\3\2"+
		"\2\2\u085c\u085e\3\2\2\2\u085d\u085b\3\2\2\2\u085e\u0860\7h\2\2\u085f"+
		"\u0861\5\u0182\u00c2\2\u0860\u085f\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u0862"+
		"\3\2\2\2\u0862\u0864\7;\2\2\u0863\u0865\5\u0196\u00cc\2\u0864\u0863\3"+
		"\2\2\2\u0864\u0865\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0868\7<\2\2\u0867"+
		"\u0869\5d\63\2\u0868\u0867\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u017f\3\2"+
		"\2\2\u086a\u086c\7!\2\2\u086b\u086d\5,\27\2\u086c\u086b\3\2\2\2\u086c"+
		"\u086d\3\2\2\2\u086d\u0871\3\2\2\2\u086e\u0870\5\u00e8u\2\u086f\u086e"+
		"\3\2\2\2\u0870\u0873\3\2\2\2\u0871\u086f\3\2\2\2\u0871\u0872\3\2\2\2\u0872"+
		"\u0874\3\2\2\2\u0873\u0871\3\2\2\2\u0874\u087f\7h\2\2\u0875\u0879\7C\2"+
		"\2\u0876\u0878\5\u00e8u\2\u0877\u0876\3\2\2\2\u0878\u087b\3\2\2\2\u0879"+
		"\u0877\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087c\3\2\2\2\u087b\u0879\3\2"+
		"\2\2\u087c\u087e\7h\2\2\u087d\u0875\3\2\2\2\u087e\u0881\3\2\2\2\u087f"+
		"\u087d\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0883\3\2\2\2\u0881\u087f\3\2"+
		"\2\2\u0882\u0884\5\u0182\u00c2\2\u0883\u0882\3\2\2\2\u0883\u0884\3\2\2"+
		"\2\u0884\u0885\3\2\2\2\u0885\u0887\7;\2\2\u0886\u0888\5\u0196\u00cc\2"+
		"\u0887\u0886\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088b"+
		"\7<\2\2\u088a\u088c\5d\63\2\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2\2\u088c"+
		"\u08a6\3\2\2\2\u088d\u088e\5<\37\2\u088e\u088f\7C\2\2\u088f\u0891\7!\2"+
		"\2\u0890\u0892\5,\27\2\u0891\u0890\3\2\2\2\u0891\u0892\3\2\2\2\u0892\u0896"+
		"\3\2\2\2\u0893\u0895\5\u00e8u\2\u0894\u0893\3\2\2\2\u0895\u0898\3\2\2"+
		"\2\u0896\u0894\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0899\3\2\2\2\u0898\u0896"+
		"\3\2\2\2\u0899\u089b\7h\2\2\u089a\u089c\5\u0182\u00c2\2\u089b\u089a\3"+
		"\2\2\2\u089b\u089c\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089f\7;\2\2\u089e"+
		"\u08a0\5\u0196\u00cc\2\u089f\u089e\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a1"+
		"\3\2\2\2\u08a1\u08a3\7<\2\2\u08a2\u08a4\5d\63\2\u08a3\u08a2\3\2\2\2\u08a3"+
		"\u08a4\3\2\2\2\u08a4\u08a6\3\2\2\2\u08a5\u086a\3\2\2\2\u08a5\u088d\3\2"+
		"\2\2\u08a6\u0181\3\2\2\2\u08a7\u08ab\5,\27\2\u08a8\u08a9\7F\2\2\u08a9"+
		"\u08ab\7E\2\2\u08aa\u08a7\3\2\2\2\u08aa\u08a8\3\2\2\2\u08ab\u0183\3\2"+
		"\2\2\u08ac\u08ad\5\u0168\u00b5\2\u08ad\u08ae\7C\2\2\u08ae\u08af\7h\2\2"+
		"\u08af\u08ba\3\2\2\2\u08b0\u08b1\7*\2\2\u08b1\u08b2\7C\2\2\u08b2\u08ba"+
		"\7h\2\2\u08b3\u08b4\58\35\2\u08b4\u08b5\7C\2\2\u08b5\u08b6\7*\2\2\u08b6"+
		"\u08b7\7C\2\2\u08b7\u08b8\7h\2\2\u08b8\u08ba\3\2\2\2\u08b9\u08ac\3\2\2"+
		"\2\u08b9\u08b0\3\2\2\2\u08b9\u08b3\3\2\2\2\u08ba\u0185\3\2\2\2\u08bb\u08bc"+
		"\7C\2\2\u08bc\u08bd\7h\2\2\u08bd\u0187\3\2\2\2\u08be\u08bf\7*\2\2\u08bf"+
		"\u08c0\7C\2\2\u08c0\u08c8\7h\2\2\u08c1\u08c2\58\35\2\u08c2\u08c3\7C\2"+
		"\2\u08c3\u08c4\7*\2\2\u08c4\u08c5\7C\2\2\u08c5\u08c6\7h\2\2\u08c6\u08c8"+
		"\3\2\2\2\u08c7\u08be\3\2\2\2\u08c7\u08c1\3\2\2\2\u08c8\u0189\3\2\2\2\u08c9"+
		"\u08ca\5<\37\2\u08ca\u08cb\7?\2\2\u08cb\u08cc\5\u01a6\u00d4\2\u08cc\u08cd"+
		"\7@\2\2\u08cd\u08d4\3\2\2\2\u08ce\u08cf\5\u016e\u00b8\2\u08cf\u08d0\7"+
		"?\2\2\u08d0\u08d1\5\u01a6\u00d4\2\u08d1\u08d2\7@\2\2\u08d2\u08d4\3\2\2"+
		"\2\u08d3\u08c9\3\2\2\2\u08d3\u08ce\3\2\2\2\u08d4\u08dc\3\2\2\2\u08d5\u08d6"+
		"\5\u016c\u00b7\2\u08d6\u08d7\7?\2\2\u08d7\u08d8\5\u01a6\u00d4\2\u08d8"+
		"\u08d9\7@\2\2\u08d9\u08db\3\2\2\2\u08da\u08d5\3\2\2\2\u08db\u08de\3\2"+
		"\2\2\u08dc\u08da\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u018b\3\2\2\2\u08de"+
		"\u08dc\3\2\2\2\u08df\u08e0\5\u0174\u00bb\2\u08e0\u08e1\7?\2\2\u08e1\u08e2"+
		"\5\u01a6\u00d4\2\u08e2\u08e3\7@\2\2\u08e3\u08eb\3\2\2\2\u08e4\u08e5\5"+
		"\u0172\u00ba\2\u08e5\u08e6\7?\2\2\u08e6\u08e7\5\u01a6\u00d4\2\u08e7\u08e8"+
		"\7@\2\2\u08e8\u08ea\3\2\2\2\u08e9\u08e4\3\2\2\2\u08ea\u08ed\3\2\2\2\u08eb"+
		"\u08e9\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u018d\3\2\2\2\u08ed\u08eb\3\2"+
		"\2\2\u08ee\u08ef\5<\37\2\u08ef\u08f0\7?\2\2\u08f0\u08f1\5\u01a6\u00d4"+
		"\2\u08f1\u08f2\7@\2\2\u08f2\u08f9\3\2\2\2\u08f3\u08f4\5\u017a\u00be\2"+
		"\u08f4\u08f5\7?\2\2\u08f5\u08f6\5\u01a6\u00d4\2\u08f6\u08f7\7@\2\2\u08f7"+
		"\u08f9\3\2\2\2\u08f8\u08ee\3\2\2\2\u08f8\u08f3\3\2\2\2\u08f9\u0901\3\2"+
		"\2\2\u08fa\u08fb\5\u0178\u00bd\2\u08fb\u08fc\7?\2\2\u08fc\u08fd\5\u01a6"+
		"\u00d4\2\u08fd\u08fe\7@\2\2\u08fe\u0900\3\2\2\2\u08ff\u08fa\3\2\2\2\u0900"+
		"\u0903\3\2\2\2\u0901\u08ff\3\2\2\2\u0901\u0902\3\2\2\2\u0902\u018f\3\2"+
		"\2\2\u0903\u0901\3\2\2\2\u0904\u0905\5> \2\u0905\u0907\7;\2\2\u0906\u0908"+
		"\5\u0196\u00cc\2\u0907\u0906\3\2\2\2\u0907\u0908\3\2\2\2\u0908\u0909\3"+
		"\2\2\2\u0909\u090a\7<\2\2\u090a\u0949\3\2\2\2\u090b\u090c\58\35\2\u090c"+
		"\u090e\7C\2\2\u090d\u090f\5,\27\2\u090e\u090d\3\2\2\2\u090e\u090f\3\2"+
		"\2\2\u090f\u0910\3\2\2\2\u0910\u0911\7h\2\2\u0911\u0913\7;\2\2\u0912\u0914"+
		"\5\u0196\u00cc\2\u0913\u0912\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0915\3"+
		"\2\2\2\u0915\u0916\7<\2\2\u0916\u0949\3\2\2\2\u0917\u0918\5<\37\2\u0918"+
		"\u091a\7C\2\2\u0919\u091b\5,\27\2\u091a\u0919\3\2\2\2\u091a\u091b\3\2"+
		"\2\2\u091b\u091c\3\2\2\2\u091c\u091d\7h\2\2\u091d\u091f\7;\2\2\u091e\u0920"+
		"\5\u0196\u00cc\2\u091f\u091e\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0921\3"+
		"\2\2\2\u0921\u0922\7<\2\2\u0922\u0949\3\2\2\2\u0923\u0924\5\u0168\u00b5"+
		"\2\u0924\u0926\7C\2\2\u0925\u0927\5,\27\2\u0926\u0925\3\2\2\2\u0926\u0927"+
		"\3\2\2\2\u0927\u0928\3\2\2\2\u0928\u0929\7h\2\2\u0929\u092b\7;\2\2\u092a"+
		"\u092c\5\u0196\u00cc\2\u092b\u092a\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u092d"+
		"\3\2\2\2\u092d\u092e\7<\2\2\u092e\u0949\3\2\2\2\u092f\u0930\7*\2\2\u0930"+
		"\u0932\7C\2\2\u0931\u0933\5,\27\2\u0932\u0931\3\2\2\2\u0932\u0933\3\2"+
		"\2\2\u0933\u0934\3\2\2\2\u0934\u0935\7h\2\2\u0935\u0937\7;\2\2\u0936\u0938"+
		"\5\u0196\u00cc\2\u0937\u0936\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u0939\3"+
		"\2\2\2\u0939\u0949\7<\2\2\u093a\u093b\58\35\2\u093b\u093c\7C\2\2\u093c"+
		"\u093d\7*\2\2\u093d\u093f\7C\2\2\u093e\u0940\5,\27\2\u093f\u093e\3\2\2"+
		"\2\u093f\u0940\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0942\7h\2\2\u0942\u0944"+
		"\7;\2\2\u0943\u0945\5\u0196\u00cc\2\u0944\u0943\3\2\2\2\u0944\u0945\3"+
		"\2\2\2\u0945\u0946\3\2\2\2\u0946\u0947\7<\2\2\u0947\u0949\3\2\2\2\u0948"+
		"\u0904\3\2\2\2\u0948\u090b\3\2\2\2\u0948\u0917\3\2\2\2\u0948\u0923\3\2"+
		"\2\2\u0948\u092f\3\2\2\2\u0948\u093a\3\2\2\2\u0949\u0191\3\2\2\2\u094a"+
		"\u094c\7C\2\2\u094b\u094d\5,\27\2\u094c\u094b\3\2\2\2\u094c\u094d\3\2"+
		"\2\2\u094d\u094e\3\2\2\2\u094e\u094f\7h\2\2\u094f\u0951\7;\2\2\u0950\u0952"+
		"\5\u0196\u00cc\2\u0951\u0950\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0953\3"+
		"\2\2\2\u0953\u0954\7<\2\2\u0954\u0193\3\2\2\2\u0955\u0956\5> \2\u0956"+
		"\u0958\7;\2\2\u0957\u0959\5\u0196\u00cc\2\u0958\u0957\3\2\2\2\u0958\u0959"+
		"\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095b\7<\2\2\u095b\u098e\3\2\2\2\u095c"+
		"\u095d\58\35\2\u095d\u095f\7C\2\2\u095e\u0960\5,\27\2\u095f\u095e\3\2"+
		"\2\2\u095f\u0960\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0962\7h\2\2\u0962"+
		"\u0964\7;\2\2\u0963\u0965\5\u0196\u00cc\2\u0964\u0963\3\2\2\2\u0964\u0965"+
		"\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0967\7<\2\2\u0967\u098e\3\2\2\2\u0968"+
		"\u0969\5<\37\2\u0969\u096b\7C\2\2\u096a\u096c\5,\27\2\u096b\u096a\3\2"+
		"\2\2\u096b\u096c\3\2\2\2\u096c\u096d\3\2\2\2\u096d";
	private static final String _serializedATNSegment1 =
		"\u096e\7h\2\2\u096e\u0970\7;\2\2\u096f\u0971\5\u0196\u00cc\2\u0970\u096f"+
		"\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0973\7<\2\2\u0973"+
		"\u098e\3\2\2\2\u0974\u0975\7*\2\2\u0975\u0977\7C\2\2\u0976\u0978\5,\27"+
		"\2\u0977\u0976\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u097a"+
		"\7h\2\2\u097a\u097c\7;\2\2\u097b\u097d\5\u0196\u00cc\2\u097c\u097b\3\2"+
		"\2\2\u097c\u097d\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u098e\7<\2\2\u097f"+
		"\u0980\58\35\2\u0980\u0981\7C\2\2\u0981\u0982\7*\2\2\u0982\u0984\7C\2"+
		"\2\u0983\u0985\5,\27\2\u0984\u0983\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0986"+
		"\3\2\2\2\u0986\u0987\7h\2\2\u0987\u0989\7;\2\2\u0988\u098a\5\u0196\u00cc"+
		"\2\u0989\u0988\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u098b\3\2\2\2\u098b\u098c"+
		"\7<\2\2\u098c\u098e\3\2\2\2\u098d\u0955\3\2\2\2\u098d\u095c\3\2\2\2\u098d"+
		"\u0968\3\2\2\2\u098d\u0974\3\2\2\2\u098d\u097f\3\2\2\2\u098e\u0195\3\2"+
		"\2\2\u098f\u0994\5\u01a6\u00d4\2\u0990\u0991\7B\2\2\u0991\u0993\5\u01a6"+
		"\u00d4\2\u0992\u0990\3\2\2\2\u0993\u0996\3\2\2\2\u0994\u0992\3\2\2\2\u0994"+
		"\u0995\3\2\2\2\u0995\u0197\3\2\2\2\u0996\u0994\3\2\2\2\u0997\u0998\5<"+
		"\37\2\u0998\u099a\7\\\2\2\u0999\u099b\5,\27\2\u099a\u0999\3\2\2\2\u099a"+
		"\u099b\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099d\7h\2\2\u099d\u09c7\3\2"+
		"\2\2\u099e\u099f\5\16\b\2\u099f\u09a1\7\\\2\2\u09a0\u09a2\5,\27\2\u09a1"+
		"\u09a0\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4\7h"+
		"\2\2\u09a4\u09c7\3\2\2\2\u09a5\u09a6\5\u0168\u00b5\2\u09a6\u09a8\7\\\2"+
		"\2\u09a7\u09a9\5,\27\2\u09a8\u09a7\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09aa"+
		"\3\2\2\2\u09aa\u09ab\7h\2\2\u09ab\u09c7\3\2\2\2\u09ac\u09ad\7*\2\2\u09ad"+
		"\u09af\7\\\2\2\u09ae\u09b0\5,\27\2\u09af\u09ae\3\2\2\2\u09af\u09b0\3\2"+
		"\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09c7\7h\2\2\u09b2\u09b3\58\35\2\u09b3"+
		"\u09b4\7C\2\2\u09b4\u09b5\7*\2\2\u09b5\u09b7\7\\\2\2\u09b6\u09b8\5,\27"+
		"\2\u09b7\u09b6\3\2\2\2\u09b7\u09b8\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba"+
		"\7h\2\2\u09ba\u09c7\3\2\2\2\u09bb\u09bc\5\22\n\2\u09bc\u09be\7\\\2\2\u09bd"+
		"\u09bf\5,\27\2\u09be\u09bd\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c0\3\2"+
		"\2\2\u09c0\u09c1\7!\2\2\u09c1\u09c7\3\2\2\2\u09c2\u09c3\5 \21\2\u09c3"+
		"\u09c4\7\\\2\2\u09c4\u09c5\7!\2\2\u09c5\u09c7\3\2\2\2\u09c6\u0997\3\2"+
		"\2\2\u09c6\u099e\3\2\2\2\u09c6\u09a5\3\2\2\2\u09c6\u09ac\3\2\2\2\u09c6"+
		"\u09b2\3\2\2\2\u09c6\u09bb\3\2\2\2\u09c6\u09c2\3\2\2\2\u09c7\u0199\3\2"+
		"\2\2\u09c8\u09ca\7\\\2\2\u09c9\u09cb\5,\27\2\u09ca\u09c9\3\2\2\2\u09ca"+
		"\u09cb\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\7h\2\2\u09cd\u019b\3\2"+
		"\2\2\u09ce\u09cf\5<\37\2\u09cf\u09d1\7\\\2\2\u09d0\u09d2\5,\27\2\u09d1"+
		"\u09d0\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\7h"+
		"\2\2\u09d4\u09f7\3\2\2\2\u09d5\u09d6\5\16\b\2\u09d6\u09d8\7\\\2\2\u09d7"+
		"\u09d9\5,\27\2\u09d8\u09d7\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\3\2"+
		"\2\2\u09da\u09db\7h\2\2\u09db\u09f7\3\2\2\2\u09dc\u09dd\7*\2\2\u09dd\u09df"+
		"\7\\\2\2\u09de\u09e0\5,\27\2\u09df\u09de\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0"+
		"\u09e1\3\2\2\2\u09e1\u09f7\7h\2\2\u09e2\u09e3\58\35\2\u09e3\u09e4\7C\2"+
		"\2\u09e4\u09e5\7*\2\2\u09e5\u09e7\7\\\2\2\u09e6\u09e8\5,\27\2\u09e7\u09e6"+
		"\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09ea\7h\2\2\u09ea"+
		"\u09f7\3\2\2\2\u09eb\u09ec\5\22\n\2\u09ec\u09ee\7\\\2\2\u09ed\u09ef\5"+
		",\27\2\u09ee\u09ed\3\2\2\2\u09ee\u09ef\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0"+
		"\u09f1\7!\2\2\u09f1\u09f7\3\2\2\2\u09f2\u09f3\5 \21\2\u09f3\u09f4\7\\"+
		"\2\2\u09f4\u09f5\7!\2\2\u09f5\u09f7\3\2\2\2\u09f6\u09ce\3\2\2\2\u09f6"+
		"\u09d5\3\2\2\2\u09f6\u09dc\3\2\2\2\u09f6\u09e2\3\2\2\2\u09f6\u09eb\3\2"+
		"\2\2\u09f6\u09f2\3\2\2\2\u09f7\u019d\3\2\2\2\u09f8\u09f9\7!\2\2\u09f9"+
		"\u09fa\5\6\4\2\u09fa\u09fc\5\u01a0\u00d1\2\u09fb\u09fd\5\"\22\2\u09fc"+
		"\u09fb\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u0a0f\3\2\2\2\u09fe\u09ff\7!"+
		"\2\2\u09ff\u0a00\5\20\t\2\u0a00\u0a02\5\u01a0\u00d1\2\u0a01\u0a03\5\""+
		"\22\2\u0a02\u0a01\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a0f\3\2\2\2\u0a04"+
		"\u0a05\7!\2\2\u0a05\u0a06\5\6\4\2\u0a06\u0a07\5\"\22\2\u0a07\u0a08\5\u00fa"+
		"~\2\u0a08\u0a0f\3\2\2\2\u0a09\u0a0a\7!\2\2\u0a0a\u0a0b\5\20\t\2\u0a0b"+
		"\u0a0c\5\"\22\2\u0a0c\u0a0d\5\u00fa~\2\u0a0d\u0a0f\3\2\2\2\u0a0e\u09f8"+
		"\3\2\2\2\u0a0e\u09fe\3\2\2\2\u0a0e\u0a04\3\2\2\2\u0a0e\u0a09\3\2\2\2\u0a0f"+
		"\u019f\3\2\2\2\u0a10\u0a14\5\u01a2\u00d2\2\u0a11\u0a13\5\u01a2\u00d2\2"+
		"\u0a12\u0a11\3\2\2\2\u0a13\u0a16\3\2\2\2\u0a14\u0a12\3\2\2\2\u0a14\u0a15"+
		"\3\2\2\2\u0a15\u01a1\3\2\2\2\u0a16\u0a14\3\2\2\2\u0a17\u0a19\5\u00e8u"+
		"\2\u0a18\u0a17\3\2\2\2\u0a19\u0a1c\3\2\2\2\u0a1a\u0a18\3\2\2\2\u0a1a\u0a1b"+
		"\3\2\2\2\u0a1b\u0a1d\3\2\2\2\u0a1c\u0a1a\3\2\2\2\u0a1d\u0a1e\7?\2\2\u0a1e"+
		"\u0a1f\5\u01a6\u00d4\2\u0a1f\u0a20\7@\2\2\u0a20\u01a3\3\2\2\2\u0a21\u0a22"+
		"\5\u01a6\u00d4\2\u0a22\u01a5\3\2\2\2\u0a23\u0a26\5\u01a8\u00d5\2\u0a24"+
		"\u0a26\5\u01b0\u00d9\2\u0a25\u0a23\3\2\2\2\u0a25\u0a24\3\2\2\2\u0a26\u01a7"+
		"\3\2\2\2\u0a27\u0a28\5\u01aa\u00d6\2\u0a28\u0a29\7[\2\2\u0a29\u0a2a\5"+
		"\u01ae\u00d8\2\u0a2a\u01a9\3\2\2\2\u0a2b\u0a36\7h\2\2\u0a2c\u0a2e\7;\2"+
		"\2\u0a2d\u0a2f\5\u0098M\2\u0a2e\u0a2d\3\2\2\2\u0a2e\u0a2f\3\2\2\2\u0a2f"+
		"\u0a30\3\2\2\2\u0a30\u0a36\7<\2\2\u0a31\u0a32\7;\2\2\u0a32\u0a33\5\u01ac"+
		"\u00d7\2\u0a33\u0a34\7<\2\2\u0a34\u0a36\3\2\2\2\u0a35\u0a2b\3\2\2\2\u0a35"+
		"\u0a2c\3\2\2\2\u0a35\u0a31\3\2\2\2\u0a36\u01ab\3\2\2\2\u0a37\u0a3c\7h"+
		"\2\2\u0a38\u0a39\7B\2\2\u0a39\u0a3b\7h\2\2\u0a3a\u0a38\3\2\2\2\u0a3b\u0a3e"+
		"\3\2\2\2\u0a3c\u0a3a\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u01ad\3\2\2\2\u0a3e"+
		"\u0a3c\3\2\2\2\u0a3f\u0a42\5\u01a6\u00d4\2\u0a40\u0a42\5\u00fe\u0080\2"+
		"\u0a41\u0a3f\3\2\2\2\u0a41\u0a40\3\2\2\2\u0a42\u01af\3\2\2\2\u0a43\u0a46"+
		"\5\u01b8\u00dd\2\u0a44\u0a46\5\u01b2\u00da\2\u0a45\u0a43\3\2\2\2\u0a45"+
		"\u0a44\3\2\2\2\u0a46\u01b1\3\2\2\2\u0a47\u0a48\5\u01b4\u00db\2\u0a48\u0a49"+
		"\5\u01b6\u00dc\2\u0a49\u0a4a\5\u01a6\u00d4\2\u0a4a\u01b3\3\2\2\2\u0a4b"+
		"\u0a4f\5<\37\2\u0a4c\u0a4f\5\u0184\u00c3\2\u0a4d\u0a4f\5\u018a\u00c6\2"+
		"\u0a4e\u0a4b\3\2\2\2\u0a4e\u0a4c\3\2\2\2\u0a4e\u0a4d\3\2\2\2\u0a4f\u01b5"+
		"\3\2\2\2\u0a50\u0a51\t\5\2\2\u0a51\u01b7\3\2\2\2\u0a52\u0a5a\5\u01ba\u00de"+
		"\2\u0a53\u0a54\5\u01ba\u00de\2\u0a54\u0a55\7I\2\2\u0a55\u0a56\5\u01a6"+
		"\u00d4\2\u0a56\u0a57\7J\2\2\u0a57\u0a58\5\u01b8\u00dd\2\u0a58\u0a5a\3"+
		"\2\2\2\u0a59\u0a52\3\2\2\2\u0a59\u0a53\3\2\2\2\u0a5a\u01b9\3\2\2\2\u0a5b"+
		"\u0a5c\b\u00de\1\2\u0a5c\u0a5d\5\u01bc\u00df\2\u0a5d\u0a63\3\2\2\2\u0a5e"+
		"\u0a5f\f\3\2\2\u0a5f\u0a60\7P\2\2\u0a60\u0a62\5\u01bc\u00df\2\u0a61\u0a5e"+
		"\3\2\2\2\u0a62\u0a65\3\2\2\2\u0a63\u0a61\3\2\2\2\u0a63\u0a64\3\2\2\2\u0a64"+
		"\u01bb\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a66\u0a67\b\u00df\1\2\u0a67\u0a68"+
		"\5\u01be\u00e0\2\u0a68\u0a6e\3\2\2\2\u0a69\u0a6a\f\3\2\2\u0a6a\u0a6b\7"+
		"O\2\2\u0a6b\u0a6d\5\u01be\u00e0\2\u0a6c\u0a69\3\2\2\2\u0a6d\u0a70\3\2"+
		"\2\2\u0a6e\u0a6c\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u01bd\3\2\2\2\u0a70"+
		"\u0a6e\3\2\2\2\u0a71\u0a72\b\u00e0\1\2\u0a72\u0a73\5\u01c0\u00e1\2\u0a73"+
		"\u0a79\3\2\2\2\u0a74\u0a75\f\3\2\2\u0a75\u0a76\7X\2\2\u0a76\u0a78\5\u01c0"+
		"\u00e1\2\u0a77\u0a74\3\2\2\2\u0a78\u0a7b\3\2\2\2\u0a79\u0a77\3\2\2\2\u0a79"+
		"\u0a7a\3\2\2\2\u0a7a\u01bf\3\2\2\2\u0a7b\u0a79\3\2\2\2\u0a7c\u0a7d\b\u00e1"+
		"\1\2\u0a7d\u0a7e\5\u01c2\u00e2\2\u0a7e\u0a84\3\2\2\2\u0a7f\u0a80\f\3\2"+
		"\2\u0a80\u0a81\7Y\2\2\u0a81\u0a83\5\u01c2\u00e2\2\u0a82\u0a7f\3\2\2\2"+
		"\u0a83\u0a86\3\2\2\2\u0a84\u0a82\3\2\2\2\u0a84\u0a85\3\2\2\2\u0a85\u01c1"+
		"\3\2\2\2\u0a86\u0a84\3\2\2\2\u0a87\u0a88\b\u00e2\1\2\u0a88\u0a89\5\u01c4"+
		"\u00e3\2\u0a89\u0a8f\3\2\2\2\u0a8a\u0a8b\f\3\2\2\u0a8b\u0a8c\7W\2\2\u0a8c"+
		"\u0a8e\5\u01c4\u00e3\2\u0a8d\u0a8a\3\2\2\2\u0a8e\u0a91\3\2\2\2\u0a8f\u0a8d"+
		"\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u01c3\3\2\2\2\u0a91\u0a8f\3\2\2\2\u0a92"+
		"\u0a93\b\u00e3\1\2\u0a93\u0a94\5\u01c6\u00e4\2\u0a94\u0a9d\3\2\2\2\u0a95"+
		"\u0a96\f\4\2\2\u0a96\u0a97\7K\2\2\u0a97\u0a9c\5\u01c6\u00e4\2\u0a98\u0a99"+
		"\f\3\2\2\u0a99\u0a9a\7N\2\2\u0a9a\u0a9c\5\u01c6\u00e4\2\u0a9b\u0a95\3"+
		"\2\2\2\u0a9b\u0a98\3\2\2\2\u0a9c\u0a9f\3\2\2\2\u0a9d\u0a9b\3\2\2\2\u0a9d"+
		"\u0a9e\3\2\2\2\u0a9e\u01c5\3\2\2\2\u0a9f\u0a9d\3\2\2\2\u0aa0\u0aa1\b\u00e4"+
		"\1\2\u0aa1\u0aa2\5\u01c8\u00e5\2\u0aa2\u0ab4\3\2\2\2\u0aa3\u0aa4\f\7\2"+
		"\2\u0aa4\u0aa5\7F\2\2\u0aa5\u0ab3\5\u01c8\u00e5\2\u0aa6\u0aa7\f\6\2\2"+
		"\u0aa7\u0aa8\7E\2\2\u0aa8\u0ab3\5\u01c8\u00e5\2\u0aa9\u0aaa\f\5\2\2\u0aaa"+
		"\u0aab\7L\2\2\u0aab\u0ab3\5\u01c8\u00e5\2\u0aac\u0aad\f\4\2\2\u0aad\u0aae"+
		"\7M\2\2\u0aae\u0ab3\5\u01c8\u00e5\2\u0aaf\u0ab0\f\3\2\2\u0ab0\u0ab1\7"+
		"\34\2\2\u0ab1\u0ab3\5\16\b\2\u0ab2\u0aa3\3\2\2\2\u0ab2\u0aa6\3\2\2\2\u0ab2"+
		"\u0aa9\3\2\2\2\u0ab2\u0aac\3\2\2\2\u0ab2\u0aaf\3\2\2\2\u0ab3\u0ab6\3\2"+
		"\2\2\u0ab4\u0ab2\3\2\2\2\u0ab4\u0ab5\3\2\2\2\u0ab5\u01c7\3\2\2\2\u0ab6"+
		"\u0ab4\3\2\2\2\u0ab7\u0ab8\b\u00e5\1\2\u0ab8\u0ab9\5\u01ca\u00e6\2\u0ab9"+
		"\u0ac9\3\2\2\2\u0aba\u0abb\f\5\2\2\u0abb\u0abc\7F\2\2\u0abc\u0abd\7F\2"+
		"\2\u0abd\u0ac8\5\u01ca\u00e6\2\u0abe\u0abf\f\4\2\2\u0abf\u0ac0\7E\2\2"+
		"\u0ac0\u0ac1\7E\2\2\u0ac1\u0ac8\5\u01ca\u00e6\2\u0ac2\u0ac3\f\3\2\2\u0ac3"+
		"\u0ac4\7E\2\2\u0ac4\u0ac5\7E\2\2\u0ac5\u0ac6\7E\2\2\u0ac6\u0ac8\5\u01ca"+
		"\u00e6\2\u0ac7\u0aba\3\2\2\2\u0ac7\u0abe\3\2\2\2\u0ac7\u0ac2\3\2\2\2\u0ac8"+
		"\u0acb\3\2\2\2\u0ac9\u0ac7\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u01c9\3\2"+
		"\2\2\u0acb\u0ac9\3\2\2\2\u0acc\u0acd\b\u00e6\1\2\u0acd\u0ace\5\u01cc\u00e7"+
		"\2\u0ace\u0ad7\3\2\2\2\u0acf\u0ad0\f\4\2\2\u0ad0\u0ad1\7S\2\2\u0ad1\u0ad6"+
		"\5\u01cc\u00e7\2\u0ad2\u0ad3\f\3\2\2\u0ad3\u0ad4\7T\2\2\u0ad4\u0ad6\5"+
		"\u01cc\u00e7\2\u0ad5\u0acf\3\2\2\2\u0ad5\u0ad2\3\2\2\2\u0ad6\u0ad9\3\2"+
		"\2\2\u0ad7\u0ad5\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u01cb\3\2\2\2\u0ad9"+
		"\u0ad7\3\2\2\2\u0ada\u0adb\b\u00e7\1\2\u0adb\u0adc\5\u01ce\u00e8\2\u0adc"+
		"\u0ae8\3\2\2\2\u0add\u0ade\f\5\2\2\u0ade\u0adf\7U\2\2\u0adf\u0ae7\5\u01ce"+
		"\u00e8\2\u0ae0\u0ae1\f\4\2\2\u0ae1\u0ae2\7V\2\2\u0ae2\u0ae7\5\u01ce\u00e8"+
		"\2\u0ae3\u0ae4\f\3\2\2\u0ae4\u0ae5\7Z\2\2\u0ae5\u0ae7\5\u01ce\u00e8\2"+
		"\u0ae6\u0add\3\2\2\2\u0ae6\u0ae0\3\2\2\2\u0ae6\u0ae3\3\2\2\2\u0ae7\u0aea"+
		"\3\2\2\2\u0ae8\u0ae6\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u01cd\3\2\2\2\u0aea"+
		"\u0ae8\3\2\2\2\u0aeb\u0af3\5\u01d0\u00e9\2\u0aec\u0af3\5\u01d2\u00ea\2"+
		"\u0aed\u0aee\7S\2\2\u0aee\u0af3\5\u01ce\u00e8\2\u0aef\u0af0\7T\2\2\u0af0"+
		"\u0af3\5\u01ce\u00e8\2\u0af1\u0af3\5\u01d4\u00eb\2\u0af2\u0aeb\3\2\2\2"+
		"\u0af2\u0aec\3\2\2\2\u0af2\u0aed\3\2\2\2\u0af2\u0aef\3\2\2\2\u0af2\u0af1"+
		"\3\2\2\2\u0af3\u01cf\3\2\2\2\u0af4\u0af5\7Q\2\2\u0af5\u0af6\5\u01ce\u00e8"+
		"\2\u0af6\u01d1\3\2\2\2\u0af7\u0af8\7R\2\2\u0af8\u0af9\5\u01ce\u00e8\2"+
		"\u0af9\u01d3\3\2\2\2\u0afa\u0b01\5\u01d6\u00ec\2\u0afb\u0afc\7H\2\2\u0afc"+
		"\u0b01\5\u01ce\u00e8\2\u0afd\u0afe\7G\2\2\u0afe\u0b01\5\u01ce\u00e8\2"+
		"\u0aff\u0b01\5\u01e0\u00f1\2\u0b00\u0afa\3\2\2\2\u0b00\u0afb\3\2\2\2\u0b00"+
		"\u0afd\3\2\2\2\u0b00\u0aff\3\2\2\2\u0b01\u01d5\3\2\2\2\u0b02\u0b05\5\u0168"+
		"\u00b5\2\u0b03\u0b05\5<\37\2\u0b04\u0b02\3\2\2\2\u0b04\u0b03\3\2\2\2\u0b05"+
		"\u0b0a\3\2\2\2\u0b06\u0b09\5\u01da\u00ee\2\u0b07\u0b09\5\u01de\u00f0\2"+
		"\u0b08\u0b06\3\2\2\2\u0b08\u0b07\3\2\2\2\u0b09\u0b0c\3\2\2\2\u0b0a\u0b08"+
		"\3\2\2\2\u0b0a\u0b0b\3\2\2\2\u0b0b\u01d7\3\2\2\2\u0b0c\u0b0a\3\2\2\2\u0b0d"+
		"\u0b0e\5\u01d6\u00ec\2\u0b0e\u0b0f\7Q\2\2\u0b0f\u01d9\3\2\2\2\u0b10\u0b11"+
		"\7Q\2\2\u0b11\u01db\3\2\2\2\u0b12\u0b13\5\u01d6\u00ec\2\u0b13\u0b14\7"+
		"R\2\2\u0b14\u01dd\3\2\2\2\u0b15\u0b16\7R\2\2\u0b16\u01df\3\2\2\2\u0b17"+
		"\u0b18\7;\2\2\u0b18\u0b19\5\6\4\2\u0b19\u0b1a\7<\2\2\u0b1a\u0b1b\5\u01ce"+
		"\u00e8\2\u0b1b\u0b33\3\2\2\2\u0b1c\u0b1d\7;\2\2\u0b1d\u0b21\5\16\b\2\u0b1e"+
		"\u0b20\5*\26\2\u0b1f\u0b1e\3\2\2\2\u0b20\u0b23\3\2\2\2\u0b21\u0b1f\3\2"+
		"\2\2\u0b21\u0b22\3\2\2\2\u0b22\u0b24\3\2\2\2\u0b23\u0b21\3\2\2\2\u0b24"+
		"\u0b25\7<\2\2\u0b25\u0b26\5\u01d4\u00eb\2\u0b26\u0b33\3\2\2\2\u0b27\u0b28"+
		"\7;\2\2\u0b28\u0b2c\5\16\b\2\u0b29\u0b2b\5*\26\2\u0b2a\u0b29\3\2\2\2\u0b2b"+
		"\u0b2e\3\2\2\2\u0b2c\u0b2a\3\2\2\2\u0b2c\u0b2d\3\2\2\2\u0b2d\u0b2f\3\2"+
		"\2\2\u0b2e\u0b2c\3\2\2\2\u0b2f\u0b30\7<\2\2\u0b30\u0b31\5\u01a8\u00d5"+
		"\2\u0b31\u0b33\3\2\2\2\u0b32\u0b17\3\2\2\2\u0b32\u0b1c\3\2\2\2\u0b32\u0b27"+
		"\3\2\2\2\u0b33\u01e1\3\2\2\2\u0145\u01e6\u01eb\u01f2\u01f6\u01fa\u0203"+
		"\u0207\u020b\u020d\u0213\u0218\u021f\u0224\u0226\u022c\u0231\u0236\u023b"+
		"\u0246\u0254\u0259\u0261\u0268\u026e\u0273\u027e\u0281\u028f\u0294\u0299"+
		"\u029e\u02a4\u02ae\u02b6\u02c0\u02c8\u02d4\u02d8\u02dd\u02e3\u02eb\u02f4"+
		"\u02ff\u031c\u0320\u0325\u032b\u032e\u0331\u033d\u0348\u0356\u035d\u0366"+
		"\u036d\u0372\u0381\u0388\u038e\u0392\u0396\u039a\u039e\u03a3\u03a7\u03ab"+
		"\u03ad\u03b2\u03b9\u03be\u03c0\u03c6\u03cb\u03cf\u03e2\u03e7\u03f7\u03fc"+
		"\u0402\u0408\u040a\u040e\u0413\u0417\u041e\u0425\u042d\u0430\u0435\u043d"+
		"\u0442\u0449\u0450\u0455\u045b\u0467\u046c\u0470\u047a\u047f\u0487\u048a"+
		"\u048f\u0497\u049a\u049f\u04a4\u04a9\u04ae\u04b5\u04ba\u04c2\u04c7\u04cc"+
		"\u04d1\u04d7\u04dd\u04e0\u04e3\u04ec\u04f2\u04f8\u04fb\u04fe\u0506\u050b"+
		"\u0510\u0516\u0519\u0524\u052d\u0537\u053c\u0547\u054c\u0558\u055d\u0569"+
		"\u0573\u0578\u0580\u0583\u058a\u0592\u0598\u05a1\u05ab\u05af\u05b2\u05bb"+
		"\u05c9\u05cc\u05d5\u05da\u05e2\u05e8\u05f0\u05fc\u0603\u0611\u0627\u064b"+
		"\u0657\u065d\u0669\u0676\u0692\u0696\u069b\u06a1\u06a9\u06af\u06b5\u06b9"+
		"\u06c2\u06ca\u06d9\u06e5\u06eb\u06f1\u0706\u070b\u0711\u071d\u0728\u0732"+
		"\u0735\u073a\u0743\u0749\u0753\u0758\u0761\u0778\u0782\u0798\u079f\u07a7"+
		"\u07af\u07ba\u07d1\u07db\u07e6\u07fc\u0800\u0805\u080d\u0813\u0817\u081b"+
		"\u081f\u0825\u082a\u082f\u0833\u0837\u083d\u0842\u0847\u084b\u084f\u0851"+
		"\u0856\u085b\u0860\u0864\u0868\u086c\u0871\u0879\u087f\u0883\u0887\u088b"+
		"\u0891\u0896\u089b\u089f\u08a3\u08a5\u08aa\u08b9\u08c7\u08d3\u08dc\u08eb"+
		"\u08f8\u0901\u0907\u090e\u0913\u091a\u091f\u0926\u092b\u0932\u0937\u093f"+
		"\u0944\u0948\u094c\u0951\u0958\u095f\u0964\u096b\u0970\u0977\u097c\u0984"+
		"\u0989\u098d\u0994\u099a\u09a1\u09a8\u09af\u09b7\u09be\u09c6\u09ca\u09d1"+
		"\u09d8\u09df\u09e7\u09ee\u09f6\u09fc\u0a02\u0a0e\u0a14\u0a1a\u0a25\u0a2e"+
		"\u0a35\u0a3c\u0a41\u0a45\u0a4e\u0a59\u0a63\u0a6e\u0a79\u0a84\u0a8f\u0a9b"+
		"\u0a9d\u0ab2\u0ab4\u0ac7\u0ac9\u0ad5\u0ad7\u0ae6\u0ae8\u0af2\u0b00\u0b04"+
		"\u0b08\u0b0a\u0b21\u0b2c\u0b32";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}