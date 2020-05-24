package czynnosciowe.pamiatka_memento;

/**
 * zapisuje oraz przywraca stan obiektu
 * 
 * @author www
 *
 */

public class Originator {
    private String state;

    public void setState(String state)
    {
        System.out.println("czynnosciowe.pamiatka_memento.Originator: Setting state to " + state);
        this.state = state;
    }

    public Memento save()
    {
        System.out.println("czynnosciowe.pamiatka_memento.Originator: Saving to czynnosciowe.pamiatka_memento.Memento.");
        return new Memento(state);
    }

    public void restore(Memento m)
    {
        state = m.getState();
        System.out.println("czynnosciowe.pamiatka_memento.Originator: State after restoring from czynnosciowe.pamiatka_memento.Memento: " + state);
    }
}

