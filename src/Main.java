import com.engagepoint.graph.Circle;
import com.engagepoint.graph.GraphObject;
import com.engagepoint.graph.Point;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Point p1=new Point();
        p1.x=100;
        p1.y=100;
        p1.color="RED";
        p1.move(12, 22);
       p1.draw();
//        out.println(p1);
//        p1.draw();

        Circle c1= new Circle(p1);
        c1.move(12, 22);
        c1.draw();

        Point p2=p1;
        p2.move(10,10);
        p2.draw();
        Circle c2=c1;
        c2.move(10,10);
        c2.draw();


    }
}
