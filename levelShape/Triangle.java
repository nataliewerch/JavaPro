package levelShape;

public class Triangle extends Shape{
    int firstSide;
    int secondSide;
    int thirdSide;

    public Triangle(int size, String color, int firstSide, int secondSide, int thirdSide) {
        super(size, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    public Triangle() {

    }

    @Override
    public void calculateArea() {
        if (firstSide > 0 && secondSide > 0 && thirdSide > 0 && (firstSide + secondSide) > thirdSide && (secondSide + thirdSide) > firstSide && (firstSide + thirdSide) > secondSide) {
            double p = (firstSide + secondSide + thirdSide) / 2;
            double areaOfTriangle = Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
            System.out.printf("Площадь треугольника равна %.2f%n", areaOfTriangle);
        }else {
            System.out.println("Некорректно заданы стороны треугольника");
        }
    }

    @Override
    public void calculatePerimeter() {
        if (firstSide > 0 && secondSide > 0 && thirdSide > 0 && (firstSide + secondSide) > thirdSide && (secondSide + thirdSide) > firstSide && (firstSide + thirdSide) > secondSide) {
            double perimeterOfTriangle = firstSide + secondSide + thirdSide;

            System.out.printf("Периметр треугольника равен %.2f%n", perimeterOfTriangle);
        }else {
            System.out.println("Некорректно заданы стороны треугольника");
        }


    }

    @Override
    public void draw() {
        System.out.println("Я рисую треугольник");
    }

    @Override
    public void draw(String type) {

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firsSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
