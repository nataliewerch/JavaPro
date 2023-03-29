package homework4.level1.task11;

public abstract class Auto {
   protected String yearOfRelease;
    protected String brandCar;
   protected String modelCar;
   protected String winterTires;
   protected String summerTires;
    final int TIRE = 4;
    public Auto(String modelCar, String yearOfRelease, String brandCar) {
        this.yearOfRelease = yearOfRelease;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
    }

    abstract void drive();
    abstract void breakingDown();

    abstract void startTheCar();



}
