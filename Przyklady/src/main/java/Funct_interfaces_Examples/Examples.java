package Funct_interfaces_Examples;


import java.util.Calendar;
import java.util.function.*;

class Examples {


    // Function<T,R> {R apply(T t);} interfejs przyjmuje T, przekszta³ca na R metod¹ apply(T), zwraca R
    //posiada metode andThen() compose() identity()
    static Function<Integer, String> add_5_andChangeToString = x -> String.valueOf(x + 7);
    Function<Integer, String> changeToString = String::valueOf;

    // Consumer<T> {void accept(T t);} interfejs przyjmuje T, wykonuje na nim dzia³anie metod¹ accept(T) i zwraca void
    //posiada metode andThen()
    static Consumer<Integer> add_10 = System.out::println;

    // Supplier<T> {T get();}  interfejs przyjmuje nic, zwraca T metod¹ get()
    static Supplier<String> returnSomething = () -> "Return this";

    // Predicate<T> {boolean test(T t);}  interfejs przyjmuje T, zwraca boolean metod¹ test(T)
    //posiada metody and() or() negate()
    static Predicate<String> testSomething = x -> x.startsWith("A");

    // UnaryOperator<T> extends Function<T,T> {static <T> UnaryOperator<T> identity(){ return t->t}}
    // interfejs przyjmuje T, zwraca T metod¹ apply(T)
    //posiada metody dziedziczone od Function andThen() compose() identity()
    static UnaryOperator<Integer> identityAdd_5 = x -> x + 78;

    //dowolny w³asny interfejs funkcyjny (adnotacja i jedna metoda(lub pozosta³e default lub static))
//interfejs przyjmuje datê, zwraca boolean
    @FunctionalInterface
    public interface CheckAfterNoon<Calendar> {
        boolean checkHour(Calendar now);
    }
    static CheckAfterNoon<Calendar> isAfternoon = x-> {return (Calendar.HOUR_OF_DAY<12)?true:false;};

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int a = 5;

        System.out.println(now);
        System.out.println(add_5_andChangeToString.apply(a));
        add_10.accept(a);
        System.out.println(returnSomething.get());
        System.out.println(testSomething.test("Adam"));
        System.out.println(identityAdd_5.apply(a));
        System.out.println(isAfternoon.checkHour(now));
    }
}
