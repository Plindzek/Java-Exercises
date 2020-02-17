package wstrzykiwanieZaleznosci.wersjaZ_Wzorcem;
public class AirplaneTransport implements TransportService {
	@Override
    public void delivery(DeliveryPackage pack) {
	System.out.println("Airplane delivered package: " + pack);
    }
}