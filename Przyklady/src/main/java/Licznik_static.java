

public class Licznik_static {
	
	
	int nocounter;
	static int i;
	
	Licznik_static(){
		i++;
	nocounter++;}
	
	public String toString() {
	    return getClass().getName();
	}



public static void main(String[] args) {
	System.out.println("Teraz jesteśmy w pierwszej linijce programu"); 
    	for ( i=1;i<=50;)
	 {String o = String.valueOf(i);
	 
	 Licznik_static obiekt = new Licznik_static();
	 System.out.println(obiekt);
	 System.out.println("obiekt: "+o);	
	System.out.println(obiekt.nocounter);			 
	
	 }
	
	
}

static {System.out.println("Blok static jest inicjowany na początku programu");}
}
