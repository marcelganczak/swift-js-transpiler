// Generated from Swift.g4 by ANTLR 4.5
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link SwiftVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 */
public class LeafToTextVisitor extends SwiftBaseVisitor<String> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTop_level(SwiftParser.Top_levelContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStatement(SwiftParser.StatementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStatements(SwiftParser.StatementsContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLoop_statement(SwiftParser.Loop_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFor_statement(SwiftParser.For_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFor_init(SwiftParser.For_initContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFor_in_statement(SwiftParser.For_in_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWhile_statement(SwiftParser.While_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCondition_clause(SwiftParser.Condition_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCondition_list(SwiftParser.Condition_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCondition(SwiftParser.ConditionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCase_condition(SwiftParser.Case_conditionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOptional_binding_condition(SwiftParser.Optional_binding_conditionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOptional_binding_head(SwiftParser.Optional_binding_headContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOptional_binding_continuation_list(SwiftParser.Optional_binding_continuation_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOptional_binding_continuation(SwiftParser.Optional_binding_continuationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRepeat_while_statement(SwiftParser.Repeat_while_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBranch_statement(SwiftParser.Branch_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIf_statement(SwiftParser.If_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitElse_clause(SwiftParser.Else_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGuard_statement(SwiftParser.Guard_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSwitch_statement(SwiftParser.Switch_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSwitch_cases(SwiftParser.Switch_casesContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSwitch_case(SwiftParser.Switch_caseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCase_label(SwiftParser.Case_labelContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCase_item_list(SwiftParser.Case_item_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDefault_label(SwiftParser.Default_labelContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWhere_clause(SwiftParser.Where_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWhere_expression(SwiftParser.Where_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLabeled_statement(SwiftParser.Labeled_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStatement_label(SwiftParser.Statement_labelContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLabel_name(SwiftParser.Label_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitControl_transfer_statement(SwiftParser.Control_transfer_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBreak_statement(SwiftParser.Break_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitContinue_statement(SwiftParser.Continue_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFallthrough_statement(SwiftParser.Fallthrough_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitReturn_statement(SwiftParser.Return_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAvailability_condition(SwiftParser.Availability_conditionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAvailability_arguments(SwiftParser.Availability_argumentsContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAvailability_argument(SwiftParser.Availability_argumentContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitThrow_statement(SwiftParser.Throw_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDefer_statement(SwiftParser.Defer_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDo_statement(SwiftParser.Do_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCatch_clauses(SwiftParser.Catch_clausesContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCatch_clause(SwiftParser.Catch_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCompiler_control_statement(SwiftParser.Compiler_control_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBuild_configuration_statement(SwiftParser.Build_configuration_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBuild_configuration_elseif_clauses(SwiftParser.Build_configuration_elseif_clausesContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBuild_configuration_elseif_clause(SwiftParser.Build_configuration_elseif_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBuild_configuration_else_clause(SwiftParser.Build_configuration_else_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBuild_configuration(SwiftParser.Build_configurationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPlatform_testing_function(SwiftParser.Platform_testing_functionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOperating_system(SwiftParser.Operating_systemContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArchitecture(SwiftParser.ArchitectureContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLine_control_statement(SwiftParser.Line_control_statementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLine_number(SwiftParser.Line_numberContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFile_name(SwiftParser.File_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGeneric_parameter_clause(SwiftParser.Generic_parameter_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGeneric_parameter_list(SwiftParser.Generic_parameter_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGeneric_parameter(SwiftParser.Generic_parameterContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRequirement_clause(SwiftParser.Requirement_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRequirement_list(SwiftParser.Requirement_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRequirement(SwiftParser.RequirementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitConformance_requirement(SwiftParser.Conformance_requirementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSame_type_requirement(SwiftParser.Same_type_requirementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGeneric_argument_clause(SwiftParser.Generic_argument_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGeneric_argument_list(SwiftParser.Generic_argument_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGeneric_argument(SwiftParser.Generic_argumentContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeclaration(SwiftParser.DeclarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeclarations(SwiftParser.DeclarationsContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTop_level_declaration(SwiftParser.Top_level_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCode_block(SwiftParser.Code_blockContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitImport_declaration(SwiftParser.Import_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitImport_kind(SwiftParser.Import_kindContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitImport_path(SwiftParser.Import_pathContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitImport_path_identifier(SwiftParser.Import_path_identifierContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitConstant_declaration(SwiftParser.Constant_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPattern_initializer_list(SwiftParser.Pattern_initializer_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPattern_initializer(SwiftParser.Pattern_initializerContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInitializer(SwiftParser.InitializerContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVariable_declaration(SwiftParser.Variable_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVariable_declaration_head(SwiftParser.Variable_declaration_headContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVariable_name(SwiftParser.Variable_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGetter_setter_block(SwiftParser.Getter_setter_blockContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGetter_clause(SwiftParser.Getter_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSetter_clause(SwiftParser.Setter_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSetter_name(SwiftParser.Setter_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGetter_setter_keyword_block(SwiftParser.Getter_setter_keyword_blockContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitGetter_keyword_clause(SwiftParser.Getter_keyword_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSetter_keyword_clause(SwiftParser.Setter_keyword_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWillSet_didSet_block(SwiftParser.WillSet_didSet_blockContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWillSet_clause(SwiftParser.WillSet_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDidSet_clause(SwiftParser.DidSet_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTypealias_declaration(SwiftParser.Typealias_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTypealias_head(SwiftParser.Typealias_headContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTypealias_name(SwiftParser.Typealias_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTypealias_assignment(SwiftParser.Typealias_assignmentContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_declaration(SwiftParser.Function_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_head(SwiftParser.Function_headContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_name(SwiftParser.Function_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_signature(SwiftParser.Function_signatureContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_result(SwiftParser.Function_resultContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_body(SwiftParser.Function_bodyContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitParameter_clauses(SwiftParser.Parameter_clausesContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitParameter_clause(SwiftParser.Parameter_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitParameter_list(SwiftParser.Parameter_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitParameter(SwiftParser.ParameterContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExternal_parameter_name(SwiftParser.External_parameter_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLocal_parameter_name(SwiftParser.Local_parameter_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDefault_argument_clause(SwiftParser.Default_argument_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEnum_declaration(SwiftParser.Enum_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitUnion_style_enum(SwiftParser.Union_style_enumContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitUnion_style_enum_members(SwiftParser.Union_style_enum_membersContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitUnion_style_enum_member(SwiftParser.Union_style_enum_memberContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitUnion_style_enum_case_clause(SwiftParser.Union_style_enum_case_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitUnion_style_enum_case_list(SwiftParser.Union_style_enum_case_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitUnion_style_enum_case(SwiftParser.Union_style_enum_caseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEnum_name(SwiftParser.Enum_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEnum_case_name(SwiftParser.Enum_case_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRaw_value_style_enum(SwiftParser.Raw_value_style_enumContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRaw_value_style_enum_members(SwiftParser.Raw_value_style_enum_membersContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRaw_value_style_enum_member(SwiftParser.Raw_value_style_enum_memberContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRaw_value_style_enum_case_clause(SwiftParser.Raw_value_style_enum_case_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRaw_value_style_enum_case_list(SwiftParser.Raw_value_style_enum_case_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRaw_value_style_enum_case(SwiftParser.Raw_value_style_enum_caseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRaw_value_assignment(SwiftParser.Raw_value_assignmentContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRaw_value_literal(SwiftParser.Raw_value_literalContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStruct_declaration(SwiftParser.Struct_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStruct_name(SwiftParser.Struct_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStruct_body(SwiftParser.Struct_bodyContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitClass_declaration(SwiftParser.Class_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitClass_name(SwiftParser.Class_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitClass_body(SwiftParser.Class_bodyContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_declaration(SwiftParser.Protocol_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_name(SwiftParser.Protocol_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_body(SwiftParser.Protocol_bodyContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_member_declaration(SwiftParser.Protocol_member_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_member_declarations(SwiftParser.Protocol_member_declarationsContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_property_declaration(SwiftParser.Protocol_property_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_method_declaration(SwiftParser.Protocol_method_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_initializer_declaration(SwiftParser.Protocol_initializer_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_subscript_declaration(SwiftParser.Protocol_subscript_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_associated_type_declaration(SwiftParser.Protocol_associated_type_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInitializer_declaration(SwiftParser.Initializer_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInitializer_head(SwiftParser.Initializer_headContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInitializer_body(SwiftParser.Initializer_bodyContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeinitializer_declaration(SwiftParser.Deinitializer_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExtension_declaration(SwiftParser.Extension_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExtension_body(SwiftParser.Extension_bodyContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSubscript_declaration(SwiftParser.Subscript_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSubscript_head(SwiftParser.Subscript_headContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSubscript_result(SwiftParser.Subscript_resultContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOperator_declaration(SwiftParser.Operator_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrefix_operator_declaration(SwiftParser.Prefix_operator_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPostfix_operator_declaration(SwiftParser.Postfix_operator_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInfix_operator_declaration(SwiftParser.Infix_operator_declarationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInfix_operator_attributes(SwiftParser.Infix_operator_attributesContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrecedence_clause(SwiftParser.Precedence_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrecedence_level(SwiftParser.Precedence_levelContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAssociativity_clause(SwiftParser.Associativity_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAssociativity(SwiftParser.AssociativityContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeclaration_modifier(SwiftParser.Declaration_modifierContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeclaration_modifiers(SwiftParser.Declaration_modifiersContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAccess_level_modifier(SwiftParser.Access_level_modifierContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPattern(SwiftParser.PatternContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWildcard_pattern(SwiftParser.Wildcard_patternContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIdentifier_pattern(SwiftParser.Identifier_patternContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitValue_binding_pattern(SwiftParser.Value_binding_patternContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTuple_pattern(SwiftParser.Tuple_patternContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTuple_pattern_element_list(SwiftParser.Tuple_pattern_element_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTuple_pattern_element(SwiftParser.Tuple_pattern_elementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEnum_case_pattern(SwiftParser.Enum_case_patternContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOptional_pattern(SwiftParser.Optional_patternContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression_pattern(SwiftParser.Expression_patternContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAttribute(SwiftParser.AttributeContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAttribute_name(SwiftParser.Attribute_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAttribute_argument_clause(SwiftParser.Attribute_argument_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAttributes(SwiftParser.AttributesContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBalanced_tokens(SwiftParser.Balanced_tokensContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBalanced_token(SwiftParser.Balanced_tokenContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression(SwiftParser.ExpressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression_list(SwiftParser.Expression_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrefix_expression(SwiftParser.Prefix_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIn_out_expression(SwiftParser.In_out_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTry_operator(SwiftParser.Try_operatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBinary_expression(SwiftParser.Binary_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBinary_expressions(SwiftParser.Binary_expressionsContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitConditional_operator(SwiftParser.Conditional_operatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_casting_operator(SwiftParser.Type_casting_operatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrimary_expression(SwiftParser.Primary_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitImplicit_member_expression(SwiftParser.Implicit_member_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLiteral_expression(SwiftParser.Literal_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArray_literal(SwiftParser.Array_literalContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArray_literal_items(SwiftParser.Array_literal_itemsContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArray_literal_item(SwiftParser.Array_literal_itemContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDictionary_literal(SwiftParser.Dictionary_literalContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDictionary_literal_items(SwiftParser.Dictionary_literal_itemsContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDictionary_literal_item(SwiftParser.Dictionary_literal_itemContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSelf_expression(SwiftParser.Self_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSuperclass_expression(SwiftParser.Superclass_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSuperclass_method_expression(SwiftParser.Superclass_method_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSuperclass_subscript_expression(SwiftParser.Superclass_subscript_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSuperclass_initializer_expression(SwiftParser.Superclass_initializer_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitClosure_expression(SwiftParser.Closure_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitClosure_signature(SwiftParser.Closure_signatureContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCapture_list(SwiftParser.Capture_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCapture_list_items(SwiftParser.Capture_list_itemsContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCapture_list_item(SwiftParser.Capture_list_itemContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCapture_specifier(SwiftParser.Capture_specifierContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitParenthesized_expression(SwiftParser.Parenthesized_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression_element_list(SwiftParser.Expression_element_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression_element(SwiftParser.Expression_elementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitWildcard_expression(SwiftParser.Wildcard_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSelector_expression(SwiftParser.Selector_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_call_with_closure_expression(SwiftParser.Function_call_with_closure_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInitializer_expression_with_args(SwiftParser.Initializer_expression_with_argsContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_call_expression(SwiftParser.Function_call_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSubscript_expression(SwiftParser.Subscript_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExplicit_member_expression1(SwiftParser.Explicit_member_expression1Context ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExplicit_member_expression2(SwiftParser.Explicit_member_expression2Context ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInitializer_expression(SwiftParser.Initializer_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExplicit_member_expression3(SwiftParser.Explicit_member_expression3Context ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDynamic_type_expression(SwiftParser.Dynamic_type_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPostfix_operation(SwiftParser.Postfix_operationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrimary(SwiftParser.PrimaryContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPostfix_self_expression(SwiftParser.Postfix_self_expressionContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArgument_names(SwiftParser.Argument_namesContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArgument_name(SwiftParser.Argument_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTrailing_closure(SwiftParser.Trailing_closureContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType(SwiftParser.TypeContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_annotation(SwiftParser.Type_annotationContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_identifier(SwiftParser.Type_identifierContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_name(SwiftParser.Type_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTuple_type(SwiftParser.Tuple_typeContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTuple_type_body(SwiftParser.Tuple_type_bodyContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTuple_type_element_list(SwiftParser.Tuple_type_element_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTuple_type_element(SwiftParser.Tuple_type_elementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitElement_name(SwiftParser.Element_nameContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_composition_type(SwiftParser.Protocol_composition_typeContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_identifier_list(SwiftParser.Protocol_identifier_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProtocol_identifier(SwiftParser.Protocol_identifierContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_inheritance_clause(SwiftParser.Type_inheritance_clauseContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_inheritance_list(SwiftParser.Type_inheritance_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitClass_requirement(SwiftParser.Class_requirementContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIdentifier(SwiftParser.IdentifierContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIdentifier_list(SwiftParser.Identifier_listContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitContext_sensitive_keyword(SwiftParser.Context_sensitive_keywordContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAssignment_operator(SwiftParser.Assignment_operatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitNegate_prefix_operator(SwiftParser.Negate_prefix_operatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBuild_AND(SwiftParser.Build_ANDContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBuild_OR(SwiftParser.Build_ORContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArrow_operator(SwiftParser.Arrow_operatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRange_operator(SwiftParser.Range_operatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSame_type_equals(SwiftParser.Same_type_equalsContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBinary_operator(SwiftParser.Binary_operatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrefix_operator(SwiftParser.Prefix_operatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPostfix_operator(SwiftParser.Postfix_operatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOperator(SwiftParser.OperatorContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOperator_character(SwiftParser.Operator_characterContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOperator_head(SwiftParser.Operator_headContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDot_operator_head(SwiftParser.Dot_operator_headContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDot_operator_character(SwiftParser.Dot_operator_characterContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLiteral(SwiftParser.LiteralContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitNumeric_literal(SwiftParser.Numeric_literalContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBoolean_literal(SwiftParser.Boolean_literalContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitNil_literal(SwiftParser.Nil_literalContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInteger_literal(SwiftParser.Integer_literalContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitString_literal(SwiftParser.String_literalContext ctx) { if(isPrintableLeaf(ctx)) return ctx.getText() + " "; return visitChildren(ctx); }

    protected Boolean isPrintableLeaf(ParserRuleContext ctx) {
        return ctx.getChildCount() == 1 && ctx.children.get(0) instanceof TerminalNode;
    }
}