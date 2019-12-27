package stan;

public class Main {

    public static void main(String[] args) {
	Context c = new Context();
        c.setState(new StateOne());

        c.Request();
        c.Request();
        c.Request();
        c.Request();
        c.Request();

    }
    }


