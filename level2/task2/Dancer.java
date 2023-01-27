package homework3.level2.task2;

public class Dancer implements Dancable {

    private String name;

    public Dancer() {
    }

    public Dancer(String name) {
        this.name = name;
    }


    @Override
    public void dance() {
        System.out.println("Я танцую ");
    }



    @Override
    public String toString() {
        return "Dancer " +
                "= " + name;
    }


}