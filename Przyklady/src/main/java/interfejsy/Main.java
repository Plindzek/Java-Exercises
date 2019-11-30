package interfejsy;
import java.util.Scanner;

public class Main {
	
	static int n = 1;
	private Scanner sc = new Scanner(System.in);
	
	
    public static void main(String[] args) {
        Main main = new Main();
        Computable computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakuj¹c¹ klasê
        
        }
        else {
            computation = new Addition(); // zaimplementuj brakuj¹c¹ klasê
            
        }

        double argument1 = main.getArgument();
        n++;
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        
    	System.out.println("Podaj rodzaj dzia³ania: \"dodawanie\" lub \"mno¿enie\"");
    	String odp = sc.nextLine();
    	if(odp.equals("dodawanie"))
    	return false;
    	if(odp.equals("mno¿enie"))
        	return true;
    	else {
    		System.out.println("niepoprawna odpowiedz, wybieram za Ciebie mno¿enie");
    		return true;
    	}
    }

    private double getArgument() {
    	
    	System.out.println("podaj liczbê nr "+ n );
    	return sc.nextDouble();
    	
    	
    }
    
 
}
