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
public class J01004_SoNguyenTo {
    public static boolean isPrime(long n) {
        if(n<2){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        while(t -- >0){
            long n=ip.nextLong();
            if(isPrime(n)) System.out.println("YES");
            else System.out.println("NO");
    }
}
}