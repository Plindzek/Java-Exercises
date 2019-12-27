package wstrzykiwanieZaleznosci.wersjaZ_Wzorcem;

public class DeliveryServiceDI {
    
    private final TransportService transportService;
    
    public DeliveryServiceDI(TransportService transportService) {
        this.transportService = transportService;
    }
    
//    private AirplaneTransport airplaneTransport = new AirplaneTransport();
//    private final ShipTransport shipTransport = new ShipTransport();
//    private final TruckTransport truckTransport = new TruckTransport();
    
    
    public void sendPackage(DeliveryPackage deliveryPackage){
	 transportService.delivery(deliveryPackage);
    }
    
   
}
