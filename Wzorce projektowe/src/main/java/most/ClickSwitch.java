package most;

public class ClickSwitch extends Switch {

   

    public ClickSwitch(IDevice device) {
	super(device);
    }

    public void On()
    {
        device.On();
        
    }

    public void Off()
    {
        device.Off();
    }
    
}
