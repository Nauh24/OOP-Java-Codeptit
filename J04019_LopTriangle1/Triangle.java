
package J04019_LopTriangle1;

public class Triangle {

    private double ab;
    private double ac;
    private double bc;

    public Triangle(Point a, Point b, Point c) {
        this.ab = a.distance(b);
        this.ac = a.distance(c);
        this.bc = b.distance(c);
    }
    public boolean valid(){
        if(this.ab +this.ac > this.bc &&this.ab +this.bc >this.ac &&this.bc +this.ac > this.ab) return true;
        return false;
    }
    public String getPerimeter(){
        return String.format("%.3f",this.ab +this.ac +this.bc);
    }
}
