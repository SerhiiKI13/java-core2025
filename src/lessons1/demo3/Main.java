package lessons1.demo3;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Serhii", true,87.5);
        System.out.println(user);
        User user1 = new User("Vasya", false, 55.5);
        System.out.println(user1);
        User user2 = new User("katya", true, 50.2);
        System.out.println(user2);
    }
}
