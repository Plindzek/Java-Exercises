package fasada;

public class Facade {
    private Paczkomat paczkomat212;
    private AppZakupowa zakup;

    public Facade() {
	paczkomat212 = new Paczkomat();
	zakup = new AppZakupowa();
    }

    public void pobieraniePaczki() {
	paczkomat212.getUserData();
	if (zakup.isUserDatavalidated() && zakup.isPaymentsecured())
	    paczkomat212.openBox();

    }

}
