
public class TypySparametryzowane{
	
	public static void main(String[] args) {
		String bla = "ff";
		
		TypN <String> tn = new TypN<String>(bla);		
		TypN <Integer> tn2 = new TypN<Integer>(10);
		
		String st=tn.getObj(); //dziêki parametrom nie trzeba rzutowaæ, bo kompilator wie, jakiego typu to obiekt
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
	 *bez typu gerycznego by³o tu Object obj; czyli klasa w konstruktorze przyjmowa³a obiekt dowolnego typu, 
	 *co wymaga³o rzutowania przy pobieraniu tego obiektu 
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



