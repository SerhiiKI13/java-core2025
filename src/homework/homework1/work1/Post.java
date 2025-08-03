package homework.homework1.work1;

public class Post {
    private int Userid;
    private int id;
    private String title;
    private String body;

    public Post() {
    }

    public Post(int userid, int id, String title, String body) {
        Userid = userid;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "Userid=" + Userid +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
