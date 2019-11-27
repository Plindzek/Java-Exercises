

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public 	class EnumTest {
	enum Kolor {
		CZERWONY(false), NIEBIESKI(true), bialy(true);
		boolean isNice;

		Kolor(boolean isNice) {
			this.isNice = isNice;
					}
		int liczba;
		void wyswietl(int liczba){
  
			liczba++;
			  System.out.println("test1: " + liczba);
			}
static {System.out.println("Heelllo");}
	}

	public static void main(String[] args) {

		List golfer = new LinkedList();
golfer.add(1);
golfer.add("kot");
golfer.add(2.5);
golfer.add("baba");
golfer.add(100000000000000000000000000000000000000000000000003451.);
golfer.add(1);
golfer.add('\u0124');

String FF = (String)golfer.get(3);
		
		System.out.println("Test2: "+golfer.get(4));

		Kolor d = Kolor.CZERWONY;

		for (Kolor s : Kolor.values())
			System.out.println("test3:" + s);

		System.out.println("Test4:"+Kolor.values());
d.wyswietl(1);
System.out.println("Test5: "+ d.liczba);
	}

}
