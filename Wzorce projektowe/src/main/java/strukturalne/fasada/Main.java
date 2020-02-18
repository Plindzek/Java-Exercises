package strukturalne.fasada;

public class Main {

    public static void main(String[] args) {
	/*
	 * implementacja metod ukryta przed uzytkownikiem w klasie Facade
	 */

	Facade Klient = new Facade();
	Klient.pobieraniePaczki();
    }

}
