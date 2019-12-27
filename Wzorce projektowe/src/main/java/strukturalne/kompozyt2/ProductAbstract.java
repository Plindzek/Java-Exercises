package kompozyt2;

public abstract class ProductAbstract implements CanBeIndependent{
    /*
     * klasa abstrakcyjna w celu uzyskania jednolitego API
     */

    protected abstract String getProductName();

    protected int depth = 0;

    public void showMe() {
//prosta implementacja, bez rysowania drzewka

	// System.out.println("Produkt "+this.getProductName());

	/*
	 * zaawansowana implementacja z rysowaniem strzałki coraz dłuższej wraz z
	 * głębokością drzewa
	 */
	System.out.println(this.generateLvl(depth) + "> Produkt " + this.getProductName());

    }

    private String generateLvl(int n) {
	StringBuilder sb = new StringBuilder();
	while (n > 0) {
	    sb.append("-");
	    n--;
	}
	return sb.toString();

    }

    public abstract void addChild(ProductAbstract p);

    public abstract void removeChild(ProductAbstract p);
    
    protected abstract void repair(); //dodana metoda do budowy strzałki

}
