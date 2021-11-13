package message_sender;

import facebook.FacebookUser;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyFacebookUser extends User{
    private MyFacebookUser(){}

    public static MyFacebookUser createMyFacebookUser(FacebookUser facebookUser) {
        MyFacebookUser myFacebookUser = new MyFacebookUser();
        myFacebookUser.convertAttributes(facebookUser.getEmail(), facebookUser.getUserCountry(), facebookUser.getUserActiveTime());
        return myFacebookUser;
    }
}
