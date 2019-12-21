package patternPylek;

/*
 * W rozwiązaniu tego wzorca tworzymy tylko unikatowe obiekty. 
 * W momencie tworzenia nowego obiektu, sprawdzane jest czy egzemplarz o takich samych parametrach istnieje już w pamięci. 
 * Jeśli tak, to pobieramy go, a jeśli nie, tworzymy nowy. 
 * Obiekty te są immutable (niezmienne), czyli przygotowujemy klasę tak aby nie dało się jej zmodyfikować. 
 * Natomiast gdy zajdzie potrzeba zmiany danych wtedy tworzona jest nową instancja. 
 * Dzięki wykorzystaniu pyłku zmniejszamy ilość wykorzystywanej pamięci. 
 * Przykładem zastosowania tego wzorca jest obsługa obiektów typu String w JRE.
 */


final public class Relation {
    final private String description;
    
    

    public Relation(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
