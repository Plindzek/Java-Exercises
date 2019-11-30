package dziedziczenie2;

public class Klasa2 implements Methodable {
public String podPole1 = "pole Klasa2";

	
	
	public void method() {
		System.out.println("Metoda klasa2");

}
	public static void main(String[] args) {
		Methodable oo = new Klasa();
		oo.method();
		Methodable aa = new Klasa2();
		aa.method();
		Klasa uu = new Klasa();
		uu.method();
		Klasa2 ii = new Klasa2();
		ii.method();
	}
}