package myLambdatest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class Main {
    public static void viewKoty(Iterable<Cat> source, CheckCat checker, Function<Cat, String> mapper, Consumer<String> block){
        for (Cat cat : source) {
            if (checker.check(cat)) {
                String result = mapper.apply(cat);
                block.accept(result);
            }
        }
    }

    public static void main(String[] args) {

        List<Cat> listaKotow = Arrays.asList(
                new Cat("Misia", 4.5, 3, Cat.Sex.SHE),
                new Cat("Kicia", 0.45, 1, Cat.Sex.SHE),
                new Cat("Misia", 1.5, 1, Cat.Sex.SHE),
                new Cat("Tosia", 5.0, 2, Cat.Sex.SHE),
                new Cat("Benek", 3.5, 4, Cat.Sex.HE),
                new Cat("Zenek", 2.5, 2, Cat.Sex.HE),
                new Cat("Mrauczek", 1.5, 1, Cat.Sex.HE));



        viewKoty(listaKotow, cat -> cat.getWeight()>=2, cat -> cat.toString()
                , System.out::println);

        System.out.println("ListaKotów _>\nPredicate(wybierzkoty->kot.jest_danym_kotem) _>\n"
                +"Function<wybranykot, wynik funkcji>(wybranykot->wybranykot.poka¿_imiê_kota)>() _>\nConsumer<String>(imiekota->drukuj(imiêkota)) ");

        System.out.println("Stream");
        listaKotow.stream()
                .filter(cat6 -> cat6.getAge() < 3 & cat6.getAge() > 0)
                .map( cat6 -> cat6.getName())
                .forEach(System.out::println);
    }


}
