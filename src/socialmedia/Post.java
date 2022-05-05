package socialmedia;

import java.time.OffsetDateTime;

public class Post {

    public final User postingUser;

    public final OffsetDateTime postingTime;

    public Post(User user, OffsetDateTime dateTime) {
        this.postingUser = user;
        this.postingTime = dateTime;
    }

}
