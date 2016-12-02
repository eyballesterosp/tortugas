package tortuga;

//ThreadEx3.java

import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx3 extends TurtleFrame
{
    public void simular(){
        Turtle hilo1 = new Turtle(this, Color.yellow);
        Turtle hilo2 = new Turtle(this, Color.blue);
        Turtle hilo3 = new Turtle(this, Color.red);
//        Turtle hilo4 = new Turtle(this, Color.green);
        
        hilo1.setPos(0,180);
        hilo2.setPos(-50, 140);
        hilo3.setPos(-45, 71);
        //hilo4.setPos(-65, -30);
        
        //new Cuadrado(hilo1).start();
        new Antena(hilo1).start();
        new Cabeza(hilo2).start();
        new Cuerpo(hilo3).start();
        //new Brazo(hilo4).start();
    }


public static void main(String[] args)
{
   ThreadEx3 tablero =  new ThreadEx3();
   tablero.simular();
}
}