
/**
 * Interfata pentru elementele ce vor fi parcurse de catre visitor
 * @author Diana Ungureanu
 */
interface TreeElement {

    TreeNode accept(TreeVisitor visitor);
}
