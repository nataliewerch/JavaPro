package levelShape;

public class Cube extends Shape3D{
    int length;

    public Cube(int size, String color, int length) {
        super (size, color);
        this.length = length;
    }

    public Cube(int length) {
        super();
        this.length = length;
    }
    public Cube() {

    }


    @Override
    public void draw() {
        System.out.println("Я рисую куб");
    }

    @Override
    public void draw(String type) {

    }

    @Override
    public void calculateArea() {
        if (length > 0) {
            int areaOfCube = 6 * (int)Math.pow(length, 2);
            System.out.println("Площадь куба равна " + areaOfCube);
        }else {
            System.out.println("Некорректно задана сторона куба");
        }
    }

    @Override
    public void calculatePerimeter() {
        if (length > 0) {
        int perimeterOfCube = 12 * length;
            System.out.println("Периметр куба равен " + perimeterOfCube);
    }else {
            System.out.println("Некорректно задана сторона куба");
        }
    }

    @Override
    public void volume() {
            if (length > 0) {
                int volumeOfCube = (int)Math.pow(length, 3);
                System.out.println("Объем куба равен " + volumeOfCube);
            }else{
                System.out.println("Некорректно задана сторона куба");
        }
    }

    @Override
    public String toString() {
        return "Cube{" +
                "length=" + length +
                ", size=" + size +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
