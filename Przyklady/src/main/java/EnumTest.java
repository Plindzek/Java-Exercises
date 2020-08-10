
public 	class EnumTest {

	int c = 10;
	static int staticC = 20;


	enum Color {
		BLUE(true), RED(false), WHITE(true);
		boolean isNice;

		Color(boolean isNice) {
			this.isNice = isNice;
		}
	}

	public static void main(String[] args) {

		EnumTest obiekt24 = new EnumTest();
		EnumTest obiekt48 = new EnumTest();
		obiekt24.c = 24;
//		obiekt48.c=48;
		staticC = 40;
		System.out.println(obiekt24.c +" "+ obiekt48.c);
		System.out.println(staticC);







		String a = String.valueOf(Color.RED);
		Color red = Color.RED;

		System.out.println(red);
		System.out.println(red.isNice);
		System.out.println(a);

		System.out.println("enums list with values method help:");
		for (Color s : Color.values()) {
			System.out.println(s);
		}
	}

}
