package patternIterator;

public class ListCollection implements Collection{

    /*
     * zwracany obiekt ListIterator jest typem interfejsu IteratorAbstraction, który ma zdefiniowane metody iterujące po kolekcji.
     */
    @Override
    public IteratorAbstraction createIterator() {
	

	return new ListIterator();
    }

}
