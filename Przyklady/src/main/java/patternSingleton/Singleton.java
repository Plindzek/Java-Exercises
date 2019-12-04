package patternSingleton;

public class Singleton {
private static Singleton instance=null;

private Singleton() {} //prywatny konstruktor nie pozwala stworzyæ obiektu poza klas¹

public static Singleton getInstance() { //metoda statyczna pozwalaj¹ca stworzyc tylko jeden obiekt klasy
    if(instance==null) {
	instance= new Singleton();
    }
    return instance;
}

}
