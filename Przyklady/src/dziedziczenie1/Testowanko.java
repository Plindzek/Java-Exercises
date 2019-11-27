package dziedziczenie1;

public class Testowanko {

	
	public static void main(String[] args) {
	
		
		Product nadobiekt = new Product();
		Book podobiekt = new Book();
		nadobiekt = (Product)podobiekt;
		Boolean w = podobiekt.equals(nadobiekt);
		String q = nadobiekt.getClass().getName();
		System.out.println(nadobiekt);
		System.out.println(podobiekt);
		System.out.println(w+" "+q);
		
		System.out.println("Wynik nadmetody na nadobiekcie: " +nadobiekt.nadmetoda());
		System.out.println("Wynik podmetody na podobiekcie: " +podobiekt.podmetoda());
		System.out.println("Wynik podmetody na nadobiekcie: " +nadobiekt.podmetoda());
		System.out.println("Wynik nadmetody na podobiekcie: " +podobiekt.nadmetoda());
}
}
