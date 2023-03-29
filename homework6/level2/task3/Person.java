package homework6.level2.task3;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String surname;
    private String name;
    private int phoneNumber;



    public Person(String surname, String name, int phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public String toString() {
        return surname + "    " + name + "   " + phoneNumber + System.lineSeparator();
    }


}
