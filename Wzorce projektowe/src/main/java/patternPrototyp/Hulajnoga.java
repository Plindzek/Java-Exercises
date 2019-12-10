package patternPrototyp;

public class Hulajnoga implements ICloneable {
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

    public Object Clone() {
	var sklonowanaHulajnoga = new Hulajnoga(_kierownica, _naklejka, _hamulce, _kolka);
	return sklonowanaHulajnoga;
    }

    @Override
    public String toString() {
	return "NiestandardowaHulajnoga [_kierownica=" + _kierownica + ", _naklejka=" + _naklejka + ", _hamulce="
		+ _hamulce + ", _kolka=" + _kolka + "]";
    }

}
