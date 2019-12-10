

public class EnumTshirt {

	public enum TshirtSize{S,M,L,XL,XXL} //domyslne modyfikatory enum to static final
	
	
	private TshirtSize size;

	private String manufacturer;
	
	public EnumTshirt(TshirtSize size, String manufacturer) {
		this.size=size;
		this.manufacturer=manufacturer;
	}
	
	public static void main(String[] args) {
		EnumTshirt rockYoung = new EnumTshirt(TshirtSize.M, "LPP");
		System.out.println(rockYoung.size);
	}
}
