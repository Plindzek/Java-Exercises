package budowniczy.copy;

public class BurgerBuilderImpl implements BurgerBuilder {

    private Burger burger;

    BurgerBuilderImpl() {
   	burger = new Burger(); //powstanie nowy obiekt Burger bez argumentow
       }

    @Override
    public String toString() {
	return "BurgerBuilderImpl [burger=" + burger + "]";
    }

    @Override
    public Burger build() {//ta metoda pozwoli wydobyc nasz obiekt z przypisanymi argumentami z buildera
	return burger;
    }
/*
 * metody typu interfejsu zmieniaja settery klasy Burger
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
