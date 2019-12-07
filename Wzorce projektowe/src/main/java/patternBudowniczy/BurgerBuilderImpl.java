package patternBudowniczy;

public class BurgerBuilderImpl implements BurgerBuilder {

    private Burger burger;

    BurgerBuilderImpl() {
   	burger = new Burger(); //powstanie nowy obiekt Burger bez argumentów
       }

    @Override
    public String toString() {
	return "BurgerBuilderImpl [burger=" + burger + "]";
    }

    @Override
    public Burger build() {//ta metoda pozwoliwydobyæ nasz obiekt z przypisanymi argumentami z buildera
	return burger;
    }
/*
 * metody typu interfejsu zmieniaj¹ settery klasy Burger
 */
    @Override
    public BurgerBuilder setMeat(String meat) {
	burger.setMeat(meat);
	return this;
    }

    @Override
    public BurgerBuilder setSauce(String sauce) {
	burger.setSauce(sauce);
	return this;
    }

}
