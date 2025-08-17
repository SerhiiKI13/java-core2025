package homework.homework2.work4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Post post = new Post(1,1,"feafasfasf","sdasdasda");
    Post post1 = new Post(1,2,"dasdasfeafasfasf","adsassdasdasda");
    Post post2 = new Post(2,3,"adsassdasdasda","adsassdasdasda");
    Post post3 = new Post(3,4,"adsassdasdasda","adsassdasdasda");

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(post);
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);



        Comment comment = new Comment(1,1,"sergr","sad@fafas.sad","sadasfdjasfhasj");
        Comment comment1 = new Comment(1,2,"sdasf","safasf@gmal.cp","sdasdasdasd");
        Comment comment2 = new Comment(2,1,"fasf","sdasdasd@afss,asa","asdasdasdasd");
        Comment comment3 = new Comment(2,2,"fasf","sdasdasd@afss,asa","asdasdasdasd");
        Comment comment4 = new Comment(3,1,"fasf","sdasdasd@afss,asa","asdasdasdasd");
        Comment comment5 = new Comment(3,2,"fasf","sdasdasd@afss,asa","asdasdasdasd");


        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(comment);
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        comments.add(comment4);
        comments.add(comment5);

        ArrayList<Post> poss = new ArrayList<>();
        for (Post p : posts) {
            ArrayList<Comment> commentsForPost = new ArrayList<>();
            for (Comment c : comments) {
                   if (p.getId() == c.getPostId()){
                       commentsForPost.add(c);


                }
            }
            p.addComment(commentsForPost);

            poss.add(p);

        }

        System.out.println(poss);

    }
}
