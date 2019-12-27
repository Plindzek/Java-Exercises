package odwiedzajacy_visitor;

public class Main {
    
    public static void main(String[] args) {
	
        ObjectStructure o = new ObjectStructure();
        o.Attach(new ElementA());
        o.Attach(new ElementB());

        Visitor v1 = new Visitor1();
        Visitor v2 = new Visitor2();

        o.Accept(v1);
        o.Accept(v2);

    }

}
