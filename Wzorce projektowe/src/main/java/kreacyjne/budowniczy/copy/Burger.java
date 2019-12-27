package budowniczy.copy;

public class Burger {
    
    private String meat;
    private String sauce;
    
  
    public void setMeat(String meat) {
        this.meat = meat;
    }
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    @Override
    public String toString() {
	return "Burger [meat=" + meat + ", sauce=" + sauce + "]";
    }
  
}
