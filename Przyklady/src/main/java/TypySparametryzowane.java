
public class TypySparametryzowane{
	
	public static void main(String[] args) {
		String bla = "ff";
		
		TypN <String> tn = new TypN<String>(bla);		
		TypN <Integer> tn2 = new TypN<Integer>(10);
		
	String st = tn.getObj(); // dzieki parametrom nie trzeba rzutowac, bo kompilator wie, jakiego typu to
				 // obiekt
		int st2 = tn2.getObj();
		
		tn.pokazTyp();
		System.out.println(st);
		tn2.pokazTyp();
		System.out.println(st2);
	}
}

class TypN <T> {

	T obj; 
	
    /**
     * bez typu gerycznego bylo tu Object obj; czyli klasa w konstruktorze
     * przyjmowala obiekt dowolnego typu, co wymagalo rzutowania przy pobieraniu
     * tego obiektu
     */
	
	
	TypN(T obj) {

		this.obj = obj;

	}

	void pokazTyp() {

		System.out.println(obj.getClass().getName());

	}

	public T getObj() {
		return obj;
	}

	
	
}



