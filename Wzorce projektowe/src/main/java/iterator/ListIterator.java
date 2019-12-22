package iterator;

public class ListIterator implements IteratorAbstraction {
    
    /*
     * definicje metod iterujących po kolekcji dla obiektu ListIterator typu IteratorAbstraction.
     */

    String[] names = { "Robert", "John", "Julie", "Lora" };
    private int index;
    
    
    @Override
    public boolean hasNext() {

	if (index < names.length) {
	    return true;
	}
	return false;
    }

    @Override
    public Object next() {
	if (hasNext()) {
	    return names[index++];
	}
	return null;
    }

}
