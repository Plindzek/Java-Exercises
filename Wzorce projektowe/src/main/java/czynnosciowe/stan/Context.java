package czynnosciowe.stan;

/**
 * zawiera metodę zmieniającą obiekt jednej z podklas State na obiekt innej oraz
 * metodę request, która wywołuje metode goNext bieżącego obiektu
 *
 */
public class Context {

    private State current;


    public void setState(State state) {
	current = state;
	System.out.println("State: " + current.getClass().getName());
    }

    public void request() {
	current.goNext(this);
    }
}
