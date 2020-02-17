package odwiedzajacy_visitor;

public class Visitor2 extends Visitor{
    
@Override
    public void visitElement(
	    ElementA elementA)
    {
	System.out.println(elementA + " visited by " + this
		+ "\n (it means method in data structure calls element method, who calls"
		+ " one of visitor overload methods who do something with this element)");
    }
@Override
    public void visitElement(
      ElementB elementB)
    {
	System.out.println(elementB + " visited by " + this
		+ "\n (it means method in data structure calls element method, who calls"
		+ " one of visitor overload methods who do something with this element)");
    }

    @Override
    public String toString() {
	return "Visitor2";
    }

}
