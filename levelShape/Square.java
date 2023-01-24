package levelShape;

public class Square extends Shape{
    int width;

    public Square(int size, String color, int width) {
        super(size, color);
        this.width = width;
    }

    public Square() {

    }

    @Override
    public void calculateArea() {
        if (width > 0){
            double areaOfSquare = Math.pow(width, 2);
            System.out.printf("Площадь квадрата равна %.2f%n", areaOfSquare);
        }else {
            System.out.println("Некорректно задана сторона квадрата");
        }

    }

    @Override
    public void calculatePerimeter() {
        if (width > 0){
            double perimeterOfSquare = 2 * width;
            System.out.printf("Периметр квадрата равен %.2f%n", perimeterOfSquare);
        }else {
            System.out.println("Некорректно задана сторона квадрата");
        }

    }

    @Override
    public void draw() {
        System.out.println("Я рисую квадрат");

    }

    @Override
    public void draw(String type) {

    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
