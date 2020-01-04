package odwiedzajacy_visitor;

public class ElementA extends Element{

    @Override
    public void accept(Visitor visitor) {
	visitor.visitElement(this);  
    }

}
