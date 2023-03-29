package homework2.level1.zoo;

public class Dog extends Predator{

    @Override
    public boolean voice() {
        super.voice();
        return false;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
