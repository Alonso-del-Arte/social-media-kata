package socialmedia;

import java.util.Random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static final Random RANDOM = new Random();

    @Test
    void testToString() {
        String displayName = "Jimmy Gonzalez";
        String userNamePart = "@jimmy";
        int year = 1950 + RANDOM.nextInt(50);
        String userName = userNamePart + year;
        User user = new User(displayName, userName);
        String expected = displayName + " " + userName;
        String actual = user.toString();
        assertEquals(expected, actual);
    }

}
