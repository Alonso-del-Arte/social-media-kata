package socialmedia.db;

import socialmedia.Post;
import socialmedia.User;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MockDatabaseTest {

    private static final String ALICE_USER_NAME = "@ourChartAlice";

    private static final String ALICE_DISPLAY_NAME = "Alice Pieszecki";

    private static final String BOB_USER_NAME = "@starQuarterBob";

    private static final String BOB_DISPLAY_NAME = "Bob Gomez";

    private static final String CHARLIE_USER_NAME = "@charlie_nguyen";

    private static final String CHARLIE_DISPLAY_NAME = "Charlie Nguyen";

    private static final User USER_ALICE = new User(ALICE_DISPLAY_NAME,
            ALICE_USER_NAME);

    private static final User USER_BOB = new User(BOB_DISPLAY_NAME,
            BOB_USER_NAME);

    private static final User USER_CHARLIE = new User(CHARLIE_DISPLAY_NAME,
            CHARLIE_USER_NAME);

    @Test
    void testAddedUsersCanBeRetrieved() {
        MockDatabase database = new MockDatabase();
        Set<User> expected = new HashSet<>();
        expected.add(USER_ALICE);
        expected.add(USER_BOB);
        expected.add(USER_CHARLIE);
        Set<User> actual = new HashSet<>();
        for (User user : expected) {
            database.add(user);
            actual.add(database.retrieve(user.userName));
        }
        assertEquals(expected, actual);
    }

}
