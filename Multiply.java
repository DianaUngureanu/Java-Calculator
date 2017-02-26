
/**
 * Clasa definitoare Operatorilor de tip Multiply
 * @author Diana Ungureanu
 */
public class Multiply extends Operator implements TreeElement {

    /**
     * Constructor fara parametrii
     */
    public Multiply() {
        super("*");
    }

    /**
     * Metoda care inmulteste doua inturi si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul inmultirii celor doua elemente sub forma unui string
     */
    public String multiplyTwoInts(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        int result = Integer.parseInt(nr1) * Integer.parseInt(nr2);

        return Integer.toString(result);

    }

    /**
     * Metoda care inmulteste un int si un double si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul inmultirii celor doua elemente sub forma unui string
     */
    public String multiplyIntAndDouble(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        double result = (double)Integer.parseInt(nr1) * Double.parseDouble(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care inmulteste un int si un string si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param string Un string
     * @return Rezultatul inmultirii celor doua elemente sub forma unui string
     */
    public String multiplyIntAndString(String nr1, String string) {

        if(string.equals("NaN") || nr1.equals("NaN"))
            return "NaN";
        else if(Integer.parseInt(nr1) <= 0)
            return "";

        String s = "";

        for(int i = 0; i < Integer.parseInt(nr1); i++)
            s += string;

        return s;

    }

    /**
     * Metoda care inmulteste un double si un int si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul inmultirii celor doua elemente sub forma unui string
     */
    public String multiplyDoubleAndInt(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        double result = Double.parseDouble(nr1) * (double)Integer.parseInt(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care inmulteste doua double-uri si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul inmultirii celor doua elemente sub forma unui string
     */
    public String multiplyTwoDoubles(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        double result = Double.parseDouble(nr1) * Double.parseDouble(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care inmulteste un double si un string si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param string Un string
     * @return Rezultatul inmultirii celor doua elemente sub forma unui string
     */
    public String multiplyDoubleAndString(String nr1, String string) {

        if(nr1.equals("NaN") || string.equals("NaN"))
            return "NaN";

        double result = Double.parseDouble(nr1) * (double)string.length();

        return Double.toString(result);

    }

    /**
     * Metoda care inmulteste un string si un int si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param string Un string
     * @return Rezultatul inmultirii celor doua elemente sub forma unui string
     */
    public String multiplyStringAndInt(String string, String nr1) {

        if(string.equals("NaN") || nr1.equals("NaN"))
            return "NaN";
        else if(Integer.parseInt(nr1) <= 0)
            return "";

        String s = "";

        for(int i = 0; i < Integer.parseInt(nr1); i++)
            s += string;

        return s;

    }

    /**
     * Metoda care inmulteste un string si un double si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param string Un string
     * @return Rezultatul inmultirii celor doua elemente sub forma unui string
     */
    public String multiplyStringAndDouble(String string, String nr1) {

        if(nr1.equals("NaN") || string.equals("NaN"))
            return "NaN";

        double result = (double)string.length() * Double.parseDouble(nr1);

        return Double.toString(result);

    }

    /**
     * Metoda care inmulteste doua string-uri si returneaza rezultatul sub forma
     * unui string
     * @param string1 Un string
     * @param string2 Un string
     * @return Rezultatul inmultirii celor doua elemente sub forma unui string
     */
    public String multiplyTwoStrings(String string1, String string2) {

        if(string1.equals("NaN") || string2.equals("NaN"))
            return "NaN";

        int result = string1.length() * string2.length();

        return Integer.toString(result);

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
