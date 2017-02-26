
/**
 * Interfata pentru visitor
 * @author Diana Ungureanu
 */
interface TreeVisitor {

    Operand visit(Plus plus);
    Operand visit(Minus minus);
    Operand visit(Multiply multiply);
    Operand visit(Divide divide);
    Operand visit(Operand operand);
    TreeNode visit(TreeNode node);
}
