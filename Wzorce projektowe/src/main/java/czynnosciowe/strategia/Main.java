package czynnosciowe.strategia;

public class Main {

    private static final String TEXT = "Strategy Design Pattern";

    public static void main(String[] args) {

        /*
         * 4. Tworzymy obiekt klasy przełączającej "context", który za pomocą metody set bedzie
         * zmieniał obiekt i wykonywał zadaną strategię w print
         */

        FormatterContext context = new FormatterContext();

        context.set(new CapitalizeFormatter());
        context.print(TEXT);

        context.set(new UpperCaseFormatter());
        context.print(TEXT);

        context.set(new LowerCaseFormatter());
        context.print(TEXT);
    }

}
