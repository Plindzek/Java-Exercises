package com.java21days;

import java.util.Scanner;

public class TestClass {
	  public static void main(String[] args) {
	   Scanner skaner = new Scanner(System.in); 
		  String x = "Ola";
	    		x="dupa";
	 
	    System.out.println("1: " + x);
	 
	    someOp(x);
	  
	    System.out.println("2: " + x);
	  }
	  
	  public static void someOp(String y) {
	    System.out.println("3: " + y);
	  
	    y = "Ela";
	 
	    System.out.println("4: " + y);
	  }
	}
/*Deklarujemy wiêc w metodzie main(…) zmienn¹ referencyjn¹ x typu String i przypisujemy jest obiekt reprezentuj¹cy napis „Ola”. 
 * Nastêpnie wypisujemy wartoœæ obiektu wskazywanego przez zmienn¹ x. Wywo³ujemy metodê someOp(…) przekazuj¹c zmienn¹ x jako argument 
 * wywo³ania. Wartoœæ tej referencji jest kopiowana do zmiennej lokalnej y. 
 * Wyœwietlamy wartoœæ zmiennej y po czym przypisujemy do niej inny obiekt – obiekt reprezentuj¹cy napis „Ela”. 
 * Wyœwietlamy jeszcze raz zmienn¹ y i wywo³anie metody siê koñczy. W metodzie main(…) jeszcze raz wyœwietlamy wartoœæ zmiennej x 
 * (de facto jest to wyœwietlenie wartoœci obiektu wskazywanego przez referencjê x) i widzimy, ¿e rzeczywiœcie wskazuje ona teraz na ten 
 * sam obiekt. Efektem uruchomienia powy¿szego programu bêdzie wyœwietlenie napisu:

x: Ola
y: Ola
y: Ela
x: Ola

Zwróæmy uwagê na fakt, ¿e przypisanie w metodzie someOp(...) nowej wartoœci do zmiennej y nie poci¹ga w skutkach ¿adnej zmiany wartoœci 
zmiennej x. Co wiêcej, nawet jeœli byœmy chcieli to nie bêdziemy mogli zmieniæ w metodzie someOp(...) wartoœci zmiennej x. 
Nie jest w Javie mo¿liwa zmiana wartoœci zmiennych przekazanych jako argumenty wywo³ania metody. 
Java nie wspiera znanej z innych jêzyków koncepcji argumentów typu IN/OUT. 
Mo¿emy natomiast z metody someOp(...) wywo³ywaæ metody obiektu wskazywanego zarówno przez zmienn¹ x jak i y.*/
 