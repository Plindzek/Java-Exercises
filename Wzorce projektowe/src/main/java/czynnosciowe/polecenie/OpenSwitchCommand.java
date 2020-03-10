package czynnosciowe.polecenie;


public class OpenSwitchCommand implements Command {


    private Switchable _switchable;

    /**
     * stworzenie polecenia włączenia dla obiektu Switchable
     */
    public OpenSwitchCommand(Switchable switchable)
    {
        _switchable = switchable;
    }

    /**
     * implementacja metody interfejsu Command w tej klasie wykonuje metodę powerOn
     * na obiekcie typu interfejsu Switchable
     */

    @Override
    public void execute()
    {
        _switchable.powerOn();
    }

}


