
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
 
  // Metoda ustalaj¹ca sk³adniki pary 
  public void set(int x, int y) { 
    a = x;
    b = y;
  }
 
  // Metoda pokazujaca parê
  public void show() {
    System.out.println("( " + a + "," + b + " )");
  }

}