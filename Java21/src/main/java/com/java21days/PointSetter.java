package com.java21days;

import java.awt.Point;

class PointSetter {

	public static void main(String[] args) {
		Point location = new Point(4,13);
		System.out.println("po�o�enie pocz�tkowe:");
		System.out.println("x r�wne " + location.x);
		System.out.println("y r�wne " + location.y);
		
		System.out.println("\n Przej�cie do (7,6)");
		location.x = 7;
		location.y = 6;
		System.out.println("po�o�enie ko�cowe:");
		System.out.println("x r�wne " + location.x);
		System.out.println("y r�wne " + location.y);

		
	}

}
