package lessons2.demo3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SuperUser su = new SuperUser();
        su.greeting();

        User user = new SuperUser();
        SuperUser su2 = (SuperUser) user;
        su2.foo();

        ArrayList<User> users = new ArrayList<>();
        users.add(su);
        users.add(su2);


    }
}
