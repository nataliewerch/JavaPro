package homework2.level1.zoo;

public class Lamb extends Herbivore{

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
        return "Lamb{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
