package wstrzykiwanieZaleznosci.wersjaZ_Wzorcem;

public class MainDI {
    
    public static void main(String[] args) {
        DeliveryPackage pack = new DeliveryPackage("Książka", "Effective Java", "Księżyc 103");
        

        DeliveryServiceDI airplaneDeliveryService = new DeliveryServiceDI(new AirplaneTransport());
        DeliveryServiceDI shipDeliveryService = new DeliveryServiceDI(new ShipTransport());
        DeliveryServiceDI truckDeliveryService = new DeliveryServiceDI(new TruckTransport());
        
        airplaneDeliveryService.sendPackage(pack);
        truckDeliveryService.sendPackage(pack);
        shipDeliveryService.sendPackage(pack);
    }

}
