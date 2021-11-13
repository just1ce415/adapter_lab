package message_sender;

import lombok.Getter;
import lombok.Setter;
import twitter.TwitterUser;

@Getter
@Setter
public class MyTwitterUser extends User{
    private MyTwitterUser(){}

    public static MyTwitterUser createMyTwitterUser(TwitterUser twitterUser) {
        MyTwitterUser myTwitterUser = new MyTwitterUser();
        myTwitterUser.convertAttributes(twitterUser.getUserMail(), twitterUser.getUserCountry(), twitterUser.getLastActiveTime());
        return myTwitterUser;
    }
}
