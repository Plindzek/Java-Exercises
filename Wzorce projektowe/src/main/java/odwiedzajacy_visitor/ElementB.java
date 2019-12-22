package odwiedzajacy_visitor;

public class ElementB extends Element{

    @Override
    public void Accept(Visitor visitor) {
	visitor.VisitElement(this);    
    
    }
}
