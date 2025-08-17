package homework.homework2.work1;

public class Company {
    private String name;
    private String cathPhrase;
    private String bs;

    public Company() {
    }

    public Company(String name, String cathPhrase, String bs) {
        this.name = name;
        this.cathPhrase = cathPhrase;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCathPhrase() {
        return cathPhrase;
    }

    public void setCathPhrase(String cathPhrase) {
        this.cathPhrase = cathPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cathPhrase='" + cathPhrase + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }
}
