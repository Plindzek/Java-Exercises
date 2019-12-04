package patternAdapter.copy;

class NewWriter {

    /*
     * definiujemy now¹ metodê save
     */

    public void save(String data, int color) {

	System.out.println("Save data: " + data + " color: " + color);
    }

}

public class DataWriter implements Writer {

    /*
     * adaptujemy interfejs do obs³ugi zapisu za pomoc¹ zmodyfikowanej metody save
     */

    @Override
    public void save(String data) {

	NewWriter adapter = new NewWriter();
	adapter.save(data, 0);
    }
}
