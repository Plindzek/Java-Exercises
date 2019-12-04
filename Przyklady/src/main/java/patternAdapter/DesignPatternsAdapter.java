package patternAdapter;

public class DesignPatternsAdapter {
    public static void main(String[] args) {
	/*
	 * aplikacja nie zosta�a zmodyfikowana, ale korzysta z nowej ods�ony metody i
	 * wy�wietli dodatkowe dane
	 */
	Writer writer = new DataWriter();
	writer.save("\"Some Data\"");
    }

}
