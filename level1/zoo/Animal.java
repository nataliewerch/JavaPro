package homework2.level1.zoo;

public abstract class Animal {
    protected String name;
    protected String color;

    public Animal() {
    }
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void jump(int length) {

    }

    public abstract  void voice();

   public abstract void eat(String food);


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


