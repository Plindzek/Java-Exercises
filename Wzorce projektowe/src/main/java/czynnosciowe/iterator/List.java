package czynnosciowe.iterator;

/**
 * definicje metod iterujących po kolekcji dla obiektu czynnosciowe.iterator.List typu
 * czynnosciowe.iterator.IteratorAbstraction.
 */

public class List implements IteratorAbstraction {
    


    String[] names = { "Robert", "John", "Julie", "Lora" };
    private int index;
    
    /**
     * metoda zwraca true, jeżeli istnieje kolejny element na liście
     */
    @Override
    public boolean hasNext() {

	if (index < names.length) {
	    return true;
	}
	return false;
    }

    /**
     * metoda zwraca kolejny obiekt z listy, jeśli istnieje, lub null
     */
    @Override
    public Object next() {
	if (hasNext()) {
	    return names[index++];
	}
	return null;
    }

}
