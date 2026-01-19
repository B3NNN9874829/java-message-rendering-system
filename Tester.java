package DP2;

public class Tester {

    public static void main(String[] args) {
        App app1 = new App();
        app1.register("james");
        app1.login("james");

        App app2 = new App();
        app2.register("harry");
        app2.login("harry");

        app1.sendMessage("harry", "Hi Harry!");
        app2.sendMessage("james", "Oh! Hi! How are you?");
        app1.sendMessage("harry", "Great! But, I'm a little heavier now :p", new Image("./IMG01.png"));
        app2.sendMessage("james", "Check this out! It's a better workout routine, try it!", new Video("./VID41.avi"));
        app1.sendMessage("harry", "Wow! Thanks Harry!");
        app2.showMessages();
    }
}
