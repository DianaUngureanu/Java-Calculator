import java.io.*;
import java.util.*;

/**
 * Clasa definitoare functiei de testare si a unor metode care opereaza pe
 * un arbore
 * @author Diana Ungureanu
 */
public class Tema3 {

    /**
     * Metoda care creeaza un arbore pe baza unui string dat in forma postFix
     * @param string Expresia pe baza caruia se doreste alcatuirea arborelui
     * @return Arborele creat
     */
    public static TreeNode postTree(String string) {

        Stack<TreeNode> stree = new Stack<>();
        BST b = new BST();

        for (String ch : string.split(" "))
            b.myInsert(ch, stree);

        return stree.pop();

    }

    /**
     * Metoda care afiseaza arborele
     * @param root Nodul radacina
     */
    public static void printTree(TreeNode root) {

        if(root instanceof Operand)
            System.out.println(((Operand)root).getTypeOfOperand() + " " +
                                ((Operand)root).getNameOfOperand() + " " +
                                ((Operand)root).getValueOfOperand());
        else if(root instanceof Operator)
            System.out.println( ((Operator)root).getOperator() );

        if(root.getLeft() != null)
            printTree(root.getLeft());
        if(root.getRight() != null)
            printTree(root.getRight());

    }

    /**
     * Metoda care returneaza un operand cu un anumit nume dintr-o lista de operanzi
     * @param totalitateNoduri Lista totala de operanzi
     * @param name Numele operandului dorit
     * @return Operandul cu numele dorit
     */
    public static Operand getNodeWithName(ArrayList<Operand> totalitateNoduri, String name) {

        for (Operand nod : totalitateNoduri)
            if((nod.getNameOfOperand()).equals(name))
                return nod;

        return null;
    }

    /**
     * Metoda care modifica in cadrul operanzilor campurile specifice, pe baza
     * operandului corespunzator din lista de operanzi
     * @param root Radacina arborelui
     * @param totalitateNoduri Lista de operanzi
     * @return Arborele cu nodurile setate cu numele, valorile si tipurile
     * pe care le primesc in fisierul de intrare
     */
    public static TreeNode changeNodes(TreeNode root, ArrayList<Operand> totalitateNoduri) {

        if(root instanceof Operand) {
            Operand nou = getNodeWithName(totalitateNoduri, ((Operand)root)
                                                            .getNameOfOperand());
            ((Operand)root).setTypeOfOperand(nou.getTypeOfOperand());
            ((Operand)root).setNameOfOperand(nou.getNameOfOperand());
            ((Operand)root).setValueOfOperand(nou.getValueOfOperand());
        }

        if(root.getLeft() != null)
            changeNodes(root.getLeft(), totalitateNoduri);

        if(root.getRight() != null)
            changeNodes(root.getRight(), totalitateNoduri);

        return root;

    }

    /**
     * Metoda de testare
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        YardAlgorithm algorithm = new YardAlgorithm();
        ArrayList<Operand> totalitateVariabile = new ArrayList<>();
        File file = new File("arbore.in");
        String outputFile = "arbore.out";

        try (FileWriter fw = new FileWriter(outputFile,true);
             Scanner input = new Scanner(file)) {

            while(input.hasNext()) {

                String line = input.nextLine();
                String words[] = line.split(" ", 2);
                String firstWord = words[0];
                String theRest = words[1];

                if( !(firstWord.equals("eval") ) ) {

                    if(firstWord.equals("string")) {

                        String nodeStuff[] = theRest.split("=|;");

                        nodeStuff[0] = nodeStuff[0].substring(0,nodeStuff[0].length()-1);
                        nodeStuff[1] = nodeStuff[1].substring(2, nodeStuff[1].length()-1);

                        totalitateVariabile.add(new Operand(firstWord, nodeStuff[0],
                                                            nodeStuff[1]));
                    }
                    else {

                        String nodeStuff[] = theRest.split(" |;");
                        totalitateVariabile.add(new Operand(firstWord, nodeStuff[0],
                                                            nodeStuff[2]));
                    }
                }
                else {

                    String[] expresie = theRest.split(";");
                    String postFix = algorithm.infixToPostfix(expresie[0]);

                    TreeNode arbore = postTree(postFix);

                    changeNodes(arbore, totalitateVariabile);

                    ActualTreeVisitor visitor = new ActualTreeVisitor();
                    TreeNode chestieNoua = arbore.accept(visitor);

                    if(((Operand)chestieNoua).getValueOfOperand().equals("NaN")) {

                        fw.write("NaN");
                        fw.write(System.getProperty("line.separator"));
                    }
                    else if(((Operand)chestieNoua).getTypeOfOperand().equals("double")) {

                        double toShow = Double.parseDouble(((Operand)chestieNoua)
                                                            .getValueOfOperand());
                        fw.write(Double.toString(Math.round(toShow * 100.0)/100.0));
                        fw.write(System.getProperty("line.separator"));

                    }
                    else {

                        fw.write(((Operand)chestieNoua).getValueOfOperand());
                        fw.write(System.getProperty("line.separator"));
                    }

                }

            }

        }

    }

}
