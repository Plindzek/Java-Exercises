package odwiedzajacy_visitor;

public class Main {
    
    public static void main(String[] args) {
	
        ObjectStructure o = new ObjectStructure();

        o.attach(new ElementA());
        o.attach(new ElementB());

        Visitor v1 = new Visitor1();
        Visitor v2 = new Visitor2();

	/**
	 * visitorzy wykonuje różne operacje na strukturze danych w zależności od typu
	 * obiektu
	 */

        o.accept(v1);
        o.accept(v2);

    }

}
