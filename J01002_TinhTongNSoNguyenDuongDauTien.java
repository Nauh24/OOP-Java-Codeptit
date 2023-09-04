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
public class J01002_TinhTongNSoNguyenDuongDauTien {
    public static void main(String[] args) {
     Scanner ip=new Scanner(System.in);
     int t=ip.nextInt();
     while(t-- >0){
        long n=ip.nextLong();
        long s=n*(n+1)/2;
         System.out.println(s);
}
    }
}
