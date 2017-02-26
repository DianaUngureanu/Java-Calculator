import java.util.Stack;

/**
 * Clasa definitoare pentru un arbore binar de cautare
 * @author Diana Ungureanu
 */
class BST {
    TreeNode root;

    /**
     * Constructor fara parametrii
     */
    public BST() {
        this.root = null;
    }

    /**
     * Metoda care returneaza radacina arborelui
     * @return Radacina arborelui
     */
    public TreeNode getRoot() {
        return this.root;
    }

    /**
     * Metoda care seteaza radacina unui arbore la una noua
     * @param nod Noua radacina
     */
    public void setRoot(TreeNode nod) {
        this.root = nod;
    }

    /**
     * Metoda care insereaza in arbore un nou nod, in functie de numele acestuia
     * determinand daca trebuie sa insereze un Operator sau Operand
     * @param ch Numele nodului de inserat
     * @param s O stiva de arbori in care sunt pastrate totalitatea nodurilor
     * din arbore
     */
    public void myInsert(String ch, Stack<TreeNode> s) {

        if(ch.equals("+")) {

            TreeNode tParent = new Plus();

            tParent.setRight(s.pop());
            tParent.setLeft(s.pop());

            s.push(tParent);
        }
        else if(ch.equals("-")) {

            TreeNode tParent = new Minus();

            tParent.setRight(s.pop());
            tParent.setLeft(s.pop());

            s.push(tParent);
        }
        else if(ch.equals("*")) {

            TreeNode tParent = new Multiply();

            tParent.setRight(s.pop());
            tParent.setLeft(s.pop());

            s.push(tParent);
        }
        else if(ch.equals("/")) {

            TreeNode tParent = new Divide();

            tParent.setRight(s.pop());
            tParent.setLeft(s.pop());

            s.push(tParent);
        }
        else
            s.push(new Operand("Operand", ch, "No Value"));
    }

}
