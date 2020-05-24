package czynnosciowe.odwiedzajacy_visitor;

public class ElementA extends Element{


    @Override
    public void accept(Visitor visitor) {
	visitor.visitElement(this);  
    }

    @Override
    public String toString() {
	return "czynnosciowe.odwiedzajacy_visitor.ElementA";
    }
}
