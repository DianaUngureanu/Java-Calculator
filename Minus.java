
/**
 * Clasa definitoare Operatorilor de tip Minus
 * @author Diana Ungureanu
 */
public class Minus extends Operator implements TreeElement {

    /**
     * Constructor fara parametrii
     */
    public Minus() {
        super("-");
    }

    /**
     * Metoda care scade doua int-uri si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul scaderii celor doua elemente sub forma unui string
     */
    public String subTwoInts(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        int result = Integer.parseInt(nr1) - Integer.parseInt(nr2);

        return Integer.toString(result);

    }

    /**
     * Metoda care scade un int si un double si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul scaderii celor doua elemente sub forma unui string
     */
    public String subIntAndDouble(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        double result = (double)Integer.parseInt(nr1) - Double.parseDouble(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care scade un int si un string si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param string Un string
     * @return Rezultatul scaderii celor doua elemente sub forma unui string
     */
    public String subIntAndString(String nr1, String string) {

        if(string.equals("NaN") || nr1.equals("NaN"))
            return "NaN";

        int result = Integer.parseInt(nr1) - string.length();

        return Integer.toString(result);

    }

    /**
     * Metoda care scade un double si un int si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul scaderii celor doua elemente sub forma unui string
     */
    public String subDoubleAndInt(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        double result = Double.parseDouble(nr1) - (double)Integer.parseInt(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care scade doua double-uri si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param nr2 Al doilea numar sub forma unui string
     * @return Rezultatul scaderii celor doua elemente sub forma unui string
     */
    public String subTwoDoubles(String nr1, String nr2) {

        if(nr1.equals("NaN") || nr2.equals("NaN"))
            return "NaN";

        double result = Double.parseDouble(nr1) - Double.parseDouble(nr2);

        return Double.toString(result);

    }

    /**
     * Metoda care scade un double si un string si returneaza rezultatul sub forma
     * unui string
     * @param nr1 Primul numar sub forma unui string
     * @param string Un string
     * @return Rezultatul scaderii celor doua elemente sub forma unui string
     */
    public String subDoubleAndString(String nr1, String string) {

        if(string.equals("NaN") || nr1.equals("NaN"))
            return "NaN";

        double result = Double.parseDouble(nr1) - (double)string.length();

        return Double.toString(result);

    }

    /**
     * Metoda care scade un string si un int si returneaza rezultatul sub forma
     * unui string
     * @param string Un string
     * @param nr1 Primul numar sub forma unui string
     * @return Rezultatul scaderii celor doua elemente sub forma unui string
     */
    public String subStringAndInt(String string, String nr1) {

        if(string.equals("NaN"))
            return "NaN";
        else if(Integer.parseInt(nr1) > string.length())
            return "";
        else if(nr1.equals("NaN"))
            return string;
        else if(Integer.parseInt(nr1) < 0){
            String s = "";

            for(int i = 0; i < Math.abs(Integer.parseInt(nr1)); i++)
                s += "#";

            return string + s;

        }

        return string.substring(0, Math.min(string.length(),(string.length()
                                                    - Integer.parseInt(nr1))));

    }

    /**
     * Metoda care scade un string si un double si returneaza rezultatul sub forma
     * unui string
     * @param string Un string
     * @param nr1 Primul numar sub forma unui string
     * @return Rezultatul scaderii celor doua elemente sub forma unui string
     */
    public String subStringAndDouble(String string, String nr1) {

        if(string.equals("NaN") || nr1.equals("NaN"))
            return "NaN";

        double result = (double)string.length() - Double.parseDouble(nr1);

        return Double.toString(result);

    }

    /**
     * Metoda care scade doua string-uri si returneaza rezultatul sub forma
     * unui string
     * @param string1 Un string
     * @param string2 Un string
     * @return Rezultatul scaderii celor doua elemente sub forma unui string
     */
    public String subTwoStrings(String string1, String string2) {

        if(string1.equals("NaN") || string2.equals("NaN"))
            return "NaN";

        int result = string1.length() - string2.length();

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
