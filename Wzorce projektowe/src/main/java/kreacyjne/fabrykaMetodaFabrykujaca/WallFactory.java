package fabrykaMetodaFabrykujaca;

public class WallFactory extends PartShopFactory{

    @Override
    public IPartShop BuildPartShop() {
	return new Wall();
    }

}
