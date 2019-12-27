package polecenie;

public class Lamp implements Switchable{
    boolean LightState=false;

    public void powerOn()
    {
        checkState(true, "The light is already turned on!", "The light is on");
    }

    public void powerOff()
    {
        checkState(false, "The light is already turned off!", "The light is off");
    }

    public void checkState(boolean state, String exception,String notification)
    {
        if (LightState == state)
        {
            System.out.println(exception);
        }
        else
        {
           System.out.println(notification);
            LightState = state;
        }
    }

}
