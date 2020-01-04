package odwiedzajacy_visitor;

/**
 * definiuje zachowanie visitora w zależności od przekazanego argumentu
 * 
 * @author www
 *
 */

public abstract class Visitor {
    
    public abstract void visitElement(ElementA elementA);

    public abstract void visitElement(ElementB elementB);
	    }

