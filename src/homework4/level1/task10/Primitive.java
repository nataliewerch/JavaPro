package homework4.level1.task10;

public class Primitive {
    public static void main(String[] args) {
        Primitive pr = new Primitive();
        System.out.println(pr.addition(77));

    }

    int addition (int i){
        i += 5;
        return i;
    }
}