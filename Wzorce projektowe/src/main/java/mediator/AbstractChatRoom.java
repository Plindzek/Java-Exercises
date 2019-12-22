package mediator;

public abstract class AbstractChatRoom {
    public abstract void Register(Participant participant);
    public abstract void Send(String from, String to, String message);
}
