package homework.one.task.one;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Антон Антонович Антонов", 45);
        person1.fullName = "Анна Ивановна";
        person1.age = 33;

        person1.move();
        person2.move();
        person1.talk();
        person2.talk();

    }
}
