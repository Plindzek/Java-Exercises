package patternPrototyp;

public class Main {

    public static void main(String[] args) {
	
	KrajPochodzeniaProduktu kierownica = KrajPochodzeniaProduktu.Szwajcaria;
	KrajPochodzeniaProduktu naklejka = KrajPochodzeniaProduktu.Chiny;
	KrajPochodzeniaProduktu hamulce = KrajPochodzeniaProduktu.Niemcy;
	KrajPochodzeniaProduktu kolka = KrajPochodzeniaProduktu.Polska;
	Formularz formularz = new Formularz(kierownica, naklejka, hamulce, kolka);
	Hulajnoga hulajnoga = formularz.WyprodukujHulajnoge();

	var sklonowanaHulajnoga = hulajnoga.Clone();
	var niesklonowanaHulajnoga = hulajnoga;
	
	System.out.println("hulajnoga: "+hulajnoga);
	System.out.println(sklonowanaHulajnoga);
	System.out.println(niesklonowanaHulajnoga);
	System.out.println(sklonowanaHulajnoga.equals(hulajnoga)); //wynik= false, bo powstał nowy obiekt
	System.out.println(niesklonowanaHulajnoga.equals(hulajnoga));//wynik=true, bo przypisaliśmy do hulajnogi nową referencję
	hulajnoga.set_hamulce(KrajPochodzeniaProduktu.Chiny);
	System.out.println(hulajnoga);
	System.out.println(sklonowanaHulajnoga);
    }
    }
