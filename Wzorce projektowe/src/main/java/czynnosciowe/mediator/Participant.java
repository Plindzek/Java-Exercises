package czynnosciowe.mediator;

/**
 * Najważniejsze jest to w tej klasie, że zapisujemy w niej nazwę uczestnika i
 * przekazujemy wiadomość do metody Send(), która ją przekazuje dalej do metody
 * Send() w klasie Chatroom, oraz mamy zdefiniowane metody Receive() oraz
 * Notify().
 */

public abstract class Participant {

    private String _name;
    private AbstractChatRoom _chatroom;


    public Participant(String name) {
	this._name = name;
    }

    public void Send(String to, String message) {
	_chatroom.Send(_name, to, message);
    }

    public abstract void Receive(String from, String message);

    public abstract void Notify(String from);

    public AbstractChatRoom get_chatroom() {
	return _chatroom;
    }

    public void set_chatroom(AbstractChatRoom _chatroom) {
	this._chatroom = _chatroom;
    }

    public String get_name() {
	return _name;
    }
}
