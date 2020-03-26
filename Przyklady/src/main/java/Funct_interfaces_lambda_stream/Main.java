package Funct_interfaces_lambda_stream;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static Funct_interfaces_lambda_stream.Person.*;

class Main {
    public static void main(String[] args) {
        List<Person> roster = new ArrayList<>();
        fillPersonsList(roster);

        System.out.println("1.simple method pick Persons from list....................");
        printPersonsWithinAgeRange(roster, 20, 40);
        System.out.println("2...method with our interface.............................");
        printPersons(roster, new CheckPersonEligibleForSelectiveService());
        System.out.println("3.....method with lambda instead of class.................");
        printPersons(roster, (Person p) -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 20
                && p.getAge() <= 40
        );
        System.out.println("4.......method with lambda and with Predicate interface...");
        printPersonsWithPredicate(roster, (Person p) -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 20
                && p.getAge() <= 40
        );
        System.out.println("5.........method with Predicate and Consumer interface....");
        processPersons(
                roster,
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 20
                        && p.getAge() <= 40,
                p -> p.printPerson()
        );
        System.out.println("6...........method with Predicate, Function and Consumer..");
        processPersonsWithFunction(
                roster,
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 20
                        && p.getAge() <= 40,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
        System.out.println("7...method with Iterable, Predicate, Function and Consumer");
        processElements(
                roster,
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 20
                        && p.getAge() <= 40,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
//Use Aggregate Operations That Accept Lambda Expressions as Parameters
//Obtain a source of objects 	                                Stream<E> stream()
//Filter objects that match a Predicate object 	                Stream<T> filter(Predicate<? super T> predicate)
//Map objects to another value as specified by Function object 	<R> Stream<R> map(Function<? super T,? extends R> mapper)
//Perform an action as specified by a Consumer object 	        void forEach(Consumer<? super T> action)
        System.out.println("8...stream");
        roster
                .stream()
                .filter(
                        p -> p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 20
                                && p.getAge() <= 40)
                .map(p -> p.getEmailAddress())
                .forEach(email -> System.out.println(email));
    }

    public static void fillPersonsList(List<Person> roster) {
        Person one = new Person("Adam", LocalDate.of(1979, Month.SEPTEMBER, 01), Person.Sex.MALE, "adam@gmail.com");
        Person two = new Person("Ewa", LocalDate.of(1989, Month.SEPTEMBER, 16), Person.Sex.FEMALE, "Ewa@gmail.com");
        Person three = new Person("Peter", LocalDate.of(1999, Month.SEPTEMBER, 20), Person.Sex.MALE, "Peter@gmail.com");
        Person four = new Person("Kot", LocalDate.of(1925, Month.SEPTEMBER, 14), Person.Sex.FEMALE, "kot@gmail.com");
        roster.add(one);
        roster.add(two);
        roster.add(three);
        roster.add(four);
    }
}