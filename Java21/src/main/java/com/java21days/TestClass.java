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
/*Deklarujemy wi�c w metodzie main(�) zmienn� referencyjn� x typu String i przypisujemy jest obiekt reprezentuj�cy napis �Ola�. 
 * Nast�pnie wypisujemy warto�� obiektu wskazywanego przez zmienn� x. Wywo�ujemy metod� someOp(�) przekazuj�c zmienn� x jako argument 
 * wywo�ania. Warto�� tej referencji jest kopiowana do zmiennej lokalnej y. 
 * Wy�wietlamy warto�� zmiennej y po czym przypisujemy do niej inny obiekt � obiekt reprezentuj�cy napis �Ela�. 
 * Wy�wietlamy jeszcze raz zmienn� y i wywo�anie metody si� ko�czy. W metodzie main(�) jeszcze raz wy�wietlamy warto�� zmiennej x 
 * (de facto jest to wy�wietlenie warto�ci obiektu wskazywanego przez referencj� x) i widzimy, �e rzeczywi�cie wskazuje ona teraz na ten 
 * sam obiekt. Efektem uruchomienia powy�szego programu b�dzie wy�wietlenie napisu:

x: Ola
y: Ola
y: Ela
x: Ola

Zwr��my uwag� na fakt, �e przypisanie w metodzie someOp(...) nowej warto�ci do zmiennej y nie poci�ga w skutkach �adnej zmiany warto�ci 
zmiennej x. Co wi�cej, nawet je�li by�my chcieli to nie b�dziemy mogli zmieni� w metodzie someOp(...) warto�ci zmiennej x. 
Nie jest w Javie mo�liwa zmiana warto�ci zmiennych przekazanych jako argumenty wywo�ania metody. 
Java nie wspiera znanej z innych j�zyk�w koncepcji argument�w typu IN/OUT. 
Mo�emy natomiast z metody someOp(...) wywo�ywa� metody obiektu wskazywanego zar�wno przez zmienn� x jak i y.*/
 