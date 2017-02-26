
/**
 * Clasa reprezentativa pentru nodurile care sunt + - * sau /
 * @author Diana Ungureanu
 */
public class Operator extends TreeNode {

    private String operator;

    /**
     * Constructor cu parametrii
     * @param operator Valoarea dorita pentru campul operator
     */
    public Operator(String operator) {

        super();
        this.operator = operator;
    }

    /**
     * Metoda care returneaza valoarea operatorul
     * @return Valoarea operatorul
     */
    public String getOperator() {

        return this.operator;
    }

    /**
     * Metoda care modifica valoarea operatorului
     * @param operator Noua valoare
     */
    public void changeOperator(String operator) {

        this.operator = operator;
    }

}
