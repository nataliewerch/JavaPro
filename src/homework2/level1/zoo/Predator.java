package homework2.level1.zoo;

public class Predator extends Animal {


    @Override
    public boolean voice() {

        return false;
    }

    @Override
    public void eat(String food) {

    }

    @Override
    public String toString() {
        return "Predator{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
