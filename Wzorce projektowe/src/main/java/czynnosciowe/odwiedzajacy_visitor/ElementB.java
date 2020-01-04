package odwiedzajacy_visitor;

public class ElementB extends Element{

    @Override
    public void accept(Visitor visitor) {
	visitor.visitElement(this);    
    
    }
}
