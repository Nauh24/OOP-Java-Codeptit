
package J04001_KhaiBaoLopPoint;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            Point A =new Point(sc.nextDouble(),sc.nextDouble());
            Point B =new Point(sc.nextDouble(),sc.nextDouble());
            System.out.printf("%.4f\n",A.distance(B));
       
        }
    }
}
