package lessons2.demo3;

public class SuperUser extends User {
    private String role;

    public SuperUser() {
    }

    public SuperUser(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public void foo(){

    }
    @Override
    public void greeting() {
        System.out.println("hi");
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "role='" + role + '\'' +
                "} " + super.toString();
    }
}
