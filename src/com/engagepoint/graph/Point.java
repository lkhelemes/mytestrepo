package com.engagepoint.graph;
import static java.lang.System.out;

/**
 * Created by lyolik on 21.04.2014.
 */
public class Point extends GraphObject {
    public int x;
    public int y;


    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }
    @Override
    public void draw(){

        super.draw();
        out.printf("\nx = %d, y = %d\n", x,y);
        out.printf("Color %s\n", color);
    }

    @Override
    public String toString() {
        return String.format("x = %d, y = %d\n", x,y);
    }
}
