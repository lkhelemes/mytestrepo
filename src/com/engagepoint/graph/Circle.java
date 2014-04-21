package com.engagepoint.graph;
import static java.lang.System.out;

/**
 * Created by lyolik on 21.04.2014.
 */
public class Circle extends GraphObject {
    public Point centr=new Point();
    public int radius;

    public Circle(){
        this(0,0);
    }
    public Circle(Point p){
        this(p.x, p.y);
    }
    public Circle(int x, int y){
        this(x,y, 0);
    }
    public Circle(int x, int y,int r){
        this(x,y,r, DEFAULT_COLOR);
    }
    public Circle(int x, int y,int r, String color){
        this.centr.x=x;
        this.centr.y=y;
        this.radius=r;
        this.color=color;
    }
    public void move(int dx, int dy){
        centr.x+=dx;
        centr.y+=dy;
    }
    @Override
    public void draw() {
        out.println(this);
    }
    @Override
    public String toString() {
        return String.format("Окружность\nЦентр х= %d, y = %d\nЦвет %s\nРадиус = %d", centr.x,centr.y, color, radius);
    }
    @Override
    public Circle clone(){
        return new Circle(centr.x,centr.y,radius,color);
    }


}
