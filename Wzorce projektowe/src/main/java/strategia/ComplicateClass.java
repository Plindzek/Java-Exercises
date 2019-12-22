package strategia;

public class ComplicateClass {

    private String format;

    /*
     * 1. Ta klasa zawiera skomplikowaną metodę formatowania tekstu z wieloma
     * warunkami zastosowanie wzorca strategii zaczynamy od stworzenia interfejsu
     * TextFormatterStrategy, który określa wspólne zachowanie, w tym przypadku
     * formatowanie tekstu
     */

    public String format(String text) {
	if (format.equals("upperCase")) {
	    return text.toUpperCase();
	} else if (format.equals("lowerCase")) {
	    return text.toLowerCase();
	} else if (format.equals("capitalize")) {
	    return text.substring(0, 1).toUpperCase() + text.substring(1);
	} else
	    return text;
    }

}
