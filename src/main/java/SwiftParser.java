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
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, Platform=101, 
		Regular_identifier=102, DOT=103, LCURLY=104, LPAREN=105, LBRACK=106, RCURLY=107, 
		RPAREN=108, RBRACK=109, COMMA=110, COLON=111, SEMI=112, LT=113, GT=114, 
		UNDERSCORE=115, BANG=116, QUESTION=117, AT=118, AND=119, SUB=120, EQUAL=121, 
		OR=122, DIV=123, ADD=124, MUL=125, MOD=126, CARET=127, TILDE=128, Operator_head_other=129, 
		Operator_following_character=130, Implicit_parameter_name=131, Binary_literal=132, 
		Octal_literal=133, Decimal_literal=134, Pure_decimal_digits=135, Hexadecimal_literal=136, 
		Floating_point_literal=137, Static_string_literal=138, Interpolated_string_literal=139, 
		WS=140, Block_comment=141, Line_comment=142;
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_semicolon = 3, 
		RULE_loop_statement = 4, RULE_for_statement = 5, RULE_for_init = 6, RULE_for_in_statement = 7, 
		RULE_while_statement = 8, RULE_condition_clause = 9, RULE_condition_list = 10, 
		RULE_condition = 11, RULE_case_condition = 12, RULE_optional_binding_condition = 13, 
		RULE_optional_binding_head = 14, RULE_optional_binding_continuation_list = 15, 
		RULE_repeat_while_statement = 16, RULE_branch_statement = 17, RULE_if_statement = 18, 
		RULE_else_clause = 19, RULE_guard_statement = 20, RULE_switch_statement = 21, 
		RULE_switch_cases = 22, RULE_switch_case = 23, RULE_case_label = 24, RULE_case_item_list = 25, 
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
		RULE_constant_declaration_head = 77, RULE_constant_declaration_body = 78, 
		RULE_pattern_initializer_list = 79, RULE_pattern_initializer = 80, RULE_initializer = 81, 
		RULE_variable_declaration = 82, RULE_variable_declaration_head = 83, RULE_variable_declaration_body = 84, 
		RULE_regular_variable_declaration = 85, RULE_property_declaration = 86, 
		RULE_property_declaration_body = 87, RULE_variable_name = 88, RULE_getter_setter_block = 89, 
		RULE_getter_clause = 90, RULE_setter_clause = 91, RULE_setter_name = 92, 
		RULE_getter_setter_keyword_block = 93, RULE_getter_keyword_clause = 94, 
		RULE_setter_keyword_clause = 95, RULE_willSet_didSet_block = 96, RULE_willSet_clause = 97, 
		RULE_didSet_clause = 98, RULE_typealias_declaration = 99, RULE_typealias_head = 100, 
		RULE_typealias_name = 101, RULE_typealias_assignment = 102, RULE_function_declaration = 103, 
		RULE_function_head = 104, RULE_function_name = 105, RULE_function_signature = 106, 
		RULE_function_result = 107, RULE_function_body = 108, RULE_parameter_clauses = 109, 
		RULE_parameter_clause = 110, RULE_parameter_list = 111, RULE_parameter = 112, 
		RULE_external_parameter_name = 113, RULE_local_parameter_name = 114, RULE_default_argument_clause = 115, 
		RULE_enum_declaration = 116, RULE_union_style_enum = 117, RULE_union_style_enum_members = 118, 
		RULE_union_style_enum_member = 119, RULE_union_style_enum_case_clause = 120, 
		RULE_union_style_enum_case_list = 121, RULE_union_style_enum_case = 122, 
		RULE_enum_name = 123, RULE_enum_case_name = 124, RULE_raw_value_style_enum = 125, 
		RULE_raw_value_style_enum_members = 126, RULE_raw_value_style_enum_member = 127, 
		RULE_raw_value_style_enum_case_clause = 128, RULE_raw_value_style_enum_case_list = 129, 
		RULE_raw_value_style_enum_case = 130, RULE_raw_value_assignment = 131, 
		RULE_raw_value_literal = 132, RULE_struct_declaration = 133, RULE_struct_name = 134, 
		RULE_struct_body = 135, RULE_struct_keyword = 136, RULE_class_declaration = 137, 
		RULE_class_name = 138, RULE_class_body = 139, RULE_protocol_declaration = 140, 
		RULE_protocol_name = 141, RULE_protocol_body = 142, RULE_protocol_member_declaration = 143, 
		RULE_protocol_member_declarations = 144, RULE_protocol_property_declaration = 145, 
		RULE_protocol_method_declaration = 146, RULE_protocol_initializer_declaration = 147, 
		RULE_protocol_subscript_declaration = 148, RULE_protocol_associated_type_declaration = 149, 
		RULE_initializer_declaration = 150, RULE_initializer_head = 151, RULE_initializer_body = 152, 
		RULE_deinitializer_declaration = 153, RULE_extension_declaration = 154, 
		RULE_extension_body = 155, RULE_subscript_declaration = 156, RULE_subscript_head = 157, 
		RULE_subscript_result = 158, RULE_operator_declaration = 159, RULE_prefix_operator_declaration = 160, 
		RULE_postfix_operator_declaration = 161, RULE_infix_operator_declaration = 162, 
		RULE_infix_operator_attributes = 163, RULE_precedence_clause = 164, RULE_precedence_level = 165, 
		RULE_associativity_clause = 166, RULE_associativity = 167, RULE_declaration_modifier = 168, 
		RULE_declaration_modifiers = 169, RULE_access_level_modifier = 170, RULE_pattern = 171, 
		RULE_wildcard_pattern = 172, RULE_identifier_pattern = 173, RULE_value_binding_pattern = 174, 
		RULE_tuple_pattern = 175, RULE_tuple_pattern_element_list = 176, RULE_tuple_pattern_element = 177, 
		RULE_enum_case_pattern = 178, RULE_optional_pattern = 179, RULE_expression_pattern = 180, 
		RULE_attribute = 181, RULE_attribute_name = 182, RULE_attribute_argument_clause = 183, 
		RULE_attributes = 184, RULE_balanced_tokens = 185, RULE_balanced_token = 186, 
		RULE_expression = 187, RULE_expression_list = 188, RULE_prefix_expression = 189, 
		RULE_in_out_expression = 190, RULE_try_operator = 191, RULE_binary_expression = 192, 
		RULE_binary_expressions = 193, RULE_conditional_operator = 194, RULE_type_casting_operator = 195, 
		RULE_primary_expression = 196, RULE_implicit_member_expression = 197, 
		RULE_literal_expression = 198, RULE_array_literal = 199, RULE_array_literal_items = 200, 
		RULE_array_literal_item = 201, RULE_dictionary_literal = 202, RULE_dictionary_literal_items = 203, 
		RULE_dictionary_literal_item = 204, RULE_empty_dictionary_literal = 205, 
		RULE_closure_expression = 206, RULE_explicit_closure_expression = 207, 
		RULE_closure_signature = 208, RULE_capture_list = 209, RULE_capture_list_items = 210, 
		RULE_capture_list_item = 211, RULE_capture_specifier = 212, RULE_parenthesized_expression = 213, 
		RULE_expression_element_list = 214, RULE_expression_element = 215, RULE_wildcard_expression = 216, 
		RULE_selector_expression = 217, RULE_postfix_expression = 218, RULE_chain_postfix_expression = 219, 
		RULE_argument_names = 220, RULE_argument_name = 221, RULE_trailing_closure = 222, 
		RULE_type = 223, RULE_optional_type = 224, RULE_array_definition = 225, 
		RULE_dictionary_definition = 226, RULE_type_annotation = 227, RULE_inout = 228, 
		RULE_type_identifier = 229, RULE_type_name = 230, RULE_tuple_type = 231, 
		RULE_tuple_type_body = 232, RULE_tuple_type_element_list = 233, RULE_tuple_type_element = 234, 
		RULE_element_name = 235, RULE_protocol_composition_type = 236, RULE_protocol_identifier_list = 237, 
		RULE_protocol_identifier = 238, RULE_type_inheritance_clause = 239, RULE_type_inheritance_symbol = 240, 
		RULE_type_inheritance_list = 241, RULE_class_requirement = 242, RULE_identifier = 243, 
		RULE_identifier_list = 244, RULE_context_sensitive_keyword = 245, RULE_assignment_operator = 246, 
		RULE_negate_prefix_operator = 247, RULE_build_AND = 248, RULE_build_OR = 249, 
		RULE_arrow_operator = 250, RULE_range_operator = 251, RULE_same_type_equals = 252, 
		RULE_binary_operator = 253, RULE_prefix_operator = 254, RULE_postfix_operator = 255, 
		RULE_operator = 256, RULE_operator_character = 257, RULE_operator_head = 258, 
		RULE_dot_operator_head = 259, RULE_dot_operator_character = 260, RULE_literal = 261, 
		RULE_numeric_literal = 262, RULE_boolean_literal = 263, RULE_nil_literal = 264, 
		RULE_integer_literal = 265, RULE_string_literal = 266;
	public static final String[] ruleNames = {
		"top_level", "statement", "statements", "semicolon", "loop_statement", 
		"for_statement", "for_init", "for_in_statement", "while_statement", "condition_clause", 
		"condition_list", "condition", "case_condition", "optional_binding_condition", 
		"optional_binding_head", "optional_binding_continuation_list", "repeat_while_statement", 
		"branch_statement", "if_statement", "else_clause", "guard_statement", 
		"switch_statement", "switch_cases", "switch_case", "case_label", "case_item_list", 
		"default_label", "where_clause", "where_expression", "labeled_statement", 
		"statement_label", "label_name", "control_transfer_statement", "break_statement", 
		"continue_statement", "fallthrough_statement", "return_statement", "availability_condition", 
		"availability_arguments", "availability_argument", "throw_statement", 
		"defer_statement", "do_statement", "catch_clauses", "catch_clause", "compiler_control_statement", 
		"build_configuration_statement", "build_configuration_elseif_clauses", 
		"build_configuration_elseif_clause", "build_configuration_else_clause", 
		"build_configuration", "platform_testing_function", "operating_system", 
		"architecture", "line_control_statement", "line_number", "file_name", 
		"generic_parameter_clause", "generic_parameter_list", "generic_parameter", 
		"requirement_clause", "requirement_list", "requirement", "conformance_requirement", 
		"same_type_requirement", "generic_argument_clause", "generic_argument_list", 
		"generic_argument", "declaration", "declarations", "top_level_declaration", 
		"code_block", "import_declaration", "import_kind", "import_path", "import_path_identifier", 
		"constant_declaration", "constant_declaration_head", "constant_declaration_body", 
		"pattern_initializer_list", "pattern_initializer", "initializer", "variable_declaration", 
		"variable_declaration_head", "variable_declaration_body", "regular_variable_declaration", 
		"property_declaration", "property_declaration_body", "variable_name", 
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
		"struct_declaration", "struct_name", "struct_body", "struct_keyword", 
		"class_declaration", "class_name", "class_body", "protocol_declaration", 
		"protocol_name", "protocol_body", "protocol_member_declaration", "protocol_member_declarations", 
		"protocol_property_declaration", "protocol_method_declaration", "protocol_initializer_declaration", 
		"protocol_subscript_declaration", "protocol_associated_type_declaration", 
		"initializer_declaration", "initializer_head", "initializer_body", "deinitializer_declaration", 
		"extension_declaration", "extension_body", "subscript_declaration", "subscript_head", 
		"subscript_result", "operator_declaration", "prefix_operator_declaration", 
		"postfix_operator_declaration", "infix_operator_declaration", "infix_operator_attributes", 
		"precedence_clause", "precedence_level", "associativity_clause", "associativity", 
		"declaration_modifier", "declaration_modifiers", "access_level_modifier", 
		"pattern", "wildcard_pattern", "identifier_pattern", "value_binding_pattern", 
		"tuple_pattern", "tuple_pattern_element_list", "tuple_pattern_element", 
		"enum_case_pattern", "optional_pattern", "expression_pattern", "attribute", 
		"attribute_name", "attribute_argument_clause", "attributes", "balanced_tokens", 
		"balanced_token", "expression", "expression_list", "prefix_expression", 
		"in_out_expression", "try_operator", "binary_expression", "binary_expressions", 
		"conditional_operator", "type_casting_operator", "primary_expression", 
		"implicit_member_expression", "literal_expression", "array_literal", "array_literal_items", 
		"array_literal_item", "dictionary_literal", "dictionary_literal_items", 
		"dictionary_literal_item", "empty_dictionary_literal", "closure_expression", 
		"explicit_closure_expression", "closure_signature", "capture_list", "capture_list_items", 
		"capture_list_item", "capture_specifier", "parenthesized_expression", 
		"expression_element_list", "expression_element", "wildcard_expression", 
		"selector_expression", "postfix_expression", "chain_postfix_expression", 
		"argument_names", "argument_name", "trailing_closure", "type", "optional_type", 
		"array_definition", "dictionary_definition", "type_annotation", "inout", 
		"type_identifier", "type_name", "tuple_type", "tuple_type_body", "tuple_type_element_list", 
		"tuple_type_element", "element_name", "protocol_composition_type", "protocol_identifier_list", 
		"protocol_identifier", "type_inheritance_clause", "type_inheritance_symbol", 
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
		"'didSet'", "'throws'", "'rethrows'", "'indirect'", "'associatedtype'", 
		"'init'", "'deinit'", "'extension'", "'subscript'", "'prefix'", "'operator'", 
		"'postfix'", "'infix'", "'precedence'", "'associativity'", "'left'", "'right'", 
		"'none'", "'convenience'", "'dynamic'", "'final'", "'lazy'", "'mutating'", 
		"'nonmutating'", "'optional'", "'override'", "'required'", "'static'", 
		"'unowned'", "'safe'", "'unsafe'", "'weak'", "'internal'", "'private'", 
		"'public'", "'is'", "'as'", "'try'", "'__FILE__'", "'__LINE__'", "'__COLUMN__'", 
		"'__FUNCTION__'", "'unowned(safe)'", "'unowned(unsafe)'", "'#selector'", 
		"'dynamicType'", "'Type'", "'Protocol'", "'inout'", "'`'", "'true'", "'false'", 
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
		null, null, null, null, null, "Platform", "Regular_identifier", "DOT", 
		"LCURLY", "LPAREN", "LBRACK", "RCURLY", "RPAREN", "RBRACK", "COMMA", "COLON", 
		"SEMI", "LT", "GT", "UNDERSCORE", "BANG", "QUESTION", "AT", "AND", "SUB", 
		"EQUAL", "OR", "DIV", "ADD", "MUL", "MOD", "CARET", "TILDE", "Operator_head_other", 
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
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					statement();
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(540);
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
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
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
			setState(575);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				expression();
				setState(544);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(543);
					semicolon();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				declaration();
				setState(548);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(547);
					semicolon();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				loop_statement();
				setState(552);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(551);
					semicolon();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(554);
				branch_statement();
				setState(556);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(555);
					semicolon();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(558);
				labeled_statement();
				setState(560);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(559);
					semicolon();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(562);
				control_transfer_statement();
				setState(564);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(563);
					semicolon();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(566);
				defer_statement();
				setState(568);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(567);
					semicolon();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(570);
				do_statement();
				setState(572);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(571);
					semicolon();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(574);
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
			setState(578); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(577);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(580); 
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

	public static class SemicolonContext extends ParserRuleContext {
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
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
		enterRule(_localctx, 8, RULE_loop_statement);
		try {
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				for_in_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
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
		enterRule(_localctx, 10, RULE_for_statement);
		try {
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				match(T__0);
				setState(592);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(591);
					for_init();
					}
					break;
				}
				setState(594);
				match(SEMI);
				setState(596);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(595);
					expression();
					}
					break;
				}
				setState(598);
				match(SEMI);
				setState(600);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(599);
					expression();
					}
					break;
				}
				setState(602);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(T__0);
				setState(604);
				match(LPAREN);
				setState(606);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(605);
					for_init();
					}
					break;
				}
				setState(608);
				match(SEMI);
				setState(610);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(609);
					expression();
					}
					break;
				}
				setState(612);
				match(SEMI);
				setState(614);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(613);
					expression();
					}
					break;
				}
				setState(616);
				match(RPAREN);
				setState(617);
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
		enterRule(_localctx, 12, RULE_for_init);
		try {
			setState(622);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
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
		enterRule(_localctx, 14, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T__0);
			setState(626);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(625);
				match(T__1);
				}
				break;
			}
			setState(628);
			pattern(0);
			setState(629);
			match(T__2);
			setState(630);
			expression();
			setState(632);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(631);
				where_clause();
				}
			}

			setState(634);
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
		enterRule(_localctx, 16, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(T__3);
			setState(637);
			condition_clause();
			setState(638);
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
		enterRule(_localctx, 18, RULE_condition_clause);
		try {
			setState(650);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				expression();
				setState(642);
				match(COMMA);
				setState(643);
				condition_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				condition_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
				availability_condition();
				setState(647);
				match(COMMA);
				setState(648);
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
		enterRule(_localctx, 20, RULE_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			condition();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(653);
				match(COMMA);
				setState(654);
				condition();
				}
				}
				setState(659);
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
		enterRule(_localctx, 22, RULE_condition);
		try {
			setState(663);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				availability_condition();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				case_condition();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
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
		enterRule(_localctx, 24, RULE_case_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(T__1);
			setState(666);
			pattern(0);
			setState(667);
			initializer();
			setState(669);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(668);
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
		enterRule(_localctx, 26, RULE_optional_binding_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			optional_binding_head();
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(672);
				optional_binding_continuation_list();
				}
				break;
			}
			setState(676);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(675);
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
		enterRule(_localctx, 28, RULE_optional_binding_head);
		try {
			setState(686);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(T__4);
				setState(679);
				pattern(0);
				setState(680);
				initializer();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(T__5);
				setState(683);
				pattern(0);
				setState(684);
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
		public List<Optional_binding_headContext> optional_binding_head() {
			return getRuleContexts(Optional_binding_headContext.class);
		}
		public Optional_binding_headContext optional_binding_head(int i) {
			return getRuleContext(Optional_binding_headContext.class,i);
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
		enterRule(_localctx, 30, RULE_optional_binding_continuation_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(COMMA);
			setState(689);
			optional_binding_head();
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(690);
					match(COMMA);
					setState(691);
					optional_binding_head();
					}
					} 
				}
				setState(696);
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
			setState(697);
			match(T__6);
			setState(698);
			code_block();
			setState(699);
			match(T__3);
			setState(700);
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
			setState(705);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				guard_statement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(704);
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
			setState(707);
			match(T__7);
			setState(708);
			condition_clause();
			setState(709);
			code_block();
			setState(711);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(710);
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
			setState(717);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(T__8);
				setState(714);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(T__8);
				setState(716);
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
			setState(719);
			match(T__9);
			setState(720);
			condition_clause();
			setState(721);
			match(T__8);
			setState(722);
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
			setState(724);
			match(T__10);
			setState(725);
			expression();
			setState(726);
			match(LCURLY);
			setState(728);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(727);
				switch_cases();
				}
			}

			setState(730);
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
			setState(732);
			switch_case();
			setState(734);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__11) {
				{
				setState(733);
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
			setState(742);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				case_label();
				setState(737);
				statements();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				default_label();
				setState(740);
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
			setState(744);
			match(T__1);
			setState(745);
			case_item_list();
			setState(746);
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
			setState(759);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				pattern(0);
				setState(750);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(749);
					where_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				pattern(0);
				setState(754);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(753);
					where_clause();
					}
				}

				setState(756);
				match(COMMA);
				setState(757);
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
			setState(761);
			match(T__11);
			setState(762);
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
			setState(764);
			match(T__12);
			setState(765);
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
			setState(767);
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
			setState(778);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				statement_label();
				setState(770);
				loop_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				statement_label();
				setState(773);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				statement_label();
				setState(776);
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
			setState(780);
			label_name();
			setState(781);
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
			setState(783);
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
			setState(790);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				break_statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				continue_statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
				fallthrough_statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(788);
				return_statement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(789);
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
			setState(792);
			match(T__13);
			setState(794);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(793);
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
			setState(796);
			match(T__14);
			setState(798);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(797);
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
			setState(800);
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
			setState(802);
			match(T__16);
			setState(804);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(803);
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
			setState(806);
			match(T__17);
			setState(807);
			match(LPAREN);
			setState(808);
			availability_arguments();
			setState(809);
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
			setState(811);
			availability_argument();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(812);
				match(COMMA);
				setState(813);
				availability_argument();
				}
				}
				setState(818);
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
			setState(819);
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
			setState(821);
			match(T__18);
			setState(822);
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
			setState(824);
			match(T__19);
			setState(825);
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
			setState(827);
			match(T__20);
			setState(828);
			code_block();
			setState(830);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(829);
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
			setState(832);
			catch_clause();
			setState(834);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(833);
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
			setState(836);
			match(T__21);
			setState(838);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(837);
				pattern(0);
				}
				break;
			}
			setState(841);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(840);
				where_clause();
				}
			}

			setState(843);
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
			setState(847);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				build_configuration_statement();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
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
			setState(849);
			match(T__22);
			setState(850);
			build_configuration(0);
			setState(852);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(851);
				statements();
				}
				break;
			}
			setState(855);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(854);
				build_configuration_elseif_clauses();
				}
			}

			setState(858);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(857);
				build_configuration_else_clause();
				}
			}

			setState(860);
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
			setState(862);
			build_configuration_elseif_clause();
			setState(864);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(863);
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
			setState(866);
			match(T__24);
			setState(867);
			build_configuration(0);
			setState(869);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(868);
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
			setState(871);
			match(T__25);
			setState(873);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(872);
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
			setState(885);
			switch (_input.LA(1)) {
			case BANG:
				{
				setState(876);
				match(BANG);
				setState(877);
				build_configuration(3);
				}
				break;
			case T__26:
			case T__27:
				{
				setState(878);
				platform_testing_function();
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
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
			case T__75:
			case T__78:
			case T__93:
			case T__94:
			case T__96:
			case Regular_identifier:
			case Implicit_parameter_name:
				{
				setState(879);
				identifier();
				}
				break;
			case T__97:
			case T__98:
				{
				setState(880);
				boolean_literal();
				}
				break;
			case LPAREN:
				{
				setState(881);
				match(LPAREN);
				setState(882);
				build_configuration(0);
				setState(883);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(897);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(895);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new Build_configurationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_build_configuration);
						setState(887);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(888);
						build_AND();
						setState(889);
						build_configuration(3);
						}
						break;
					case 2:
						{
						_localctx = new Build_configurationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_build_configuration);
						setState(891);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(892);
						build_OR();
						setState(893);
						build_configuration(2);
						}
						break;
					}
					} 
				}
				setState(899);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
			setState(910);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				match(T__26);
				setState(901);
				match(LPAREN);
				setState(902);
				operating_system();
				setState(903);
				match(RPAREN);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				match(T__27);
				setState(906);
				match(LPAREN);
				setState(907);
				architecture();
				setState(908);
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
			setState(912);
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
			setState(914);
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
			setState(921);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(T__36);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(T__36);
				setState(918);
				line_number();
				setState(919);
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
			setState(923);
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
			setState(925);
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
			setState(927);
			match(LT);
			setState(928);
			generic_parameter_list();
			setState(930);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(929);
				requirement_clause();
				}
			}

			setState(932);
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
			setState(934);
			generic_parameter();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(935);
				match(COMMA);
				setState(936);
				generic_parameter();
				}
				}
				setState(941);
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
			setState(951);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				type_name();
				setState(944);
				match(COLON);
				setState(945);
				type_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(947);
				type_name();
				setState(948);
				match(COLON);
				setState(949);
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
			setState(953);
			match(T__12);
			setState(954);
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
			setState(961);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				requirement();
				setState(958);
				match(COMMA);
				setState(959);
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
			setState(965);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				conformance_requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
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
			setState(975);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				type_identifier();
				setState(968);
				match(COLON);
				setState(969);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				type_identifier();
				setState(972);
				match(COLON);
				setState(973);
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
			setState(977);
			type_identifier();
			setState(978);
			same_type_equals();
			setState(979);
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
			setState(981);
			match(LT);
			setState(982);
			generic_argument_list();
			setState(983);
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
			setState(985);
			generic_argument();
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(986);
				match(COMMA);
				setState(987);
				generic_argument();
				}
				}
				setState(992);
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
			setState(993);
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
			setState(1009);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				import_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				constant_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(997);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(998);
				typealias_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(999);
				function_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1000);
				enum_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1001);
				struct_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1002);
				class_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1003);
				protocol_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1004);
				initializer_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1005);
				deinitializer_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1006);
				extension_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1007);
				subscript_declaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1008);
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
			setState(1012); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1011);
				declaration();
				}
				}
				setState(1014); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__37 - 5)) | (1L << (T__38 - 5)) | (1L << (T__39 - 5)) | (1L << (T__40 - 5)) | (1L << (T__41 - 5)) | (1L << (T__42 - 5)) | (1L << (T__43 - 5)) | (1L << (T__44 - 5)) | (1L << (T__45 - 5)) | (1L << (T__46 - 5)) | (1L << (T__47 - 5)) | (1L << (T__50 - 5)) | (1L << (T__52 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (T__73 - 69)) | (1L << (T__74 - 69)) | (1L << (T__75 - 69)) | (1L << (T__78 - 69)) | (1L << (T__79 - 69)) | (1L << (T__80 - 69)) | (1L << (T__81 - 69)) | (1L << (T__93 - 69)) | (1L << (T__94 - 69)) | (1L << (T__96 - 69)) | (1L << (Regular_identifier - 69)) | (1L << (AT - 69)) | (1L << (Implicit_parameter_name - 69)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(1017);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(1016);
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
			setState(1019);
			match(LCURLY);
			setState(1021);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(1020);
				statements();
				}
				break;
			}
			setState(1023);
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
			setState(1026);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1025);
				attributes();
				}
			}

			setState(1028);
			match(T__37);
			setState(1030);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
				{
				setState(1029);
				import_kind();
				}
			}

			setState(1032);
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
			setState(1034);
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
			setState(1041);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				import_path_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				import_path_identifier();
				setState(1038);
				match(DOT);
				setState(1039);
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
			setState(1045);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
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
			case T__75:
			case T__78:
			case T__93:
			case T__94:
			case T__96:
			case Regular_identifier:
			case Implicit_parameter_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
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
				setState(1044);
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
		public Constant_declaration_headContext constant_declaration_head() {
			return getRuleContext(Constant_declaration_headContext.class,0);
		}
		public Constant_declaration_bodyContext constant_declaration_body() {
			return getRuleContext(Constant_declaration_bodyContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			constant_declaration_head();
			setState(1048);
			constant_declaration_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declaration_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Constant_declaration_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConstant_declaration_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declaration_headContext constant_declaration_head() throws RecognitionException {
		Constant_declaration_headContext _localctx = new Constant_declaration_headContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_constant_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1050);
				attributes();
				}
				break;
			}
			setState(1054);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__56 - 41)) | (1L << (T__58 - 41)) | (1L << (T__59 - 41)) | (1L << (T__65 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__78 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)))) != 0)) {
				{
				setState(1053);
				declaration_modifiers();
				}
			}

			setState(1056);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declaration_bodyContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Constant_declaration_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConstant_declaration_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declaration_bodyContext constant_declaration_body() throws RecognitionException {
		Constant_declaration_bodyContext _localctx = new Constant_declaration_bodyContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_constant_declaration_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
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
		enterRule(_localctx, 158, RULE_pattern_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			pattern_initializer();
			setState(1065);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1061);
					match(COMMA);
					setState(1062);
					pattern_initializer();
					}
					} 
				}
				setState(1067);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		enterRule(_localctx, 160, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			pattern(0);
			setState(1070);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(1069);
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
		enterRule(_localctx, 162, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			assignment_operator();
			setState(1073);
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
		public Variable_declaration_bodyContext variable_declaration_body() {
			return getRuleContext(Variable_declaration_bodyContext.class,0);
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
		enterRule(_localctx, 164, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			variable_declaration_head();
			setState(1076);
			variable_declaration_body();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 166, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(1078);
				attributes();
				}
				break;
			}
			setState(1082);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__56 - 41)) | (1L << (T__58 - 41)) | (1L << (T__59 - 41)) | (1L << (T__65 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__78 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)))) != 0)) {
				{
				setState(1081);
				declaration_modifiers();
				}
			}

			setState(1084);
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

	public static class Variable_declaration_bodyContext extends ParserRuleContext {
		public Property_declarationContext property_declaration() {
			return getRuleContext(Property_declarationContext.class,0);
		}
		public Regular_variable_declarationContext regular_variable_declaration() {
			return getRuleContext(Regular_variable_declarationContext.class,0);
		}
		public Variable_declaration_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitVariable_declaration_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_bodyContext variable_declaration_body() throws RecognitionException {
		Variable_declaration_bodyContext _localctx = new Variable_declaration_bodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_variable_declaration_body);
		try {
			setState(1088);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				property_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1087);
				regular_variable_declaration();
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

	public static class Regular_variable_declarationContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Regular_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regular_variable_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRegular_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Regular_variable_declarationContext regular_variable_declaration() throws RecognitionException {
		Regular_variable_declarationContext _localctx = new Regular_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_regular_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
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

	public static class Property_declarationContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Property_declaration_bodyContext property_declaration_body() {
			return getRuleContext(Property_declaration_bodyContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProperty_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			variable_name();
			setState(1093);
			type_annotation();
			setState(1094);
			property_declaration_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_declaration_bodyContext extends ParserRuleContext {
		public Property_declaration_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration_body; }
	 
		public Property_declaration_bodyContext() { }
		public void copyFrom(Property_declaration_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Read_only_computed_property_declarationContext extends Property_declaration_bodyContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Read_only_computed_property_declarationContext(Property_declaration_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRead_only_computed_property_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Computed_keyword_property_declarationContext extends Property_declaration_bodyContext {
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Computed_keyword_property_declarationContext(Property_declaration_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitComputed_keyword_property_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WillSet_didSet_property_declarationContext extends Property_declaration_bodyContext {
		public WillSet_didSet_blockContext willSet_didSet_block() {
			return getRuleContext(WillSet_didSet_blockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public WillSet_didSet_property_declarationContext(Property_declaration_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWillSet_didSet_property_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Computed_property_declarationContext extends Property_declaration_bodyContext {
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Computed_property_declarationContext(Property_declaration_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitComputed_property_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_declaration_bodyContext property_declaration_body() throws RecognitionException {
		Property_declaration_bodyContext _localctx = new Property_declaration_bodyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_property_declaration_body);
		try {
			setState(1103);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new Computed_property_declarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				getter_setter_block();
				}
				break;
			case 2:
				_localctx = new Computed_keyword_property_declarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
				getter_setter_keyword_block();
				}
				break;
			case 3:
				_localctx = new WillSet_didSet_property_declarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1099);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(1098);
					initializer();
					}
					break;
				}
				setState(1101);
				willSet_didSet_block();
				}
				break;
			case 4:
				_localctx = new Read_only_computed_property_declarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1102);
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
		enterRule(_localctx, 176, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
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
		enterRule(_localctx, 178, RULE_getter_setter_block);
		int _la;
		try {
			setState(1119);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				match(LCURLY);
				setState(1108);
				getter_clause();
				setState(1110);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
					{
					setState(1109);
					setter_clause();
					}
				}

				setState(1112);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				match(LCURLY);
				setState(1115);
				setter_clause();
				setState(1116);
				getter_clause();
				setState(1117);
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
		enterRule(_localctx, 180, RULE_getter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(1121);
				attributes();
				}
				break;
			}
			setState(1124);
			match(T__44);
			setState(1125);
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
		enterRule(_localctx, 182, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1127);
				attributes();
				}
				break;
			}
			setState(1130);
			match(T__45);
			setState(1132);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1131);
				setter_name();
				}
			}

			setState(1134);
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
		enterRule(_localctx, 184, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(LPAREN);
			setState(1137);
			identifier();
			setState(1138);
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
		enterRule(_localctx, 186, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(1152);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				match(LCURLY);
				setState(1141);
				getter_keyword_clause();
				setState(1143);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
					{
					setState(1142);
					setter_keyword_clause();
					}
				}

				setState(1145);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				match(LCURLY);
				setState(1148);
				setter_keyword_clause();
				setState(1149);
				getter_keyword_clause();
				setState(1150);
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
		enterRule(_localctx, 188, RULE_getter_keyword_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(1154);
				attributes();
				}
				break;
			}
			setState(1157);
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
		enterRule(_localctx, 190, RULE_setter_keyword_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1159);
				attributes();
				}
				break;
			}
			setState(1162);
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
		enterRule(_localctx, 192, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(1176);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				match(LCURLY);
				setState(1165);
				willSet_clause();
				setState(1167);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
					{
					setState(1166);
					didSet_clause();
					}
				}

				setState(1169);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171);
				match(LCURLY);
				setState(1172);
				didSet_clause();
				setState(1173);
				willSet_clause();
				setState(1174);
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
		enterRule(_localctx, 194, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(1178);
				attributes();
				}
				break;
			}
			setState(1181);
			match(T__46);
			setState(1183);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1182);
				setter_name();
				}
			}

			setState(1185);
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
		enterRule(_localctx, 196, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1187);
				attributes();
				}
				break;
			}
			setState(1190);
			match(T__47);
			setState(1192);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1191);
				setter_name();
				}
			}

			setState(1194);
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
		enterRule(_localctx, 198, RULE_typealias_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			typealias_head();
			setState(1197);
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
		enterRule(_localctx, 200, RULE_typealias_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1199);
				attributes();
				}
			}

			setState(1203);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(1202);
				access_level_modifier();
				}
			}

			setState(1205);
			match(T__38);
			setState(1206);
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
		enterRule(_localctx, 202, RULE_typealias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
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
		enterRule(_localctx, 204, RULE_typealias_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			assignment_operator();
			setState(1211);
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
		enterRule(_localctx, 206, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			function_head();
			setState(1214);
			function_name();
			setState(1216);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1215);
				generic_parameter_clause();
				}
			}

			setState(1218);
			function_signature();
			setState(1220);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1219);
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
		enterRule(_localctx, 208, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1222);
				attributes();
				}
				break;
			}
			setState(1226);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__56 - 41)) | (1L << (T__58 - 41)) | (1L << (T__59 - 41)) | (1L << (T__65 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__78 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)))) != 0)) {
				{
				setState(1225);
				declaration_modifiers();
				}
			}

			setState(1228);
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
		enterRule(_localctx, 210, RULE_function_name);
		try {
			setState(1232);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
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
			case T__75:
			case T__78:
			case T__93:
			case T__94:
			case T__96:
			case Regular_identifier:
			case Implicit_parameter_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
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
				setState(1231);
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
		enterRule(_localctx, 212, RULE_function_signature);
		try {
			setState(1246);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				parameter_clauses();
				setState(1236);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1235);
					match(T__48);
					}
					break;
				}
				setState(1239);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1238);
					function_result();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				parameter_clauses();
				setState(1242);
				match(T__49);
				setState(1244);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1243);
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
		enterRule(_localctx, 214, RULE_function_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			arrow_operator();
			setState(1250);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1249);
				attributes();
				}
				break;
			}
			setState(1252);
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
		enterRule(_localctx, 216, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
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
		enterRule(_localctx, 218, RULE_parameter_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			parameter_clause();
			setState(1258);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1257);
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
		enterRule(_localctx, 220, RULE_parameter_clause);
		try {
			setState(1266);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				match(LPAREN);
				setState(1261);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				match(LPAREN);
				setState(1263);
				parameter_list();
				setState(1264);
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
		enterRule(_localctx, 222, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			parameter();
			setState(1273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1269);
				match(COMMA);
				setState(1270);
				parameter();
				}
				}
				setState(1275);
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
		enterRule(_localctx, 224, RULE_parameter);
		int _la;
		try {
			setState(1307);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(1276);
					match(T__4);
					}
				}

				setState(1280);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1279);
					external_parameter_name();
					}
					break;
				}
				setState(1282);
				local_parameter_name();
				setState(1284);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1283);
					type_annotation();
					}
					break;
				}
				setState(1287);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1286);
					default_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				match(T__5);
				setState(1291);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1290);
					external_parameter_name();
					}
					break;
				}
				setState(1293);
				local_parameter_name();
				setState(1295);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1294);
					type_annotation();
					}
					break;
				}
				setState(1298);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1297);
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
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1300);
					external_parameter_name();
					}
					break;
				}
				setState(1303);
				local_parameter_name();
				setState(1304);
				type_annotation();
				setState(1305);
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
		enterRule(_localctx, 226, RULE_external_parameter_name);
		try {
			setState(1311);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
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
			case T__75:
			case T__78:
			case T__93:
			case T__94:
			case T__96:
			case Regular_identifier:
			case Implicit_parameter_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				identifier();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
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
		enterRule(_localctx, 228, RULE_local_parameter_name);
		try {
			setState(1315);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
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
			case T__75:
			case T__78:
			case T__93:
			case T__94:
			case T__96:
			case Regular_identifier:
			case Implicit_parameter_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				identifier();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314);
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
		enterRule(_localctx, 230, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			assignment_operator();
			setState(1318);
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
		enterRule(_localctx, 232, RULE_enum_declaration);
		int _la;
		try {
			setState(1334);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1320);
					attributes();
					}
					break;
				}
				setState(1324);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
					{
					setState(1323);
					access_level_modifier();
					}
				}

				setState(1326);
				union_style_enum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
					{
					setState(1327);
					attributes();
					}
				}

				setState(1331);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
					{
					setState(1330);
					access_level_modifier();
					}
				}

				setState(1333);
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
		enterRule(_localctx, 234, RULE_union_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(1336);
				match(T__50);
				}
			}

			setState(1339);
			match(T__41);
			setState(1340);
			enum_name();
			setState(1342);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1341);
				generic_parameter_clause();
				}
			}

			setState(1345);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1344);
				type_inheritance_clause();
				}
			}

			setState(1347);
			match(LCURLY);
			setState(1349);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__96 - 64)) | (1L << (Regular_identifier - 64)) | (1L << (AT - 64)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1348);
				union_style_enum_members();
				}
			}

			setState(1351);
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
		enterRule(_localctx, 236, RULE_union_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			union_style_enum_member();
			setState(1355);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__96 - 64)) | (1L << (Regular_identifier - 64)) | (1L << (AT - 64)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1354);
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
		enterRule(_localctx, 238, RULE_union_style_enum_member);
		try {
			setState(1359);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1358);
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
		enterRule(_localctx, 240, RULE_union_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1361);
				attributes();
				}
				break;
			}
			setState(1365);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(1364);
				match(T__50);
				}
			}

			setState(1367);
			match(T__1);
			setState(1368);
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
		enterRule(_localctx, 242, RULE_union_style_enum_case_list);
		try {
			setState(1375);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				union_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371);
				union_style_enum_case();
				setState(1372);
				match(COMMA);
				setState(1373);
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
		enterRule(_localctx, 244, RULE_union_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			enum_case_name();
			setState(1379);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1378);
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
		enterRule(_localctx, 246, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
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
		enterRule(_localctx, 248, RULE_enum_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
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
		enterRule(_localctx, 250, RULE_raw_value_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			match(T__41);
			setState(1386);
			enum_name();
			setState(1388);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1387);
				generic_parameter_clause();
				}
			}

			setState(1390);
			type_inheritance_clause();
			setState(1391);
			match(LCURLY);
			setState(1392);
			raw_value_style_enum_members();
			setState(1393);
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
		enterRule(_localctx, 252, RULE_raw_value_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			raw_value_style_enum_member();
			setState(1397);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__50) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__96 - 64)) | (1L << (Regular_identifier - 64)) | (1L << (AT - 64)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1396);
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
		enterRule(_localctx, 254, RULE_raw_value_style_enum_member);
		try {
			setState(1401);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1399);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1400);
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
		enterRule(_localctx, 256, RULE_raw_value_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1403);
				attributes();
				}
			}

			setState(1406);
			match(T__1);
			setState(1407);
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
		enterRule(_localctx, 258, RULE_raw_value_style_enum_case_list);
		try {
			setState(1414);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				raw_value_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410);
				raw_value_style_enum_case();
				setState(1411);
				match(COMMA);
				setState(1412);
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
		enterRule(_localctx, 260, RULE_raw_value_style_enum_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			enum_case_name();
			setState(1418);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1417);
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
		enterRule(_localctx, 262, RULE_raw_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			assignment_operator();
			setState(1421);
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
		enterRule(_localctx, 264, RULE_raw_value_literal);
		try {
			setState(1426);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				match(Static_string_literal);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1425);
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
		public Struct_keywordContext struct_keyword() {
			return getRuleContext(Struct_keywordContext.class,0);
		}
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
		enterRule(_localctx, 266, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1428);
				attributes();
				}
			}

			setState(1432);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(1431);
				access_level_modifier();
				}
			}

			setState(1434);
			struct_keyword();
			setState(1435);
			struct_name();
			setState(1437);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1436);
				generic_parameter_clause();
				}
			}

			setState(1440);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1439);
				type_inheritance_clause();
				}
			}

			setState(1442);
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
		enterRule(_localctx, 268, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
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
		enterRule(_localctx, 270, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			match(LCURLY);
			setState(1448);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__37 - 5)) | (1L << (T__38 - 5)) | (1L << (T__39 - 5)) | (1L << (T__40 - 5)) | (1L << (T__41 - 5)) | (1L << (T__42 - 5)) | (1L << (T__43 - 5)) | (1L << (T__44 - 5)) | (1L << (T__45 - 5)) | (1L << (T__46 - 5)) | (1L << (T__47 - 5)) | (1L << (T__50 - 5)) | (1L << (T__52 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (T__73 - 69)) | (1L << (T__74 - 69)) | (1L << (T__75 - 69)) | (1L << (T__78 - 69)) | (1L << (T__79 - 69)) | (1L << (T__80 - 69)) | (1L << (T__81 - 69)) | (1L << (T__93 - 69)) | (1L << (T__94 - 69)) | (1L << (T__96 - 69)) | (1L << (Regular_identifier - 69)) | (1L << (AT - 69)) | (1L << (Implicit_parameter_name - 69)))) != 0)) {
				{
				setState(1447);
				declarations();
				}
			}

			setState(1450);
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

	public static class Struct_keywordContext extends ParserRuleContext {
		public Struct_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStruct_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_keywordContext struct_keyword() throws RecognitionException {
		Struct_keywordContext _localctx = new Struct_keywordContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_struct_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 274, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1454);
				attributes();
				}
			}

			setState(1458);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(1457);
				access_level_modifier();
				}
			}

			setState(1460);
			match(T__40);
			setState(1461);
			class_name();
			setState(1463);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1462);
				generic_parameter_clause();
				}
			}

			setState(1466);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1465);
				type_inheritance_clause();
				}
			}

			setState(1468);
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
		enterRule(_localctx, 276, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
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
		enterRule(_localctx, 278, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			match(LCURLY);
			setState(1474);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__37 - 5)) | (1L << (T__38 - 5)) | (1L << (T__39 - 5)) | (1L << (T__40 - 5)) | (1L << (T__41 - 5)) | (1L << (T__42 - 5)) | (1L << (T__43 - 5)) | (1L << (T__44 - 5)) | (1L << (T__45 - 5)) | (1L << (T__46 - 5)) | (1L << (T__47 - 5)) | (1L << (T__50 - 5)) | (1L << (T__52 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (T__73 - 69)) | (1L << (T__74 - 69)) | (1L << (T__75 - 69)) | (1L << (T__78 - 69)) | (1L << (T__79 - 69)) | (1L << (T__80 - 69)) | (1L << (T__81 - 69)) | (1L << (T__93 - 69)) | (1L << (T__94 - 69)) | (1L << (T__96 - 69)) | (1L << (Regular_identifier - 69)) | (1L << (AT - 69)) | (1L << (Implicit_parameter_name - 69)))) != 0)) {
				{
				setState(1473);
				declarations();
				}
			}

			setState(1476);
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
		enterRule(_localctx, 280, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1478);
				attributes();
				}
			}

			setState(1482);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(1481);
				access_level_modifier();
				}
			}

			setState(1484);
			match(T__42);
			setState(1485);
			protocol_name();
			setState(1487);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1486);
				type_inheritance_clause();
				}
			}

			setState(1489);
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
		enterRule(_localctx, 282, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
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
		enterRule(_localctx, 284, RULE_protocol_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(LCURLY);
			setState(1495);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__40 - 6)) | (1L << (T__43 - 6)) | (1L << (T__44 - 6)) | (1L << (T__45 - 6)) | (1L << (T__46 - 6)) | (1L << (T__47 - 6)) | (1L << (T__50 - 6)) | (1L << (T__51 - 6)) | (1L << (T__52 - 6)) | (1L << (T__55 - 6)) | (1L << (T__56 - 6)) | (1L << (T__57 - 6)) | (1L << (T__58 - 6)) | (1L << (T__59 - 6)) | (1L << (T__60 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__96 - 70)) | (1L << (Regular_identifier - 70)) | (1L << (AT - 70)) | (1L << (Implicit_parameter_name - 70)))) != 0)) {
				{
				setState(1494);
				protocol_member_declarations();
				}
			}

			setState(1497);
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
		enterRule(_localctx, 286, RULE_protocol_member_declaration);
		try {
			setState(1504);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1499);
				protocol_property_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1500);
				protocol_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1501);
				protocol_initializer_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1502);
				protocol_subscript_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1503);
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
		enterRule(_localctx, 288, RULE_protocol_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			protocol_member_declaration();
			setState(1508);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__40 - 6)) | (1L << (T__43 - 6)) | (1L << (T__44 - 6)) | (1L << (T__45 - 6)) | (1L << (T__46 - 6)) | (1L << (T__47 - 6)) | (1L << (T__50 - 6)) | (1L << (T__51 - 6)) | (1L << (T__52 - 6)) | (1L << (T__55 - 6)) | (1L << (T__56 - 6)) | (1L << (T__57 - 6)) | (1L << (T__58 - 6)) | (1L << (T__59 - 6)) | (1L << (T__60 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__96 - 70)) | (1L << (Regular_identifier - 70)) | (1L << (AT - 70)) | (1L << (Implicit_parameter_name - 70)))) != 0)) {
				{
				setState(1507);
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
		enterRule(_localctx, 290, RULE_protocol_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			variable_declaration_head();
			setState(1511);
			variable_name();
			setState(1512);
			type_annotation();
			setState(1513);
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
		enterRule(_localctx, 292, RULE_protocol_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			function_head();
			setState(1516);
			function_name();
			setState(1518);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1517);
				generic_parameter_clause();
				}
			}

			setState(1520);
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
		enterRule(_localctx, 294, RULE_protocol_initializer_declaration);
		int _la;
		try {
			setState(1537);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				initializer_head();
				setState(1524);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1523);
					generic_parameter_clause();
					}
				}

				setState(1526);
				parameter_clause();
				setState(1528);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1527);
					match(T__48);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530);
				initializer_head();
				setState(1532);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1531);
					generic_parameter_clause();
					}
				}

				setState(1534);
				parameter_clause();
				setState(1535);
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
		enterRule(_localctx, 296, RULE_protocol_subscript_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			subscript_head();
			setState(1540);
			subscript_result();
			setState(1541);
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
		enterRule(_localctx, 298, RULE_protocol_associated_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1543);
				attributes();
				}
			}

			setState(1547);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(1546);
				access_level_modifier();
				}
			}

			setState(1549);
			match(T__51);
			setState(1550);
			typealias_name();
			setState(1552);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1551);
				type_inheritance_clause();
				}
				break;
			}
			setState(1555);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1554);
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
		enterRule(_localctx, 300, RULE_initializer_declaration);
		int _la;
		try {
			setState(1575);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				initializer_head();
				setState(1559);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1558);
					generic_parameter_clause();
					}
				}

				setState(1561);
				parameter_clause();
				setState(1563);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(1562);
					match(T__48);
					}
				}

				setState(1565);
				initializer_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				initializer_head();
				setState(1569);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1568);
					generic_parameter_clause();
					}
				}

				setState(1571);
				parameter_clause();
				setState(1572);
				match(T__49);
				setState(1573);
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
		enterRule(_localctx, 302, RULE_initializer_head);
		int _la;
		try {
			setState(1600);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1578);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1577);
					attributes();
					}
					break;
				}
				setState(1581);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__56 - 41)) | (1L << (T__58 - 41)) | (1L << (T__59 - 41)) | (1L << (T__65 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__78 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)))) != 0)) {
					{
					setState(1580);
					declaration_modifiers();
					}
				}

				setState(1583);
				match(T__52);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1585);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1584);
					attributes();
					}
					break;
				}
				setState(1588);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__56 - 41)) | (1L << (T__58 - 41)) | (1L << (T__59 - 41)) | (1L << (T__65 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__78 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)))) != 0)) {
					{
					setState(1587);
					declaration_modifiers();
					}
				}

				setState(1590);
				match(T__52);
				setState(1591);
				match(QUESTION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1593);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1592);
					attributes();
					}
					break;
				}
				setState(1596);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__56 - 41)) | (1L << (T__58 - 41)) | (1L << (T__59 - 41)) | (1L << (T__65 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__78 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)))) != 0)) {
					{
					setState(1595);
					declaration_modifiers();
					}
				}

				setState(1598);
				match(T__52);
				setState(1599);
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
		enterRule(_localctx, 304, RULE_initializer_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
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
		enterRule(_localctx, 306, RULE_deinitializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(1604);
				attributes();
				}
			}

			setState(1607);
			match(T__53);
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
		enterRule(_localctx, 308, RULE_extension_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(1610);
				access_level_modifier();
				}
			}

			setState(1613);
			match(T__54);
			setState(1614);
			type_identifier();
			setState(1616);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1615);
				type_inheritance_clause();
				}
			}

			setState(1618);
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
		enterRule(_localctx, 310, RULE_extension_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			match(LCURLY);
			setState(1622);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__37 - 5)) | (1L << (T__38 - 5)) | (1L << (T__39 - 5)) | (1L << (T__40 - 5)) | (1L << (T__41 - 5)) | (1L << (T__42 - 5)) | (1L << (T__43 - 5)) | (1L << (T__44 - 5)) | (1L << (T__45 - 5)) | (1L << (T__46 - 5)) | (1L << (T__47 - 5)) | (1L << (T__50 - 5)) | (1L << (T__52 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (T__73 - 69)) | (1L << (T__74 - 69)) | (1L << (T__75 - 69)) | (1L << (T__78 - 69)) | (1L << (T__79 - 69)) | (1L << (T__80 - 69)) | (1L << (T__81 - 69)) | (1L << (T__93 - 69)) | (1L << (T__94 - 69)) | (1L << (T__96 - 69)) | (1L << (Regular_identifier - 69)) | (1L << (AT - 69)) | (1L << (Implicit_parameter_name - 69)))) != 0)) {
				{
				setState(1621);
				declarations();
				}
			}

			setState(1624);
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
		enterRule(_localctx, 312, RULE_subscript_declaration);
		try {
			setState(1638);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1626);
				subscript_head();
				setState(1627);
				subscript_result();
				setState(1628);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1630);
				subscript_head();
				setState(1631);
				subscript_result();
				setState(1632);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1634);
				subscript_head();
				setState(1635);
				subscript_result();
				setState(1636);
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
		enterRule(_localctx, 314, RULE_subscript_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1640);
				attributes();
				}
				break;
			}
			setState(1644);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__56 - 41)) | (1L << (T__58 - 41)) | (1L << (T__59 - 41)) | (1L << (T__65 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__78 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)))) != 0)) {
				{
				setState(1643);
				declaration_modifiers();
				}
			}

			setState(1646);
			match(T__55);
			setState(1647);
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
		enterRule(_localctx, 316, RULE_subscript_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			arrow_operator();
			setState(1651);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1650);
				attributes();
				}
				break;
			}
			setState(1653);
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
		enterRule(_localctx, 318, RULE_operator_declaration);
		try {
			setState(1658);
			switch (_input.LA(1)) {
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(1655);
				prefix_operator_declaration();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				postfix_operator_declaration();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(1657);
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
		enterRule(_localctx, 320, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			match(T__56);
			setState(1661);
			match(T__57);
			setState(1662);
			operator();
			setState(1663);
			match(LCURLY);
			setState(1664);
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
		enterRule(_localctx, 322, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(T__58);
			setState(1667);
			match(T__57);
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
		enterRule(_localctx, 324, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			match(T__59);
			setState(1673);
			match(T__57);
			setState(1674);
			operator();
			setState(1675);
			match(LCURLY);
			setState(1676);
			infix_operator_attributes();
			setState(1677);
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
		enterRule(_localctx, 326, RULE_infix_operator_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_la = _input.LA(1);
			if (_la==T__60) {
				{
				setState(1679);
				precedence_clause();
				}
			}

			setState(1683);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(1682);
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
		enterRule(_localctx, 328, RULE_precedence_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			match(T__60);
			setState(1686);
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
		enterRule(_localctx, 330, RULE_precedence_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
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
		enterRule(_localctx, 332, RULE_associativity_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			match(T__61);
			setState(1691);
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
		enterRule(_localctx, 334, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (T__64 - 63)))) != 0)) ) {
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
		enterRule(_localctx, 336, RULE_declaration_modifier);
		try {
			setState(1720);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1695);
				match(T__40);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				match(T__65);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1697);
				match(T__66);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1698);
				match(T__67);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1699);
				match(T__59);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1700);
				match(T__68);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1701);
				match(T__69);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1702);
				match(T__70);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1703);
				match(T__71);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1704);
				match(T__72);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1705);
				match(T__58);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1706);
				match(T__56);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1707);
				match(T__73);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1708);
				match(T__74);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1709);
				match(T__75);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1710);
				match(T__75);
				setState(1711);
				match(LPAREN);
				setState(1712);
				match(T__76);
				setState(1713);
				match(RPAREN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1714);
				match(T__75);
				setState(1715);
				match(LPAREN);
				setState(1716);
				match(T__77);
				setState(1717);
				match(RPAREN);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1718);
				match(T__78);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1719);
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
		enterRule(_localctx, 338, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			declaration_modifier();
			setState(1724);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__56 - 41)) | (1L << (T__58 - 41)) | (1L << (T__59 - 41)) | (1L << (T__65 - 41)) | (1L << (T__66 - 41)) | (1L << (T__67 - 41)) | (1L << (T__68 - 41)) | (1L << (T__69 - 41)) | (1L << (T__70 - 41)) | (1L << (T__71 - 41)) | (1L << (T__72 - 41)) | (1L << (T__73 - 41)) | (1L << (T__74 - 41)) | (1L << (T__75 - 41)) | (1L << (T__78 - 41)) | (1L << (T__79 - 41)) | (1L << (T__80 - 41)) | (1L << (T__81 - 41)))) != 0)) {
				{
				setState(1723);
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
		enterRule(_localctx, 340, RULE_access_level_modifier);
		try {
			setState(1741);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1726);
				match(T__79);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1727);
				match(T__79);
				setState(1728);
				match(LPAREN);
				setState(1729);
				match(T__45);
				setState(1730);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1731);
				match(T__80);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1732);
				match(T__80);
				setState(1733);
				match(LPAREN);
				setState(1734);
				match(T__45);
				setState(1735);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1736);
				match(T__81);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1737);
				match(T__81);
				setState(1738);
				match(LPAREN);
				setState(1739);
				match(T__45);
				setState(1740);
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
		int _startState = 342;
		enterRecursionRule(_localctx, 342, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1744);
				wildcard_pattern();
				setState(1746);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1745);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1748);
				identifier_pattern();
				setState(1750);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1749);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1752);
				value_binding_pattern();
				}
				break;
			case 4:
				{
				setState(1753);
				tuple_pattern();
				setState(1755);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1754);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1757);
				enum_case_pattern();
				}
				break;
			case 6:
				{
				setState(1758);
				optional_pattern();
				}
				break;
			case 7:
				{
				setState(1759);
				match(T__82);
				setState(1760);
				type(0);
				}
				break;
			case 8:
				{
				setState(1761);
				expression_pattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1764);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1765);
					match(T__83);
					setState(1766);
					type(0);
					}
					} 
				}
				setState(1771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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
		enterRule(_localctx, 344, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
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
		enterRule(_localctx, 346, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
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
		enterRule(_localctx, 348, RULE_value_binding_pattern);
		try {
			setState(1780);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(1776);
				match(T__5);
				setState(1777);
				pattern(0);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				match(T__4);
				setState(1779);
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
		enterRule(_localctx, 350, RULE_tuple_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(LPAREN);
			setState(1784);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1783);
				tuple_pattern_element_list();
				}
				break;
			}
			setState(1786);
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
		enterRule(_localctx, 352, RULE_tuple_pattern_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			tuple_pattern_element();
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1789);
				match(COMMA);
				setState(1790);
				tuple_pattern_element();
				}
				}
				setState(1795);
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
		enterRule(_localctx, 354, RULE_tuple_pattern_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
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
		enterRule(_localctx, 356, RULE_enum_case_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(1798);
				type_identifier();
				}
			}

			setState(1801);
			match(DOT);
			setState(1802);
			enum_case_name();
			setState(1804);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1803);
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
		enterRule(_localctx, 358, RULE_optional_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			identifier_pattern();
			setState(1807);
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
		enterRule(_localctx, 360, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
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
		enterRule(_localctx, 362, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1811);
				match(AT);
				}
			}

			setState(1814);
			attribute_name();
			setState(1816);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1815);
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
		enterRule(_localctx, 364, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
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
		enterRule(_localctx, 366, RULE_attribute_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(LPAREN);
			setState(1822);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1821);
				balanced_tokens();
				}
				break;
			}
			setState(1824);
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
		enterRule(_localctx, 368, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1827); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1826);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1829); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
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
		enterRule(_localctx, 370, RULE_balanced_tokens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1832); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1831);
					balanced_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1834); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
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
		enterRule(_localctx, 372, RULE_balanced_token);
		try {
			setState(1856);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				match(LPAREN);
				setState(1838);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1837);
					balanced_tokens();
					}
					break;
				}
				setState(1840);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1841);
				match(LBRACK);
				setState(1843);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1842);
					balanced_tokens();
					}
					break;
				}
				setState(1845);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1846);
				match(LCURLY);
				setState(1848);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1847);
					balanced_tokens();
					}
					break;
				}
				setState(1850);
				match(RCURLY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1851);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1852);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1853);
				context_sensitive_keyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1854);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1855);
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
		enterRule(_localctx, 374, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1858);
				try_operator();
				}
				break;
			}
			setState(1861);
			prefix_expression();
			setState(1863);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1862);
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
		enterRule(_localctx, 376, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			expression();
			setState(1870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1866);
				match(COMMA);
				setState(1867);
				expression();
				}
				}
				setState(1872);
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
		enterRule(_localctx, 378, RULE_prefix_expression);
		try {
			setState(1878);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1873);
				prefix_operator();
				setState(1874);
				postfix_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1876);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1877);
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
		enterRule(_localctx, 380, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			match(AND);
			setState(1881);
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
		enterRule(_localctx, 382, RULE_try_operator);
		try {
			setState(1888);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1883);
				match(T__84);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1884);
				match(T__84);
				setState(1885);
				match(QUESTION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1886);
				match(T__84);
				setState(1887);
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
		enterRule(_localctx, 384, RULE_binary_expression);
		try {
			setState(1900);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1890);
				binary_operator();
				setState(1891);
				prefix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1893);
				conditional_operator();
				setState(1895);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1894);
					try_operator();
					}
					break;
				}
				setState(1897);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1899);
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
		enterRule(_localctx, 386, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1903); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1902);
					binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1905); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
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
		enterRule(_localctx, 388, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			match(QUESTION);
			setState(1909);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1908);
				try_operator();
				}
				break;
			}
			setState(1911);
			expression();
			setState(1912);
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
		enterRule(_localctx, 390, RULE_type_casting_operator);
		try {
			setState(1924);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1914);
				match(T__82);
				setState(1915);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1916);
				match(T__83);
				setState(1917);
				type(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1918);
				match(T__83);
				setState(1919);
				match(QUESTION);
				setState(1920);
				type(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1921);
				match(T__83);
				setState(1922);
				match(BANG);
				setState(1923);
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
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
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
		enterRule(_localctx, 392, RULE_primary_expression);
		try {
			setState(1935);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1926);
				identifier();
				setState(1928);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1927);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1930);
				literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1931);
				closure_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1932);
				parenthesized_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1933);
				wildcard_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1934);
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
		enterRule(_localctx, 394, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			match(DOT);
			setState(1938);
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
		enterRule(_localctx, 396, RULE_literal_expression);
		try {
			setState(1947);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1940);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1941);
				array_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1942);
				dictionary_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1943);
				match(T__85);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1944);
				match(T__86);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1945);
				match(T__87);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1946);
				match(T__88);
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
		enterRule(_localctx, 398, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			match(LBRACK);
			setState(1951);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1950);
				array_literal_items();
				}
				break;
			}
			setState(1953);
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
		enterRule(_localctx, 400, RULE_array_literal_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			array_literal_item();
			setState(1960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1956);
					match(COMMA);
					setState(1957);
					array_literal_item();
					}
					} 
				}
				setState(1962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			setState(1964);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1963);
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
		enterRule(_localctx, 402, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
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
		enterRule(_localctx, 404, RULE_dictionary_literal);
		try {
			setState(1973);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1968);
				match(LBRACK);
				setState(1969);
				dictionary_literal_items();
				setState(1970);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1972);
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
		enterRule(_localctx, 406, RULE_dictionary_literal_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			dictionary_literal_item();
			setState(1980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1976);
					match(COMMA);
					setState(1977);
					dictionary_literal_item();
					}
					} 
				}
				setState(1982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			}
			setState(1984);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1983);
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
		enterRule(_localctx, 408, RULE_dictionary_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			expression();
			setState(1987);
			match(COLON);
			setState(1988);
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
		enterRule(_localctx, 410, RULE_empty_dictionary_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			match(LBRACK);
			setState(1991);
			match(COLON);
			setState(1992);
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

	public static class Closure_expressionContext extends ParserRuleContext {
		public Explicit_closure_expressionContext explicit_closure_expression() {
			return getRuleContext(Explicit_closure_expressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
		enterRule(_localctx, 412, RULE_closure_expression);
		try {
			setState(1996);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1994);
				explicit_closure_expression();
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
				setState(1995);
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

	public static class Explicit_closure_expressionContext extends ParserRuleContext {
		public Closure_signatureContext closure_signature() {
			return getRuleContext(Closure_signatureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Explicit_closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_closure_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_closure_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_closure_expressionContext explicit_closure_expression() throws RecognitionException {
		Explicit_closure_expressionContext _localctx = new Explicit_closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_explicit_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1998);
			match(LCURLY);
			setState(2000);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1999);
				closure_signature();
				}
				break;
			}
			setState(2003);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(2002);
				statements();
				}
				break;
			}
			setState(2005);
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
		enterRule(_localctx, 416, RULE_closure_signature);
		try {
			setState(2036);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2007);
				parameter_clause();
				setState(2009);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2008);
					function_result();
					}
					break;
				}
				setState(2011);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
				identifier_list();
				setState(2015);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2014);
					function_result();
					}
					break;
				}
				setState(2017);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2019);
				capture_list();
				setState(2020);
				parameter_clause();
				setState(2022);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(2021);
					function_result();
					}
					break;
				}
				setState(2024);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2026);
				capture_list();
				setState(2027);
				identifier_list();
				setState(2029);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(2028);
					function_result();
					}
					break;
				}
				setState(2031);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2033);
				capture_list();
				setState(2034);
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
		enterRule(_localctx, 418, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			match(LBRACK);
			setState(2039);
			capture_list_items();
			setState(2040);
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
		enterRule(_localctx, 420, RULE_capture_list_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			capture_list_item();
			setState(2047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2043);
				match(COMMA);
				setState(2044);
				capture_list_item();
				}
				}
				setState(2049);
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
		enterRule(_localctx, 422, RULE_capture_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2050);
				capture_specifier();
				}
				break;
			}
			setState(2053);
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
		enterRule(_localctx, 424, RULE_capture_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__78 - 76)) | (1L << (T__89 - 76)) | (1L << (T__90 - 76)))) != 0)) ) {
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
		enterRule(_localctx, 426, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
			match(LPAREN);
			setState(2059);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2058);
				expression_element_list();
				}
				break;
			}
			setState(2061);
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
		enterRule(_localctx, 428, RULE_expression_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
			expression_element();
			setState(2068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2064);
				match(COMMA);
				setState(2065);
				expression_element();
				}
				}
				setState(2070);
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
		enterRule(_localctx, 430, RULE_expression_element);
		try {
			setState(2076);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2071);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2072);
				identifier();
				setState(2073);
				match(COLON);
				setState(2074);
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
		enterRule(_localctx, 432, RULE_wildcard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
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
		enterRule(_localctx, 434, RULE_selector_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			match(T__91);
			setState(2081);
			match(LPAREN);
			setState(2082);
			expression();
			setState(2083);
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
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Chain_postfix_expressionContext chain_postfix_expression() {
			return getRuleContext(Chain_postfix_expressionContext.class,0);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_expression(this);
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
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_postfix_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2086);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2092);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Postfix_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
					setState(2088);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2089);
					chain_postfix_expression();
					}
					} 
				}
				setState(2094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
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

	public static class Chain_postfix_expressionContext extends ParserRuleContext {
		public Chain_postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain_postfix_expression; }
	 
		public Chain_postfix_expressionContext() { }
		public void copyFrom(Chain_postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Function_call_with_closure_expressionContext extends Chain_postfix_expressionContext {
		public Trailing_closureContext trailing_closure() {
			return getRuleContext(Trailing_closureContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Function_call_with_closure_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_call_with_closure_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Initializer_expression_with_argsContext extends Chain_postfix_expressionContext {
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public Initializer_expression_with_argsContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_expression_with_args(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expressionContext extends Chain_postfix_expressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Explicit_member_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_member_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Chain_postfix_operatorContext extends Chain_postfix_expressionContext {
		public Postfix_operatorContext postfix_operator() {
			return getRuleContext(Postfix_operatorContext.class,0);
		}
		public Chain_postfix_operatorContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitChain_postfix_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_call_expressionContext extends Chain_postfix_expressionContext {
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Function_call_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression_number_doubleContext extends Chain_postfix_expressionContext {
		public TerminalNode Floating_point_literal() { return getToken(SwiftParser.Floating_point_literal, 0); }
		public Explicit_member_expression_number_doubleContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_member_expression_number_double(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Subscript_expressionContext extends Chain_postfix_expressionContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Subscript_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Initializer_expressionContext extends Chain_postfix_expressionContext {
		public Initializer_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dynamic_type_expressionContext extends Chain_postfix_expressionContext {
		public Dynamic_type_expressionContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDynamic_type_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Explicit_member_expression_numberContext extends Chain_postfix_expressionContext {
		public TerminalNode Decimal_literal() { return getToken(SwiftParser.Decimal_literal, 0); }
		public Explicit_member_expression_numberContext(Chain_postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExplicit_member_expression_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chain_postfix_expressionContext chain_postfix_expression() throws RecognitionException {
		Chain_postfix_expressionContext _localctx = new Chain_postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_chain_postfix_expression);
		int _la;
		try {
			setState(2151);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				_localctx = new Function_call_with_closure_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2096);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2095);
					match(QUESTION);
					}
				}

				setState(2099);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2098);
					parenthesized_expression();
					}
				}

				setState(2101);
				trailing_closure();
				}
				break;
			case 2:
				_localctx = new Function_call_expressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2103);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2102);
					match(QUESTION);
					}
				}

				setState(2105);
				parenthesized_expression();
				}
				break;
			case 3:
				_localctx = new Initializer_expressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2107);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2106);
					match(QUESTION);
					}
				}

				setState(2109);
				match(DOT);
				setState(2110);
				match(T__52);
				}
				break;
			case 4:
				_localctx = new Initializer_expression_with_argsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2112);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2111);
					match(QUESTION);
					}
				}

				setState(2114);
				match(DOT);
				setState(2115);
				match(T__52);
				setState(2116);
				match(LPAREN);
				setState(2117);
				argument_names();
				setState(2118);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new Explicit_member_expressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2121);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2120);
					match(QUESTION);
					}
				}

				setState(2123);
				match(DOT);
				setState(2124);
				identifier();
				setState(2126);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2125);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new Explicit_member_expression_numberContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2129);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2128);
					match(QUESTION);
					}
				}

				setState(2131);
				match(DOT);
				setState(2132);
				match(Decimal_literal);
				}
				break;
			case 7:
				_localctx = new Explicit_member_expression_number_doubleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2134);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2133);
					match(QUESTION);
					}
				}

				setState(2136);
				match(DOT);
				setState(2137);
				match(Floating_point_literal);
				}
				break;
			case 8:
				_localctx = new Dynamic_type_expressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2139);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2138);
					match(QUESTION);
					}
				}

				setState(2141);
				match(DOT);
				setState(2142);
				match(T__92);
				}
				break;
			case 9:
				_localctx = new Subscript_expressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2144);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2143);
					match(QUESTION);
					}
				}

				setState(2146);
				match(LBRACK);
				setState(2147);
				expression_list();
				setState(2148);
				match(RBRACK);
				}
				break;
			case 10:
				_localctx = new Chain_postfix_operatorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2150);
				postfix_operator();
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
		enterRule(_localctx, 440, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
			argument_name();
			setState(2155);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==Implicit_parameter_name) {
				{
				setState(2154);
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
		enterRule(_localctx, 442, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			identifier();
			setState(2158);
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
		public Explicit_closure_expressionContext explicit_closure_expression() {
			return getRuleContext(Explicit_closure_expressionContext.class,0);
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
		enterRule(_localctx, 444, RULE_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
			explicit_closure_expression();
			}
		}
		catch (RecognitionException re) {
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
		public Optional_typeContext optional_type() {
			return getRuleContext(Optional_typeContext.class,0);
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
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(2163);
				array_definition();
				}
				break;
			case 2:
				{
				setState(2164);
				dictionary_definition();
				}
				break;
			case 3:
				{
				setState(2165);
				type_identifier();
				}
				break;
			case 4:
				{
				setState(2166);
				tuple_type();
				}
				break;
			case 5:
				{
				setState(2167);
				protocol_composition_type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2192);
					switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2170);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2172);
						switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
						case 1:
							{
							setState(2171);
							match(T__48);
							}
							break;
						}
						setState(2174);
						arrow_operator();
						setState(2175);
						type(10);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2178);
						match(T__49);
						setState(2179);
						arrow_operator();
						setState(2180);
						type(9);
						}
						break;
					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2182);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2183);
						optional_type();
						}
						break;
					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2184);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2185);
						match(BANG);
						}
						break;
					case 5:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2187);
						match(DOT);
						setState(2188);
						match(T__93);
						}
						break;
					case 6:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2189);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2190);
						match(DOT);
						setState(2191);
						match(T__94);
						}
						break;
					}
					} 
				}
				setState(2196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
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

	public static class Optional_typeContext extends ParserRuleContext {
		public Optional_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOptional_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_typeContext optional_type() throws RecognitionException {
		Optional_typeContext _localctx = new Optional_typeContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_optional_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
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
		enterRule(_localctx, 450, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			match(LBRACK);
			setState(2200);
			type(0);
			setState(2201);
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
		enterRule(_localctx, 452, RULE_dictionary_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2203);
			match(LBRACK);
			setState(2204);
			type(0);
			setState(2205);
			match(COLON);
			setState(2206);
			type(0);
			setState(2207);
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
		public InoutContext inout() {
			return getRuleContext(InoutContext.class,0);
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
		enterRule(_localctx, 454, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2209);
			match(COLON);
			setState(2211);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(2210);
				attributes();
				}
				break;
			}
			setState(2214);
			_la = _input.LA(1);
			if (_la==T__95) {
				{
				setState(2213);
				inout();
				}
			}

			setState(2216);
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

	public static class InoutContext extends ParserRuleContext {
		public InoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inout; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InoutContext inout() throws RecognitionException {
		InoutContext _localctx = new InoutContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_inout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			match(T__95);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 458, RULE_type_identifier);
		int _la;
		try {
			setState(2231);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2220);
				type_name();
				setState(2222);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2221);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2224);
				type_name();
				setState(2226);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2225);
					generic_argument_clause();
					}
				}

				setState(2228);
				match(DOT);
				setState(2229);
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
		enterRule(_localctx, 460, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233);
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
		enterRule(_localctx, 462, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			match(LPAREN);
			setState(2237);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__50 - 43)) | (1L << (T__56 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__59 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)) | (1L << (T__66 - 43)) | (1L << (T__67 - 43)) | (1L << (T__68 - 43)) | (1L << (T__69 - 43)) | (1L << (T__70 - 43)) | (1L << (T__71 - 43)) | (1L << (T__72 - 43)) | (1L << (T__73 - 43)) | (1L << (T__75 - 43)) | (1L << (T__78 - 43)) | (1L << (T__93 - 43)) | (1L << (T__94 - 43)) | (1L << (T__95 - 43)) | (1L << (T__96 - 43)) | (1L << (Regular_identifier - 43)) | (1L << (LPAREN - 43)) | (1L << (LBRACK - 43)))) != 0) || _la==AT || _la==Implicit_parameter_name) {
				{
				setState(2236);
				tuple_type_body();
				}
			}

			setState(2239);
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
		enterRule(_localctx, 464, RULE_tuple_type_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			tuple_type_element_list();
			setState(2243);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2242);
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
		enterRule(_localctx, 466, RULE_tuple_type_element_list);
		try {
			setState(2250);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2245);
				tuple_type_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2246);
				tuple_type_element();
				setState(2247);
				match(COMMA);
				setState(2248);
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
		enterRule(_localctx, 468, RULE_tuple_type_element);
		int _la;
		try {
			setState(2265);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2253);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2252);
					attributes();
					}
					break;
				}
				setState(2256);
				_la = _input.LA(1);
				if (_la==T__95) {
					{
					setState(2255);
					match(T__95);
					}
				}

				setState(2258);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2260);
				_la = _input.LA(1);
				if (_la==T__95) {
					{
					setState(2259);
					match(T__95);
					}
				}

				setState(2262);
				element_name();
				setState(2263);
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
		enterRule(_localctx, 470, RULE_element_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
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
		enterRule(_localctx, 472, RULE_protocol_composition_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2269);
			match(T__42);
			setState(2270);
			match(LT);
			setState(2272);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)) | (1L << (T__96 - 45)) | (1L << (Regular_identifier - 45)))) != 0) || _la==COMMA || _la==Implicit_parameter_name) {
				{
				setState(2271);
				protocol_identifier_list();
				}
			}

			setState(2274);
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
		enterRule(_localctx, 474, RULE_protocol_identifier_list);
		int _la;
		try {
			setState(2283);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
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
			case T__75:
			case T__78:
			case T__93:
			case T__94:
			case T__96:
			case Regular_identifier:
			case Implicit_parameter_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(2276);
				protocol_identifier();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(2279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2277);
					match(COMMA);
					setState(2278);
					protocol_identifier();
					}
					}
					setState(2281); 
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
		enterRule(_localctx, 476, RULE_protocol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
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
		public Type_inheritance_symbolContext type_inheritance_symbol() {
			return getRuleContext(Type_inheritance_symbolContext.class,0);
		}
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
		enterRule(_localctx, 478, RULE_type_inheritance_clause);
		try {
			setState(2298);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2287);
				type_inheritance_symbol();
				setState(2288);
				class_requirement();
				setState(2289);
				match(COMMA);
				setState(2290);
				type_inheritance_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2292);
				type_inheritance_symbol();
				setState(2293);
				class_requirement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2295);
				type_inheritance_symbol();
				setState(2296);
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

	public static class Type_inheritance_symbolContext extends ParserRuleContext {
		public Type_inheritance_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_symbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_inheritance_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_symbolContext type_inheritance_symbol() throws RecognitionException {
		Type_inheritance_symbolContext _localctx = new Type_inheritance_symbolContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_type_inheritance_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
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
		enterRule(_localctx, 482, RULE_type_inheritance_list);
		try {
			setState(2307);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2302);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2303);
				type_identifier();
				setState(2304);
				match(COMMA);
				setState(2305);
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
		enterRule(_localctx, 484, RULE_class_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
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
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Escaped_parameterContext extends IdentifierContext {
		public TerminalNode Regular_identifier() { return getToken(SwiftParser.Regular_identifier, 0); }
		public Escaped_parameterContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEscaped_parameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Implicit_parameterContext extends IdentifierContext {
		public TerminalNode Implicit_parameter_name() { return getToken(SwiftParser.Implicit_parameter_name, 0); }
		public Implicit_parameterContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImplicit_parameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Regular_parameterContext extends IdentifierContext {
		public TerminalNode Regular_identifier() { return getToken(SwiftParser.Regular_identifier, 0); }
		public Regular_parameterContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRegular_parameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Context_sensitive_keyword_parameterContext extends IdentifierContext {
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public Context_sensitive_keyword_parameterContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitContext_sensitive_keyword_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_identifier);
		try {
			setState(2317);
			switch (_input.LA(1)) {
			case Regular_identifier:
				_localctx = new Regular_parameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2311);
				match(Regular_identifier);
				}
				break;
			case T__96:
				_localctx = new Escaped_parameterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2312);
				match(T__96);
				setState(2313);
				match(Regular_identifier);
				setState(2314);
				match(T__96);
				}
				break;
			case Implicit_parameter_name:
				_localctx = new Implicit_parameterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2315);
				match(Implicit_parameter_name);
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__50:
			case T__56:
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
			case T__75:
			case T__78:
			case T__93:
			case T__94:
				_localctx = new Context_sensitive_keyword_parameterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2316);
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
		enterRule(_localctx, 488, RULE_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			identifier();
			setState(2324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2320);
					match(COMMA);
					setState(2321);
					identifier();
					}
					} 
				}
				setState(2326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
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
		enterRule(_localctx, 490, RULE_context_sensitive_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			_la = _input.LA(1);
			if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__45 - 45)) | (1L << (T__46 - 45)) | (1L << (T__47 - 45)) | (1L << (T__50 - 45)) | (1L << (T__56 - 45)) | (1L << (T__57 - 45)) | (1L << (T__58 - 45)) | (1L << (T__59 - 45)) | (1L << (T__60 - 45)) | (1L << (T__61 - 45)) | (1L << (T__62 - 45)) | (1L << (T__63 - 45)) | (1L << (T__64 - 45)) | (1L << (T__65 - 45)) | (1L << (T__66 - 45)) | (1L << (T__67 - 45)) | (1L << (T__68 - 45)) | (1L << (T__69 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)) | (1L << (T__72 - 45)) | (1L << (T__73 - 45)) | (1L << (T__75 - 45)) | (1L << (T__78 - 45)) | (1L << (T__93 - 45)) | (1L << (T__94 - 45)))) != 0)) ) {
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
		enterRule(_localctx, 492, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2329);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2330);
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
		enterRule(_localctx, 494, RULE_negate_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2333);
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
		enterRule(_localctx, 496, RULE_build_AND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			if (!(SwiftSupport.isOperator(_input,"&&"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"&&\")");
			setState(2336);
			match(AND);
			setState(2337);
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
		enterRule(_localctx, 498, RULE_build_OR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			if (!(SwiftSupport.isOperator(_input,"||"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"||\")");
			setState(2340);
			match(OR);
			setState(2341);
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
		enterRule(_localctx, 500, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			if (!(SwiftSupport.isOperator(_input,"->"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"->\")");
			setState(2344);
			match(SUB);
			setState(2345);
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
		enterRule(_localctx, 502, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			if (!(SwiftSupport.isOperator(_input,"..."))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"...\")");
			setState(2348);
			match(DOT);
			setState(2349);
			match(DOT);
			setState(2350);
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
		enterRule(_localctx, 504, RULE_same_type_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2352);
			if (!(SwiftSupport.isOperator(_input,"=="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"==\")");
			setState(2353);
			match(EQUAL);
			setState(2354);
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
		enterRule(_localctx, 506, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2357);
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
		enterRule(_localctx, 508, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2360);
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
		enterRule(_localctx, 510, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
			setState(2363);
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
		enterRule(_localctx, 512, RULE_operator);
		try {
			int _alt;
			setState(2381);
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
				setState(2365);
				operator_head();
				setState(2370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2366);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2367);
						operator_character();
						}
						} 
					}
					setState(2372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2373);
				dot_operator_head();
				setState(2378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2374);
						if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
						setState(2375);
						dot_operator_character();
						}
						} 
					}
					setState(2380);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
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
		enterRule(_localctx, 514, RULE_operator_character);
		try {
			setState(2385);
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
				setState(2383);
				operator_head();
				}
				break;
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2384);
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
		enterRule(_localctx, 516, RULE_operator_head);
		int _la;
		try {
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
				enterOuterAlt(_localctx, 1);
				{
				setState(2387);
				_la = _input.LA(1);
				if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (LT - 113)) | (1L << (GT - 113)) | (1L << (BANG - 113)) | (1L << (QUESTION - 113)) | (1L << (AND - 113)) | (1L << (SUB - 113)) | (1L << (EQUAL - 113)) | (1L << (OR - 113)) | (1L << (DIV - 113)) | (1L << (ADD - 113)) | (1L << (MUL - 113)) | (1L << (MOD - 113)) | (1L << (CARET - 113)) | (1L << (TILDE - 113)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(2388);
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
		enterRule(_localctx, 518, RULE_dot_operator_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2391);
			match(DOT);
			setState(2392);
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
		enterRule(_localctx, 520, RULE_dot_operator_character);
		try {
			setState(2396);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2394);
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
				setState(2395);
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
		enterRule(_localctx, 522, RULE_literal);
		try {
			setState(2402);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2398);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2399);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2400);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2401);
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
		enterRule(_localctx, 524, RULE_numeric_literal);
		try {
			setState(2412);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2405);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2404);
					negate_prefix_operator();
					}
					break;
				}
				setState(2407);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2409);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2408);
					negate_prefix_operator();
					}
					break;
				}
				setState(2411);
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
		enterRule(_localctx, 526, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			_la = _input.LA(1);
			if ( !(_la==T__97 || _la==T__98) ) {
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
		enterRule(_localctx, 528, RULE_nil_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
			match(T__99);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 530, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			_la = _input.LA(1);
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Binary_literal - 132)) | (1L << (Octal_literal - 132)) | (1L << (Decimal_literal - 132)) | (1L << (Pure_decimal_digits - 132)) | (1L << (Hexadecimal_literal - 132)))) != 0)) ) {
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
		enterRule(_localctx, 532, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2420);
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
		case 171:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 218:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		case 223:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 246:
			return assignment_operator_sempred((Assignment_operatorContext)_localctx, predIndex);
		case 247:
			return negate_prefix_operator_sempred((Negate_prefix_operatorContext)_localctx, predIndex);
		case 248:
			return build_AND_sempred((Build_ANDContext)_localctx, predIndex);
		case 249:
			return build_OR_sempred((Build_ORContext)_localctx, predIndex);
		case 250:
			return arrow_operator_sempred((Arrow_operatorContext)_localctx, predIndex);
		case 251:
			return range_operator_sempred((Range_operatorContext)_localctx, predIndex);
		case 252:
			return same_type_equals_sempred((Same_type_equalsContext)_localctx, predIndex);
		case 253:
			return binary_operator_sempred((Binary_operatorContext)_localctx, predIndex);
		case 254:
			return prefix_operator_sempred((Prefix_operatorContext)_localctx, predIndex);
		case 255:
			return postfix_operator_sempred((Postfix_operatorContext)_localctx, predIndex);
		case 256:
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
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignment_operator_sempred(Assignment_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean negate_prefix_operator_sempred(Negate_prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean build_AND_sempred(Build_ANDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return SwiftSupport.isOperator(_input,"&&");
		}
		return true;
	}
	private boolean build_OR_sempred(Build_ORContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return SwiftSupport.isOperator(_input,"||");
		}
		return true;
	}
	private boolean arrow_operator_sempred(Arrow_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return SwiftSupport.isOperator(_input,"->");
		}
		return true;
	}
	private boolean range_operator_sempred(Range_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return SwiftSupport.isOperator(_input,"...");
		}
		return true;
	}
	private boolean same_type_equals_sempred(Same_type_equalsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return SwiftSupport.isOperator(_input,"==");
		}
		return true;
	}
	private boolean binary_operator_sempred(Binary_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean prefix_operator_sempred(Prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean postfix_operator_sempred(Postfix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean operator_sempred(OperatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return _input.get(_input.index()-1).getType()!=WS;
		case 21:
			return _input.get(_input.index()-1).getType()!=WS;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0090\u0979\4\2\t"+
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
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b\4\u010c"+
		"\t\u010c\3\2\7\2\u021a\n\2\f\2\16\2\u021d\13\2\3\2\3\2\3\3\3\3\5\3\u0223"+
		"\n\3\3\3\3\3\5\3\u0227\n\3\3\3\3\3\5\3\u022b\n\3\3\3\3\3\5\3\u022f\n\3"+
		"\3\3\3\3\5\3\u0233\n\3\3\3\3\3\5\3\u0237\n\3\3\3\3\3\5\3\u023b\n\3\3\3"+
		"\3\3\5\3\u023f\n\3\3\3\5\3\u0242\n\3\3\4\6\4\u0245\n\4\r\4\16\4\u0246"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u024f\n\6\3\7\3\7\5\7\u0253\n\7\3\7\3\7\5"+
		"\7\u0257\n\7\3\7\3\7\5\7\u025b\n\7\3\7\3\7\3\7\3\7\5\7\u0261\n\7\3\7\3"+
		"\7\5\7\u0265\n\7\3\7\3\7\5\7\u0269\n\7\3\7\3\7\5\7\u026d\n\7\3\b\3\b\5"+
		"\b\u0271\n\b\3\t\3\t\5\t\u0275\n\t\3\t\3\t\3\t\3\t\5\t\u027b\n\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u028d\n\13\3\f\3\f\3\f\7\f\u0292\n\f\f\f\16\f\u0295\13\f\3\r\3\r\3"+
		"\r\5\r\u029a\n\r\3\16\3\16\3\16\3\16\5\16\u02a0\n\16\3\17\3\17\5\17\u02a4"+
		"\n\17\3\17\5\17\u02a7\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u02b1\n\20\3\21\3\21\3\21\3\21\7\21\u02b7\n\21\f\21\16\21\u02ba\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u02c4\n\23\3\24\3\24\3\24"+
		"\3\24\5\24\u02ca\n\24\3\25\3\25\3\25\3\25\5\25\u02d0\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u02db\n\27\3\27\3\27\3\30\3\30"+
		"\5\30\u02e1\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02e9\n\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\5\33\u02f1\n\33\3\33\3\33\5\33\u02f5\n\33\3\33"+
		"\3\33\3\33\5\33\u02fa\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u030d\n\37\3 \3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\5\"\u0319\n\"\3#\3#\5#\u031d\n#\3$\3$\5$\u0321\n"+
		"$\3%\3%\3&\3&\5&\u0327\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u0331\n(\f("+
		"\16(\u0334\13(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\5,\u0341\n,\3-\3-\5-\u0345"+
		"\n-\3.\3.\5.\u0349\n.\3.\5.\u034c\n.\3.\3.\3/\3/\5/\u0352\n/\3\60\3\60"+
		"\3\60\5\60\u0357\n\60\3\60\5\60\u035a\n\60\3\60\5\60\u035d\n\60\3\60\3"+
		"\60\3\61\3\61\5\61\u0363\n\61\3\62\3\62\3\62\5\62\u0368\n\62\3\63\3\63"+
		"\5\63\u036c\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u0378\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0382\n\64\f"+
		"\64\16\64\u0385\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u0391\n\65\3\66\3\66\3\67\3\67\38\38\38\38\38\58\u039c\n8\39\39"+
		"\3:\3:\3;\3;\3;\5;\u03a5\n;\3;\3;\3<\3<\3<\7<\u03ac\n<\f<\16<\u03af\13"+
		"<\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03ba\n=\3>\3>\3>\3?\3?\3?\3?\3?\5?\u03c4"+
		"\n?\3@\3@\5@\u03c8\n@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u03d2\nA\3B\3B\3B\3B"+
		"\3C\3C\3C\3C\3D\3D\3D\7D\u03df\nD\fD\16D\u03e2\13D\3E\3E\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u03f4\nF\3G\6G\u03f7\nG\rG\16G\u03f8\3"+
		"H\5H\u03fc\nH\3I\3I\5I\u0400\nI\3I\3I\3J\5J\u0405\nJ\3J\3J\5J\u0409\n"+
		"J\3J\3J\3K\3K\3L\3L\3L\3L\3L\5L\u0414\nL\3M\3M\5M\u0418\nM\3N\3N\3N\3"+
		"O\5O\u041e\nO\3O\5O\u0421\nO\3O\3O\3P\3P\3Q\3Q\3Q\7Q\u042a\nQ\fQ\16Q\u042d"+
		"\13Q\3R\3R\5R\u0431\nR\3S\3S\3S\3T\3T\3T\3U\5U\u043a\nU\3U\5U\u043d\n"+
		"U\3U\3U\3V\3V\5V\u0443\nV\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\5Y\u044e\nY\3Y\3"+
		"Y\5Y\u0452\nY\3Z\3Z\3[\3[\3[\5[\u0459\n[\3[\3[\3[\3[\3[\3[\3[\5[\u0462"+
		"\n[\3\\\5\\\u0465\n\\\3\\\3\\\3\\\3]\5]\u046b\n]\3]\3]\5]\u046f\n]\3]"+
		"\3]\3^\3^\3^\3^\3_\3_\3_\5_\u047a\n_\3_\3_\3_\3_\3_\3_\3_\5_\u0483\n_"+
		"\3`\5`\u0486\n`\3`\3`\3a\5a\u048b\na\3a\3a\3b\3b\3b\5b\u0492\nb\3b\3b"+
		"\3b\3b\3b\3b\3b\5b\u049b\nb\3c\5c\u049e\nc\3c\3c\5c\u04a2\nc\3c\3c\3d"+
		"\5d\u04a7\nd\3d\3d\5d\u04ab\nd\3d\3d\3e\3e\3e\3f\5f\u04b3\nf\3f\5f\u04b6"+
		"\nf\3f\3f\3f\3g\3g\3h\3h\3h\3i\3i\3i\5i\u04c3\ni\3i\3i\5i\u04c7\ni\3j"+
		"\5j\u04ca\nj\3j\5j\u04cd\nj\3j\3j\3k\3k\5k\u04d3\nk\3l\3l\5l\u04d7\nl"+
		"\3l\5l\u04da\nl\3l\3l\3l\5l\u04df\nl\5l\u04e1\nl\3m\3m\5m\u04e5\nm\3m"+
		"\3m\3n\3n\3o\3o\5o\u04ed\no\3p\3p\3p\3p\3p\3p\5p\u04f5\np\3q\3q\3q\7q"+
		"\u04fa\nq\fq\16q\u04fd\13q\3r\5r\u0500\nr\3r\5r\u0503\nr\3r\3r\5r\u0507"+
		"\nr\3r\5r\u050a\nr\3r\3r\5r\u050e\nr\3r\3r\5r\u0512\nr\3r\5r\u0515\nr"+
		"\3r\5r\u0518\nr\3r\3r\3r\3r\5r\u051e\nr\3s\3s\5s\u0522\ns\3t\3t\5t\u0526"+
		"\nt\3u\3u\3u\3v\5v\u052c\nv\3v\5v\u052f\nv\3v\3v\5v\u0533\nv\3v\5v\u0536"+
		"\nv\3v\5v\u0539\nv\3w\5w\u053c\nw\3w\3w\3w\5w\u0541\nw\3w\5w\u0544\nw"+
		"\3w\3w\5w\u0548\nw\3w\3w\3x\3x\5x\u054e\nx\3y\3y\5y\u0552\ny\3z\5z\u0555"+
		"\nz\3z\5z\u0558\nz\3z\3z\3z\3{\3{\3{\3{\3{\5{\u0562\n{\3|\3|\5|\u0566"+
		"\n|\3}\3}\3~\3~\3\177\3\177\3\177\5\177\u056f\n\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\u0080\3\u0080\5\u0080\u0578\n\u0080\3\u0081\3\u0081\5\u0081"+
		"\u057c\n\u0081\3\u0082\5\u0082\u057f\n\u0082\3\u0082\3\u0082\3\u0082\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0589\n\u0083\3\u0084\3"+
		"\u0084\5\u0084\u058d\n\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3"+
		"\u0086\5\u0086\u0595\n\u0086\3\u0087\5\u0087\u0598\n\u0087\3\u0087\5\u0087"+
		"\u059b\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05a0\n\u0087\3\u0087\5"+
		"\u0087\u05a3\n\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\5"+
		"\u0089\u05ab\n\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\5\u008b\u05b2"+
		"\n\u008b\3\u008b\5\u008b\u05b5\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u05ba\n\u008b\3\u008b\5\u008b\u05bd\n\u008b\3\u008b\3\u008b\3\u008c\3"+
		"\u008c\3\u008d\3\u008d\5\u008d\u05c5\n\u008d\3\u008d\3\u008d\3\u008e\5"+
		"\u008e\u05ca\n\u008e\3\u008e\5\u008e\u05cd\n\u008e\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u05d2\n\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\5\u0090\u05da\n\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u05e3\n\u0091\3\u0092\3\u0092\5\u0092\u05e7\n\u0092\3"+
		"\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u05f1\n\u0094\3\u0094\3\u0094\3\u0095\3\u0095\5\u0095\u05f7\n\u0095\3"+
		"\u0095\3\u0095\5\u0095\u05fb\n\u0095\3\u0095\3\u0095\5\u0095\u05ff\n\u0095"+
		"\3\u0095\3\u0095\3\u0095\5\u0095\u0604\n\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0097\5\u0097\u060b\n\u0097\3\u0097\5\u0097\u060e\n\u0097\3"+
		"\u0097\3\u0097\3\u0097\5\u0097\u0613\n\u0097\3\u0097\5\u0097\u0616\n\u0097"+
		"\3\u0098\3\u0098\5\u0098\u061a\n\u0098\3\u0098\3\u0098\5\u0098\u061e\n"+
		"\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0624\n\u0098\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\5\u0098\u062a\n\u0098\3\u0099\5\u0099\u062d\n\u0099"+
		"\3\u0099\5\u0099\u0630\n\u0099\3\u0099\3\u0099\5\u0099\u0634\n\u0099\3"+
		"\u0099\5\u0099\u0637\n\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u063c\n\u0099"+
		"\3\u0099\5\u0099\u063f\n\u0099\3\u0099\3\u0099\5\u0099\u0643\n\u0099\3"+
		"\u009a\3\u009a\3\u009b\5\u009b\u0648\n\u009b\3\u009b\3\u009b\3\u009b\3"+
		"\u009c\5\u009c\u064e\n\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0653\n\u009c"+
		"\3\u009c\3\u009c\3\u009d\3\u009d\5\u009d\u0659\n\u009d\3\u009d\3\u009d"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\5\u009e\u0669\n\u009e\3\u009f\5\u009f\u066c\n"+
		"\u009f\3\u009f\5\u009f\u066f\n\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3"+
		"\u00a0\5\u00a0\u0676\n\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\5"+
		"\u00a1\u067d\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\5\u00a5\u0693\n\u00a5\3\u00a5"+
		"\5\u00a5\u0696\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\5\u00aa\u06bb\n\u00aa\3\u00ab\3\u00ab\5\u00ab\u06bf\n"+
		"\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u06d0"+
		"\n\u00ac\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u06d5\n\u00ad\3\u00ad\3\u00ad"+
		"\5\u00ad\u06d9\n\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u06de\n\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u06e5\n\u00ad\3\u00ad\3"+
		"\u00ad\3\u00ad\7\u00ad\u06ea\n\u00ad\f\u00ad\16\u00ad\u06ed\13\u00ad\3"+
		"\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0"+
		"\u06f7\n\u00b0\3\u00b1\3\u00b1\5\u00b1\u06fb\n\u00b1\3\u00b1\3\u00b1\3"+
		"\u00b2\3\u00b2\3\u00b2\7\u00b2\u0702\n\u00b2\f\u00b2\16\u00b2\u0705\13"+
		"\u00b2\3\u00b3\3\u00b3\3\u00b4\5\u00b4\u070a\n\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\5\u00b4\u070f\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3"+
		"\u00b7\5\u00b7\u0717\n\u00b7\3\u00b7\3\u00b7\5\u00b7\u071b\n\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b9\3\u00b9\5\u00b9\u0721\n\u00b9\3\u00b9\3\u00b9\3\u00ba"+
		"\6\u00ba\u0726\n\u00ba\r\u00ba\16\u00ba\u0727\3\u00bb\6\u00bb\u072b\n"+
		"\u00bb\r\u00bb\16\u00bb\u072c\3\u00bc\3\u00bc\5\u00bc\u0731\n\u00bc\3"+
		"\u00bc\3\u00bc\3\u00bc\5\u00bc\u0736\n\u00bc\3\u00bc\3\u00bc\3\u00bc\5"+
		"\u00bc\u073b\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5"+
		"\u00bc\u0743\n\u00bc\3\u00bd\5\u00bd\u0746\n\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u074a\n\u00bd\3\u00be\3\u00be\3\u00be\7\u00be\u074f\n\u00be\f\u00be\16"+
		"\u00be\u0752\13\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u0759\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\5\u00c1\u0763\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u076a\n\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u076f\n\u00c2\3"+
		"\u00c3\6\u00c3\u0772\n\u00c3\r\u00c3\16\u00c3\u0773\3\u00c4\3\u00c4\5"+
		"\u00c4\u0778\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3"+
		"\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0787\n"+
		"\u00c5\3\u00c6\3\u00c6\5\u00c6\u078b\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\5\u00c6\u0792\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u079e\n\u00c8\3"+
		"\u00c9\3\u00c9\5\u00c9\u07a2\n\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3"+
		"\u00ca\7\u00ca\u07a9\n\u00ca\f\u00ca\16\u00ca\u07ac\13\u00ca\3\u00ca\5"+
		"\u00ca\u07af\n\u00ca\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\5\u00cc\u07b8\n\u00cc\3\u00cd\3\u00cd\3\u00cd\7\u00cd\u07bd\n\u00cd"+
		"\f\u00cd\16\u00cd\u07c0\13\u00cd\3\u00cd\5\u00cd\u07c3\n\u00cd\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0"+
		"\5\u00d0\u07cf\n\u00d0\3\u00d1\3\u00d1\5\u00d1\u07d3\n\u00d1\3\u00d1\5"+
		"\u00d1\u07d6\n\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\5\u00d2\u07dc\n\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u07e2\n\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u07e9\n\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\5\u00d2\u07f0\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\5\u00d2\u07f7\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d4"+
		"\3\u00d4\3\u00d4\7\u00d4\u0800\n\u00d4\f\u00d4\16\u00d4\u0803\13\u00d4"+
		"\3\u00d5\5\u00d5\u0806\n\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d7"+
		"\3\u00d7\5\u00d7\u080e\n\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8"+
		"\7\u00d8\u0815\n\u00d8\f\u00d8\16\u00d8\u0818\13\u00d8\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u081f\n\u00d9\3\u00da\3\u00da\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\7\u00dc\u082d\n\u00dc\f\u00dc\16\u00dc\u0830\13\u00dc\3\u00dd\5\u00dd"+
		"\u0833\n\u00dd\3\u00dd\5\u00dd\u0836\n\u00dd\3\u00dd\3\u00dd\5\u00dd\u083a"+
		"\n\u00dd\3\u00dd\3\u00dd\5\u00dd\u083e\n\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\5\u00dd\u0843\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\5\u00dd\u084c\n\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0851\n"+
		"\u00dd\3\u00dd\5\u00dd\u0854\n\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0859"+
		"\n\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u085e\n\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\5\u00dd\u0863\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\5\u00dd\u086a\n\u00dd\3\u00de\3\u00de\5\u00de\u086e\n\u00de\3\u00df\3"+
		"\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\5\u00e1\u087b\n\u00e1\3\u00e1\3\u00e1\5\u00e1\u087f\n\u00e1\3"+
		"\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\7\u00e1\u0893\n\u00e1\f\u00e1\16\u00e1\u0896\13\u00e1\3\u00e2\3\u00e2"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e5\3\u00e5\5\u00e5\u08a6\n\u00e5\3\u00e5\5\u00e5\u08a9\n"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e7\3\u00e7\5\u00e7\u08b1\n"+
		"\u00e7\3\u00e7\3\u00e7\5\u00e7\u08b5\n\u00e7\3\u00e7\3\u00e7\3\u00e7\5"+
		"\u00e7\u08ba\n\u00e7\3\u00e8\3\u00e8\3\u00e9\3\u00e9\5\u00e9\u08c0\n\u00e9"+
		"\3\u00e9\3\u00e9\3\u00ea\3\u00ea\5\u00ea\u08c6\n\u00ea\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\5\u00eb\u08cd\n\u00eb\3\u00ec\5\u00ec\u08d0\n"+
		"\u00ec\3\u00ec\5\u00ec\u08d3\n\u00ec\3\u00ec\3\u00ec\5\u00ec\u08d7\n\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u08dc\n\u00ec\3\u00ed\3\u00ed\3\u00ee"+
		"\3\u00ee\3\u00ee\5\u00ee\u08e3\n\u00ee\3\u00ee\3\u00ee\3\u00ef\3\u00ef"+
		"\3\u00ef\6\u00ef\u08ea\n\u00ef\r\u00ef\16\u00ef\u08eb\5\u00ef\u08ee\n"+
		"\u00ef\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\5\u00f1\u08fd\n\u00f1\3\u00f2"+
		"\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\5\u00f3\u0906\n\u00f3"+
		"\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\5\u00f5"+
		"\u0910\n\u00f5\3\u00f6\3\u00f6\3\u00f6\7\u00f6\u0915\n\u00f6\f\u00f6\16"+
		"\u00f6\u0918\13\u00f6\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f9"+
		"\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fd"+
		"\3\u00fd\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00ff\3\u00ff\3\u00ff\3\u0100"+
		"\3\u0100\3\u0100\3\u0101\3\u0101\3\u0101\3\u0102\3\u0102\3\u0102\7\u0102"+
		"\u0943\n\u0102\f\u0102\16\u0102\u0946\13\u0102\3\u0102\3\u0102\3\u0102"+
		"\7\u0102\u094b\n\u0102\f\u0102\16\u0102\u094e\13\u0102\5\u0102\u0950\n"+
		"\u0102\3\u0103\3\u0103\5\u0103\u0954\n\u0103\3\u0104\3\u0104\5\u0104\u0958"+
		"\n\u0104\3\u0105\3\u0105\3\u0105\3\u0106\3\u0106\5\u0106\u095f\n\u0106"+
		"\3\u0107\3\u0107\3\u0107\3\u0107\5\u0107\u0965\n\u0107\3\u0108\5\u0108"+
		"\u0968\n\u0108\3\u0108\3\u0108\5\u0108\u096c\n\u0108\3\u0108\5\u0108\u096f"+
		"\n\u0108\3\u0109\3\u0109\3\u010a\3\u010a\3\u010b\3\u010b\3\u010c\3\u010c"+
		"\3\u010c\2\6f\u0158\u01b6\u01c0\u010d\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0"+
		"\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8"+
		"\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0"+
		"\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8"+
		"\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200"+
		"\u0202\u0204\u0206\u0208\u020a\u020c\u020e\u0210\u0212\u0214\u0216\2\r"+
		"\4\2gg\177\177\3\2\37\"\3\2#&\4\2\b\b).\3\2AC\5\2NNQQ\\]\b\2/\62\65\65"+
		";LNNQQ`a\5\2stvwy\u0082\3\2de\3\2\u0086\u008a\3\2\u008c\u008d\u0a06\2"+
		"\u021b\3\2\2\2\4\u0241\3\2\2\2\6\u0244\3\2\2\2\b\u0248\3\2\2\2\n\u024e"+
		"\3\2\2\2\f\u026c\3\2\2\2\16\u0270\3\2\2\2\20\u0272\3\2\2\2\22\u027e\3"+
		"\2\2\2\24\u028c\3\2\2\2\26\u028e\3\2\2\2\30\u0299\3\2\2\2\32\u029b\3\2"+
		"\2\2\34\u02a1\3\2\2\2\36\u02b0\3\2\2\2 \u02b2\3\2\2\2\"\u02bb\3\2\2\2"+
		"$\u02c3\3\2\2\2&\u02c5\3\2\2\2(\u02cf\3\2\2\2*\u02d1\3\2\2\2,\u02d6\3"+
		"\2\2\2.\u02de\3\2\2\2\60\u02e8\3\2\2\2\62\u02ea\3\2\2\2\64\u02f9\3\2\2"+
		"\2\66\u02fb\3\2\2\28\u02fe\3\2\2\2:\u0301\3\2\2\2<\u030c\3\2\2\2>\u030e"+
		"\3\2\2\2@\u0311\3\2\2\2B\u0318\3\2\2\2D\u031a\3\2\2\2F\u031e\3\2\2\2H"+
		"\u0322\3\2\2\2J\u0324\3\2\2\2L\u0328\3\2\2\2N\u032d\3\2\2\2P\u0335\3\2"+
		"\2\2R\u0337\3\2\2\2T\u033a\3\2\2\2V\u033d\3\2\2\2X\u0342\3\2\2\2Z\u0346"+
		"\3\2\2\2\\\u0351\3\2\2\2^\u0353\3\2\2\2`\u0360\3\2\2\2b\u0364\3\2\2\2"+
		"d\u0369\3\2\2\2f\u0377\3\2\2\2h\u0390\3\2\2\2j\u0392\3\2\2\2l\u0394\3"+
		"\2\2\2n\u039b\3\2\2\2p\u039d\3\2\2\2r\u039f\3\2\2\2t\u03a1\3\2\2\2v\u03a8"+
		"\3\2\2\2x\u03b9\3\2\2\2z\u03bb\3\2\2\2|\u03c3\3\2\2\2~\u03c7\3\2\2\2\u0080"+
		"\u03d1\3\2\2\2\u0082\u03d3\3\2\2\2\u0084\u03d7\3\2\2\2\u0086\u03db\3\2"+
		"\2\2\u0088\u03e3\3\2\2\2\u008a\u03f3\3\2\2\2\u008c\u03f6\3\2\2\2\u008e"+
		"\u03fb\3\2\2\2\u0090\u03fd\3\2\2\2\u0092\u0404\3\2\2\2\u0094\u040c\3\2"+
		"\2\2\u0096\u0413\3\2\2\2\u0098\u0417\3\2\2\2\u009a\u0419\3\2\2\2\u009c"+
		"\u041d\3\2\2\2\u009e\u0424\3\2\2\2\u00a0\u0426\3\2\2\2\u00a2\u042e\3\2"+
		"\2\2\u00a4\u0432\3\2\2\2\u00a6\u0435\3\2\2\2\u00a8\u0439\3\2\2\2\u00aa"+
		"\u0442\3\2\2\2\u00ac\u0444\3\2\2\2\u00ae\u0446\3\2\2\2\u00b0\u0451\3\2"+
		"\2\2\u00b2\u0453\3\2\2\2\u00b4\u0461\3\2\2\2\u00b6\u0464\3\2\2\2\u00b8"+
		"\u046a\3\2\2\2\u00ba\u0472\3\2\2\2\u00bc\u0482\3\2\2\2\u00be\u0485\3\2"+
		"\2\2\u00c0\u048a\3\2\2\2\u00c2\u049a\3\2\2\2\u00c4\u049d\3\2\2\2\u00c6"+
		"\u04a6\3\2\2\2\u00c8\u04ae\3\2\2\2\u00ca\u04b2\3\2\2\2\u00cc\u04ba\3\2"+
		"\2\2\u00ce\u04bc\3\2\2\2\u00d0\u04bf\3\2\2\2\u00d2\u04c9\3\2\2\2\u00d4"+
		"\u04d2\3\2\2\2\u00d6\u04e0\3\2\2\2\u00d8\u04e2\3\2\2\2\u00da\u04e8\3\2"+
		"\2\2\u00dc\u04ea\3\2\2\2\u00de\u04f4\3\2\2\2\u00e0\u04f6\3\2\2\2\u00e2"+
		"\u051d\3\2\2\2\u00e4\u0521\3\2\2\2\u00e6\u0525\3\2\2\2\u00e8\u0527\3\2"+
		"\2\2\u00ea\u0538\3\2\2\2\u00ec\u053b\3\2\2\2\u00ee\u054b\3\2\2\2\u00f0"+
		"\u0551\3\2\2\2\u00f2\u0554\3\2\2\2\u00f4\u0561\3\2\2\2\u00f6\u0563\3\2"+
		"\2\2\u00f8\u0567\3\2\2\2\u00fa\u0569\3\2\2\2\u00fc\u056b\3\2\2\2\u00fe"+
		"\u0575\3\2\2\2\u0100\u057b\3\2\2\2\u0102\u057e\3\2\2\2\u0104\u0588\3\2"+
		"\2\2\u0106\u058a\3\2\2\2\u0108\u058e\3\2\2\2\u010a\u0594\3\2\2\2\u010c"+
		"\u0597\3\2\2\2\u010e\u05a6\3\2\2\2\u0110\u05a8\3\2\2\2\u0112\u05ae\3\2"+
		"\2\2\u0114\u05b1\3\2\2\2\u0116\u05c0\3\2\2\2\u0118\u05c2\3\2\2\2\u011a"+
		"\u05c9\3\2\2\2\u011c\u05d5\3\2\2\2\u011e\u05d7\3\2\2\2\u0120\u05e2\3\2"+
		"\2\2\u0122\u05e4\3\2\2\2\u0124\u05e8\3\2\2\2\u0126\u05ed\3\2\2\2\u0128"+
		"\u0603\3\2\2\2\u012a\u0605\3\2\2\2\u012c\u060a\3\2\2\2\u012e\u0629\3\2"+
		"\2\2\u0130\u0642\3\2\2\2\u0132\u0644\3\2\2\2\u0134\u0647\3\2\2\2\u0136"+
		"\u064d\3\2\2\2\u0138\u0656\3\2\2\2\u013a\u0668\3\2\2\2\u013c\u066b\3\2"+
		"\2\2\u013e\u0673\3\2\2\2\u0140\u067c\3\2\2\2\u0142\u067e\3\2\2\2\u0144"+
		"\u0684\3\2\2\2\u0146\u068a\3\2\2\2\u0148\u0692\3\2\2\2\u014a\u0697\3\2"+
		"\2\2\u014c\u069a\3\2\2\2\u014e\u069c\3\2\2\2\u0150\u069f\3\2\2\2\u0152"+
		"\u06ba\3\2\2\2\u0154\u06bc\3\2\2\2\u0156\u06cf\3\2\2\2\u0158\u06e4\3\2"+
		"\2\2\u015a\u06ee\3\2\2\2\u015c\u06f0\3\2\2\2\u015e\u06f6\3\2\2\2\u0160"+
		"\u06f8\3\2\2\2\u0162\u06fe\3\2\2\2\u0164\u0706\3\2\2\2\u0166\u0709\3\2"+
		"\2\2\u0168\u0710\3\2\2\2\u016a\u0713\3\2\2\2\u016c\u0716\3\2\2\2\u016e"+
		"\u071c\3\2\2\2\u0170\u071e\3\2\2\2\u0172\u0725\3\2\2\2\u0174\u072a\3\2"+
		"\2\2\u0176\u0742\3\2\2\2\u0178\u0745\3\2\2\2\u017a\u074b\3\2\2\2\u017c"+
		"\u0758\3\2\2\2\u017e\u075a\3\2\2\2\u0180\u0762\3\2\2\2\u0182\u076e\3\2"+
		"\2\2\u0184\u0771\3\2\2\2\u0186\u0775\3\2\2\2\u0188\u0786\3\2\2\2\u018a"+
		"\u0791\3\2\2\2\u018c\u0793\3\2\2\2\u018e\u079d\3\2\2\2\u0190\u079f\3\2"+
		"\2\2\u0192\u07a5\3\2\2\2\u0194\u07b0\3\2\2\2\u0196\u07b7\3\2\2\2\u0198"+
		"\u07b9\3\2\2\2\u019a\u07c4\3\2\2\2\u019c\u07c8\3\2\2\2\u019e\u07ce\3\2"+
		"\2\2\u01a0\u07d0\3\2\2\2\u01a2\u07f6\3\2\2\2\u01a4\u07f8\3\2\2\2\u01a6"+
		"\u07fc\3\2\2\2\u01a8\u0805\3\2\2\2\u01aa\u0809\3\2\2\2\u01ac\u080b\3\2"+
		"\2\2\u01ae\u0811\3\2\2\2\u01b0\u081e\3\2\2\2\u01b2\u0820\3\2\2\2\u01b4"+
		"\u0822\3\2\2\2\u01b6\u0827\3\2\2\2\u01b8\u0869\3\2\2\2\u01ba\u086b\3\2"+
		"\2\2\u01bc\u086f\3\2\2\2\u01be\u0872\3\2\2\2\u01c0\u087a\3\2\2\2\u01c2"+
		"\u0897\3\2\2\2\u01c4\u0899\3\2\2\2\u01c6\u089d\3\2\2\2\u01c8\u08a3\3\2"+
		"\2\2\u01ca\u08ac\3\2\2\2\u01cc\u08b9\3\2\2\2\u01ce\u08bb\3\2\2\2\u01d0"+
		"\u08bd\3\2\2\2\u01d2\u08c3\3\2\2\2\u01d4\u08cc\3\2\2\2\u01d6\u08db\3\2"+
		"\2\2\u01d8\u08dd\3\2\2\2\u01da\u08df\3\2\2\2\u01dc\u08ed\3\2\2\2\u01de"+
		"\u08ef\3\2\2\2\u01e0\u08fc\3\2\2\2\u01e2\u08fe\3\2\2\2\u01e4\u0905\3\2"+
		"\2\2\u01e6\u0907\3\2\2\2\u01e8\u090f\3\2\2\2\u01ea\u0911\3\2\2\2\u01ec"+
		"\u0919\3\2\2\2\u01ee\u091b\3\2\2\2\u01f0\u091e\3\2\2\2\u01f2\u0921\3\2"+
		"\2\2\u01f4\u0925\3\2\2\2\u01f6\u0929\3\2\2\2\u01f8\u092d\3\2\2\2\u01fa"+
		"\u0932\3\2\2\2\u01fc\u0936\3\2\2\2\u01fe\u0939\3\2\2\2\u0200\u093c\3\2"+
		"\2\2\u0202\u094f\3\2\2\2\u0204\u0953\3\2\2\2\u0206\u0957\3\2\2\2\u0208"+
		"\u0959\3\2\2\2\u020a\u095e\3\2\2\2\u020c\u0964\3\2\2\2\u020e\u096e\3\2"+
		"\2\2\u0210\u0970\3\2\2\2\u0212\u0972\3\2\2\2\u0214\u0974\3\2\2\2\u0216"+
		"\u0976\3\2\2\2\u0218\u021a\5\4\3\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2"+
		"\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021e\u021f\7\2\2\3\u021f\3\3\2\2\2\u0220\u0222\5\u0178"+
		"\u00bd\2\u0221\u0223\5\b\5\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0242\3\2\2\2\u0224\u0226\5\u008aF\2\u0225\u0227\5\b\5\2\u0226\u0225"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0242\3\2\2\2\u0228\u022a\5\n\6\2\u0229"+
		"\u022b\5\b\5\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0242\3\2"+
		"\2\2\u022c\u022e\5$\23\2\u022d\u022f\5\b\5\2\u022e\u022d\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0242\3\2\2\2\u0230\u0232\5<\37\2\u0231\u0233\5\b"+
		"\5\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0242\3\2\2\2\u0234"+
		"\u0236\5B\"\2\u0235\u0237\5\b\5\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237\u0242\3\2\2\2\u0238\u023a\5T+\2\u0239\u023b\5\b\5\2\u023a\u0239"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0242\3\2\2\2\u023c\u023e\5V,\2\u023d"+
		"\u023f\5\b\5\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0242\3\2"+
		"\2\2\u0240\u0242\5\\/\2\u0241\u0220\3\2\2\2\u0241\u0224\3\2\2\2\u0241"+
		"\u0228\3\2\2\2\u0241\u022c\3\2\2\2\u0241\u0230\3\2\2\2\u0241\u0234\3\2"+
		"\2\2\u0241\u0238\3\2\2\2\u0241\u023c\3\2\2\2\u0241\u0240\3\2\2\2\u0242"+
		"\5\3\2\2\2\u0243\u0245\5\4\3\2\u0244\u0243\3\2\2\2\u0245\u0246\3\2\2\2"+
		"\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\7\3\2\2\2\u0248\u0249\7"+
		"r\2\2\u0249\t\3\2\2\2\u024a\u024f\5\f\7\2\u024b\u024f\5\20\t\2\u024c\u024f"+
		"\5\22\n\2\u024d\u024f\5\"\22\2\u024e\u024a\3\2\2\2\u024e\u024b\3\2\2\2"+
		"\u024e\u024c\3\2\2\2\u024e\u024d\3\2\2\2\u024f\13\3\2\2\2\u0250\u0252"+
		"\7\3\2\2\u0251\u0253\5\16\b\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2"+
		"\u0253\u0254\3\2\2\2\u0254\u0256\7r\2\2\u0255\u0257\5\u0178\u00bd\2\u0256"+
		"\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\7r"+
		"\2\2\u0259\u025b\5\u0178\u00bd\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2"+
		"\2\u025b\u025c\3\2\2\2\u025c\u026d\5\u0090I\2\u025d\u025e\7\3\2\2\u025e"+
		"\u0260\7k\2\2\u025f\u0261\5\16\b\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u0262\3\2\2\2\u0262\u0264\7r\2\2\u0263\u0265\5\u0178\u00bd"+
		"\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268"+
		"\7r\2\2\u0267\u0269\5\u0178\u00bd\2\u0268\u0267\3\2\2\2\u0268\u0269\3"+
		"\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\7n\2\2\u026b\u026d\5\u0090I\2\u026c"+
		"\u0250\3\2\2\2\u026c\u025d\3\2\2\2\u026d\r\3\2\2\2\u026e\u0271\5\u00a6"+
		"T\2\u026f\u0271\5\u017a\u00be\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2"+
		"\2\u0271\17\3\2\2\2\u0272\u0274\7\3\2\2\u0273\u0275\7\4\2\2\u0274\u0273"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\5\u0158\u00ad"+
		"\2\u0277\u0278\7\5\2\2\u0278\u027a\5\u0178\u00bd\2\u0279\u027b\58\35\2"+
		"\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d"+
		"\5\u0090I\2\u027d\21\3\2\2\2\u027e\u027f\7\6\2\2\u027f\u0280\5\24\13\2"+
		"\u0280\u0281\5\u0090I\2\u0281\23\3\2\2\2\u0282\u028d\5\u0178\u00bd\2\u0283"+
		"\u0284\5\u0178\u00bd\2\u0284\u0285\7p\2\2\u0285\u0286\5\26\f\2\u0286\u028d"+
		"\3\2\2\2\u0287\u028d\5\26\f\2\u0288\u0289\5L\'\2\u0289\u028a\7p\2\2\u028a"+
		"\u028b\5\u0178\u00bd\2\u028b\u028d\3\2\2\2\u028c\u0282\3\2\2\2\u028c\u0283"+
		"\3\2\2\2\u028c\u0287\3\2\2\2\u028c\u0288\3\2\2\2\u028d\25\3\2\2\2\u028e"+
		"\u0293\5\30\r\2\u028f\u0290\7p\2\2\u0290\u0292\5\30\r\2\u0291\u028f\3"+
		"\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\27\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u029a\5L\'\2\u0297\u029a\5\32\16"+
		"\2\u0298\u029a\5\34\17\2\u0299\u0296\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u0298\3\2\2\2\u029a\31\3\2\2\2\u029b\u029c\7\4\2\2\u029c\u029d\5\u0158"+
		"\u00ad\2\u029d\u029f\5\u00a4S\2\u029e\u02a0\58\35\2\u029f\u029e\3\2\2"+
		"\2\u029f\u02a0\3\2\2\2\u02a0\33\3\2\2\2\u02a1\u02a3\5\36\20\2\u02a2\u02a4"+
		"\5 \21\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5"+
		"\u02a7\58\35\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\35\3\2\2"+
		"\2\u02a8\u02a9\7\7\2\2\u02a9\u02aa\5\u0158\u00ad\2\u02aa\u02ab\5\u00a4"+
		"S\2\u02ab\u02b1\3\2\2\2\u02ac\u02ad\7\b\2\2\u02ad\u02ae\5\u0158\u00ad"+
		"\2\u02ae\u02af\5\u00a4S\2\u02af\u02b1\3\2\2\2\u02b0\u02a8\3\2\2\2\u02b0"+
		"\u02ac\3\2\2\2\u02b1\37\3\2\2\2\u02b2\u02b3\7p\2\2\u02b3\u02b8\5\36\20"+
		"\2\u02b4\u02b5\7p\2\2\u02b5\u02b7\5\36\20\2\u02b6\u02b4\3\2\2\2\u02b7"+
		"\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9!\3\2\2\2"+
		"\u02ba\u02b8\3\2\2\2\u02bb\u02bc\7\t\2\2\u02bc\u02bd\5\u0090I\2\u02bd"+
		"\u02be\7\6\2\2\u02be\u02bf\5\u0178\u00bd\2\u02bf#\3\2\2\2\u02c0\u02c4"+
		"\5&\24\2\u02c1\u02c4\5*\26\2\u02c2\u02c4\5,\27\2\u02c3\u02c0\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4%\3\2\2\2\u02c5\u02c6\7\n\2\2"+
		"\u02c6\u02c7\5\24\13\2\u02c7\u02c9\5\u0090I\2\u02c8\u02ca\5(\25\2\u02c9"+
		"\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\'\3\2\2\2\u02cb\u02cc\7\13\2"+
		"\2\u02cc\u02d0\5\u0090I\2\u02cd\u02ce\7\13\2\2\u02ce\u02d0\5&\24\2\u02cf"+
		"\u02cb\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0)\3\2\2\2\u02d1\u02d2\7\f\2\2"+
		"\u02d2\u02d3\5\24\13\2\u02d3\u02d4\7\13\2\2\u02d4\u02d5\5\u0090I\2\u02d5"+
		"+\3\2\2\2\u02d6\u02d7\7\r\2\2\u02d7\u02d8\5\u0178\u00bd\2\u02d8\u02da"+
		"\7j\2\2\u02d9\u02db\5.\30\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02dd\7m\2\2\u02dd-\3\2\2\2\u02de\u02e0\5\60\31\2"+
		"\u02df\u02e1\5.\30\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1/\3"+
		"\2\2\2\u02e2\u02e3\5\62\32\2\u02e3\u02e4\5\6\4\2\u02e4\u02e9\3\2\2\2\u02e5"+
		"\u02e6\5\66\34\2\u02e6\u02e7\5\6\4\2\u02e7\u02e9\3\2\2\2\u02e8\u02e2\3"+
		"\2\2\2\u02e8\u02e5\3\2\2\2\u02e9\61\3\2\2\2\u02ea\u02eb\7\4\2\2\u02eb"+
		"\u02ec\5\64\33\2\u02ec\u02ed\7q\2\2\u02ed\63\3\2\2\2\u02ee\u02f0\5\u0158"+
		"\u00ad\2\u02ef\u02f1\58\35\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02fa\3\2\2\2\u02f2\u02f4\5\u0158\u00ad\2\u02f3\u02f5\58\35\2\u02f4\u02f3"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\7p\2\2\u02f7"+
		"\u02f8\5\64\33\2\u02f8\u02fa\3\2\2\2\u02f9\u02ee\3\2\2\2\u02f9\u02f2\3"+
		"\2\2\2\u02fa\65\3\2\2\2\u02fb\u02fc\7\16\2\2\u02fc\u02fd\7q\2\2\u02fd"+
		"\67\3\2\2\2\u02fe\u02ff\7\17\2\2\u02ff\u0300\5:\36\2\u03009\3\2\2\2\u0301"+
		"\u0302\5\u0178\u00bd\2\u0302;\3\2\2\2\u0303\u0304\5> \2\u0304\u0305\5"+
		"\n\6\2\u0305\u030d\3\2\2\2\u0306\u0307\5> \2\u0307\u0308\5&\24\2\u0308"+
		"\u030d\3\2\2\2\u0309\u030a\5> \2\u030a\u030b\5,\27\2\u030b\u030d\3\2\2"+
		"\2\u030c\u0303\3\2\2\2\u030c\u0306\3\2\2\2\u030c\u0309\3\2\2\2\u030d="+
		"\3\2\2\2\u030e\u030f\5@!\2\u030f\u0310\7q\2\2\u0310?\3\2\2\2\u0311\u0312"+
		"\5\u01e8\u00f5\2\u0312A\3\2\2\2\u0313\u0319\5D#\2\u0314\u0319\5F$\2\u0315"+
		"\u0319\5H%\2\u0316\u0319\5J&\2\u0317\u0319\5R*\2\u0318\u0313\3\2\2\2\u0318"+
		"\u0314\3\2\2\2\u0318\u0315\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0317\3\2"+
		"\2\2\u0319C\3\2\2\2\u031a\u031c\7\20\2\2\u031b\u031d\5@!\2\u031c\u031b"+
		"\3\2\2\2\u031c\u031d\3\2\2\2\u031dE\3\2\2\2\u031e\u0320\7\21\2\2\u031f"+
		"\u0321\5@!\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321G\3\2\2\2\u0322"+
		"\u0323\7\22\2\2\u0323I\3\2\2\2\u0324\u0326\7\23\2\2\u0325\u0327\5\u0178"+
		"\u00bd\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327K\3\2\2\2\u0328"+
		"\u0329\7\24\2\2\u0329\u032a\7k\2\2\u032a\u032b\5N(\2\u032b\u032c\7n\2"+
		"\2\u032cM\3\2\2\2\u032d\u0332\5P)\2\u032e\u032f\7p\2\2\u032f\u0331\5P"+
		")\2\u0330\u032e\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333O\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0336\t\2\2\2"+
		"\u0336Q\3\2\2\2\u0337\u0338\7\25\2\2\u0338\u0339\5\u0178\u00bd\2\u0339"+
		"S\3\2\2\2\u033a\u033b\7\26\2\2\u033b\u033c\5\u0090I\2\u033cU\3\2\2\2\u033d"+
		"\u033e\7\27\2\2\u033e\u0340\5\u0090I\2\u033f\u0341\5X-\2\u0340\u033f\3"+
		"\2\2\2\u0340\u0341\3\2\2\2\u0341W\3\2\2\2\u0342\u0344\5Z.\2\u0343\u0345"+
		"\5X-\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345Y\3\2\2\2\u0346\u0348"+
		"\7\30\2\2\u0347\u0349\5\u0158\u00ad\2\u0348\u0347\3\2\2\2\u0348\u0349"+
		"\3\2\2\2\u0349\u034b\3\2\2\2\u034a\u034c\58\35\2\u034b\u034a\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\5\u0090I\2\u034e[\3\2\2"+
		"\2\u034f\u0352\5^\60\2\u0350\u0352\5n8\2\u0351\u034f\3\2\2\2\u0351\u0350"+
		"\3\2\2\2\u0352]\3\2\2\2\u0353\u0354\7\31\2\2\u0354\u0356\5f\64\2\u0355"+
		"\u0357\5\6\4\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2"+
		"\2\2\u0358\u035a\5`\61\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u035c\3\2\2\2\u035b\u035d\5d\63\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2"+
		"\2\2\u035d\u035e\3\2\2\2\u035e\u035f\7\32\2\2\u035f_\3\2\2\2\u0360\u0362"+
		"\5b\62\2\u0361\u0363\5`\61\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363"+
		"a\3\2\2\2\u0364\u0365\7\33\2\2\u0365\u0367\5f\64\2\u0366\u0368\5\6\4\2"+
		"\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368c\3\2\2\2\u0369\u036b\7"+
		"\34\2\2\u036a\u036c\5\6\4\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"e\3\2\2\2\u036d\u036e\b\64\1\2\u036e\u036f\7v\2\2\u036f\u0378\5f\64\5"+
		"\u0370\u0378\5h\65\2\u0371\u0378\5\u01e8\u00f5\2\u0372\u0378\5\u0210\u0109"+
		"\2\u0373\u0374\7k\2\2\u0374\u0375\5f\64\2\u0375\u0376\7n\2\2\u0376\u0378"+
		"\3\2\2\2\u0377\u036d\3\2\2\2\u0377\u0370\3\2\2\2\u0377\u0371\3\2\2\2\u0377"+
		"\u0372\3\2\2\2\u0377\u0373\3\2\2\2\u0378\u0383\3\2\2\2\u0379\u037a\f\4"+
		"\2\2\u037a\u037b\5\u01f2\u00fa\2\u037b\u037c\5f\64\5\u037c\u0382\3\2\2"+
		"\2\u037d\u037e\f\3\2\2\u037e\u037f\5\u01f4\u00fb\2\u037f\u0380\5f\64\4"+
		"\u0380\u0382\3\2\2\2\u0381\u0379\3\2\2\2\u0381\u037d\3\2\2\2\u0382\u0385"+
		"\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384g\3\2\2\2\u0385"+
		"\u0383\3\2\2\2\u0386\u0387\7\35\2\2\u0387\u0388\7k\2\2\u0388\u0389\5j"+
		"\66\2\u0389\u038a\7n\2\2\u038a\u0391\3\2\2\2\u038b\u038c\7\36\2\2\u038c"+
		"\u038d\7k\2\2\u038d\u038e\5l\67\2\u038e\u038f\7n\2\2\u038f\u0391\3\2\2"+
		"\2\u0390\u0386\3\2\2\2\u0390\u038b\3\2\2\2\u0391i\3\2\2\2\u0392\u0393"+
		"\t\3\2\2\u0393k\3\2\2\2\u0394\u0395\t\4\2\2\u0395m\3\2\2\2\u0396\u039c"+
		"\7\'\2\2\u0397\u0398\7\'\2\2\u0398\u0399\5p9\2\u0399\u039a\5r:\2\u039a"+
		"\u039c\3\2\2\2\u039b\u0396\3\2\2\2\u039b\u0397\3\2\2\2\u039co\3\2\2\2"+
		"\u039d\u039e\5\u0214\u010b\2\u039eq\3\2\2\2\u039f\u03a0\7\u008c\2\2\u03a0"+
		"s\3\2\2\2\u03a1\u03a2\7s\2\2\u03a2\u03a4\5v<\2\u03a3\u03a5\5z>\2\u03a4"+
		"\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\7t"+
		"\2\2\u03a7u\3\2\2\2\u03a8\u03ad\5x=\2\u03a9\u03aa\7p\2\2\u03aa\u03ac\5"+
		"x=\2\u03ab\u03a9\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03aew\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03ba\5\u01ce"+
		"\u00e8\2\u03b1\u03b2\5\u01ce\u00e8\2\u03b2\u03b3\7q\2\2\u03b3\u03b4\5"+
		"\u01cc\u00e7\2\u03b4\u03ba\3\2\2\2\u03b5\u03b6\5\u01ce\u00e8\2\u03b6\u03b7"+
		"\7q\2\2\u03b7\u03b8\5\u01da\u00ee\2\u03b8\u03ba\3\2\2\2\u03b9\u03b0\3"+
		"\2\2\2\u03b9\u03b1\3\2\2\2\u03b9\u03b5\3\2\2\2\u03bay\3\2\2\2\u03bb\u03bc"+
		"\7\17\2\2\u03bc\u03bd\5|?\2\u03bd{\3\2\2\2\u03be\u03c4\5~@\2\u03bf\u03c0"+
		"\5~@\2\u03c0\u03c1\7p\2\2\u03c1\u03c2\5|?\2\u03c2\u03c4\3\2\2\2\u03c3"+
		"\u03be\3\2\2\2\u03c3\u03bf\3\2\2\2\u03c4}\3\2\2\2\u03c5\u03c8\5\u0080"+
		"A\2\u03c6\u03c8\5\u0082B\2\u03c7\u03c5\3\2\2\2\u03c7\u03c6\3\2\2\2\u03c8"+
		"\177\3\2\2\2\u03c9\u03ca\5\u01cc\u00e7\2\u03ca\u03cb\7q\2\2\u03cb\u03cc"+
		"\5\u01cc\u00e7\2\u03cc\u03d2\3\2\2\2\u03cd\u03ce\5\u01cc\u00e7\2\u03ce"+
		"\u03cf\7q\2\2\u03cf\u03d0\5\u01da\u00ee\2\u03d0\u03d2\3\2\2\2\u03d1\u03c9"+
		"\3\2\2\2\u03d1\u03cd\3\2\2\2\u03d2\u0081\3\2\2\2\u03d3\u03d4\5\u01cc\u00e7"+
		"\2\u03d4\u03d5\5\u01fa\u00fe\2\u03d5\u03d6\5\u01c0\u00e1\2\u03d6\u0083"+
		"\3\2\2\2\u03d7\u03d8\7s\2\2\u03d8\u03d9\5\u0086D\2\u03d9\u03da\7t\2\2"+
		"\u03da\u0085\3\2\2\2\u03db\u03e0\5\u0088E\2\u03dc\u03dd\7p\2\2\u03dd\u03df"+
		"\5\u0088E\2\u03de\u03dc\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2"+
		"\2\u03e0\u03e1\3\2\2\2\u03e1\u0087\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3\u03e4"+
		"\5\u01c0\u00e1\2\u03e4\u0089\3\2\2\2\u03e5\u03f4\5\u0092J\2\u03e6\u03f4"+
		"\5\u009aN\2\u03e7\u03f4\5\u00a6T\2\u03e8\u03f4\5\u00c8e\2\u03e9\u03f4"+
		"\5\u00d0i\2\u03ea\u03f4\5\u00eav\2\u03eb\u03f4\5\u010c\u0087\2\u03ec\u03f4"+
		"\5\u0114\u008b\2\u03ed\u03f4\5\u011a\u008e\2\u03ee\u03f4\5\u012e\u0098"+
		"\2\u03ef\u03f4\5\u0134\u009b\2\u03f0\u03f4\5\u0136\u009c\2\u03f1\u03f4"+
		"\5\u013a\u009e\2\u03f2\u03f4\5\u0140\u00a1\2\u03f3\u03e5\3\2\2\2\u03f3"+
		"\u03e6\3\2\2\2\u03f3\u03e7\3\2\2\2\u03f3\u03e8\3\2\2\2\u03f3\u03e9\3\2"+
		"\2\2\u03f3\u03ea\3\2\2\2\u03f3\u03eb\3\2\2\2\u03f3\u03ec\3\2\2\2\u03f3"+
		"\u03ed\3\2\2\2\u03f3\u03ee\3\2\2\2\u03f3\u03ef\3\2\2\2\u03f3\u03f0\3\2"+
		"\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f2\3\2\2\2\u03f4\u008b\3\2\2\2\u03f5"+
		"\u03f7\5\u008aF\2\u03f6\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f6"+
		"\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u008d\3\2\2\2\u03fa\u03fc\5\6\4\2\u03fb"+
		"\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u008f\3\2\2\2\u03fd\u03ff\7j"+
		"\2\2\u03fe\u0400\5\6\4\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400"+
		"\u0401\3\2\2\2\u0401\u0402\7m\2\2\u0402\u0091\3\2\2\2\u0403\u0405\5\u0172"+
		"\u00ba\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0408\7(\2\2\u0407\u0409\5\u0094K\2\u0408\u0407\3\2\2\2\u0408\u0409\3"+
		"\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\5\u0096L\2\u040b\u0093\3\2\2\2"+
		"\u040c\u040d\t\5\2\2\u040d\u0095\3\2\2\2\u040e\u0414\5\u0098M\2\u040f"+
		"\u0410\5\u0098M\2\u0410\u0411\7i\2\2\u0411\u0412\5\u0096L\2\u0412\u0414"+
		"\3\2\2\2\u0413\u040e\3\2\2\2\u0413\u040f\3\2\2\2\u0414\u0097\3\2\2\2\u0415"+
		"\u0418\5\u01e8\u00f5\2\u0416\u0418\5\u0202\u0102\2\u0417\u0415\3\2\2\2"+
		"\u0417\u0416\3\2\2\2\u0418\u0099\3\2\2\2\u0419\u041a\5\u009cO\2\u041a"+
		"\u041b\5\u009eP\2\u041b\u009b\3\2\2\2\u041c\u041e\5\u0172\u00ba\2\u041d"+
		"\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420\3\2\2\2\u041f\u0421\5\u0154"+
		"\u00ab\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u0423\7\7\2\2\u0423\u009d\3\2\2\2\u0424\u0425\5\u00a0Q\2\u0425\u009f"+
		"\3\2\2\2\u0426\u042b\5\u00a2R\2\u0427\u0428\7p\2\2\u0428\u042a\5\u00a2"+
		"R\2\u0429\u0427\3\2\2\2\u042a\u042d\3\2\2\2\u042b\u0429\3\2\2\2\u042b"+
		"\u042c\3\2\2\2\u042c\u00a1\3\2\2\2\u042d\u042b\3\2\2\2\u042e\u0430\5\u0158"+
		"\u00ad\2\u042f\u0431\5\u00a4S\2\u0430\u042f\3\2\2\2\u0430\u0431\3\2\2"+
		"\2\u0431\u00a3\3\2\2\2\u0432\u0433\5\u01ee\u00f8\2\u0433\u0434\5\u0178"+
		"\u00bd\2\u0434\u00a5\3\2\2\2\u0435\u0436\5\u00a8U\2\u0436\u0437\5\u00aa"+
		"V\2\u0437\u00a7\3\2\2\2\u0438\u043a\5\u0172\u00ba\2\u0439\u0438\3\2\2"+
		"\2\u0439\u043a\3\2\2\2\u043a\u043c\3\2\2\2\u043b\u043d\5\u0154\u00ab\2"+
		"\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f"+
		"\7\b\2\2\u043f\u00a9\3\2\2\2\u0440\u0443\5\u00aeX\2\u0441\u0443\5\u00ac"+
		"W\2\u0442\u0440\3\2\2\2\u0442\u0441\3\2\2\2\u0443\u00ab\3\2\2\2\u0444"+
		"\u0445\5\u00a0Q\2\u0445\u00ad\3\2\2\2\u0446\u0447\5\u00b2Z\2\u0447\u0448"+
		"\5\u01c8\u00e5\2\u0448\u0449\5\u00b0Y\2\u0449\u00af\3\2\2\2\u044a\u0452"+
		"\5\u00b4[\2\u044b\u0452\5\u00bc_\2\u044c\u044e\5\u00a4S\2\u044d\u044c"+
		"\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0452\5\u00c2b"+
		"\2\u0450\u0452\5\u0090I\2\u0451\u044a\3\2\2\2\u0451\u044b\3\2\2\2\u0451"+
		"\u044d\3\2\2\2\u0451\u0450\3\2\2\2\u0452\u00b1\3\2\2\2\u0453\u0454\5\u01e8"+
		"\u00f5\2\u0454\u00b3\3\2\2\2\u0455\u0456\7j\2\2\u0456\u0458\5\u00b6\\"+
		"\2\u0457\u0459\5\u00b8]\2\u0458\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459"+
		"\u045a\3\2\2\2\u045a\u045b\7m\2\2\u045b\u0462\3\2\2\2\u045c\u045d\7j\2"+
		"\2\u045d\u045e\5\u00b8]\2\u045e\u045f\5\u00b6\\\2\u045f\u0460\7m\2\2\u0460"+
		"\u0462\3\2\2\2\u0461\u0455\3\2\2\2\u0461\u045c\3\2\2\2\u0462\u00b5\3\2"+
		"\2\2\u0463\u0465\5\u0172\u00ba\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2"+
		"\2\u0465\u0466\3\2\2\2\u0466\u0467\7/\2\2\u0467\u0468\5\u0090I\2\u0468"+
		"\u00b7\3\2\2\2\u0469\u046b\5\u0172\u00ba\2\u046a\u0469\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046e\7\60\2\2\u046d\u046f\5\u00ba"+
		"^\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\3\2\2\2\u0470"+
		"\u0471\5\u0090I\2\u0471\u00b9\3\2\2\2\u0472\u0473\7k\2\2\u0473\u0474\5"+
		"\u01e8\u00f5\2\u0474\u0475\7n\2\2\u0475\u00bb\3\2\2\2\u0476\u0477\7j\2"+
		"\2\u0477\u0479\5\u00be`\2\u0478\u047a\5\u00c0a\2\u0479\u0478\3\2\2\2\u0479"+
		"\u047a\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\7m\2\2\u047c\u0483\3\2"+
		"\2\2\u047d\u047e\7j\2\2\u047e\u047f\5\u00c0a\2\u047f\u0480\5\u00be`\2"+
		"\u0480\u0481\7m\2\2\u0481\u0483\3\2\2\2\u0482\u0476\3\2\2\2\u0482\u047d"+
		"\3\2\2\2\u0483\u00bd\3\2\2\2\u0484\u0486\5\u0172\u00ba\2\u0485\u0484\3"+
		"\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\7/\2\2\u0488"+
		"\u00bf\3\2\2\2\u0489\u048b\5\u0172\u00ba\2\u048a\u0489\3\2\2\2\u048a\u048b"+
		"\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\7\60\2\2\u048d\u00c1\3\2\2\2"+
		"\u048e\u048f\7j\2\2\u048f\u0491\5\u00c4c\2\u0490\u0492\5\u00c6d\2\u0491"+
		"\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\7m"+
		"\2\2\u0494\u049b\3\2\2\2\u0495\u0496\7j\2\2\u0496\u0497\5\u00c6d\2\u0497"+
		"\u0498\5\u00c4c\2\u0498\u0499\7m\2\2\u0499\u049b\3\2\2\2\u049a\u048e\3"+
		"\2\2\2\u049a\u0495\3\2\2\2\u049b\u00c3\3\2\2\2\u049c\u049e\5\u0172\u00ba"+
		"\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a1"+
		"\7\61\2\2\u04a0\u04a2\5\u00ba^\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2"+
		"\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\5\u0090I\2\u04a4\u00c5\3\2\2\2\u04a5"+
		"\u04a7\5\u0172\u00ba\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8"+
		"\3\2\2\2\u04a8\u04aa\7\62\2\2\u04a9\u04ab\5\u00ba^\2\u04aa\u04a9\3\2\2"+
		"\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\5\u0090I\2\u04ad"+
		"\u00c7\3\2\2\2\u04ae\u04af\5\u00caf\2\u04af\u04b0\5\u00ceh\2\u04b0\u00c9"+
		"\3\2\2\2\u04b1\u04b3\5\u0172\u00ba\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3"+
		"\2\2\2\u04b3\u04b5\3\2\2\2\u04b4\u04b6\5\u0156\u00ac\2\u04b5\u04b4\3\2"+
		"\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7)\2\2\u04b8"+
		"\u04b9\5\u00ccg\2\u04b9\u00cb\3\2\2\2\u04ba\u04bb\5\u01e8\u00f5\2\u04bb"+
		"\u00cd\3\2\2\2\u04bc\u04bd\5\u01ee\u00f8\2\u04bd\u04be\5\u01c0\u00e1\2"+
		"\u04be\u00cf\3\2\2\2\u04bf\u04c0\5\u00d2j\2\u04c0\u04c2\5\u00d4k\2\u04c1"+
		"\u04c3\5t;\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2"+
		"\2\u04c4\u04c6\5\u00d6l\2\u04c5\u04c7\5\u00dan\2\u04c6\u04c5\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7\u00d1\3\2\2\2\u04c8\u04ca\5\u0172\u00ba\2\u04c9\u04c8"+
		"\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc\3\2\2\2\u04cb\u04cd\5\u0154\u00ab"+
		"\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf"+
		"\7.\2\2\u04cf\u00d3\3\2\2\2\u04d0\u04d3\5\u01e8\u00f5\2\u04d1\u04d3\5"+
		"\u0202\u0102\2\u04d2\u04d0\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3\u00d5\3\2"+
		"\2\2\u04d4\u04d6\5\u00dco\2\u04d5\u04d7\7\63\2\2\u04d6\u04d5\3\2\2\2\u04d6"+
		"\u04d7\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04da\5\u00d8m\2\u04d9\u04d8"+
		"\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04e1\3\2\2\2\u04db\u04dc\5\u00dco"+
		"\2\u04dc\u04de\7\64\2\2\u04dd\u04df\5\u00d8m\2\u04de\u04dd\3\2\2\2\u04de"+
		"\u04df\3\2\2\2\u04df\u04e1\3\2\2\2\u04e0\u04d4\3\2\2\2\u04e0\u04db\3\2"+
		"\2\2\u04e1\u00d7\3\2\2\2\u04e2\u04e4\5\u01f6\u00fc\2\u04e3\u04e5\5\u0172"+
		"\u00ba\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6"+
		"\u04e7\5\u01c0\u00e1\2\u04e7\u00d9\3\2\2\2\u04e8\u04e9\5\u0090I\2\u04e9"+
		"\u00db\3\2\2\2\u04ea\u04ec\5\u00dep\2\u04eb\u04ed\5\u00dco\2\u04ec\u04eb"+
		"\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u00dd\3\2\2\2\u04ee\u04ef\7k\2\2\u04ef"+
		"\u04f5\7n\2\2\u04f0\u04f1\7k\2\2\u04f1\u04f2\5\u00e0q\2\u04f2\u04f3\7"+
		"n\2\2\u04f3\u04f5\3\2\2\2\u04f4\u04ee\3\2\2\2\u04f4\u04f0\3\2\2\2\u04f5"+
		"\u00df\3\2\2\2\u04f6\u04fb\5\u00e2r\2\u04f7\u04f8\7p\2\2\u04f8\u04fa\5"+
		"\u00e2r\2\u04f9\u04f7\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04f9\3\2\2\2"+
		"\u04fb\u04fc\3\2\2\2\u04fc\u00e1\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe\u0500"+
		"\7\7\2\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501"+
		"\u0503\5\u00e4s\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504"+
		"\3\2\2\2\u0504\u0506\5\u00e6t\2\u0505\u0507\5\u01c8\u00e5\2\u0506\u0505"+
		"\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0509\3\2\2\2\u0508\u050a\5\u00e8u"+
		"\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u051e\3\2\2\2\u050b\u050d"+
		"\7\b\2\2\u050c\u050e\5\u00e4s\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2"+
		"\2\u050e\u050f\3\2\2\2\u050f\u0511\5\u00e6t\2\u0510\u0512\5\u01c8\u00e5"+
		"\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\3\2\2\2\u0513\u0515"+
		"\5\u00e8u\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u051e\3\2\2"+
		"\2\u0516\u0518\5\u00e4s\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518"+
		"\u0519\3\2\2\2\u0519\u051a\5\u00e6t\2\u051a\u051b\5\u01c8\u00e5\2\u051b"+
		"\u051c\5\u01f8\u00fd\2\u051c\u051e\3\2\2\2\u051d\u04ff\3\2\2\2\u051d\u050b"+
		"\3\2\2\2\u051d\u0517\3\2\2\2\u051e\u00e3\3\2\2\2\u051f\u0522\5\u01e8\u00f5"+
		"\2\u0520\u0522\7u\2\2\u0521\u051f\3\2\2\2\u0521\u0520\3\2\2\2\u0522\u00e5"+
		"\3\2\2\2\u0523\u0526\5\u01e8\u00f5\2\u0524\u0526\7u\2\2\u0525\u0523\3"+
		"\2\2\2\u0525\u0524\3\2\2\2\u0526\u00e7\3\2\2\2\u0527\u0528\5\u01ee\u00f8"+
		"\2\u0528\u0529\5\u0178\u00bd\2\u0529\u00e9\3\2\2\2\u052a\u052c\5\u0172"+
		"\u00ba\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052e\3\2\2\2\u052d"+
		"\u052f\5\u0156\u00ac\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530"+
		"\3\2\2\2\u0530\u0539\5\u00ecw\2\u0531\u0533\5\u0172\u00ba\2\u0532\u0531"+
		"\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0535\3\2\2\2\u0534\u0536\5\u0156\u00ac"+
		"\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0539"+
		"\5\u00fc\177\2\u0538\u052b\3\2\2\2\u0538\u0532\3\2\2\2\u0539\u00eb\3\2"+
		"\2\2\u053a\u053c\7\65\2\2\u053b\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c"+
		"\u053d\3\2\2\2\u053d\u053e\7,\2\2\u053e\u0540\5\u00f8}\2\u053f\u0541\5"+
		"t;\2\u0540\u053f\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542"+
		"\u0544\5\u01e0\u00f1\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545"+
		"\3\2\2\2\u0545\u0547\7j\2\2\u0546\u0548\5\u00eex\2\u0547\u0546\3\2\2\2"+
		"\u0547\u0548\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\7m\2\2\u054a\u00ed"+
		"\3\2\2\2\u054b\u054d\5\u00f0y\2\u054c\u054e\5\u00eex\2\u054d\u054c\3\2"+
		"\2\2\u054d\u054e\3\2\2\2\u054e\u00ef\3\2\2\2\u054f\u0552\5\u008aF\2\u0550"+
		"\u0552\5\u00f2z\2\u0551\u054f\3\2\2\2\u0551\u0550\3\2\2\2\u0552\u00f1"+
		"\3\2\2\2\u0553\u0555\5\u0172\u00ba\2\u0554\u0553\3\2\2\2\u0554\u0555\3"+
		"\2\2\2\u0555\u0557\3\2\2\2\u0556\u0558\7\65\2\2\u0557\u0556\3\2\2\2\u0557"+
		"\u0558\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a\7\4\2\2\u055a\u055b\5\u00f4"+
		"{\2\u055b\u00f3\3\2\2\2\u055c\u0562\5\u00f6|\2\u055d\u055e\5\u00f6|\2"+
		"\u055e\u055f\7p\2\2\u055f\u0560\5\u00f4{\2\u0560\u0562\3\2\2\2\u0561\u055c"+
		"\3\2\2\2\u0561\u055d\3\2\2\2\u0562\u00f5\3\2\2\2\u0563\u0565\5\u00fa~"+
		"\2\u0564\u0566\5\u01d0\u00e9\2\u0565\u0564\3\2\2\2\u0565\u0566\3\2\2\2"+
		"\u0566\u00f7\3\2\2\2\u0567\u0568\5\u01e8\u00f5\2\u0568\u00f9\3\2\2\2\u0569"+
		"\u056a\5\u01e8\u00f5\2\u056a\u00fb\3\2\2\2\u056b\u056c\7,\2\2\u056c\u056e"+
		"\5\u00f8}\2\u056d\u056f\5t;\2\u056e\u056d\3\2\2\2\u056e\u056f\3\2\2\2"+
		"\u056f\u0570\3\2\2\2\u0570\u0571\5\u01e0\u00f1\2\u0571\u0572\7j\2\2\u0572"+
		"\u0573\5\u00fe\u0080\2\u0573\u0574\7m\2\2\u0574\u00fd\3\2\2\2\u0575\u0577"+
		"\5\u0100\u0081\2\u0576\u0578\5\u00fe\u0080\2\u0577\u0576\3\2\2\2\u0577"+
		"\u0578\3\2\2\2\u0578\u00ff\3\2\2\2\u0579\u057c\5\u008aF\2\u057a\u057c"+
		"\5\u0102\u0082\2\u057b\u0579\3\2\2\2\u057b\u057a\3\2\2\2\u057c\u0101\3"+
		"\2\2\2\u057d\u057f\5\u0172\u00ba\2\u057e\u057d\3\2\2\2\u057e\u057f\3\2"+
		"\2\2\u057f\u0580\3\2\2\2\u0580\u0581\7\4\2\2\u0581\u0582\5\u0104\u0083"+
		"\2\u0582\u0103\3\2\2\2\u0583\u0589\5\u0106\u0084\2\u0584\u0585\5\u0106"+
		"\u0084\2\u0585\u0586\7p\2\2\u0586\u0587\5\u0104\u0083\2\u0587\u0589\3"+
		"\2\2\2\u0588\u0583\3\2\2\2\u0588\u0584\3\2\2\2\u0589\u0105\3\2\2\2\u058a"+
		"\u058c\5\u00fa~\2\u058b\u058d\5\u0108\u0085\2\u058c\u058b\3\2\2\2\u058c"+
		"\u058d\3\2\2\2\u058d\u0107\3\2\2\2\u058e\u058f\5\u01ee\u00f8\2\u058f\u0590"+
		"\5\u010a\u0086\2\u0590\u0109\3\2\2\2\u0591\u0595\5\u020e\u0108\2\u0592"+
		"\u0595\7\u008c\2\2\u0593\u0595\5\u0210\u0109\2\u0594\u0591\3\2\2\2\u0594"+
		"\u0592\3\2\2\2\u0594\u0593\3\2\2\2\u0595\u010b\3\2\2\2\u0596\u0598\5\u0172"+
		"\u00ba\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059a\3\2\2\2\u0599"+
		"\u059b\5\u0156\u00ac\2\u059a\u0599\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c"+
		"\3\2\2\2\u059c\u059d\5\u0112\u008a\2\u059d\u059f\5\u010e\u0088\2\u059e"+
		"\u05a0\5t;\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2"+
		"\2\u05a1\u05a3\5\u01e0\u00f1\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2"+
		"\u05a3\u05a4\3\2\2\2\u05a4\u05a5\5\u0110\u0089\2\u05a5\u010d\3\2\2\2\u05a6"+
		"\u05a7\5\u01e8\u00f5\2\u05a7\u010f\3\2\2\2\u05a8\u05aa\7j\2\2\u05a9\u05ab"+
		"\5\u008cG\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2"+
		"\2\u05ac\u05ad\7m\2\2\u05ad\u0111\3\2\2\2\u05ae\u05af\7*\2\2\u05af\u0113"+
		"\3\2\2\2\u05b0\u05b2\5\u0172\u00ba\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3"+
		"\2\2\2\u05b2\u05b4\3\2\2\2\u05b3\u05b5\5\u0156\u00ac\2\u05b4\u05b3\3\2"+
		"\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\7+\2\2\u05b7"+
		"\u05b9\5\u0116\u008c\2\u05b8\u05ba\5t;\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba"+
		"\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05bd\5\u01e0\u00f1\2\u05bc\u05bb\3"+
		"\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf\5\u0118\u008d"+
		"\2\u05bf\u0115\3\2\2\2\u05c0\u05c1\5\u01e8\u00f5\2\u05c1\u0117\3\2\2\2"+
		"\u05c2\u05c4\7j\2\2\u05c3\u05c5\5\u008cG\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5"+
		"\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\7m\2\2\u05c7\u0119\3\2\2\2\u05c8"+
		"\u05ca\5\u0172\u00ba\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cc"+
		"\3\2\2\2\u05cb\u05cd\5\u0156\u00ac\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd\3"+
		"\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\7-\2\2\u05cf\u05d1\5\u011c\u008f"+
		"\2\u05d0\u05d2\5\u01e0\u00f1\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2"+
		"\u05d2\u05d3\3\2\2\2\u05d3\u05d4\5\u011e\u0090\2\u05d4\u011b\3\2\2\2\u05d5"+
		"\u05d6\5\u01e8\u00f5\2\u05d6\u011d\3\2\2\2\u05d7\u05d9\7j\2\2\u05d8\u05da"+
		"\5\u0122\u0092\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05db\3"+
		"\2\2\2\u05db\u05dc\7m\2\2\u05dc\u011f\3\2\2\2\u05dd\u05e3\5\u0124\u0093"+
		"\2\u05de\u05e3\5\u0126\u0094\2\u05df\u05e3\5\u0128\u0095\2\u05e0\u05e3"+
		"\5\u012a\u0096\2\u05e1\u05e3\5\u012c\u0097\2\u05e2\u05dd\3\2\2\2\u05e2"+
		"\u05de\3\2\2\2\u05e2\u05df\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e1\3\2"+
		"\2\2\u05e3\u0121\3\2\2\2\u05e4\u05e6\5\u0120\u0091\2\u05e5\u05e7\5\u0122"+
		"\u0092\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u0123\3\2\2\2\u05e8"+
		"\u05e9\5\u00a8U\2\u05e9\u05ea\5\u00b2Z\2\u05ea\u05eb\5\u01c8\u00e5\2\u05eb"+
		"\u05ec\5\u00bc_\2\u05ec\u0125\3\2\2\2\u05ed\u05ee\5\u00d2j\2\u05ee\u05f0"+
		"\5\u00d4k\2\u05ef\u05f1\5t;\2\u05f0\u05ef\3\2\2\2\u05f0\u05f1\3\2\2\2"+
		"\u05f1\u05f2\3\2\2\2\u05f2\u05f3\5\u00d6l\2\u05f3\u0127\3\2\2\2\u05f4"+
		"\u05f6\5\u0130\u0099\2\u05f5\u05f7\5t;\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7"+
		"\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\5\u00dep\2\u05f9\u05fb\7\63\2"+
		"\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u0604\3\2\2\2\u05fc\u05fe"+
		"\5\u0130\u0099\2\u05fd\u05ff\5t;\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2"+
		"\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\5\u00dep\2\u0601\u0602\7\64\2\2\u0602"+
		"\u0604\3\2\2\2\u0603\u05f4\3\2\2\2\u0603\u05fc\3\2\2\2\u0604\u0129\3\2"+
		"\2\2\u0605\u0606\5\u013c\u009f\2\u0606\u0607\5\u013e\u00a0\2\u0607\u0608"+
		"\5\u00bc_\2\u0608\u012b\3\2\2\2\u0609\u060b\5\u0172\u00ba\2\u060a\u0609"+
		"\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d\3\2\2\2\u060c\u060e\5\u0156\u00ac"+
		"\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0610"+
		"\7\66\2\2\u0610\u0612\5\u00ccg\2\u0611\u0613\5\u01e0\u00f1\2\u0612\u0611"+
		"\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\3\2\2\2\u0614\u0616\5\u00ceh"+
		"\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u012d\3\2\2\2\u0617\u0619"+
		"\5\u0130\u0099\2\u0618\u061a\5t;\2\u0619\u0618\3\2\2\2\u0619\u061a\3\2"+
		"\2\2\u061a\u061b\3\2\2\2\u061b\u061d\5\u00dep\2\u061c\u061e\7\63\2\2\u061d"+
		"\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620\5\u0132"+
		"\u009a\2\u0620\u062a\3\2\2\2\u0621\u0623\5\u0130\u0099\2\u0622\u0624\5"+
		"t;\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0625\3\2\2\2\u0625"+
		"\u0626\5\u00dep\2\u0626\u0627\7\64\2\2\u0627\u0628\5\u0132\u009a\2\u0628"+
		"\u062a\3\2\2\2\u0629\u0617\3\2\2\2\u0629\u0621\3\2\2\2\u062a\u012f\3\2"+
		"\2\2\u062b\u062d\5\u0172\u00ba\2\u062c\u062b\3\2\2\2\u062c\u062d\3\2\2"+
		"\2\u062d\u062f\3\2\2\2\u062e\u0630\5\u0154\u00ab\2\u062f\u062e\3\2\2\2"+
		"\u062f\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0643\7\67\2\2\u0632\u0634"+
		"\5\u0172\u00ba\2\u0633\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636\3"+
		"\2\2\2\u0635\u0637\5\u0154\u00ab\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2"+
		"\2\2\u0637\u0638\3\2\2\2\u0638\u0639\7\67\2\2\u0639\u0643\7w\2\2\u063a"+
		"\u063c\5\u0172\u00ba\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063e"+
		"\3\2\2\2\u063d\u063f\5\u0154\u00ab\2\u063e\u063d\3\2\2\2\u063e\u063f\3"+
		"\2\2\2\u063f\u0640\3\2\2\2\u0640\u0641\7\67\2\2\u0641\u0643\7v\2\2\u0642"+
		"\u062c\3\2\2\2\u0642\u0633\3\2\2\2\u0642\u063b\3\2\2\2\u0643\u0131\3\2"+
		"\2\2\u0644\u0645\5\u0090I\2\u0645\u0133\3\2\2\2\u0646\u0648\5\u0172\u00ba"+
		"\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064a"+
		"\78\2\2\u064a\u064b\5\u0090I\2\u064b\u0135\3\2\2\2\u064c\u064e\5\u0156"+
		"\u00ac\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f"+
		"\u0650\79\2\2\u0650\u0652\5\u01cc\u00e7\2\u0651\u0653\5\u01e0\u00f1\2"+
		"\u0652\u0651\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655"+
		"\5\u0138\u009d\2\u0655\u0137\3\2\2\2\u0656\u0658\7j\2\2\u0657\u0659\5"+
		"\u008cG\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065a\3\2\2\2"+
		"\u065a\u065b\7m\2\2\u065b\u0139\3\2\2\2\u065c\u065d\5\u013c\u009f\2\u065d"+
		"\u065e\5\u013e\u00a0\2\u065e\u065f\5\u0090I\2\u065f\u0669\3\2\2\2\u0660"+
		"\u0661\5\u013c\u009f\2\u0661\u0662\5\u013e\u00a0\2\u0662\u0663\5\u00b4"+
		"[\2\u0663\u0669\3\2\2\2\u0664\u0665\5\u013c\u009f\2\u0665\u0666\5\u013e"+
		"\u00a0\2\u0666\u0667\5\u00bc_\2\u0667\u0669\3\2\2\2\u0668\u065c\3\2\2"+
		"\2\u0668\u0660\3\2\2\2\u0668\u0664\3\2\2\2\u0669\u013b\3\2\2\2\u066a\u066c"+
		"\5\u0172\u00ba\2\u066b\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066e\3"+
		"\2\2\2\u066d\u066f\5\u0154\u00ab\2\u066e\u066d\3\2\2\2\u066e\u066f\3\2"+
		"\2\2\u066f\u0670\3\2\2\2\u0670\u0671\7:\2\2\u0671\u0672\5\u00dep\2\u0672"+
		"\u013d\3\2\2\2\u0673\u0675\5\u01f6\u00fc\2\u0674\u0676\5\u0172\u00ba\2"+
		"\u0675\u0674\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0678"+
		"\5\u01c0\u00e1\2\u0678\u013f\3\2\2\2\u0679\u067d\5\u0142\u00a2\2\u067a"+
		"\u067d\5\u0144\u00a3\2\u067b\u067d\5\u0146\u00a4\2\u067c\u0679\3\2\2\2"+
		"\u067c\u067a\3\2\2\2\u067c\u067b\3\2\2\2\u067d\u0141\3\2\2\2\u067e\u067f"+
		"\7;\2\2\u067f\u0680\7<\2\2\u0680\u0681\5\u0202\u0102\2\u0681\u0682\7j"+
		"\2\2\u0682\u0683\7m\2\2\u0683\u0143\3\2\2\2\u0684\u0685\7=\2\2\u0685\u0686"+
		"\7<\2\2\u0686\u0687\5\u0202\u0102\2\u0687\u0688\7j\2\2\u0688\u0689\7m"+
		"\2\2\u0689\u0145\3\2\2\2\u068a\u068b\7>\2\2\u068b\u068c\7<\2\2\u068c\u068d"+
		"\5\u0202\u0102\2\u068d\u068e\7j\2\2\u068e\u068f\5\u0148\u00a5\2\u068f"+
		"\u0690\7m\2\2\u0690\u0147\3\2\2\2\u0691\u0693\5\u014a\u00a6\2\u0692\u0691"+
		"\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0695\3\2\2\2\u0694\u0696\5\u014e\u00a8"+
		"\2\u0695\u0694\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0149\3\2\2\2\u0697\u0698"+
		"\7?\2\2\u0698\u0699\5\u014c\u00a7\2\u0699\u014b\3\2\2\2\u069a\u069b\5"+
		"\u0214\u010b\2\u069b\u014d\3\2\2\2\u069c\u069d\7@\2\2\u069d\u069e\5\u0150"+
		"\u00a9\2\u069e\u014f\3\2\2\2\u069f\u06a0\t\6\2\2\u06a0\u0151\3\2\2\2\u06a1"+
		"\u06bb\7+\2\2\u06a2\u06bb\7D\2\2\u06a3\u06bb\7E\2\2\u06a4\u06bb\7F\2\2"+
		"\u06a5\u06bb\7>\2\2\u06a6\u06bb\7G\2\2\u06a7\u06bb\7H\2\2\u06a8\u06bb"+
		"\7I\2\2\u06a9\u06bb\7J\2\2\u06aa\u06bb\7K\2\2\u06ab\u06bb\7=\2\2\u06ac"+
		"\u06bb\7;\2\2\u06ad\u06bb\7L\2\2\u06ae\u06bb\7M\2\2\u06af\u06bb\7N\2\2"+
		"\u06b0\u06b1\7N\2\2\u06b1\u06b2\7k\2\2\u06b2\u06b3\7O\2\2\u06b3\u06bb"+
		"\7n\2\2\u06b4\u06b5\7N\2\2\u06b5\u06b6\7k\2\2\u06b6\u06b7\7P\2\2\u06b7"+
		"\u06bb\7n\2\2\u06b8\u06bb\7Q\2\2\u06b9\u06bb\5\u0156\u00ac\2\u06ba\u06a1"+
		"\3\2\2\2\u06ba\u06a2\3\2\2\2\u06ba\u06a3\3\2\2\2\u06ba\u06a4\3\2\2\2\u06ba"+
		"\u06a5\3\2\2\2\u06ba\u06a6\3\2\2\2\u06ba\u06a7\3\2\2\2\u06ba\u06a8\3\2"+
		"\2\2\u06ba\u06a9\3\2\2\2\u06ba\u06aa\3\2\2\2\u06ba\u06ab\3\2\2\2\u06ba"+
		"\u06ac\3\2\2\2\u06ba\u06ad\3\2\2\2\u06ba\u06ae\3\2\2\2\u06ba\u06af\3\2"+
		"\2\2\u06ba\u06b0\3\2\2\2\u06ba\u06b4\3\2\2\2\u06ba\u06b8\3\2\2\2\u06ba"+
		"\u06b9\3\2\2\2\u06bb\u0153\3\2\2\2\u06bc\u06be\5\u0152\u00aa\2\u06bd\u06bf"+
		"\5\u0154\u00ab\2\u06be\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u0155\3"+
		"\2\2\2\u06c0\u06d0\7R\2\2\u06c1\u06c2\7R\2\2\u06c2\u06c3\7k\2\2\u06c3"+
		"\u06c4\7\60\2\2\u06c4\u06d0\7n\2\2\u06c5\u06d0\7S\2\2\u06c6\u06c7\7S\2"+
		"\2\u06c7\u06c8\7k\2\2\u06c8\u06c9\7\60\2\2\u06c9\u06d0\7n\2\2\u06ca\u06d0"+
		"\7T\2\2\u06cb\u06cc\7T\2\2\u06cc\u06cd\7k\2\2\u06cd\u06ce\7\60\2\2\u06ce"+
		"\u06d0\7n\2\2\u06cf\u06c0\3\2\2\2\u06cf\u06c1\3\2\2\2\u06cf\u06c5\3\2"+
		"\2\2\u06cf\u06c6\3\2\2\2\u06cf\u06ca\3\2\2\2\u06cf\u06cb\3\2\2\2\u06d0"+
		"\u0157\3\2\2\2\u06d1\u06d2\b\u00ad\1\2\u06d2\u06d4\5\u015a\u00ae\2\u06d3"+
		"\u06d5\5\u01c8\u00e5\2\u06d4\u06d3\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06e5"+
		"\3\2\2\2\u06d6\u06d8\5\u015c\u00af\2\u06d7\u06d9\5\u01c8\u00e5\2\u06d8"+
		"\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06e5\3\2\2\2\u06da\u06e5\5\u015e"+
		"\u00b0\2\u06db\u06dd\5\u0160\u00b1\2\u06dc\u06de\5\u01c8\u00e5\2\u06dd"+
		"\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e5\3\2\2\2\u06df\u06e5\5\u0166"+
		"\u00b4\2\u06e0\u06e5\5\u0168\u00b5\2\u06e1\u06e2\7U\2\2\u06e2\u06e5\5"+
		"\u01c0\u00e1\2\u06e3\u06e5\5\u016a\u00b6\2\u06e4\u06d1\3\2\2\2\u06e4\u06d6"+
		"\3\2\2\2\u06e4\u06da\3\2\2\2\u06e4\u06db\3\2\2\2\u06e4\u06df\3\2\2\2\u06e4"+
		"\u06e0\3\2\2\2\u06e4\u06e1\3\2\2\2\u06e4\u06e3\3\2\2\2\u06e5\u06eb\3\2"+
		"\2\2\u06e6\u06e7\f\4\2\2\u06e7\u06e8\7V\2\2\u06e8\u06ea\5\u01c0\u00e1"+
		"\2\u06e9\u06e6\3\2\2\2\u06ea\u06ed\3\2\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec"+
		"\3\2\2\2\u06ec\u0159\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ee\u06ef\7u\2\2\u06ef"+
		"\u015b\3\2\2\2\u06f0\u06f1\5\u01e8\u00f5\2\u06f1\u015d\3\2\2\2\u06f2\u06f3"+
		"\7\b\2\2\u06f3\u06f7\5\u0158\u00ad\2\u06f4\u06f5\7\7\2\2\u06f5\u06f7\5"+
		"\u0158\u00ad\2\u06f6\u06f2\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f7\u015f\3\2"+
		"\2\2\u06f8\u06fa\7k\2\2\u06f9\u06fb\5\u0162\u00b2\2\u06fa\u06f9\3\2\2"+
		"\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fd\7n\2\2\u06fd\u0161"+
		"\3\2\2\2\u06fe\u0703\5\u0164\u00b3\2\u06ff\u0700\7p\2\2\u0700\u0702\5"+
		"\u0164\u00b3\2\u0701\u06ff\3\2\2\2\u0702\u0705\3\2\2\2\u0703\u0701\3\2"+
		"\2\2\u0703\u0704\3\2\2\2\u0704\u0163\3\2\2\2\u0705\u0703\3\2\2\2\u0706"+
		"\u0707\5\u0158\u00ad\2\u0707\u0165\3\2\2\2\u0708\u070a\5\u01cc\u00e7\2"+
		"\u0709\u0708\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c"+
		"\7i\2\2\u070c\u070e\5\u00fa~\2\u070d\u070f\5\u0160\u00b1\2\u070e\u070d"+
		"\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0167\3\2\2\2\u0710\u0711\5\u015c\u00af"+
		"\2\u0711\u0712\7w\2\2\u0712\u0169\3\2\2\2\u0713\u0714\5\u0178\u00bd\2"+
		"\u0714\u016b\3\2\2\2\u0715\u0717\7x\2\2\u0716\u0715\3\2\2\2\u0716\u0717"+
		"\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u071a\5\u016e\u00b8\2\u0719\u071b\5"+
		"\u0170\u00b9\2\u071a\u0719\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u016d\3\2"+
		"\2\2\u071c\u071d\5\u01e8\u00f5\2\u071d\u016f\3\2\2\2\u071e\u0720\7k\2"+
		"\2\u071f\u0721\5\u0174\u00bb\2\u0720\u071f\3\2\2\2\u0720\u0721\3\2\2\2"+
		"\u0721\u0722\3\2\2\2\u0722\u0723\7n\2\2\u0723\u0171\3\2\2\2\u0724\u0726"+
		"\5\u016c\u00b7\2\u0725\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0725\3"+
		"\2\2\2\u0727\u0728\3\2\2\2\u0728\u0173\3\2\2\2\u0729\u072b\5\u0176\u00bc"+
		"\2\u072a\u0729\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072a\3\2\2\2\u072c\u072d"+
		"\3\2\2\2\u072d\u0175\3\2\2\2\u072e\u0730\7k\2\2\u072f\u0731\5\u0174\u00bb"+
		"\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0743"+
		"\7n\2\2\u0733\u0735\7l\2\2\u0734\u0736\5\u0174\u00bb\2\u0735\u0734\3\2"+
		"\2\2\u0735\u0736\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0743\7o\2\2\u0738"+
		"\u073a\7j\2\2\u0739\u073b\5\u0174\u00bb\2\u073a\u0739\3\2\2\2\u073a\u073b"+
		"\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u0743\7m\2\2\u073d\u0743\5\u01e8\u00f5"+
		"\2\u073e\u0743\5\u0178\u00bd\2\u073f\u0743\5\u01ec\u00f7\2\u0740\u0743"+
		"\5\u020c\u0107\2\u0741\u0743\5\u0202\u0102\2\u0742\u072e\3\2\2\2\u0742"+
		"\u0733\3\2\2\2\u0742\u0738\3\2\2\2\u0742\u073d\3\2\2\2\u0742\u073e\3\2"+
		"\2\2\u0742\u073f\3\2\2\2\u0742\u0740\3\2\2\2\u0742\u0741\3\2\2\2\u0743"+
		"\u0177\3\2\2\2\u0744\u0746\5\u0180\u00c1\2\u0745\u0744\3\2\2\2\u0745\u0746"+
		"\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0749\5\u017c\u00bf\2\u0748\u074a\5"+
		"\u0184\u00c3\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u0179\3\2"+
		"\2\2\u074b\u0750\5\u0178\u00bd\2\u074c\u074d\7p\2\2\u074d\u074f\5\u0178"+
		"\u00bd\2\u074e\u074c\3\2\2\2\u074f\u0752\3\2\2\2\u0750\u074e\3\2\2\2\u0750"+
		"\u0751\3\2\2\2\u0751\u017b\3\2\2\2\u0752\u0750\3\2\2\2\u0753\u0754\5\u01fe"+
		"\u0100\2\u0754\u0755\5\u01b6\u00dc\2\u0755\u0759\3\2\2\2\u0756\u0759\5"+
		"\u01b6\u00dc\2\u0757\u0759\5\u017e\u00c0\2\u0758\u0753\3\2\2\2\u0758\u0756"+
		"\3\2\2\2\u0758\u0757\3\2\2\2\u0759\u017d\3\2\2\2\u075a\u075b\7y\2\2\u075b"+
		"\u075c\5\u01e8\u00f5\2\u075c\u017f\3\2\2\2\u075d\u0763\7W\2\2\u075e\u075f"+
		"\7W\2\2\u075f\u0763\7w\2\2\u0760\u0761\7W\2\2\u0761\u0763\7v\2\2\u0762"+
		"\u075d\3\2\2\2\u0762\u075e\3\2\2\2\u0762\u0760\3\2\2\2\u0763\u0181\3\2"+
		"\2\2\u0764\u0765\5\u01fc\u00ff\2\u0765\u0766\5\u017c\u00bf\2\u0766\u076f"+
		"\3\2\2\2\u0767\u0769\5\u0186\u00c4\2\u0768\u076a\5\u0180\u00c1\2\u0769"+
		"\u0768\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076c\5\u017c"+
		"\u00bf\2\u076c\u076f\3\2\2\2\u076d\u076f\5\u0188\u00c5\2\u076e\u0764\3"+
		"\2\2\2\u076e\u0767\3\2\2\2\u076e\u076d\3\2\2\2\u076f\u0183\3\2\2\2\u0770"+
		"\u0772\5\u0182\u00c2\2\u0771\u0770\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0771"+
		"\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0185\3\2\2\2\u0775\u0777\7w\2\2\u0776"+
		"\u0778\5\u0180\u00c1\2\u0777\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0779"+
		"\3\2\2\2\u0779\u077a\5\u0178\u00bd\2\u077a\u077b\7q\2\2\u077b\u0187\3"+
		"\2\2\2\u077c\u077d\7U\2\2\u077d\u0787\5\u01c0\u00e1\2\u077e\u077f\7V\2"+
		"\2\u077f\u0787\5\u01c0\u00e1\2\u0780\u0781\7V\2\2\u0781\u0782\7w\2\2\u0782"+
		"\u0787\5\u01c0\u00e1\2\u0783\u0784\7V\2\2\u0784\u0785\7v\2\2\u0785\u0787"+
		"\5\u01c0\u00e1\2\u0786\u077c\3\2\2\2\u0786\u077e\3\2\2\2\u0786\u0780\3"+
		"\2\2\2\u0786\u0783\3\2\2\2\u0787\u0189\3\2\2\2\u0788\u078a\5\u01e8\u00f5"+
		"\2\u0789\u078b\5\u0084C\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2\2\2\u078b"+
		"\u0792\3\2\2\2\u078c\u0792\5\u018e\u00c8\2\u078d\u0792\5\u019e\u00d0\2"+
		"\u078e\u0792\5\u01ac\u00d7\2\u078f\u0792\5\u01b2\u00da\2\u0790\u0792\5"+
		"\u01b4\u00db\2\u0791\u0788\3\2\2\2\u0791\u078c\3\2\2\2\u0791\u078d\3\2"+
		"\2\2\u0791\u078e\3\2\2\2\u0791\u078f\3\2\2\2\u0791\u0790\3\2\2\2\u0792"+
		"\u018b\3\2\2\2\u0793\u0794\7i\2\2\u0794\u0795\5\u01e8\u00f5\2\u0795\u018d"+
		"\3\2\2\2\u0796\u079e\5\u020c\u0107\2\u0797\u079e\5\u0190\u00c9\2\u0798"+
		"\u079e\5\u0196\u00cc\2\u0799\u079e\7X\2\2\u079a\u079e\7Y\2\2\u079b\u079e"+
		"\7Z\2\2\u079c\u079e\7[\2\2\u079d\u0796\3\2\2\2\u079d\u0797\3\2\2\2\u079d"+
		"\u0798\3\2\2\2\u079d\u0799\3\2\2\2\u079d\u079a\3\2\2\2\u079d\u079b\3\2"+
		"\2\2\u079d\u079c\3\2\2\2\u079e\u018f\3\2\2\2\u079f\u07a1\7l\2\2\u07a0"+
		"\u07a2\5\u0192\u00ca\2\u07a1\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a3"+
		"\3\2\2\2\u07a3\u07a4\7o\2\2\u07a4\u0191\3\2\2\2\u07a5\u07aa\5\u0194\u00cb"+
		"\2\u07a6\u07a7\7p\2\2\u07a7\u07a9\5\u0194\u00cb\2\u07a8\u07a6\3\2\2\2"+
		"\u07a9\u07ac\3\2\2\2\u07aa\u07a8\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ae"+
		"\3\2\2\2\u07ac\u07aa\3\2\2\2\u07ad\u07af\7p\2\2\u07ae\u07ad\3\2\2\2\u07ae"+
		"\u07af\3\2\2\2\u07af\u0193\3\2\2\2\u07b0\u07b1\5\u0178\u00bd\2\u07b1\u0195"+
		"\3\2\2\2\u07b2\u07b3\7l\2\2\u07b3\u07b4\5\u0198\u00cd\2\u07b4\u07b5\7"+
		"o\2\2\u07b5\u07b8\3\2\2\2\u07b6\u07b8\5\u019c\u00cf\2\u07b7\u07b2\3\2"+
		"\2\2\u07b7\u07b6\3\2\2\2\u07b8\u0197\3\2\2\2\u07b9\u07be\5\u019a\u00ce"+
		"\2\u07ba\u07bb\7p\2\2\u07bb\u07bd\5\u019a\u00ce\2\u07bc\u07ba\3\2\2\2"+
		"\u07bd\u07c0\3\2\2\2\u07be\u07bc\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c2"+
		"\3\2\2\2\u07c0\u07be\3\2\2\2\u07c1\u07c3\7p\2\2\u07c2\u07c1\3\2\2\2\u07c2"+
		"\u07c3\3\2\2\2\u07c3\u0199\3\2\2\2\u07c4\u07c5\5\u0178\u00bd\2\u07c5\u07c6"+
		"\7q\2\2\u07c6\u07c7\5\u0178\u00bd\2\u07c7\u019b\3\2\2\2\u07c8\u07c9\7"+
		"l\2\2\u07c9\u07ca\7q\2\2\u07ca\u07cb\7o\2\2\u07cb\u019d\3\2\2\2\u07cc"+
		"\u07cf\5\u01a0\u00d1\2\u07cd\u07cf\5\u0202\u0102\2\u07ce\u07cc\3\2\2\2"+
		"\u07ce\u07cd\3\2\2\2\u07cf\u019f\3\2\2\2\u07d0\u07d2\7j\2\2\u07d1\u07d3"+
		"\5\u01a2\u00d2\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d5\3"+
		"\2\2\2\u07d4\u07d6\5\6\4\2\u07d5\u07d4\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6"+
		"\u07d7\3\2\2\2\u07d7\u07d8\7m\2\2\u07d8\u01a1\3\2\2\2\u07d9\u07db\5\u00de"+
		"p\2\u07da\u07dc\5\u00d8m\2\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc"+
		"\u07dd\3\2\2\2\u07dd\u07de\7\5\2\2\u07de\u07f7\3\2\2\2\u07df\u07e1\5\u01ea"+
		"\u00f6\2\u07e0\u07e2\5\u00d8m\2\u07e1\u07e0\3\2\2\2\u07e1\u07e2\3\2\2"+
		"\2\u07e2\u07e3\3\2\2\2\u07e3\u07e4\7\5\2\2\u07e4\u07f7\3\2\2\2\u07e5\u07e6"+
		"\5\u01a4\u00d3\2\u07e6\u07e8\5\u00dep\2\u07e7\u07e9\5\u00d8m\2\u07e8\u07e7"+
		"\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07eb\7\5\2\2\u07eb"+
		"\u07f7\3\2\2\2\u07ec\u07ed\5\u01a4\u00d3\2\u07ed\u07ef\5\u01ea\u00f6\2"+
		"\u07ee\u07f0\5\u00d8m\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0"+
		"\u07f1\3\2\2\2\u07f1\u07f2\7\5\2\2\u07f2\u07f7\3\2\2\2\u07f3\u07f4\5\u01a4"+
		"\u00d3\2\u07f4\u07f5\7\5\2\2\u07f5\u07f7\3\2\2\2\u07f6\u07d9\3\2\2\2\u07f6"+
		"\u07df\3\2\2\2\u07f6\u07e5\3\2\2\2\u07f6\u07ec\3\2\2\2\u07f6\u07f3\3\2"+
		"\2\2\u07f7\u01a3\3\2\2\2\u07f8\u07f9\7l\2\2\u07f9\u07fa\5\u01a6\u00d4"+
		"\2\u07fa\u07fb\7o\2\2\u07fb\u01a5\3\2\2\2\u07fc\u0801\5\u01a8\u00d5\2"+
		"\u07fd\u07fe\7p\2\2\u07fe\u0800\5\u01a8\u00d5\2\u07ff\u07fd\3\2\2\2\u0800"+
		"\u0803\3\2\2\2\u0801\u07ff\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u01a7\3\2"+
		"\2\2\u0803\u0801\3\2\2\2\u0804\u0806\5\u01aa\u00d6\2\u0805\u0804\3\2\2"+
		"\2\u0805\u0806\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0808\5\u0178\u00bd\2"+
		"\u0808\u01a9\3\2\2\2\u0809\u080a\t\7\2\2\u080a\u01ab\3\2\2\2\u080b\u080d"+
		"\7k\2\2\u080c\u080e\5\u01ae\u00d8\2\u080d\u080c\3\2\2\2\u080d\u080e\3"+
		"\2\2\2\u080e\u080f\3\2\2\2\u080f\u0810\7n\2\2\u0810\u01ad\3\2\2\2\u0811"+
		"\u0816\5\u01b0\u00d9\2\u0812\u0813\7p\2\2\u0813\u0815\5\u01b0\u00d9\2"+
		"\u0814\u0812\3\2\2\2\u0815\u0818\3\2\2\2\u0816\u0814\3\2\2\2\u0816\u0817"+
		"\3\2\2\2\u0817\u01af\3\2\2\2\u0818\u0816\3\2\2\2\u0819\u081f\5\u0178\u00bd"+
		"\2\u081a\u081b\5\u01e8\u00f5\2\u081b\u081c\7q\2\2\u081c\u081d\5\u0178"+
		"\u00bd\2\u081d\u081f\3\2\2\2\u081e\u0819\3\2\2\2\u081e\u081a\3\2\2\2\u081f"+
		"\u01b1\3\2\2\2\u0820\u0821\7u\2\2\u0821\u01b3\3\2\2\2\u0822\u0823\7^\2"+
		"\2\u0823\u0824\7k\2\2\u0824\u0825\5\u0178\u00bd\2\u0825\u0826\7n\2\2\u0826"+
		"\u01b5\3\2\2\2\u0827\u0828\b\u00dc\1\2\u0828\u0829\5\u018a\u00c6\2\u0829"+
		"\u082e\3\2\2\2\u082a\u082b\f\3\2\2\u082b\u082d\5\u01b8\u00dd\2\u082c\u082a"+
		"\3\2\2\2\u082d\u0830\3\2\2\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f"+
		"\u01b7\3\2\2\2\u0830\u082e\3\2\2\2\u0831\u0833\7w\2\2\u0832\u0831\3\2"+
		"\2\2\u0832\u0833\3\2\2\2\u0833\u0835\3\2\2\2\u0834\u0836\5\u01ac\u00d7"+
		"\2\u0835\u0834\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u086a"+
		"\5\u01be\u00e0\2\u0838\u083a\7w\2\2\u0839\u0838\3\2\2\2\u0839\u083a\3"+
		"\2\2\2\u083a\u083b\3\2\2\2\u083b\u086a\5\u01ac\u00d7\2\u083c\u083e\7w"+
		"\2\2\u083d\u083c\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u083f\3\2\2\2\u083f"+
		"\u0840\7i\2\2\u0840\u086a\7\67\2\2\u0841\u0843\7w\2\2\u0842\u0841\3\2"+
		"\2\2\u0842\u0843\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0845\7i\2\2\u0845"+
		"\u0846\7\67\2\2\u0846\u0847\7k\2\2\u0847\u0848\5\u01ba\u00de\2\u0848\u0849"+
		"\7n\2\2\u0849\u086a\3\2\2\2\u084a\u084c\7w\2\2\u084b\u084a\3\2\2\2\u084b"+
		"\u084c\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e\7i\2\2\u084e\u0850\5\u01e8"+
		"\u00f5\2\u084f\u0851\5\u0084C\2\u0850\u084f\3\2\2\2\u0850\u0851\3\2\2"+
		"\2\u0851\u086a\3\2\2\2\u0852\u0854\7w\2\2\u0853\u0852\3\2\2\2\u0853\u0854"+
		"\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856\7i\2\2\u0856\u086a\7\u0088\2"+
		"\2\u0857\u0859\7w\2\2\u0858\u0857\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085a"+
		"\3\2\2\2\u085a\u085b\7i\2\2\u085b\u086a\7\u008b\2\2\u085c\u085e\7w\2\2"+
		"\u085d\u085c\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0860"+
		"\7i\2\2\u0860\u086a\7_\2\2\u0861\u0863\7w\2\2\u0862\u0861\3\2\2\2\u0862"+
		"\u0863\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0865\7l\2\2\u0865\u0866\5\u017a"+
		"\u00be\2\u0866\u0867\7o\2\2\u0867\u086a\3\2\2\2\u0868\u086a\5\u0200\u0101"+
		"\2\u0869\u0832\3\2\2\2\u0869\u0839\3\2\2\2\u0869\u083d\3\2\2\2\u0869\u0842"+
		"\3\2\2\2\u0869\u084b\3\2\2\2\u0869\u0853\3\2\2\2\u0869\u0858\3\2\2\2\u0869"+
		"\u085d\3\2\2\2\u0869\u0862\3\2\2\2\u0869\u0868\3\2\2\2\u086a\u01b9\3\2"+
		"\2\2\u086b\u086d\5\u01bc\u00df\2\u086c\u086e\5\u01ba\u00de\2\u086d\u086c"+
		"\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u01bb\3\2\2\2\u086f\u0870\5\u01e8\u00f5"+
		"\2\u0870\u0871\7q\2\2\u0871\u01bd\3\2\2\2\u0872\u0873\5\u01a0\u00d1\2"+
		"\u0873\u01bf\3\2\2\2\u0874\u0875\b\u00e1\1\2\u0875\u087b\5\u01c4\u00e3"+
		"\2\u0876\u087b\5\u01c6\u00e4\2\u0877\u087b\5\u01cc\u00e7\2\u0878\u087b"+
		"\5\u01d0\u00e9\2\u0879\u087b\5\u01da\u00ee\2\u087a\u0874\3\2\2\2\u087a"+
		"\u0876\3\2\2\2\u087a\u0877\3\2\2\2\u087a\u0878\3\2\2\2\u087a\u0879\3\2"+
		"\2\2\u087b\u0894\3\2\2\2\u087c\u087e\f\13\2\2\u087d\u087f\7\63\2\2\u087e"+
		"\u087d\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0881\5\u01f6"+
		"\u00fc\2\u0881\u0882\5\u01c0\u00e1\f\u0882\u0893\3\2\2\2\u0883\u0884\f"+
		"\n\2\2\u0884\u0885\7\64\2\2\u0885\u0886\5\u01f6\u00fc\2\u0886\u0887\5"+
		"\u01c0\u00e1\13\u0887\u0893\3\2\2\2\u0888\u0889\f\7\2\2\u0889\u0893\5"+
		"\u01c2\u00e2\2\u088a\u088b\f\6\2\2\u088b\u0893\7v\2\2\u088c\u088d\f\4"+
		"\2\2\u088d\u088e\7i\2\2\u088e\u0893\7`\2\2\u088f\u0890\f\3\2\2\u0890\u0891"+
		"\7i\2\2\u0891\u0893\7a\2\2\u0892\u087c\3\2\2\2\u0892\u0883\3\2\2\2\u0892"+
		"\u0888\3\2\2\2\u0892\u088a\3\2\2\2\u0892\u088c\3\2\2\2\u0892\u088f\3\2"+
		"\2\2\u0893\u0896\3\2\2\2\u0894\u0892\3\2\2\2\u0894\u0895\3\2\2\2\u0895"+
		"\u01c1\3\2\2\2\u0896\u0894\3\2\2\2\u0897\u0898\7w\2\2\u0898\u01c3\3\2"+
		"\2\2\u0899\u089a\7l\2\2\u089a\u089b\5\u01c0\u00e1\2\u089b\u089c\7o\2\2"+
		"\u089c\u01c5\3\2\2\2\u089d\u089e\7l\2\2\u089e\u089f\5\u01c0\u00e1\2\u089f"+
		"\u08a0\7q\2\2\u08a0\u08a1\5\u01c0\u00e1\2\u08a1\u08a2\7o\2\2\u08a2\u01c7"+
		"\3\2\2\2\u08a3\u08a5\7q\2\2\u08a4\u08a6\5\u0172\u00ba\2\u08a5\u08a4\3"+
		"\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a8\3\2\2\2\u08a7\u08a9\5\u01ca\u00e6"+
		"\2\u08a8\u08a7\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab"+
		"\5\u01c0\u00e1\2\u08ab\u01c9\3\2\2\2\u08ac\u08ad\7b\2\2\u08ad\u01cb\3"+
		"\2\2\2\u08ae\u08b0\5\u01ce\u00e8\2\u08af\u08b1\5\u0084C\2\u08b0\u08af"+
		"\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08ba\3\2\2\2\u08b2\u08b4\5\u01ce\u00e8"+
		"\2\u08b3\u08b5\5\u0084C\2\u08b4\u08b3\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5"+
		"\u08b6\3\2\2\2\u08b6\u08b7\7i\2\2\u08b7\u08b8\5\u01cc\u00e7\2\u08b8\u08ba"+
		"\3\2\2\2\u08b9\u08ae\3\2\2\2\u08b9\u08b2\3\2\2\2\u08ba\u01cd\3\2\2\2\u08bb"+
		"\u08bc\5\u01e8\u00f5\2\u08bc\u01cf\3\2\2\2\u08bd\u08bf\7k\2\2\u08be\u08c0"+
		"\5\u01d2\u00ea\2\u08bf\u08be\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c1\3"+
		"\2\2\2\u08c1\u08c2\7n\2\2\u08c2\u01d1\3\2\2\2\u08c3\u08c5\5\u01d4\u00eb"+
		"\2\u08c4\u08c6\5\u01f8\u00fd\2\u08c5\u08c4\3\2\2\2\u08c5\u08c6\3\2\2\2"+
		"\u08c6\u01d3\3\2\2\2\u08c7\u08cd\5\u01d6\u00ec\2\u08c8\u08c9\5\u01d6\u00ec"+
		"\2\u08c9\u08ca\7p\2\2\u08ca\u08cb\5\u01d4\u00eb\2\u08cb\u08cd\3\2\2\2"+
		"\u08cc\u08c7\3\2\2\2\u08cc\u08c8\3\2\2\2\u08cd\u01d5\3\2\2\2\u08ce\u08d0"+
		"\5\u0172\u00ba\2\u08cf\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d2\3"+
		"\2\2\2\u08d1\u08d3\7b\2\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3"+
		"\u08d4\3\2\2\2\u08d4\u08dc\5\u01c0\u00e1\2\u08d5\u08d7\7b\2\2\u08d6\u08d5"+
		"\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\5\u01d8\u00ed"+
		"\2\u08d9\u08da\5\u01c8\u00e5\2\u08da\u08dc\3\2\2\2\u08db\u08cf\3\2\2\2"+
		"\u08db\u08d6\3\2\2\2\u08dc\u01d7\3\2\2\2\u08dd\u08de\5\u01e8\u00f5\2\u08de"+
		"\u01d9\3\2\2\2\u08df\u08e0\7-\2\2\u08e0\u08e2\7s\2\2\u08e1\u08e3\5\u01dc"+
		"\u00ef\2\u08e2\u08e1\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4"+
		"\u08e5\7t\2\2\u08e5\u01db\3\2\2\2\u08e6\u08ee\5\u01de\u00f0\2\u08e7\u08e8"+
		"\7p\2\2\u08e8\u08ea\5\u01de\u00f0\2\u08e9\u08e7\3\2\2\2\u08ea\u08eb\3"+
		"\2\2\2\u08eb\u08e9\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ee\3\2\2\2\u08ed"+
		"\u08e6\3\2\2\2\u08ed\u08e9\3\2\2\2\u08ee\u01dd\3\2\2\2\u08ef\u08f0\5\u01cc"+
		"\u00e7\2\u08f0\u01df\3\2\2\2\u08f1\u08f2\5\u01e2\u00f2\2\u08f2\u08f3\5"+
		"\u01e6\u00f4\2\u08f3\u08f4\7p\2\2\u08f4\u08f5\5\u01e4\u00f3\2\u08f5\u08fd"+
		"\3\2\2\2\u08f6\u08f7\5\u01e2\u00f2\2\u08f7\u08f8\5\u01e6\u00f4\2\u08f8"+
		"\u08fd\3\2\2\2\u08f9\u08fa\5\u01e2\u00f2\2\u08fa\u08fb\5\u01e4\u00f3\2"+
		"\u08fb\u08fd\3\2\2\2\u08fc\u08f1\3\2\2\2\u08fc\u08f6\3\2\2\2\u08fc\u08f9"+
		"\3\2\2\2\u08fd\u01e1\3\2\2\2\u08fe\u08ff\7q\2\2\u08ff\u01e3\3\2\2\2\u0900"+
		"\u0906\5\u01cc\u00e7\2\u0901\u0902\5\u01cc\u00e7\2\u0902\u0903\7p\2\2"+
		"\u0903\u0904\5\u01e4\u00f3\2\u0904\u0906\3\2\2\2\u0905\u0900\3\2\2\2\u0905"+
		"\u0901\3\2\2\2\u0906\u01e5\3\2\2\2\u0907\u0908\7+\2\2\u0908\u01e7\3\2"+
		"\2\2\u0909\u0910\7h\2\2\u090a\u090b\7c\2\2\u090b\u090c\7h\2\2\u090c\u0910"+
		"\7c\2\2\u090d\u0910\7\u0085\2\2\u090e\u0910\5\u01ec\u00f7\2\u090f\u0909"+
		"\3\2\2\2\u090f\u090a\3\2\2\2\u090f\u090d\3\2\2\2\u090f\u090e\3\2\2\2\u0910"+
		"\u01e9\3\2\2\2\u0911\u0916\5\u01e8\u00f5\2\u0912\u0913\7p\2\2\u0913\u0915"+
		"\5\u01e8\u00f5\2\u0914\u0912\3\2\2\2\u0915\u0918\3\2\2\2\u0916\u0914\3"+
		"\2\2\2\u0916\u0917\3\2\2\2\u0917\u01eb\3\2\2\2\u0918\u0916\3\2\2\2\u0919"+
		"\u091a\t\b\2\2\u091a\u01ed\3\2\2\2\u091b\u091c\6\u00f8\f\2\u091c\u091d"+
		"\7{\2\2\u091d\u01ef\3\2\2\2\u091e\u091f\6\u00f9\r\2\u091f\u0920\7z\2\2"+
		"\u0920\u01f1\3\2\2\2\u0921\u0922\6\u00fa\16\2\u0922\u0923\7y\2\2\u0923"+
		"\u0924\7y\2\2\u0924\u01f3\3\2\2\2\u0925\u0926\6\u00fb\17\2\u0926\u0927"+
		"\7|\2\2\u0927\u0928\7|\2\2\u0928\u01f5\3\2\2\2\u0929\u092a\6\u00fc\20"+
		"\2\u092a\u092b\7z\2\2\u092b\u092c\7t\2\2\u092c\u01f7\3\2\2\2\u092d\u092e"+
		"\6\u00fd\21\2\u092e\u092f\7i\2\2\u092f\u0930\7i\2\2\u0930\u0931\7i\2\2"+
		"\u0931\u01f9\3\2\2\2\u0932\u0933\6\u00fe\22\2\u0933\u0934\7{\2\2\u0934"+
		"\u0935\7{\2\2\u0935\u01fb\3\2\2\2\u0936\u0937\6\u00ff\23\2\u0937\u0938"+
		"\5\u0202\u0102\2\u0938\u01fd\3\2\2\2\u0939\u093a\6\u0100\24\2\u093a\u093b"+
		"\5\u0202\u0102\2\u093b\u01ff\3\2\2\2\u093c\u093d\6\u0101\25\2\u093d\u093e"+
		"\5\u0202\u0102\2\u093e\u0201\3\2\2\2\u093f\u0944\5\u0206\u0104\2\u0940"+
		"\u0941\6\u0102\26\2\u0941\u0943\5\u0204\u0103\2\u0942\u0940\3\2\2\2\u0943"+
		"\u0946\3\2\2\2\u0944\u0942\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0950\3\2"+
		"\2\2\u0946\u0944\3\2\2\2\u0947\u094c\5\u0208\u0105\2\u0948\u0949\6\u0102"+
		"\27\2\u0949\u094b\5\u020a\u0106\2\u094a\u0948\3\2\2\2\u094b\u094e\3\2"+
		"\2\2\u094c\u094a\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u0950\3\2\2\2\u094e"+
		"\u094c\3\2\2\2\u094f\u093f\3\2\2\2\u094f\u0947\3\2\2\2\u0950\u0203\3\2"+
		"\2\2\u0951\u0954\5\u0206\u0104\2\u0952\u0954\7\u0084\2\2\u0953\u0951\3"+
		"\2\2\2\u0953\u0952\3\2\2\2\u0954\u0205\3\2\2\2\u0955\u0958\t\t\2\2\u0956"+
		"\u0958\7\u0083\2\2\u0957\u0955\3\2\2\2\u0957\u0956\3\2\2\2\u0958\u0207"+
		"\3\2\2\2\u0959\u095a\7i\2\2\u095a\u095b\7i\2\2\u095b\u0209\3\2\2\2\u095c"+
		"\u095f\7i\2\2\u095d\u095f\5\u0204\u0103\2\u095e\u095c\3\2\2\2\u095e\u095d"+
		"\3\2\2\2\u095f\u020b\3\2\2\2\u0960\u0965\5\u020e\u0108\2\u0961\u0965\5"+
		"\u0216\u010c\2\u0962\u0965\5\u0210\u0109\2\u0963\u0965\5\u0212\u010a\2"+
		"\u0964\u0960\3\2\2\2\u0964\u0961\3\2\2\2\u0964\u0962\3\2\2\2\u0964\u0963"+
		"\3\2\2\2\u0965\u020d\3\2\2\2\u0966\u0968\5\u01f0\u00f9\2\u0967\u0966\3"+
		"\2\2\2\u0967\u0968\3\2\2\2\u0968\u0969\3\2\2\2\u0969\u096f\5\u0214\u010b"+
		"\2\u096a\u096c\5\u01f0\u00f9\2\u096b\u096a\3\2\2\2\u096b\u096c\3\2\2\2"+
		"\u096c\u096d\3\2\2\2\u096d\u096f\7\u008b\2\2\u096e\u0967\3\2\2\2\u096e"+
		"\u096b\3\2\2\2\u096f\u020f\3\2\2\2\u0970\u0971\t\n\2\2\u0971\u0211\3\2"+
		"\2\2\u0972\u0973\7f\2\2\u0973\u0213\3\2\2\2\u0974\u0975\t\13\2\2\u0975"+
		"\u0215\3\2\2\2\u0976\u0977\t\f\2\2\u0977\u0217\3\2\2\2\u012a\u021b\u0222"+
		"\u0226\u022a\u022e\u0232\u0236\u023a\u023e\u0241\u0246\u024e\u0252\u0256"+
		"\u025a\u0260\u0264\u0268\u026c\u0270\u0274\u027a\u028c\u0293\u0299\u029f"+
		"\u02a3\u02a6\u02b0\u02b8\u02c3\u02c9\u02cf\u02da\u02e0\u02e8\u02f0\u02f4"+
		"\u02f9\u030c\u0318\u031c\u0320\u0326\u0332\u0340\u0344\u0348\u034b\u0351"+
		"\u0356\u0359\u035c\u0362\u0367\u036b\u0377\u0381\u0383\u0390\u039b\u03a4"+
		"\u03ad\u03b9\u03c3\u03c7\u03d1\u03e0\u03f3\u03f8\u03fb\u03ff\u0404\u0408"+
		"\u0413\u0417\u041d\u0420\u042b\u0430\u0439\u043c\u0442\u044d\u0451\u0458"+
		"\u0461\u0464\u046a\u046e\u0479\u0482\u0485\u048a\u0491\u049a\u049d\u04a1"+
		"\u04a6\u04aa\u04b2\u04b5\u04c2\u04c6\u04c9\u04cc\u04d2\u04d6\u04d9\u04de"+
		"\u04e0\u04e4\u04ec\u04f4\u04fb\u04ff\u0502\u0506\u0509\u050d\u0511\u0514"+
		"\u0517\u051d\u0521\u0525\u052b\u052e\u0532\u0535\u0538\u053b\u0540\u0543"+
		"\u0547\u054d\u0551\u0554\u0557\u0561\u0565\u056e\u0577\u057b\u057e\u0588"+
		"\u058c\u0594\u0597\u059a\u059f\u05a2\u05aa\u05b1\u05b4\u05b9\u05bc\u05c4"+
		"\u05c9\u05cc\u05d1\u05d9\u05e2\u05e6\u05f0\u05f6\u05fa\u05fe\u0603\u060a"+
		"\u060d\u0612\u0615\u0619\u061d\u0623\u0629\u062c\u062f\u0633\u0636\u063b"+
		"\u063e\u0642\u0647\u064d\u0652\u0658\u0668\u066b\u066e\u0675\u067c\u0692"+
		"\u0695\u06ba\u06be\u06cf\u06d4\u06d8\u06dd\u06e4\u06eb\u06f6\u06fa\u0703"+
		"\u0709\u070e\u0716\u071a\u0720\u0727\u072c\u0730\u0735\u073a\u0742\u0745"+
		"\u0749\u0750\u0758\u0762\u0769\u076e\u0773\u0777\u0786\u078a\u0791\u079d"+
		"\u07a1\u07aa\u07ae\u07b7\u07be\u07c2\u07ce\u07d2\u07d5\u07db\u07e1\u07e8"+
		"\u07ef\u07f6\u0801\u0805\u080d\u0816\u081e\u082e\u0832\u0835\u0839\u083d"+
		"\u0842\u084b\u0850\u0853\u0858\u085d\u0862\u0869\u086d\u087a\u087e\u0892"+
		"\u0894\u08a5\u08a8\u08b0\u08b4\u08b9\u08bf\u08c5\u08cc\u08cf\u08d2\u08d6"+
		"\u08db\u08e2\u08eb\u08ed\u08fc\u0905\u090f\u0916\u0944\u094c\u094f\u0953"+
		"\u0957\u095e\u0964\u0967\u096b\u096e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}