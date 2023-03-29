package levelShape;

public abstract class Shape {
    protected int size;
    String color;

    public static void sayShape(){
        System.out.println("Shape");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Shape(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public abstract void draw();
    public abstract void draw(String type);
    protected void printSize(){
        System.out.printf("size is %d%n", size);
    }
    public Shape() {
        System.out.println(this);

    }
    public abstract void calculateArea();
    public abstract void calculatePerimeter();

}
