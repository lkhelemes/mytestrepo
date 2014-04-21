package com.engagepoint.graph;

import static java.lang.System.out;

/**
 * Created by lyolik on 21.04.2014.
 */
public class GraphObject {
    public String color="Black";

    public void draw(){
        out.printf("GraphObject %s", this.color);
    }
}
