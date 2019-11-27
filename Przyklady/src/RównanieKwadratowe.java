
public class R�wnanieKwadratowe {

    int a;
    int b;
    int c;

    public R�wnanieKwadratowe(int a, int b, int c) // konstruktor o nazwie klasy, pozwalaj�cy zainicjowa� nowe obiekty
    {
	this.a = a; // przypisanie fieldom klasy zmienne parametryczne
	this.b = b; // nie musza sie nazywac tak samo
	this.c = c;
    }

    public String rozwi��() // metoda rozwi�zuj�ca r�wnanie mog�ay by� jako void drukujac rozwi�zanie na
			    // konsoli
			    // ale tak jest lepiej metoda klasy String zwracaj�ca �a�cuch tekstowy
			    // zawieraj�cy rozwi�zanie
			    // metoda bez parametr�w jawnych poniewaz b�dzie operowa�a na obiekcie

    {
	String rozwi�zanie = ""; // bo zwraca returnem. nie tworzymy jako pole(czemu?)

	double delta;

	delta = (b * b - 4 * a * c);

	if (delta > 0) {
	    delta = Math.sqrt(delta);
	    double x1 = (-b - delta) / (2 * a);
	    double x2 = (-b + delta) / (2 * a);

	    rozwi�zanie = "R�wnanie posiada dwa pierwiastki rzeczywiste: " + x1 + " " + x2;
	}

	else if (delta == 0) {
	    delta = Math.sqrt(delta);
	    double x0 = -b / (2 * a);
	    rozwi�zanie = "R�wnanie posiada jeden pierwiastek rzeczywisty: " + x0;
	}

	else {
	    rozwi�zanie = "Brak pierwiastk�w rzeczywistych";
	}
	return rozwi�zanie;
    }

    public static void main(String[] args)

    {
	R�wnanieKwadratowe r�wnanie = new R�wnanieKwadratowe(1, 4, 2); // nazwa klasy new(wywo�uje konstruktor)nazwa
								       // klasy i podajemy parametry
	System.out.println(r�wnanie.rozwi��()); // pokazuje obiekt r�wnania na ekranie (wynik)
    }
}