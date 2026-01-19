package DP2;

public class MessageWithImageRenderingStrategy extends RenderingStrategy {

    @Override
    public String render() {
        MessageWithImage message = (MessageWithImage) super.sendable;
        return String.format("%s: %s [attachment-image]: %s", message.getSender().getUsername(),
                message.getContent(), message.getImage().getPath());

    }

}
