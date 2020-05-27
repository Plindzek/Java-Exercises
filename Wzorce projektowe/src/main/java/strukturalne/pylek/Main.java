package strukturalne.pylek;

public class Main {
    /*
     * Widzimy, że pomimo 100 wywołań tworzenia obiektu, obiekt tworzy się tylko raz.
     * W pozostałych 99 przypadkach pobierany jest utworzony już obiekt.
     */

    public static void main(String[] args) throws InterruptedException {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        for(int i = 0; i < 100; i++) {
            flyweightFactory.createRelation("Aga+Krzys");
        }

    }

}
