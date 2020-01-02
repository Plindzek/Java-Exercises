package prototyp;

public class Main {

    public static void main(String[] args) {
	
	KrajPochodzeniaProduktu kierownica = KrajPochodzeniaProduktu.Szwajcaria;
	KrajPochodzeniaProduktu naklejka = KrajPochodzeniaProduktu.Chiny;
	KrajPochodzeniaProduktu hamulce = KrajPochodzeniaProduktu.Niemcy;
	KrajPochodzeniaProduktu kolka = KrajPochodzeniaProduktu.Polska;
	Formularz formularz = new Formularz(kierownica, naklejka, hamulce, kolka);
	Hulajnoga hulajnoga = formularz.WyprodukujHulajnoge();

	var sklonowanaHulajnoga = hulajnoga.clone();
	var niesklonowanaHulajnoga = hulajnoga;
	
	System.out.println("1.hulajnoga:    "+hulajnoga);
	System.out.println("2.sklonowana    "+sklonowanaHulajnoga);
	System.out.println("3.niesklonowana "+niesklonowanaHulajnoga);
	System.out.println("sklonowana equals hulajnoga? "+sklonowanaHulajnoga.equals(hulajnoga)); //wynik= false, bo powstał nowy obiekt
	System.out.println("niesklonowana equals hulajnoga? "+niesklonowanaHulajnoga.equals(hulajnoga));//wynik=true, bo przypisaliśmy do hulajnogi nową referencję
	hulajnoga.set_hamulce(KrajPochodzeniaProduktu.Chiny);
	System.out.println("4.hulajnoga     "+hulajnoga);
	System.out.println("5.sklonowana    "+sklonowanaHulajnoga);
	System.out.println("6.niesklonowana "+niesklonowanaHulajnoga+"(przyjela parametr od hulajnogi, bo powstała poprzez referencje a nie klonowanie)");
    }
    }
