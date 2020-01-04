package odwiedzajacy_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * zapewnia dodawanie i usuwanie elementów z listy oraz metode accept visitor
 * dla elementów listy
 * 
 * @author www
 *
 */
public class ObjectStructure {

    private List<Element> _elements = new ArrayList<Element>();

    public void attach(Element element)
    {
        _elements.add(element);
    }

    public void detach(Element element)
    {
        _elements.remove(element);
    }

    /**
     * wywołuje metode accept obiektów ElementX, która wywołuje metodę przekazanego
     * visitora
     * 
     * @param visitor
     */
    public void accept(Visitor visitor)
    {
        for (Element element : _elements)
        {

	    element.accept(visitor);
        }
    }
}
