/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class J01001_HinhChuNhat {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int a=ip.nextInt();
        int b=ip.nextInt();
        if(a<=0||b<=0) System.out.println(0);
        else System.out.println(2*(a+b)+" "+a*b);
    }
}
