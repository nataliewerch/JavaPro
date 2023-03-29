package levelShape;

import java.util.Random;

public class ShapeGenerator {


    public void generate() {
        Random ran = new Random();
        int random = ran.nextInt(6);
        if (random == 0) {
            Circle circle = new Circle(4,"Red", 3);
            circle.draw();
            circle.calculateArea();
            circle.calculatePerimeter();
        }
        if (random == 1) {
            Square square = new Square(5, "Blue", 6);
            square.draw();
            square.calculatePerimeter();
            square.calculateArea();
        }
        if (random == 2) {
            Triangle triangle = new Triangle(3, "Yellow", 3, 3, 3);
            triangle.draw();
            triangle.calculatePerimeter();
            triangle.calculateArea();
        }
        if (random == 3) {
            Rectangle rectangle = new Rectangle(4, "Gray", 5, 6);
            rectangle.draw();
            rectangle.calculateArea();
            rectangle.calculatePerimeter();
        }
        if (random == 4) {
           Cube cube = new Cube(3, "Black", 5);
            cube.draw();
            cube.calculateArea();
            cube.calculatePerimeter();
            cube.volume();
        }
        if (random == 5) {
            Cylinder cylinder = new Cylinder(5, "Lila", 10, 5);
            cylinder.draw();
            cylinder.calculateArea();
            cylinder.volume();
        }


    }
}
