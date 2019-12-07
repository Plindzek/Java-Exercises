package patternFasada;

public class Main {

    public static void main(String[] args) {
	/*
	 * implementacja metod ukryta przed u¿ytkownikiem w klasie Facade
	 */

	Facade Klient = new Facade();
	Klient.pobieraniePaczki();
    }

}
