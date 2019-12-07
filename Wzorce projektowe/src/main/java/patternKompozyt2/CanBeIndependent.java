package patternKompozyt2;

/*
 * dodajemy interfejs, aby zerować głebokość strzałki 
 * dla dowolnego (node/węzła/obiektu Composite)
 * 
 * np.:
 * processor.makeIndependent();
 * processor.showMe();
 */

public interface CanBeIndependent {

    public void makeIndependent();

}