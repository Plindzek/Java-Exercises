package czynnosciowe.polecenie;

/**
 * zawiera metode checkstate wyswietlającą powiadomienia oraz implementuje
 * metody on/off, zmieniające status checkState na true/false
 *
 */

public class Lamp implements Switchable{
    boolean LightState=false;

    /**
     * wykonuje checkstate z state true, exception light is on i notification on
     */
    @Override
    public void powerOn()
    {
        checkState(true, "The light is already turned on!", "The light is on");
    }

    /**
     * wykonuje checkstate z state false, exception light is off i notification off
     */
    @Override
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
