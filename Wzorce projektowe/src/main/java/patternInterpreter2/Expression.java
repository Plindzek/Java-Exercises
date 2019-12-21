package patternInterpreter2;

public abstract class Expression {

    /*
     * wzorzec Interpreter przekształca podane dane wejściowe i zwraca
     * w nowej formie 
     */

    public void Interpret(Context context) {
	/*
	 * metoda Interpret bierze input i sprawdza, czy zaczyna się okresloną literą
	 * jeżeli tak, dodaje do outputu okreslona cyfrę*multiplier po czym usuwa tą
	 * literę
	 */
	if (context.get_input().length() == 0)
	    return;

	if (context.get_input().startsWith(Nine())) {
	    context.set_output(context.get_output() + (9 * Multiplier()));
	    context.set_input(context.get_input().substring(2));
	} else if (context.get_input().startsWith(Four())) {
	    context.set_output(context.get_output() + (4 * Multiplier()));
	    context.set_input(context.get_input().substring(2));
	} else if (context.get_input().startsWith(Five())) {
	    context.set_output(context.get_output() + (5 * Multiplier()));
	    context.set_input(context.get_input().substring(1));
	}

	while (context.get_input().startsWith(One())) {
	    context.set_output(context.get_output() + (1 * Multiplier()));
	    context.set_input(context.get_input().substring(1));
	}
    }

    public abstract String One();

    public abstract String Four();

    public abstract String Five();

    public abstract String Nine();

    public abstract int Multiplier();
}
