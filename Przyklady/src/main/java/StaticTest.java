public class StaticTest {
    /*
     * pole statyczne i jest takie samo dla wszystkich obiektów klasy pole nocounter
     * dla każdego obiektu inicjowane jest jako nowa zmienna
     */

	int nocounter;
	static int i;
	
	StaticTest(){
	i++;
	nocounter++;
    }
	
public static void main(String[] args) {
    	for ( i=1;i<=50;)
	{
	    var obiekt = new StaticTest();
	    System.out.println("obiekt: " + i);
	    System.out.println("pole niestatyczne= " + obiekt.nocounter);
	    System.out.println("nowy obiekt: " + obiekt);
	 }
}

    static {
	System.out.println("Blok static jest inicjowany na początku programu");
    }
}
