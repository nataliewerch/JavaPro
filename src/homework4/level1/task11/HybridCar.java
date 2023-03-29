package homework4.level1.task11;

public class HybridCar extends Auto implements AutoService{


    public HybridCar(String modelCar, String yearOfRelease, String brandCar) {
        super(modelCar, yearOfRelease, brandCar);
    }

    @Override
    void drive() {
        System.out.println("Я еду на гибридном авто ");
    }

    @Override
    void breakingDown() {

    }

    @Override
    void startTheCar() {

    }

    @Override
    public void repairOfCars() {

    }

    @Override
    public void changeTires() {

    }
}
