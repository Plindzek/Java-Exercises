package patternAdapter.copy;

class NewWriter {

    /*
     * definiujemy now� metod� save
     */

    public void save(String data, int color) {

	System.out.println("Save data: " + data + " color: " + color);
    }

}

public class DataWriter implements Writer {

    /*
     * adaptujemy interfejs do obs�ugi zapisu za pomoc� zmodyfikowanej metody save
     */

    @Override
    public void save(String data) {

	NewWriter adapter = new NewWriter();
	adapter.save(data, 0);
    }
}
