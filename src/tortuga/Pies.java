package tortuga;

import ch.aplu.turtle.Turtle;
import java.awt.Color;

public class Pies extends Thread {

    Turtle turtle;

    public Pies(Turtle turtle) {
        this.turtle = turtle;
    }

    public void run() {
        turtle.setPenColor(Color.black);
        piernaIzq(turtle);
        turtle.penUp();
        turtle.forward(63);
        turtle.penDown();
        piernaDer(turtle);
        turtle.hideTurtle();
    }

    private void piernaIzq(Turtle t) {
        t.left(180);
        t.forward(90);
        t.right(90);
        t.forward(60);
        t.right(150);
        t.forward(70);
        t.left(150);
        t.forward(25);
        t.left(90);
        t.forward(15);
        t.back(70);
        t.right(270);
        t.forward(23);
    }
    private void piernaDer(Turtle t ){
        t.right(90);
        t.forward(90);
        t.left(90);
        t.forward(60);
        t.left(150);
        t.forward(70);
        t.right(150);
        t.forward(25);
        t.right(90);
        t.forward(15);
        t.back(70);
        t.left(270);
        t.forward(30);
    }
}
