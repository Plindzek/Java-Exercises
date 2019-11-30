

public class Licznik {
	
	
	double nocounter=0;
	static int i;
	
	Licznik(){
		i++;
	nocounter++;}
	



public static void main(String[] args) {
	 for ( i=1;i<=5000;)
	 {String o = String.valueOf(i);
	 
	 Licznik obiekt = new Licznik();
	 System.out.println("obiekt: "+o);
	 
	 System.out.println(obiekt.toString());
		
				 
	
	 }
	
	
}

static {System.out.println("Wydruk bloku static");}
}
