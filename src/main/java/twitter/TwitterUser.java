package twitter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TwitterUser {
    private String userMail;
    private String userCountry;
    private String lastActiveTime;

    public TwitterUser(String userMail, String userCountry, String lastActiveTime) {
        this.userMail = userMail;
        this.userCountry = userCountry;
        this.lastActiveTime = lastActiveTime;
    }
}
