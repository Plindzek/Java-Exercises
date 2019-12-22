package fabrykaAbstrakcyjna;

public class SpaceContructionWallFactory extends SpaceConstructionFactory{

   
    @Override
    public IPartShop BuildPartShop()
    {
        return new Wall();
    }

    @Override
    public IWorkers AssignWorkers()
    {
        return new WorkersWall();
    }
}


