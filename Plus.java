
/**
 * Clasa definitoare Operatorilor de tip Plus
 * @author Diana Ungureanu
 */
public class Plus extends Operator implements TreeElement {

    /**
     * Constructor fara parametrii
     */
    public Plus() {
        super("+");
    }

    /**
     * Metoda care aduna doua inturi si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Suma celor doua elemente sub forma unui string
     */
    public String addTwoInts(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        int result = Integer.parseInt(nr1) + Integer.parseInt(nr2);

        return Integer.toString(result);

    }

    /**
     * Metoda care aduna un int si un double si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Suma celor doua elemente sub forma unui string
     */
    public String addIntAndDouble(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        double result = (double)Integer.parseInt(nr1) + Double.parseDouble(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care aduna un int si un string si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param string Un string
     * @return Suma celor doua elemente sub forma unui string
     */
    public String addIntAndString(String nr1, String string) {

        if(string.equals("NaN") || nr1.equals("NaN"))
            return "NaN";

        return Integer.parseInt(nr1) + string;

    }

    /**
     * Metoda care aduna un double si un int si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Suma celor doua elemente sub forma unui string
     */
    public String addDoubleAndInt(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        double result = Double.parseDouble(nr1) + (double)Integer.parseInt(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care aduna doua double-uri si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Suma celor doua elemente sub forma unui string
     */
    public String addTwoDoubles(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        double result = Double.parseDouble(nr1) + Double.parseDouble(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care aduna un double si un string si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param string Un string
     * @return Suma celor doua elemente sub forma unui string
     */
    public String addDoubleAndString(String nr1, String string) {

        if(nr1.equals("NaN"))
            return nr1 + string;

        return (Math.round(Double.parseDouble(nr1) * 100.0) / 100.0) + string;

    }

    /**
     * Metoda care aduna un string si un int si returneaza rezultatul sub forma
     * unui string
     * @param string Un string
     * @param nr1 Primul numar sub forma unui string
     * @return Suma celor doua elemente sub forma unui string
     */
    public String addStringAndInt(String string, String nr1) {

        if(string.equals("NaN") || nr1.equals("NaN"))
            return "NaN";

        return string + Integer.parseInt(nr1);

    }

    /**
     * Metoda care aduna un string si un double si returneaza rezultatul sub forma
     * unui string
     * @param string Un string
     * @param nr1 Primul numar sub forma unui string
     * @return Suma celor doua elemente sub forma unui string
     */
    public String addStringAndDouble(String string, String nr1) {

        if(nr1.equals("NaN"))
            return string + nr1;

        return string + (Math.round(Double.parseDouble(nr1) * 100.0) / 100.0);

    }

    /**
     * Metoda care aduna doua string-uri si returneaza rezultatul sub forma
     * unui string
     * @param string1 Un string
     * @param string2 Un string
     * @return Suma celor doua elemente sub forma unui string
     */
    public String addTwoStrings(String string1, String string2) {

        if(string1.equals("NaN") || string2.equals("NaN"))
            return "NaN";

        return string1 + string2;

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
