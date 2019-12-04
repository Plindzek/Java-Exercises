package patternFabryka;

public class FiguresFactory {
    
/*
 * Fabryka figur tworzy zadany obiekt w zale¿noœci od podanych paramtrów
 */
    
    public Figures makeFigure(String whatProduce, double length) {
	
	
	
	if (whatProduce=="Ko³o") {
	    return new Circle("Kó³ko", length);
	}
	if (whatProduce=="Kwadrat") {
	    return new Square("Kwadrat", length);
	}
	return null;
    }
    
}
