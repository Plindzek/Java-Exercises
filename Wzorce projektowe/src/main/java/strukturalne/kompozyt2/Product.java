package strukturalne.kompozyt2;

public class Product extends ProductAbstract {

    /*
     * Product to Leaf(liść bez dzieci)
     * Composite to węzeł (liść z dziećmi)	
     */
    
    String name;
    
    public Product(String name) {
        this.name=name;
    }

    @Override
    protected String getProductName() {

        return name;
    }

    @Override
    public void addChild(ProductAbstract p) {

        System.out.println("Nie można dodać.");

    }

    @Override
    public void removeChild(ProductAbstract p) {

        System.out.println("Brak dzieci.");

    }

    @Override
    protected void repair() {
		
    }

    @Override
    public void makeIndependent() {
	depth=0;	
    }

}