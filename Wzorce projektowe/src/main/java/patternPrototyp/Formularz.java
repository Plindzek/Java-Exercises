package patternPrototyp;

public class Formularz
{
    
    
	private KrajPochodzeniaProduktu _kierownica;
	private KrajPochodzeniaProduktu _naklejka;
	private KrajPochodzeniaProduktu _hamulce;
	private KrajPochodzeniaProduktu _kolka;
 
	public Formularz(KrajPochodzeniaProduktu kierownica, KrajPochodzeniaProduktu naklejka,
			KrajPochodzeniaProduktu hamulce, KrajPochodzeniaProduktu kolka)
	{
		_kierownica = kierownica;
		_naklejka = naklejka;
		_hamulce = hamulce;
		_kolka = kolka;
	}
 

	public Hulajnoga WyprodukujHulajnoge()
	{
		var hulajnoga = new Hulajnoga(_kierownica, _naklejka, _hamulce, _kolka);
		return hulajnoga;
	}
	
}

