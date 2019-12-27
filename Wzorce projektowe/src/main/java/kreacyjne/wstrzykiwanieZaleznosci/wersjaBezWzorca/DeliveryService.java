package wstrzykiwanieZaleznosci.wersjaBezWzorca;

public class DeliveryService {
    private final AirplaneTransport airplaneTransport = new AirplaneTransport();
    private final ShipTransport shipTransport = new ShipTransport();
    private final TruckTransport truckTransport = new TruckTransport();
 
    
    
    public void sendPackage(DeliveryPackage deliveryPackage, TransportTypes transportType) {
        switch (transportType) {
            case AIRPLANE:
                airplaneTransport.delivery(deliveryPackage);
                break;
            case SHIP:
                shipTransport.delivery(deliveryPackage);
                break;
            case TRUCK:
                truckTransport.delivery(deliveryPackage);
                break;
            default:
                System.out.println("Unrecognized transport type!");
        }
    }
}