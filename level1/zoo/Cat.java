package homework2.level1.zoo;

public class Cat extends Predator{


    public void jump(int a, int b){

        System.out.println("Я прыгаю: " + a + " метра в высоту и  " + b + " в длину");
    }
    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Я ем " + food);

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
