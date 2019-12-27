package wstrzykiwanieZaleznosci.wersjaZ_Wzorcem;
public class AirplaneTransport implements TransportService {
	@Override
    public void delivery(DeliveryPackage deliveryPackage) {
	System.out.println("Airplane delivered package: " + deliveryPackage);
    }
}