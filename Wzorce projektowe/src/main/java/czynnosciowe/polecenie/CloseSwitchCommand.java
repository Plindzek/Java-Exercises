package polecenie;


public class CloseSwitchCommand implements Command {

    private Switchable _switchable;

    /**
     * Stworzenie polecenia wyłączenia dla obiektu Switchable
     */
    public CloseSwitchCommand(Switchable switchable)
    {
        _switchable = switchable;
    }

    /**
     * implementacja metody interfejsu Command w tej klasie wykonuje metodę powerOff
     * na obiekcie typu interfejsu Switchable
     */
    @Override
    public void execute()
    {
        _switchable.powerOff();
    }

}
