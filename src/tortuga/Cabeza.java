package tortuga;

import ch.aplu.turtle.Turtle;
import java.awt.Color;

public class Cabeza extends Thread {

    Turtle turtle;

    public Cabeza(Turtle turtle) {
        this.turtle = turtle;
    }

    public void run() {
        turtle.right(90);
        turtle.penWidth(5);
        ojo(turtle);
        turtle.penUp();
        turtle.forward(98);
        turtle.penDown();
        ojo(turtle);
        turtle.penWidth(4);turtle.setPos(-68, 161);
        rectangle(turtle);
        turtle.setPos(-40, 83);
        turtle.penWidth(2);
        boca(turtle);
        turtle.hideTurtle();

    }

    private void rectangle(Turtle t) {
        t.forward(138);
        t.right(90);
        t.forward(90);
        t.right(90);
        t.forward(140);
        t.right(90);
        t.forward(90);
    }

    private void boca(Turtle t) {
        for (int i = 0; i < 5; i++) {
            t.forward(20);
            t.right(90);
        }
        for (int i = 0; i < 3; i++) {

            t.forward(40);
            t.right(90);
            for (int j = 0; j < 3; j++) {
                t.forward(20);
                t.right(90);
            }
        }
    }

    private void ojo(Turtle t) {
        
        turtle.setPenColor(Color.black);
        for (int i = 0; i < 20; i++) {
            t.forward(4);
            t.right(18);
        }

    }
}
