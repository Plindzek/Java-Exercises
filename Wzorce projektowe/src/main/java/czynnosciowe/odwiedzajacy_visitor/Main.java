package czynnosciowe.odwiedzajacy_visitor;

public class Main {
    
    public static void main(String[] args) {
	
        ObjectStructure structure = new ObjectStructure();

        structure.attach(new ElementA());
        structure.attach(new ElementB());

        Visitor v1 = new Visitor1();
        Visitor v2 = new Visitor2();

	/**
	 * visitorzy wykonuje różne operacje na strukturze danych w zależności od typu
	 * obiektu
	 */

        structure.accept(v1);
        structure.accept(v2);

    }

}
