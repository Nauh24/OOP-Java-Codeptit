
package J04002_KhaiBaoLopHinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Rectange rec =new Rectange();
       double w =sc.nextDouble();
       rec.setWidth(w);
       double h= sc.nextDouble();
       rec.setHeight(h);
       String c =sc.next();
       c =c.toLowerCase();
       c = String.valueOf(c.charAt(0)).toUpperCase()+c.substring(1);
       rec.setColor(c);
       if(rec.getHeight()>0&&rec.getWidth()>0) {
           System.out.printf("%.0f %.0f %s",rec.findPerimeter(),rec.findArea(),rec.getColor());
           
       }
       else{
           System.out.println("INVALID");
       } 
    }
}
