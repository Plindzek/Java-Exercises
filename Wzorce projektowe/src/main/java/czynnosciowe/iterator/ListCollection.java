package czynnosciowe.iterator;

/**
 * zawiera metodę tworzącą obiekt czynnosciowe.iterator.List o typie interfejsu czynnosciowe.iterator.IteratorAbstraction,
 * więc obsługującego metody iterujące po kolekcji (hasNext i next).
 */
public class ListCollection implements Collection{

    /**
     * tworzy obiekt czynnosciowe.iterator.List o typie interfejsu czynnosciowe.iterator.IteratorAbstraction, więc obsługującego
     * metody iterujące po kolekcji (hasNext i next).
     */
    @Override
    public IteratorAbstraction createList() {
	

	return new List();
    }

}
