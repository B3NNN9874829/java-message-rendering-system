package DP2;

public class MessageWithImage extends SendableDecorator {
    public MessageWithImage(Sendable wrappee) {
        super(wrappee);
        // TODO Auto-generated constructor stub
    }

    private Image image;

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

}
