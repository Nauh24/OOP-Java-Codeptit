/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class J01003_GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        double a=ip.nextDouble(), b=ip.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("VSN");
    }
            else System.out.println("VN");
}
        else System.out.printf("%.2f",-b/a);
    }
}