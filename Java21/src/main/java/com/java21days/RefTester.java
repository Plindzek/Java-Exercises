package com.java21days;
import java.awt.Point;

class RefTester {
	
	public static void main(String[] args) {
	

	
	Point pt1 = new Point(100,100); 	//przypisanie do pt1 obiektu na podstawie konstruktora w klasie Point o wsp�rz�dnych x100 y100
	Point pt2 = pt1; 					//zmienna pt1 zostaje przypisana do pt2 
	
	pt1.x = 200; 				//zmienne obiektu pt1 ustawione na now� warto��
	pt1.y = 200;
	System.out.println(pt1.x + "  " +  pt1.y);
	System.out.println(pt2.x + "   " +  pt2.y); //pt2 r�wniez si� zmieni�o
	

	int qpt1 = 2; 	//sprawdzamy powy�sze tylko ze zmiennymi typu int
	int qpt2 = qpt1;
		 				
	qpt1 = 10000;
	
	System.out.println(qpt1);
	System.out.println(qpt2); //qpt2 si� nie zmieni�o
	}

}
