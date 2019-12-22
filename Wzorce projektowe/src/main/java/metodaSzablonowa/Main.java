package metodaSzablonowa;

public class Main {

    public static void main(String[] args) {

        AbstractClass aA = new ConcreteClassA();
        aA.TemplateMethod();

        AbstractClass aB = new ConcreteClassB();
        aB.TemplateMethod();

    }
}
