package iterator;

/**
 * zawiera metodę tworzącą obiekt List o typie interfejsu IteratorAbstraction,
 * więc obsługującego metody iterujące po kolekcji (hasNext i next).
 */
public class ListCollection implements Collection{

    /**
     * tworzy obiekt List o typie interfejsu IteratorAbstraction, więc obsługującego
     * metody iterujące po kolekcji (hasNext i next).
     */
    @Override
    public IteratorAbstraction createList() {
	

	return new List();
    }

}
