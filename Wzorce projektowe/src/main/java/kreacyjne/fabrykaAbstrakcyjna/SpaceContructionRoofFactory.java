package fabrykaAbstrakcyjna;

public class SpaceContructionRoofFactory extends SpaceConstructionFactory{

    @Override
    public IPartShop BuildPartShop()
    {
        return new Roof();
    }

    @Override
    public IWorkers AssignWorkers()
    {
        return new WorkersRoof();
    }
}


