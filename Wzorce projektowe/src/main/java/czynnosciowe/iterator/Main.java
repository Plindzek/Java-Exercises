package czynnosciowe.iterator;// Klient, który korzysta z klasy czynnosciowe.iterator.ListCollection, implementującej interfejs
// czynnosciowe.iterator.Collection

public class Main {

    public static void main(String[] args) {
	

	ListCollection listCollection = new ListCollection();
	
//pętla, która wykonuje sie dopóki hasNext=true i drukująca zawartość tablicy

        for (IteratorAbstraction iterator = listCollection.createList(); iterator.hasNext();)
        {
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }

    }

}
