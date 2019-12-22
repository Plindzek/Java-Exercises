package kompozyt2;

public class Main {

    public static void main(String[] args) {

        Composite main = new Composite("Komputer"); //root

        Composite keyboard = new Composite("Klawiatura");

        Composite alfaKeyboard = new Composite("Klawiatura alfanumeryczna");
        alfaKeyboard.addChild(new Product("Klawisze funkcyjne F1-F12"));
        keyboard.addChild(alfaKeyboard);
        keyboard.addChild(new Product("Klawiatura numeryczna"));

        Composite system_unit = new Composite("Jednostka Centralna");
        system_unit.addChild(new Product("Napęd DVD"));
        system_unit.addChild(new Product("Diody sygnalizacyjne"));
        Composite processor = new Composite("Procesor");
        Composite registers = new Composite("Rejestry");
        registers.addChild(new Product("Przerzutnik"));
        processor.addChild(registers);
        processor.addChild(new Product("ALU"));
        system_unit.addChild(new Product("Dysk twardy"));
        system_unit.addChild(new Product("Karta Graficzna"));
        system_unit.addChild(new Product("Pamięć"));
        system_unit.addChild(processor);

        main.addChild(keyboard);
        main.addChild(new Product("Monitor"));
        main.addChild(new Product("Mysz"));
        main.addChild(system_unit);
        
        main.showMe();
        System.out.println();
        processor.makeIndependent();
        processor.showMe();
    }

}