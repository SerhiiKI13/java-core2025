package homework.homework2.work3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Skills> skills = new ArrayList<>();
        skills.add(new Skills("java",1));
        skills.add(new Skills("java",2));
        skills.add(new Skills("java",3));
        User user = new User(
                1,
                "Serhii",
                "Thirteen",
                "thirteen@gmail.com",
                22,
                Gender.MALE,
                skills,
                new Car("toyota",2021,250)

        );
        System.out.println(user);
    }
}
