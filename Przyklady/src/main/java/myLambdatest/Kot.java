package myLambdatest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
interface CheckKot{boolean test(Kot kot);}

class Kot {
    public static void main(String[] args) {
        List<Kot> listaKotow = new ArrayList<>();
        makeList(listaKotow);
       viewKoty(listaKotow, kot -> kot.getWeight()>=2, kot -> kot.toString()
       , System.out::println);

    }

    String name;
    double weight;
    int age;
    Sex gender;

    @Override
    public String toString() {
        return "Kot{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    Kot(String name, double weight, int age, Sex gender) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    enum Sex {HE, SHE}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public void printKot() {
        System.out.println(this.toString());
    }

    public static void makeList(List<Kot> listaKotow) {
        Kot kot1 = new Kot("Misia", 4.5, 3, Sex.SHE);
        Kot kot2 = new Kot("Kicia", 0.45, 1, Sex.SHE);
        Kot kot3 = new Kot("Misia", 1.5, 1, Sex.SHE);
        Kot kot4 = new Kot("Tosia", 5.0, 2, Sex.SHE);
        Kot kot5 = new Kot("Benek", 3.5, 4, Sex.HE);
        Kot kot6 = new Kot("Zenek", 2.5, 2, Sex.HE);
        Kot kot7 = new Kot("Mrauczek", 1.5, 1, Sex.HE);
        listaKotow.add(kot1);
        listaKotow.add(kot2);
        listaKotow.add(kot3);
        listaKotow.add(kot4);
        listaKotow.add(kot5);
        listaKotow.add(kot6);
        listaKotow.add(kot7);
    }

    public static void viewKoty(Iterable<Kot> source, CheckKot checker, Function<Kot, String> mapper, Consumer <String> block){
        for (Kot kot : source) {
            if (checker.test(kot)) {
                String result = mapper.apply(kot);
                block.accept(result);
            }
        }
    }
}