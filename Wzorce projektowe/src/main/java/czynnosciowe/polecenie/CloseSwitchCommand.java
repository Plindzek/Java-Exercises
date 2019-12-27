package polecenie;

public class CloseSwitchCommand implements Command {

    private Switchable _switchable;

    public CloseSwitchCommand(Switchable switchable)
    {
        _switchable = switchable;
    }

    public void execute()
    {
        _switchable.powerOff();
    }

}
