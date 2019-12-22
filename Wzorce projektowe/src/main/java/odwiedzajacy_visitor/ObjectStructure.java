package odwiedzajacy_visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> _elements = new ArrayList<Element>();

    public void Attach(Element element)
    {
        _elements.add(element);
    }

    public void Detach(Element element)
    {
        _elements.remove(element);
    }

    public void Accept(Visitor visitor)
    {
        for (Element element : _elements)
        {
            element.Accept(visitor);
        }
    }
}
