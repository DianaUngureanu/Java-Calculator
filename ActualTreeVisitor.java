
/**
 * Clasa care implementeaza interfata visitor, in care definesc metodele de
 * visit si operatiile care se efectueaza pe noduri
 * @author Diana Ungureanu
 */
public class ActualTreeVisitor implements TreeVisitor {

    /**
     * Metoda primeste 2 noduri si verifica ce tip are fiecare, iar in functie
     * de acestea seteaza tipul noului nod care rezulta din operatia de adunare
     * si apoi apeleaza metoda corespunzatoare celor doua tipuri de noduri si
     * actualizeaza valoarea pentru noul nod
     * @param left Fiul din stanga al nodului curent
     * @param right Fiul din dreapta al nodului curent
     * @param plus Operator de tip plus cu ajutorul caruia voi apela operatiile
     * necesare pe tipurile de date
     * @return Un nou operand rezultat in urma operatiei de adunare
     */
    public Operand add(TreeNode left, TreeNode right, Plus plus) {

        Operand result = new Operand();
        Operand lefty = (Operand)left;
        Operand righty = (Operand)right;

        if(lefty.getTypeOfOperand().equals("int") &&
            righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("int");
            result.setValueOfOperand((plus.addTwoInts(lefty.getValueOfOperand(),
                                                righty.getValueOfOperand())));

        }
        else if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(plus.addIntAndDouble(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("string");
            result.setValueOfOperand(plus.addIntAndString(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(plus.addDoubleAndInt(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(plus.addTwoDoubles(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("string");
            result.setValueOfOperand(plus.addDoubleAndString(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("string");
            result.setValueOfOperand(plus.addStringAndInt(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("string");
            result.setValueOfOperand(plus.addStringAndDouble(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("string");
            result.setValueOfOperand(plus.addTwoStrings(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }

        return result;
    }

    /**
     * Metoda primeste 2 noduri si verifica ce tip are fiecare, iar in functie
     * de acestea seteaza tipul noului nod care rezulta din operatia de scadere
     * si apoi apeleaza metoda corespunzatoare celor doua tipuri de noduri si
     * actualizeaza valoarea pentru noul nod
     * @param left Fiul din stanga al nodului curent
     * @param right Fiul din dreapta al nodului curent
     * @param minus Operator de tip minus cu ajutorul caruia voi apela operatiile
     * necesare pe tipurile de date
     * @return Un nou operand rezultat in urma operatiei de scadere
     */
    public Operand sub(TreeNode left, TreeNode right, Minus minus) {

        Operand result = new Operand();
        Operand lefty = (Operand)left;
        Operand righty = (Operand)right;

        if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("int");
            result.setValueOfOperand(minus.subTwoInts(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(minus.subIntAndDouble(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("int");
            result.setValueOfOperand(minus.subIntAndString(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(minus.subDoubleAndInt(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(minus.subTwoDoubles(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(minus.subDoubleAndString(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("string");
            result.setValueOfOperand(minus.subStringAndInt(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(minus.subStringAndDouble(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("int");
            result.setValueOfOperand(minus.subTwoStrings(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }

        return result;
    }

    /**
     * Metoda primeste 2 noduri si verifica ce tip are fiecare, iar in functie
     * de acestea seteaza tipul noului nod care rezulta din operatia de inmultire
     * si apoi apeleaza metoda corespunzatoare celor doua tipuri de noduri si
     * actualizeaza valoarea pentru noul nod
     * @param left Fiul din stanga al nodului curent
     * @param right Fiul din dreapta al nodului curent
     * @param multiply Operator de tip multiply cu ajutorul caruia voi apela operatiile
     * necesare pe tipurile de date
     * @return Un nou operand rezultat in urma operatiei de inmultire
     */
    public Operand mul(TreeNode left, TreeNode right, Multiply multiply) {

        Operand result = new Operand();
        Operand lefty = (Operand)left;
        Operand righty = (Operand)right;

        if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("int");
            result.setValueOfOperand(multiply.multiplyTwoInts(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(multiply.multiplyIntAndDouble(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("string");
            result.setValueOfOperand(multiply.multiplyIntAndString(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(multiply.multiplyDoubleAndInt(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(multiply.multiplyTwoDoubles(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(multiply.multiplyDoubleAndString(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("string");
            result.setValueOfOperand(multiply.multiplyStringAndInt(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(multiply.multiplyStringAndDouble(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("int");
            result.setValueOfOperand(multiply.multiplyTwoStrings(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }

        return result;
    }

    /**
     * Metoda primeste 2 noduri si verifica ce tip are fiecare, iar in functie
     * de acestea seteaza tipul noului nod care rezulta din operatia de impartire
     * si apoi apeleaza metoda corespunzatoare celor doua tipuri de noduri si
     * actualizeaza valoarea pentru noul nod
     * @param left Fiul din stanga al nodului curent
     * @param right Fiul din dreapta al nodului curent
     * @param divide Operator de tip divide cu ajutorul caruia voi apela operatiile
     * necesare pe tipurile de date
     * @return Un nou operand rezultat in urma operatiei de impartire
     */
    public Operand div(TreeNode left, TreeNode right, Divide divide) {

        Operand result = new Operand();
        Operand lefty = (Operand)left;
        Operand righty = (Operand)right;

        if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("int");
            result.setValueOfOperand(divide.divideTwoInts(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(divide.divideIntAndDouble(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("int") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("int");
            result.setValueOfOperand(divide.divideIntAndString(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(divide.divideDoubleAndInt(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(divide.divideTwoDoubles(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("double") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(divide.divideDoubleAndString(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("int")) {

            result.setTypeOfOperand("string");
            result.setValueOfOperand(divide.divideStringAndInt(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("double")) {

            result.setTypeOfOperand("double");
            result.setValueOfOperand(divide.divideStringAndDouble(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }
        else if(lefty.getTypeOfOperand().equals("string") &&
                righty.getTypeOfOperand().equals("string")) {

            result.setTypeOfOperand("int");
            result.setValueOfOperand(divide.divideTwoStrings(lefty.getValueOfOperand(),
                                                    righty.getValueOfOperand()));

        }

        return result;
    }

    /**
     * Metoda care defineste comportamentul visitor-ului in cazul in care operatorul
     * este de tip Plus
     * @param plus Operator(nod) de tip Plus
     * @return Operand-ul rezultat in urma operatiei de adunare dintre fiul stang
     * si fiul drept al operatorului plus
     */
    @Override
    public Operand visit(Plus plus) {

        TreeNode left, right;
        left = plus.getLeft().accept(this);
        right = plus.getRight().accept(this);
        return add(left, right, plus);
    }

    /**
     * Metoda care defineste comportamentul visitor-ului in cazul in care nodul
     * este de tip TreeNode
     * @param node Nod de tip TreeNode
     * @return Nod-ul primit ca parametru
     */
    @Override
    public TreeNode visit(TreeNode node) {

        return node;
    }

    /**
     * Metoda care defineste comportamentul visitor-ului in cazul in care operatorul
     * este de tip Minus
     * @param minus Operator(nod) de tip Minus
     * @return Operand-ul rezultat in urma operatiei de scadere dintre fiul stang
     * si fiul drept al operatorului minus
     */
    @Override
    public Operand visit(Minus minus) {

        TreeNode left, right;
        left = minus.getLeft().accept(this);
        right = minus.getRight().accept(this);
        return sub(left, right, minus);
    }

    /**
     * Metoda care defineste comportamentul visitor-ului in cazul in care operatorul
     * este de tip Multiply
     * @param multiply Operator(nod) de tip Multiply
     * @return Operand-ul rezultat in urma operatiei de inmultire dintre fiul stang
     * si fiul drept al operatorului multiply
     */
    @Override
    public Operand visit(Multiply multiply) {

        TreeNode left, right;
        left = multiply.getLeft().accept(this);
        right = multiply.getRight().accept(this);
        return mul(left, right, multiply);
    }

    /**
     * Metoda care defineste comportamentul visitor-ului in cazul in care operatorul
     * este de tip Divide
     * @param divide Operator(nod) de tip Divide
     * @return Operand-ul rezultat in urma operatiei de impartire dintre fiul stang
     * si fiul drept al operatorului multiply
     */
    @Override
    public Operand visit(Divide divide) {

        TreeNode left, right;
        left = divide.getLeft().accept(this);
        right = divide.getRight().accept(this);
        return div(left, right, divide);
    }

    /**
     * Metoda care defineste comportamentul visitor-ului in cazul in care nodul
     * este de tip operand
     * @param operand Nod de tip operand
     * @return Operand-ul primit ca parametru
     */
    @Override
    public Operand visit(Operand operand) {

        return operand;
    }

}
