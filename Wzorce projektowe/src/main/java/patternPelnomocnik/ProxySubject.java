package patternPelnomocnik;

public class ProxySubject implements Subject{

    private Subject realSubject;
    
    public ProxySubject() {
        this.realSubject = new RealSubject();
    }
    
@Override
    public void makeWork() 
    {
    System.out.print("Before work do proxy stuff and later: ");
    realSubject.makeWork();
    }

    
}
