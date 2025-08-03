package lessons1.demo8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    User vasya = new User(1, "vasya");
    ArrayList<String> skills = vasya.getSkills();
    skills.add("java");
    skills.add("python");
    skills.add("javascript");
        System.out.println(vasya);
        skills.remove(2);
        System.out.println(vasya);
    }
}
