package czynnosciowe.polecenie;


public class Switch {
        Command _closedCommand;
        Command _openedCommand;

    /**
     * tworzy przycisk Switch, który potrafi włączać i wyłączać
     * 
     */
        public Switch(Command closedCommand, Command openedCommand)
        {
            _closedCommand = closedCommand;
            _openedCommand = openedCommand;
        }

    /**
     * wykonuje metodę execute na obiekcie typu Command
     */
        public void close()
        {
            _closedCommand.execute();
        }

    /**
     * wykonuje metodę execute na obiekcie typu Command
     */
        public void open()
        {
            _openedCommand.execute();
        }
    }

