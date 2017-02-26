
/**
 * Clasa reprezentativa pentru nodurile care nu sunt + - * sau /
 * @author Diana Ungureanu
 */
public class Operand extends TreeNode implements TreeElement {

    private String typeOfOperand;
    private String nameOfOperand;
    private String valueOfOperand;

    /**
     * Constructor fara parametrii
     */
    public Operand() {

        super();
        this.typeOfOperand = "";
        this.nameOfOperand = "";
        this.valueOfOperand = "";

    }

    /**
     * Constructor cu parametrii
     * @param typeOfNode Noua valoarea pentru typeOfNode
     * @param nameOfNode Noua valoarea pentru nameOfNode
     * @param valueOfNode Noua valoarea pentru valueOfNode
     */
    public Operand(String typeOfNode, String nameOfNode, String valueOfNode) {

        super();
        this.typeOfOperand = typeOfNode;
        this.nameOfOperand = nameOfNode;
        this.valueOfOperand = valueOfNode;

    }

    /**
     * Metoda care returneaza tipul operandului
     * @return Tipul operandului
     */
    public String getTypeOfOperand() {

        return this.typeOfOperand;
    }

    /**
     * Metoda care returneaza numele operandului
     * @return Numele operandului
     */
    public String getNameOfOperand() {

        return this.nameOfOperand;
    }

    /**
     * Metoda care returneaza valoarea operandului
     * @return Valoarea operandului
     */
    public String getValueOfOperand() {

        return this.valueOfOperand;
    }

    /**
     * Metoda care seteaza typeOfOperand la un altul
     * @param typeOfOperand Noua valoare pentru type
     */
    public void setTypeOfOperand(String typeOfOperand) {

        this.typeOfOperand = typeOfOperand;
    }

    /**
     * Metoda care seteaza nameOfOperand la un altul
     * @param nameOfOperand Noua valoarea pentru name
     */
    public void setNameOfOperand(String nameOfOperand) {

        this.nameOfOperand = nameOfOperand;
    }

    /**
     * Metoda care seteaza valueOfOperand la un altul
     * @param valueOfOperand Noua valoarea pentru value
     */
    public void setValueOfOperand(String valueOfOperand) {

        this.valueOfOperand = valueOfOperand;
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
