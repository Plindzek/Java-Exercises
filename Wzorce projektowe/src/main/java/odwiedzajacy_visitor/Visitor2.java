package odwiedzajacy_visitor;

public class Visitor2 extends Visitor{
    
@Override
    public void VisitElement(
      ElementA elementA)
    {
        System.out.println(elementA.getClass().getName()+ " visited by " + getClass().getName());
    }
@Override
    public void VisitElement(
      ElementB elementB)
    {
        System.out.println(elementB.getClass().getName()+ " visited by " + getClass().getName());
    }

}
