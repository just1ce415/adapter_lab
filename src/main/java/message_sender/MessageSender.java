package message_sender;

public class MessageSender {
    public void send(String text, User user){
        System.out.println("Message: " + text + "\n" +
                "was sent to " + user.getMail() + "\n" +
                ", " + user.getCountry());
    }
}
