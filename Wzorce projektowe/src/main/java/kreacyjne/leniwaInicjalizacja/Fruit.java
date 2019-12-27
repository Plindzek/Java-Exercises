package leniwaInicjalizacja;

import java.util.*;

public class Fruit
{
    private static final Map<String,Fruit>types = new HashMap<String,Fruit>();
    private final String type;
  
    /* using a private constructor to force use of the factory method.
    *prywatny konstruktor nie pozwala stworzyć obiektu bezposrednio, tylko sięgnąć do mapy obiektów o określonym typie. 
    *Jeżeli nie znajdziemy potrzebnego obiektu dopiero powstaje nowy
    */
    private Fruit(String type) {
      this.type = type;
    }
    
    /**
     * Lazy Factory method, gets the Fruit instance associated with a
     * certain type. Instantiates new ones as needed.
     * @param type Any string that describes a fruit type, e.g. "apple"
     * @return The Fruit instance associated with that type.
     */
    public static synchronized Fruit getFruit(String type) {
      Fruit f = types.get(type); // get the instance for that type
  
      if (f == null) {
        f = new Fruit(type); // lazy initialization/leniwa inicjalizacja
        types.put(type,f);
      }
  
      return f;
    }
}