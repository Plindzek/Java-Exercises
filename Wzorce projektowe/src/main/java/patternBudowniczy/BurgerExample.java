package patternBudowniczy;

public class BurgerExample {

    public static void main(String[] args) {

	BurgerBuilder builder = new BurgerBuilderImpl();
	/*
	 * builder zgodnie ze swoim konstruktorem stworzy³ nowy obiekt Burger
	 *  co wyœwietlamy poni¿ej na konsoli
	 */
	System.out.println(builder);

	builder.setMeat("podwójna wo³owina");
	builder.setSauce("czosnkowy");
	/*
	 * ustawiliœmy builderowi nowe argumenty sprawd¿my teraz, jak wygl¹da nasz
	 * obiekt
	 */
	System.out.println(builder);

	/*
	 * metod¹ build wyci¹gamy nasz obiekt Burger z BurgerBuildera i przypisujemy do zmiennej
	 */
	Burger doubleGarlic = builder.build();

	System.out.println(doubleGarlic);
    }

}
