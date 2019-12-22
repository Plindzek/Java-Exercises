package fabrykaAbstrakcyjna;

public abstract class SpaceConstructionFactory {
    
    public abstract IPartShop BuildPartShop();
    public abstract IWorkers AssignWorkers();
}

