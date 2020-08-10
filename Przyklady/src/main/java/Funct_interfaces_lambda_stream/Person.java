package Funct_interfaces_lambda_stream;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Person {

    public enum Sex {MALE, FEMALE}

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public Sex getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.birthday.getYear();
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    public String getName() {
        return name;
    }

    LocalDate getBirthday() {
        return birthday;
    }

    //simple select method with low/high range
    public static void printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    //advanced select method, use interface and tester class that implements test method, that returns true, if
    //person is equal to person criteria. Or we can use lambda instead
    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.check(p)) {
                p.printPerson();
            }
        }
    }

    //the method above dont have to use your interface, there is lot of Java functional generic interfaces e.g.
    //interface Predicate<T> {boolean test(T t);} so we can use it
    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    //more elastic version without print method.  With help of another interface
    // we can run all Person methods with result of sort than just limited print rule
    public static void processPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    //when we add another functional interface we can do other things with our result person?
    public static void processPersonsWithFunction(List<Person> roster, Predicate<Person> tester,
                                                  Function<Person, String> mapper, Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
    //generic version of it that accepts, as a parameter, a collection that contains elements of any data type:
    public static <Person, String> void processElements(
            Iterable<Person> source,
            Predicate<Person> tester,
            Function <Person, String> mapper,
            Consumer<String> block) {
        for (Person p : source) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }


}