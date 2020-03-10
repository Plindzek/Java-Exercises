package czynnosciowe.stan;

public class Main {
    /*
     * W dużych projektach, musisz zmieniać zachowanie obiektu w zależności od jego
     * stanu(W małych oraz średnich projektach używanie wzorca State nie ma sensu
     * dodaje jedynie niepotrzebną skomplikowaną logikę).
     * 
     * Gdy masz zestaw skomplikowanych instrukcji warunkowych.
     */

    public static void main(String[] args) {
	Context c = new Context();
	c.setState(new StateOne());

        c.request();
        c.request();
        c.request();
        c.request();
        c.request();

    }
    }


