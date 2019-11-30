package dziedziczenie1;

public class Product {

	private boolean isPremium;
	protected String name;
	private double price;
	
	public String toString() {return "Nazwa: "+name+", Produkt Premium?: "+isPremium+", Cena: "+price+"PLN";}

	public String nadmetoda() {
		return "Wynik nadmetody";
	}

	
	public Product() {
		this(100.00);
	}

	public Product(double price) {
		this(price, "Tuty³");
	}

	public Product(double price, String name) {
		this(price, name, true);
	}

	public Product(double price, String name, boolean isPremium) {
		this.price = price;
		this.name = name;
		this.isPremium = isPremium;
	}

	public static void main(String[] args) {

	}

	public String podmetoda() {
		
		return "PODMETODA W nadklasie";
	}

}
