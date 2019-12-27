package most;

public interface IDevice {
    
    /*
     * urzadzenie ma sie włączac i wylaczać
     * tworzymy dalej inną warstwę abstrakcji czyli definicję przełącznika Switch
     * klasy urządzeń będą implementować interfejs i korzystać z metod on/off ale typu Switch  
     */

    public void On();
    public void Off();


}
