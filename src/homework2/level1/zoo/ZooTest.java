package homework2.level1.zoo;

public class ZooTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.eat("milk");
        Cow cow = new Cow();
        cow.eat("gras");
        Lamb lamb = new Lamb();
        lamb.eat("meat");
        cat.jump(2, 3);
        Animal [] animals = new  Animal[4];
        animals[0] = cow;
        animals[1] = dog;
        animals[2] = cat;
        animals[3] = lamb;
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
            System.out.println(animals[i].voice());
            System.out.println("------------");
        }







    }


}
