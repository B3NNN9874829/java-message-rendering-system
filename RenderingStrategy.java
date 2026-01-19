package DP2;

public abstract class RenderingStrategy {
    protected Sendable sendable;

    public void setSendable(Sendable sendable) {
        this.sendable = sendable;
    }
    public abstract String render();
}
