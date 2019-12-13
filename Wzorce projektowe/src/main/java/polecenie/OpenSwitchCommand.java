package polecenie;

public class OpenSwitchCommand implements Command {


    private Switchable _switchable;

    public OpenSwitchCommand(Switchable switchable)
    {
        _switchable = switchable;
    }

    public void execute()
    {
        _switchable.powerOn();
    }

}


