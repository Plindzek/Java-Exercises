package fabryka;

public class FiguresFactory {
    
/*
 * Fabryka figur tworzy zadany obiekt w zaleznosci od podanych parametrow
 */
    
    public Figures makeFigure(String whatProduce, double length) {
	
	
	
	if (whatProduce=="Koło") {
	    return new Circle("Kółko", length);
	}
	if (whatProduce=="Kwadrat") {
	    return new Square("Kwadrat", length);
	}
	return null;
    }
    
}
