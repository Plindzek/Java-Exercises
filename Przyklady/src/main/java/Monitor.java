
interface Trackable{
	abstract void track();
	abstract void quitTracking();
	abstract Trackable beginTracking(Trackable waaat);
}

class Monitor implements Trackable{
	
	@Override
	public void track() {
		System.out.println("Wynik metody ovver track");
	}

	@Override
	public void quitTracking() {
		System.out.println("Wynik metody ovver quit");
		
	}


	@Override
	public Trackable beginTracking(Trackable waaat) {
	    /*
	     * przykład pokazuje, jak w interfejsie zastosować parametr metody:
	     * definiujemy go  jako obiekt typu interfejsu 
	     * który bedziemy mogli potem rzutowac w klasie implementującej interfejs na obiekt tej klasy
	     */
		
		Monitor mon = (Monitor) waaat;
		
		return mon;
	}
	
	public static void main(String[] args) {
		
	}
	}