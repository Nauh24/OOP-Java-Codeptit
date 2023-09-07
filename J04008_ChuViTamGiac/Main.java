
package J04008_ChuViTamGiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            Point p1 =new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 =new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 =new Point(sc.nextDouble(), sc.nextDouble());
            double side1=p1.distance(p2);
            double side2=p1.distance(p3);
            double side3=p3.distance(p2);
            if (side1+side2>side3 &&side1+side3>side2&&side2+side3>side1){
                System.out.printf("%.3f\n",side1+side2+side3);
            }
            else System.out.println("INVALID");
        }
    }
}
