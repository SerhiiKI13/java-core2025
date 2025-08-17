package homework.homework2.work2;

public class Main {
    public static void main(String[] args) {

        Owner owner = new Owner("Serhii", "123-456-789");
        Manufacturer manufacturer = new Manufacturer("Toyota", "Japan");

        Car car = new Car("Yaris", new Engine(90, "Diesel"), owner, manufacturer);
        System.out.println(car);

    }
}
