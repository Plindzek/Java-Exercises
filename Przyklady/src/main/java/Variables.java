import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Variables {

    public static void main(String[] args) {

	/*
	 * to jest znak komentarza wielowierszowego
	 */
	/** komentarz Javadoc */

	char toBedzieZnakA = 'a';
	// zmienne wraz z ich maksymalną pojemnością
	byte od128Do127 = -128;
	short toJestShort = -32767;
	int toJestInt = 2_147_483_647; // mozna stosować takie separatory
	long max = 9223372036854775807L;
	// zmiennoprzecinkowe
	float wiekszaOdLong = 3.4E+38F;
	double najwieksza = 1.7E+308;

	boolean czyPrawda;
	int age = 5;
	double height = 5.5;
	int weight = 5;
	double dobreDzielenie = height / age;

	System.out.println("wynik dzielenia int i double przypisany do double: " + dobreDzielenie);
	byte nieZmiesciSie = (byte) 900;
	System.out.println("rzutowanie 900 na byte: " + nieZmiesciSie);

	double weight1 = weight;
	System.out.println("Wynik rzutowania niejawnego int weight(5) na typ double: " + weight1 + "\n");

	weight1 = 74.74;
	int weight2 = (int) weight1;
	System.out.println("Wynik rzutowania jawnego double weight1 (" + weight1 + ") na typ int: " + weight2
		+ "\nJak widac po rzutowaniu informacje zostaly utracone");

	czyPrawda = age >= 40;
	System.out.print(czyPrawda);
	czyPrawda = age == 40;
	System.out.print(czyPrawda);
	czyPrawda = age != 40;
	System.out.print(czyPrawda);
	czyPrawda = age <= 40;
	System.out.print(czyPrawda);
	czyPrawda = age > 40;
	System.out.print(czyPrawda);
	czyPrawda = age < 40;
	System.out.print(czyPrawda + "\n");
	czyPrawda = (age == 40) || (weight == 74);
	System.out.println(czyPrawda);

	final double PRZYKLAD_STALEJ = 3.1415926;
	int binarny = 0b010;
	String unicode = "\u0167";
	double A = Math.PI;
	System.out.println("PI: " + A);

	// losowa liczba z zakresu od 0-50
	Random random = new Random();
	int losowa = random.nextInt(51);
	System.out.println("losowa liczba " + losowa);
	double losowaLiczba = Math.random() * 100;
	System.out.println("losowa Liczba 2: " + (int) (losowaLiczba));

	BigInteger duzaLiczbaCalkowita=new BigInteger("10000000000000000000000000000000");
	BigInteger druga = new BigInteger("11111111114545454300000");
	//działania arytmetyczne na BigInteger
	System.out.println(duzaLiczbaCalkowita.divide(druga));
	System.out.println(duzaLiczbaCalkowita.add(druga));
	System.out.println(duzaLiczbaCalkowita.multiply(druga));
	System.out.println(duzaLiczbaCalkowita.subtract(druga));
	System.out.println(duzaLiczbaCalkowita.pow(2));
	//konwersja liczby inego typu na BigInteger
	BigInteger skonwertowana = BigInteger.valueOf(binarny);
	
	BigDecimal duzaLiczbaZmiennoprzecinkowa= new BigDecimal("123456789101112131415161718192021222324.00000000002121");
	System.out.println(duzaLiczbaZmiennoprzecinkowa);
	System.out.println("k\'ody\f wyjscia\t dla\r znakow\n");
	System.out.println("druga linia\b");
	System.out.println("trzecia\" linia\\");
	System.out.println("unicode\n");
	System.out.println(
		String.format("%10s", "To jest ") + String.format("%10s", "przykład ")
			+ String.format("%10s", "formatted ") + String.format("%10s", "String"));
	System.out.println(String.format("%10s", "inny ") + String.format("%10s", "przykład ")
		+ String.format("%10s", "formatted ") + String.format("%10s", "String"));
	System.out.format("%(,.2f", -60000.25);
	System.out.println();
	int x = 9;
	int y = 4;
	int testModulo = x % y;
	System.out.println("9%4= " + testModulo + " - wynik jest reszta z dzielenia\n");

	double a, b, c;
	double przypisywanie = a = b = c = 10;
	System.out.println("a = b = c = 10");
	System.out.println("operatory przypisania\n");
	a += b; // a=a+b
	System.out.println("a " + a);
	System.out.println("b " + b + " wynik operatora a+=b");
	a -= b; // a=a-b
	System.out.println("a " + a);
	System.out.println("b " + b + " wynik operatora a-=b");
	a *= b; // a=a*b
	System.out.println("a " + a);
	System.out.println("b " + b + " wynik operatora a*=b");
	a /= b; // a=a/b
	System.out.println("a " + a);
	System.out.println("b " + b + " wynik operatora a/=b");

	a /= b + 1 - 1;// uwaga, tu wynik a=10/(10+1-1) czyli najpierw oblicza (od prawej), potem
		       // przekształca
	a = b = c = 1;
	// inkrementacja i dekrementacja
	a++; // a+1
	System.out.println(a);
	a--; // a-1
	System.out.println(a);
	System.out.println(c);
	c = a++;
	System.out.println(c
		+ " uwaga przy przypisaniu c=a++ c bedzie rowne a, a nie a+1. Aby do c przypisac a zinkrementowane uzyj c=++a");

	int u = 5;
	int w = 3;
	int z = u + w++; // z = u + w, a dopiero pozniej w = w + 1;
	System.out.println("z: " + z);
	z = (u++) + w; // z = u + w, a nastepnie u = u + 1
	System.out.println("z: " + z);
	String myname;
	myname = "Adam";
	myname += " xD"; // ten operator dodaje inny tekst na koncu tekstu
	System.out.println(myname);

	Double tege = 100.00; // klasa Double, a nie double, aby zastosować poniższe zmienne
	System.out.println("tege: " + tege.MAX_VALUE);
	System.out.println("Rozmiar tege: " + tege.SIZE);

    }

}
