package patternMediator;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

/*
 *  implementacja się różni, tu nie mamy na sztywno przypisanych zależności tylko metodą Register() rejestrujemy na bieżąco zależności, 
 *  sprawdzamy czy istnieje już w klasie taka zależność, jeśli nie to zapisujemy ją do słownika
 *  w metodzie Send() sprawdzamy czy jest zarejestrowana osoba o imieniu, które przekazaliśmy do metody Send() w chacie, 
 *  jeśli tak to wysyłamy do niej wiadomość.
 */

public class ChatRoom extends AbstractChatRoom {
    private Map<String, Participant> _participants = new Hashtable<String, Participant>();
   
    @Override
    public void Register(Participant participant) {
	if(!_participants.containsValue(participant))
        {
            _participants.put(participant.get_name(), participant);
        }
	participant.set_chatroom(this);
    }

    
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

