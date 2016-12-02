package tortuga;

import ch.aplu.turtle.Turtle;

public class Brazo extends Thread {

    private Turtle turtle;

    public Brazo(Turtle turtle) {
        this.turtle = turtle;
    }

    public void run() {
    }

    private void name(Turtle t) {
        t.right(90);
        t.forward(10);
        t.right(90);
        t.forward(8);
        t.left(90);
        t.forward(8);
        t.left(90);
        t.forward(8);
        t.right(90);
        t.forward(10);
        t.right(90);
        t.forward(16);
        t.right(90);
        t.forward(8);
        t.left(90);
        t.forward(15);
        t.right(90);
        t.forward(12);
        t.right(90);
        t.forward(15);
        t.left(90);
        t.forward(8);
        t.right(90);
        t.forward(18);

    }

}
