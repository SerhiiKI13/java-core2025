package lessons2.demo2;

public class Helper {

    public String extractToken(User user) {
        Role role = user.getRole();
        return role.getToken();
    }
}
