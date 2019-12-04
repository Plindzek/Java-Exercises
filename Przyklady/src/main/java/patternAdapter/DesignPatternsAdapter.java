package patternAdapter;

public class DesignPatternsAdapter {
    public static void main(String[] args) {
	/*
	 * aplikacja nie zosta³a zmodyfikowana, ale korzysta z nowej ods³ony metody i
	 * wyœwietli dodatkowe dane
	 */
	Writer writer = new DataWriter();
	writer.save("\"Some Data\"");
    }

}
