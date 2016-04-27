// Generated from Swift.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		Platform=102, Identifier=103, DOT=104, LCURLY=105, LPAREN=106, LBRACK=107, 
		RCURLY=108, RPAREN=109, RBRACK=110, COMMA=111, COLON=112, SEMI=113, LT=114, 
		GT=115, UNDERSCORE=116, BANG=117, QUESTION=118, AT=119, AND=120, SUB=121, 
		EQUAL=122, OR=123, DIV=124, ADD=125, MUL=126, MOD=127, CARET=128, TILDE=129, 
		Operator_head_other=130, Operator_following_character=131, Implicit_parameter_name=132, 
		Binary_literal=133, Octal_literal=134, Decimal_literal=135, Pure_decimal_digits=136, 
		Hexadecimal_literal=137, Floating_point_literal=138, Static_string_literal=139, 
		Interpolated_string_literal=140, WS=141, Block_comment=142, Line_comment=143;
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_loop_statement = 3, 
		RULE_for_statement = 4, RULE_for_init = 5, RULE_for_in_statement = 6, 
		RULE_while_statement = 7, RULE_condition_clause = 8, RULE_condition_list = 9, 
		RULE_condition = 10, RULE_case_condition = 11, RULE_optional_binding_condition = 12, 
		RULE_optional_binding_head = 13, RULE_optional_binding_continuation_list = 14, 
		RULE_optional_binding_continuation = 15, RULE_repeat_while_statement = 16, 
		RULE_branch_statement = 17, RULE_if_statement = 18, RULE_else_clause = 19, 
		RULE_guard_statement = 20, RULE_switch_statement = 21, RULE_switch_cases = 22, 
		RULE_switch_case = 23, RULE_case_label = 24, RULE_case_item_list = 25, 
		RULE_default_label = 26, RULE_where_clause = 27, RULE_where_expression = 28, 
		RULE_labeled_statement = 29, RULE_statement_label = 30, RULE_label_name = 31, 
		RULE_control_transfer_statement = 32, RULE_break_statement = 33, RULE_continue_statement = 34, 
		RULE_fallthrough_statement = 35, RULE_return_statement = 36, RULE_availability_condition = 37, 
		RULE_availability_arguments = 38, RULE_availability_argument = 39, RULE_throw_statement = 40, 
		RULE_defer_statement = 41, RULE_do_statement = 42, RULE_catch_clauses = 43, 
		RULE_catch_clause = 44, RULE_compiler_control_statement = 45, RULE_build_configuration_statement = 46, 
		RULE_build_configuration_elseif_clauses = 47, RULE_build_configuration_elseif_clause = 48, 
		RULE_build_configuration_else_clause = 49, RULE_build_configuration = 50, 
		RULE_platform_testing_function = 51, RULE_operating_system = 52, RULE_architecture = 53, 
		RULE_line_control_statement = 54, RULE_line_number = 55, RULE_file_name = 56, 
		RULE_generic_parameter_clause = 57, RULE_generic_parameter_list = 58, 
		RULE_generic_parameter = 59, RULE_requirement_clause = 60, RULE_requirement_list = 61, 
		RULE_requirement = 62, RULE_conformance_requirement = 63, RULE_same_type_requirement = 64, 
		RULE_generic_argument_clause = 65, RULE_generic_argument_list = 66, RULE_generic_argument = 67, 
		RULE_declaration = 68, RULE_declarations = 69, RULE_top_level_declaration = 70, 
		RULE_code_block = 71, RULE_import_declaration = 72, RULE_import_kind = 73, 
		RULE_import_path = 74, RULE_import_path_identifier = 75, RULE_constant_declaration = 76, 
		RULE_pattern_initializer_list = 77, RULE_pattern_initializer = 78, RULE_initializer = 79, 
		RULE_variable_declaration = 80, RULE_variable_declaration_head = 81, RULE_variable_name = 82, 
		RULE_getter_setter_block = 83, RULE_getter_clause = 84, RULE_setter_clause = 85, 
		RULE_setter_name = 86, RULE_getter_setter_keyword_block = 87, RULE_getter_keyword_clause = 88, 
		RULE_setter_keyword_clause = 89, RULE_willSet_didSet_block = 90, RULE_willSet_clause = 91, 
		RULE_didSet_clause = 92, RULE_typealias_declaration = 93, RULE_typealias_head = 94, 
		RULE_typealias_name = 95, RULE_typealias_assignment = 96, RULE_function_declaration = 97, 
		RULE_function_head = 98, RULE_function_name = 99, RULE_function_signature = 100, 
		RULE_function_result = 101, RULE_function_body = 102, RULE_parameter_clauses = 103, 
		RULE_parameter_clause = 104, RULE_parameter_list = 105, RULE_parameter = 106, 
		RULE_external_parameter_name = 107, RULE_local_parameter_name = 108, RULE_default_argument_clause = 109, 
		RULE_enum_declaration = 110, RULE_union_style_enum = 111, RULE_union_style_enum_members = 112, 
		RULE_union_style_enum_member = 113, RULE_union_style_enum_case_clause = 114, 
		RULE_union_style_enum_case_list = 115, RULE_union_style_enum_case = 116, 
		RULE_enum_name = 117, RULE_enum_case_name = 118, RULE_raw_value_style_enum = 119, 
		RULE_raw_value_style_enum_members = 120, RULE_raw_value_style_enum_member = 121, 
		RULE_raw_value_style_enum_case_clause = 122, RULE_raw_value_style_enum_case_list = 123, 
		RULE_raw_value_style_enum_case = 124, RULE_raw_value_assignment = 125, 
		RULE_raw_value_literal = 126, RULE_struct_declaration = 127, RULE_struct_name = 128, 
		RULE_struct_body = 129, RULE_class_declaration = 130, RULE_class_name = 131, 
		RULE_class_body = 132, RULE_protocol_declaration = 133, RULE_protocol_name = 134, 
		RULE_protocol_body = 135, RULE_protocol_member_declaration = 136, RULE_protocol_member_declarations = 137, 
		RULE_protocol_property_declaration = 138, RULE_protocol_method_declaration = 139, 
		RULE_protocol_initializer_declaration = 140, RULE_protocol_subscript_declaration = 141, 
		RULE_protocol_associated_type_declaration = 142, RULE_initializer_declaration = 143, 
		RULE_initializer_head = 144, RULE_initializer_body = 145, RULE_deinitializer_declaration = 146, 
		RULE_extension_declaration = 147, RULE_extension_body = 148, RULE_subscript_declaration = 149, 
		RULE_subscript_head = 150, RULE_subscript_result = 151, RULE_operator_declaration = 152, 
		RULE_prefix_operator_declaration = 153, RULE_postfix_operator_declaration = 154, 
		RULE_infix_operator_declaration = 155, RULE_infix_operator_attributes = 156, 
		RULE_precedence_clause = 157, RULE_precedence_level = 158, RULE_associativity_clause = 159, 
		RULE_associativity = 160, RULE_declaration_modifier = 161, RULE_declaration_modifiers = 162, 
		RULE_access_level_modifier = 163, RULE_pattern = 164, RULE_wildcard_pattern = 165, 
		RULE_identifier_pattern = 166, RULE_value_binding_pattern = 167, RULE_tuple_pattern = 168, 
		RULE_tuple_pattern_element_list = 169, RULE_tuple_pattern_element = 170, 
		RULE_enum_case_pattern = 171, RULE_optional_pattern = 172, RULE_expression_pattern = 173, 
		RULE_attribute = 174, RULE_attribute_name = 175, RULE_attribute_argument_clause = 176, 
		RULE_attributes = 177, RULE_balanced_tokens = 178, RULE_balanced_token = 179, 
		RULE_expression = 180, RULE_expression_list = 181, RULE_prefix_expression = 182, 
		RULE_in_out_expression = 183, RULE_try_operator = 184, RULE_binary_expression = 185, 
		RULE_binary_expressions = 186, RULE_conditional_operator = 187, RULE_type_casting_operator = 188, 
		RULE_primary_expression = 189, RULE_implicit_member_expression = 190, 
		RULE_literal_expression = 191, RULE_array_literal = 192, RULE_array_literal_items = 193, 
		RULE_array_literal_item = 194, RULE_dictionary_literal = 195, RULE_dictionary_literal_items = 196, 
		RULE_dictionary_literal_item = 197, RULE_empty_dictionary_literal = 198, 
		RULE_self_expression = 199, RULE_superclass_expression = 200, RULE_superclass_method_expression = 201, 
		RULE_superclass_subscript_expression = 202, RULE_superclass_initializer_expression = 203, 
		RULE_closure_expression = 204, RULE_closure_signature = 205, RULE_capture_list = 206, 
		RULE_capture_list_items = 207, RULE_capture_list_item = 208, RULE_capture_specifier = 209, 
		RULE_parenthesized_expression = 210, RULE_expression_element_list = 211, 
		RULE_expression_element = 212, RULE_wildcard_expression = 213, RULE_selector_expression = 214, 
		RULE_postfix_expression = 215, RULE_argument_names = 216, RULE_argument_name = 217, 
		RULE_trailing_closure = 218, RULE_type = 219, RULE_array_definition = 220, 
		RULE_dictionary_definition = 221, RULE_type_annotation = 222, RULE_type_identifier = 223, 
		RULE_type_name = 224, RULE_tuple_type = 225, RULE_tuple_type_body = 226, 
		RULE_tuple_type_element_list = 227, RULE_tuple_type_element = 228, RULE_element_name = 229, 
		RULE_protocol_composition_type = 230, RULE_protocol_identifier_list = 231, 
		RULE_protocol_identifier = 232, RULE_type_inheritance_clause = 233, RULE_type_inheritance_list = 234, 
		RULE_class_requirement = 235, RULE_identifier = 236, RULE_identifier_list = 237, 
		RULE_context_sensitive_keyword = 238, RULE_assignment_operator = 239, 
		RULE_negate_prefix_operator = 240, RULE_build_AND = 241, RULE_build_OR = 242, 
		RULE_arrow_operator = 243, RULE_range_operator = 244, RULE_same_type_equals = 245, 
		RULE_binary_operator = 246, RULE_prefix_operator = 247, RULE_postfix_operator = 248, 
		RULE_operator = 249, RULE_operator_character = 250, RULE_operator_head = 251, 
		RULE_dot_operator_head = 252, RULE_dot_operator_character = 253, RULE_literal = 254, 
		RULE_numeric_literal = 255, RULE_boolean_literal = 256, RULE_nil_literal = 257, 
		RULE_integer_literal = 258, RULE_string_literal = 259;
	public static final String[] ruleNames = {
		"top_level", "statement", "statements", "loop_statement", "for_statement", 
		"for_init", "for_in_statement", "while_statement", "condition_clause", 
		"condition_list", "condition", "case_condition", "optional_binding_condition", 
		"optional_binding_head", "optional_binding_continuation_list", "optional_binding_continuation", 
		"repeat_while_statement", "branch_statement", "if_statement", "else_clause", 
		"guard_statement", "switch_statement", "switch_cases", "switch_case", 
		"case_label", "case_item_list", "default_label", "where_clause", "where_expression", 
		"labeled_statement", "statement_label", "label_name", "control_transfer_statement", 
		"break_statement", "continue_statement", "fallthrough_statement", "return_statement", 
		"availability_condition", "availability_arguments", "availability_argument", 
		"throw_statement", "defer_statement", "do_statement", "catch_clauses", 
		"catch_clause", "compiler_control_statement", "build_configuration_statement", 
		"build_configuration_elseif_clauses", "build_configuration_elseif_clause", 
		"build_configuration_else_clause", "build_configuration", "platform_testing_function", 
		"operating_system", "architecture", "line_control_statement", "line_number", 
		"file_name", "generic_parameter_clause", "generic_parameter_list", "generic_parameter", 
		"requirement_clause", "requirement_list", "requirement", "conformance_requirement", 
		"same_type_requirement", "generic_argument_clause", "generic_argument_list", 
		"generic_argument", "declaration", "declarations", "top_level_declaration", 
		"code_block", "import_declaration", "import_kind", "import_path", "import_path_identifier", 
		"constant_declaration", "pattern_initializer_list", "pattern_initializer", 
		"initializer", "variable_declaration", "variable_declaration_head", "variable_name", 
		"getter_setter_block", "getter_clause", "setter_clause", "setter_name", 
		"getter_setter_keyword_block", "getter_keyword_clause", "setter_keyword_clause", 
		"willSet_didSet_block", "willSet_clause", "didSet_clause", "typealias_declaration", 
		"typealias_head", "typealias_name", "typealias_assignment", "function_declaration", 
		"function_head", "function_name", "function_signature", "function_result", 
		"function_body", "parameter_clauses", "parameter_clause", "parameter_list", 
		"parameter", "external_parameter_name", "local_parameter_name", "default_argument_clause", 
		"enum_declaration", "union_style_enum", "union_style_enum_members", "union_style_enum_member", 
		"union_style_enum_case_clause", "union_style_enum_case_list", "union_style_enum_case", 
		"enum_name", "enum_case_name", "raw_value_style_enum", "raw_value_style_enum_members", 
		"raw_value_style_enum_member", "raw_value_style_enum_case_clause", "raw_value_style_enum_case_list", 
		"raw_value_style_enum_case", "raw_value_assignment", "raw_value_literal", 
		"struct_declaration", "struct_name", "struct_body", "class_declaration", 
		"class_name", "class_body", "protocol_declaration", "protocol_name", "protocol_body", 
		"protocol_member_declaration", "protocol_member_declarations", "protocol_property_declaration", 
		"protocol_method_declaration", "protocol_initializer_declaration", "protocol_subscript_declaration", 
		"protocol_associated_type_declaration", "initializer_declaration", "initializer_head", 
		"initializer_body", "deinitializer_declaration", "extension_declaration", 
		"extension_body", "subscript_declaration", "subscript_head", "subscript_result", 
		"operator_declaration", "prefix_operator_declaration", "postfix_operator_declaration", 
		"infix_operator_declaration", "infix_operator_attributes", "precedence_clause", 
		"precedence_level", "associativity_clause", "associativity", "declaration_modifier", 
		"declaration_modifiers", "access_level_modifier", "pattern", "wildcard_pattern", 
		"identifier_pattern", "value_binding_pattern", "tuple_pattern", "tuple_pattern_element_list", 
		"tuple_pattern_element", "enum_case_pattern", "optional_pattern", "expression_pattern", 
		"attribute", "attribute_name", "attribute_argument_clause", "attributes", 
		"balanced_tokens", "balanced_token", "expression", "expression_list", 
		"prefix_expression", "in_out_expression", "try_operator", "binary_expression", 
		"binary_expressions", "conditional_operator", "type_casting_operator", 
		"primary_expression", "implicit_member_expression", "literal_expression", 
		"array_literal", "array_literal_items", "array_literal_item", "dictionary_literal", 
		"dictionary_literal_items", "dictionary_literal_item", "empty_dictionary_literal", 
		"self_expression", "superclass_expression", "superclass_method_expression", 
		"superclass_subscript_expression", "superclass_initializer_expression", 
		"closure_expression", "closure_signature", "capture_list", "capture_list_items", 
		"capture_list_item", "capture_specifier", "parenthesized_expression", 
		"expression_element_list", "expression_element", "wildcard_expression", 
		"selector_expression", "postfix_expression", "argument_names", "argument_name", 
		"trailing_closure", "type", "array_definition", "dictionary_definition", 
		"type_annotation", "type_identifier", "type_name", "tuple_type", "tuple_type_body", 
		"tuple_type_element_list", "tuple_type_element", "element_name", "protocol_composition_type", 
		"protocol_identifier_list", "protocol_identifier", "type_inheritance_clause", 
		"type_inheritance_list", "class_requirement", "identifier", "identifier_list", 
		"context_sensitive_keyword", "assignment_operator", "negate_prefix_operator", 
		"build_AND", "build_OR", "arrow_operator", "range_operator", "same_type_equals", 
		"binary_operator", "prefix_operator", "postfix_operator", "operator", 
		"operator_character", "operator_head", "dot_operator_head", "dot_operator_character", 
		"literal", "numeric_literal", "boolean_literal", "nil_literal", "integer_literal", 
		"string_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'for'", "'case'", "'in'", "'while'", "'let'", "'var'", "'repeat'", 
		"'if'", "'else'", "'guard'", "'switch'", "'default'", "'where'", "'break'", 
		"'continue'", "'fallthrough'", "'return'", "'#available'", "'throw'", 
		"'defer'", "'do'", "'catch'", "'#if'", "'#endif'", "'#elseif'", "'#else'", 
		"'os'", "'arch'", "'OSX'", "'iOS'", "'watchOS'", "'tvOS'", "'i386'", "'x86_64'", 
		"'arm'", "'arm64'", "'#line'", "'import'", "'typealias'", "'struct'", 
		"'class'", "'enum'", "'protocol'", "'func'", "'get'", "'set'", "'willSet'", 
		"'didSet'", "'throws'", "'rethrows'", "'inout'", "'indirect'", "'associatedtype'", 
		"'init'", "'deinit'", "'extension'", "'subscript'", "'prefix'", "'operator'", 
		"'postfix'", "'infix'", "'precedence'", "'associativity'", "'left'", "'right'", 
		"'none'", "'convenience'", "'dynamic'", "'final'", "'lazy'", "'mutating'", 
		"'nonmutating'", "'optional'", "'override'", "'required'", "'static'", 
		"'unowned'", "'safe'", "'unsafe'", "'weak'", "'internal'", "'private'", 
		"'public'", "'is'", "'as'", "'try'", "'__FILE__'", "'__LINE__'", "'__COLUMN__'", 
		"'__FUNCTION__'", "'self'", "'super'", "'unowned(safe)'", "'unowned(unsafe)'", 
		"'#selector'", "'dynamicType'", "'Type'", "'Protocol'", "'true'", "'false'", 
		"'nil'", null, null, "'.'", "'{'", "'('", "'['", "'}'", "')'", "']'", 
		"','", "':'", "';'", "'<'", "'>'", "'_'", "'!'", "'?'", "'@'", "'&'", 
		"'-'", "'='", "'|'", "'/'", "'+'", "'*'", "'%'", "'^'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "Platform", "Identifier", "DOT", "LCURLY", 
		"LPAREN", "LBRACK", "RCURLY", "RPAREN", "RBRACK", "COMMA", "COLON", "SEMI", 
		"LT", "GT", "UNDERSCORE", "BANG", "QUESTION", "AT", "AND", "SUB", "EQUAL", 
		"OR", "DIV", "ADD", "MUL", "MOD", "CARET", "TILDE", "Operator_head_other", 
		"Operator_following_character", "Implicit_parameter_name", "Binary_literal", 
		"Octal_literal", "Decimal_literal", "Pure_decimal_digits", "Hexadecimal_literal", 
		"Floating_point_literal", "Static_string_literal", "Interpolated_string_literal", 
		"WS", "Block_comment", "Line_comment"
	};
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
	public String getGrammarFileName() { return "Swift.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Top_levelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SwiftParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Top_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTop_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_levelContext top_level() throws RecognitionException {
		Top_levelContext _localctx = new Top_levelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					statement();
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(526);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Control_transfer_statementContext control_transfer_statement() {
			return getRuleContext(Control_transfer_statementContext.class,0);
		}
		public Defer_statementContext defer_statement() {
			return getRuleContext(Defer_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				expression();
				setState(530);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(529);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				declaration();
				setState(534);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(533);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				loop_statement();
				setState(538);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(537);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				branch_statement();
				setState(542);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(541);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				labeled_statement();
				setState(546);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(545);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(548);
				control_transfer_statement();
				setState(550);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(549);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(552);
				defer_statement();
				setState(554);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(553);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(556);
				do_statement();
				setState(558);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(557);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(560);
				compiler_control_statement();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(563);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(566); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Loop_statementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Repeat_while_statementContext repeat_while_statement() {
			return getRuleContext(Repeat_while_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop_statement);
		try {
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				for_in_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(571);
				repeat_while_statement();
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

	public static class For_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_statement);
		try {
			setState(602);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(T__0);
				setState(576);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(575);
					for_init();
					}
					break;
				}
				setState(578);
				match(SEMI);
				setState(580);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(579);
					expression();
					}
					break;
				}
				setState(582);
				match(SEMI);
				setState(584);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(583);
					expression();
					}
					break;
				}
				setState(586);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(T__0);
				setState(588);
				match(LPAREN);
				setState(590);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(589);
					for_init();
					}
					break;
				}
				setState(592);
				match(SEMI);
				setState(594);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(593);
					expression();
					}
					break;
				}
				setState(596);
				match(SEMI);
				setState(598);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(597);
					expression();
					}
					break;
				}
				setState(600);
				match(RPAREN);
				setState(601);
				code_block();
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

	public static class For_initContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFor_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_init);
		try {
			setState(606);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				expression_list();
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

	public static class For_in_statementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFor_in_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(T__0);
			setState(610);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(609);
				match(T__1);
				}
				break;
			}
			setState(612);
			pattern(0);
			setState(613);
			match(T__2);
			setState(614);
			expression();
			setState(616);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(615);
				where_clause();
				}
			}

			setState(618);
			code_block();
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

	public static class While_statementContext extends ParserRuleContext {
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(T__3);
			setState(621);
			condition_clause();
			setState(622);
			code_block();
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

	public static class Condition_clauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public Availability_conditionContext availability_condition() {
			return getRuleContext(Availability_conditionContext.class,0);
		}
		public Condition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCondition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_clauseContext condition_clause() throws RecognitionException {
		Condition_clauseContext _localctx = new Condition_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition_clause);
		try {
			setState(634);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				expression();
				setState(626);
				match(COMMA);
				setState(627);
				condition_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				condition_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(630);
				availability_condition();
				setState(631);
				match(COMMA);
				setState(632);
				expression();
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

	public static class Condition_listContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public Condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCondition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_listContext condition_list() throws RecognitionException {
		Condition_listContext _localctx = new Condition_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			condition();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(637);
				match(COMMA);
				setState(638);
				condition();
				}
				}
				setState(643);
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

	public static class ConditionContext extends ParserRuleContext {
		public Availability_conditionContext availability_condition() {
			return getRuleContext(Availability_conditionContext.class,0);
		}
		public Case_conditionContext case_condition() {
			return getRuleContext(Case_conditionContext.class,0);
		}
		public Optional_binding_conditionContext optional_binding_condition() {
			return getRuleContext(Optional_binding_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(647);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				availability_condition();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				case_condition();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(646);
				optional_binding_condition();
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

	public static class Case_conditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Case_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCase_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_conditionContext case_condition() throws RecognitionException {
		Case_conditionContext _localctx = new Case_conditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(T__1);
			setState(650);
			pattern(0);
			setState(651);
			initializer();
			setState(653);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(652);
				where_clause();
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

	public static class Optional_binding_conditionContext extends ParserRuleContext {
		public Optional_binding_headContext optional_binding_head() {
			return getRuleContext(Optional_binding_headContext.class,0);
		}
		public Optional_binding_continuation_listContext optional_binding_continuation_list() {
			return getRuleContext(Optional_binding_continuation_listContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Optional_binding_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_binding_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_conditionContext optional_binding_condition() throws RecognitionException {
		Optional_binding_conditionContext _localctx = new Optional_binding_conditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_optional_binding_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			optional_binding_head();
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(656);
				optional_binding_continuation_list();
				}
				break;
			}
			setState(660);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(659);
				where_clause();
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

	public static class Optional_binding_headContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Optional_binding_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_binding_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_headContext optional_binding_head() throws RecognitionException {
		Optional_binding_headContext _localctx = new Optional_binding_headContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optional_binding_head);
		try {
			setState(670);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(T__4);
				setState(663);
				pattern(0);
				setState(664);
				initializer();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(T__5);
				setState(667);
				pattern(0);
				setState(668);
				initializer();
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

	public static class Optional_binding_continuation_listContext extends ParserRuleContext {
		public List<Optional_binding_continuationContext> optional_binding_continuation() {
			return getRuleContexts(Optional_binding_continuationContext.class);
		}
		public Optional_binding_continuationContext optional_binding_continuation(int i) {
			return getRuleContext(Optional_binding_continuationContext.class,i);
		}
		public Optional_binding_continuation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_continuation_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_binding_continuation_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_continuation_listContext optional_binding_continuation_list() throws RecognitionException {
		Optional_binding_continuation_listContext _localctx = new Optional_binding_continuation_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_optional_binding_continuation_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(COMMA);
			setState(673);
			optional_binding_continuation();
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(674);
					match(COMMA);
					setState(675);
					optional_binding_continuation();
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Optional_binding_continuationContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Optional_binding_headContext optional_binding_head() {
			return getRuleContext(Optional_binding_headContext.class,0);
		}
		public Optional_binding_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_continuation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_binding_continuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_continuationContext optional_binding_continuation() throws RecognitionException {
		Optional_binding_continuationContext _localctx = new Optional_binding_continuationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_optional_binding_continuation);
		try {
			setState(685);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				pattern(0);
				setState(682);
				initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				optional_binding_head();
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

	public static class Repeat_while_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repeat_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRepeat_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_while_statementContext repeat_while_statement() throws RecognitionException {
		Repeat_while_statementContext _localctx = new Repeat_while_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repeat_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(T__6);
			setState(688);
			code_block();
			setState(689);
			match(T__3);
			setState(690);
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

	public static class Branch_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Guard_statementContext guard_statement() {
			return getRuleContext(Guard_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBranch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_branch_statement);
		try {
			setState(695);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				guard_statement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(694);
				switch_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(T__7);
			setState(698);
			condition_clause();
			setState(699);
			code_block();
			setState(701);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(700);
				else_clause();
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

	public static class Else_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitElse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_else_clause);
		try {
			setState(707);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(T__8);
				setState(704);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(T__8);
				setState(706);
				if_statement();
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

	public static class Guard_statementContext extends ParserRuleContext {
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Guard_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGuard_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_statementContext guard_statement() throws RecognitionException {
		Guard_statementContext _localctx = new Guard_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_guard_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(T__9);
			setState(710);
			condition_clause();
			setState(711);
			match(T__8);
			setState(712);
			code_block();
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

	public static class Switch_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(T__10);
			setState(715);
			expression();
			setState(716);
			match(LCURLY);
			setState(718);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(717);
				switch_cases();
				}
			}

			setState(720);
			match(RCURLY);
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

	public static class Switch_casesContext extends ParserRuleContext {
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_casesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cases; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSwitch_cases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_casesContext switch_cases() throws RecognitionException {
		Switch_casesContext _localctx = new Switch_casesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			switch_case();
			setState(724);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(723);
				switch_cases();
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

	public static class Switch_caseContext extends ParserRuleContext {
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Default_labelContext default_label() {
			return getRuleContext(Default_labelContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switch_case);
		try {
			setState(732);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				case_label();
				setState(727);
				statements();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				default_label();
				setState(730);
				statements();
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

	public static class Case_labelContext extends ParserRuleContext {
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCase_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(T__1);
			setState(735);
			case_item_list();
			setState(736);
			match(COLON);
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

	public static class Case_item_listContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCase_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_item_listContext case_item_list() throws RecognitionException {
		Case_item_listContext _localctx = new Case_item_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_case_item_list);
		int _la;
		try {
			setState(749);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				pattern(0);
				setState(740);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(739);
					where_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				pattern(0);
				setState(744);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(743);
					where_clause();
					}
				}

				setState(746);
				match(COMMA);
				setState(747);
				case_item_list();
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

	public static class Default_labelContext extends ParserRuleContext {
		public Default_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDefault_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_labelContext default_label() throws RecognitionException {
		Default_labelContext _localctx = new Default_labelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_default_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(T__11);
			setState(752);
			match(COLON);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public Where_expressionContext where_expression() {
			return getRuleContext(Where_expressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(T__12);
			setState(755);
			where_expression();
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

	public static class Where_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWhere_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_expressionContext where_expression() throws RecognitionException {
		Where_expressionContext _localctx = new Where_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_where_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
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

	public static class Labeled_statementContext extends ParserRuleContext {
		public Statement_labelContext statement_label() {
			return getRuleContext(Statement_labelContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_labeled_statement);
		try {
			setState(768);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				statement_label();
				setState(760);
				loop_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				statement_label();
				setState(763);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(765);
				statement_label();
				setState(766);
				switch_statement();
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

	public static class Statement_labelContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Statement_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStatement_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_labelContext statement_label() throws RecognitionException {
		Statement_labelContext _localctx = new Statement_labelContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			label_name();
			setState(771);
			match(COLON);
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

	public static class Label_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLabel_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_nameContext label_name() throws RecognitionException {
		Label_nameContext _localctx = new Label_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			identifier();
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

	public static class Control_transfer_statementContext extends ParserRuleContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Fallthrough_statementContext fallthrough_statement() {
			return getRuleContext(Fallthrough_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Throw_statementContext throw_statement() {
			return getRuleContext(Throw_statementContext.class,0);
		}
		public Control_transfer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_transfer_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitControl_transfer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_transfer_statementContext control_transfer_statement() throws RecognitionException {
		Control_transfer_statementContext _localctx = new Control_transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_control_transfer_statement);
		try {
			setState(780);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
				break_statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				continue_statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(777);
				fallthrough_statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(778);
				return_statement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(779);
				throw_statement();
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

	public static class Break_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(T__13);
			setState(784);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(783);
				label_name();
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

	public static class Continue_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(T__14);
			setState(788);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(787);
				label_name();
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

	public static class Fallthrough_statementContext extends ParserRuleContext {
		public Fallthrough_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthrough_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFallthrough_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fallthrough_statementContext fallthrough_statement() throws RecognitionException {
		Fallthrough_statementContext _localctx = new Fallthrough_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fallthrough_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(T__15);
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(T__16);
			setState(794);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(793);
				expression();
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

	public static class Availability_conditionContext extends ParserRuleContext {
		public Availability_argumentsContext availability_arguments() {
			return getRuleContext(Availability_argumentsContext.class,0);
		}
		public Availability_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAvailability_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_conditionContext availability_condition() throws RecognitionException {
		Availability_conditionContext _localctx = new Availability_conditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_availability_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(T__17);
			setState(797);
			match(LPAREN);
			setState(798);
			availability_arguments();
			setState(799);
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

	public static class Availability_argumentsContext extends ParserRuleContext {
		public List<Availability_argumentContext> availability_argument() {
			return getRuleContexts(Availability_argumentContext.class);
		}
		public Availability_argumentContext availability_argument(int i) {
			return getRuleContext(Availability_argumentContext.class,i);
		}
		public Availability_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAvailability_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_argumentsContext availability_arguments() throws RecognitionException {
		Availability_argumentsContext _localctx = new Availability_argumentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_availability_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			availability_argument();
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(802);
				match(COMMA);
				setState(803);
				availability_argument();
				}
				}
				setState(808);
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

	public static class Availability_argumentContext extends ParserRuleContext {
		public TerminalNode Platform() { return getToken(SwiftParser.Platform, 0); }
		public Availability_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAvailability_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_argumentContext availability_argument() throws RecognitionException {
		Availability_argumentContext _localctx = new Availability_argumentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_availability_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			_la = _input.LA(1);
			if ( !(_la==Platform || _la==MUL) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Throw_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(T__18);
			setState(812);
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

	public static class Defer_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Defer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defer_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDefer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defer_statementContext defer_statement() throws RecognitionException {
		Defer_statementContext _localctx = new Defer_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_defer_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(T__19);
			setState(815);
			code_block();
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

	public static class Do_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(T__20);
			setState(818);
			code_block();
			setState(820);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(819);
				catch_clauses();
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

	public static class Catch_clausesContext extends ParserRuleContext {
		public Catch_clauseContext catch_clause() {
			return getRuleContext(Catch_clauseContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCatch_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_catch_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			catch_clause();
			setState(824);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(823);
				catch_clauses();
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

	public static class Catch_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCatch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clauseContext catch_clause() throws RecognitionException {
		Catch_clauseContext _localctx = new Catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(T__21);
			setState(828);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(827);
				pattern(0);
				}
				break;
			}
			setState(831);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(830);
				where_clause();
				}
			}

			setState(833);
			code_block();
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

	public static class Compiler_control_statementContext extends ParserRuleContext {
		public Build_configuration_statementContext build_configuration_statement() {
			return getRuleContext(Build_configuration_statementContext.class,0);
		}
		public Line_control_statementContext line_control_statement() {
			return getRuleContext(Line_control_statementContext.class,0);
		}
		public Compiler_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_control_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCompiler_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compiler_control_statementContext compiler_control_statement() throws RecognitionException {
		Compiler_control_statementContext _localctx = new Compiler_control_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_compiler_control_statement);
		try {
			setState(837);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				build_configuration_statement();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				line_control_statement();
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

	public static class Build_configuration_statementContext extends ParserRuleContext {
		public Build_configurationContext build_configuration() {
			return getRuleContext(Build_configurationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Build_configuration_elseif_clausesContext build_configuration_elseif_clauses() {
			return getRuleContext(Build_configuration_elseif_clausesContext.class,0);
		}
		public Build_configuration_else_clauseContext build_configuration_else_clause() {
			return getRuleContext(Build_configuration_else_clauseContext.class,0);
		}
		public Build_configuration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_configuration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_statementContext build_configuration_statement() throws RecognitionException {
		Build_configuration_statementContext _localctx = new Build_configuration_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_build_configuration_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(T__22);
			setState(840);
			build_configuration(0);
			setState(842);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(841);
				statements();
				}
				break;
			}
			setState(845);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(844);
				build_configuration_elseif_clauses();
				}
			}

			setState(848);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(847);
				build_configuration_else_clause();
				}
			}

			setState(850);
			match(T__23);
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

	public static class Build_configuration_elseif_clausesContext extends ParserRuleContext {
		public Build_configuration_elseif_clauseContext build_configuration_elseif_clause() {
			return getRuleContext(Build_configuration_elseif_clauseContext.class,0);
		}
		public Build_configuration_elseif_clausesContext build_configuration_elseif_clauses() {
			return getRuleContext(Build_configuration_elseif_clausesContext.class,0);
		}
		public Build_configuration_elseif_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_elseif_clauses; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_configuration_elseif_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_elseif_clausesContext build_configuration_elseif_clauses() throws RecognitionException {
		Build_configuration_elseif_clausesContext _localctx = new Build_configuration_elseif_clausesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_build_configuration_elseif_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			build_configuration_elseif_clause();
			setState(854);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(853);
				build_configuration_elseif_clauses();
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

	public static class Build_configuration_elseif_clauseContext extends ParserRuleContext {
		public Build_configurationContext build_configuration() {
			return getRuleContext(Build_configurationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Build_configuration_elseif_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_elseif_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_configuration_elseif_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_elseif_clauseContext build_configuration_elseif_clause() throws RecognitionException {
		Build_configuration_elseif_clauseContext _localctx = new Build_configuration_elseif_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_build_configuration_elseif_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(T__24);
			setState(857);
			build_configuration(0);
			setState(859);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(858);
				statements();
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

	public static class Build_configuration_else_clauseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Build_configuration_else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration_else_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_configuration_else_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configuration_else_clauseContext build_configuration_else_clause() throws RecognitionException {
		Build_configuration_else_clauseContext _localctx = new Build_configuration_else_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_build_configuration_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(T__25);
			setState(863);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(862);
				statements();
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

	public static class Build_configurationContext extends ParserRuleContext {
		public List<Build_configurationContext> build_configuration() {
			return getRuleContexts(Build_configurationContext.class);
		}
		public Build_configurationContext build_configuration(int i) {
			return getRuleContext(Build_configurationContext.class,i);
		}
		public Platform_testing_functionContext platform_testing_function() {
			return getRuleContext(Platform_testing_functionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Build_ANDContext build_AND() {
			return getRuleContext(Build_ANDContext.class,0);
		}
		public Build_ORContext build_OR() {
			return getRuleContext(Build_ORContext.class,0);
		}
		public Build_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_configuration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_configuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_configurationContext build_configuration() throws RecognitionException {
		return build_configuration(0);
	}

	private Build_configurationContext build_configuration(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Build_configurationContext _localctx = new Build_configurationContext(_ctx, _parentState);
		Build_configurationContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_build_configuration, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			switch (_input.LA(1)) {
			case BANG:
				{
				setState(866);
				match(BANG);
				setState(867);
				build_configuration(3);
				}
				break;
			case T__26:
			case T__27:
				{
				setState(868);
				platform_testing_function();
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				{
				setState(869);
				identifier();
				}
				break;
			case T__98:
			case T__99:
				{
				setState(870);
				boolean_literal();
				}
				break;
			case LPAREN:
				{
				setState(871);
				match(LPAREN);
				setState(872);
				build_configuration(0);
				setState(873);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(885);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new Build_configurationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_build_configuration);
						setState(877);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(878);
						build_AND();
						setState(879);
						build_configuration(3);
						}
						break;
					case 2:
						{
						_localctx = new Build_configurationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_build_configuration);
						setState(881);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(882);
						build_OR();
						setState(883);
						build_configuration(2);
						}
						break;
					}
					} 
				}
				setState(889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class Platform_testing_functionContext extends ParserRuleContext {
		public Operating_systemContext operating_system() {
			return getRuleContext(Operating_systemContext.class,0);
		}
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public Platform_testing_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platform_testing_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPlatform_testing_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Platform_testing_functionContext platform_testing_function() throws RecognitionException {
		Platform_testing_functionContext _localctx = new Platform_testing_functionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_platform_testing_function);
		try {
			setState(900);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				match(T__26);
				setState(891);
				match(LPAREN);
				setState(892);
				operating_system();
				setState(893);
				match(RPAREN);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				match(T__27);
				setState(896);
				match(LPAREN);
				setState(897);
				architecture();
				setState(898);
				match(RPAREN);
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

	public static class Operating_systemContext extends ParserRuleContext {
		public Operating_systemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operating_system; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperating_system(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operating_systemContext operating_system() throws RecognitionException {
		Operating_systemContext _localctx = new Operating_systemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operating_system);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ArchitectureContext extends ParserRuleContext {
		public ArchitectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArchitecture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArchitectureContext architecture() throws RecognitionException {
		ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_architecture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Line_control_statementContext extends ParserRuleContext {
		public Line_numberContext line_number() {
			return getRuleContext(Line_numberContext.class,0);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public Line_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_control_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLine_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_control_statementContext line_control_statement() throws RecognitionException {
		Line_control_statementContext _localctx = new Line_control_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_line_control_statement);
		try {
			setState(911);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(T__36);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				match(T__36);
				setState(908);
				line_number();
				setState(909);
				file_name();
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

	public static class Line_numberContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Line_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLine_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_numberContext line_number() throws RecognitionException {
		Line_numberContext _localctx = new Line_numberContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_line_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			integer_literal();
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

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode Static_string_literal() { return getToken(SwiftParser.Static_string_literal, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(Static_string_literal);
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

	public static class Generic_parameter_clauseContext extends ParserRuleContext {
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public Requirement_clauseContext requirement_clause() {
			return getRuleContext(Requirement_clauseContext.class,0);
		}
		public Generic_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_parameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_clauseContext generic_parameter_clause() throws RecognitionException {
		Generic_parameter_clauseContext _localctx = new Generic_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_generic_parameter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(LT);
			setState(918);
			generic_parameter_list();
			setState(920);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(919);
				requirement_clause();
				}
			}

			setState(922);
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

	public static class Generic_parameter_listContext extends ParserRuleContext {
		public List<Generic_parameterContext> generic_parameter() {
			return getRuleContexts(Generic_parameterContext.class);
		}
		public Generic_parameterContext generic_parameter(int i) {
			return getRuleContext(Generic_parameterContext.class,i);
		}
		public Generic_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_listContext generic_parameter_list() throws RecognitionException {
		Generic_parameter_listContext _localctx = new Generic_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_generic_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			generic_parameter();
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(925);
				match(COMMA);
				setState(926);
				generic_parameter();
				}
				}
				setState(931);
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

	public static class Generic_parameterContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameterContext generic_parameter() throws RecognitionException {
		Generic_parameterContext _localctx = new Generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_generic_parameter);
		try {
			setState(941);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				type_name();
				setState(934);
				match(COLON);
				setState(935);
				type_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(937);
				type_name();
				setState(938);
				match(COLON);
				setState(939);
				protocol_composition_type();
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

	public static class Requirement_clauseContext extends ParserRuleContext {
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Requirement_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRequirement_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_clauseContext requirement_clause() throws RecognitionException {
		Requirement_clauseContext _localctx = new Requirement_clauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_requirement_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(T__12);
			setState(944);
			requirement_list();
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

	public static class Requirement_listContext extends ParserRuleContext {
		public RequirementContext requirement() {
			return getRuleContext(RequirementContext.class,0);
		}
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Requirement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRequirement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_listContext requirement_list() throws RecognitionException {
		Requirement_listContext _localctx = new Requirement_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_requirement_list);
		try {
			setState(951);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				requirement();
				setState(948);
				match(COMMA);
				setState(949);
				requirement_list();
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

	public static class RequirementContext extends ParserRuleContext {
		public Conformance_requirementContext conformance_requirement() {
			return getRuleContext(Conformance_requirementContext.class,0);
		}
		public Same_type_requirementContext same_type_requirement() {
			return getRuleContext(Same_type_requirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_requirement);
		try {
			setState(955);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				conformance_requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				same_type_requirement();
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

	public static class Conformance_requirementContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Conformance_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformance_requirement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConformance_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conformance_requirementContext conformance_requirement() throws RecognitionException {
		Conformance_requirementContext _localctx = new Conformance_requirementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_conformance_requirement);
		try {
			setState(965);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				type_identifier();
				setState(958);
				match(COLON);
				setState(959);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(961);
				type_identifier();
				setState(962);
				match(COLON);
				setState(963);
				protocol_composition_type();
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

	public static class Same_type_requirementContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Same_type_equalsContext same_type_equals() {
			return getRuleContext(Same_type_equalsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Same_type_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_requirement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSame_type_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_requirementContext same_type_requirement() throws RecognitionException {
		Same_type_requirementContext _localctx = new Same_type_requirementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_same_type_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			type_identifier();
			setState(968);
			same_type_equals();
			setState(969);
			type(0);
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

	public static class Generic_argument_clauseContext extends ParserRuleContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public Generic_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_clauseContext generic_argument_clause() throws RecognitionException {
		Generic_argument_clauseContext _localctx = new Generic_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_generic_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(LT);
			setState(972);
			generic_argument_list();
			setState(973);
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

	public static class Generic_argument_listContext extends ParserRuleContext {
		public List<Generic_argumentContext> generic_argument() {
			return getRuleContexts(Generic_argumentContext.class);
		}
		public Generic_argumentContext generic_argument(int i) {
			return getRuleContext(Generic_argumentContext.class,i);
		}
		public Generic_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_listContext generic_argument_list() throws RecognitionException {
		Generic_argument_listContext _localctx = new Generic_argument_listContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_generic_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			generic_argument();
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(976);
				match(COMMA);
				setState(977);
				generic_argument();
				}
				}
				setState(982);
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

	public static class Generic_argumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Generic_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argumentContext generic_argument() throws RecognitionException {
		Generic_argumentContext _localctx = new Generic_argumentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_generic_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			type(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Import_declarationContext import_declaration() {
			return getRuleContext(Import_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Initializer_declarationContext initializer_declaration() {
			return getRuleContext(Initializer_declarationContext.class,0);
		}
		public Deinitializer_declarationContext deinitializer_declaration() {
			return getRuleContext(Deinitializer_declarationContext.class,0);
		}
		public Extension_declarationContext extension_declaration() {
			return getRuleContext(Extension_declarationContext.class,0);
		}
		public Subscript_declarationContext subscript_declaration() {
			return getRuleContext(Subscript_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declaration);
		try {
			setState(999);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				import_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				constant_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(987);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(988);
				typealias_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(989);
				function_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(990);
				enum_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(991);
				struct_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(992);
				class_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(993);
				protocol_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(994);
				initializer_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(995);
				deinitializer_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(996);
				extension_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(997);
				subscript_declaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(998);
				operator_declaration();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1001);
				declaration();
				}
				}
				setState(1004); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0) );
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

	public static class Top_level_declarationContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_level_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTop_level_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_level_declarationContext top_level_declaration() throws RecognitionException {
		Top_level_declarationContext _localctx = new Top_level_declarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_top_level_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(1006);
				statements();
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

	public static class Code_blockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(LCURLY);
			setState(1011);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1010);
				statements();
				}
				break;
			}
			setState(1013);
			match(RCURLY);
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

	public static class Import_declarationContext extends ParserRuleContext {
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Import_kindContext import_kind() {
			return getRuleContext(Import_kindContext.class,0);
		}
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1015);
				attributes();
				}
			}

			setState(1018);
			match(T__37);
			setState(1020);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
				{
				setState(1019);
				import_kind();
				}
			}

			setState(1022);
			import_path();
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

	public static class Import_kindContext extends ParserRuleContext {
		public Import_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_kind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_kindContext import_kind() throws RecognitionException {
		Import_kindContext _localctx = new Import_kindContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Import_pathContext extends ParserRuleContext {
		public Import_path_identifierContext import_path_identifier() {
			return getRuleContext(Import_path_identifierContext.class,0);
		}
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public Import_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_pathContext import_path() throws RecognitionException {
		Import_pathContext _localctx = new Import_pathContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_import_path);
		try {
			setState(1031);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
				import_path_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				import_path_identifier();
				setState(1028);
				match(DOT);
				setState(1029);
				import_path();
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

	public static class Import_path_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Import_path_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_path_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_path_identifierContext import_path_identifier() throws RecognitionException {
		Import_path_identifierContext _localctx = new Import_path_identifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_import_path_identifier);
		try {
			setState(1035);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				operator();
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

	public static class Constant_declarationContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(1037);
				attributes();
				}
				break;
			}
			setState(1041);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1040);
				declaration_modifiers();
				}
			}

			setState(1043);
			match(T__4);
			setState(1044);
			pattern_initializer_list();
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

	public static class Pattern_initializer_listContext extends ParserRuleContext {
		public List<Pattern_initializerContext> pattern_initializer() {
			return getRuleContexts(Pattern_initializerContext.class);
		}
		public Pattern_initializerContext pattern_initializer(int i) {
			return getRuleContext(Pattern_initializerContext.class,i);
		}
		public Pattern_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPattern_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializer_listContext pattern_initializer_list() throws RecognitionException {
		Pattern_initializer_listContext _localctx = new Pattern_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_pattern_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			pattern_initializer();
			setState(1051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1047);
					match(COMMA);
					setState(1048);
					pattern_initializer();
					}
					} 
				}
				setState(1053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class Pattern_initializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Pattern_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPattern_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializerContext pattern_initializer() throws RecognitionException {
		Pattern_initializerContext _localctx = new Pattern_initializerContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			pattern(0);
			setState(1056);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(1055);
				initializer();
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

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			assignment_operator();
			setState(1059);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public List<Type_annotationContext> type_annotation() {
			return getRuleContexts(Type_annotationContext.class);
		}
		public Type_annotationContext type_annotation(int i) {
			return getRuleContext(Type_annotationContext.class,i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public WillSet_didSet_blockContext willSet_didSet_block() {
			return getRuleContext(WillSet_didSet_blockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_variable_declaration);
		try {
			setState(1096);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				variable_declaration_head();
				setState(1062);
				pattern_initializer_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				variable_declaration_head();
				setState(1065);
				variable_name();
				setState(1066);
				type_annotation();
				setState(1067);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1069);
				variable_declaration_head();
				setState(1070);
				variable_name();
				setState(1071);
				type_annotation();
				setState(1072);
				getter_setter_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1074);
				variable_declaration_head();
				setState(1075);
				variable_name();
				setState(1076);
				type_annotation();
				setState(1077);
				getter_setter_keyword_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1079);
				variable_declaration_head();
				setState(1080);
				variable_name();
				setState(1081);
				type_annotation();
				setState(1083);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(1082);
					initializer();
					}
					break;
				}
				setState(1085);
				willSet_didSet_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1087);
				variable_declaration_head();
				setState(1088);
				variable_name();
				setState(1089);
				type_annotation();
				setState(1090);
				type_annotation();
				setState(1092);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(1091);
					initializer();
					}
					break;
				}
				setState(1094);
				willSet_didSet_block();
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

	public static class Variable_declaration_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Variable_declaration_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitVariable_declaration_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_headContext variable_declaration_head() throws RecognitionException {
		Variable_declaration_headContext _localctx = new Variable_declaration_headContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1098);
				attributes();
				}
				break;
			}
			setState(1102);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1101);
				declaration_modifiers();
				}
			}

			setState(1104);
			match(T__5);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			identifier();
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

	public static class Getter_setter_blockContext extends ParserRuleContext {
		public Getter_clauseContext getter_clause() {
			return getRuleContext(Getter_clauseContext.class,0);
		}
		public Setter_clauseContext setter_clause() {
			return getRuleContext(Setter_clauseContext.class,0);
		}
		public Getter_setter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_setter_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_blockContext getter_setter_block() throws RecognitionException {
		Getter_setter_blockContext _localctx = new Getter_setter_blockContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_getter_setter_block);
		int _la;
		try {
			setState(1120);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				match(LCURLY);
				setState(1109);
				getter_clause();
				setState(1111);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1110);
					setter_clause();
					}
				}

				setState(1113);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				match(LCURLY);
				setState(1116);
				setter_clause();
				setState(1117);
				getter_clause();
				setState(1118);
				match(RCURLY);
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

	public static class Getter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Getter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_clauseContext getter_clause() throws RecognitionException {
		Getter_clauseContext _localctx = new Getter_clauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_getter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1122);
				attributes();
				}
				break;
			}
			setState(1125);
			match(T__44);
			setState(1126);
			code_block();
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

	public static class Setter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public Setter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_clauseContext setter_clause() throws RecognitionException {
		Setter_clauseContext _localctx = new Setter_clauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1128);
				attributes();
				}
				break;
			}
			setState(1131);
			match(T__45);
			setState(1133);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1132);
				setter_name();
				}
			}

			setState(1135);
			code_block();
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

	public static class Setter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Setter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSetter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_nameContext setter_name() throws RecognitionException {
		Setter_nameContext _localctx = new Setter_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(LPAREN);
			setState(1138);
			identifier();
			setState(1139);
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

	public static class Getter_setter_keyword_blockContext extends ParserRuleContext {
		public Getter_keyword_clauseContext getter_keyword_clause() {
			return getRuleContext(Getter_keyword_clauseContext.class,0);
		}
		public Setter_keyword_clauseContext setter_keyword_clause() {
			return getRuleContext(Setter_keyword_clauseContext.class,0);
		}
		public Getter_setter_keyword_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_keyword_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_setter_keyword_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_keyword_blockContext getter_setter_keyword_block() throws RecognitionException {
		Getter_setter_keyword_blockContext _localctx = new Getter_setter_keyword_blockContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(1153);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				match(LCURLY);
				setState(1142);
				getter_keyword_clause();
				setState(1144);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1143);
					setter_keyword_clause();
					}
				}

				setState(1146);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148);
				match(LCURLY);
				setState(1149);
				setter_keyword_clause();
				setState(1150);
				getter_keyword_clause();
				setState(1151);
				match(RCURLY);
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

	public static class Getter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Getter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_keyword_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_keyword_clauseContext getter_keyword_clause() throws RecognitionException {
		Getter_keyword_clauseContext _localctx = new Getter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_getter_keyword_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1155);
				attributes();
				}
				break;
			}
			setState(1158);
			match(T__44);
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

	public static class Setter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_keyword_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_keyword_clauseContext setter_keyword_clause() throws RecognitionException {
		Setter_keyword_clauseContext _localctx = new Setter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_setter_keyword_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(1160);
				attributes();
				}
				break;
			}
			setState(1163);
			match(T__45);
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

	public static class WillSet_didSet_blockContext extends ParserRuleContext {
		public WillSet_clauseContext willSet_clause() {
			return getRuleContext(WillSet_clauseContext.class,0);
		}
		public DidSet_clauseContext didSet_clause() {
			return getRuleContext(DidSet_clauseContext.class,0);
		}
		public WillSet_didSet_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_didSet_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWillSet_didSet_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_didSet_blockContext willSet_didSet_block() throws RecognitionException {
		WillSet_didSet_blockContext _localctx = new WillSet_didSet_blockContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(1177);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165);
				match(LCURLY);
				setState(1166);
				willSet_clause();
				setState(1168);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1167);
					didSet_clause();
					}
				}

				setState(1170);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
				match(LCURLY);
				setState(1173);
				didSet_clause();
				setState(1174);
				willSet_clause();
				setState(1175);
				match(RCURLY);
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

	public static class WillSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public WillSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWillSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_clauseContext willSet_clause() throws RecognitionException {
		WillSet_clauseContext _localctx = new WillSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1179);
				attributes();
				}
				break;
			}
			setState(1182);
			match(T__46);
			setState(1184);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1183);
				setter_name();
				}
			}

			setState(1186);
			code_block();
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

	public static class DidSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public DidSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSet_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDidSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DidSet_clauseContext didSet_clause() throws RecognitionException {
		DidSet_clauseContext _localctx = new DidSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1188);
				attributes();
				}
				break;
			}
			setState(1191);
			match(T__47);
			setState(1193);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1192);
				setter_name();
				}
			}

			setState(1195);
			code_block();
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

	public static class Typealias_declarationContext extends ParserRuleContext {
		public Typealias_headContext typealias_head() {
			return getRuleContext(Typealias_headContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Typealias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_declarationContext typealias_declaration() throws RecognitionException {
		Typealias_declarationContext _localctx = new Typealias_declarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_typealias_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			typealias_head();
			setState(1198);
			typealias_assignment();
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

	public static class Typealias_headContext extends ParserRuleContext {
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Typealias_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_headContext typealias_head() throws RecognitionException {
		Typealias_headContext _localctx = new Typealias_headContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typealias_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1200);
				attributes();
				}
			}

			setState(1204);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1203);
				access_level_modifier();
				}
			}

			setState(1206);
			match(T__38);
			setState(1207);
			typealias_name();
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

	public static class Typealias_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Typealias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_nameContext typealias_name() throws RecognitionException {
		Typealias_nameContext _localctx = new Typealias_nameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typealias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			identifier();
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

	public static class Typealias_assignmentContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typealias_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_assignmentContext typealias_assignment() throws RecognitionException {
		Typealias_assignmentContext _localctx = new Typealias_assignmentContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typealias_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			assignment_operator();
			setState(1212);
			type(0);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			function_head();
			setState(1215);
			function_name();
			setState(1217);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1216);
				generic_parameter_clause();
				}
			}

			setState(1219);
			function_signature();
			setState(1221);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1220);
				function_body();
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

	public static class Function_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1223);
				attributes();
				}
				break;
			}
			setState(1227);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1226);
				declaration_modifiers();
				}
			}

			setState(1229);
			match(T__43);
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

	public static class Function_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_function_name);
		try {
			setState(1233);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231);
				identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				operator();
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

	public static class Function_signatureContext extends ParserRuleContext {
		public Parameter_clausesContext parameter_clauses() {
			return getRuleContext(Parameter_clausesContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_function_signature);
		try {
			setState(1247);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1235);
				parameter_clauses();
				setState(1237);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1236);
					match(T__48);
					}
					break;
				}
				setState(1240);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1239);
					function_result();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
				parameter_clauses();
				setState(1243);
				match(T__49);
				setState(1245);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1244);
					function_result();
					}
					break;
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

	public static class Function_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_result; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_function_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			arrow_operator();
			setState(1251);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1250);
				attributes();
				}
				break;
			}
			setState(1253);
			type(0);
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

	public static class Function_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			code_block();
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

	public static class Parameter_clausesContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Parameter_clausesContext parameter_clauses() {
			return getRuleContext(Parameter_clausesContext.class,0);
		}
		public Parameter_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clauses; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_clausesContext parameter_clauses() throws RecognitionException {
		Parameter_clausesContext _localctx = new Parameter_clausesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_parameter_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			parameter_clause();
			setState(1259);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1258);
				parameter_clauses();
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

	public static class Parameter_clauseContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_clauseContext parameter_clause() throws RecognitionException {
		Parameter_clauseContext _localctx = new Parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_parameter_clause);
		try {
			setState(1267);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				match(LPAREN);
				setState(1262);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				match(LPAREN);
				setState(1264);
				parameter_list();
				setState(1265);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			parameter();
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1270);
				match(COMMA);
				setState(1271);
				parameter();
				}
				}
				setState(1276);
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

	public static class ParameterContext extends ParserRuleContext {
		public Local_parameter_nameContext local_parameter_name() {
			return getRuleContext(Local_parameter_nameContext.class,0);
		}
		public External_parameter_nameContext external_parameter_name() {
			return getRuleContext(External_parameter_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Default_argument_clauseContext default_argument_clause() {
			return getRuleContext(Default_argument_clauseContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_parameter);
		int _la;
		try {
			setState(1315);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(1277);
					match(T__4);
					}
				}

				setState(1281);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1280);
					external_parameter_name();
					}
					break;
				}
				setState(1283);
				local_parameter_name();
				setState(1285);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1284);
					type_annotation();
					}
					break;
				}
				setState(1288);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1287);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				match(T__5);
				setState(1292);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1291);
					external_parameter_name();
					}
					break;
				}
				setState(1294);
				local_parameter_name();
				setState(1296);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1295);
					type_annotation();
					}
					break;
				}
				setState(1299);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1298);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1301);
				match(T__50);
				setState(1303);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1302);
					external_parameter_name();
					}
					break;
				}
				setState(1305);
				local_parameter_name();
				setState(1306);
				type_annotation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1309);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1308);
					external_parameter_name();
					}
					break;
				}
				setState(1311);
				local_parameter_name();
				setState(1312);
				type_annotation();
				setState(1313);
				range_operator();
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

	public static class External_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public External_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_parameter_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExternal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_parameter_nameContext external_parameter_name() throws RecognitionException {
		External_parameter_nameContext _localctx = new External_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_external_parameter_name);
		try {
			setState(1319);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1317);
				identifier();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1318);
				match(UNDERSCORE);
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

	public static class Local_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Local_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_parameter_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLocal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_parameter_nameContext local_parameter_name() throws RecognitionException {
		Local_parameter_nameContext _localctx = new Local_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_local_parameter_name);
		try {
			setState(1323);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321);
				identifier();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1322);
				match(UNDERSCORE);
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

	public static class Default_argument_clauseContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argument_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDefault_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_argument_clauseContext default_argument_clause() throws RecognitionException {
		Default_argument_clauseContext _localctx = new Default_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			assignment_operator();
			setState(1326);
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

	public static class Enum_declarationContext extends ParserRuleContext {
		public Union_style_enumContext union_style_enum() {
			return getRuleContext(Union_style_enumContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Raw_value_style_enumContext raw_value_style_enum() {
			return getRuleContext(Raw_value_style_enumContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_enum_declaration);
		int _la;
		try {
			setState(1342);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1328);
					attributes();
					}
					break;
				}
				setState(1332);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
					{
					setState(1331);
					access_level_modifier();
					}
				}

				setState(1334);
				union_style_enum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1336);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1335);
					attributes();
					}
				}

				setState(1339);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
					{
					setState(1338);
					access_level_modifier();
					}
				}

				setState(1341);
				raw_value_style_enum();
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

	public static class Union_style_enumContext extends ParserRuleContext {
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enumContext union_style_enum() throws RecognitionException {
		Union_style_enumContext _localctx = new Union_style_enumContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_union_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(1344);
				match(T__51);
				}
			}

			setState(1347);
			match(T__41);
			setState(1348);
			enum_name();
			setState(1350);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1349);
				generic_parameter_clause();
				}
			}

			setState(1353);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1352);
				type_inheritance_clause();
				}
			}

			setState(1355);
			match(LCURLY);
			setState(1357);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1356);
				union_style_enum_members();
				}
			}

			setState(1359);
			match(RCURLY);
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

	public static class Union_style_enum_membersContext extends ParserRuleContext {
		public Union_style_enum_memberContext union_style_enum_member() {
			return getRuleContext(Union_style_enum_memberContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_members; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_membersContext union_style_enum_members() throws RecognitionException {
		Union_style_enum_membersContext _localctx = new Union_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_union_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			union_style_enum_member();
			setState(1363);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1362);
				union_style_enum_members();
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

	public static class Union_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Union_style_enum_case_clauseContext union_style_enum_case_clause() {
			return getRuleContext(Union_style_enum_case_clauseContext.class,0);
		}
		public Union_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_member; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_memberContext union_style_enum_member() throws RecognitionException {
		Union_style_enum_memberContext _localctx = new Union_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_union_style_enum_member);
		try {
			setState(1367);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1365);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366);
				union_style_enum_case_clause();
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

	public static class Union_style_enum_case_clauseContext extends ParserRuleContext {
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Union_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_clauseContext union_style_enum_case_clause() throws RecognitionException {
		Union_style_enum_case_clauseContext _localctx = new Union_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_union_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1369);
				attributes();
				}
				break;
			}
			setState(1373);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(1372);
				match(T__51);
				}
			}

			setState(1375);
			match(T__1);
			setState(1376);
			union_style_enum_case_list();
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

	public static class Union_style_enum_case_listContext extends ParserRuleContext {
		public Union_style_enum_caseContext union_style_enum_case() {
			return getRuleContext(Union_style_enum_caseContext.class,0);
		}
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public Union_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_listContext union_style_enum_case_list() throws RecognitionException {
		Union_style_enum_case_listContext _localctx = new Union_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_union_style_enum_case_list);
		try {
			setState(1383);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1378);
				union_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1379);
				union_style_enum_case();
				setState(1380);
				match(COMMA);
				setState(1381);
				union_style_enum_case_list();
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

	public static class Union_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Union_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_caseContext union_style_enum_case() throws RecognitionException {
		Union_style_enum_caseContext _localctx = new Union_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_union_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			enum_case_name();
			setState(1387);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1386);
				tuple_type();
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

	public static class Enum_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_nameContext enum_name() throws RecognitionException {
		Enum_nameContext _localctx = new Enum_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			identifier();
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

	public static class Enum_case_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_case_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_nameContext enum_case_name() throws RecognitionException {
		Enum_case_nameContext _localctx = new Enum_case_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enum_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			identifier();
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

	public static class Raw_value_style_enumContext extends ParserRuleContext {
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Raw_value_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enumContext raw_value_style_enum() throws RecognitionException {
		Raw_value_style_enumContext _localctx = new Raw_value_style_enumContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_raw_value_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(T__41);
			setState(1394);
			enum_name();
			setState(1396);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1395);
				generic_parameter_clause();
				}
			}

			setState(1398);
			type_inheritance_clause();
			setState(1399);
			match(LCURLY);
			setState(1400);
			raw_value_style_enum_members();
			setState(1401);
			match(RCURLY);
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

	public static class Raw_value_style_enum_membersContext extends ParserRuleContext {
		public Raw_value_style_enum_memberContext raw_value_style_enum_member() {
			return getRuleContext(Raw_value_style_enum_memberContext.class,0);
		}
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public Raw_value_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_members; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_membersContext raw_value_style_enum_members() throws RecognitionException {
		Raw_value_style_enum_membersContext _localctx = new Raw_value_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_raw_value_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			raw_value_style_enum_member();
			setState(1405);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1404);
				raw_value_style_enum_members();
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

	public static class Raw_value_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() {
			return getRuleContext(Raw_value_style_enum_case_clauseContext.class,0);
		}
		public Raw_value_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_member; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_memberContext raw_value_style_enum_member() throws RecognitionException {
		Raw_value_style_enum_memberContext _localctx = new Raw_value_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_raw_value_style_enum_member);
		try {
			setState(1409);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1407);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1408);
				raw_value_style_enum_case_clause();
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

	public static class Raw_value_style_enum_case_clauseContext extends ParserRuleContext {
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() throws RecognitionException {
		Raw_value_style_enum_case_clauseContext _localctx = new Raw_value_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_raw_value_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1411);
				attributes();
				}
			}

			setState(1414);
			match(T__1);
			setState(1415);
			raw_value_style_enum_case_list();
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

	public static class Raw_value_style_enum_case_listContext extends ParserRuleContext {
		public Raw_value_style_enum_caseContext raw_value_style_enum_case() {
			return getRuleContext(Raw_value_style_enum_caseContext.class,0);
		}
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public Raw_value_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() throws RecognitionException {
		Raw_value_style_enum_case_listContext _localctx = new Raw_value_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_raw_value_style_enum_case_list);
		try {
			setState(1422);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1417);
				raw_value_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
				raw_value_style_enum_case();
				setState(1419);
				match(COMMA);
				setState(1420);
				raw_value_style_enum_case_list();
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

	public static class Raw_value_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Raw_value_assignmentContext raw_value_assignment() {
			return getRuleContext(Raw_value_assignmentContext.class,0);
		}
		public Raw_value_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_caseContext raw_value_style_enum_case() throws RecognitionException {
		Raw_value_style_enum_caseContext _localctx = new Raw_value_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_raw_value_style_enum_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			enum_case_name();
			setState(1426);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1425);
				raw_value_assignment();
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

	public static class Raw_value_assignmentContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Raw_value_literalContext raw_value_literal() {
			return getRuleContext(Raw_value_literalContext.class,0);
		}
		public Raw_value_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_assignmentContext raw_value_assignment() throws RecognitionException {
		Raw_value_assignmentContext _localctx = new Raw_value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_raw_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			assignment_operator();
			setState(1429);
			raw_value_literal();
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

	public static class Raw_value_literalContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public TerminalNode Static_string_literal() { return getToken(SwiftParser.Static_string_literal, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Raw_value_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_literalContext raw_value_literal() throws RecognitionException {
		Raw_value_literalContext _localctx = new Raw_value_literalContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_raw_value_literal);
		try {
			setState(1434);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1431);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1432);
				match(Static_string_literal);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1433);
				boolean_literal();
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_nameContext struct_name() {
			return getRuleContext(Struct_nameContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1436);
				attributes();
				}
			}

			setState(1440);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1439);
				access_level_modifier();
				}
			}

			setState(1442);
			match(T__39);
			setState(1443);
			struct_name();
			setState(1445);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1444);
				generic_parameter_clause();
				}
			}

			setState(1448);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1447);
				type_inheritance_clause();
				}
			}

			setState(1450);
			struct_body();
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

	public static class Struct_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStruct_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			identifier();
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

	public static class Struct_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			match(LCURLY);
			setState(1456);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1455);
				declarations();
				}
			}

			setState(1458);
			match(RCURLY);
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

	public static class Class_declarationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1460);
				attributes();
				}
			}

			setState(1464);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1463);
				access_level_modifier();
				}
			}

			setState(1466);
			match(T__40);
			setState(1467);
			class_name();
			setState(1469);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1468);
				generic_parameter_clause();
				}
			}

			setState(1472);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1471);
				type_inheritance_clause();
				}
			}

			setState(1474);
			class_body();
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

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			identifier();
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

	public static class Class_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(LCURLY);
			setState(1480);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1479);
				declarations();
				}
			}

			setState(1482);
			match(RCURLY);
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

	public static class Protocol_declarationContext extends ParserRuleContext {
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_bodyContext protocol_body() {
			return getRuleContext(Protocol_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1484);
				attributes();
				}
			}

			setState(1488);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1487);
				access_level_modifier();
				}
			}

			setState(1490);
			match(T__42);
			setState(1491);
			protocol_name();
			setState(1493);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1492);
				type_inheritance_clause();
				}
			}

			setState(1495);
			protocol_body();
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

	public static class Protocol_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			identifier();
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

	public static class Protocol_bodyContext extends ParserRuleContext {
		public Protocol_member_declarationsContext protocol_member_declarations() {
			return getRuleContext(Protocol_member_declarationsContext.class,0);
		}
		public Protocol_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_bodyContext protocol_body() throws RecognitionException {
		Protocol_bodyContext _localctx = new Protocol_bodyContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_protocol_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			match(LCURLY);
			setState(1501);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__40) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1500);
				protocol_member_declarations();
				}
			}

			setState(1503);
			match(RCURLY);
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

	public static class Protocol_member_declarationContext extends ParserRuleContext {
		public Protocol_property_declarationContext protocol_property_declaration() {
			return getRuleContext(Protocol_property_declarationContext.class,0);
		}
		public Protocol_method_declarationContext protocol_method_declaration() {
			return getRuleContext(Protocol_method_declarationContext.class,0);
		}
		public Protocol_initializer_declarationContext protocol_initializer_declaration() {
			return getRuleContext(Protocol_initializer_declarationContext.class,0);
		}
		public Protocol_subscript_declarationContext protocol_subscript_declaration() {
			return getRuleContext(Protocol_subscript_declarationContext.class,0);
		}
		public Protocol_associated_type_declarationContext protocol_associated_type_declaration() {
			return getRuleContext(Protocol_associated_type_declarationContext.class,0);
		}
		public Protocol_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_member_declarationContext protocol_member_declaration() throws RecognitionException {
		Protocol_member_declarationContext _localctx = new Protocol_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_protocol_member_declaration);
		try {
			setState(1510);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1505);
				protocol_property_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1506);
				protocol_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1507);
				protocol_initializer_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1508);
				protocol_subscript_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1509);
				protocol_associated_type_declaration();
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

	public static class Protocol_member_declarationsContext extends ParserRuleContext {
		public Protocol_member_declarationContext protocol_member_declaration() {
			return getRuleContext(Protocol_member_declarationContext.class,0);
		}
		public Protocol_member_declarationsContext protocol_member_declarations() {
			return getRuleContext(Protocol_member_declarationsContext.class,0);
		}
		public Protocol_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_member_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_member_declarationsContext protocol_member_declarations() throws RecognitionException {
		Protocol_member_declarationsContext _localctx = new Protocol_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_protocol_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			protocol_member_declaration();
			setState(1514);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__40) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1513);
				protocol_member_declarations();
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

	public static class Protocol_property_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_property_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_property_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_property_declarationContext protocol_property_declaration() throws RecognitionException {
		Protocol_property_declarationContext _localctx = new Protocol_property_declarationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_protocol_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			variable_declaration_head();
			setState(1517);
			variable_name();
			setState(1518);
			type_annotation();
			setState(1519);
			getter_setter_keyword_block();
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

	public static class Protocol_method_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Protocol_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_method_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_method_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_method_declarationContext protocol_method_declaration() throws RecognitionException {
		Protocol_method_declarationContext _localctx = new Protocol_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_protocol_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			function_head();
			setState(1522);
			function_name();
			setState(1524);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1523);
				generic_parameter_clause();
				}
			}

			setState(1526);
			function_signature();
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

	public static class Protocol_initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Protocol_initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_initializer_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_initializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_initializer_declarationContext protocol_initializer_declaration() throws RecognitionException {
		Protocol_initializer_declarationContext _localctx = new Protocol_initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_protocol_initializer_declaration);
		int _la;
		try {
			setState(1543);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528);
				initializer_head();
				setState(1530);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1529);
					generic_parameter_clause();
					}
				}

				setState(1532);
				parameter_clause();
				setState(1534);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1533);
					match(T__48);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				initializer_head();
				setState(1538);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1537);
					generic_parameter_clause();
					}
				}

				setState(1540);
				parameter_clause();
				setState(1541);
				match(T__49);
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

	public static class Protocol_subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_subscript_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_subscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_subscript_declarationContext protocol_subscript_declaration() throws RecognitionException {
		Protocol_subscript_declarationContext _localctx = new Protocol_subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_protocol_subscript_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			subscript_head();
			setState(1546);
			subscript_result();
			setState(1547);
			getter_setter_keyword_block();
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

	public static class Protocol_associated_type_declarationContext extends ParserRuleContext {
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Protocol_associated_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_associated_type_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_associated_type_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_associated_type_declarationContext protocol_associated_type_declaration() throws RecognitionException {
		Protocol_associated_type_declarationContext _localctx = new Protocol_associated_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_protocol_associated_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1549);
				attributes();
				}
			}

			setState(1553);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1552);
				access_level_modifier();
				}
			}

			setState(1555);
			match(T__52);
			setState(1556);
			typealias_name();
			setState(1558);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1557);
				type_inheritance_clause();
				}
				break;
			}
			setState(1561);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1560);
				typealias_assignment();
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

	public static class Initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Initializer_bodyContext initializer_body() {
			return getRuleContext(Initializer_bodyContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_declarationContext initializer_declaration() throws RecognitionException {
		Initializer_declarationContext _localctx = new Initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_initializer_declaration);
		int _la;
		try {
			setState(1581);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1563);
				initializer_head();
				setState(1565);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1564);
					generic_parameter_clause();
					}
				}

				setState(1567);
				parameter_clause();
				setState(1569);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1568);
					match(T__48);
					}
				}

				setState(1571);
				initializer_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
				initializer_head();
				setState(1575);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1574);
					generic_parameter_clause();
					}
				}

				setState(1577);
				parameter_clause();
				setState(1578);
				match(T__49);
				setState(1579);
				initializer_body();
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

	public static class Initializer_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Initializer_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_headContext initializer_head() throws RecognitionException {
		Initializer_headContext _localctx = new Initializer_headContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_initializer_head);
		int _la;
		try {
			setState(1606);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1584);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1583);
					attributes();
					}
					break;
				}
				setState(1587);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
					{
					setState(1586);
					declaration_modifiers();
					}
				}

				setState(1589);
				match(T__53);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1591);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1590);
					attributes();
					}
					break;
				}
				setState(1594);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
					{
					setState(1593);
					declaration_modifiers();
					}
				}

				setState(1596);
				match(T__53);
				setState(1597);
				match(QUESTION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1599);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1598);
					attributes();
					}
					break;
				}
				setState(1602);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
					{
					setState(1601);
					declaration_modifiers();
					}
				}

				setState(1604);
				match(T__53);
				setState(1605);
				match(BANG);
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

	public static class Initializer_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Initializer_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_bodyContext initializer_body() throws RecognitionException {
		Initializer_bodyContext _localctx = new Initializer_bodyContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_initializer_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			code_block();
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

	public static class Deinitializer_declarationContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Deinitializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeinitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deinitializer_declarationContext deinitializer_declaration() throws RecognitionException {
		Deinitializer_declarationContext _localctx = new Deinitializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_deinitializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1610);
				attributes();
				}
			}

			setState(1613);
			match(T__54);
			setState(1614);
			code_block();
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

	public static class Extension_declarationContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Extension_bodyContext extension_body() {
			return getRuleContext(Extension_bodyContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Extension_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExtension_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_declarationContext extension_declaration() throws RecognitionException {
		Extension_declarationContext _localctx = new Extension_declarationContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_extension_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) {
				{
				setState(1616);
				access_level_modifier();
				}
			}

			setState(1619);
			match(T__55);
			setState(1620);
			type_identifier();
			setState(1622);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1621);
				type_inheritance_clause();
				}
			}

			setState(1624);
			extension_body();
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

	public static class Extension_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Extension_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExtension_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_bodyContext extension_body() throws RecognitionException {
		Extension_bodyContext _localctx = new Extension_bodyContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_extension_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(LCURLY);
			setState(1628);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1627);
				declarations();
				}
			}

			setState(1630);
			match(RCURLY);
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

	public static class Subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_declarationContext subscript_declaration() throws RecognitionException {
		Subscript_declarationContext _localctx = new Subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_subscript_declaration);
		try {
			setState(1644);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1632);
				subscript_head();
				setState(1633);
				subscript_result();
				setState(1634);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				subscript_head();
				setState(1637);
				subscript_result();
				setState(1638);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1640);
				subscript_head();
				setState(1641);
				subscript_result();
				setState(1642);
				getter_setter_keyword_block();
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

	public static class Subscript_headContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Subscript_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_headContext subscript_head() throws RecognitionException {
		Subscript_headContext _localctx = new Subscript_headContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_subscript_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1646);
				attributes();
				}
				break;
			}
			setState(1650);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1649);
				declaration_modifiers();
				}
			}

			setState(1652);
			match(T__56);
			setState(1653);
			parameter_clause();
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

	public static class Subscript_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Subscript_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_result; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_resultContext subscript_result() throws RecognitionException {
		Subscript_resultContext _localctx = new Subscript_resultContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_subscript_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			arrow_operator();
			setState(1657);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1656);
				attributes();
				}
				break;
			}
			setState(1659);
			type(0);
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

	public static class Operator_declarationContext extends ParserRuleContext {
		public Prefix_operator_declarationContext prefix_operator_declaration() {
			return getRuleContext(Prefix_operator_declarationContext.class,0);
		}
		public Postfix_operator_declarationContext postfix_operator_declaration() {
			return getRuleContext(Postfix_operator_declarationContext.class,0);
		}
		public Infix_operator_declarationContext infix_operator_declaration() {
			return getRuleContext(Infix_operator_declarationContext.class,0);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_operator_declaration);
		try {
			setState(1664);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(1661);
				prefix_operator_declaration();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				postfix_operator_declaration();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 3);
				{
				setState(1663);
				infix_operator_declaration();
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

	public static class Prefix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Prefix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrefix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operator_declarationContext prefix_operator_declaration() throws RecognitionException {
		Prefix_operator_declarationContext _localctx = new Prefix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(T__57);
			setState(1667);
			match(T__58);
			setState(1668);
			operator();
			setState(1669);
			match(LCURLY);
			setState(1670);
			match(RCURLY);
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

	public static class Postfix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operator_declarationContext postfix_operator_declaration() throws RecognitionException {
		Postfix_operator_declarationContext _localctx = new Postfix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			match(T__59);
			setState(1673);
			match(T__58);
			setState(1674);
			operator();
			setState(1675);
			match(LCURLY);
			setState(1676);
			match(RCURLY);
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

	public static class Infix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Infix_operator_attributesContext infix_operator_attributes() {
			return getRuleContext(Infix_operator_attributesContext.class,0);
		}
		public Infix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_declarationContext infix_operator_declaration() throws RecognitionException {
		Infix_operator_declarationContext _localctx = new Infix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(T__60);
			setState(1679);
			match(T__58);
			setState(1680);
			operator();
			setState(1681);
			match(LCURLY);
			setState(1682);
			infix_operator_attributes();
			setState(1683);
			match(RCURLY);
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

	public static class Infix_operator_attributesContext extends ParserRuleContext {
		public Precedence_clauseContext precedence_clause() {
			return getRuleContext(Precedence_clauseContext.class,0);
		}
		public Associativity_clauseContext associativity_clause() {
			return getRuleContext(Associativity_clauseContext.class,0);
		}
		public Infix_operator_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_attributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInfix_operator_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_attributesContext infix_operator_attributes() throws RecognitionException {
		Infix_operator_attributesContext _localctx = new Infix_operator_attributesContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_infix_operator_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(1685);
				precedence_clause();
				}
			}

			setState(1689);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(1688);
				associativity_clause();
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

	public static class Precedence_clauseContext extends ParserRuleContext {
		public Precedence_levelContext precedence_level() {
			return getRuleContext(Precedence_levelContext.class,0);
		}
		public Precedence_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrecedence_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_clauseContext precedence_clause() throws RecognitionException {
		Precedence_clauseContext _localctx = new Precedence_clauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_precedence_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(T__61);
			setState(1692);
			precedence_level();
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

	public static class Precedence_levelContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Precedence_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_level; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrecedence_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_levelContext precedence_level() throws RecognitionException {
		Precedence_levelContext _localctx = new Precedence_levelContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_precedence_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			integer_literal();
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

	public static class Associativity_clauseContext extends ParserRuleContext {
		public AssociativityContext associativity() {
			return getRuleContext(AssociativityContext.class,0);
		}
		public Associativity_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAssociativity_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Associativity_clauseContext associativity_clause() throws RecognitionException {
		Associativity_clauseContext _localctx = new Associativity_clauseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_associativity_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			match(T__62);
			setState(1697);
			associativity();
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

	public static class AssociativityContext extends ParserRuleContext {
		public AssociativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAssociativity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativityContext associativity() throws RecognitionException {
		AssociativityContext _localctx = new AssociativityContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Declaration_modifierContext extends ParserRuleContext {
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Declaration_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclaration_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_modifierContext declaration_modifier() throws RecognitionException {
		Declaration_modifierContext _localctx = new Declaration_modifierContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_declaration_modifier);
		try {
			setState(1726);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701);
				match(T__40);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1702);
				match(T__66);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1703);
				match(T__67);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1704);
				match(T__68);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1705);
				match(T__60);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1706);
				match(T__69);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1707);
				match(T__70);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1708);
				match(T__71);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1709);
				match(T__72);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1710);
				match(T__73);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1711);
				match(T__59);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1712);
				match(T__57);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1713);
				match(T__74);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1714);
				match(T__75);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1715);
				match(T__76);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1716);
				match(T__76);
				setState(1717);
				match(LPAREN);
				setState(1718);
				match(T__77);
				setState(1719);
				match(RPAREN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1720);
				match(T__76);
				setState(1721);
				match(LPAREN);
				setState(1722);
				match(T__78);
				setState(1723);
				match(RPAREN);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1724);
				match(T__79);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1725);
				access_level_modifier();
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

	public static class Declaration_modifiersContext extends ParserRuleContext {
		public Declaration_modifierContext declaration_modifier() {
			return getRuleContext(Declaration_modifierContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Declaration_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclaration_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_modifiersContext declaration_modifiers() throws RecognitionException {
		Declaration_modifiersContext _localctx = new Declaration_modifiersContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			declaration_modifier();
			setState(1730);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__57 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__76 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)) | (1L << (T__82 - 41)))) != 0)) {
				{
				setState(1729);
				declaration_modifiers();
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

	public static class Access_level_modifierContext extends ParserRuleContext {
		public Access_level_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_level_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAccess_level_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_level_modifierContext access_level_modifier() throws RecognitionException {
		Access_level_modifierContext _localctx = new Access_level_modifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_access_level_modifier);
		try {
			setState(1747);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
				match(T__80);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				match(T__80);
				setState(1734);
				match(LPAREN);
				setState(1735);
				match(T__45);
				setState(1736);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1737);
				match(T__81);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1738);
				match(T__81);
				setState(1739);
				match(LPAREN);
				setState(1740);
				match(T__45);
				setState(1741);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1742);
				match(T__82);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1743);
				match(T__82);
				setState(1744);
				match(LPAREN);
				setState(1745);
				match(T__45);
				setState(1746);
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

	public static class PatternContext extends ParserRuleContext {
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public Value_binding_patternContext value_binding_pattern() {
			return getRuleContext(Value_binding_patternContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext enum_case_pattern() {
			return getRuleContext(Enum_case_patternContext.class,0);
		}
		public Optional_patternContext optional_pattern() {
			return getRuleContext(Optional_patternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Expression_patternContext expression_pattern() {
			return getRuleContext(Expression_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 328;
		enterRecursionRule(_localctx, 328, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1750);
				wildcard_pattern();
				setState(1752);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1751);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1754);
				identifier_pattern();
				setState(1756);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1755);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1758);
				value_binding_pattern();
				}
				break;
			case 4:
				{
				setState(1759);
				tuple_pattern();
				setState(1761);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1760);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1763);
				enum_case_pattern();
				}
				break;
			case 6:
				{
				setState(1764);
				optional_pattern();
				}
				break;
			case 7:
				{
				setState(1765);
				match(T__83);
				setState(1766);
				type(0);
				}
				break;
			case 8:
				{
				setState(1767);
				expression_pattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1770);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1771);
					match(T__84);
					setState(1772);
					type(0);
					}
					} 
				}
				setState(1777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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

	public static class Wildcard_patternContext extends ParserRuleContext {
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWildcard_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			match(UNDERSCORE);
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

	public static class Identifier_patternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIdentifier_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			identifier();
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

	public static class Value_binding_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Value_binding_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_binding_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitValue_binding_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_binding_patternContext value_binding_pattern() throws RecognitionException {
		Value_binding_patternContext _localctx = new Value_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_value_binding_pattern);
		try {
			setState(1786);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				match(T__5);
				setState(1783);
				pattern(0);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1784);
				match(T__4);
				setState(1785);
				pattern(0);
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

	public static class Tuple_patternContext extends ParserRuleContext {
		public Tuple_pattern_element_listContext tuple_pattern_element_list() {
			return getRuleContext(Tuple_pattern_element_listContext.class,0);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_tuple_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			match(LPAREN);
			setState(1790);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1789);
				tuple_pattern_element_list();
				}
				break;
			}
			setState(1792);
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

	public static class Tuple_pattern_element_listContext extends ParserRuleContext {
		public List<Tuple_pattern_elementContext> tuple_pattern_element() {
			return getRuleContexts(Tuple_pattern_elementContext.class);
		}
		public Tuple_pattern_elementContext tuple_pattern_element(int i) {
			return getRuleContext(Tuple_pattern_elementContext.class,i);
		}
		public Tuple_pattern_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_pattern_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_element_listContext tuple_pattern_element_list() throws RecognitionException {
		Tuple_pattern_element_listContext _localctx = new Tuple_pattern_element_listContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_tuple_pattern_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			tuple_pattern_element();
			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1795);
				match(COMMA);
				setState(1796);
				tuple_pattern_element();
				}
				}
				setState(1801);
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

	public static class Tuple_pattern_elementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Tuple_pattern_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_pattern_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_elementContext tuple_pattern_element() throws RecognitionException {
		Tuple_pattern_elementContext _localctx = new Tuple_pattern_elementContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_tuple_pattern_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			pattern(0);
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

	public static class Enum_case_patternContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_case_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_patternContext enum_case_pattern() throws RecognitionException {
		Enum_case_patternContext _localctx = new Enum_case_patternContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_enum_case_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(1804);
				type_identifier();
				}
			}

			setState(1807);
			match(DOT);
			setState(1808);
			enum_case_name();
			setState(1810);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1809);
				tuple_pattern();
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

	public static class Optional_patternContext extends ParserRuleContext {
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public Optional_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_patternContext optional_pattern() throws RecognitionException {
		Optional_patternContext _localctx = new Optional_patternContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_optional_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			identifier_pattern();
			setState(1813);
			match(QUESTION);
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

	public static class Expression_patternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_patternContext expression_pattern() throws RecognitionException {
		Expression_patternContext _localctx = new Expression_patternContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
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

	public static class AttributeContext extends ParserRuleContext {
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_argument_clauseContext attribute_argument_clause() {
			return getRuleContext(Attribute_argument_clauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1817);
				match(AT);
				}
			}

			setState(1820);
			attribute_name();
			setState(1822);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1821);
				attribute_argument_clause();
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

	public static class Attribute_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			identifier();
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

	public static class Attribute_argument_clauseContext extends ParserRuleContext {
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public Attribute_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttribute_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_argument_clauseContext attribute_argument_clause() throws RecognitionException {
		Attribute_argument_clauseContext _localctx = new Attribute_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_attribute_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			match(LPAREN);
			setState(1828);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1827);
				balanced_tokens();
				}
				break;
			}
			setState(1830);
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1833); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1832);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1835); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Balanced_tokensContext extends ParserRuleContext {
		public List<Balanced_tokenContext> balanced_token() {
			return getRuleContexts(Balanced_tokenContext.class);
		}
		public Balanced_tokenContext balanced_token(int i) {
			return getRuleContext(Balanced_tokenContext.class,i);
		}
		public Balanced_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_tokens; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBalanced_tokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokensContext balanced_tokens() throws RecognitionException {
		Balanced_tokensContext _localctx = new Balanced_tokensContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_balanced_tokens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1838); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1837);
					balanced_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1840); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Balanced_tokenContext extends ParserRuleContext {
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBalanced_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokenContext balanced_token() throws RecognitionException {
		Balanced_tokenContext _localctx = new Balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_balanced_token);
		try {
			setState(1862);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1842);
				match(LPAREN);
				setState(1844);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1843);
					balanced_tokens();
					}
					break;
				}
				setState(1846);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1847);
				match(LBRACK);
				setState(1849);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1848);
					balanced_tokens();
					}
					break;
				}
				setState(1851);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1852);
				match(LCURLY);
				setState(1854);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1853);
					balanced_tokens();
					}
					break;
				}
				setState(1856);
				match(RCURLY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1857);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1858);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1859);
				context_sensitive_keyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1860);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1861);
				operator();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Binary_expressionsContext binary_expressions() {
			return getRuleContext(Binary_expressionsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1864);
				try_operator();
				}
				break;
			}
			setState(1867);
			prefix_expression();
			setState(1869);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1868);
				binary_expressions();
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			expression();
			setState(1876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1872);
				match(COMMA);
				setState(1873);
				expression();
				}
				}
				setState(1878);
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

	public static class Prefix_expressionContext extends ParserRuleContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public In_out_expressionContext in_out_expression() {
			return getRuleContext(In_out_expressionContext.class,0);
		}
		public Prefix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrefix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_prefix_expression);
		try {
			setState(1884);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1879);
				prefix_operator();
				setState(1880);
				postfix_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1883);
				in_out_expression();
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

	public static class In_out_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public In_out_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIn_out_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_out_expressionContext in_out_expression() throws RecognitionException {
		In_out_expressionContext _localctx = new In_out_expressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			match(AND);
			setState(1887);
			identifier();
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

	public static class Try_operatorContext extends ParserRuleContext {
		public Try_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTry_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_operatorContext try_operator() throws RecognitionException {
		Try_operatorContext _localctx = new Try_operatorContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_try_operator);
		try {
			setState(1894);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1889);
				match(T__85);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1890);
				match(T__85);
				setState(1891);
				match(QUESTION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1892);
				match(T__85);
				setState(1893);
				match(BANG);
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

	public static class Binary_expressionContext extends ParserRuleContext {
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Type_casting_operatorContext type_casting_operator() {
			return getRuleContext(Type_casting_operatorContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_binary_expression);
		try {
			setState(1906);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1896);
				binary_operator();
				setState(1897);
				prefix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1899);
				conditional_operator();
				setState(1901);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1900);
					try_operator();
					}
					break;
				}
				setState(1903);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1905);
				type_casting_operator();
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

	public static class Binary_expressionsContext extends ParserRuleContext {
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public Binary_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBinary_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionsContext binary_expressions() throws RecognitionException {
		Binary_expressionsContext _localctx = new Binary_expressionsContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1909); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1908);
					binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1911); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Conditional_operatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			match(QUESTION);
			setState(1915);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1914);
				try_operator();
				}
				break;
			}
			setState(1917);
			expression();
			setState(1918);
			match(COLON);
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

	public static class Type_casting_operatorContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_casting_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_casting_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_casting_operatorContext type_casting_operator() throws RecognitionException {
		Type_casting_operatorContext _localctx = new Type_casting_operatorContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_type_casting_operator);
		try {
			setState(1930);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920);
				match(T__83);
				setState(1921);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1922);
				match(T__84);
				setState(1923);
				type(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1924);
				match(T__84);
				setState(1925);
				match(QUESTION);
				setState(1926);
				type(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1927);
				match(T__84);
				setState(1928);
				match(BANG);
				setState(1929);
				type(0);
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Self_expressionContext self_expression() {
			return getRuleContext(Self_expressionContext.class,0);
		}
		public Superclass_expressionContext superclass_expression() {
			return getRuleContext(Superclass_expressionContext.class,0);
		}
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Implicit_member_expressionContext implicit_member_expression() {
			return getRuleContext(Implicit_member_expressionContext.class,0);
		}
		public Wildcard_expressionContext wildcard_expression() {
			return getRuleContext(Wildcard_expressionContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_primary_expression);
		try {
			setState(1944);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1932);
				identifier();
				setState(1934);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1933);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1936);
				literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1937);
				self_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1938);
				superclass_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1939);
				closure_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1940);
				parenthesized_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1941);
				implicit_member_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1942);
				wildcard_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1943);
				selector_expression();
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

	public static class Implicit_member_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Implicit_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_member_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImplicit_member_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implicit_member_expressionContext implicit_member_expression() throws RecognitionException {
		Implicit_member_expressionContext _localctx = new Implicit_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			match(DOT);
			setState(1947);
			identifier();
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

	public static class Literal_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Dictionary_literalContext dictionary_literal() {
			return getRuleContext(Dictionary_literalContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLiteral_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_literal_expression);
		try {
			setState(1956);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1949);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1950);
				array_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1951);
				dictionary_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1952);
				match(T__86);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1953);
				match(T__87);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1954);
				match(T__88);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1955);
				match(T__89);
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

	public static class Array_literalContext extends ParserRuleContext {
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			match(LBRACK);
			setState(1960);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1959);
				array_literal_items();
				}
				break;
			}
			setState(1962);
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

	public static class Array_literal_itemsContext extends ParserRuleContext {
		public List<Array_literal_itemContext> array_literal_item() {
			return getRuleContexts(Array_literal_itemContext.class);
		}
		public Array_literal_itemContext array_literal_item(int i) {
			return getRuleContext(Array_literal_itemContext.class,i);
		}
		public Array_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_items; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemsContext array_literal_items() throws RecognitionException {
		Array_literal_itemsContext _localctx = new Array_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_array_literal_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			array_literal_item();
			setState(1969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1965);
					match(COMMA);
					setState(1966);
					array_literal_item();
					}
					} 
				}
				setState(1971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			setState(1973);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1972);
				match(COMMA);
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

	public static class Array_literal_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemContext array_literal_item() throws RecognitionException {
		Array_literal_itemContext _localctx = new Array_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
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

	public static class Dictionary_literalContext extends ParserRuleContext {
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public Empty_dictionary_literalContext empty_dictionary_literal() {
			return getRuleContext(Empty_dictionary_literalContext.class,0);
		}
		public Dictionary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literalContext dictionary_literal() throws RecognitionException {
		Dictionary_literalContext _localctx = new Dictionary_literalContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_dictionary_literal);
		try {
			setState(1982);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1977);
				match(LBRACK);
				setState(1978);
				dictionary_literal_items();
				setState(1979);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1981);
				empty_dictionary_literal();
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

	public static class Dictionary_literal_itemsContext extends ParserRuleContext {
		public List<Dictionary_literal_itemContext> dictionary_literal_item() {
			return getRuleContexts(Dictionary_literal_itemContext.class);
		}
		public Dictionary_literal_itemContext dictionary_literal_item(int i) {
			return getRuleContext(Dictionary_literal_itemContext.class,i);
		}
		public Dictionary_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_items; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemsContext dictionary_literal_items() throws RecognitionException {
		Dictionary_literal_itemsContext _localctx = new Dictionary_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_dictionary_literal_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			dictionary_literal_item();
			setState(1989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1985);
					match(COMMA);
					setState(1986);
					dictionary_literal_item();
					}
					} 
				}
				setState(1991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			}
			setState(1993);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1992);
				match(COMMA);
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

	public static class Dictionary_literal_itemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Dictionary_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemContext dictionary_literal_item() throws RecognitionException {
		Dictionary_literal_itemContext _localctx = new Dictionary_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_dictionary_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			expression();
			setState(1996);
			match(COLON);
			setState(1997);
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

	public static class Empty_dictionary_literalContext extends ParserRuleContext {
		public Empty_dictionary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_dictionary_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEmpty_dictionary_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_dictionary_literalContext empty_dictionary_literal() throws RecognitionException {
		Empty_dictionary_literalContext _localctx = new Empty_dictionary_literalContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_empty_dictionary_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999);
			match(LBRACK);
			setState(2000);
			match(COLON);
			setState(2001);
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

	public static class Self_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSelf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_expressionContext self_expression() throws RecognitionException {
		Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_self_expression);
		try {
			setState(2015);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2003);
				match(T__90);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2004);
				match(T__90);
				setState(2005);
				match(DOT);
				setState(2006);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2007);
				match(T__90);
				setState(2008);
				match(LBRACK);
				setState(2009);
				expression_list();
				setState(2010);
				match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2012);
				match(T__90);
				setState(2013);
				match(DOT);
				setState(2014);
				match(T__53);
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

	public static class Superclass_expressionContext extends ParserRuleContext {
		public Superclass_method_expressionContext superclass_method_expression() {
			return getRuleContext(Superclass_method_expressionContext.class,0);
		}
		public Superclass_subscript_expressionContext superclass_subscript_expression() {
			return getRuleContext(Superclass_subscript_expressionContext.class,0);
		}
		public Superclass_initializer_expressionContext superclass_initializer_expression() {
			return getRuleContext(Superclass_initializer_expressionContext.class,0);
		}
		public Superclass_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_expressionContext superclass_expression() throws RecognitionException {
		Superclass_expressionContext _localctx = new Superclass_expressionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_superclass_expression);
		try {
			setState(2020);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2017);
				superclass_method_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2018);
				superclass_subscript_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2019);
				superclass_initializer_expression();
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

	public static class Superclass_method_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Superclass_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_method_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_method_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_method_expressionContext superclass_method_expression() throws RecognitionException {
		Superclass_method_expressionContext _localctx = new Superclass_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_superclass_method_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			match(T__91);
			setState(2023);
			match(DOT);
			setState(2024);
			identifier();
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

	public static class Superclass_subscript_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Superclass_subscript_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_subscript_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_subscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_subscript_expressionContext superclass_subscript_expression() throws RecognitionException {
		Superclass_subscript_expressionContext _localctx = new Superclass_subscript_expressionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_superclass_subscript_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			match(T__91);
			setState(2027);
			match(LBRACK);
			setState(2028);
			expression();
			setState(2029);
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

	public static class Superclass_initializer_expressionContext extends ParserRuleContext {
		public Superclass_initializer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_initializer_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_initializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_initializer_expressionContext superclass_initializer_expression() throws RecognitionException {
		Superclass_initializer_expressionContext _localctx = new Superclass_initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_superclass_initializer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			match(T__91);
			setState(2032);
			match(DOT);
			setState(2033);
			match(T__53);
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

	public static class Closure_expressionContext extends ParserRuleContext {
		public Closure_signatureContext closure_signature() {
			return getRuleContext(Closure_signatureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClosure_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2035);
			match(LCURLY);
			setState(2037);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2036);
				closure_signature();
				}
				break;
			}
			setState(2040);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2039);
				statements();
				}
				break;
			}
			setState(2042);
			match(RCURLY);
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

	public static class Closure_signatureContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public Closure_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClosure_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_signatureContext closure_signature() throws RecognitionException {
		Closure_signatureContext _localctx = new Closure_signatureContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_closure_signature);
		try {
			setState(2073);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2044);
				parameter_clause();
				setState(2046);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(2045);
					function_result();
					}
					break;
				}
				setState(2048);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2050);
				identifier_list();
				setState(2052);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(2051);
					function_result();
					}
					break;
				}
				setState(2054);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2056);
				capture_list();
				setState(2057);
				parameter_clause();
				setState(2059);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2058);
					function_result();
					}
					break;
				}
				setState(2061);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2063);
				capture_list();
				setState(2064);
				identifier_list();
				setState(2066);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2065);
					function_result();
					}
					break;
				}
				setState(2068);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2070);
				capture_list();
				setState(2071);
				match(T__2);
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

	public static class Capture_listContext extends ParserRuleContext {
		public Capture_list_itemsContext capture_list_items() {
			return getRuleContext(Capture_list_itemsContext.class,0);
		}
		public Capture_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCapture_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_listContext capture_list() throws RecognitionException {
		Capture_listContext _localctx = new Capture_listContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2075);
			match(LBRACK);
			setState(2076);
			capture_list_items();
			setState(2077);
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

	public static class Capture_list_itemsContext extends ParserRuleContext {
		public List<Capture_list_itemContext> capture_list_item() {
			return getRuleContexts(Capture_list_itemContext.class);
		}
		public Capture_list_itemContext capture_list_item(int i) {
			return getRuleContext(Capture_list_itemContext.class,i);
		}
		public Capture_list_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_items; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCapture_list_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_list_itemsContext capture_list_items() throws RecognitionException {
		Capture_list_itemsContext _localctx = new Capture_list_itemsContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_capture_list_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			capture_list_item();
			setState(2084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2080);
				match(COMMA);
				setState(2081);
				capture_list_item();
				}
				}
				setState(2086);
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

	public static class Capture_list_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Capture_specifierContext capture_specifier() {
			return getRuleContext(Capture_specifierContext.class,0);
		}
		public Capture_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCapture_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_list_itemContext capture_list_item() throws RecognitionException {
		Capture_list_itemContext _localctx = new Capture_list_itemContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_capture_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2087);
				capture_specifier();
				}
				break;
			}
			setState(2090);
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

	public static class Capture_specifierContext extends ParserRuleContext {
		public Capture_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCapture_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_specifierContext capture_specifier() throws RecognitionException {
		Capture_specifierContext _localctx = new Capture_specifierContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_capture_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__79 - 77)) | (1L << (T__92 - 77)) | (1L << (T__93 - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public Expression_element_listContext expression_element_list() {
			return getRuleContext(Expression_element_listContext.class,0);
		}
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParenthesized_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2094);
			match(LPAREN);
			setState(2096);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2095);
				expression_element_list();
				}
				break;
			}
			setState(2098);
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

	public static class Expression_element_listContext extends ParserRuleContext {
		public List<Expression_elementContext> expression_element() {
			return getRuleContexts(Expression_elementContext.class);
		}
		public Expression_elementContext expression_element(int i) {
			return getRuleContext(Expression_elementContext.class,i);
		}
		public Expression_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_element_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_element_listContext expression_element_list() throws RecognitionException {
		Expression_element_listContext _localctx = new Expression_element_listContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_expression_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2100);
			expression_element();
			setState(2105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2101);
				match(COMMA);
				setState(2102);
				expression_element();
				}
				}
				setState(2107);
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

	public static class Expression_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_elementContext expression_element() throws RecognitionException {
		Expression_elementContext _localctx = new Expression_elementContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_expression_element);
		try {
			setState(2113);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2108);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2109);
				identifier();
				setState(2110);
				match(COLON);
				setState(2111);
				expression();
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

	public static class Wildcard_expressionContext extends ParserRuleContext {
		public Wildcard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWildcard_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_expressionContext wildcard_expression() throws RecognitionException {
		Wildcard_expressionContext _localctx = new Wildcard_expressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_wildcard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2115);
			match(UNDERSCORE);
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

	public static class Selector_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSelector_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_selector_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
			match(T__94);
			setState(2118);
			match(LPAREN);
			setState(2119);
			expression();
			setState(2120);
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Function_call_with_closure_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Trailing_closureContext trailing_closure() {
			return getRuleContext(Trailing_closureContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Function_call_with_closure_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_call_with_closure_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Initializer_expression_with_argsContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public Initializer_expression_with_argsContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_expression_with_args(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_call_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Function_call_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Subscript_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Subscript_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression1Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode Pure_decimal_digits() { return getToken(SwiftParser.Pure_decimal_digits, 0); }
		public Explicit_member_expression1Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_member_expression1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression2Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Explicit_member_expression2Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_member_expression2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Initializer_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Initializer_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression3Context extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public Explicit_member_expression3Context(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_member_expression3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dynamic_type_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Dynamic_type_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDynamic_type_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Postfix_operationContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Postfix_operatorContext postfix_operator() {
			return getRuleContext(Postfix_operatorContext.class,0);
		}
		public Postfix_operationContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Postfix_self_expressionContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Postfix_self_expressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_self_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 430;
		enterRecursionRule(_localctx, 430, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2123);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2171);
					switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_operationContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2125);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2126);
						postfix_operator();
						}
						break;
					case 2:
						{
						_localctx = new Function_call_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2127);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2128);
						parenthesized_expression();
						}
						break;
					case 3:
						{
						_localctx = new Function_call_with_closure_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2129);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2131);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(2130);
							parenthesized_expression();
							}
						}

						setState(2133);
						trailing_closure();
						}
						break;
					case 4:
						{
						_localctx = new Initializer_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2134);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2135);
						match(DOT);
						setState(2136);
						match(T__53);
						}
						break;
					case 5:
						{
						_localctx = new Initializer_expression_with_argsContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2137);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2138);
						match(DOT);
						setState(2139);
						match(T__53);
						setState(2140);
						match(LPAREN);
						setState(2141);
						argument_names();
						setState(2142);
						match(RPAREN);
						}
						break;
					case 6:
						{
						_localctx = new Explicit_member_expression1Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2144);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2145);
						match(DOT);
						setState(2146);
						match(Pure_decimal_digits);
						}
						break;
					case 7:
						{
						_localctx = new Explicit_member_expression2Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2147);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2148);
						match(DOT);
						setState(2149);
						identifier();
						setState(2151);
						switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
						case 1:
							{
							setState(2150);
							generic_argument_clause();
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new Explicit_member_expression3Context(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2153);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2154);
						match(DOT);
						setState(2155);
						identifier();
						setState(2156);
						match(LPAREN);
						setState(2157);
						argument_names();
						setState(2158);
						match(RPAREN);
						}
						break;
					case 9:
						{
						_localctx = new Postfix_self_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2161);
						match(DOT);
						setState(2162);
						match(T__90);
						}
						break;
					case 10:
						{
						_localctx = new Dynamic_type_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2163);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2164);
						match(DOT);
						setState(2165);
						match(T__95);
						}
						break;
					case 11:
						{
						_localctx = new Subscript_expressionContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(2166);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2167);
						match(LBRACK);
						setState(2168);
						expression_list();
						setState(2169);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(2175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
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

	public static class Argument_namesContext extends ParserRuleContext {
		public Argument_nameContext argument_name() {
			return getRuleContext(Argument_nameContext.class,0);
		}
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public Argument_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArgument_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_namesContext argument_names() throws RecognitionException {
		Argument_namesContext _localctx = new Argument_namesContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2176);
			argument_name();
			setState(2178);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(2177);
				argument_names();
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

	public static class Argument_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArgument_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_nameContext argument_name() throws RecognitionException {
		Argument_nameContext _localctx = new Argument_nameContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			identifier();
			setState(2181);
			match(COLON);
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

	public static class Trailing_closureContext extends ParserRuleContext {
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Trailing_closureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_closure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTrailing_closure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trailing_closureContext trailing_closure() throws RecognitionException {
		Trailing_closureContext _localctx = new Trailing_closureContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			closure_expression();
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
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public Dictionary_definitionContext dictionary_definition() {
			return getRuleContext(Dictionary_definitionContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2191);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2186);
				array_definition();
				}
				break;
			case 2:
				{
				setState(2187);
				dictionary_definition();
				}
				break;
			case 3:
				{
				setState(2188);
				type_identifier();
				}
				break;
			case 4:
				{
				setState(2189);
				tuple_type();
				}
				break;
			case 5:
				{
				setState(2190);
				protocol_composition_type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2215);
					switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2193);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2195);
						switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
						case 1:
							{
							setState(2194);
							match(T__48);
							}
							break;
						}
						setState(2197);
						arrow_operator();
						setState(2198);
						type(10);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2200);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2201);
						match(T__49);
						setState(2202);
						arrow_operator();
						setState(2203);
						type(9);
						}
						break;
					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2205);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2206);
						match(QUESTION);
						}
						break;
					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2207);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2208);
						match(BANG);
						}
						break;
					case 5:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2209);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2210);
						match(DOT);
						setState(2211);
						match(T__96);
						}
						break;
					case 6:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2212);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2213);
						match(DOT);
						setState(2214);
						match(T__97);
						}
						break;
					}
					} 
				}
				setState(2219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
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

	public static class Array_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2220);
			match(LBRACK);
			setState(2221);
			type(0);
			setState(2222);
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

	public static class Dictionary_definitionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Dictionary_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_definitionContext dictionary_definition() throws RecognitionException {
		Dictionary_definitionContext _localctx = new Dictionary_definitionContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_dictionary_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			match(LBRACK);
			setState(2225);
			type(0);
			setState(2226);
			match(COLON);
			setState(2227);
			type(0);
			setState(2228);
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

	public static class Type_annotationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_type_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2230);
			match(COLON);
			setState(2232);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2231);
				attributes();
				}
				break;
			}
			setState(2234);
			type(0);
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

	public static class Type_identifierContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_type_identifier);
		int _la;
		try {
			setState(2247);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2236);
				type_name();
				setState(2238);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2237);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2240);
				type_name();
				setState(2242);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2241);
					generic_argument_clause();
					}
				}

				setState(2244);
				match(DOT);
				setState(2245);
				type_identifier();
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

	public static class Type_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
			identifier();
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

	public static class Tuple_typeContext extends ParserRuleContext {
		public Tuple_type_bodyContext tuple_type_body() {
			return getRuleContext(Tuple_type_bodyContext.class,0);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2251);
			match(LPAREN);
			setState(2253);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(2252);
				tuple_type_body();
				}
			}

			setState(2255);
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

	public static class Tuple_type_bodyContext extends ParserRuleContext {
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Tuple_type_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_bodyContext tuple_type_body() throws RecognitionException {
		Tuple_type_bodyContext _localctx = new Tuple_type_bodyContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_tuple_type_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			tuple_type_element_list();
			setState(2259);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(2258);
				range_operator();
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

	public static class Tuple_type_element_listContext extends ParserRuleContext {
		public Tuple_type_elementContext tuple_type_element() {
			return getRuleContext(Tuple_type_elementContext.class,0);
		}
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_type_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_element_listContext tuple_type_element_list() throws RecognitionException {
		Tuple_type_element_listContext _localctx = new Tuple_type_element_listContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_tuple_type_element_list);
		try {
			setState(2266);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2261);
				tuple_type_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2262);
				tuple_type_element();
				setState(2263);
				match(COMMA);
				setState(2264);
				tuple_type_element_list();
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

	public static class Tuple_type_elementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Element_nameContext element_name() {
			return getRuleContext(Element_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_tuple_type_element);
		int _la;
		try {
			setState(2281);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2269);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2268);
					attributes();
					}
					break;
				}
				setState(2272);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(2271);
					match(T__50);
					}
				}

				setState(2274);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2276);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(2275);
					match(T__50);
					}
				}

				setState(2278);
				element_name();
				setState(2279);
				type_annotation();
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

	public static class Element_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitElement_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_nameContext element_name() throws RecognitionException {
		Element_nameContext _localctx = new Element_nameContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_element_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			identifier();
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

	public static class Protocol_composition_typeContext extends ParserRuleContext {
		public Protocol_identifier_listContext protocol_identifier_list() {
			return getRuleContext(Protocol_identifier_listContext.class,0);
		}
		public Protocol_composition_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_composition_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_composition_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_composition_typeContext protocol_composition_type() throws RecognitionException {
		Protocol_composition_typeContext _localctx = new Protocol_composition_typeContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_protocol_composition_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			match(T__42);
			setState(2286);
			match(LT);
			setState(2288);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (Identifier - 64)) | (1L << (COMMA - 64)))) != 0)) {
				{
				setState(2287);
				protocol_identifier_list();
				}
			}

			setState(2290);
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

	public static class Protocol_identifier_listContext extends ParserRuleContext {
		public List<Protocol_identifierContext> protocol_identifier() {
			return getRuleContexts(Protocol_identifierContext.class);
		}
		public Protocol_identifierContext protocol_identifier(int i) {
			return getRuleContext(Protocol_identifierContext.class,i);
		}
		public Protocol_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_identifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_identifier_listContext protocol_identifier_list() throws RecognitionException {
		Protocol_identifier_listContext _localctx = new Protocol_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_protocol_identifier_list);
		int _la;
		try {
			setState(2299);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2292);
				protocol_identifier();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(2295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2293);
					match(COMMA);
					setState(2294);
					protocol_identifier();
					}
					}
					setState(2297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
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

	public static class Protocol_identifierContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_identifierContext protocol_identifier() throws RecognitionException {
		Protocol_identifierContext _localctx = new Protocol_identifierContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_protocol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			type_identifier();
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

	public static class Type_inheritance_clauseContext extends ParserRuleContext {
		public Class_requirementContext class_requirement() {
			return getRuleContext(Class_requirementContext.class,0);
		}
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_inheritance_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_clauseContext type_inheritance_clause() throws RecognitionException {
		Type_inheritance_clauseContext _localctx = new Type_inheritance_clauseContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_type_inheritance_clause);
		try {
			setState(2312);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2303);
				match(COLON);
				setState(2304);
				class_requirement();
				setState(2305);
				match(COMMA);
				setState(2306);
				type_inheritance_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2308);
				match(COLON);
				setState(2309);
				class_requirement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2310);
				match(COLON);
				setState(2311);
				type_inheritance_list();
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

	public static class Type_inheritance_listContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_inheritance_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_listContext type_inheritance_list() throws RecognitionException {
		Type_inheritance_listContext _localctx = new Type_inheritance_listContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_type_inheritance_list);
		try {
			setState(2319);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2314);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2315);
				type_identifier();
				setState(2316);
				match(COMMA);
				setState(2317);
				type_inheritance_list();
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

	public static class Class_requirementContext extends ParserRuleContext {
		public Class_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_requirement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_requirementContext class_requirement() throws RecognitionException {
		Class_requirementContext _localctx = new Class_requirementContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_class_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321);
			match(T__40);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SwiftParser.Identifier, 0); }
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_identifier);
		try {
			setState(2325);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2323);
				match(Identifier);
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__76:
			case T__79:
			case T__96:
			case T__97:
				enterOuterAlt(_localctx, 2);
				{
				setState(2324);
				context_sensitive_keyword();
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

	public static class Identifier_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			identifier();
			setState(2332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2328);
					match(COMMA);
					setState(2329);
					identifier();
					}
					} 
				}
				setState(2334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
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

	public static class Context_sensitive_keywordContext extends ParserRuleContext {
		public Context_sensitive_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_sensitive_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitContext_sensitive_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_sensitive_keywordContext context_sensitive_keyword() throws RecognitionException {
		Context_sensitive_keywordContext _localctx = new Context_sensitive_keywordContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_context_sensitive_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			_la = _input.LA(1);
			if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__51 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__74 - 45)) | (1L << (T__76 - 45)) | (1L << (T__79 - 45)) | (1L << (T__96 - 45)) | (1L << (T__97 - 45)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2338);
			match(EQUAL);
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

	public static class Negate_prefix_operatorContext extends ParserRuleContext {
		public Negate_prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_prefix_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitNegate_prefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negate_prefix_operatorContext negate_prefix_operator() throws RecognitionException {
		Negate_prefix_operatorContext _localctx = new Negate_prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_negate_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2341);
			match(SUB);
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

	public static class Build_ANDContext extends ParserRuleContext {
		public Build_ANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_AND; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_AND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_ANDContext build_AND() throws RecognitionException {
		Build_ANDContext _localctx = new Build_ANDContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_build_AND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			if (!(SwiftSupport.isOperator(_input,"&&"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"&&\")");
			setState(2344);
			match(AND);
			setState(2345);
			match(AND);
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

	public static class Build_ORContext extends ParserRuleContext {
		public Build_ORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_OR; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBuild_OR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_ORContext build_OR() throws RecognitionException {
		Build_ORContext _localctx = new Build_ORContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_build_OR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			if (!(SwiftSupport.isOperator(_input,"||"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"||\")");
			setState(2348);
			match(OR);
			setState(2349);
			match(OR);
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

	public static class Arrow_operatorContext extends ParserRuleContext {
		public Arrow_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArrow_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_operatorContext arrow_operator() throws RecognitionException {
		Arrow_operatorContext _localctx = new Arrow_operatorContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351);
			if (!(SwiftSupport.isOperator(_input,"->"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"->\")");
			setState(2352);
			match(SUB);
			setState(2353);
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

	public static class Range_operatorContext extends ParserRuleContext {
		public Range_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRange_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_operatorContext range_operator() throws RecognitionException {
		Range_operatorContext _localctx = new Range_operatorContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			if (!(SwiftSupport.isOperator(_input,"..."))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"...\")");
			setState(2356);
			match(DOT);
			setState(2357);
			match(DOT);
			setState(2358);
			match(DOT);
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

	public static class Same_type_equalsContext extends ParserRuleContext {
		public Same_type_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSame_type_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_equalsContext same_type_equals() throws RecognitionException {
		Same_type_equalsContext _localctx = new Same_type_equalsContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_same_type_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2360);
			if (!(SwiftSupport.isOperator(_input,"=="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"==\")");
			setState(2361);
			match(EQUAL);
			setState(2362);
			match(EQUAL);
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

	public static class Binary_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2364);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2365);
			operator();
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

	public static class Prefix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2368);
			operator();
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

	public static class Postfix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
			setState(2371);
			operator();
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

	public static class OperatorContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public List<Operator_characterContext> operator_character() {
			return getRuleContexts(Operator_characterContext.class);
		}
		public Operator_characterContext operator_character(int i) {
			return getRuleContext(Operator_characterContext.class,i);
		}
		public Dot_operator_headContext dot_operator_head() {
			return getRuleContext(Dot_operator_headContext.class,0);
		}
		public List<Dot_operator_characterContext> dot_operator_character() {
			return getRuleContexts(Dot_operator_characterContext.class);
		}
		public Dot_operator_characterContext dot_operator_character(int i) {
			return getRuleContext(Dot_operator_characterContext.class,i);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_operator);
		try {
			int _alt;
			setState(2389);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 1);
				{
				setState(2373);
				operator_head();
				setState(2378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2374);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2375);
						operator_character();
						}
						} 
					}
					setState(2380);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2381);
				dot_operator_head();
				setState(2386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2382);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2383);
						dot_operator_character();
						}
						} 
					}
					setState(2388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
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

	public static class Operator_characterContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public TerminalNode Operator_following_character() { return getToken(SwiftParser.Operator_following_character, 0); }
		public Operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_character; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperator_character(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_characterContext operator_character() throws RecognitionException {
		Operator_characterContext _localctx = new Operator_characterContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_operator_character);
		try {
			setState(2393);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 1);
				{
				setState(2391);
				operator_head();
				}
				break;
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2392);
				match(Operator_following_character);
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

	public static class Operator_headContext extends ParserRuleContext {
		public TerminalNode Operator_head_other() { return getToken(SwiftParser.Operator_head_other, 0); }
		public Operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperator_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_headContext operator_head() throws RecognitionException {
		Operator_headContext _localctx = new Operator_headContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_operator_head);
		int _la;
		try {
			setState(2397);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2395);
				_la = _input.LA(1);
				if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (LT - 114)) | (1L << (GT - 114)) | (1L << (BANG - 114)) | (1L << (QUESTION - 114)) | (1L << (AND - 114)) | (1L << (SUB - 114)) | (1L << (EQUAL - 114)) | (1L << (OR - 114)) | (1L << (DIV - 114)) | (1L << (ADD - 114)) | (1L << (MUL - 114)) | (1L << (MOD - 114)) | (1L << (CARET - 114)) | (1L << (TILDE - 114)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(2396);
				match(Operator_head_other);
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

	public static class Dot_operator_headContext extends ParserRuleContext {
		public Dot_operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDot_operator_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_headContext dot_operator_head() throws RecognitionException {
		Dot_operator_headContext _localctx = new Dot_operator_headContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_dot_operator_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2399);
			match(DOT);
			setState(2400);
			match(DOT);
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

	public static class Dot_operator_characterContext extends ParserRuleContext {
		public Operator_characterContext operator_character() {
			return getRuleContext(Operator_characterContext.class,0);
		}
		public Dot_operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_character; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDot_operator_character(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_characterContext dot_operator_character() throws RecognitionException {
		Dot_operator_characterContext _localctx = new Dot_operator_characterContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_dot_operator_character);
		try {
			setState(2404);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2402);
				match(DOT);
				}
				break;
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2403);
				operator_character();
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

	public static class LiteralContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Nil_literalContext nil_literal() {
			return getRuleContext(Nil_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_literal);
		try {
			setState(2410);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2406);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2407);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2408);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2409);
				nil_literal();
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

	public static class Numeric_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Negate_prefix_operatorContext negate_prefix_operator() {
			return getRuleContext(Negate_prefix_operatorContext.class,0);
		}
		public TerminalNode Floating_point_literal() { return getToken(SwiftParser.Floating_point_literal, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_numeric_literal);
		try {
			setState(2420);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2413);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2412);
					negate_prefix_operator();
					}
					break;
				}
				setState(2415);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2417);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2416);
					negate_prefix_operator();
					}
					break;
				}
				setState(2419);
				match(Floating_point_literal);
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2422);
			_la = _input.LA(1);
			if ( !(_la==T__98 || _la==T__99) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Nil_literalContext extends ParserRuleContext {
		public Nil_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitNil_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nil_literalContext nil_literal() throws RecognitionException {
		Nil_literalContext _localctx = new Nil_literalContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_nil_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
			match(T__100);
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

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode Binary_literal() { return getToken(SwiftParser.Binary_literal, 0); }
		public TerminalNode Octal_literal() { return getToken(SwiftParser.Octal_literal, 0); }
		public TerminalNode Decimal_literal() { return getToken(SwiftParser.Decimal_literal, 0); }
		public TerminalNode Pure_decimal_digits() { return getToken(SwiftParser.Pure_decimal_digits, 0); }
		public TerminalNode Hexadecimal_literal() { return getToken(SwiftParser.Hexadecimal_literal, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			_la = _input.LA(1);
			if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Binary_literal - 133)) | (1L << (Octal_literal - 133)) | (1L << (Decimal_literal - 133)) | (1L << (Pure_decimal_digits - 133)) | (1L << (Hexadecimal_literal - 133)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode Static_string_literal() { return getToken(SwiftParser.Static_string_literal, 0); }
		public TerminalNode Interpolated_string_literal() { return getToken(SwiftParser.Interpolated_string_literal, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			_la = _input.LA(1);
			if ( !(_la==Static_string_literal || _la==Interpolated_string_literal) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 50:
			return build_configuration_sempred((Build_configurationContext)_localctx, predIndex);
		case 164:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 215:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 219:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 239:
			return assignment_operator_sempred((Assignment_operatorContext)_localctx, predIndex);
		case 240:
			return negate_prefix_operator_sempred((Negate_prefix_operatorContext)_localctx, predIndex);
		case 241:
			return build_AND_sempred((Build_ANDContext)_localctx, predIndex);
		case 242:
			return build_OR_sempred((Build_ORContext)_localctx, predIndex);
		case 243:
			return arrow_operator_sempred((Arrow_operatorContext)_localctx, predIndex);
		case 244:
			return range_operator_sempred((Range_operatorContext)_localctx, predIndex);
		case 245:
			return same_type_equals_sempred((Same_type_equalsContext)_localctx, predIndex);
		case 246:
			return binary_operator_sempred((Binary_operatorContext)_localctx, predIndex);
		case 247:
			return prefix_operator_sempred((Prefix_operatorContext)_localctx, predIndex);
		case 248:
			return postfix_operator_sempred((Postfix_operatorContext)_localctx, predIndex);
		case 249:
			return operator_sempred((OperatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean build_configuration_sempred(Build_configurationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 5);
		case 17:
			return precpred(_ctx, 4);
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignment_operator_sempred(Assignment_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean negate_prefix_operator_sempred(Negate_prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean build_AND_sempred(Build_ANDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return SwiftSupport.isOperator(_input,"&&");
		}
		return true;
	}
	private boolean build_OR_sempred(Build_ORContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return SwiftSupport.isOperator(_input,"||");
		}
		return true;
	}
	private boolean arrow_operator_sempred(Arrow_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return SwiftSupport.isOperator(_input,"->");
		}
		return true;
	}
	private boolean range_operator_sempred(Range_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return SwiftSupport.isOperator(_input,"...");
		}
		return true;
	}
	private boolean same_type_equals_sempred(Same_type_equalsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return SwiftSupport.isOperator(_input,"==");
		}
		return true;
	}
	private boolean binary_operator_sempred(Binary_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean prefix_operator_sempred(Prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean postfix_operator_sempred(Postfix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean operator_sempred(OperatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return _input.get(_input.index()-1).getType()!=WS;
		case 31:
			return _input.get(_input.index()-1).getType()!=WS;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0091\u0981\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\3\2\7\2\u020c\n\2\f\2\16\2\u020f"+
		"\13\2\3\2\3\2\3\3\3\3\5\3\u0215\n\3\3\3\3\3\5\3\u0219\n\3\3\3\3\3\5\3"+
		"\u021d\n\3\3\3\3\3\5\3\u0221\n\3\3\3\3\3\5\3\u0225\n\3\3\3\3\3\5\3\u0229"+
		"\n\3\3\3\3\3\5\3\u022d\n\3\3\3\3\3\5\3\u0231\n\3\3\3\5\3\u0234\n\3\3\4"+
		"\6\4\u0237\n\4\r\4\16\4\u0238\3\5\3\5\3\5\3\5\5\5\u023f\n\5\3\6\3\6\5"+
		"\6\u0243\n\6\3\6\3\6\5\6\u0247\n\6\3\6\3\6\5\6\u024b\n\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0251\n\6\3\6\3\6\5\6\u0255\n\6\3\6\3\6\5\6\u0259\n\6\3\6\3\6\5"+
		"\6\u025d\n\6\3\7\3\7\5\7\u0261\n\7\3\b\3\b\5\b\u0265\n\b\3\b\3\b\3\b\3"+
		"\b\5\b\u026b\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u027d\n\n\3\13\3\13\3\13\7\13\u0282\n\13\f\13\16\13\u0285"+
		"\13\13\3\f\3\f\3\f\5\f\u028a\n\f\3\r\3\r\3\r\3\r\5\r\u0290\n\r\3\16\3"+
		"\16\5\16\u0294\n\16\3\16\5\16\u0297\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u02a1\n\17\3\20\3\20\3\20\3\20\7\20\u02a7\n\20\f\20\16"+
		"\20\u02aa\13\20\3\21\3\21\3\21\3\21\5\21\u02b0\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\5\23\u02ba\n\23\3\24\3\24\3\24\3\24\5\24\u02c0\n"+
		"\24\3\25\3\25\3\25\3\25\5\25\u02c6\n\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\5\27\u02d1\n\27\3\27\3\27\3\30\3\30\5\30\u02d7\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u02df\n\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\5\33\u02e7\n\33\3\33\3\33\5\33\u02eb\n\33\3\33\3\33\3\33\5\33\u02f0"+
		"\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0303\n\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\5\"\u030f\n\"\3#\3#\5#\u0313\n#\3$\3$\5$\u0317\n$\3%\3%\3&\3&\5&\u031d"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u0327\n(\f(\16(\u032a\13(\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3,\3,\3,\5,\u0337\n,\3-\3-\5-\u033b\n-\3.\3.\5.\u033f"+
		"\n.\3.\5.\u0342\n.\3.\3.\3/\3/\5/\u0348\n/\3\60\3\60\3\60\5\60\u034d\n"+
		"\60\3\60\5\60\u0350\n\60\3\60\5\60\u0353\n\60\3\60\3\60\3\61\3\61\5\61"+
		"\u0359\n\61\3\62\3\62\3\62\5\62\u035e\n\62\3\63\3\63\5\63\u0362\n\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u036e\n\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0378\n\64\f\64\16\64\u037b\13"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0387\n\65"+
		"\3\66\3\66\3\67\3\67\38\38\38\38\38\58\u0392\n8\39\39\3:\3:\3;\3;\3;\5"+
		";\u039b\n;\3;\3;\3<\3<\3<\7<\u03a2\n<\f<\16<\u03a5\13<\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\5=\u03b0\n=\3>\3>\3>\3?\3?\3?\3?\3?\5?\u03ba\n?\3@\3@\5@"+
		"\u03be\n@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u03c8\nA\3B\3B\3B\3B\3C\3C\3C\3C"+
		"\3D\3D\3D\7D\u03d5\nD\fD\16D\u03d8\13D\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\5F\u03ea\nF\3G\6G\u03ed\nG\rG\16G\u03ee\3H\5H\u03f2\n"+
		"H\3I\3I\5I\u03f6\nI\3I\3I\3J\5J\u03fb\nJ\3J\3J\5J\u03ff\nJ\3J\3J\3K\3"+
		"K\3L\3L\3L\3L\3L\5L\u040a\nL\3M\3M\5M\u040e\nM\3N\5N\u0411\nN\3N\5N\u0414"+
		"\nN\3N\3N\3N\3O\3O\3O\7O\u041c\nO\fO\16O\u041f\13O\3P\3P\5P\u0423\nP\3"+
		"Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"+
		"R\3R\5R\u043e\nR\3R\3R\3R\3R\3R\3R\3R\5R\u0447\nR\3R\3R\5R\u044b\nR\3"+
		"S\5S\u044e\nS\3S\5S\u0451\nS\3S\3S\3T\3T\3U\3U\3U\5U\u045a\nU\3U\3U\3"+
		"U\3U\3U\3U\3U\5U\u0463\nU\3V\5V\u0466\nV\3V\3V\3V\3W\5W\u046c\nW\3W\3"+
		"W\5W\u0470\nW\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\5Y\u047b\nY\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\5Y\u0484\nY\3Z\5Z\u0487\nZ\3Z\3Z\3[\5[\u048c\n[\3[\3[\3\\\3\\\3\\"+
		"\5\\\u0493\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u049c\n\\\3]\5]\u049f\n"+
		"]\3]\3]\5]\u04a3\n]\3]\3]\3^\5^\u04a8\n^\3^\3^\5^\u04ac\n^\3^\3^\3_\3"+
		"_\3_\3`\5`\u04b4\n`\3`\5`\u04b7\n`\3`\3`\3`\3a\3a\3b\3b\3b\3c\3c\3c\5"+
		"c\u04c4\nc\3c\3c\5c\u04c8\nc\3d\5d\u04cb\nd\3d\5d\u04ce\nd\3d\3d\3e\3"+
		"e\5e\u04d4\ne\3f\3f\5f\u04d8\nf\3f\5f\u04db\nf\3f\3f\3f\5f\u04e0\nf\5"+
		"f\u04e2\nf\3g\3g\5g\u04e6\ng\3g\3g\3h\3h\3i\3i\5i\u04ee\ni\3j\3j\3j\3"+
		"j\3j\3j\5j\u04f6\nj\3k\3k\3k\7k\u04fb\nk\fk\16k\u04fe\13k\3l\5l\u0501"+
		"\nl\3l\5l\u0504\nl\3l\3l\5l\u0508\nl\3l\5l\u050b\nl\3l\3l\5l\u050f\nl"+
		"\3l\3l\5l\u0513\nl\3l\5l\u0516\nl\3l\3l\5l\u051a\nl\3l\3l\3l\3l\5l\u0520"+
		"\nl\3l\3l\3l\3l\5l\u0526\nl\3m\3m\5m\u052a\nm\3n\3n\5n\u052e\nn\3o\3o"+
		"\3o\3p\5p\u0534\np\3p\5p\u0537\np\3p\3p\5p\u053b\np\3p\5p\u053e\np\3p"+
		"\5p\u0541\np\3q\5q\u0544\nq\3q\3q\3q\5q\u0549\nq\3q\5q\u054c\nq\3q\3q"+
		"\5q\u0550\nq\3q\3q\3r\3r\5r\u0556\nr\3s\3s\5s\u055a\ns\3t\5t\u055d\nt"+
		"\3t\5t\u0560\nt\3t\3t\3t\3u\3u\3u\3u\3u\5u\u056a\nu\3v\3v\5v\u056e\nv"+
		"\3w\3w\3x\3x\3y\3y\3y\5y\u0577\ny\3y\3y\3y\3y\3y\3z\3z\5z\u0580\nz\3{"+
		"\3{\5{\u0584\n{\3|\5|\u0587\n|\3|\3|\3|\3}\3}\3}\3}\3}\5}\u0591\n}\3~"+
		"\3~\5~\u0595\n~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\5\u0080\u059d"+
		"\n\u0080\3\u0081\5\u0081\u05a0\n\u0081\3\u0081\5\u0081\u05a3\n\u0081\3"+
		"\u0081\3\u0081\3\u0081\5\u0081\u05a8\n\u0081\3\u0081\5\u0081\u05ab\n\u0081"+
		"\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\5\u0083\u05b3\n\u0083"+
		"\3\u0083\3\u0083\3\u0084\5\u0084\u05b8\n\u0084\3\u0084\5\u0084\u05bb\n"+
		"\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u05c0\n\u0084\3\u0084\5\u0084\u05c3"+
		"\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\5\u0086\u05cb"+
		"\n\u0086\3\u0086\3\u0086\3\u0087\5\u0087\u05d0\n\u0087\3\u0087\5\u0087"+
		"\u05d3\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05d8\n\u0087\3\u0087\3"+
		"\u0087\3\u0088\3\u0088\3\u0089\3\u0089\5\u0089\u05e0\n\u0089\3\u0089\3"+
		"\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u05e9\n\u008a\3"+
		"\u008b\3\u008b\5\u008b\u05ed\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3"+
		"\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u05f7\n\u008d\3\u008d\3\u008d\3"+
		"\u008e\3\u008e\5\u008e\u05fd\n\u008e\3\u008e\3\u008e\5\u008e\u0601\n\u008e"+
		"\3\u008e\3\u008e\5\u008e\u0605\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e"+
		"\u060a\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\5\u0090\u0611\n"+
		"\u0090\3\u0090\5\u0090\u0614\n\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0619"+
		"\n\u0090\3\u0090\5\u0090\u061c\n\u0090\3\u0091\3\u0091\5\u0091\u0620\n"+
		"\u0091\3\u0091\3\u0091\5\u0091\u0624\n\u0091\3\u0091\3\u0091\3\u0091\3"+
		"\u0091\5\u0091\u062a\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0630"+
		"\n\u0091\3\u0092\5\u0092\u0633\n\u0092\3\u0092\5\u0092\u0636\n\u0092\3"+
		"\u0092\3\u0092\5\u0092\u063a\n\u0092\3\u0092\5\u0092\u063d\n\u0092\3\u0092"+
		"\3\u0092\3\u0092\5\u0092\u0642\n\u0092\3\u0092\5\u0092\u0645\n\u0092\3"+
		"\u0092\3\u0092\5\u0092\u0649\n\u0092\3\u0093\3\u0093\3\u0094\5\u0094\u064e"+
		"\n\u0094\3\u0094\3\u0094\3\u0094\3\u0095\5\u0095\u0654\n\u0095\3\u0095"+
		"\3\u0095\3\u0095\5\u0095\u0659\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096"+
		"\5\u0096\u065f\n\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097"+
		"\u066f\n\u0097\3\u0098\5\u0098\u0672\n\u0098\3\u0098\5\u0098\u0675\n\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u067c\n\u0099\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\3\u009a\5\u009a\u0683\n\u009a\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e"+
		"\5\u009e\u0699\n\u009e\3\u009e\5\u009e\u069c\n\u009e\3\u009f\3\u009f\3"+
		"\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u06c1\n\u00a3"+
		"\3\u00a4\3\u00a4\5\u00a4\u06c5\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\5\u00a5\u06d6\n\u00a5\3\u00a6\3\u00a6\3\u00a6\5\u00a6"+
		"\u06db\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u06df\n\u00a6\3\u00a6\3\u00a6\3"+
		"\u00a6\5\u00a6\u06e4\n\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5"+
		"\u00a6\u06eb\n\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u06f0\n\u00a6\f\u00a6"+
		"\16\u00a6\u06f3\13\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u06fd\n\u00a9\3\u00aa\3\u00aa\5\u00aa\u0701\n"+
		"\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0708\n\u00ab\f"+
		"\u00ab\16\u00ab\u070b\13\u00ab\3\u00ac\3\u00ac\3\u00ad\5\u00ad\u0710\n"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0715\n\u00ad\3\u00ae\3\u00ae\3"+
		"\u00ae\3\u00af\3\u00af\3\u00b0\5\u00b0\u071d\n\u00b0\3\u00b0\3\u00b0\5"+
		"\u00b0\u0721\n\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\5\u00b2\u0727\n\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b3\6\u00b3\u072c\n\u00b3\r\u00b3\16\u00b3\u072d"+
		"\3\u00b4\6\u00b4\u0731\n\u00b4\r\u00b4\16\u00b4\u0732\3\u00b5\3\u00b5"+
		"\5\u00b5\u0737\n\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u073c\n\u00b5\3"+
		"\u00b5\3\u00b5\3\u00b5\5\u00b5\u0741\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\3\u00b5\3\u00b5\5\u00b5\u0749\n\u00b5\3\u00b6\5\u00b6\u074c\n\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u0750\n\u00b6\3\u00b7\3\u00b7\3\u00b7\7\u00b7"+
		"\u0755\n\u00b7\f\u00b7\16\u00b7\u0758\13\u00b7\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\5\u00b8\u075f\n\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0769\n\u00ba\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0770\n\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\5\u00bb\u0775\n\u00bb\3\u00bc\6\u00bc\u0778\n\u00bc\r\u00bc\16\u00bc"+
		"\u0779\3\u00bd\3\u00bd\5\u00bd\u077e\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3"+
		"\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u078d\n\u00be\3\u00bf\3\u00bf\5\u00bf\u0791\n\u00bf\3"+
		"\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u079b\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u07a7\n\u00c1\3\u00c2\3\u00c2\5\u00c2"+
		"\u07ab\n\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u07b2\n"+
		"\u00c3\f\u00c3\16\u00c3\u07b5\13\u00c3\3\u00c3\5\u00c3\u07b8\n\u00c3\3"+
		"\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u07c1\n"+
		"\u00c5\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u07c6\n\u00c6\f\u00c6\16\u00c6"+
		"\u07c9\13\u00c6\3\u00c6\5\u00c6\u07cc\n\u00c6\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u07e2\n\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u07e7\n\u00ca\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\5\u00ce\u07f8\n\u00ce\3\u00ce"+
		"\5\u00ce\u07fb\n\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\5\u00cf\u0801\n"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0807\n\u00cf\3\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u080e\n\u00cf\3\u00cf\3\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\5\u00cf\u0815\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3"+
		"\u00cf\3\u00cf\5\u00cf\u081c\n\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3"+
		"\u00d1\3\u00d1\3\u00d1\7\u00d1\u0825\n\u00d1\f\u00d1\16\u00d1\u0828\13"+
		"\u00d1\3\u00d2\5\u00d2\u082b\n\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3"+
		"\u00d4\3\u00d4\5\u00d4\u0833\n\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3"+
		"\u00d5\7\u00d5\u083a\n\u00d5\f\u00d5\16\u00d5\u083d\13\u00d5\3\u00d6\3"+
		"\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0844\n\u00d6\3\u00d7\3\u00d7\3"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0856\n\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9"+
		"\u086a\n\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\7\u00d9\u087e\n\u00d9\f\u00d9\16\u00d9\u0881\13\u00d9"+
		"\3\u00da\3\u00da\5\u00da\u0885\n\u00da\3\u00db\3\u00db\3\u00db\3\u00dc"+
		"\3\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0892"+
		"\n\u00dd\3\u00dd\3\u00dd\5\u00dd\u0896\n\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u08aa\n\u00dd"+
		"\f\u00dd\16\u00dd\u08ad\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\5\u00e0\u08bb"+
		"\n\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\5\u00e1\u08c1\n\u00e1\3\u00e1"+
		"\3\u00e1\5\u00e1\u08c5\n\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u08ca\n"+
		"\u00e1\3\u00e2\3\u00e2\3\u00e3\3\u00e3\5\u00e3\u08d0\n\u00e3\3\u00e3\3"+
		"\u00e3\3\u00e4\3\u00e4\5\u00e4\u08d6\n\u00e4\3\u00e5\3\u00e5\3\u00e5\3"+
		"\u00e5\3\u00e5\5\u00e5\u08dd\n\u00e5\3\u00e6\5\u00e6\u08e0\n\u00e6\3\u00e6"+
		"\5\u00e6\u08e3\n\u00e6\3\u00e6\3\u00e6\5\u00e6\u08e7\n\u00e6\3\u00e6\3"+
		"\u00e6\3\u00e6\5\u00e6\u08ec\n\u00e6\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3"+
		"\u00e8\5\u00e8\u08f3\n\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\6"+
		"\u00e9\u08fa\n\u00e9\r\u00e9\16\u00e9\u08fb\5\u00e9\u08fe\n\u00e9\3\u00ea"+
		"\3\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\5\u00eb\u090b\n\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\5\u00ec\u0912\n\u00ec\3\u00ed\3\u00ed\3\u00ee\3\u00ee\5\u00ee\u0918\n"+
		"\u00ee\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u091d\n\u00ef\f\u00ef\16\u00ef"+
		"\u0920\13\u00ef\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f9\3\u00f9"+
		"\3\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fb\3\u00fb\3\u00fb\7\u00fb\u094b"+
		"\n\u00fb\f\u00fb\16\u00fb\u094e\13\u00fb\3\u00fb\3\u00fb\3\u00fb\7\u00fb"+
		"\u0953\n\u00fb\f\u00fb\16\u00fb\u0956\13\u00fb\5\u00fb\u0958\n\u00fb\3"+
		"\u00fc\3\u00fc\5\u00fc\u095c\n\u00fc\3\u00fd\3\u00fd\5\u00fd\u0960\n\u00fd"+
		"\3\u00fe\3\u00fe\3\u00fe\3\u00ff\3\u00ff\5\u00ff\u0967\n\u00ff\3\u0100"+
		"\3\u0100\3\u0100\3\u0100\5\u0100\u096d\n\u0100\3\u0101\5\u0101\u0970\n"+
		"\u0101\3\u0101\3\u0101\5\u0101\u0974\n\u0101\3\u0101\5\u0101\u0977\n\u0101"+
		"\3\u0102\3\u0102\3\u0103\3\u0103\3\u0104\3\u0104\3\u0105\3\u0105\3\u0105"+
		"\2\6f\u014a\u01b0\u01b8\u0106\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2"+
		"\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba"+
		"\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2"+
		"\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea"+
		"\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202"+
		"\u0204\u0206\u0208\2\r\4\2hh\u0080\u0080\3\2\37\"\3\2#&\4\2\b\b).\3\2"+
		"BD\5\2OORR_`\b\2/\62\66\66<MOORRcd\5\2tuwxz\u0083\3\2ef\3\2\u0087\u008b"+
		"\3\2\u008d\u008e\u0a16\2\u020d\3\2\2\2\4\u0233\3\2\2\2\6\u0236\3\2\2\2"+
		"\b\u023e\3\2\2\2\n\u025c\3\2\2\2\f\u0260\3\2\2\2\16\u0262\3\2\2\2\20\u026e"+
		"\3\2\2\2\22\u027c\3\2\2\2\24\u027e\3\2\2\2\26\u0289\3\2\2\2\30\u028b\3"+
		"\2\2\2\32\u0291\3\2\2\2\34\u02a0\3\2\2\2\36\u02a2\3\2\2\2 \u02af\3\2\2"+
		"\2\"\u02b1\3\2\2\2$\u02b9\3\2\2\2&\u02bb\3\2\2\2(\u02c5\3\2\2\2*\u02c7"+
		"\3\2\2\2,\u02cc\3\2\2\2.\u02d4\3\2\2\2\60\u02de\3\2\2\2\62\u02e0\3\2\2"+
		"\2\64\u02ef\3\2\2\2\66\u02f1\3\2\2\28\u02f4\3\2\2\2:\u02f7\3\2\2\2<\u0302"+
		"\3\2\2\2>\u0304\3\2\2\2@\u0307\3\2\2\2B\u030e\3\2\2\2D\u0310\3\2\2\2F"+
		"\u0314\3\2\2\2H\u0318\3\2\2\2J\u031a\3\2\2\2L\u031e\3\2\2\2N\u0323\3\2"+
		"\2\2P\u032b\3\2\2\2R\u032d\3\2\2\2T\u0330\3\2\2\2V\u0333\3\2\2\2X\u0338"+
		"\3\2\2\2Z\u033c\3\2\2\2\\\u0347\3\2\2\2^\u0349\3\2\2\2`\u0356\3\2\2\2"+
		"b\u035a\3\2\2\2d\u035f\3\2\2\2f\u036d\3\2\2\2h\u0386\3\2\2\2j\u0388\3"+
		"\2\2\2l\u038a\3\2\2\2n\u0391\3\2\2\2p\u0393\3\2\2\2r\u0395\3\2\2\2t\u0397"+
		"\3\2\2\2v\u039e\3\2\2\2x\u03af\3\2\2\2z\u03b1\3\2\2\2|\u03b9\3\2\2\2~"+
		"\u03bd\3\2\2\2\u0080\u03c7\3\2\2\2\u0082\u03c9\3\2\2\2\u0084\u03cd\3\2"+
		"\2\2\u0086\u03d1\3\2\2\2\u0088\u03d9\3\2\2\2\u008a\u03e9\3\2\2\2\u008c"+
		"\u03ec\3\2\2\2\u008e\u03f1\3\2\2\2\u0090\u03f3\3\2\2\2\u0092\u03fa\3\2"+
		"\2\2\u0094\u0402\3\2\2\2\u0096\u0409\3\2\2\2\u0098\u040d\3\2\2\2\u009a"+
		"\u0410\3\2\2\2\u009c\u0418\3\2\2\2\u009e\u0420\3\2\2\2\u00a0\u0424\3\2"+
		"\2\2\u00a2\u044a\3\2\2\2\u00a4\u044d\3\2\2\2\u00a6\u0454\3\2\2\2\u00a8"+
		"\u0462\3\2\2\2\u00aa\u0465\3\2\2\2\u00ac\u046b\3\2\2\2\u00ae\u0473\3\2"+
		"\2\2\u00b0\u0483\3\2\2\2\u00b2\u0486\3\2\2\2\u00b4\u048b\3\2\2\2\u00b6"+
		"\u049b\3\2\2\2\u00b8\u049e\3\2\2\2\u00ba\u04a7\3\2\2\2\u00bc\u04af\3\2"+
		"\2\2\u00be\u04b3\3\2\2\2\u00c0\u04bb\3\2\2\2\u00c2\u04bd\3\2\2\2\u00c4"+
		"\u04c0\3\2\2\2\u00c6\u04ca\3\2\2\2\u00c8\u04d3\3\2\2\2\u00ca\u04e1\3\2"+
		"\2\2\u00cc\u04e3\3\2\2\2\u00ce\u04e9\3\2\2\2\u00d0\u04eb\3\2\2\2\u00d2"+
		"\u04f5\3\2\2\2\u00d4\u04f7\3\2\2\2\u00d6\u0525\3\2\2\2\u00d8\u0529\3\2"+
		"\2\2\u00da\u052d\3\2\2\2\u00dc\u052f\3\2\2\2\u00de\u0540\3\2\2\2\u00e0"+
		"\u0543\3\2\2\2\u00e2\u0553\3\2\2\2\u00e4\u0559\3\2\2\2\u00e6\u055c\3\2"+
		"\2\2\u00e8\u0569\3\2\2\2\u00ea\u056b\3\2\2\2\u00ec\u056f\3\2\2\2\u00ee"+
		"\u0571\3\2\2\2\u00f0\u0573\3\2\2\2\u00f2\u057d\3\2\2\2\u00f4\u0583\3\2"+
		"\2\2\u00f6\u0586\3\2\2\2\u00f8\u0590\3\2\2\2\u00fa\u0592\3\2\2\2\u00fc"+
		"\u0596\3\2\2\2\u00fe\u059c\3\2\2\2\u0100\u059f\3\2\2\2\u0102\u05ae\3\2"+
		"\2\2\u0104\u05b0\3\2\2\2\u0106\u05b7\3\2\2\2\u0108\u05c6\3\2\2\2\u010a"+
		"\u05c8\3\2\2\2\u010c\u05cf\3\2\2\2\u010e\u05db\3\2\2\2\u0110\u05dd\3\2"+
		"\2\2\u0112\u05e8\3\2\2\2\u0114\u05ea\3\2\2\2\u0116\u05ee\3\2\2\2\u0118"+
		"\u05f3\3\2\2\2\u011a\u0609\3\2\2\2\u011c\u060b\3\2\2\2\u011e\u0610\3\2"+
		"\2\2\u0120\u062f\3\2\2\2\u0122\u0648\3\2\2\2\u0124\u064a\3\2\2\2\u0126"+
		"\u064d\3\2\2\2\u0128\u0653\3\2\2\2\u012a\u065c\3\2\2\2\u012c\u066e\3\2"+
		"\2\2\u012e\u0671\3\2\2\2\u0130\u0679\3\2\2\2\u0132\u0682\3\2\2\2\u0134"+
		"\u0684\3\2\2\2\u0136\u068a\3\2\2\2\u0138\u0690\3\2\2\2\u013a\u0698\3\2"+
		"\2\2\u013c\u069d\3\2\2\2\u013e\u06a0\3\2\2\2\u0140\u06a2\3\2\2\2\u0142"+
		"\u06a5\3\2\2\2\u0144\u06c0\3\2\2\2\u0146\u06c2\3\2\2\2\u0148\u06d5\3\2"+
		"\2\2\u014a\u06ea\3\2\2\2\u014c\u06f4\3\2\2\2\u014e\u06f6\3\2\2\2\u0150"+
		"\u06fc\3\2\2\2\u0152\u06fe\3\2\2\2\u0154\u0704\3\2\2\2\u0156\u070c\3\2"+
		"\2\2\u0158\u070f\3\2\2\2\u015a\u0716\3\2\2\2\u015c\u0719\3\2\2\2\u015e"+
		"\u071c\3\2\2\2\u0160\u0722\3\2\2\2\u0162\u0724\3\2\2\2\u0164\u072b\3\2"+
		"\2\2\u0166\u0730\3\2\2\2\u0168\u0748\3\2\2\2\u016a\u074b\3\2\2\2\u016c"+
		"\u0751\3\2\2\2\u016e\u075e\3\2\2\2\u0170\u0760\3\2\2\2\u0172\u0768\3\2"+
		"\2\2\u0174\u0774\3\2\2\2\u0176\u0777\3\2\2\2\u0178\u077b\3\2\2\2\u017a"+
		"\u078c\3\2\2\2\u017c\u079a\3\2\2\2\u017e\u079c\3\2\2\2\u0180\u07a6\3\2"+
		"\2\2\u0182\u07a8\3\2\2\2\u0184\u07ae\3\2\2\2\u0186\u07b9\3\2\2\2\u0188"+
		"\u07c0\3\2\2\2\u018a\u07c2\3\2\2\2\u018c\u07cd\3\2\2\2\u018e\u07d1\3\2"+
		"\2\2\u0190\u07e1\3\2\2\2\u0192\u07e6\3\2\2\2\u0194\u07e8\3\2\2\2\u0196"+
		"\u07ec\3\2\2\2\u0198\u07f1\3\2\2\2\u019a\u07f5\3\2\2\2\u019c\u081b\3\2"+
		"\2\2\u019e\u081d\3\2\2\2\u01a0\u0821\3\2\2\2\u01a2\u082a\3\2\2\2\u01a4"+
		"\u082e\3\2\2\2\u01a6\u0830\3\2\2\2\u01a8\u0836\3\2\2\2\u01aa\u0843\3\2"+
		"\2\2\u01ac\u0845\3\2\2\2\u01ae\u0847\3\2\2\2\u01b0\u084c\3\2\2\2\u01b2"+
		"\u0882\3\2\2\2\u01b4\u0886\3\2\2\2\u01b6\u0889\3\2\2\2\u01b8\u0891\3\2"+
		"\2\2\u01ba\u08ae\3\2\2\2\u01bc\u08b2\3\2\2\2\u01be\u08b8\3\2\2\2\u01c0"+
		"\u08c9\3\2\2\2\u01c2\u08cb\3\2\2\2\u01c4\u08cd\3\2\2\2\u01c6\u08d3\3\2"+
		"\2\2\u01c8\u08dc\3\2\2\2\u01ca\u08eb\3\2\2\2\u01cc\u08ed\3\2\2\2\u01ce"+
		"\u08ef\3\2\2\2\u01d0\u08fd\3\2\2\2\u01d2\u08ff\3\2\2\2\u01d4\u090a\3\2"+
		"\2\2\u01d6\u0911\3\2\2\2\u01d8\u0913\3\2\2\2\u01da\u0917\3\2\2\2\u01dc"+
		"\u0919\3\2\2\2\u01de\u0921\3\2\2\2\u01e0\u0923\3\2\2\2\u01e2\u0926\3\2"+
		"\2\2\u01e4\u0929\3\2\2\2\u01e6\u092d\3\2\2\2\u01e8\u0931\3\2\2\2\u01ea"+
		"\u0935\3\2\2\2\u01ec\u093a\3\2\2\2\u01ee\u093e\3\2\2\2\u01f0\u0941\3\2"+
		"\2\2\u01f2\u0944\3\2\2\2\u01f4\u0957\3\2\2\2\u01f6\u095b\3\2\2\2\u01f8"+
		"\u095f\3\2\2\2\u01fa\u0961\3\2\2\2\u01fc\u0966\3\2\2\2\u01fe\u096c\3\2"+
		"\2\2\u0200\u0976\3\2\2\2\u0202\u0978\3\2\2\2\u0204\u097a\3\2\2\2\u0206"+
		"\u097c\3\2\2\2\u0208\u097e\3\2\2\2\u020a\u020c\5\4\3\2\u020b\u020a\3\2"+
		"\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7\2\2\3\u0211\3\3\2\2\2"+
		"\u0212\u0214\5\u016a\u00b6\2\u0213\u0215\7s\2\2\u0214\u0213\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0234\3\2\2\2\u0216\u0218\5\u008aF\2\u0217\u0219"+
		"\7s\2\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0234\3\2\2\2\u021a"+
		"\u021c\5\b\5\2\u021b\u021d\7s\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021d\u0234\3\2\2\2\u021e\u0220\5$\23\2\u021f\u0221\7s\2\2\u0220"+
		"\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0234\3\2\2\2\u0222\u0224\5<"+
		"\37\2\u0223\u0225\7s\2\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0234\3\2\2\2\u0226\u0228\5B\"\2\u0227\u0229\7s\2\2\u0228\u0227\3\2\2"+
		"\2\u0228\u0229\3\2\2\2\u0229\u0234\3\2\2\2\u022a\u022c\5T+\2\u022b\u022d"+
		"\7s\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0234\3\2\2\2\u022e"+
		"\u0230\5V,\2\u022f\u0231\7s\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2"+
		"\2\u0231\u0234\3\2\2\2\u0232\u0234\5\\/\2\u0233\u0212\3\2\2\2\u0233\u0216"+
		"\3\2\2\2\u0233\u021a\3\2\2\2\u0233\u021e\3\2\2\2\u0233\u0222\3\2\2\2\u0233"+
		"\u0226\3\2\2\2\u0233\u022a\3\2\2\2\u0233\u022e\3\2\2\2\u0233\u0232\3\2"+
		"\2\2\u0234\5\3\2\2\2\u0235\u0237\5\4\3\2\u0236\u0235\3\2\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\7\3\2\2\2\u023a"+
		"\u023f\5\n\6\2\u023b\u023f\5\16\b\2\u023c\u023f\5\20\t\2\u023d\u023f\5"+
		"\"\22\2\u023e\u023a\3\2\2\2\u023e\u023b\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023d\3\2\2\2\u023f\t\3\2\2\2\u0240\u0242\7\3\2\2\u0241\u0243\5\f\7\2"+
		"\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246"+
		"\7s\2\2\u0245\u0247\5\u016a\u00b6\2\u0246\u0245\3\2\2\2\u0246\u0247\3"+
		"\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\7s\2\2\u0249\u024b\5\u016a\u00b6"+
		"\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u025d"+
		"\5\u0090I\2\u024d\u024e\7\3\2\2\u024e\u0250\7l\2\2\u024f\u0251\5\f\7\2"+
		"\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254"+
		"\7s\2\2\u0253\u0255\5\u016a\u00b6\2\u0254\u0253\3\2\2\2\u0254\u0255\3"+
		"\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\7s\2\2\u0257\u0259\5\u016a\u00b6"+
		"\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b"+
		"\7o\2\2\u025b\u025d\5\u0090I\2\u025c\u0240\3\2\2\2\u025c\u024d\3\2\2\2"+
		"\u025d\13\3\2\2\2\u025e\u0261\5\u00a2R\2\u025f\u0261\5\u016c\u00b7\2\u0260"+
		"\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261\r\3\2\2\2\u0262\u0264\7\3\2\2"+
		"\u0263\u0265\7\4\2\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u0267\5\u014a\u00a6\2\u0267\u0268\7\5\2\2\u0268\u026a\5"+
		"\u016a\u00b6\2\u0269\u026b\58\35\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u026c\3\2\2\2\u026c\u026d\5\u0090I\2\u026d\17\3\2\2\2\u026e"+
		"\u026f\7\6\2\2\u026f\u0270\5\22\n\2\u0270\u0271\5\u0090I\2\u0271\21\3"+
		"\2\2\2\u0272\u027d\5\u016a\u00b6\2\u0273\u0274\5\u016a\u00b6\2\u0274\u0275"+
		"\7q\2\2\u0275\u0276\5\24\13\2\u0276\u027d\3\2\2\2\u0277\u027d\5\24\13"+
		"\2\u0278\u0279\5L\'\2\u0279\u027a\7q\2\2\u027a\u027b\5\u016a\u00b6\2\u027b"+
		"\u027d\3\2\2\2\u027c\u0272\3\2\2\2\u027c\u0273\3\2\2\2\u027c\u0277\3\2"+
		"\2\2\u027c\u0278\3\2\2\2\u027d\23\3\2\2\2\u027e\u0283\5\26\f\2\u027f\u0280"+
		"\7q\2\2\u0280\u0282\5\26\f\2\u0281\u027f\3\2\2\2\u0282\u0285\3\2\2\2\u0283"+
		"\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\25\3\2\2\2\u0285\u0283\3\2\2"+
		"\2\u0286\u028a\5L\'\2\u0287\u028a\5\30\r\2\u0288\u028a\5\32\16\2\u0289"+
		"\u0286\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u0288\3\2\2\2\u028a\27\3\2\2"+
		"\2\u028b\u028c\7\4\2\2\u028c\u028d\5\u014a\u00a6\2\u028d\u028f\5\u00a0"+
		"Q\2\u028e\u0290\58\35\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\31\3\2\2\2\u0291\u0293\5\34\17\2\u0292\u0294\5\36\20\2\u0293\u0292\3"+
		"\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0297\58\35\2\u0296"+
		"\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\33\3\2\2\2\u0298\u0299\7\7\2"+
		"\2\u0299\u029a\5\u014a\u00a6\2\u029a\u029b\5\u00a0Q\2\u029b\u02a1\3\2"+
		"\2\2\u029c\u029d\7\b\2\2\u029d\u029e\5\u014a\u00a6\2\u029e\u029f\5\u00a0"+
		"Q\2\u029f\u02a1\3\2\2\2\u02a0\u0298\3\2\2\2\u02a0\u029c\3\2\2\2\u02a1"+
		"\35\3\2\2\2\u02a2\u02a3\7q\2\2\u02a3\u02a8\5 \21\2\u02a4\u02a5\7q\2\2"+
		"\u02a5\u02a7\5 \21\2\u02a6\u02a4\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\37\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab"+
		"\u02ac\5\u014a\u00a6\2\u02ac\u02ad\5\u00a0Q\2\u02ad\u02b0\3\2\2\2\u02ae"+
		"\u02b0\5\34\17\2\u02af\u02ab\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0!\3\2\2"+
		"\2\u02b1\u02b2\7\t\2\2\u02b2\u02b3\5\u0090I\2\u02b3\u02b4\7\6\2\2\u02b4"+
		"\u02b5\5\u016a\u00b6\2\u02b5#\3\2\2\2\u02b6\u02ba\5&\24\2\u02b7\u02ba"+
		"\5*\26\2\u02b8\u02ba\5,\27\2\u02b9\u02b6\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9"+
		"\u02b8\3\2\2\2\u02ba%\3\2\2\2\u02bb\u02bc\7\n\2\2\u02bc\u02bd\5\22\n\2"+
		"\u02bd\u02bf\5\u0090I\2\u02be\u02c0\5(\25\2\u02bf\u02be\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\'\3\2\2\2\u02c1\u02c2\7\13\2\2\u02c2\u02c6\5\u0090"+
		"I\2\u02c3\u02c4\7\13\2\2\u02c4\u02c6\5&\24\2\u02c5\u02c1\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c6)\3\2\2\2\u02c7\u02c8\7\f\2\2\u02c8\u02c9\5\22\n\2"+
		"\u02c9\u02ca\7\13\2\2\u02ca\u02cb\5\u0090I\2\u02cb+\3\2\2\2\u02cc\u02cd"+
		"\7\r\2\2\u02cd\u02ce\5\u016a\u00b6\2\u02ce\u02d0\7k\2\2\u02cf\u02d1\5"+
		".\30\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d3\7n\2\2\u02d3-\3\2\2\2\u02d4\u02d6\5\60\31\2\u02d5\u02d7\5.\30\2"+
		"\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7/\3\2\2\2\u02d8\u02d9\5"+
		"\62\32\2\u02d9\u02da\5\6\4\2\u02da\u02df\3\2\2\2\u02db\u02dc\5\66\34\2"+
		"\u02dc\u02dd\5\6\4\2\u02dd\u02df\3\2\2\2\u02de\u02d8\3\2\2\2\u02de\u02db"+
		"\3\2\2\2\u02df\61\3\2\2\2\u02e0\u02e1\7\4\2\2\u02e1\u02e2\5\64\33\2\u02e2"+
		"\u02e3\7r\2\2\u02e3\63\3\2\2\2\u02e4\u02e6\5\u014a\u00a6\2\u02e5\u02e7"+
		"\58\35\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02f0\3\2\2\2\u02e8"+
		"\u02ea\5\u014a\u00a6\2\u02e9\u02eb\58\35\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\7q\2\2\u02ed\u02ee\5\64\33\2"+
		"\u02ee\u02f0\3\2\2\2\u02ef\u02e4\3\2\2\2\u02ef\u02e8\3\2\2\2\u02f0\65"+
		"\3\2\2\2\u02f1\u02f2\7\16\2\2\u02f2\u02f3\7r\2\2\u02f3\67\3\2\2\2\u02f4"+
		"\u02f5\7\17\2\2\u02f5\u02f6\5:\36\2\u02f69\3\2\2\2\u02f7\u02f8\5\u016a"+
		"\u00b6\2\u02f8;\3\2\2\2\u02f9\u02fa\5> \2\u02fa\u02fb\5\b\5\2\u02fb\u0303"+
		"\3\2\2\2\u02fc\u02fd\5> \2\u02fd\u02fe\5&\24\2\u02fe\u0303\3\2\2\2\u02ff"+
		"\u0300\5> \2\u0300\u0301\5,\27\2\u0301\u0303\3\2\2\2\u0302\u02f9\3\2\2"+
		"\2\u0302\u02fc\3\2\2\2\u0302\u02ff\3\2\2\2\u0303=\3\2\2\2\u0304\u0305"+
		"\5@!\2\u0305\u0306\7r\2\2\u0306?\3\2\2\2\u0307\u0308\5\u01da\u00ee\2\u0308"+
		"A\3\2\2\2\u0309\u030f\5D#\2\u030a\u030f\5F$\2\u030b\u030f\5H%\2\u030c"+
		"\u030f\5J&\2\u030d\u030f\5R*\2\u030e\u0309\3\2\2\2\u030e\u030a\3\2\2\2"+
		"\u030e\u030b\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2\u030fC\3"+
		"\2\2\2\u0310\u0312\7\20\2\2\u0311\u0313\5@!\2\u0312\u0311\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313E\3\2\2\2\u0314\u0316\7\21\2\2\u0315\u0317\5@!\2\u0316"+
		"\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317G\3\2\2\2\u0318\u0319\7\22\2\2"+
		"\u0319I\3\2\2\2\u031a\u031c\7\23\2\2\u031b\u031d\5\u016a\u00b6\2\u031c"+
		"\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031dK\3\2\2\2\u031e\u031f\7\24\2\2"+
		"\u031f\u0320\7l\2\2\u0320\u0321\5N(\2\u0321\u0322\7o\2\2\u0322M\3\2\2"+
		"\2\u0323\u0328\5P)\2\u0324\u0325\7q\2\2\u0325\u0327\5P)\2\u0326\u0324"+
		"\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"O\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032c\t\2\2\2\u032cQ\3\2\2\2\u032d"+
		"\u032e\7\25\2\2\u032e\u032f\5\u016a\u00b6\2\u032fS\3\2\2\2\u0330\u0331"+
		"\7\26\2\2\u0331\u0332\5\u0090I\2\u0332U\3\2\2\2\u0333\u0334\7\27\2\2\u0334"+
		"\u0336\5\u0090I\2\u0335\u0337\5X-\2\u0336\u0335\3\2\2\2\u0336\u0337\3"+
		"\2\2\2\u0337W\3\2\2\2\u0338\u033a\5Z.\2\u0339\u033b\5X-\2\u033a\u0339"+
		"\3\2\2\2\u033a\u033b\3\2\2\2\u033bY\3\2\2\2\u033c\u033e\7\30\2\2\u033d"+
		"\u033f\5\u014a\u00a6\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341"+
		"\3\2\2\2\u0340\u0342\58\35\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0343\3\2\2\2\u0343\u0344\5\u0090I\2\u0344[\3\2\2\2\u0345\u0348\5^\60"+
		"\2\u0346\u0348\5n8\2\u0347\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348]\3"+
		"\2\2\2\u0349\u034a\7\31\2\2\u034a\u034c\5f\64\2\u034b\u034d\5\6\4\2\u034c"+
		"\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u0350\5`"+
		"\61\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0352\3\2\2\2\u0351"+
		"\u0353\5d\63\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2"+
		"\2\2\u0354\u0355\7\32\2\2\u0355_\3\2\2\2\u0356\u0358\5b\62\2\u0357\u0359"+
		"\5`\61\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359a\3\2\2\2\u035a"+
		"\u035b\7\33\2\2\u035b\u035d\5f\64\2\u035c\u035e\5\6\4\2\u035d\u035c\3"+
		"\2\2\2\u035d\u035e\3\2\2\2\u035ec\3\2\2\2\u035f\u0361\7\34\2\2\u0360\u0362"+
		"\5\6\4\2\u0361\u0360\3\2\2\2\u0361\u0362\3\2\2\2\u0362e\3\2\2\2\u0363"+
		"\u0364\b\64\1\2\u0364\u0365\7w\2\2\u0365\u036e\5f\64\5\u0366\u036e\5h"+
		"\65\2\u0367\u036e\5\u01da\u00ee\2\u0368\u036e\5\u0202\u0102\2\u0369\u036a"+
		"\7l\2\2\u036a\u036b\5f\64\2\u036b\u036c\7o\2\2\u036c\u036e\3\2\2\2\u036d"+
		"\u0363\3\2\2\2\u036d\u0366\3\2\2\2\u036d\u0367\3\2\2\2\u036d\u0368\3\2"+
		"\2\2\u036d\u0369\3\2\2\2\u036e\u0379\3\2\2\2\u036f\u0370\f\4\2\2\u0370"+
		"\u0371\5\u01e4\u00f3\2\u0371\u0372\5f\64\5\u0372\u0378\3\2\2\2\u0373\u0374"+
		"\f\3\2\2\u0374\u0375\5\u01e6\u00f4\2\u0375\u0376\5f\64\4\u0376\u0378\3"+
		"\2\2\2\u0377\u036f\3\2\2\2\u0377\u0373\3\2\2\2\u0378\u037b\3\2\2\2\u0379"+
		"\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037ag\3\2\2\2\u037b\u0379\3\2\2\2"+
		"\u037c\u037d\7\35\2\2\u037d\u037e\7l\2\2\u037e\u037f\5j\66\2\u037f\u0380"+
		"\7o\2\2\u0380\u0387\3\2\2\2\u0381\u0382\7\36\2\2\u0382\u0383\7l\2\2\u0383"+
		"\u0384\5l\67\2\u0384\u0385\7o\2\2\u0385\u0387\3\2\2\2\u0386\u037c\3\2"+
		"\2\2\u0386\u0381\3\2\2\2\u0387i\3\2\2\2\u0388\u0389\t\3\2\2\u0389k\3\2"+
		"\2\2\u038a\u038b\t\4\2\2\u038bm\3\2\2\2\u038c\u0392\7\'\2\2\u038d\u038e"+
		"\7\'\2\2\u038e\u038f\5p9\2\u038f\u0390\5r:\2\u0390\u0392\3\2\2\2\u0391"+
		"\u038c\3\2\2\2\u0391\u038d\3\2\2\2\u0392o\3\2\2\2\u0393\u0394\5\u0206"+
		"\u0104\2\u0394q\3\2\2\2\u0395\u0396\7\u008d\2\2\u0396s\3\2\2\2\u0397\u0398"+
		"\7t\2\2\u0398\u039a\5v<\2\u0399\u039b\5z>\2\u039a\u0399\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\7u\2\2\u039du\3\2\2\2\u039e"+
		"\u03a3\5x=\2\u039f\u03a0\7q\2\2\u03a0\u03a2\5x=\2\u03a1\u039f\3\2\2\2"+
		"\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4w\3"+
		"\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03b0\5\u01c2\u00e2\2\u03a7\u03a8\5\u01c2"+
		"\u00e2\2\u03a8\u03a9\7r\2\2\u03a9\u03aa\5\u01c0\u00e1\2\u03aa\u03b0\3"+
		"\2\2\2\u03ab\u03ac\5\u01c2\u00e2\2\u03ac\u03ad\7r\2\2\u03ad\u03ae\5\u01ce"+
		"\u00e8\2\u03ae\u03b0\3\2\2\2\u03af\u03a6\3\2\2\2\u03af\u03a7\3\2\2\2\u03af"+
		"\u03ab\3\2\2\2\u03b0y\3\2\2\2\u03b1\u03b2\7\17\2\2\u03b2\u03b3\5|?\2\u03b3"+
		"{\3\2\2\2\u03b4\u03ba\5~@\2\u03b5\u03b6\5~@\2\u03b6\u03b7\7q\2\2\u03b7"+
		"\u03b8\5|?\2\u03b8\u03ba\3\2\2\2\u03b9\u03b4\3\2\2\2\u03b9\u03b5\3\2\2"+
		"\2\u03ba}\3\2\2\2\u03bb\u03be\5\u0080A\2\u03bc\u03be\5\u0082B\2\u03bd"+
		"\u03bb\3\2\2\2\u03bd\u03bc\3\2\2\2\u03be\177\3\2\2\2\u03bf\u03c0\5\u01c0"+
		"\u00e1\2\u03c0\u03c1\7r\2\2\u03c1\u03c2\5\u01c0\u00e1\2\u03c2\u03c8\3"+
		"\2\2\2\u03c3\u03c4\5\u01c0\u00e1\2\u03c4\u03c5\7r\2\2\u03c5\u03c6\5\u01ce"+
		"\u00e8\2\u03c6\u03c8\3\2\2\2\u03c7\u03bf\3\2\2\2\u03c7\u03c3\3\2\2\2\u03c8"+
		"\u0081\3\2\2\2\u03c9\u03ca\5\u01c0\u00e1\2\u03ca\u03cb\5\u01ec\u00f7\2"+
		"\u03cb\u03cc\5\u01b8\u00dd\2\u03cc\u0083\3\2\2\2\u03cd\u03ce\7t\2\2\u03ce"+
		"\u03cf\5\u0086D\2\u03cf\u03d0\7u\2\2\u03d0\u0085\3\2\2\2\u03d1\u03d6\5"+
		"\u0088E\2\u03d2\u03d3\7q\2\2\u03d3\u03d5\5\u0088E\2\u03d4\u03d2\3\2\2"+
		"\2\u03d5\u03d8\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u0087"+
		"\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03da\5\u01b8\u00dd\2\u03da\u0089\3"+
		"\2\2\2\u03db\u03ea\5\u0092J\2\u03dc\u03ea\5\u009aN\2\u03dd\u03ea\5\u00a2"+
		"R\2\u03de\u03ea\5\u00bc_\2\u03df\u03ea\5\u00c4c\2\u03e0\u03ea\5\u00de"+
		"p\2\u03e1\u03ea\5\u0100\u0081\2\u03e2\u03ea\5\u0106\u0084\2\u03e3\u03ea"+
		"\5\u010c\u0087\2\u03e4\u03ea\5\u0120\u0091\2\u03e5\u03ea\5\u0126\u0094"+
		"\2\u03e6\u03ea\5\u0128\u0095\2\u03e7\u03ea\5\u012c\u0097\2\u03e8\u03ea"+
		"\5\u0132\u009a\2\u03e9\u03db\3\2\2\2\u03e9\u03dc\3\2\2\2\u03e9\u03dd\3"+
		"\2\2\2\u03e9\u03de\3\2\2\2\u03e9\u03df\3\2\2\2\u03e9\u03e0\3\2\2\2\u03e9"+
		"\u03e1\3\2\2\2\u03e9\u03e2\3\2\2\2\u03e9\u03e3\3\2\2\2\u03e9\u03e4\3\2"+
		"\2\2\u03e9\u03e5\3\2\2\2\u03e9\u03e6\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9"+
		"\u03e8\3\2\2\2\u03ea\u008b\3\2\2\2\u03eb\u03ed\5\u008aF\2\u03ec\u03eb"+
		"\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u008d\3\2\2\2\u03f0\u03f2\5\6\4\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2"+
		"\2\2\u03f2\u008f\3\2\2\2\u03f3\u03f5\7k\2\2\u03f4\u03f6\5\6\4\2\u03f5"+
		"\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\7n"+
		"\2\2\u03f8\u0091\3\2\2\2\u03f9\u03fb\5\u0164\u00b3\2\u03fa\u03f9\3\2\2"+
		"\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\7(\2\2\u03fd\u03ff"+
		"\5\u0094K\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2"+
		"\2\u0400\u0401\5\u0096L\2\u0401\u0093\3\2\2\2\u0402\u0403\t\5\2\2\u0403"+
		"\u0095\3\2\2\2\u0404\u040a\5\u0098M\2\u0405\u0406\5\u0098M\2\u0406\u0407"+
		"\7j\2\2\u0407\u0408\5\u0096L\2\u0408\u040a\3\2\2\2\u0409\u0404\3\2\2\2"+
		"\u0409\u0405\3\2\2\2\u040a\u0097\3\2\2\2\u040b\u040e\5\u01da\u00ee\2\u040c"+
		"\u040e\5\u01f4\u00fb\2\u040d\u040b\3\2\2\2\u040d\u040c\3\2\2\2\u040e\u0099"+
		"\3\2\2\2\u040f\u0411\5\u0164\u00b3\2\u0410\u040f\3\2\2\2\u0410\u0411\3"+
		"\2\2\2\u0411\u0413\3\2\2\2\u0412\u0414\5\u0146\u00a4\2\u0413\u0412\3\2"+
		"\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\7\7\2\2\u0416"+
		"\u0417\5\u009cO\2\u0417\u009b\3\2\2\2\u0418\u041d\5\u009eP\2\u0419\u041a"+
		"\7q\2\2\u041a\u041c\5\u009eP\2\u041b\u0419\3\2\2\2\u041c\u041f\3\2\2\2"+
		"\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u009d\3\2\2\2\u041f\u041d"+
		"\3\2\2\2\u0420\u0422\5\u014a\u00a6\2\u0421\u0423\5\u00a0Q\2\u0422\u0421"+
		"\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u009f\3\2\2\2\u0424\u0425\5\u01e0\u00f1"+
		"\2\u0425\u0426\5\u016a\u00b6\2\u0426\u00a1\3\2\2\2\u0427\u0428\5\u00a4"+
		"S\2\u0428\u0429\5\u009cO\2\u0429\u044b\3\2\2\2\u042a\u042b\5\u00a4S\2"+
		"\u042b\u042c\5\u00a6T\2\u042c\u042d\5\u01be\u00e0\2\u042d\u042e\5\u0090"+
		"I\2\u042e\u044b\3\2\2\2\u042f\u0430\5\u00a4S\2\u0430\u0431\5\u00a6T\2"+
		"\u0431\u0432\5\u01be\u00e0\2\u0432\u0433\5\u00a8U\2\u0433\u044b\3\2\2"+
		"\2\u0434\u0435\5\u00a4S\2\u0435\u0436\5\u00a6T\2\u0436\u0437\5\u01be\u00e0"+
		"\2\u0437\u0438\5\u00b0Y\2\u0438\u044b\3\2\2\2\u0439\u043a\5\u00a4S\2\u043a"+
		"\u043b\5\u00a6T\2\u043b\u043d\5\u01be\u00e0\2\u043c\u043e\5\u00a0Q\2\u043d"+
		"\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\5\u00b6"+
		"\\\2\u0440\u044b\3\2\2\2\u0441\u0442\5\u00a4S\2\u0442\u0443\5\u00a6T\2"+
		"\u0443\u0444\5\u01be\u00e0\2\u0444\u0446\5\u01be\u00e0\2\u0445\u0447\5"+
		"\u00a0Q\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2"+
		"\u0448\u0449\5\u00b6\\\2\u0449\u044b\3\2\2\2\u044a\u0427\3\2\2\2\u044a"+
		"\u042a\3\2\2\2\u044a\u042f\3\2\2\2\u044a\u0434\3\2\2\2\u044a\u0439\3\2"+
		"\2\2\u044a\u0441\3\2\2\2\u044b\u00a3\3\2\2\2\u044c\u044e\5\u0164\u00b3"+
		"\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u0451"+
		"\5\u0146\u00a4\2\u0450\u044f\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\3"+
		"\2\2\2\u0452\u0453\7\b\2\2\u0453\u00a5\3\2\2\2\u0454\u0455\5\u01da\u00ee"+
		"\2\u0455\u00a7\3\2\2\2\u0456\u0457\7k\2\2\u0457\u0459\5\u00aaV\2\u0458"+
		"\u045a\5\u00acW\2\u0459\u0458\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b"+
		"\3\2\2\2\u045b\u045c\7n\2\2\u045c\u0463\3\2\2\2\u045d\u045e\7k\2\2\u045e"+
		"\u045f\5\u00acW\2\u045f\u0460\5\u00aaV\2\u0460\u0461\7n\2\2\u0461\u0463"+
		"\3\2\2\2\u0462\u0456\3\2\2\2\u0462\u045d\3\2\2\2\u0463\u00a9\3\2\2\2\u0464"+
		"\u0466\5\u0164\u00b3\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0468\7/\2\2\u0468\u0469\5\u0090I\2\u0469\u00ab\3\2\2\2"+
		"\u046a\u046c\5\u0164\u00b3\2\u046b\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c"+
		"\u046d\3\2\2\2\u046d\u046f\7\60\2\2\u046e\u0470\5\u00aeX\2\u046f\u046e"+
		"\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\5\u0090I"+
		"\2\u0472\u00ad\3\2\2\2\u0473\u0474\7l\2\2\u0474\u0475\5\u01da\u00ee\2"+
		"\u0475\u0476\7o\2\2\u0476\u00af\3\2\2\2\u0477\u0478\7k\2\2\u0478\u047a"+
		"\5\u00b2Z\2\u0479\u047b\5\u00b4[\2\u047a\u0479\3\2\2\2\u047a\u047b\3\2"+
		"\2\2\u047b\u047c\3\2\2\2\u047c\u047d\7n\2\2\u047d\u0484\3\2\2\2\u047e"+
		"\u047f\7k\2\2\u047f\u0480\5\u00b4[\2\u0480\u0481\5\u00b2Z\2\u0481\u0482"+
		"\7n\2\2\u0482\u0484\3\2\2\2\u0483\u0477\3\2\2\2\u0483\u047e\3\2\2\2\u0484"+
		"\u00b1\3\2\2\2\u0485\u0487\5\u0164\u00b3\2\u0486\u0485\3\2\2\2\u0486\u0487"+
		"\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\7/\2\2\u0489\u00b3\3\2\2\2\u048a"+
		"\u048c\5\u0164\u00b3\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d"+
		"\3\2\2\2\u048d\u048e\7\60\2\2\u048e\u00b5\3\2\2\2\u048f\u0490\7k\2\2\u0490"+
		"\u0492\5\u00b8]\2\u0491\u0493\5\u00ba^\2\u0492\u0491\3\2\2\2\u0492\u0493"+
		"\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\7n\2\2\u0495\u049c\3\2\2\2\u0496"+
		"\u0497\7k\2\2\u0497\u0498\5\u00ba^\2\u0498\u0499\5\u00b8]\2\u0499\u049a"+
		"\7n\2\2\u049a\u049c\3\2\2\2\u049b\u048f\3\2\2\2\u049b\u0496\3\2\2\2\u049c"+
		"\u00b7\3\2\2\2\u049d\u049f\5\u0164\u00b3\2\u049e\u049d\3\2\2\2\u049e\u049f"+
		"\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\7\61\2\2\u04a1\u04a3\5\u00ae"+
		"X\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4"+
		"\u04a5\5\u0090I\2\u04a5\u00b9\3\2\2\2\u04a6\u04a8\5\u0164\u00b3\2\u04a7"+
		"\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ab\7\62"+
		"\2\2\u04aa\u04ac\5\u00aeX\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac"+
		"\u04ad\3\2\2\2\u04ad\u04ae\5\u0090I\2\u04ae\u00bb\3\2\2\2\u04af\u04b0"+
		"\5\u00be`\2\u04b0\u04b1\5\u00c2b\2\u04b1\u00bd\3\2\2\2\u04b2\u04b4\5\u0164"+
		"\u00b3\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b6\3\2\2\2\u04b5"+
		"\u04b7\5\u0148\u00a5\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8"+
		"\3\2\2\2\u04b8\u04b9\7)\2\2\u04b9\u04ba\5\u00c0a\2\u04ba\u00bf\3\2\2\2"+
		"\u04bb\u04bc\5\u01da\u00ee\2\u04bc\u00c1\3\2\2\2\u04bd\u04be\5\u01e0\u00f1"+
		"\2\u04be\u04bf\5\u01b8\u00dd\2\u04bf\u00c3\3\2\2\2\u04c0\u04c1\5\u00c6"+
		"d\2\u04c1\u04c3\5\u00c8e\2\u04c2\u04c4\5t;\2\u04c3\u04c2\3\2\2\2\u04c3"+
		"\u04c4\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\5\u00caf\2\u04c6\u04c8"+
		"\5\u00ceh\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u00c5\3\2\2"+
		"\2\u04c9\u04cb\5\u0164\u00b3\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2"+
		"\u04cb\u04cd\3\2\2\2\u04cc\u04ce\5\u0146\u00a4\2\u04cd\u04cc\3\2\2\2\u04cd"+
		"\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\7.\2\2\u04d0\u00c7\3\2"+
		"\2\2\u04d1\u04d4\5\u01da\u00ee\2\u04d2\u04d4\5\u01f4\u00fb\2\u04d3\u04d1"+
		"\3\2\2\2\u04d3\u04d2\3\2\2\2\u04d4\u00c9\3\2\2\2\u04d5\u04d7\5\u00d0i"+
		"\2\u04d6\u04d8\7\63\2\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8"+
		"\u04da\3\2\2\2\u04d9\u04db\5\u00ccg\2\u04da\u04d9\3\2\2\2\u04da\u04db"+
		"\3\2\2\2\u04db\u04e2\3\2\2\2\u04dc\u04dd\5\u00d0i\2\u04dd\u04df\7\64\2"+
		"\2\u04de\u04e0\5\u00ccg\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"+
		"\u04e2\3\2\2\2\u04e1\u04d5\3\2\2\2\u04e1\u04dc\3\2\2\2\u04e2\u00cb\3\2"+
		"\2\2\u04e3\u04e5\5\u01e8\u00f5\2\u04e4\u04e6\5\u0164\u00b3\2\u04e5\u04e4"+
		"\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\5\u01b8\u00dd"+
		"\2\u04e8\u00cd\3\2\2\2\u04e9\u04ea\5\u0090I\2\u04ea\u00cf\3\2\2\2\u04eb"+
		"\u04ed\5\u00d2j\2\u04ec\u04ee\5\u00d0i\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee"+
		"\3\2\2\2\u04ee\u00d1\3\2\2\2\u04ef\u04f0\7l\2\2\u04f0\u04f6\7o\2\2\u04f1"+
		"\u04f2\7l\2\2\u04f2\u04f3\5\u00d4k\2\u04f3\u04f4\7o\2\2\u04f4\u04f6\3"+
		"\2\2\2\u04f5\u04ef\3\2\2\2\u04f5\u04f1\3\2\2\2\u04f6\u00d3\3\2\2\2\u04f7"+
		"\u04fc\5\u00d6l\2\u04f8\u04f9\7q\2\2\u04f9\u04fb\5\u00d6l\2\u04fa\u04f8"+
		"\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd"+
		"\u00d5\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff\u0501\7\7\2\2\u0500\u04ff\3\2"+
		"\2\2\u0500\u0501\3\2\2\2\u0501\u0503\3\2\2\2\u0502\u0504\5\u00d8m\2\u0503"+
		"\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\5\u00da"+
		"n\2\u0506\u0508\5\u01be\u00e0\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2"+
		"\2\u0508\u050a\3\2\2\2\u0509\u050b\5\u00dco\2\u050a\u0509\3\2\2\2\u050a"+
		"\u050b\3\2\2\2\u050b\u0526\3\2\2\2\u050c\u050e\7\b\2\2\u050d\u050f\5\u00d8"+
		"m\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510"+
		"\u0512\5\u00dan\2\u0511\u0513\5\u01be\u00e0\2\u0512\u0511\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u0515\3\2\2\2\u0514\u0516\5\u00dco\2\u0515\u0514"+
		"\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0526\3\2\2\2\u0517\u0519\7\65\2\2"+
		"\u0518\u051a\5\u00d8m\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"\u051b\3\2\2\2\u051b\u051c\5\u00dan\2\u051c\u051d\5\u01be\u00e0\2\u051d"+
		"\u0526\3\2\2\2\u051e\u0520\5\u00d8m\2\u051f\u051e\3\2\2\2\u051f\u0520"+
		"\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\5\u00dan\2\u0522\u0523\5\u01be"+
		"\u00e0\2\u0523\u0524\5\u01ea\u00f6\2\u0524\u0526\3\2\2\2\u0525\u0500\3"+
		"\2\2\2\u0525\u050c\3\2\2\2\u0525\u0517\3\2\2\2\u0525\u051f\3\2\2\2\u0526"+
		"\u00d7\3\2\2\2\u0527\u052a\5\u01da\u00ee\2\u0528\u052a\7v\2\2\u0529\u0527"+
		"\3\2\2\2\u0529\u0528\3\2\2\2\u052a\u00d9\3\2\2\2\u052b\u052e\5\u01da\u00ee"+
		"\2\u052c\u052e\7v\2\2\u052d\u052b\3\2\2\2\u052d\u052c\3\2\2\2\u052e\u00db"+
		"\3\2\2\2\u052f\u0530\5\u01e0\u00f1\2\u0530\u0531\5\u016a\u00b6\2\u0531"+
		"\u00dd\3\2\2\2\u0532\u0534\5\u0164\u00b3\2\u0533\u0532\3\2\2\2\u0533\u0534"+
		"\3\2\2\2\u0534\u0536\3\2\2\2\u0535\u0537\5\u0148\u00a5\2\u0536\u0535\3"+
		"\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0541\5\u00e0q\2"+
		"\u0539\u053b\5\u0164\u00b3\2\u053a\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b"+
		"\u053d\3\2\2\2\u053c\u053e\5\u0148\u00a5\2\u053d\u053c\3\2\2\2\u053d\u053e"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\5\u00f0y\2\u0540\u0533\3\2\2"+
		"\2\u0540\u053a\3\2\2\2\u0541\u00df\3\2\2\2\u0542\u0544\7\66\2\2\u0543"+
		"\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\7,"+
		"\2\2\u0546\u0548\5\u00ecw\2\u0547\u0549\5t;\2\u0548\u0547\3\2\2\2\u0548"+
		"\u0549\3\2\2\2\u0549\u054b\3\2\2\2\u054a\u054c\5\u01d4\u00eb\2\u054b\u054a"+
		"\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054f\7k\2\2\u054e"+
		"\u0550\5\u00e2r\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551"+
		"\3\2\2\2\u0551\u0552\7n\2\2\u0552\u00e1\3\2\2\2\u0553\u0555\5\u00e4s\2"+
		"\u0554\u0556\5\u00e2r\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u00e3\3\2\2\2\u0557\u055a\5\u008aF\2\u0558\u055a\5\u00e6t\2\u0559\u0557"+
		"\3\2\2\2\u0559\u0558\3\2\2\2\u055a\u00e5\3\2\2\2\u055b\u055d\5\u0164\u00b3"+
		"\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055f\3\2\2\2\u055e\u0560"+
		"\7\66\2\2\u055f\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\3\2\2\2"+
		"\u0561\u0562\7\4\2\2\u0562\u0563\5\u00e8u\2\u0563\u00e7\3\2\2\2\u0564"+
		"\u056a\5\u00eav\2\u0565\u0566\5\u00eav\2\u0566\u0567\7q\2\2\u0567\u0568"+
		"\5\u00e8u\2\u0568\u056a\3\2\2\2\u0569\u0564\3\2\2\2\u0569\u0565\3\2\2"+
		"\2\u056a\u00e9\3\2\2\2\u056b\u056d\5\u00eex\2\u056c\u056e\5\u01c4\u00e3"+
		"\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u00eb\3\2\2\2\u056f\u0570"+
		"\5\u01da\u00ee\2\u0570\u00ed\3\2\2\2\u0571\u0572\5\u01da\u00ee\2\u0572"+
		"\u00ef\3\2\2\2\u0573\u0574\7,\2\2\u0574\u0576\5\u00ecw\2\u0575\u0577\5"+
		"t;\2\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578"+
		"\u0579\5\u01d4\u00eb\2\u0579\u057a\7k\2\2\u057a\u057b\5\u00f2z\2\u057b"+
		"\u057c\7n\2\2\u057c\u00f1\3\2\2\2\u057d\u057f\5\u00f4{\2\u057e\u0580\5"+
		"\u00f2z\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u00f3\3\2\2\2"+
		"\u0581\u0584\5\u008aF\2\u0582\u0584\5\u00f6|\2\u0583\u0581\3\2\2\2\u0583"+
		"\u0582\3\2\2\2\u0584\u00f5\3\2\2\2\u0585\u0587\5\u0164\u00b3\2\u0586\u0585"+
		"\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\7\4\2\2\u0589"+
		"\u058a\5\u00f8}\2\u058a\u00f7\3\2\2\2\u058b\u0591\5\u00fa~\2\u058c\u058d"+
		"\5\u00fa~\2\u058d\u058e\7q\2\2\u058e\u058f\5\u00f8}\2\u058f\u0591\3\2"+
		"\2\2\u0590\u058b\3\2\2\2\u0590\u058c\3\2\2\2\u0591\u00f9\3\2\2\2\u0592"+
		"\u0594\5\u00eex\2\u0593\u0595\5\u00fc\177\2\u0594\u0593\3\2\2\2\u0594"+
		"\u0595\3\2\2\2\u0595\u00fb\3\2\2\2\u0596\u0597\5\u01e0\u00f1\2\u0597\u0598"+
		"\5\u00fe\u0080\2\u0598\u00fd\3\2\2\2\u0599\u059d\5\u0200\u0101\2\u059a"+
		"\u059d\7\u008d\2\2\u059b\u059d\5\u0202\u0102\2\u059c\u0599\3\2\2\2\u059c"+
		"\u059a\3\2\2\2\u059c\u059b\3\2\2\2\u059d\u00ff\3\2\2\2\u059e\u05a0\5\u0164"+
		"\u00b3\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1"+
		"\u05a3\5\u0148\u00a5\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4"+
		"\3\2\2\2\u05a4\u05a5\7*\2\2\u05a5\u05a7\5\u0102\u0082\2\u05a6\u05a8\5"+
		"t;\2\u05a7\u05a6\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05aa\3\2\2\2\u05a9"+
		"\u05ab\5\u01d4\u00eb\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac"+
		"\3\2\2\2\u05ac\u05ad\5\u0104\u0083\2\u05ad\u0101\3\2\2\2\u05ae\u05af\5"+
		"\u01da\u00ee\2\u05af\u0103\3\2\2\2\u05b0\u05b2\7k\2\2\u05b1\u05b3\5\u008c"+
		"G\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4"+
		"\u05b5\7n\2\2\u05b5\u0105\3\2\2\2\u05b6\u05b8\5\u0164\u00b3\2\u05b7\u05b6"+
		"\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05bb\5\u0148\u00a5"+
		"\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd"+
		"\7+\2\2\u05bd\u05bf\5\u0108\u0085\2\u05be\u05c0\5t;\2\u05bf\u05be\3\2"+
		"\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c2\3\2\2\2\u05c1\u05c3\5\u01d4\u00eb"+
		"\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5"+
		"\5\u010a\u0086\2\u05c5\u0107\3\2\2\2\u05c6\u05c7\5\u01da\u00ee\2\u05c7"+
		"\u0109\3\2\2\2\u05c8\u05ca\7k\2\2\u05c9\u05cb\5\u008cG\2\u05ca\u05c9\3"+
		"\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\7n\2\2\u05cd"+
		"\u010b\3\2\2\2\u05ce\u05d0\5\u0164\u00b3\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0"+
		"\3\2\2\2\u05d0\u05d2\3\2\2\2\u05d1\u05d3\5\u0148\u00a5\2\u05d2\u05d1\3"+
		"\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\7-\2\2\u05d5"+
		"\u05d7\5\u010e\u0088\2\u05d6\u05d8\5\u01d4\u00eb\2\u05d7\u05d6\3\2\2\2"+
		"\u05d7\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\5\u0110\u0089\2\u05da"+
		"\u010d\3\2\2\2\u05db\u05dc\5\u01da\u00ee\2\u05dc\u010f\3\2\2\2\u05dd\u05df"+
		"\7k\2\2\u05de\u05e0\5\u0114\u008b\2\u05df\u05de\3\2\2\2\u05df\u05e0\3"+
		"\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\7n\2\2\u05e2\u0111\3\2\2\2\u05e3"+
		"\u05e9\5\u0116\u008c\2\u05e4\u05e9\5\u0118\u008d\2\u05e5\u05e9\5\u011a"+
		"\u008e\2\u05e6\u05e9\5\u011c\u008f\2\u05e7\u05e9\5\u011e\u0090\2\u05e8"+
		"\u05e3\3\2\2\2\u05e8\u05e4\3\2\2\2\u05e8\u05e5\3\2\2\2\u05e8\u05e6\3\2"+
		"\2\2\u05e8\u05e7\3\2\2\2\u05e9\u0113\3\2\2\2\u05ea\u05ec\5\u0112\u008a"+
		"\2\u05eb\u05ed\5\u0114\u008b\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2"+
		"\u05ed\u0115\3\2\2\2\u05ee\u05ef\5\u00a4S\2\u05ef\u05f0\5\u00a6T\2\u05f0"+
		"\u05f1\5\u01be\u00e0\2\u05f1\u05f2\5\u00b0Y\2\u05f2\u0117\3\2\2\2\u05f3"+
		"\u05f4\5\u00c6d\2\u05f4\u05f6\5\u00c8e\2\u05f5\u05f7\5t;\2\u05f6\u05f5"+
		"\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9\5\u00caf"+
		"\2\u05f9\u0119\3\2\2\2\u05fa\u05fc\5\u0122\u0092\2\u05fb\u05fd\5t;\2\u05fc"+
		"\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0600\5\u00d2"+
		"j\2\u05ff\u0601\7\63\2\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601"+
		"\u060a\3\2\2\2\u0602\u0604\5\u0122\u0092\2\u0603\u0605\5t;\2\u0604\u0603"+
		"\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\5\u00d2j"+
		"\2\u0607\u0608\7\64\2\2\u0608\u060a\3\2\2\2\u0609\u05fa\3\2\2\2\u0609"+
		"\u0602\3\2\2\2\u060a\u011b\3\2\2\2\u060b\u060c\5\u012e\u0098\2\u060c\u060d"+
		"\5\u0130\u0099\2\u060d\u060e\5\u00b0Y\2\u060e\u011d\3\2\2\2\u060f\u0611"+
		"\5\u0164\u00b3\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0613\3"+
		"\2\2\2\u0612\u0614\5\u0148\u00a5\2\u0613\u0612\3\2\2\2\u0613\u0614\3\2"+
		"\2\2\u0614\u0615\3\2\2\2\u0615\u0616\7\67\2\2\u0616\u0618\5\u00c0a\2\u0617"+
		"\u0619\5\u01d4\u00eb\2\u0618\u0617\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061b"+
		"\3\2\2\2\u061a\u061c\5\u00c2b\2\u061b\u061a\3\2\2\2\u061b\u061c\3\2\2"+
		"\2\u061c\u011f\3\2\2\2\u061d\u061f\5\u0122\u0092\2\u061e\u0620\5t;\2\u061f"+
		"\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0623\5\u00d2"+
		"j\2\u0622\u0624\7\63\2\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624"+
		"\u0625\3\2\2\2\u0625\u0626\5\u0124\u0093\2\u0626\u0630\3\2\2\2\u0627\u0629"+
		"\5\u0122\u0092\2\u0628\u062a\5t;\2\u0629\u0628\3\2\2\2\u0629\u062a\3\2"+
		"\2\2\u062a\u062b\3\2\2\2\u062b\u062c\5\u00d2j\2\u062c\u062d\7\64\2\2\u062d"+
		"\u062e\5\u0124\u0093\2\u062e\u0630\3\2\2\2\u062f\u061d\3\2\2\2\u062f\u0627"+
		"\3\2\2\2\u0630\u0121\3\2\2\2\u0631\u0633\5\u0164\u00b3\2\u0632\u0631\3"+
		"\2\2\2\u0632\u0633\3\2\2\2\u0633\u0635\3\2\2\2\u0634\u0636\5\u0146\u00a4"+
		"\2\u0635\u0634\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0649"+
		"\78\2\2\u0638\u063a\5\u0164\u00b3\2\u0639\u0638\3\2\2\2\u0639\u063a\3"+
		"\2\2\2\u063a\u063c\3\2\2\2\u063b\u063d\5\u0146\u00a4\2\u063c\u063b\3\2"+
		"\2\2\u063c\u063d\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u063f\78\2\2\u063f"+
		"\u0649\7x\2\2\u0640\u0642\5\u0164\u00b3\2\u0641\u0640\3\2\2\2\u0641\u0642"+
		"\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u0645\5\u0146\u00a4\2\u0644\u0643\3"+
		"\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647\78\2\2\u0647"+
		"\u0649\7w\2\2\u0648\u0632\3\2\2\2\u0648\u0639\3\2\2\2\u0648\u0641\3\2"+
		"\2\2\u0649\u0123\3\2\2\2\u064a\u064b\5\u0090I\2\u064b\u0125\3\2\2\2\u064c"+
		"\u064e\5\u0164\u00b3\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f"+
		"\3\2\2\2\u064f\u0650\79\2\2\u0650\u0651\5\u0090I\2\u0651\u0127\3\2\2\2"+
		"\u0652\u0654\5\u0148\u00a5\2\u0653\u0652\3\2\2\2\u0653\u0654\3\2\2\2\u0654"+
		"\u0655\3\2\2\2\u0655\u0656\7:\2\2\u0656\u0658\5\u01c0\u00e1\2\u0657\u0659"+
		"\5\u01d4\u00eb\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065a\3"+
		"\2\2\2\u065a\u065b\5\u012a\u0096\2\u065b\u0129\3\2\2\2\u065c\u065e\7k"+
		"\2\2\u065d\u065f\5\u008cG\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0660\3\2\2\2\u0660\u0661\7n\2\2\u0661\u012b\3\2\2\2\u0662\u0663\5\u012e"+
		"\u0098\2\u0663\u0664\5\u0130\u0099\2\u0664\u0665\5\u0090I\2\u0665\u066f"+
		"\3\2\2\2\u0666\u0667\5\u012e\u0098\2\u0667\u0668\5\u0130\u0099\2\u0668"+
		"\u0669\5\u00a8U\2\u0669\u066f\3\2\2\2\u066a\u066b\5\u012e\u0098\2\u066b"+
		"\u066c\5\u0130\u0099\2\u066c\u066d\5\u00b0Y\2\u066d\u066f\3\2\2\2\u066e"+
		"\u0662\3\2\2\2\u066e\u0666\3\2\2\2\u066e\u066a\3\2\2\2\u066f\u012d\3\2"+
		"\2\2\u0670\u0672\5\u0164\u00b3\2\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2"+
		"\2\u0672\u0674\3\2\2\2\u0673\u0675\5\u0146\u00a4\2\u0674\u0673\3\2\2\2"+
		"\u0674\u0675\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0677\7;\2\2\u0677\u0678"+
		"\5\u00d2j\2\u0678\u012f\3\2\2\2\u0679\u067b\5\u01e8\u00f5\2\u067a\u067c"+
		"\5\u0164\u00b3\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d\3"+
		"\2\2\2\u067d\u067e\5\u01b8\u00dd\2\u067e\u0131\3\2\2\2\u067f\u0683\5\u0134"+
		"\u009b\2\u0680\u0683\5\u0136\u009c\2\u0681\u0683\5\u0138\u009d\2\u0682"+
		"\u067f\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0681\3\2\2\2\u0683\u0133\3\2"+
		"\2\2\u0684\u0685\7<\2\2\u0685\u0686\7=\2\2\u0686\u0687\5\u01f4\u00fb\2"+
		"\u0687\u0688\7k\2\2\u0688\u0689\7n\2\2\u0689\u0135\3\2\2\2\u068a\u068b"+
		"\7>\2\2\u068b\u068c\7=\2\2\u068c\u068d\5\u01f4\u00fb\2\u068d\u068e\7k"+
		"\2\2\u068e\u068f\7n\2\2\u068f\u0137\3\2\2\2\u0690\u0691\7?\2\2\u0691\u0692"+
		"\7=\2\2\u0692\u0693\5\u01f4\u00fb\2\u0693\u0694\7k\2\2\u0694\u0695\5\u013a"+
		"\u009e\2\u0695\u0696\7n\2\2\u0696\u0139\3\2\2\2\u0697\u0699\5\u013c\u009f"+
		"\2\u0698\u0697\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069b\3\2\2\2\u069a\u069c"+
		"\5\u0140\u00a1\2\u069b\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u013b\3"+
		"\2\2\2\u069d\u069e\7@\2\2\u069e\u069f\5\u013e\u00a0\2\u069f\u013d\3\2"+
		"\2\2\u06a0\u06a1\5\u0206\u0104\2\u06a1\u013f\3\2\2\2\u06a2\u06a3\7A\2"+
		"\2\u06a3\u06a4\5\u0142\u00a2\2\u06a4\u0141\3\2\2\2\u06a5\u06a6\t\6\2\2"+
		"\u06a6\u0143\3\2\2\2\u06a7\u06c1\7+\2\2\u06a8\u06c1\7E\2\2\u06a9\u06c1"+
		"\7F\2\2\u06aa\u06c1\7G\2\2\u06ab\u06c1\7?\2\2\u06ac\u06c1\7H\2\2\u06ad"+
		"\u06c1\7I\2\2\u06ae\u06c1\7J\2\2\u06af\u06c1\7K\2\2\u06b0\u06c1\7L\2\2"+
		"\u06b1\u06c1\7>\2\2\u06b2\u06c1\7<\2\2\u06b3\u06c1\7M\2\2\u06b4\u06c1"+
		"\7N\2\2\u06b5\u06c1\7O\2\2\u06b6\u06b7\7O\2\2\u06b7\u06b8\7l\2\2\u06b8"+
		"\u06b9\7P\2\2\u06b9\u06c1\7o\2\2\u06ba\u06bb\7O\2\2\u06bb\u06bc\7l\2\2"+
		"\u06bc\u06bd\7Q\2\2\u06bd\u06c1\7o\2\2\u06be\u06c1\7R\2\2\u06bf\u06c1"+
		"\5\u0148\u00a5\2\u06c0\u06a7\3\2\2\2\u06c0\u06a8\3\2\2\2\u06c0\u06a9\3"+
		"\2\2\2\u06c0\u06aa\3\2\2\2\u06c0\u06ab\3\2\2\2\u06c0\u06ac\3\2\2\2\u06c0"+
		"\u06ad\3\2\2\2\u06c0\u06ae\3\2\2\2\u06c0\u06af\3\2\2\2\u06c0\u06b0\3\2"+
		"\2\2\u06c0\u06b1\3\2\2\2\u06c0\u06b2\3\2\2\2\u06c0\u06b3\3\2\2\2\u06c0"+
		"\u06b4\3\2\2\2\u06c0\u06b5\3\2\2\2\u06c0\u06b6\3\2\2\2\u06c0\u06ba\3\2"+
		"\2\2\u06c0\u06be\3\2\2\2\u06c0\u06bf\3\2\2\2\u06c1\u0145\3\2\2\2\u06c2"+
		"\u06c4\5\u0144\u00a3\2\u06c3\u06c5\5\u0146\u00a4\2\u06c4\u06c3\3\2\2\2"+
		"\u06c4\u06c5\3\2\2\2\u06c5\u0147\3\2\2\2\u06c6\u06d6\7S\2\2\u06c7\u06c8"+
		"\7S\2\2\u06c8\u06c9\7l\2\2\u06c9\u06ca\7\60\2\2\u06ca\u06d6\7o\2\2\u06cb"+
		"\u06d6\7T\2\2\u06cc\u06cd\7T\2\2\u06cd\u06ce\7l\2\2\u06ce\u06cf\7\60\2"+
		"\2\u06cf\u06d6\7o\2\2\u06d0\u06d6\7U\2\2\u06d1\u06d2\7U\2\2\u06d2\u06d3"+
		"\7l\2\2\u06d3\u06d4\7\60\2\2\u06d4\u06d6\7o\2\2\u06d5\u06c6\3\2\2\2\u06d5"+
		"\u06c7\3\2\2\2\u06d5\u06cb\3\2\2\2\u06d5\u06cc\3\2\2\2\u06d5\u06d0\3\2"+
		"\2\2\u06d5\u06d1\3\2\2\2\u06d6\u0149\3\2\2\2\u06d7\u06d8\b\u00a6\1\2\u06d8"+
		"\u06da\5\u014c\u00a7\2\u06d9\u06db\5\u01be\u00e0\2\u06da\u06d9\3\2\2\2"+
		"\u06da\u06db\3\2\2\2\u06db\u06eb\3\2\2\2\u06dc\u06de\5\u014e\u00a8\2\u06dd"+
		"\u06df\5\u01be\u00e0\2\u06de\u06dd\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06eb"+
		"\3\2\2\2\u06e0\u06eb\5\u0150\u00a9\2\u06e1\u06e3\5\u0152\u00aa\2\u06e2"+
		"\u06e4\5\u01be\u00e0\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06eb"+
		"\3\2\2\2\u06e5\u06eb\5\u0158\u00ad\2\u06e6\u06eb\5\u015a\u00ae\2\u06e7"+
		"\u06e8\7V\2\2\u06e8\u06eb\5\u01b8\u00dd\2\u06e9\u06eb\5\u015c\u00af\2"+
		"\u06ea\u06d7\3\2\2\2\u06ea\u06dc\3\2\2\2\u06ea\u06e0\3\2\2\2\u06ea\u06e1"+
		"\3\2\2\2\u06ea\u06e5\3\2\2\2\u06ea\u06e6\3\2\2\2\u06ea\u06e7\3\2\2\2\u06ea"+
		"\u06e9\3\2\2\2\u06eb\u06f1\3\2\2\2\u06ec\u06ed\f\4\2\2\u06ed\u06ee\7W"+
		"\2\2\u06ee\u06f0\5\u01b8\u00dd\2\u06ef\u06ec\3\2\2\2\u06f0\u06f3\3\2\2"+
		"\2\u06f1\u06ef\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u014b\3\2\2\2\u06f3\u06f1"+
		"\3\2\2\2\u06f4\u06f5\7v\2\2\u06f5\u014d\3\2\2\2\u06f6\u06f7\5\u01da\u00ee"+
		"\2\u06f7\u014f\3\2\2\2\u06f8\u06f9\7\b\2\2\u06f9\u06fd\5\u014a\u00a6\2"+
		"\u06fa\u06fb\7\7\2\2\u06fb\u06fd\5\u014a\u00a6\2\u06fc\u06f8\3\2\2\2\u06fc"+
		"\u06fa\3\2\2\2\u06fd\u0151\3\2\2\2\u06fe\u0700\7l\2\2\u06ff\u0701\5\u0154"+
		"\u00ab\2\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702\3\2\2\2\u0702"+
		"\u0703\7o\2\2\u0703\u0153\3\2\2\2\u0704\u0709\5\u0156\u00ac\2\u0705\u0706"+
		"\7q\2\2\u0706\u0708\5\u0156\u00ac\2\u0707\u0705\3\2\2\2\u0708\u070b\3"+
		"\2\2\2\u0709\u0707\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u0155\3\2\2\2\u070b"+
		"\u0709\3\2\2\2\u070c\u070d\5\u014a\u00a6\2\u070d\u0157\3\2\2\2\u070e\u0710"+
		"\5\u01c0\u00e1\2\u070f\u070e\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0711\3"+
		"\2\2\2\u0711\u0712\7j\2\2\u0712\u0714\5\u00eex\2\u0713\u0715\5\u0152\u00aa"+
		"\2\u0714\u0713\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0159\3\2\2\2\u0716\u0717"+
		"\5\u014e\u00a8\2\u0717\u0718\7x\2\2\u0718\u015b\3\2\2\2\u0719\u071a\5"+
		"\u016a\u00b6\2\u071a\u015d\3\2\2\2\u071b\u071d\7y\2\2\u071c\u071b\3\2"+
		"\2\2\u071c\u071d\3\2\2\2\u071d\u071e\3\2\2\2\u071e\u0720\5\u0160\u00b1"+
		"\2\u071f\u0721\5\u0162\u00b2\2\u0720\u071f\3\2\2\2\u0720\u0721\3\2\2\2"+
		"\u0721\u015f\3\2\2\2\u0722\u0723\5\u01da\u00ee\2\u0723\u0161\3\2\2\2\u0724"+
		"\u0726\7l\2\2\u0725\u0727\5\u0166\u00b4\2\u0726\u0725\3\2\2\2\u0726\u0727"+
		"\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u0729\7o\2\2\u0729\u0163\3\2\2\2\u072a"+
		"\u072c\5\u015e\u00b0\2\u072b\u072a\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072b"+
		"\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u0165\3\2\2\2\u072f\u0731\5\u0168\u00b5"+
		"\2\u0730\u072f\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0730\3\2\2\2\u0732\u0733"+
		"\3\2\2\2\u0733\u0167\3\2\2\2\u0734\u0736\7l\2\2\u0735\u0737\5\u0166\u00b4"+
		"\2\u0736\u0735\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u0749"+
		"\7o\2\2\u0739\u073b\7m\2\2\u073a\u073c\5\u0166\u00b4\2\u073b\u073a\3\2"+
		"\2\2\u073b\u073c\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u0749\7p\2\2\u073e"+
		"\u0740\7k\2\2\u073f\u0741\5\u0166\u00b4\2\u0740\u073f\3\2\2\2\u0740\u0741"+
		"\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0749\7n\2\2\u0743\u0749\5\u01da\u00ee"+
		"\2\u0744\u0749\5\u016a\u00b6\2\u0745\u0749\5\u01de\u00f0\2\u0746\u0749"+
		"\5\u01fe\u0100\2\u0747\u0749\5\u01f4\u00fb\2\u0748\u0734\3\2\2\2\u0748"+
		"\u0739\3\2\2\2\u0748\u073e\3\2\2\2\u0748\u0743\3\2\2\2\u0748\u0744\3\2"+
		"\2\2\u0748\u0745\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0747\3\2\2\2\u0749"+
		"\u0169\3\2\2\2\u074a\u074c\5\u0172\u00ba\2\u074b\u074a\3\2\2\2\u074b\u074c"+
		"\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074f\5\u016e\u00b8\2\u074e\u0750\5"+
		"\u0176\u00bc\2\u074f\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u016b\3\2"+
		"\2\2\u0751\u0756\5\u016a\u00b6\2\u0752\u0753\7q\2\2\u0753\u0755\5\u016a"+
		"\u00b6\2\u0754\u0752\3\2\2\2\u0755\u0758\3\2\2\2\u0756\u0754\3\2\2\2\u0756"+
		"\u0757\3\2\2\2\u0757\u016d\3\2\2\2\u0758\u0756\3\2\2\2\u0759\u075a\5\u01f0"+
		"\u00f9\2\u075a\u075b\5\u01b0\u00d9\2\u075b\u075f\3\2\2\2\u075c\u075f\5"+
		"\u01b0\u00d9\2\u075d\u075f\5\u0170\u00b9\2\u075e\u0759\3\2\2\2\u075e\u075c"+
		"\3\2\2\2\u075e\u075d\3\2\2\2\u075f\u016f\3\2\2\2\u0760\u0761\7z\2\2\u0761"+
		"\u0762\5\u01da\u00ee\2\u0762\u0171\3\2\2\2\u0763\u0769\7X\2\2\u0764\u0765"+
		"\7X\2\2\u0765\u0769\7x\2\2\u0766\u0767\7X\2\2\u0767\u0769\7w\2\2\u0768"+
		"\u0763\3\2\2\2\u0768\u0764\3\2\2\2\u0768\u0766\3\2\2\2\u0769\u0173\3\2"+
		"\2\2\u076a\u076b\5\u01ee\u00f8\2\u076b\u076c\5\u016e\u00b8\2\u076c\u0775"+
		"\3\2\2\2\u076d\u076f\5\u0178\u00bd\2\u076e\u0770\5\u0172\u00ba\2\u076f"+
		"\u076e\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0772\5\u016e"+
		"\u00b8\2\u0772\u0775\3\2\2\2\u0773\u0775\5\u017a\u00be\2\u0774\u076a\3"+
		"\2\2\2\u0774\u076d\3\2\2\2\u0774\u0773\3\2\2\2\u0775\u0175\3\2\2\2\u0776"+
		"\u0778\5\u0174\u00bb\2\u0777\u0776\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u0777"+
		"\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u0177\3\2\2\2\u077b\u077d\7x\2\2\u077c"+
		"\u077e\5\u0172\u00ba\2\u077d\u077c\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u077f"+
		"\3\2\2\2\u077f\u0780\5\u016a\u00b6\2\u0780\u0781\7r\2\2\u0781\u0179\3"+
		"\2\2\2\u0782\u0783\7V\2\2\u0783\u078d\5\u01b8\u00dd\2\u0784\u0785\7W\2"+
		"\2\u0785\u078d\5\u01b8\u00dd\2\u0786\u0787\7W\2\2\u0787\u0788\7x\2\2\u0788"+
		"\u078d\5\u01b8\u00dd\2\u0789\u078a\7W\2\2\u078a\u078b\7w\2\2\u078b\u078d"+
		"\5\u01b8\u00dd\2\u078c\u0782\3\2\2\2\u078c\u0784\3\2\2\2\u078c\u0786\3"+
		"\2\2\2\u078c\u0789\3\2\2\2\u078d\u017b\3\2\2\2\u078e\u0790\5\u01da\u00ee"+
		"\2\u078f\u0791\5\u0084C\2\u0790\u078f\3\2\2\2\u0790\u0791\3\2\2\2\u0791"+
		"\u079b\3\2\2\2\u0792\u079b\5\u0180\u00c1\2\u0793\u079b\5\u0190\u00c9\2"+
		"\u0794\u079b\5\u0192\u00ca\2\u0795\u079b\5\u019a\u00ce\2\u0796\u079b\5"+
		"\u01a6\u00d4\2\u0797\u079b\5\u017e\u00c0\2\u0798\u079b\5\u01ac\u00d7\2"+
		"\u0799\u079b\5\u01ae\u00d8\2\u079a\u078e\3\2\2\2\u079a\u0792\3\2\2\2\u079a"+
		"\u0793\3\2\2\2\u079a\u0794\3\2\2\2\u079a\u0795\3\2\2\2\u079a\u0796\3\2"+
		"\2\2\u079a\u0797\3\2\2\2\u079a\u0798\3\2\2\2\u079a\u0799\3\2\2\2\u079b"+
		"\u017d\3\2\2\2\u079c\u079d\7j\2\2\u079d\u079e\5\u01da\u00ee\2\u079e\u017f"+
		"\3\2\2\2\u079f\u07a7\5\u01fe\u0100\2\u07a0\u07a7\5\u0182\u00c2\2\u07a1"+
		"\u07a7\5\u0188\u00c5\2\u07a2\u07a7\7Y\2\2\u07a3\u07a7\7Z\2\2\u07a4\u07a7"+
		"\7[\2\2\u07a5\u07a7\7\\\2\2\u07a6\u079f\3\2\2\2\u07a6\u07a0\3\2\2\2\u07a6"+
		"\u07a1\3\2\2\2\u07a6\u07a2\3\2\2\2\u07a6\u07a3\3\2\2\2\u07a6\u07a4\3\2"+
		"\2\2\u07a6\u07a5\3\2\2\2\u07a7\u0181\3\2\2\2\u07a8\u07aa\7m\2\2\u07a9"+
		"\u07ab\5\u0184\u00c3\2\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ac"+
		"\3\2\2\2\u07ac\u07ad\7p\2\2\u07ad\u0183\3\2\2\2\u07ae\u07b3\5\u0186\u00c4"+
		"\2\u07af\u07b0\7q\2\2\u07b0\u07b2\5\u0186\u00c4\2\u07b1\u07af\3\2\2\2"+
		"\u07b2\u07b5\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b7"+
		"\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b6\u07b8\7q\2\2\u07b7\u07b6\3\2\2\2\u07b7"+
		"\u07b8\3\2\2\2\u07b8\u0185\3\2\2\2\u07b9\u07ba\5\u016a\u00b6\2\u07ba\u0187"+
		"\3\2\2\2\u07bb\u07bc\7m\2\2\u07bc\u07bd\5\u018a\u00c6\2\u07bd\u07be\7"+
		"p\2\2\u07be\u07c1\3\2\2\2\u07bf\u07c1\5\u018e\u00c8\2\u07c0\u07bb\3\2"+
		"\2\2\u07c0\u07bf\3\2\2\2\u07c1\u0189\3\2\2\2\u07c2\u07c7\5\u018c\u00c7"+
		"\2\u07c3\u07c4\7q\2\2\u07c4\u07c6\5\u018c\u00c7\2\u07c5\u07c3\3\2\2\2"+
		"\u07c6\u07c9\3\2\2\2\u07c7\u07c5\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07cb"+
		"\3\2\2\2\u07c9\u07c7\3\2\2\2\u07ca\u07cc\7q\2\2\u07cb\u07ca\3\2\2\2\u07cb"+
		"\u07cc\3\2\2\2\u07cc\u018b\3\2\2\2\u07cd\u07ce\5\u016a\u00b6\2\u07ce\u07cf"+
		"\7r\2\2\u07cf\u07d0\5\u016a\u00b6\2\u07d0\u018d\3\2\2\2\u07d1\u07d2\7"+
		"m\2\2\u07d2\u07d3\7r\2\2\u07d3\u07d4\7p\2\2\u07d4\u018f\3\2\2\2\u07d5"+
		"\u07e2\7]\2\2\u07d6\u07d7\7]\2\2\u07d7\u07d8\7j\2\2\u07d8\u07e2\5\u01da"+
		"\u00ee\2\u07d9\u07da\7]\2\2\u07da\u07db\7m\2\2\u07db\u07dc\5\u016c\u00b7"+
		"\2\u07dc\u07dd\7p\2\2\u07dd\u07e2\3\2\2\2\u07de\u07df\7]\2\2\u07df\u07e0"+
		"\7j\2\2\u07e0\u07e2\78\2\2\u07e1\u07d5\3\2\2\2\u07e1\u07d6\3\2\2\2\u07e1"+
		"\u07d9\3\2\2\2\u07e1\u07de\3\2\2\2\u07e2\u0191\3\2\2\2\u07e3\u07e7\5\u0194"+
		"\u00cb\2\u07e4\u07e7\5\u0196\u00cc\2\u07e5\u07e7\5\u0198\u00cd\2\u07e6"+
		"\u07e3\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e5\3\2\2\2\u07e7\u0193\3\2"+
		"\2\2\u07e8\u07e9\7^\2\2\u07e9\u07ea\7j\2\2\u07ea\u07eb\5\u01da\u00ee\2"+
		"\u07eb\u0195\3\2\2\2\u07ec\u07ed\7^\2\2\u07ed\u07ee\7m\2\2\u07ee\u07ef"+
		"\5\u016a\u00b6\2\u07ef\u07f0\7p\2\2\u07f0\u0197\3\2\2\2\u07f1\u07f2\7"+
		"^\2\2\u07f2\u07f3\7j\2\2\u07f3\u07f4\78\2\2\u07f4\u0199\3\2\2\2\u07f5"+
		"\u07f7\7k\2\2\u07f6\u07f8\5\u019c\u00cf\2\u07f7\u07f6\3\2\2\2\u07f7\u07f8"+
		"\3\2\2\2\u07f8\u07fa\3\2\2\2\u07f9\u07fb\5\6\4\2\u07fa\u07f9\3\2\2\2\u07fa"+
		"\u07fb\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fd\7n\2\2\u07fd\u019b\3\2"+
		"\2\2\u07fe\u0800\5\u00d2j\2\u07ff\u0801\5\u00ccg\2\u0800\u07ff\3\2\2\2"+
		"\u0800\u0801\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0803\7\5\2\2\u0803\u081c"+
		"\3\2\2\2\u0804\u0806\5\u01dc\u00ef\2\u0805\u0807\5\u00ccg\2\u0806\u0805"+
		"\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0809\7\5\2\2\u0809"+
		"\u081c\3\2\2\2\u080a\u080b\5\u019e\u00d0\2\u080b\u080d\5\u00d2j\2\u080c"+
		"\u080e\5\u00ccg\2\u080d\u080c\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u080f"+
		"\3\2\2\2\u080f\u0810\7\5\2\2\u0810\u081c\3\2\2\2\u0811\u0812\5\u019e\u00d0"+
		"\2\u0812\u0814\5\u01dc\u00ef\2\u0813\u0815\5\u00ccg\2\u0814\u0813\3\2"+
		"\2\2\u0814\u0815\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0817\7\5\2\2\u0817"+
		"\u081c\3\2\2\2\u0818\u0819\5\u019e\u00d0\2\u0819\u081a\7\5\2\2\u081a\u081c"+
		"\3\2\2\2\u081b\u07fe\3\2\2\2\u081b\u0804\3\2\2\2\u081b\u080a\3\2\2\2\u081b"+
		"\u0811\3\2\2\2\u081b\u0818\3\2\2\2\u081c\u019d\3\2\2\2\u081d\u081e\7m"+
		"\2\2\u081e\u081f\5\u01a0\u00d1\2\u081f\u0820\7p\2\2\u0820\u019f\3\2\2"+
		"\2\u0821\u0826\5\u01a2\u00d2\2\u0822\u0823\7q\2\2\u0823\u0825\5\u01a2"+
		"\u00d2\2\u0824\u0822\3\2\2\2\u0825\u0828\3\2\2\2\u0826\u0824\3\2\2\2\u0826"+
		"\u0827\3\2\2\2\u0827\u01a1\3\2\2\2\u0828\u0826\3\2\2\2\u0829\u082b\5\u01a4"+
		"\u00d3\2\u082a\u0829\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082c\3\2\2\2\u082c"+
		"\u082d\5\u016a\u00b6\2\u082d\u01a3\3\2\2\2\u082e\u082f\t\7\2\2\u082f\u01a5"+
		"\3\2\2\2\u0830\u0832\7l\2\2\u0831\u0833\5\u01a8\u00d5\2\u0832\u0831\3"+
		"\2\2\2\u0832\u0833\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835\7o\2\2\u0835"+
		"\u01a7\3\2\2\2\u0836\u083b\5\u01aa\u00d6\2\u0837\u0838\7q\2\2\u0838\u083a"+
		"\5\u01aa\u00d6\2\u0839\u0837\3\2\2\2\u083a\u083d\3\2\2\2\u083b\u0839\3"+
		"\2\2\2\u083b\u083c\3\2\2\2\u083c\u01a9\3\2\2\2\u083d\u083b\3\2\2\2\u083e"+
		"\u0844\5\u016a\u00b6\2\u083f\u0840\5\u01da\u00ee\2\u0840\u0841\7r\2\2"+
		"\u0841\u0842\5\u016a\u00b6\2\u0842\u0844\3\2\2\2\u0843\u083e\3\2\2\2\u0843"+
		"\u083f\3\2\2\2\u0844\u01ab\3\2\2\2\u0845\u0846\7v\2\2\u0846\u01ad\3\2"+
		"\2\2\u0847\u0848\7a\2\2\u0848\u0849\7l\2\2\u0849\u084a\5\u016a\u00b6\2"+
		"\u084a\u084b\7o\2\2\u084b\u01af\3\2\2\2\u084c\u084d\b\u00d9\1\2\u084d"+
		"\u084e\5\u017c\u00bf\2\u084e\u087f\3\2\2\2\u084f\u0850\f\r\2\2\u0850\u087e"+
		"\5\u01f2\u00fa\2\u0851\u0852\f\f\2\2\u0852\u087e\5\u01a6\u00d4\2\u0853"+
		"\u0855\f\13\2\2\u0854\u0856\5\u01a6\u00d4\2\u0855\u0854\3\2\2\2\u0855"+
		"\u0856\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u087e\5\u01b6\u00dc\2\u0858\u0859"+
		"\f\n\2\2\u0859\u085a\7j\2\2\u085a\u087e\78\2\2\u085b\u085c\f\t\2\2\u085c"+
		"\u085d\7j\2\2\u085d\u085e\78\2\2\u085e\u085f\7l\2\2\u085f\u0860\5\u01b2"+
		"\u00da\2\u0860\u0861\7o\2\2\u0861\u087e\3\2\2\2\u0862\u0863\f\b\2\2\u0863"+
		"\u0864\7j\2\2\u0864\u087e\7\u008a\2\2\u0865\u0866\f\7\2\2\u0866\u0867"+
		"\7j\2\2\u0867\u0869\5\u01da\u00ee\2\u0868\u086a\5\u0084C\2\u0869\u0868"+
		"\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u087e\3\2\2\2\u086b\u086c\f\6\2\2\u086c"+
		"\u086d\7j\2\2\u086d\u086e\5\u01da\u00ee\2\u086e\u086f\7l\2\2\u086f\u0870"+
		"\5\u01b2\u00da\2\u0870\u0871\7o\2\2\u0871\u087e\3\2\2\2\u0872\u0873\f"+
		"\5\2\2\u0873\u0874\7j\2\2\u0874\u087e\7]\2\2\u0875\u0876\f\4\2\2\u0876"+
		"\u0877\7j\2\2\u0877\u087e\7b\2\2\u0878\u0879\f\3\2\2\u0879\u087a\7m\2"+
		"\2\u087a\u087b\5\u016c\u00b7\2\u087b\u087c\7p\2\2\u087c\u087e\3\2\2\2"+
		"\u087d\u084f\3\2\2\2\u087d\u0851\3\2\2\2\u087d\u0853\3\2\2\2\u087d\u0858"+
		"\3\2\2\2\u087d\u085b\3\2\2\2\u087d\u0862\3\2\2\2\u087d\u0865\3\2\2\2\u087d"+
		"\u086b\3\2\2\2\u087d\u0872\3\2\2\2\u087d\u0875\3\2\2\2\u087d\u0878\3\2"+
		"\2\2\u087e\u0881\3\2\2\2\u087f\u087d\3\2\2\2\u087f\u0880\3\2\2\2\u0880"+
		"\u01b1\3\2\2\2\u0881\u087f\3\2\2\2\u0882\u0884\5\u01b4\u00db\2\u0883\u0885"+
		"\5\u01b2\u00da\2\u0884\u0883\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u01b3\3"+
		"\2\2\2\u0886\u0887\5\u01da\u00ee\2\u0887\u0888\7r\2\2\u0888\u01b5\3\2"+
		"\2\2\u0889\u088a\5\u019a\u00ce\2\u088a\u01b7\3\2\2\2\u088b\u088c\b\u00dd"+
		"\1\2\u088c\u0892\5\u01ba\u00de\2\u088d\u0892\5\u01bc\u00df\2\u088e\u0892"+
		"\5\u01c0\u00e1\2\u088f\u0892\5\u01c4\u00e3\2\u0890\u0892\5\u01ce\u00e8"+
		"\2\u0891\u088b\3\2\2\2\u0891\u088d\3\2\2\2\u0891\u088e\3\2\2\2\u0891\u088f"+
		"\3\2\2\2\u0891\u0890\3\2\2\2\u0892\u08ab\3\2\2\2\u0893\u0895\f\13\2\2"+
		"\u0894\u0896\7\63\2\2\u0895\u0894\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0897"+
		"\3\2\2\2\u0897\u0898\5\u01e8\u00f5\2\u0898\u0899\5\u01b8\u00dd\f\u0899"+
		"\u08aa\3\2\2\2\u089a\u089b\f\n\2\2\u089b\u089c\7\64\2\2\u089c\u089d\5"+
		"\u01e8\u00f5\2\u089d\u089e\5\u01b8\u00dd\13\u089e\u08aa\3\2\2\2\u089f"+
		"\u08a0\f\7\2\2\u08a0\u08aa\7x\2\2\u08a1\u08a2\f\6\2\2\u08a2\u08aa\7w\2"+
		"\2\u08a3\u08a4\f\4\2\2\u08a4\u08a5\7j\2\2\u08a5\u08aa\7c\2\2\u08a6\u08a7"+
		"\f\3\2\2\u08a7\u08a8\7j\2\2\u08a8\u08aa\7d\2\2\u08a9\u0893\3\2\2\2\u08a9"+
		"\u089a\3\2\2\2\u08a9\u089f\3\2\2\2\u08a9\u08a1\3\2\2\2\u08a9\u08a3\3\2"+
		"\2\2\u08a9\u08a6\3\2\2\2\u08aa\u08ad\3\2\2\2\u08ab\u08a9\3\2\2\2\u08ab"+
		"\u08ac\3\2\2\2\u08ac\u01b9\3\2\2\2\u08ad\u08ab\3\2\2\2\u08ae\u08af\7m"+
		"\2\2\u08af\u08b0\5\u01b8\u00dd\2\u08b0\u08b1\7p\2\2\u08b1\u01bb\3\2\2"+
		"\2\u08b2\u08b3\7m\2\2\u08b3\u08b4\5\u01b8\u00dd\2\u08b4\u08b5\7r\2\2\u08b5"+
		"\u08b6\5\u01b8\u00dd\2\u08b6\u08b7\7p\2\2\u08b7\u01bd\3\2\2\2\u08b8\u08ba"+
		"\7r\2\2\u08b9\u08bb\5\u0164\u00b3\2\u08ba\u08b9\3\2\2\2\u08ba\u08bb\3"+
		"\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08bd\5\u01b8\u00dd\2\u08bd\u01bf\3\2"+
		"\2\2\u08be\u08c0\5\u01c2\u00e2\2\u08bf\u08c1\5\u0084C\2\u08c0\u08bf\3"+
		"\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08ca\3\2\2\2\u08c2\u08c4\5\u01c2\u00e2"+
		"\2\u08c3\u08c5\5\u0084C\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5"+
		"\u08c6\3\2\2\2\u08c6\u08c7\7j\2\2\u08c7\u08c8\5\u01c0\u00e1\2\u08c8\u08ca"+
		"\3\2\2\2\u08c9\u08be\3\2\2\2\u08c9\u08c2\3\2\2\2\u08ca\u01c1\3\2\2\2\u08cb"+
		"\u08cc\5\u01da\u00ee\2\u08cc\u01c3\3\2\2\2\u08cd\u08cf\7l\2\2\u08ce\u08d0"+
		"\5\u01c6\u00e4\2\u08cf\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1\3"+
		"\2\2\2\u08d1\u08d2\7o\2\2\u08d2\u01c5\3\2\2\2\u08d3\u08d5\5\u01c8\u00e5"+
		"\2\u08d4\u08d6\5\u01ea\u00f6\2\u08d5\u08d4\3\2\2\2\u08d5\u08d6\3\2\2\2"+
		"\u08d6\u01c7\3\2\2\2\u08d7\u08dd\5\u01ca\u00e6\2\u08d8\u08d9\5\u01ca\u00e6"+
		"\2\u08d9\u08da\7q\2\2\u08da\u08db\5\u01c8\u00e5\2\u08db\u08dd\3\2\2\2"+
		"\u08dc\u08d7\3\2\2\2\u08dc\u08d8\3\2\2\2\u08dd\u01c9\3\2\2\2\u08de\u08e0"+
		"\5\u0164\u00b3\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e2\3"+
		"\2\2\2\u08e1\u08e3\7\65\2\2\u08e2\u08e1\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3"+
		"\u08e4\3\2\2\2\u08e4\u08ec\5\u01b8\u00dd\2\u08e5\u08e7\7\65\2\2\u08e6"+
		"\u08e5\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08e9\5\u01cc"+
		"\u00e7\2\u08e9\u08ea\5\u01be\u00e0\2\u08ea\u08ec\3\2\2\2\u08eb\u08df\3"+
		"\2\2\2\u08eb\u08e6\3\2\2\2\u08ec\u01cb\3\2\2\2\u08ed\u08ee\5\u01da\u00ee"+
		"\2\u08ee\u01cd\3\2\2\2\u08ef\u08f0\7-\2\2\u08f0\u08f2\7t\2\2\u08f1\u08f3"+
		"\5\u01d0\u00e9\2\u08f2\u08f1\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u08f4\3"+
		"\2\2\2\u08f4\u08f5\7u\2\2\u08f5\u01cf\3\2\2\2\u08f6\u08fe\5\u01d2\u00ea"+
		"\2\u08f7\u08f8\7q\2\2\u08f8\u08fa\5\u01d2\u00ea\2\u08f9\u08f7\3\2\2\2"+
		"\u08fa\u08fb\3\2\2\2\u08fb\u08f9\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fe"+
		"\3\2\2\2\u08fd\u08f6\3\2\2\2\u08fd\u08f9\3\2\2\2\u08fe\u01d1\3\2\2\2\u08ff"+
		"\u0900\5\u01c0\u00e1\2\u0900\u01d3\3\2\2\2\u0901\u0902\7r\2\2\u0902\u0903"+
		"\5\u01d8\u00ed\2\u0903\u0904\7q\2\2\u0904\u0905\5\u01d6\u00ec\2\u0905"+
		"\u090b\3\2\2\2\u0906\u0907\7r\2\2\u0907\u090b\5\u01d8\u00ed\2\u0908\u0909"+
		"\7r\2\2\u0909\u090b\5\u01d6\u00ec\2\u090a\u0901\3\2\2\2\u090a\u0906\3"+
		"\2\2\2\u090a\u0908\3\2\2\2\u090b\u01d5\3\2\2\2\u090c\u0912\5\u01c0\u00e1"+
		"\2\u090d\u090e\5\u01c0\u00e1\2\u090e\u090f\7q\2\2\u090f\u0910\5\u01d6"+
		"\u00ec\2\u0910\u0912\3\2\2\2\u0911\u090c\3\2\2\2\u0911\u090d\3\2\2\2\u0912"+
		"\u01d7\3\2\2\2\u0913\u0914\7+\2\2\u0914\u01d9\3\2\2\2\u0915\u0918\7i\2"+
		"\2\u0916\u0918\5\u01de\u00f0\2\u0917\u0915\3\2\2\2\u0917\u0916\3\2\2\2"+
		"\u0918\u01db\3\2\2\2\u0919\u091e\5\u01da\u00ee\2\u091a\u091b\7q\2\2\u091b"+
		"\u091d\5\u01da\u00ee\2\u091c\u091a\3\2\2\2\u091d\u0920\3\2\2\2\u091e\u091c"+
		"\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u01dd\3\2\2\2\u0920\u091e\3\2\2\2\u0921"+
		"\u0922\t\b\2\2\u0922\u01df\3\2\2\2\u0923\u0924\6\u00f1\26\2\u0924\u0925"+
		"\7|\2\2\u0925\u01e1\3\2\2\2\u0926\u0927\6\u00f2\27\2\u0927\u0928\7{\2"+
		"\2\u0928\u01e3\3\2\2\2\u0929\u092a\6\u00f3\30\2\u092a\u092b\7z\2\2\u092b"+
		"\u092c\7z\2\2\u092c\u01e5\3\2\2\2\u092d\u092e\6\u00f4\31\2\u092e\u092f"+
		"\7}\2\2\u092f\u0930\7}\2\2\u0930\u01e7\3\2\2\2\u0931\u0932\6\u00f5\32"+
		"\2\u0932\u0933\7{\2\2\u0933\u0934\7u\2\2\u0934\u01e9\3\2\2\2\u0935\u0936"+
		"\6\u00f6\33\2\u0936\u0937\7j\2\2\u0937\u0938\7j\2\2\u0938\u0939\7j\2\2"+
		"\u0939\u01eb\3\2\2\2\u093a\u093b\6\u00f7\34\2\u093b\u093c\7|\2\2\u093c"+
		"\u093d\7|\2\2\u093d\u01ed\3\2\2\2\u093e\u093f\6\u00f8\35\2\u093f\u0940"+
		"\5\u01f4\u00fb\2\u0940\u01ef\3\2\2\2\u0941\u0942\6\u00f9\36\2\u0942\u0943"+
		"\5\u01f4\u00fb\2\u0943\u01f1\3\2\2\2\u0944\u0945\6\u00fa\37\2\u0945\u0946"+
		"\5\u01f4\u00fb\2\u0946\u01f3\3\2\2\2\u0947\u094c\5\u01f8\u00fd\2\u0948"+
		"\u0949\6\u00fb \2\u0949\u094b\5\u01f6\u00fc\2\u094a\u0948\3\2\2\2\u094b"+
		"\u094e\3\2\2\2\u094c\u094a\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u0958\3\2"+
		"\2\2\u094e\u094c\3\2\2\2\u094f\u0954\5\u01fa\u00fe\2\u0950\u0951\6\u00fb"+
		"!\2\u0951\u0953\5\u01fc\u00ff\2\u0952\u0950\3\2\2\2\u0953\u0956\3\2\2"+
		"\2\u0954\u0952\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0958\3\2\2\2\u0956\u0954"+
		"\3\2\2\2\u0957\u0947\3\2\2\2\u0957\u094f\3\2\2\2\u0958\u01f5\3\2\2\2\u0959"+
		"\u095c\5\u01f8\u00fd\2\u095a\u095c\7\u0085\2\2\u095b\u0959\3\2\2\2\u095b"+
		"\u095a\3\2\2\2\u095c\u01f7\3\2\2\2\u095d\u0960\t\t\2\2\u095e\u0960\7\u0084"+
		"\2\2\u095f\u095d\3\2\2\2\u095f\u095e\3\2\2\2\u0960\u01f9\3\2\2\2\u0961"+
		"\u0962\7j\2\2\u0962\u0963\7j\2\2\u0963\u01fb\3\2\2\2\u0964\u0967\7j\2"+
		"\2\u0965\u0967\5\u01f6\u00fc\2\u0966\u0964\3\2\2\2\u0966\u0965\3\2\2\2"+
		"\u0967\u01fd\3\2\2\2\u0968\u096d\5\u0200\u0101\2\u0969\u096d\5\u0208\u0105"+
		"\2\u096a\u096d\5\u0202\u0102\2\u096b\u096d\5\u0204\u0103\2\u096c\u0968"+
		"\3\2\2\2\u096c\u0969\3\2\2\2\u096c\u096a\3\2\2\2\u096c\u096b\3\2\2\2\u096d"+
		"\u01ff\3\2\2\2\u096e\u0970\5\u01e2\u00f2\2\u096f\u096e\3\2\2\2\u096f\u0970"+
		"\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0977\5\u0206\u0104\2\u0972\u0974\5"+
		"\u01e2\u00f2\2\u0973\u0972\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0975\3\2"+
		"\2\2\u0975\u0977\7\u008c\2\2\u0976\u096f\3\2\2\2\u0976\u0973\3\2\2\2\u0977"+
		"\u0201\3\2\2\2\u0978\u0979\t\n\2\2\u0979\u0203\3\2\2\2\u097a\u097b\7g"+
		"\2\2\u097b\u0205\3\2\2\2\u097c\u097d\t\13\2\2\u097d\u0207\3\2\2\2\u097e"+
		"\u097f\t\f\2\2\u097f\u0209\3\2\2\2\u0123\u020d\u0214\u0218\u021c\u0220"+
		"\u0224\u0228\u022c\u0230\u0233\u0238\u023e\u0242\u0246\u024a\u0250\u0254"+
		"\u0258\u025c\u0260\u0264\u026a\u027c\u0283\u0289\u028f\u0293\u0296\u02a0"+
		"\u02a8\u02af\u02b9\u02bf\u02c5\u02d0\u02d6\u02de\u02e6\u02ea\u02ef\u0302"+
		"\u030e\u0312\u0316\u031c\u0328\u0336\u033a\u033e\u0341\u0347\u034c\u034f"+
		"\u0352\u0358\u035d\u0361\u036d\u0377\u0379\u0386\u0391\u039a\u03a3\u03af"+
		"\u03b9\u03bd\u03c7\u03d6\u03e9\u03ee\u03f1\u03f5\u03fa\u03fe\u0409\u040d"+
		"\u0410\u0413\u041d\u0422\u043d\u0446\u044a\u044d\u0450\u0459\u0462\u0465"+
		"\u046b\u046f\u047a\u0483\u0486\u048b\u0492\u049b\u049e\u04a2\u04a7\u04ab"+
		"\u04b3\u04b6\u04c3\u04c7\u04ca\u04cd\u04d3\u04d7\u04da\u04df\u04e1\u04e5"+
		"\u04ed\u04f5\u04fc\u0500\u0503\u0507\u050a\u050e\u0512\u0515\u0519\u051f"+
		"\u0525\u0529\u052d\u0533\u0536\u053a\u053d\u0540\u0543\u0548\u054b\u054f"+
		"\u0555\u0559\u055c\u055f\u0569\u056d\u0576\u057f\u0583\u0586\u0590\u0594"+
		"\u059c\u059f\u05a2\u05a7\u05aa\u05b2\u05b7\u05ba\u05bf\u05c2\u05ca\u05cf"+
		"\u05d2\u05d7\u05df\u05e8\u05ec\u05f6\u05fc\u0600\u0604\u0609\u0610\u0613"+
		"\u0618\u061b\u061f\u0623\u0629\u062f\u0632\u0635\u0639\u063c\u0641\u0644"+
		"\u0648\u064d\u0653\u0658\u065e\u066e\u0671\u0674\u067b\u0682\u0698\u069b"+
		"\u06c0\u06c4\u06d5\u06da\u06de\u06e3\u06ea\u06f1\u06fc\u0700\u0709\u070f"+
		"\u0714\u071c\u0720\u0726\u072d\u0732\u0736\u073b\u0740\u0748\u074b\u074f"+
		"\u0756\u075e\u0768\u076f\u0774\u0779\u077d\u078c\u0790\u079a\u07a6\u07aa"+
		"\u07b3\u07b7\u07c0\u07c7\u07cb\u07e1\u07e6\u07f7\u07fa\u0800\u0806\u080d"+
		"\u0814\u081b\u0826\u082a\u0832\u083b\u0843\u0855\u0869\u087d\u087f\u0884"+
		"\u0891\u0895\u08a9\u08ab\u08ba\u08c0\u08c4\u08c9\u08cf\u08d5\u08dc\u08df"+
		"\u08e2\u08e6\u08eb\u08f2\u08fb\u08fd\u090a\u0911\u0917\u091e\u094c\u0954"+
		"\u0957\u095b\u095f\u0966\u096c\u096f\u0973\u0976";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}