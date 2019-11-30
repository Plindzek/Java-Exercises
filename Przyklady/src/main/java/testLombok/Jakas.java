package testLombok;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.ToString;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor

public class Jakas {

    private String adam;
    private int liczba;
    private long data;
}
/*
 * @Data oznacza tzw klas� u�ywan� do transferu danych
*mozna w zamian sprecyzowa� generowane metody
*@getter, @setter @toString etc
*auto gettery+settery, auto-konstruktor z wszystkimi zmiennymi z klasy
*auto toString i hashcode equals
*/