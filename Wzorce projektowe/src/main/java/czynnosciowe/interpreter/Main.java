package interpreter;

public class Main {

    public static void main(String[] args) {


	String expression = "4 4 2 9 - +";
	Parser p = new Parser(expression);

	System.out.println("'" + expression + "' equals " + p.evaluate());
    }

}
