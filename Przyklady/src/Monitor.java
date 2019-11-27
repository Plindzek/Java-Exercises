
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
		
		Monitor mon = (Monitor) waaat;
		
		return mon;
	}
	
	public static void main(String[] args) {
		
	}
	}