package patternSingleton;

public class Singleton {
private static Singleton instance=null;

private Singleton() {} //prywatny konstruktor nie pozwala stworzy� obiektu poza klas�

public static Singleton getInstance() { //metoda statyczna pozwalaj�ca stworzyc tylko jeden obiekt klasy
    if(instance==null) {
	instance= new Singleton();
    }
    return instance;
}

}
