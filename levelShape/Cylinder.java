package levelShape;

public class Cylinder extends Shape3D{

    int height;
    int radius;

    public Cylinder(int size, String color, int height, int radius) {
        super(size, color);
        this.height = height;
        this.radius = radius;
    }

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public Cylinder() {
    }


    @Override
    public void draw() {
        System.out.println("Я рисую цилиндр");

    }

    @Override
    public void draw(String type) {

    }

    @Override
    public void calculateArea() {
        if (height > 0 && radius > 0){
            double areaOfCylinder = 2 * Math.PI * radius * (radius + height);
            System.out.printf("Площадь цилиндра равна %.2f%n " + areaOfCylinder);
        }else {
            System.out.println("Некорректно заданы значения");
        }

    }
    @Override
    public void calculatePerimeter() {

    }

    @Override
    public void volume() {
        if (height > 0 && radius > 0){
            double volumeOfCylinder = Math.PI * Math.pow(radius, 2) * height;
            System.out.printf("Объем цилиндра равен %.2f%n " + volumeOfCylinder);
        }else {
            System.out.println("Некорректно заданы значения");
        }
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", size=" + size +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
