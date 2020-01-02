package prototyp;

public class Hulajnoga implements Cloneable {
    private KrajPochodzeniaProduktu _kierownica;
    private KrajPochodzeniaProduktu _naklejka;
    private KrajPochodzeniaProduktu _hamulce;
    private KrajPochodzeniaProduktu _kolka;

    public Hulajnoga(KrajPochodzeniaProduktu kierownica, KrajPochodzeniaProduktu naklejka,
	    KrajPochodzeniaProduktu hamulce, KrajPochodzeniaProduktu kolka) {
	_kierownica = kierownica;
	_naklejka = naklejka;
	_hamulce = hamulce;
	_kolka = kolka;
    }

    public Object clone() {
	var sklonowanaHulajnoga = new Hulajnoga(_kierownica, _naklejka, _hamulce, _kolka);
	return sklonowanaHulajnoga;
    }
    
    /*
     * metoda clone z interfejsu Cloneable wykonuje klonowanie płytkie (shallow copy)
     * jeżeli pole klonowanego obiekty zawiera referencję, pózniejsza zmiana tego pola będzie równiez widoczna w klonie
     * aby wykonać tzw deep copy każdy członek kopiowanych klas musi implementować Cloneable
     * oraz zapewnić implementację kopiowania każdego pola.
     * Sprawdzilismy w main, enum kopiuje się nie przez zmianę referencji, czyli zmiana pól jednego
     * obiektu nie pociągnęła zmiany pól drugiego
     */


    /*
     * mozna ukryć przeciążenie, abysmy mogli zobaczyć adres obiektu (czy referencje
     * wskazują na ten sam obiekt) w main
     */
    @Override
    public String toString() {
	return "Hulajnoga [_kierownica=" + _kierownica + ", _naklejka=" + _naklejka + ", _hamulce=" + _hamulce
		+ ", _kolka=" + _kolka + "]";
    }

    public KrajPochodzeniaProduktu get_kierownica() {
	return _kierownica;
    }

    public void set_kierownica(KrajPochodzeniaProduktu _kierownica) {
	this._kierownica = _kierownica;
    }

    public KrajPochodzeniaProduktu get_naklejka() {
	return _naklejka;
    }

    public void set_naklejka(KrajPochodzeniaProduktu _naklejka) {
	this._naklejka = _naklejka;
    }

    public KrajPochodzeniaProduktu get_hamulce() {
	return _hamulce;
    }

    public void set_hamulce(KrajPochodzeniaProduktu _hamulce) {
	this._hamulce = _hamulce;
    }

    public KrajPochodzeniaProduktu get_kolka() {
	return _kolka;
    }

    public void set_kolka(KrajPochodzeniaProduktu _kolka) {
	this._kolka = _kolka;
    }

}
