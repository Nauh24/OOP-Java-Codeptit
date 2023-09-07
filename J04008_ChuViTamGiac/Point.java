
package J04008_ChuViTamGiac;

public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(x-p.x,2 )+Math.pow(y-p.y,2));
    }
    
}
