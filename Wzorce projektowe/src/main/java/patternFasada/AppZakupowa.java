package patternFasada;

class AppZakupowa {

    void sendNotification() {
	System.out.println("SMS wys�any");
    }

   boolean isPaymentsecured() {
	System.out.println("zam�wienie op�acone");
	return true;
    }

    boolean isUserDatavalidated() {
	System.out.println("U�ytkownik zweryfikowany");
	return true;
    }

   void zarzadzanieDostawami() {
	System.out.println("Dostawa przyjeta");
    }
}
