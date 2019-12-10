package patternAdapter;

class NewWriter {

    /*
     * definiujemy nowa metode save
     */

    public void save(String data, int color) {

	System.out.println("Save data: " + data + " color: " + color);
    }

}

public class DataWriter implements Writer {

    /*
     * adaptujemy interfejs do obslugi zapisu za pomoca zmodyfikowanej metody save
     */
@Override
    public void save(String data) {

	NewWriter adapter = new NewWriter();
	adapter.save(data, 0);
    }
}
