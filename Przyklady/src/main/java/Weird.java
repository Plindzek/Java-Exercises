class Weird {
    public static void main(String[] args) {
        Runnable obj = new Object() {
            int val = 0;
            {
                val = 5;
            }
            void showVal() {
                System.out.println(val);
            }
        }::showVal;
        obj.run();
    }
}

/*
Jest to definicja klasy anonimowej, która będzie rozszerzała klasę Object. W klasach anonimowych, podobnie jak we wszystkich innych klasach, można definiować pola klasy. W tym przypadku zdefiniowano pole val z początkową wartością 0. Zapis:

{
    val = 5;
}

to blok inicjujący, który wywoływany jest po utworzeniu obiektu. Ponieważ obiekt klasy anonimowej tworzony jest wraz z jej definicją, to wartość val ma teraz wartość 5. Metoda showVal() to zwykła metoda, która może być wywołana na obiekcie. Jej zadaniem jest wyświetlenie wartości pola val.

W naszym przypadku metoda nie jest od razu wywoływana na utworzonym obiekcie. Zamiast tego posługujemy się taką konstrukcją (w skrócie):

Runnable obj = new Object() {...}::showVal;

Wykorzystujemy w tym miejscu możliwości Javy 8 i do referencji obj przypisujemy referencję do metody showVal(). Zapis taki jest możliwy, ponieważ Runnable jest interfejsem funkcyjnym. Zdefiniowana jest w nim tylko jedna metoda abstrakcyjna o takiej sygnaturze:

public abstract void run();

Ponieważ sygnatura metody showVal() jest identyczna, tzn. metoda ma typ zwracany void i nie przyjmuje żadnych parametrów, to możemy referencję do tej metody przypisać do zmiennej typu Runnable. Zapisują więc w dalszej części kodu:

obj.run();

wywołujemy w rzeczywistości metodę showVal(), a to powoduje wyświetlenia wartości 5.
 */