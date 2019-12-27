package fabrykaAbstrakcyjna;

public class SpaceConstruction {
    private SpaceConstructionFactory spaceconstruction;
    
    public SpaceConstruction(SpaceConstructionFactory spaceconstruction)
    {
        this.spaceconstruction = spaceconstruction;
    }

    public void MakeSpaceContruction()
    {
        var partshop = this.spaceconstruction.BuildPartShop();
        var workers = this.spaceconstruction.AssignWorkers();
        System.out.println("Workers are assigned to build individual parts of the store");
    }

public static void main(String[] args)
{
    SpaceConstruction spaceconstruction;

    spaceconstruction =new SpaceConstruction(new SpaceContructionFloorFactory());
    spaceconstruction.MakeSpaceContruction();

    spaceconstruction = new SpaceConstruction(new SpaceContructionRoofFactory());
    spaceconstruction.MakeSpaceContruction();

    spaceconstruction = new SpaceConstruction(new SpaceContructionWallFactory());
    spaceconstruction.MakeSpaceContruction();

    
    

}
}
