package wstrzykiwanieZaleznosci.wersjaBezWzorca;

public class Main {

    public static void main(String[] args) {
        DeliveryPackage deliveryPackage = new DeliveryPackage("Książka", "Effective Java", "Księżyć 103");
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.sendPackage(deliveryPackage, TransportTypes.AIRPLANE);
        deliveryService.sendPackage(deliveryPackage, TransportTypes.SHIP);
        deliveryService.sendPackage(deliveryPackage, TransportTypes.TRUCK);
    }
}
