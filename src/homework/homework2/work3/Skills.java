package homework.homework2.work3;

public class Skills {
    private String title;
    private int experience;

    public Skills() {
    }

    public Skills(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "title='" + title + '\'' +
                ", experience=" + experience +
                '}';
    }
}
