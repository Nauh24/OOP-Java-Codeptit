
package J04011_BonDiemTrenMatPhang;

public class Point3D {
    private int x,y,z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public static boolean check(Point3D A,Point3D B,Point3D C,Point3D D){
        Point3D AB =new Point3D(B.getX()-A.getX(),B.getY()-A.getY(),B.getZ()-A.getZ());
        Point3D AC =new Point3D(C.getX()-A.getX(),C.getY()-A.getY(), C.getZ()-A.getZ());
        Point3D AD =new Point3D(D.getX()-A.getX(),D.getY()-A.getY(), D.getZ()-A.getZ());
        Point3D ABAC =new Point3D(AB.getY()*AC.getZ()-AB.getZ()*AC.getY(),AB.getZ()*AC.getX()-AB.getX()*AC.getZ(),AB.getX()*AC.getY()-AB.getY()*AC.getX());
        if(ABAC.getX()*AD.getX()+ABAC.getY()*AD.getY()+ABAC.getZ()*AD.getZ()==0) return true;
        else return false;
    }
}
