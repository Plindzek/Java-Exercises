package strategia;

public class LowerCaseFormatter implements TextFormatterStrategy {

    public String format(String text) {
        return text.toLowerCase();
    }
}
