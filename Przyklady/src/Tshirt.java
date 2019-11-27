

public class Tshirt {

	public enum TshirtSize{S,M,L,XL,XXL} //domyslne modyfikatory enum to static final
	
	
	private TshirtSize size;

	private String manufacturer;
	
	public Tshirt(TshirtSize size, String manufacturer) {
		this.size=size;
		this.manufacturer=manufacturer;
	}
	
	public static void main(String[] args) {
		Tshirt rockYoung = new Tshirt(TshirtSize.M, "LPP");
		System.out.println(rockYoung.size);
	}
}
