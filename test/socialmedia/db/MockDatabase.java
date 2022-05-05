package socialmedia.db;

import socialmedia.Post;
import socialmedia.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MockDatabase {

    private Set<Post> posts = new HashSet<>();

    private Map<String, User> users = new HashMap<>();

    void add(User user) {
        this.users.put(user.userName, user);
    }

    // TODO: Write tests for this
    void add(Post post) {
        //
    }

    User retrieve(String userName) {
        return this.users.get(userName);
    }

}
