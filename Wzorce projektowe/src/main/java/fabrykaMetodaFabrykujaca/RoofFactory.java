package fabrykaMetodaFabrykujaca;

public class RoofFactory extends PartShopFactory{

    @Override
    public IPartShop BuildPartShop() {
	return new Roof();
    }

}
