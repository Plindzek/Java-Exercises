package mediator;

/*
 * Najważniejsze jest to w tej klasie, że zapisujemy w niej nazwę uczestnika i 
 * przekazujemy wiadomość do metody Send() w klasie Participant i następnie przekazujemy wiadomość dalej do metody 
 * Send() w klasie Chatroom, oraz mamy zdefiniowane metody Receive() oraz Notify().
 */

public abstract class Participant {
    private String _name;

    private AbstractChatRoom _chatroom;

    public AbstractChatRoom get_chatroom() {
	return _chatroom;
    }

    public void set_chatroom(AbstractChatRoom _chatroom) {
	this._chatroom = _chatroom;
    }

    public String get_name() {
	return _name;
    }

    public Participant(String name) {
	this._name = name;
    }

    public void Send(String to, String message) {
	_chatroom.Send(_name, to, message);
    }

    public abstract void Receive(String from, String message);

    public abstract void Notify(String from);
}
