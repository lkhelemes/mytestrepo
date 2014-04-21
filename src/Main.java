import com.engagepoint.graph.GraphObject;
import com.engagepoint.graph.Point;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Point p1=new Point();
        p1.x=100;
        p1.y=240;
        p1.color="RED";
        p1.move(12, 22);
   //     p1.draw();
        out.println(p1);
        p1.draw();


    }
}
