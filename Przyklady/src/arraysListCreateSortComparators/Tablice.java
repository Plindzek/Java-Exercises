package arraysListCreateSortComparators;

import java.util.Arrays;
import java.util.HashMap;

public class Tablice { // przyk�ad tablicy i wype�niania jej za pomoc� p�tli for

    public static void main(String[] args)

    {
	String[] tabWyrazow = new String[10];
	for (int i = 0; i < 10; i++)
	
	    tabWyrazow[i]= Integer.toString(i);
	
	System.out.println(Arrays.toString(tabWyrazow)+"\n");
	
	int[] tablica = new int[10];

	for (int i = 0; i < 10; i++) // nie dawa� �rednika za nawiasem!!!
	    tablica[i] = i; // wype�nianie tablicy za pomoc� p�tli

	for (int i = 0; i < 10; i++)

	    System.out.println("Kolejna kom�rka to: " + tablica[i]);

	String[][] tablicaWielowymiarowa = new String[3][3];
	tablicaWielowymiarowa[1][2] = "Ala";

	System.out.println("kom�rka o adresie [1][2]to: " + tablicaWielowymiarowa[1][2]);

	HashMap<Integer, String> liczby = new HashMap<Integer, String>(0, 0.1f);

	int i = 0;
	String w = "q";
	String z = "A";

	for (i = 0; i < 5; i++) {

	    liczby.put(i, w.concat(z));
	    w = liczby.getOrDefault(i, w);
	    System.out.println(liczby.values());
	}

    }
}