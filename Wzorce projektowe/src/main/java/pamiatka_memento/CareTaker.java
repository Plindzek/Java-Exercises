package pamiatka_memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementos = new ArrayList<Memento>();

    public void addMemento(Memento m)
    {
        mementos.add(m);
    }

    public Memento getMemento(int index)
    {
        return mementos.get(index);
    }
}

