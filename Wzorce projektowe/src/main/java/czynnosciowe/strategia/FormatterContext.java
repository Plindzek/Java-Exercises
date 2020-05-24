package czynnosciowe.strategia;

public class FormatterContext {

    private TextFormatterStrategy strategy;

    /* 3. klasa z logiką przełączania utworzonych przez nas klas
     *
     * w zalezności od tego jakiej klasy obiekt podamy jako argument metody set
     * czyli przypiszemy referencje do parametru "strategy" metody będącego zmienną typu interfejsu czynnosciowe.strategia.TextFormatterStrategy
     *
     * metoda ustawi ten obiekt jako zmienną metody print,
     * i w metodzie print wykona się format z odpowiadającej bieżącemu obiektowi klasy
     * Przejdzmy do aplikacji w klasie czynnosciowe.strategia.czynnosciowe.pamiatka_memento.czynnosciowe.odwiedzajacy_visitor.czynnosciowe.metodaSzablonowa.czynnosciowe.mediator.czynnosciowe.lancuchZobowiazan.czynnosciowe.iterator.czynnosciowe.interpreter2.czynnosciowe.interpreter.Main
     */

    public void set(TextFormatterStrategy strategy) {
        this.strategy = strategy;
    }

    public void print(String text) {
        String formattedText = strategy.format(text);
        System.out.println(formattedText);
    }

}
