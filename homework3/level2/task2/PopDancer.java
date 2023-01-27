package homework3.level2.task2;

public class PopDancer implements Dancable {

    private String name;

    public PopDancer() {
    }

    public PopDancer(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        System.out.println("Я танцую ");
    }

    @Override
    public String toString() {
        return "PopDancer " +
                "= " + name;
    }
}
