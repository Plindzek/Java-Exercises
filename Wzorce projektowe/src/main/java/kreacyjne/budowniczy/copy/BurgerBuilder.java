package budowniczy.copy;

public interface BurgerBuilder {
    
    
    Burger build();
    
    BurgerBuilder setMeat(final String meat);
    BurgerBuilder setSauce(final String sauce);
    

}
