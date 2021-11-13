import facebook.FacebookUser;
import message_sender.MessageSender;
import message_sender.MyFacebookUser;
import message_sender.MyTwitterUser;
import twitter.TwitterUser;

public class Main {
    public static void main(String[] args) {
        FacebookUser facebookUser = new FacebookUser("facebookuser@email.com", "USA", "1 hour ago");
        TwitterUser twitterUser = new TwitterUser("twitteruser@email.com", "CUBA", "5 hours ago");
        MessageSender messageSender = new MessageSender();
        messageSender.send("Foo", MyTwitterUser.createMyTwitterUser(twitterUser));
        messageSender.send("Bar", MyFacebookUser.createMyFacebookUser(facebookUser));
    }
}
