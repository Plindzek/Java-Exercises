package patternSingleton;

public class Main {
    public static void main(String[] args) {
	    Singleton instance = Singleton.getInstance();
	    Singleton instance1 = Singleton.getInstance();
	    
	    System.out.println(instance.equals(instance1));
	}
}
