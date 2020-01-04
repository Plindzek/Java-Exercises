package pamiatka_memento;

/**
 * 
 * przechowuje obecny stan obiektu
 * 
 * 
 * @author www
 *
 */
public class Memento {
    private String state;

    public Memento(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }
}
