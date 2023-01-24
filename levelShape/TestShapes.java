package levelShape;

public class TestShapes {
    public static void main(String[] args) {
       /* Circle circle = new Circle();
        circle.color = "Green";
        circle.radius = 5;
        circle.setSize(3);

        Triangle triangle = new Triangle();
        triangle.color = "Red";
        triangle.setSize(5);
        triangle.firstSide = 4;
        triangle.secondSide = 5;
        triangle.thirdSide = 3;

        Square square = new Square();
        square.color = "Yellow";
        square.setSize(7);
        square.width = 4;

        Circle simpleCircle = new Circle(3, "Green", 3);
        Square simpleSquare = new Square(7, "Yellow", 4);
        Triangle simpleTriangle = new Triangle(5, "Red", 5, 4, 3);



       System.out.println(circle);
        System.out.println(triangle);
        System.out.println(square);

        System.out.println(simpleCircle);
        System.out.println(simpleSquare);
        System.out.println(simpleTriangle);

        System.out.println(circle instanceof Object);
        System.out.println(circle instanceof Shape);
        System.out.println(circle instanceof Dot);

        circle.draw();
        triangle.draw();
        square.draw();

        Dot dot = new Dot();
        dot.draw();

        Shape.sayShape();



        circle.calculateArea();
        circle.calculatePerimeter();
        triangle.calculateArea();
        triangle.calculatePerimeter();
        square.calculateArea();
        square.calculatePerimeter();*/

        ShapeGenerator shapeGenerator = new ShapeGenerator();
        shapeGenerator.generate();







    }
}
