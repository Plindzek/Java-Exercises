package fabrykaMetodaFabrykujaca;

public class Main {
    public static void main(String[] args) {

	PartShopFactory pathShopFactory = new RoofFactory();

	IPartShop roof = pathShopFactory.BuildPartShop();
    }

}
