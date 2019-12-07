package patternFabryka;

public class FiguresFactory {
    
/*
 * Fabryka figur tworzy zadany obiekt w zale�no�ci od podanych paramtr�w
 */
    
    public Figures makeFigure(String whatProduce, double length) {
	
	
	
	if (whatProduce=="Ko�o") {
	    return new Circle("K�ko", length);
	}
	if (whatProduce=="Kwadrat") {
	    return new Square("Kwadrat", length);
	}
	return null;
    }
    
}
