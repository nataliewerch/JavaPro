package homework2.level1.zoo;

public class Cow extends Herbivore{

    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
