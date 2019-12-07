package patternFabryka;

public class Main {

    public static void main(String[] args) {
	FiguresFactory figuresFactory = new FiguresFactory();
	/*
	 * stworzyliœmy obiekt fabryki, który tworzy ró¿ne obiekty o typie Figura
	 * zale¿nie od logiki z metody makeFigure()
	 */

	Figures figure = figuresFactory.makeFigure("Ko³o", 5);
	Figures figure1 = figuresFactory.makeFigure("Ko³o", 2);
	Figures figure2 = figuresFactory.makeFigure("Kwadrat", 7);
	Figures figure3 = figuresFactory.makeFigure("Kwadrat", 12.5);

	System.out.println(figure);
	System.out.println(figure1);
	System.out.println(figure2);
	System.out.println(figure3);
    }
}
