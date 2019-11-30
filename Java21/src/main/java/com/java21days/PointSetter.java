package com.java21days;

import java.awt.Point;

class PointSetter {

	public static void main(String[] args) {
		Point location = new Point(4,13);
		System.out.println("po³o¿enie pocz¹tkowe:");
		System.out.println("x równe " + location.x);
		System.out.println("y równe " + location.y);
		
		System.out.println("\n Przejœcie do (7,6)");
		location.x = 7;
		location.y = 6;
		System.out.println("po³o¿enie koñcowe:");
		System.out.println("x równe " + location.x);
		System.out.println("y równe " + location.y);

		
	}

}
