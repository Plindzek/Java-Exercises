package fabrykaAbstrakcyjna;

public class SpaceContructionFloorFactory extends SpaceConstructionFactory{

    @Override
    public IPartShop BuildPartShop()
    {
        return new Floor();
    }

    @Override
    public IWorkers AssignWorkers()
    {
        return new WorkersFloor();
    }
}


