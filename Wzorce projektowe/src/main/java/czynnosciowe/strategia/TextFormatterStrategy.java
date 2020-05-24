package czynnosciowe.strategia;

public interface TextFormatterStrategy {

    String format(String text);

    /*
     * 2.Po utworzeniu interfejsu rozdzielamy skomplikowany kod na kilka klas, tu:
     * czynnosciowe.strategia.LowerCaseFormatter, czynnosciowe.strategia.UpperCaseFormatter i czynnosciowe.strategia.CapitalizeFormatter
     * oraz tworzymy klasę z logiką strategii czynnosciowe.strategia.FormatterContext
     */

}
