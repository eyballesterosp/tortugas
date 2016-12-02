package tortuga;

import ch.aplu.turtle.Turtle;
import java.awt.Color;

public class Cuerpo extends Thread {

    Turtle turtle;

    public Cuerpo(Turtle turtle) {
        this.turtle = turtle;
    }

    public void run() {
        turtle.penWidth(4);
        turtle.speed(110);
        turtle.right(90);
        turtle.setPenColor(Color.black);
        rectangle(turtle, 90, 90, 20);
        turtle.back(20);
        turtle.right(90);
        turtle.back(35);
        rectangle(turtle, 90, 160, 160);
        turtle.penWidth(3);
        turtle.setPos(-65, 25);
        turtle.right(90);
        rectangle(turtle, 90, 130, 30);
        turtle.penUp();
        turtle.back(55);
        turtle.penDown();
        turtle.penWidth(1);
        name(turtle);
        turtle.hideTurtle();
    }

    private void name(Turtle t) {
        
        Y(t);
        t.penUp();
        t.forward(35);
        t.penDown();
        E(t);
        t.penUp();
        t.forward(35);
        t.penDown();
        S(t);
        t.penUp();
        t.forward(35);
        t.penDown();
        S(t);
    }

    private void S(Turtle t) {
        t.forward(25);
        t.right(90);
        t.forward(7);
        t.right(90);
        t.forward(14);
        t.left(90);
        t.forward(6);
        t.left(90);
        t.forward(14);
        t.right(90);
        t.forward(21);
        t.right(90);
        t.forward(25);
        t.right(90);
        t.forward(7);
        t.right(90);
        t.forward(14);
        t.left(90);
        t.forward(6);
        t.left(90);
        t.forward(14);
        t.right(90);
        t.forward(21);
        t.right(90);
    }

    private void E(Turtle t) {
        t.forward(25);
        t.right(90);
        t.forward(7);
        t.right(90);
        t.forward(15);
        t.left(90);
        t.forward(6);
        t.left(90);
        t.forward(15);
        t.right(90);
        t.forward(7);
        t.right(90);
        t.forward(15);
        t.left(90);
        t.forward(6);
        t.left(90);
        t.forward(15);
        t.right(90);
        t.forward(7);
        t.right(90);
        t.forward(25);
        t.right(90);
        t.forward(32);
        t.right(90);

    }

    private void Y(Turtle t) {
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
        t.forward(16);
        t.right(90);

    }

    private void rectangle(Turtle t, double giro, double l, double a) {
        t.forward(l);
        t.right(giro);
        t.forward(a);
        t.right(giro);
        t.forward(l);
        t.right(giro);
        t.forward(a);
    }
}
