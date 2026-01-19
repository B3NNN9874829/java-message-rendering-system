package DP2;

public class Message implements Sendable{
    private User sender;
    private User reciever;
    private String content;
    
    public Message(User sender, User reciever, String content) {
        this.sender = sender;
        this.reciever = reciever;
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public User getReciever() {
        return reciever;
    }

    public String getContent() {
        return content;
    }
    
   
}
