package strukturalne.fasada;

class Paczkomat {

    boolean isDeliverBoxFull() {
	System.out.println("Box nie jest pelen");
	return false;
    }

    boolean isDeliverBoxBroken() {
	System.out.println("Box nie jest uszkodzony");
	return false;
    }

   void getUserData() {
	System.out.println("uzytkownik wprowadzil dane");
    }

    void openBox() {
	System.out.println("otwarcie boxu");
    }

}
