package singleton;

public class Singleton {
private static Singleton instance=null;

private Singleton() {} //prywatny konstruktor nie pozwala stworzyc obiektu poza klasa

/*
 * metoda statyczna pozwalajaca stworzyc tylko jeden obiekt klasy
 * statyczna, bo musimy mieć do niej dostęp bez stwarzania obiektu klasy
 */

public static Singleton getInstance() { 
    if(instance==null) {
	instance= new Singleton();
    }
    return instance;
}

}
