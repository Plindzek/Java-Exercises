package arraysListCreateSortComparators;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BoardGameCompare {

    public static void main(String[] args) {
	
	BoardGame[] games = new BoardGame[] {
	new BoardGame("Terra", 9.38, new BigDecimal("100.00"), 1, 5),             
	new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),       	
	new BoardGame("Puerto Rico", 4.07, new BigDecimal("149.99"), 2, 5),       	
	new BoardGame("Terra", 8.26, new BigDecimal("100.00"), 2, 6),             	
	new BoardGame("Scythe", 6.3, new BigDecimal("314.95"), 1, 5),           	
	new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),          	
	new BoardGame("Wonders Duel", 4.15, new BigDecimal("109.95"), 2, 2),      	
	new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),	
	new BoardGame("Patchwork", 2.77, new BigDecimal("75"), 2, 2),             	
	new BoardGame("Terra", 8.12, new BigDecimal("100.00"), 2, 1)             	
};
	
	System.out.println("Sortowanie tablic.......................");
	Arrays.sort(games);
	
	System.out.println(Arrays.toString(games)); //dzia³a dziêki metodzie compareTo
	
	List<String> list1 = new ArrayList<>();
	list1.add("Dorota");
	list1.add("Marta");
	list1.add("Aga");
	list1.add("Kasia");
	list1.add("Monika");
	list1.add("Ewa");
	list1.add("Maja");
	
	List<Integer>liczby = new ArrayList<>();
	liczby .add(3);
	liczby .add(8);
	liczby .add(1);
	Collections.sort(liczby);

	List<BoardGame> list = new ArrayList<>();
	list.add(new BoardGame("Terra", 9.38, new BigDecimal("100.00"), 1, 5));
	list.add(new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8));
	list.add(new BoardGame("Puerto Rico", 4.07, new BigDecimal("149.99"), 2, 5));
	list.add(new BoardGame("Terra", 8.26, new BigDecimal("100.00"), 2, 6));
	list.add(new BoardGame("Scythe", 6.3, new BigDecimal("314.95"), 1, 5));
	list.add(new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6));
	list.add(new BoardGame("Wonders Duel", 4.15, new BigDecimal("109.95"), 2, 2));
	list.add(new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4));
	list.add(new BoardGame("Patchwork", 2.77, new BigDecimal("75"), 2, 2));
	list.add(new BoardGame("Terra", 8.12, new BigDecimal("100.00"), 2, 1));
	
	Collections.sort(list1);
	System.out.println("\nSortowanie listy Stringów i Intów.......................");
	System.out.println(list1);
	System.out.println(liczby);
	System.out.println("\nInterfejs Comparable aby dzia³a³o sortowanie dla list.......................");
	/*
	 * Collections.sort(list1) jest to proste sortowanie i na liœcie list o typie BoardGame nie
	 * bêdzie dzia³aæ dopóki nie dodamy implementacji Comparable do BoardGame 
	 * poniewa¿ sort przyjmuje tylko typy, które implementuj¹
	 * Comparable. Co te¿ do koñca nie
	 * rozwi¹¿e problemu poniewa¿ ka¿da zmiana sposobu sortowania w trakcie wykonywania programu wymaga³aby zmiany
	 * przes³anianej metody interfejsu CompareTo.  
	 * dla zaawansowanego sortowania s³u¿y interfejs Comparator i metoda List.sort(Comparator)
	 * musimy stworzyæ klasê implementuj¹c¹ Comparator typowany na BoardGame i przes³onic metode compare
	 */
	Collections.sort(list);
	System.out.println(list);
	System.out.println("\nTeraz Comparator dla list1.......................");
	list1.sort(new Comparator<String>() {

	    @Override
	    public int compare(String o1, String o2) {
		/*
		 * Stringi posiadaja metodê CompareTo, dziêki której mo¿emy np przy pomocy -1
		 * posortowaæ w odwrotnej kolejnoœci
		 */

		return -1 * o1.compareTo(o2);
	    }
	});
	System.out.println(list1);
	System.out.println("\nTeraz Comparator dla list.......................");
	list.sort(new BoardGameComparator());
	System.out.println(list);
	System.out.println("\noraz"
		+ " Comparator dla tablicy.......................");
	Arrays.sort(games, new BoardGameComparator());
	System.out.println(Arrays.toString(games));
    }

}
