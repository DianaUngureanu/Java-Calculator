
/**
 * Clasa definitoare Operatorilor de tip Divide
 * @author Diana Ungureanu
 */
public class Divide extends Operator implements TreeElement {

    /**
     * Constructor fara parametrii
     */
    public Divide() {
        super("/");
    }

    /**
     * Metoda care imparte doua inturi si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul impartirii celor doua elemente sub forma unui string
     */
    public String divideTwoInts(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN") || Integer.parseInt(nr2) == 0)
            return "NaN";

        int result = Integer.parseInt(nr1) / Integer.parseInt(nr2);

        return Integer.toString(result);
    }

    /**
     * Metoda care imparte un int si un double si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul impartirii celor doua elemente sub forma unui string
     */
    public String divideIntAndDouble(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN") || Double.parseDouble(nr2) == 0.0)
            return "NaN";

        double result = (double)Integer.parseInt(nr1) / Double.parseDouble(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care imparte un int si un string si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param string Un string
     * @return Rezultatul impartirii celor doua elemente sub forma unui string
     */
    public String divideIntAndString(String nr1, String string) {

        if(nr1.equals("NaN") || string.equals("NaN") || string.length() == 0)
            return "NaN";

        int result = Integer.parseInt(nr1) / string.length();

        return Integer.toString(result);

    }

    /**
     * Metoda care imparte un double si un int si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul impartirii celor doua elemente sub forma unui string
     */
    public String divideDoubleAndInt(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN") || Integer.parseInt(nr2) == 0)
            return "NaN";

        double result = Double.parseDouble(nr1) / (double)Integer.parseInt(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care imparte doua double-uri si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul impartirii celor doua elemente sub forma unui string
     */
    public String divideTwoDoubles(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN") || Double.parseDouble(nr2) == 0)
            return "NaN";

        double result = Double.parseDouble(nr1) / Double.parseDouble(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care imparte un double si un string si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param string Un string
     * @return Rezultatul impartirii celor doua elemente sub forma unui string
     */
    public String divideDoubleAndString(String nr1, String string) {

        if(string.equals("NaN") || nr1.equals("NaN") || string.length() == 0)
            return "NaN";

        double result = Double.parseDouble(nr1) / (double)string.length();

        return Double.toString(result);

    }

    /**
     * Metoda care imparte un string si un int si returneaza rezultatul sub forma
     * unui string
     * @param string Un string
     * @param nr1 Primul sub forma unui string
     * @return Rezultatul impartirii celor doua elemente sub forma unui string
     */
    public String divideStringAndInt(String string, String nr1) {

        if(string.equals("NaN") || nr1.equals("NaN"))
            return "NaN";
        else if(Integer.parseInt(nr1) <= 0)
            return string;

        return string.substring(0, Math.min(string.length(),(string.length()
                                                    /Integer.parseInt(nr1))));
    }

    /**
     * Metoda care imparte un string si un double si returneaza rezultatul sub forma
     * unui string
     * @param string Un string
     * @param nr1 Primul sub forma unui string
     * @return Rezultatul impartirii celor doua elemente sub forma unui string
     */
    public String divideStringAndDouble(String string, String nr1) {

        if(string.equals("NaN") || nr1.equals("NaN") ||
                Double.parseDouble(nr1) == 0.0)
            return "NaN";

        double result = (double)string.length() / Double.parseDouble(nr1);

        return Double.toString(result);

    }

    /**
     * Metoda care imparte doua string-uri si returneaza rezultatul sub forma
     * unui string
     * @param string1 Un string
     * @param string2 Un string
     * @return Rezultatul impartirii celor doua elemente sub forma unui string
     */
    public String divideTwoStrings(String string1, String string2) {

        if(string1.equals("NaN") || string2.equals("NaN") ||
                string2.length() == 0)
            return "NaN";

        int result = string1.length() / string2.length();

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
