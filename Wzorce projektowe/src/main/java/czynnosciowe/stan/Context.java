package stan;

public class Context {
    /*
     * W dużych projektach, musisz zmieniać zachowanie obiektu w zależności od jego
     * stanu(W małych oraz średnich projektach używanie wzorca State nie ma sensu
     * dodaje jedynie niepotrzebną skomplikowaną logikę). 
     * 
     * Gdy masz zestaw skomplikowanych instrukcji warunkowych.
     */

    private State current;

    public void setState(State state) {
	current = state;
	System.out.println("State: " + current.getClass().getName());
    }

    public void Request() {
	current.goNext(this);
    }
}
