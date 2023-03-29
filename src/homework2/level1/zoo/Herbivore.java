package homework2.level1.zoo;

public class Herbivore extends Animal{


    @Override
    public boolean voice() {
        System.out.println("Я такое не ем");

        return false;
    }

    @Override
    public void eat(String food) {
        if (food.equals("meat")){
            voice();
        }

    }


    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
