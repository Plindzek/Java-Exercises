package patternSingleton;

public class Singleton {
private static Singleton instance=null;

private Singleton() {} //prywatny konstruktor nie pozwala stworzyc obiektu poza klasa

public static Singleton getInstance() { //metoda statyczna pozwalajaca stworzyc tylko jeden obiekt klasy
    if(instance==null) {
	instance= new Singleton();
    }
    return instance;
}

}
