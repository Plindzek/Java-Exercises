package patternFasada;

class AppZakupowa {

    void sendNotification() {
	System.out.println("SMS wyslany");
    }

   boolean isPaymentsecured() {
	System.out.println("zamowienie oplacone");
	return true;
    }

    boolean isUserDatavalidated() {
	System.out.println("Uzytkownik zweryfikowany");
	return true;
    }

   void zarzadzanieDostawami() {
	System.out.println("Dostawa przyjeta");
    }
}
