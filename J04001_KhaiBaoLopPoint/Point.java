package J04001_KhaiBaoLopPoint;
import static java.lang.Math.pow;

public class Point {

    private double x, y;

    Point() {
        this.x=0;
        this.y=0;
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    Point(Point p){
        this.x=p.x;
        this.y=p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    double distance(Point p){
        return Math.sqrt(pow(this.x-p.x,2)+Math.pow(this.y-p.y,2 ));    
    }
    double distance(Point a,Point b){
        return Math.sqrt(pow(a.x-b.x,2)+Math.pow(a.y-b.y, 2));
    }
   
}
