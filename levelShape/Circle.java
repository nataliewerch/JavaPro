package levelShape;

public class Circle extends Shape{
    int radius;
    final int tesparam;


    public Circle(int size, String color, int radius) {
        super(size, color);
        this.radius = radius;
        this.tesparam = 1;
    }
    public Circle() {
        this.tesparam = 2;
        System.out.println(this);
    }

    public void startDraw(){
        draw();
        printSize();
    }


    @Override
    public void draw() {

        System.out.println("Я рисую окружность");
    }

    @Override
    public void draw(String type) {

    }


    @Override
    public void calculateArea() {
        if (radius > 0){
            double areaOfCircle = Math.PI * Math.pow(radius, 2);
            System.out.printf("Площадь окружности с радиусом %d = %.2f%n",radius, areaOfCircle);
        }else {
            System.out.println("Некорректно задан радиус окружности");
        }
    }

    @Override
    public void calculatePerimeter() {
        if (radius > 0){
            double perimeterOfCircle = 2 * Math.PI * radius;
            System.out.printf("Периметр окружности равен %.2f%n", perimeterOfCircle);

        }else {
            System.out.println("Некорректно задан радиус окружности");
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", tesparam=" + tesparam +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
