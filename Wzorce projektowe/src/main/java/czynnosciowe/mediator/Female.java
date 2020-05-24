package czynnosciowe.mediator;

public class Female extends Participant{
    
    public Female(String name)  {
	super(name); 
	}
    @Override
    public void Receive(String from, String message)
    {
        System.out.println("{"+from+"} to {"+get_name()+"} '{"+message+"}'");
    }
    @Override
    public void Notify(String from)
    {
        System.out.println("Woman " + get_name() + " gets message from: " + from);
    }
}

