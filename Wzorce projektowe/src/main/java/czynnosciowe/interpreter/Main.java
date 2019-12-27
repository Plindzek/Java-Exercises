package interpreter;

public class Main {

    public static void main(String[] args) {
	/*
	 * Interpretacja określonych wyrażeń np do określonego języka programowania.
	 * 
	 * Problem w którym można wykorzystać interpreter może dotyczyć dziedzin, które
	 * dotyczą języków których nie chcemy tłumaczyć samodzielnie z każdym razem i
	 * możemy stworzyć do nich interpreter, który będzie sam tłumaczył ich
	 * gramatykę. Użyj wtedy kiedy: Chcesz stworzyć np własny kompilator, tworzysz
	 * projekt, który posiada funkcjonalności, które muszę być zinterpretowane na
	 * język zrozumiały dla użytkownika. Jakieś zadania w projekcie są zapisane w
	 * interpretowanym języku oraz istnieje gramatyka do niego.
	 * 
	 * Interfejs wzorca interpreter definiuje metodę interpret() a każda klasa
	 * konkretna dziedzicząca po nim implementuje metodę interpret(), która tłumaczy
	 * wymaganą w tym momencie konkretną część języka.
	 */

	String expression = "4 4 2 9 - +";
	Parser p = new Parser(expression);
	System.out.println("'" + expression + "' equals " + p.evaluate());
    }

}
