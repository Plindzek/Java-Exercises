package testy;

public class Testowanie {

    public int dodawanie(int x, int y) {

	return x + y;
    }

    public boolean sprawdzZakres(int zakresMin, int zakresMax, int liczba) {
	if (liczba>=zakresMin&&liczba<=zakresMax) {
	return true;
	}else
	    return false;
    }
}
