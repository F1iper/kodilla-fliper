package kodilla.testing.stream;

import kodilla.testing.stream.forum.ForumUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ForumUser u1 = new ForumUser("ramboo", "John Rambo", "Vietnam");
        ForumUser u2 = new ForumUser("ramboo", "John Rambo", "miami");
        ForumUser u3 = new ForumUser("ramboo", "John Rambo", "warsaw");
        ForumUser u4 = new ForumUser("ramboo", "John Rambo", "Hong Kong");

        List<ForumUser> forumUsers = new ArrayList<>();
        forumUsers.add(u1);
        forumUsers.add(u2);
        forumUsers.add(u3);
        forumUsers.add(u4);


    }
}