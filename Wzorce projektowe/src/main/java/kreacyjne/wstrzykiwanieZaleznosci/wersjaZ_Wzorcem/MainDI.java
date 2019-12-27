package wstrzykiwanieZaleznosci.wersjaZ_Wzorcem;

public class MainDI {
    
    public static void main(String[] args) {
        DeliveryPackage deliveryPackage = new DeliveryPackage("Książka", "Effective Java", "Księżyc 103");
        DeliveryServiceDI deliveryService = new DeliveryServiceDI(new AirplaneTransport());
        deliveryService.sendPackage(deliveryPackage);
        deliveryService.sendPackage(deliveryPackage);
        deliveryService.sendPackage(deliveryPackage);
    }

}
