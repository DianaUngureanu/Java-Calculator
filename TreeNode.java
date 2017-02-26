
/**
 * Clasa care reprezinta implementarea nod-urilor a arborelui, continand
 * fiul stang si fiul drept drept campuri
 * @author Diana Ungureanu
 */
public class TreeNode implements TreeElement{

        private TreeNode leftTree;
        private TreeNode rightTree;

        /**
         * Constructor fara parametrii
         */
        public TreeNode() {

            this.leftTree = null;
            this.rightTree = null;

        }

        /**
         * Constructor cu parametrii
         * @param left Noul nod ce se doreste a fi setat in stanga
         * @param right Noul nod ce se doreste a fi setat in dreapta
         */
        public TreeNode(TreeNode left, TreeNode right) {

            this.leftTree = left;
            this.rightTree = right;

        }

        /**
         * Metoda care returneaza fiul din stanga al nodului curent
         * @return Fiul stang al nodului
         */
        public TreeNode getLeft() {

            return this.leftTree;
        }

        /**
         * Metoda care returneaza fiul din drepta al nodului curent
         * @return Fiul drept al nodului
         */
        public TreeNode getRight() {

            return this.rightTree;
        }

        /**
         * Metoda care seteaza fiul din stanga la un altul
         * @param leftTree Noul nod
         */
        public void setLeft(TreeNode leftTree) {

            this.leftTree = leftTree;
        }

        /**
         * Metoda care seteaza fiul din dreapta la un altul
         * @param rightTree Noul nod
         */
        public void setRight(TreeNode rightTree) {

            this.rightTree = rightTree;
        }

        /**
         * Metoda care accepta visitorul
         * @param visitor Visitor-ul
         * @return Un nod de tip TreeNode
         */
        @Override
        public TreeNode accept(TreeVisitor visitor) {

            return visitor.visit(this);
        }
}
