package tortuga;

import ch.aplu.turtle.Turtle;
import java.awt.Color;

public class Antena extends Thread {

    private Turtle turtle;

    public Antena(Turtle turtle) {
        this.turtle = turtle;
    }

    public void run() {
        turtle.setPenColor(Color.black);
        turtle.left(90);
        for (int i = 0; i < 26; i++) {
            oval(turtle);
        }
        turtle.left(120);
        for (int i = 0; i < 4; i++) {
            segment(turtle);
        }
        turtle.left(90);
        for (int i = 0; i < 2; i++) {
            segment(turtle);
        }
        turtle.left(90);
        for (int i = 0; i < 4; i++) {
            segment(turtle);
        }
        turtle.hideTurtle();
    }

    private void oval(Turtle t) {
        t.forward(3);
        t.right(15);
    }

    private void segment(Turtle t) {
        t.forward(5);

    }
}
