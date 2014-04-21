package com.engagepoint.graph;
import static java.lang.System.out;

/**
 * Created by lyolik on 21.04.2014.
 */
public class Point extends GraphObject {
    public int x;
    public int y;


    public Point (){
        this(0,0, DEFAULT_COLOR );
    }
    public Point (int x, int y){
        this(x,y, DEFAULT_COLOR );
    }
    public Point (int x, int y, String color){
        this.x=x;
        this.y=y;
        this.color=color;
    }
    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }
    @Override
    public void draw(){
        out.println(this);
    }
    @Override
    public String toString() {
        return String.format("Точка\nx = %d, y = %d\nЦвет %s", x,y, color);
    }
    @Override
    public Point clone(){
        return new Point(x,y,color);
    }

}
