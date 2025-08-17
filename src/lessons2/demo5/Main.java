package lessons2.demo5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Horse horse = new Horse();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(horse);
        animals.add(bird);

        Animal animal = animals.get(0);
        animal.sygnalize();
    }
}
