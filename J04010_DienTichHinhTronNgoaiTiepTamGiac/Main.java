
package J04010_DienTichHinhTronNgoaiTiepTamGiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            Point[] tri =new Point[3];
            for(int i=0;i<3;i++){
                double x=sc.nextDouble();
                double y=sc.nextDouble();
                tri[i]=new Point(x, y);
            }
            double a =tri[0].distance(tri[1]);
            double b =tri[1].distance(tri[2]);
            double c =tri[2].distance(tri[0]);
            if(a+b>c&&b+c>a&&c+a>b){
                double s =0.25*Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b));
                double R =(a*b*c)/(4*s);
                double dienTich=Math.PI*R*R;
                System.out.printf("%.3f\n",dienTich);
            }
            else System.out.println("INVALID");
        }
    }
}
