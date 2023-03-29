package homework6.level2.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListPerson {
    Person person1 = new Person("Setin", "Ivan", 7788893);
    Person person2 = new Person("Setin", "Anton", 7788676);
    Person person3 = new Person("Bred", "Stepan", 7779375);
    Person person4 = new Person("Bred", "Artur", 77945622);
    Person person5 = new Person("Klumb", "Timo", 77945622);
    Person person6 = new Person("Sidorov", "Leon", 77945622);
    Person person7 = new Person("Smirnov", "Fedor", 77945622);
    Person person8 = new Person("Shwarz", "Leo", 77945622);

    List<Person> persons = Arrays.asList(person1, person2, person3, person4, person5, person6, person7, person8);


    public void findNumber(List<Person> persons, String surname) {
        for (int i = 0; i < persons.size(); i++) {
            if (surname.equals(persons.get(i).getSurname())) {
                System.out.println(persons.get(i).getPhoneNumber());
            }
        }
    }

}




