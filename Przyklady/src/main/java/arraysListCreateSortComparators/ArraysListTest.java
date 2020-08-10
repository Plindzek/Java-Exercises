package arraysListCreateSortComparators;
import java.util.ArrayList;
import java.util.Collections;

public class ArraysListTest {

	public static void main(String[] args) {
	
		ArrayList <String> wyrazy = new ArrayList();
		
		wyrazy.add("I'm  ");
		wyrazy.add("programmer ");
		wyrazy.add("hehe ");
		wyrazy.add(" :D :D ");
		wyrazy.add(1, "great ");
		wyrazy.remove(3);
		
		for(String s:wyrazy)
		{System.out.print(s+" ");}
		
		System.out.println();
		wyrazy.remove(3);

		
		for(String s:wyrazy)
		{System.out.print(s+" ");}

		System.out.println();
			System.out.println(wyrazy.contains("I'm "));
			System.out.println(wyrazy.get(1));
			wyrazy.set(1,"supre great");

			for(String s:wyrazy)
			{System.out.print(s+" \n");}

			ArrayList <Integer> liczby = new ArrayList<Integer>();
			liczby.add(1);
			liczby.add(2);
			liczby.add(4);
			liczby.add(3);
			Collections.sort(liczby);
			System.out.println(liczby);

			ArrayList <ArraysListTest> obiekty = new ArrayList<ArraysListTest>();
			
			ArraysListTest dupa = new ArraysListTest();
			
			obiekty.add(dupa);
			
			for(ArraysListTest s:obiekty)
	{
	    System.out.print(s);
	}
			
			
			
	}

}
