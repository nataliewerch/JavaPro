package levelShape;

public class Rectangle extends Shape{
    int width;
    int length;

    public Rectangle(int size, String color, int width, int length) {
        super(size, color);
        this.width = width;
        this.length = length;
    }

    public Rectangle(int size, String color) {
        super(size, color);
    }

    @Override
    public void draw() {
        System.out.println("Я рисую прямоугольник");

    }

    @Override
    public void draw(String type) {

    }

    public Rectangle() {
    }

    @Override
    public void calculateArea() {
        if (width > 0 && length > 0){
            double areaOfRectangle = width * length;
            System.out.printf("Площадь прямоугольникa равна %.2f%n", areaOfRectangle);
        }else {
            System.out.println("Некорректно задана сторона прямоугольникa");
        }
    }

    @Override
    public void calculatePerimeter() {
        if (width > 0 && length > 0){
            double perimeterOfRectangle = 2 * (width + length);
            System.out.printf("Периметр прямоугольникa равен %.2f%n", perimeterOfRectangle);
        }else {
            System.out.println("Некорректно задана сторона прямоугольникa");
        }

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
