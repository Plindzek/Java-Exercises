package patternFasada;

class AppZakupowa {

    void sendNotification() {
	System.out.println("SMS wys³any");
    }

   boolean isPaymentsecured() {
	System.out.println("zamówienie op³acone");
	return true;
    }

    boolean isUserDatavalidated() {
	System.out.println("U¿ytkownik zweryfikowany");
	return true;
    }

   void zarzadzanieDostawami() {
	System.out.println("Dostawa przyjeta");
    }
}
