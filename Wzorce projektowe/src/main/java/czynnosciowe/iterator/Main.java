package iterator;

public class Main {

    public static void main(String[] args) {
	
	/*
	 * Klient, który korzysta z klasy ListCollection, implementującej interfejs Collection
	 * 
	 */
	
	ListCollection listCollection = new ListCollection();
	

        for (IteratorAbstraction iterator = listCollection.createIterator(); iterator.hasNext();)
        {
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }

    }

}
