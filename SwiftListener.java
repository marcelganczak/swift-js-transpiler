// Generated from Swift.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SwiftParser}.
 */
public interface SwiftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SwiftParser#top_level}.
	 * @param ctx the parse tree
	 */
	void enterTop_level(SwiftParser.Top_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#top_level}.
	 * @param ctx the parse tree
	 */
	void exitTop_level(SwiftParser.Top_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SwiftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SwiftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SwiftParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SwiftParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(SwiftParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(SwiftParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(SwiftParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(SwiftParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterFor_init(SwiftParser.For_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitFor_init(SwiftParser.For_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_statement(SwiftParser.For_in_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_statement(SwiftParser.For_in_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(SwiftParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(SwiftParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#condition_clause}.
	 * @param ctx the parse tree
	 */
	void enterCondition_clause(SwiftParser.Condition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#condition_clause}.
	 * @param ctx the parse tree
	 */
	void exitCondition_clause(SwiftParser.Condition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#condition_list}.
	 * @param ctx the parse tree
	 */
	void enterCondition_list(SwiftParser.Condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#condition_list}.
	 * @param ctx the parse tree
	 */
	void exitCondition_list(SwiftParser.Condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SwiftParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SwiftParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#case_condition}.
	 * @param ctx the parse tree
	 */
	void enterCase_condition(SwiftParser.Case_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#case_condition}.
	 * @param ctx the parse tree
	 */
	void exitCase_condition(SwiftParser.Case_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#optional_binding_condition}.
	 * @param ctx the parse tree
	 */
	void enterOptional_binding_condition(SwiftParser.Optional_binding_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#optional_binding_condition}.
	 * @param ctx the parse tree
	 */
	void exitOptional_binding_condition(SwiftParser.Optional_binding_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#optional_binding_head}.
	 * @param ctx the parse tree
	 */
	void enterOptional_binding_head(SwiftParser.Optional_binding_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#optional_binding_head}.
	 * @param ctx the parse tree
	 */
	void exitOptional_binding_head(SwiftParser.Optional_binding_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#optional_binding_continuation_list}.
	 * @param ctx the parse tree
	 */
	void enterOptional_binding_continuation_list(SwiftParser.Optional_binding_continuation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#optional_binding_continuation_list}.
	 * @param ctx the parse tree
	 */
	void exitOptional_binding_continuation_list(SwiftParser.Optional_binding_continuation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#optional_binding_continuation}.
	 * @param ctx the parse tree
	 */
	void enterOptional_binding_continuation(SwiftParser.Optional_binding_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#optional_binding_continuation}.
	 * @param ctx the parse tree
	 */
	void exitOptional_binding_continuation(SwiftParser.Optional_binding_continuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#repeat_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_while_statement(SwiftParser.Repeat_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#repeat_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_while_statement(SwiftParser.Repeat_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterBranch_statement(SwiftParser.Branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitBranch_statement(SwiftParser.Branch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SwiftParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SwiftParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(SwiftParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(SwiftParser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#guard_statement}.
	 * @param ctx the parse tree
	 */
	void enterGuard_statement(SwiftParser.Guard_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#guard_statement}.
	 * @param ctx the parse tree
	 */
	void exitGuard_statement(SwiftParser.Guard_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(SwiftParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(SwiftParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_cases(SwiftParser.Switch_casesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_cases(SwiftParser.Switch_casesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(SwiftParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(SwiftParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(SwiftParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(SwiftParser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_item_list(SwiftParser.Case_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_item_list(SwiftParser.Case_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#default_label}.
	 * @param ctx the parse tree
	 */
	void enterDefault_label(SwiftParser.Default_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#default_label}.
	 * @param ctx the parse tree
	 */
	void exitDefault_label(SwiftParser.Default_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(SwiftParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(SwiftParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#where_expression}.
	 * @param ctx the parse tree
	 */
	void enterWhere_expression(SwiftParser.Where_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#where_expression}.
	 * @param ctx the parse tree
	 */
	void exitWhere_expression(SwiftParser.Where_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(SwiftParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(SwiftParser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#statement_label}.
	 * @param ctx the parse tree
	 */
	void enterStatement_label(SwiftParser.Statement_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#statement_label}.
	 * @param ctx the parse tree
	 */
	void exitStatement_label(SwiftParser.Statement_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(SwiftParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(SwiftParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_transfer_statement(SwiftParser.Control_transfer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_transfer_statement(SwiftParser.Control_transfer_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(SwiftParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(SwiftParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(SwiftParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(SwiftParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void enterFallthrough_statement(SwiftParser.Fallthrough_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void exitFallthrough_statement(SwiftParser.Fallthrough_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(SwiftParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(SwiftParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#availability_condition}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_condition(SwiftParser.Availability_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#availability_condition}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_condition(SwiftParser.Availability_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#availability_arguments}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_arguments(SwiftParser.Availability_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#availability_arguments}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_arguments(SwiftParser.Availability_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#availability_argument}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_argument(SwiftParser.Availability_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#availability_argument}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_argument(SwiftParser.Availability_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(SwiftParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(SwiftParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#defer_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefer_statement(SwiftParser.Defer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#defer_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefer_statement(SwiftParser.Defer_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(SwiftParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(SwiftParser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clauses(SwiftParser.Catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clauses(SwiftParser.Catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clause(SwiftParser.Catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clause(SwiftParser.Catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#compiler_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_control_statement(SwiftParser.Compiler_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#compiler_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_control_statement(SwiftParser.Compiler_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#build_configuration_statement}.
	 * @param ctx the parse tree
	 */
	void enterBuild_configuration_statement(SwiftParser.Build_configuration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#build_configuration_statement}.
	 * @param ctx the parse tree
	 */
	void exitBuild_configuration_statement(SwiftParser.Build_configuration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#build_configuration_elseif_clauses}.
	 * @param ctx the parse tree
	 */
	void enterBuild_configuration_elseif_clauses(SwiftParser.Build_configuration_elseif_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#build_configuration_elseif_clauses}.
	 * @param ctx the parse tree
	 */
	void exitBuild_configuration_elseif_clauses(SwiftParser.Build_configuration_elseif_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#build_configuration_elseif_clause}.
	 * @param ctx the parse tree
	 */
	void enterBuild_configuration_elseif_clause(SwiftParser.Build_configuration_elseif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#build_configuration_elseif_clause}.
	 * @param ctx the parse tree
	 */
	void exitBuild_configuration_elseif_clause(SwiftParser.Build_configuration_elseif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#build_configuration_else_clause}.
	 * @param ctx the parse tree
	 */
	void enterBuild_configuration_else_clause(SwiftParser.Build_configuration_else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#build_configuration_else_clause}.
	 * @param ctx the parse tree
	 */
	void exitBuild_configuration_else_clause(SwiftParser.Build_configuration_else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#build_configuration}.
	 * @param ctx the parse tree
	 */
	void enterBuild_configuration(SwiftParser.Build_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#build_configuration}.
	 * @param ctx the parse tree
	 */
	void exitBuild_configuration(SwiftParser.Build_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#platform_testing_function}.
	 * @param ctx the parse tree
	 */
	void enterPlatform_testing_function(SwiftParser.Platform_testing_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#platform_testing_function}.
	 * @param ctx the parse tree
	 */
	void exitPlatform_testing_function(SwiftParser.Platform_testing_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#operating_system}.
	 * @param ctx the parse tree
	 */
	void enterOperating_system(SwiftParser.Operating_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operating_system}.
	 * @param ctx the parse tree
	 */
	void exitOperating_system(SwiftParser.Operating_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#architecture}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture(SwiftParser.ArchitectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#architecture}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture(SwiftParser.ArchitectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#line_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterLine_control_statement(SwiftParser.Line_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#line_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitLine_control_statement(SwiftParser.Line_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#line_number}.
	 * @param ctx the parse tree
	 */
	void enterLine_number(SwiftParser.Line_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#line_number}.
	 * @param ctx the parse tree
	 */
	void exitLine_number(SwiftParser.Line_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(SwiftParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(SwiftParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_clause(SwiftParser.Generic_parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_clause(SwiftParser.Generic_parameter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_list(SwiftParser.Generic_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_list(SwiftParser.Generic_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter(SwiftParser.Generic_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter(SwiftParser.Generic_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#requirement_clause}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_clause(SwiftParser.Requirement_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#requirement_clause}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_clause(SwiftParser.Requirement_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_list(SwiftParser.Requirement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_list(SwiftParser.Requirement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(SwiftParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(SwiftParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void enterConformance_requirement(SwiftParser.Conformance_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void exitConformance_requirement(SwiftParser.Conformance_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void enterSame_type_requirement(SwiftParser.Same_type_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void exitSame_type_requirement(SwiftParser.Same_type_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_clause(SwiftParser.Generic_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_clause(SwiftParser.Generic_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_list(SwiftParser.Generic_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_list(SwiftParser.Generic_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument(SwiftParser.Generic_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument(SwiftParser.Generic_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SwiftParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SwiftParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SwiftParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SwiftParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#top_level_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTop_level_declaration(SwiftParser.Top_level_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#top_level_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTop_level_declaration(SwiftParser.Top_level_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(SwiftParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(SwiftParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void enterImport_declaration(SwiftParser.Import_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void exitImport_declaration(SwiftParser.Import_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#import_kind}.
	 * @param ctx the parse tree
	 */
	void enterImport_kind(SwiftParser.Import_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#import_kind}.
	 * @param ctx the parse tree
	 */
	void exitImport_kind(SwiftParser.Import_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#import_path}.
	 * @param ctx the parse tree
	 */
	void enterImport_path(SwiftParser.Import_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#import_path}.
	 * @param ctx the parse tree
	 */
	void exitImport_path(SwiftParser.Import_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void enterImport_path_identifier(SwiftParser.Import_path_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void exitImport_path_identifier(SwiftParser.Import_path_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(SwiftParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(SwiftParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer_list(SwiftParser.Pattern_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer_list(SwiftParser.Pattern_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer(SwiftParser.Pattern_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer(SwiftParser.Pattern_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(SwiftParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(SwiftParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(SwiftParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(SwiftParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_head(SwiftParser.Variable_declaration_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_head(SwiftParser.Variable_declaration_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(SwiftParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(SwiftParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_block(SwiftParser.Getter_setter_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_block(SwiftParser.Getter_setter_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_clause(SwiftParser.Getter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_clause(SwiftParser.Getter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_clause(SwiftParser.Setter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_clause(SwiftParser.Setter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#setter_name}.
	 * @param ctx the parse tree
	 */
	void enterSetter_name(SwiftParser.Setter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#setter_name}.
	 * @param ctx the parse tree
	 */
	void exitSetter_name(SwiftParser.Setter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_keyword_block(SwiftParser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_keyword_block(SwiftParser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_keyword_clause(SwiftParser.Getter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_keyword_clause(SwiftParser.Getter_keyword_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_keyword_clause(SwiftParser.Setter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_keyword_clause(SwiftParser.Setter_keyword_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_didSet_block(SwiftParser.WillSet_didSet_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_didSet_block(SwiftParser.WillSet_didSet_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_clause(SwiftParser.WillSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_clause(SwiftParser.WillSet_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterDidSet_clause(SwiftParser.DidSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitDidSet_clause(SwiftParser.DidSet_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_declaration(SwiftParser.Typealias_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_declaration(SwiftParser.Typealias_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealias_head}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_head(SwiftParser.Typealias_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealias_head}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_head(SwiftParser.Typealias_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_name(SwiftParser.Typealias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_name(SwiftParser.Typealias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_assignment(SwiftParser.Typealias_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_assignment(SwiftParser.Typealias_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(SwiftParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(SwiftParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_head}.
	 * @param ctx the parse tree
	 */
	void enterFunction_head(SwiftParser.Function_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_head}.
	 * @param ctx the parse tree
	 */
	void exitFunction_head(SwiftParser.Function_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SwiftParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SwiftParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunction_signature(SwiftParser.Function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunction_signature(SwiftParser.Function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_result}.
	 * @param ctx the parse tree
	 */
	void enterFunction_result(SwiftParser.Function_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_result}.
	 * @param ctx the parse tree
	 */
	void exitFunction_result(SwiftParser.Function_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(SwiftParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(SwiftParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameter_clauses}.
	 * @param ctx the parse tree
	 */
	void enterParameter_clauses(SwiftParser.Parameter_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameter_clauses}.
	 * @param ctx the parse tree
	 */
	void exitParameter_clauses(SwiftParser.Parameter_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterParameter_clause(SwiftParser.Parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitParameter_clause(SwiftParser.Parameter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(SwiftParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(SwiftParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SwiftParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SwiftParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#external_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterExternal_parameter_name(SwiftParser.External_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#external_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitExternal_parameter_name(SwiftParser.External_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterLocal_parameter_name(SwiftParser.Local_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitLocal_parameter_name(SwiftParser.Local_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argument_clause(SwiftParser.Default_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argument_clause(SwiftParser.Default_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(SwiftParser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(SwiftParser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum(SwiftParser.Union_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum(SwiftParser.Union_style_enumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_members(SwiftParser.Union_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_members(SwiftParser.Union_style_enum_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_member(SwiftParser.Union_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_member(SwiftParser.Union_style_enum_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_clause(SwiftParser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_clause(SwiftParser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_list(SwiftParser.Union_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_list(SwiftParser.Union_style_enum_case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case(SwiftParser.Union_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case(SwiftParser.Union_style_enum_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#enum_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_name(SwiftParser.Enum_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enum_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_name(SwiftParser.Enum_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_name(SwiftParser.Enum_case_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_name(SwiftParser.Enum_case_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum(SwiftParser.Raw_value_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum(SwiftParser.Raw_value_style_enumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_members(SwiftParser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_members(SwiftParser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_member(SwiftParser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_member(SwiftParser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_clause(SwiftParser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_clause(SwiftParser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_list(SwiftParser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_list(SwiftParser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case(SwiftParser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case(SwiftParser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_assignment(SwiftParser.Raw_value_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_assignment(SwiftParser.Raw_value_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#raw_value_literal}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_literal(SwiftParser.Raw_value_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#raw_value_literal}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_literal(SwiftParser.Raw_value_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(SwiftParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(SwiftParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#struct_name}.
	 * @param ctx the parse tree
	 */
	void enterStruct_name(SwiftParser.Struct_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#struct_name}.
	 * @param ctx the parse tree
	 */
	void exitStruct_name(SwiftParser.Struct_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(SwiftParser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(SwiftParser.Struct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(SwiftParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(SwiftParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(SwiftParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(SwiftParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(SwiftParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(SwiftParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration(SwiftParser.Protocol_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration(SwiftParser.Protocol_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_name(SwiftParser.Protocol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_name(SwiftParser.Protocol_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_body(SwiftParser.Protocol_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_body(SwiftParser.Protocol_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member_declaration(SwiftParser.Protocol_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member_declaration(SwiftParser.Protocol_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member_declarations(SwiftParser.Protocol_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member_declarations(SwiftParser.Protocol_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_property_declaration(SwiftParser.Protocol_property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_property_declaration(SwiftParser.Protocol_property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_method_declaration(SwiftParser.Protocol_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_method_declaration(SwiftParser.Protocol_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_initializer_declaration(SwiftParser.Protocol_initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_initializer_declaration(SwiftParser.Protocol_initializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_subscript_declaration(SwiftParser.Protocol_subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_subscript_declaration(SwiftParser.Protocol_subscript_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_associated_type_declaration(SwiftParser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_associated_type_declaration(SwiftParser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_declaration(SwiftParser.Initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_declaration(SwiftParser.Initializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_head(SwiftParser.Initializer_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_head(SwiftParser.Initializer_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_body(SwiftParser.Initializer_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_body(SwiftParser.Initializer_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeinitializer_declaration(SwiftParser.Deinitializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeinitializer_declaration(SwiftParser.Deinitializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtension_declaration(SwiftParser.Extension_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtension_declaration(SwiftParser.Extension_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#extension_body}.
	 * @param ctx the parse tree
	 */
	void enterExtension_body(SwiftParser.Extension_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#extension_body}.
	 * @param ctx the parse tree
	 */
	void exitExtension_body(SwiftParser.Extension_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_declaration(SwiftParser.Subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_declaration(SwiftParser.Subscript_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_head(SwiftParser.Subscript_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_head(SwiftParser.Subscript_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_result(SwiftParser.Subscript_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_result(SwiftParser.Subscript_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(SwiftParser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(SwiftParser.Operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator_declaration(SwiftParser.Prefix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator_declaration(SwiftParser.Prefix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator_declaration(SwiftParser.Postfix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator_declaration(SwiftParser.Postfix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_declaration(SwiftParser.Infix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_declaration(SwiftParser.Infix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_attributes(SwiftParser.Infix_operator_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_attributes(SwiftParser.Infix_operator_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedence_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_clause(SwiftParser.Precedence_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedence_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_clause(SwiftParser.Precedence_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedence_level}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_level(SwiftParser.Precedence_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedence_level}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_level(SwiftParser.Precedence_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#associativity_clause}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity_clause(SwiftParser.Associativity_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#associativity_clause}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity_clause(SwiftParser.Associativity_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#associativity}.
	 * @param ctx the parse tree
	 */
	void enterAssociativity(SwiftParser.AssociativityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#associativity}.
	 * @param ctx the parse tree
	 */
	void exitAssociativity(SwiftParser.AssociativityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#declaration_modifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_modifier(SwiftParser.Declaration_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declaration_modifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_modifier(SwiftParser.Declaration_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#declaration_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_modifiers(SwiftParser.Declaration_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declaration_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_modifiers(SwiftParser.Declaration_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#access_level_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_level_modifier(SwiftParser.Access_level_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#access_level_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_level_modifier(SwiftParser.Access_level_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(SwiftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(SwiftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_pattern(SwiftParser.Wildcard_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_pattern(SwiftParser.Wildcard_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_pattern(SwiftParser.Identifier_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_pattern(SwiftParser.Identifier_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void enterValue_binding_pattern(SwiftParser.Value_binding_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void exitValue_binding_pattern(SwiftParser.Value_binding_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern(SwiftParser.Tuple_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern(SwiftParser.Tuple_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element_list(SwiftParser.Tuple_pattern_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element_list(SwiftParser.Tuple_pattern_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element(SwiftParser.Tuple_pattern_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element(SwiftParser.Tuple_pattern_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_pattern(SwiftParser.Enum_case_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_pattern(SwiftParser.Enum_case_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#optional_pattern}.
	 * @param ctx the parse tree
	 */
	void enterOptional_pattern(SwiftParser.Optional_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#optional_pattern}.
	 * @param ctx the parse tree
	 */
	void exitOptional_pattern(SwiftParser.Optional_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void enterExpression_pattern(SwiftParser.Expression_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void exitExpression_pattern(SwiftParser.Expression_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(SwiftParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(SwiftParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(SwiftParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(SwiftParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument_clause(SwiftParser.Attribute_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument_clause(SwiftParser.Attribute_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(SwiftParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(SwiftParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_tokens(SwiftParser.Balanced_tokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_tokens(SwiftParser.Balanced_tokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_token(SwiftParser.Balanced_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_token(SwiftParser.Balanced_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SwiftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SwiftParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(SwiftParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(SwiftParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expression(SwiftParser.Prefix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expression(SwiftParser.Prefix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void enterIn_out_expression(SwiftParser.In_out_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void exitIn_out_expression(SwiftParser.In_out_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#try_operator}.
	 * @param ctx the parse tree
	 */
	void enterTry_operator(SwiftParser.Try_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#try_operator}.
	 * @param ctx the parse tree
	 */
	void exitTry_operator(SwiftParser.Try_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(SwiftParser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(SwiftParser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#binary_expressions}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expressions(SwiftParser.Binary_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#binary_expressions}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expressions(SwiftParser.Binary_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(SwiftParser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(SwiftParser.Conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void enterType_casting_operator(SwiftParser.Type_casting_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void exitType_casting_operator(SwiftParser.Type_casting_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(SwiftParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(SwiftParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_member_expression(SwiftParser.Implicit_member_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_member_expression(SwiftParser.Implicit_member_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(SwiftParser.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(SwiftParser.Literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(SwiftParser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(SwiftParser.Array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_items(SwiftParser.Array_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_items(SwiftParser.Array_literal_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_item(SwiftParser.Array_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_item(SwiftParser.Array_literal_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal(SwiftParser.Dictionary_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal(SwiftParser.Dictionary_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_items(SwiftParser.Dictionary_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_items(SwiftParser.Dictionary_literal_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_item(SwiftParser.Dictionary_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_item(SwiftParser.Dictionary_literal_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#self_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelf_expression(SwiftParser.Self_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#self_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelf_expression(SwiftParser.Self_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_expression(SwiftParser.Superclass_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_expression(SwiftParser.Superclass_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclass_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_method_expression(SwiftParser.Superclass_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclass_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_method_expression(SwiftParser.Superclass_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_subscript_expression(SwiftParser.Superclass_subscript_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_subscript_expression(SwiftParser.Superclass_subscript_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_initializer_expression(SwiftParser.Superclass_initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_initializer_expression(SwiftParser.Superclass_initializer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void enterClosure_expression(SwiftParser.Closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void exitClosure_expression(SwiftParser.Closure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void enterClosure_signature(SwiftParser.Closure_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void exitClosure_signature(SwiftParser.Closure_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#capture_list}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list(SwiftParser.Capture_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#capture_list}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list(SwiftParser.Capture_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#capture_list_items}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list_items(SwiftParser.Capture_list_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#capture_list_items}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list_items(SwiftParser.Capture_list_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#capture_list_item}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list_item(SwiftParser.Capture_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#capture_list_item}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list_item(SwiftParser.Capture_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void enterCapture_specifier(SwiftParser.Capture_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void exitCapture_specifier(SwiftParser.Capture_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(SwiftParser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(SwiftParser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression_element_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_element_list(SwiftParser.Expression_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression_element_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_element_list(SwiftParser.Expression_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression_element}.
	 * @param ctx the parse tree
	 */
	void enterExpression_element(SwiftParser.Expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression_element}.
	 * @param ctx the parse tree
	 */
	void exitExpression_element(SwiftParser.Expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_expression(SwiftParser.Wildcard_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_expression(SwiftParser.Wildcard_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelector_expression(SwiftParser.Selector_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelector_expression(SwiftParser.Selector_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_with_closure_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_with_closure_expression(SwiftParser.Function_call_with_closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_with_closure_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_with_closure_expression(SwiftParser.Function_call_with_closure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializer_expression_with_args}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_expression_with_args(SwiftParser.Initializer_expression_with_argsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializer_expression_with_args}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_expression_with_args(SwiftParser.Initializer_expression_with_argsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression(SwiftParser.Function_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression(SwiftParser.Function_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_expression(SwiftParser.Subscript_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_expression(SwiftParser.Subscript_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression1}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression1(SwiftParser.Explicit_member_expression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression1}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression1(SwiftParser.Explicit_member_expression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression2}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression2(SwiftParser.Explicit_member_expression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression2}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression2(SwiftParser.Explicit_member_expression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code initializer_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_expression(SwiftParser.Initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializer_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_expression(SwiftParser.Initializer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicit_member_expression3}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_expression3(SwiftParser.Explicit_member_expression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicit_member_expression3}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_expression3(SwiftParser.Explicit_member_expression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamic_type_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_type_expression(SwiftParser.Dynamic_type_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamic_type_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_type_expression(SwiftParser.Dynamic_type_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_operation}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operation(SwiftParser.Postfix_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_operation}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operation(SwiftParser.Postfix_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primary}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SwiftParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SwiftParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfix_self_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_self_expression(SwiftParser.Postfix_self_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfix_self_expression}
	 * labeled alternative in {@link SwiftParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_self_expression(SwiftParser.Postfix_self_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#argument_names}.
	 * @param ctx the parse tree
	 */
	void enterArgument_names(SwiftParser.Argument_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#argument_names}.
	 * @param ctx the parse tree
	 */
	void exitArgument_names(SwiftParser.Argument_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#argument_name}.
	 * @param ctx the parse tree
	 */
	void enterArgument_name(SwiftParser.Argument_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#argument_name}.
	 * @param ctx the parse tree
	 */
	void exitArgument_name(SwiftParser.Argument_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#trailing_closure}.
	 * @param ctx the parse tree
	 */
	void enterTrailing_closure(SwiftParser.Trailing_closureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#trailing_closure}.
	 * @param ctx the parse tree
	 */
	void exitTrailing_closure(SwiftParser.Trailing_closureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SwiftParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SwiftParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterType_annotation(SwiftParser.Type_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitType_annotation(SwiftParser.Type_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(SwiftParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(SwiftParser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SwiftParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SwiftParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(SwiftParser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(SwiftParser.Tuple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_type_body}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_body(SwiftParser.Tuple_type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_type_body}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_body(SwiftParser.Tuple_type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element_list(SwiftParser.Tuple_type_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element_list(SwiftParser.Tuple_type_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element(SwiftParser.Tuple_type_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element(SwiftParser.Tuple_type_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#element_name}.
	 * @param ctx the parse tree
	 */
	void enterElement_name(SwiftParser.Element_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#element_name}.
	 * @param ctx the parse tree
	 */
	void exitElement_name(SwiftParser.Element_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_composition_type(SwiftParser.Protocol_composition_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_composition_type(SwiftParser.Protocol_composition_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_identifier_list(SwiftParser.Protocol_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_identifier_list(SwiftParser.Protocol_identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocol_identifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_identifier(SwiftParser.Protocol_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocol_identifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_identifier(SwiftParser.Protocol_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_clause(SwiftParser.Type_inheritance_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_clause(SwiftParser.Type_inheritance_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_list(SwiftParser.Type_inheritance_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_list(SwiftParser.Type_inheritance_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#class_requirement}.
	 * @param ctx the parse tree
	 */
	void enterClass_requirement(SwiftParser.Class_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#class_requirement}.
	 * @param ctx the parse tree
	 */
	void exitClass_requirement(SwiftParser.Class_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SwiftParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SwiftParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(SwiftParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(SwiftParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 */
	void enterContext_sensitive_keyword(SwiftParser.Context_sensitive_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 */
	void exitContext_sensitive_keyword(SwiftParser.Context_sensitive_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(SwiftParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(SwiftParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterNegate_prefix_operator(SwiftParser.Negate_prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitNegate_prefix_operator(SwiftParser.Negate_prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#build_AND}.
	 * @param ctx the parse tree
	 */
	void enterBuild_AND(SwiftParser.Build_ANDContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#build_AND}.
	 * @param ctx the parse tree
	 */
	void exitBuild_AND(SwiftParser.Build_ANDContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#build_OR}.
	 * @param ctx the parse tree
	 */
	void enterBuild_OR(SwiftParser.Build_ORContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#build_OR}.
	 * @param ctx the parse tree
	 */
	void exitBuild_OR(SwiftParser.Build_ORContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#arrow_operator}.
	 * @param ctx the parse tree
	 */
	void enterArrow_operator(SwiftParser.Arrow_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#arrow_operator}.
	 * @param ctx the parse tree
	 */
	void exitArrow_operator(SwiftParser.Arrow_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#range_operator}.
	 * @param ctx the parse tree
	 */
	void enterRange_operator(SwiftParser.Range_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#range_operator}.
	 * @param ctx the parse tree
	 */
	void exitRange_operator(SwiftParser.Range_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#same_type_equals}.
	 * @param ctx the parse tree
	 */
	void enterSame_type_equals(SwiftParser.Same_type_equalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#same_type_equals}.
	 * @param ctx the parse tree
	 */
	void exitSame_type_equals(SwiftParser.Same_type_equalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(SwiftParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(SwiftParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(SwiftParser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(SwiftParser.Prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator(SwiftParser.Postfix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator(SwiftParser.Postfix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SwiftParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SwiftParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#operator_character}.
	 * @param ctx the parse tree
	 */
	void enterOperator_character(SwiftParser.Operator_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operator_character}.
	 * @param ctx the parse tree
	 */
	void exitOperator_character(SwiftParser.Operator_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#operator_head}.
	 * @param ctx the parse tree
	 */
	void enterOperator_head(SwiftParser.Operator_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operator_head}.
	 * @param ctx the parse tree
	 */
	void exitOperator_head(SwiftParser.Operator_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#dot_operator_head}.
	 * @param ctx the parse tree
	 */
	void enterDot_operator_head(SwiftParser.Dot_operator_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dot_operator_head}.
	 * @param ctx the parse tree
	 */
	void exitDot_operator_head(SwiftParser.Dot_operator_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#dot_operator_character}.
	 * @param ctx the parse tree
	 */
	void enterDot_operator_character(SwiftParser.Dot_operator_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dot_operator_character}.
	 * @param ctx the parse tree
	 */
	void exitDot_operator_character(SwiftParser.Dot_operator_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SwiftParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SwiftParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(SwiftParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(SwiftParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(SwiftParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(SwiftParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#nil_literal}.
	 * @param ctx the parse tree
	 */
	void enterNil_literal(SwiftParser.Nil_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#nil_literal}.
	 * @param ctx the parse tree
	 */
	void exitNil_literal(SwiftParser.Nil_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(SwiftParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(SwiftParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(SwiftParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(SwiftParser.String_literalContext ctx);
}