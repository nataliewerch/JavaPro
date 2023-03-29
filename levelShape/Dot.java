package levelShape;

public final class Dot extends Circle{

    @Override
    public void draw() {
        System.out.println("I draw dot");
    }

    @Override
    public void draw(String type) {
        System.out.println("I draw dot " + type);
    }
}
