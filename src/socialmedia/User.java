package socialmedia;

public class User {

    public String displayName;

    public final String userName;

    @Override
    public String toString() {
        return this.displayName + ' ' + this.userName;
    }

    public User(String display, String id) {
        this.displayName = display;
        this.userName = id;
    }

}
