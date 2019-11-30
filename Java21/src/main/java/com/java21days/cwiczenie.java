package com.java21days;

public class cwiczenie {

	public static void main(String[] args) {
		
		double a = 14000;
		a = 1.4*a;
		a = a - 1500;
		a = 1.12*a;
		System.out.println(a);
		
		
		
		float b = 14000;
		b = (float) 1.4*b;
		b = b - 1500;
		b = (float) 1.12*b;
		System.out.println(b);
		
		boolean czyPrawda;
		czyPrawda = a==b;
		System.out.println(czyPrawda);
		
	}

}
