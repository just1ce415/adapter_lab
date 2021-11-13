package message_sender;

import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {

    @Test
    void createMyTwitterUser() {
        MyTwitterUser myTwitterUser = MyTwitterUser.createMyTwitterUser(new TwitterUser("useremail", "Germany", "2 hours ago"));
        assertEquals("Germany", myTwitterUser.getCountry());
        assertEquals("2 hours ago", myTwitterUser.getLastActiveTime());
    }
}