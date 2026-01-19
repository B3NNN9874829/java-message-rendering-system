package DP2;

public class MessageWithVideoRenderingStrategy extends RenderingStrategy{

    @Override
    public String render() {
        MessageWithVideo message = (MessageWithVideo) super.sendable;
        return String.format("%s: %s [attachment-video]: %s", message.getSender().getUsername(),
                message.getContent(), message.getVideo().getPath());
    }
    
}
