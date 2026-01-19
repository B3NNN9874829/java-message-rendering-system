package DP2;

import java.util.List;

import javax.xml.crypto.Data;

public class App {
    private User user;

    public void login(String username) {
        user = Database.connect().getUserByUsername(username);
    }

    public void register(String username) {
        Database.connect().addUser(new User(username));
    }

    public void sendMessage(String recieverusername, String content) {
        User reciever = Database.connect().getUserByUsername(recieverusername);
        Database.connect().addSendable(new Message(user, reciever, content));
    }

    public void sendMessage(String recieverusername, String content, Image image) {
        User reciever = Database.connect().getUserByUsername(recieverusername);

        Message msg = new Message(user, reciever, content);

        MessageWithImage mwi = new MessageWithImage(msg);
        mwi.setImage(image);
        Database.connect().addSendable(mwi);
    }

    public void sendMessage(String recieverUsername, String content, Video video) {
        User reciever = Database.connect().getUserByUsername(recieverUsername);

        Message msg = new Message(user, reciever, content);
        MessageWithVideo mwv = new MessageWithVideo(msg);
        mwv.setVideo(video);
        Database.connect().addSendable(mwv);
    }

    public void showMessages() {
        List<Sendable> sendables = Database.connect().getSendablesByUser(user);

        for (Sendable s : sendables) {
            ContentRenderer cr = new ContentRenderer(s);
            if (s instanceof Message) {
                System.out.println(cr.render(new MessageRenderingStrategy()));
            } else if (s instanceof MessageWithImage) {
                System.out.println(cr.render(new MessageWithImageRenderingStrategy()));
            } else if (s instanceof MessageWithVideo) {
                System.out.println(cr.render(new MessageWithVideoRenderingStrategy()));
            }
        }
    }
}
