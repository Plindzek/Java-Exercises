package odwiedzajacy_visitor;

public class ElementA extends Element{

    @Override
    public void Accept(Visitor visitor) {
	visitor.VisitElement(this);  
    }

}
