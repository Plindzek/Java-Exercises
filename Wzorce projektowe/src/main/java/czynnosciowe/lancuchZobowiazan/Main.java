package czynnosciowe.lancuchZobowiazan;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	/*
	 * W kliencie najpierw tworzymy instancje klas należących do łańcucha, oraz
	 * zapisujemy te obiekty w sposób właśnie listy jednokierunkowej, żeby kolejny
	 * obiekt do którego przekazujemy żądanie wiedział jaki jest następny, właśnie
	 * po to żeby wiedział do jakiego kolejnego obiektu przekazać żądanie. Typy
	 * żądań zapisaliśmy w typie wyliczeniowym enum, w liście QuestsOnToday.
	 * Na końcu przekazujemy po kolei żądania w pętli foreach.
	 */

	java.lang.Number one = new One();
	java.lang.Number two = new Two();
	java.lang.Number three = new Three();

	// Ustawiamy, komu obiekty maja przekazywac zadania (jednokierunkowa lista)
	// Czyli czynnosciowe.lancuchZobowiazan.Number number z klasy czynnosciowe.lancuchZobowiazan.Number otrzymuje referencję do wskazanego
	// obiektu,
	// co pozwala wykonać forward request na kolejnym obiekcie

	one.setObject(two); // tutaj nie zachodzi one=two, tylko one.number = two
	two.setObject(three);

	//lista zadan

	List<TypeNumber> questOnToday = new ArrayList<TypeNumber>();
	questOnToday.add(TypeNumber.Zadanie_1);
	questOnToday.add(TypeNumber.Zadanie_2);
	questOnToday.add(TypeNumber.Zadanie_3);
	
	// Seek the right number
	for (var quest : questOnToday) {
	    
	    System.out.println("Zlecam "+quest+" obiektowi one");
	    one.forwardRequest(quest);
	}

    }
}
