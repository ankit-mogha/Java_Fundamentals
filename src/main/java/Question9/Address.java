package Question9;

import java.util.ArrayList;
import java.util.List;

public class Address {
  public static void listOfCities() {
    List<Person> people = new ArrayList<>();
    people.add(new Person(1, "Person1", "New Delhi", "flat1", "Delhi"));
    people.add(new Person(2, "Person2", "Amritsar", "flat2", "Punjab"));
    people.add(new Person(3, "Person3", "Karnal", "flat3", "Haryana"));
    people.add(new Person(4, "Person4", "Shimla", "flat4", "Himachal Pradesh"));

    people.stream().map(Person::getCity).distinct().forEach(System.out::println);
  }
}
