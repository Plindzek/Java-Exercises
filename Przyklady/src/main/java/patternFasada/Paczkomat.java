package patternFasada;

class Paczkomat {

    boolean isDeliverBoxFull() {
	System.out.println("Box nie jest pe�en");
	return false;
    }

    boolean isDeliverBoxBroken() {
	System.out.println("Box nie jest uszkodzony");
	return false;
    }

   void getUserData() {
	System.out.println("u�ytkownik wprowadzi� dane");
    }

    void openBox() {
	System.out.println("otwarcie boxu");
    }

}
