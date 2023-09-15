
package J04019_LopTriangle1;

import java.util.Scanner;

public class Point {
    private double x,y;

    public Point() {
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        Point x = new Point(sc.nextDouble(), sc.nextDouble());
        return x;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }
}
