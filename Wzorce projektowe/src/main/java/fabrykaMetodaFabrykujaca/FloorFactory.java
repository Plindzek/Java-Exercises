package fabrykaMetodaFabrykujaca;

public class FloorFactory extends PartShopFactory{

    @Override
    public IPartShop BuildPartShop() {
	return new Floor();
    }

}
