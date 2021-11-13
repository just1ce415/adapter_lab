package message_sender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {
   private String mail;
   private String country;
   private String lastActiveTime;
   public void convertAttributes(String mail, String country, String lastActiveTime) {
      this.mail = mail;
      this.country = country;
      this.lastActiveTime = lastActiveTime;
   }
}
