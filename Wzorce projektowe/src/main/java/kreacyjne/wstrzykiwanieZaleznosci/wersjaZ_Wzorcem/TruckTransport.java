package wstrzykiwanieZaleznosci.wersjaZ_Wzorcem;
public class TruckTransport implements TransportService{
    
    @Override
    public void delivery(DeliveryPackage pack) {
    
	System.out.println("Truck delivered package: " + pack);
    }}