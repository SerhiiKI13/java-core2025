package lessons1.demo4;

public class Main {
    public static void main(String[] args) {
        User katya = new User(1, "katya", true, 50.2);
        System.out.println(katya);
        katya.setWeight(67);
        System.out.println(katya);
    }
}
