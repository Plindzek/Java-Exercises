package czynnosciowe.mediator;

import java.util.Hashtable;
import java.util.Map;

/**
 * klasa mediatora
 */

public class ChatRoom extends AbstractChatRoom {

    private Map<String, Participant> _participants = new Hashtable<String, Participant>();

    /**
     * rejestruje na bieżąco zależności, sprawdzamy czy istnieje już w klasie taka
     * zależność, jeśli nie to zapisujemy ją do słownika
     */

    @Override
    public void Register(Participant participant) {

	if(!_participants.containsValue(participant))
        {
            _participants.put(participant.get_name(), participant);
        }
	participant.set_chatroom(this);
    }

    /**
     * sprawdzamy czy jest zarejestrowana osoba o imieniu, które przekazaliśmy do
     * metody w chacie, jeśli tak to wysyłamy do niej wiadomość.
     */
    @Override
    public void Send(String from, String to, String message) {

	Participant participant = _participants.get(to);

        if (participant != null)
        {
            participant.Receive(from, message);
            participant.Notify(from);
        }
    }
    }

