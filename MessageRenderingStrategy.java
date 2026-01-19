package DP2;

public class MessageRenderingStrategy extends RenderingStrategy {

    @Override
    public String render() {
        Message message = (Message) super.sendable;
        return String.format("%s: %s", message.getSender().getUsername(), message.getContent());
    }

}
