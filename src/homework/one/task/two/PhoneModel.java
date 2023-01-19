package homework.one.task.two;

public class PhoneModel {
    public static void main(String[] args) {
        Phone iphone = new Phone("+4917358554945", "Iphone 14", 172);
        Phone samsung = new Phone("+4917952433788","Samsung Galaxy S22 Ultra", 228);
        Phone xiaomi = new Phone("+4915783237330","Xiaomi Redmi Note 11", 179);
        System.out.printf("%s%n%s%n%s%n", iphone, samsung, xiaomi);

        iphone.getNumber();
        samsung.getNumber();
        xiaomi.getNumber();

        iphone.receiveCall("Ivan");
        System.out.println(iphone.getNumber());
        samsung.receiveCall("Anton");
        System.out.println(samsung.getNumber());
        xiaomi.receiveCall("Oleg");
        System.out.println(xiaomi.getNumber());

    }
}
