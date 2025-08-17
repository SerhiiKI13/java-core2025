package homework.homework2.work1;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Serhii",
                "ThirTeen",
                "thirteen@gmail.com",
                new Address(
                        "Kulas Light",
                        "Apt. 556",
                        "Gwenborough",
                        "92998-3874",
                        new Geo(
                                "-37.3159",
                                "81.1496"
                        )
                ),
                "1-770-736-8031 x56442",
                "hildegard.org",
                new Company(
                        "Romaguera-Crona",
                        "Multi-layered client-server neural-net",
                        "harness real-time e-markets"
                )

        );


        System.out.println(user);
    }
}
