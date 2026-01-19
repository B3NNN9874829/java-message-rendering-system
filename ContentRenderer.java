package DP2;

import javax.swing.Renderer;

public class ContentRenderer {
    private Sendable sendable;

    public ContentRenderer(Sendable sendable) {
        this.sendable = sendable;
    }

    public String render(RenderingStrategy strategy) {
        strategy.setSendable(sendable);
        return strategy.render();
    }
}
