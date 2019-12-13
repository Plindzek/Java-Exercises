package polecenie;

public class Switch {
        Command _closedCommand;
        Command _openedCommand;

        public Switch(Command closedCommand, Command openedCommand)
        {
            _closedCommand = closedCommand;
            _openedCommand = openedCommand;
        }

        public void close()
        {
            _closedCommand.execute();
        }

        public void open()
        {
            _openedCommand.execute();
        }
    }

