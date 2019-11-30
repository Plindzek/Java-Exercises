package testLombok;

import testLombok.Jakas.JakasBuilder;

public class Main {

    public static void main(String[] args) {

Jakas obiekt1 = new Jakas("Adam0", 4, 10092019L);
	
	
	 Jakas obiekt = Jakas.builder() //builder obiektu
		
		.adam("Adam")
		.liczba(40)
		.data(19790910L)
		.build();
	
	System.out.println(obiekt.getAdam()); //metody dzia³aj¹, chocia¿ ich nie pisalismy w klasie Jakas
	System.out.println(obiekt.toString());//
	System.out.println(obiekt.getData());
    }

}
