package patternBudowniczy;

public class BurgerExample {

    public static void main(String[] args) {

	BurgerBuilder builder = new BurgerBuilderImpl();
	/*
	 * builder zgodnie ze swoim konstruktorem stworzy� nowy obiekt Burger
	 *  co wy�wietlamy poni�ej na konsoli
	 */
	System.out.println(builder);

	builder.setMeat("podw�jna wo�owina");
	builder.setSauce("czosnkowy");
	/*
	 * ustawili�my builderowi nowe argumenty sprawd�my teraz, jak wygl�da nasz
	 * obiekt
	 */
	System.out.println(builder);

	/*
	 * metod� build wyci�gamy nasz obiekt Burger z BurgerBuildera i przypisujemy do zmiennej
	 */
	Burger doubleGarlic = builder.build();

	System.out.println(doubleGarlic);
    }

}
