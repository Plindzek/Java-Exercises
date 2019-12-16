package naukaTestow;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import testy.Testowanie;

public class TestowanieTest {

    Testowanie t = new Testowanie();

    @Test
    public void testDodawanie() {
	int x = 2;
	int y = 3;

	assertEquals(5, t.dodawanie(x, y));
    }

    @Test
    @Ignore
    
   public void testSprawdzZakresTrue() {
int min = 3;
int max= 7;
int liczba = 4;
 assertTrue("Liczba nie jest w zakresie", t.sprawdzZakres(min, max, liczba));    }
   @Test
    public void testSprawdzZakresFalse() {
	int min = 3;
	int max= 7;
	int liczba = 2;
	int liczba1= 8;
	 assertFalse("Liczba jest w zakresie", t.sprawdzZakres(min, max, liczba));
	 assertFalse("Liczba jest w zakresie", t.sprawdzZakres(min, max, liczba1));}

}
