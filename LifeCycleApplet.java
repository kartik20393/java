import java.applet.Applet;
import java.awt.Graphics;

public class LifeCycleApplet extends Applet {
    public void init() {
        System.out.println("Applet initialized");
    }

    public void start() {
        System.out.println("Applet started");
    }

    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 50, 50);
    }

    public void stop() {
        System.out.println("Applet stopped");
    }

    public void destroy() {
        System.out.println("Applet destroyed");
    }
}
