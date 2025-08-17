package homework.homework2.work2;

public class Car {
    private String model;
    private Engine engine;
    private Owner owner;
    private Manufacturer manufacturer;

    public Car() {
    }

    public Car(String model, Engine engine, Owner owner, Manufacturer manufacturer) {
        this.model = model;
        this.engine = engine;
        this.owner = owner;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", owner=" + owner +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
