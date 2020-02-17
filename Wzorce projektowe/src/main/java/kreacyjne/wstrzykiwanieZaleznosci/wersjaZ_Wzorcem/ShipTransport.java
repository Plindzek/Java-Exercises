package wstrzykiwanieZaleznosci.wersjaZ_Wzorcem;
public class ShipTransport implements TransportService{
    
    @Override
    public void delivery(DeliveryPackage pack) {
        System.out.println("Ship delivered package: " + pack);
    }
}