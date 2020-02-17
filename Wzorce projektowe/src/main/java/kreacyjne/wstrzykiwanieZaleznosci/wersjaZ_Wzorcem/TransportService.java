package wstrzykiwanieZaleznosci.wersjaZ_Wzorcem;

public interface TransportService {
    
    /*
     * wg wzorca dependency inversion dodajemy interfejs, który będą implementować klasy transportowe
     * dlatego klasa DeliveryService nie będzie musiała tworzyć obiektów tych klas tylko w dodanym konstruktorze 
     * będzie wstrzykiwać typ interfejsu, który w kliencie będzie zastępowany obiektem konkretnej klasy transportowej
     * Dzięki temu przy zmianie, dodaniu nowego środka transportu DeliveryService nadal będzie działać bez potrzeby zmian
     * i w metodzie sendPackage nie będzie musiała zawierać skomplikowanego kodu
     * 
     */
    
    void delivery(DeliveryPackage pack);
}
