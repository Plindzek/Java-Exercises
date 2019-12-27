package wstrzykiwanieZaleznosci.wersjaZ_Wzorcem;

public class MainDI {
    
    public static void main(String[] args) {
        DeliveryPackage deliveryPackage = new DeliveryPackage("Książka", "Effective Java", "Księżyc 103");
        

        DeliveryServiceDI airplaneDeliveryService = new DeliveryServiceDI(new AirplaneTransport());
        DeliveryServiceDI shipDeliveryService = new DeliveryServiceDI(new ShipTransport());
        DeliveryServiceDI truckDeliveryService = new DeliveryServiceDI(new TruckTransport());
        
        airplaneDeliveryService.sendPackage(deliveryPackage);
        truckDeliveryService.sendPackage(deliveryPackage);
        shipDeliveryService.sendPackage(deliveryPackage);
    }

}
