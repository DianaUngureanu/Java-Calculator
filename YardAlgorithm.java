import java.util.Stack;

/**
 * Clasa definitorie pentru implementarea algoritmului ShuntingYard
 *@author Diana Ungureanu
 **/
public class YardAlgorithm {

   /**
    * Constructor fara parametrii
   **/
   public YardAlgorithm() {
   }

   /**
    * Metoda care ia un string in forma infix(o expresie) si o trece in forma
    * postFix
    * @param infix String-ul pe care il dorim in forma postFix
    * @return String-ul in forma postFix
   **/
   public String infixToPostfix(String infix) {

        String ops = "-+*/";
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        for (String token : infix.split("\\s")) {

            if (token.isEmpty())
                continue;

            char c = token.charAt(0);
            int idx = ops.indexOf(c);

            if (idx != -1) {

                if (s.isEmpty())
                    s.push(idx);
                else {

                    while (!s.isEmpty()) {

                        int prec2 = s.peek() / 2;
                        int prec1 = idx / 2;

                        if (prec2 > prec1 || (prec2 == prec1 && c != '^'))
                            sb.append(ops.charAt(s.pop())).append(' ');
                        else
                            break;

                    }

                    s.push(idx);
                }

            }
            else if (c == '(')
                s.push(-2);
            else if (c == ')') {

                while (s.peek() != -2)
                    sb.append(ops.charAt(s.pop())).append(' ');
                s.pop();

            }
            else
                sb.append(token).append(' ');

        }

        while (!s.isEmpty())
            sb.append(ops.charAt(s.pop())).append(' ');

        return sb.toString();

    }

}
