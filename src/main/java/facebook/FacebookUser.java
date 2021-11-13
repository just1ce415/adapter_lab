package facebook;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FacebookUser {
    private String email;
    private String userCountry;
    private String userActiveTime;

    public FacebookUser(String email, String userCountry, String userActiveTime) {
        this.email = email;
        this.userCountry = userCountry;
        this.userActiveTime = userActiveTime;
    }
}
