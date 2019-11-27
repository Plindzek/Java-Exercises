
public class RównanieKwadratowe {

    int a;
    int b;
    int c;

    public RównanieKwadratowe(int a, int b, int c) // konstruktor o nazwie klasy, pozwalaj¹cy zainicjowaæ nowe obiekty
    {
	this.a = a; // przypisanie fieldom klasy zmienne parametryczne
	this.b = b; // nie musza sie nazywac tak samo
	this.c = c;
    }

    public String rozwi¹¿() // metoda rozwi¹zuj¹ca równanie mog³ay byæ jako void drukujac rozwi¹zanie na
			    // konsoli
			    // ale tak jest lepiej metoda klasy String zwracaj¹ca ³añcuch tekstowy
			    // zawieraj¹cy rozwi¹zanie
			    // metoda bez parametrów jawnych poniewaz bêdzie operowa³a na obiekcie

    {
	String rozwi¹zanie = ""; // bo zwraca returnem. nie tworzymy jako pole(czemu?)

	double delta;

	delta = (b * b - 4 * a * c);

	if (delta > 0) {
	    delta = Math.sqrt(delta);
	    double x1 = (-b - delta) / (2 * a);
	    double x2 = (-b + delta) / (2 * a);

	    rozwi¹zanie = "Równanie posiada dwa pierwiastki rzeczywiste: " + x1 + " " + x2;
	}

	else if (delta == 0) {
	    delta = Math.sqrt(delta);
	    double x0 = -b / (2 * a);
	    rozwi¹zanie = "Równanie posiada jeden pierwiastek rzeczywisty: " + x0;
	}

	else {
	    rozwi¹zanie = "Brak pierwiastków rzeczywistych";
	}
	return rozwi¹zanie;
    }

    public static void main(String[] args)

    {
	RównanieKwadratowe równanie = new RównanieKwadratowe(1, 4, 2); // nazwa klasy new(wywo³uje konstruktor)nazwa
								       // klasy i podajemy parametry
	System.out.println(równanie.rozwi¹¿()); // pokazuje obiekt równania na ekranie (wynik)
    }
}