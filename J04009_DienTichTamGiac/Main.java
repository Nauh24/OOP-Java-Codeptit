
package J04009_DienTichTamGiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            Point A =new Point(sc.nextDouble(), sc.nextDouble());
            Point B =new Point(sc.nextDouble(), sc.nextDouble());
            Point C =new Point(sc.nextDouble(), sc.nextDouble());
            double a=A.distance(B);
            double b=B.distance(C);
            double c=A.distance(C);
            if(a+b>c&&a+c>b&&b+c>a){
                double s =1/4f*Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c));
                System.out.printf("%.2f\n",s);
            }
            else System.out.println("INVALID");
        }
    }
}
