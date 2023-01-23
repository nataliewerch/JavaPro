package homework2.level1.zoo;

public class Predator extends Animal {


    @Override
    public void voice() {

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
