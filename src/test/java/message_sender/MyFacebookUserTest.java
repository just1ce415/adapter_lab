package message_sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {

    @Test
    void createMyFacebookUser() {
        MyFacebookUser myFacebookUser = MyFacebookUser.createMyFacebookUser(new FacebookUser("useremail", "France", "1 hour ago"));
        assertEquals("France", myFacebookUser.getCountry());
        assertEquals("1 hour ago", myFacebookUser.getLastActiveTime());
    }
}