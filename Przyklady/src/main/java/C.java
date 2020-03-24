
public class C {
  private int a;
  private int b;
 
  // konstruktor bezparametrowy
  public C() { 
  }
 
  // konstruktor z dwoma argumentami = elementami pary
  public C(int x, int y) { 
    a = x;
    b = y;
  }
 
  // Metoda ustalająca składniki pary
  public void set(int x, int y) { 
    a = x;
    b = y;
  }
 
  // Metoda pokazujaca parę
  public void show() {
    System.out.println("( " + a + "," + b + " )");
  }

}