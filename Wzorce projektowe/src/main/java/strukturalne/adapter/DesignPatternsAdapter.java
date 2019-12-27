package adapter;

public class DesignPatternsAdapter {
    public static void main(String[] args) {
	/*
	 * aplikacja nie zostala zmodyfikowana, ale korzysta z nowej odslony metody i
	 * wyswietli dodatkowe dane
	 */
	Writer writer = new DataWriter();
	writer.save("\"Some Data\"");
    }

}
