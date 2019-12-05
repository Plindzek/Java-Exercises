package patternStrategia;

public interface TextFormatterStrategy {

    String format(String text);

    /*
     * 2.Po utworzeniu interfejsu rozdzielamy skomplikowany kod na kilka klas, tu:
     * LowerCaseFormatter, UpperCaseFormatter i CapitalizeFormatter
     * oraz tworzymy klasę z logiką strategii FormatterContext
     */

}
