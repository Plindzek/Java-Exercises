
package dziedziczenie1;
import lombok.Data;


public class Book extends Product {
	int pages;

	public Book() {
		this(0);
	}
	
	public Book(int pages) {
		this("Tytu³", 0.00,  false, pages);

	}
	public Book(String nazwa, double price,  boolean isPremium, int pages) {
		super(price, nazwa, isPremium);
		this.pages = pages;
	}


	
	public Book(double price) {             //mo¿emy stworzyæ dowolny konstruktor bazuj¹cy na konstruktorze z nadklasy
		super(price, "Tytu³", false);  
	}
	
	public Book(String name) {
		super.name=name;
	}
	
	


	
		


	public static void main(String[] args) {

		Product poradnik = new Book("\"Java w 21 dni\"", 99.99, false, 488);
		System.out.println(poradnik.getClass().getName());
		System.out.println(poradnik);
		
	}

	public String toString() {return super.toString() + ", how many pages?: "+pages +", " ;};
			  
			  
	
}
