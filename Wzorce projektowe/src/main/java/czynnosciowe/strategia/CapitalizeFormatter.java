package czynnosciowe.strategia;

public class CapitalizeFormatter implements TextFormatterStrategy {


    public String format(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}