package czynnosciowe.mediator;

public abstract class AbstractChatRoom {
    /**
     * rejestracja zależności
     * 
     * @param participant zależność do rejestracji w mediatorze
     */
    public abstract void Register(Participant participant);

    /**
     * wysyła wiadomość
     * 
     * @param from    nazwa wysyłającego
     * @param to      nazwa odbierającego
     * @param message wiadomość do wysłania
     */
    public abstract void Send(String from, String to, String message);
}
