package strukturalne.most;

public class Button extends Switch {


    public Button(IDevice device) {
	super(device);
    }
    
    /*
     * Button dziedziczy konstruktor (przyjmujący jako parametr referencję typu IDevice)
     * i metody po Switch. Metody wywołują metody o tej samej nazwie z obiektów konkretnych urządzeń
     * 
     * 
     */

    public void On()
    {
        device.On();
        
    }

    public void Off()
    {
        device.Off();
    }
    
}
