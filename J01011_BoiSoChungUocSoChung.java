/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;

/**
 *
 * @author Admin
 */
public class J01011_BoiSoChungUocSoChung {
    public static long gcd(long a,long b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
           long a=sc.nextLong();
           long b=sc.nextLong();
           long c=gcd(a,b);
            System.out.println(a*b/c+" "+c);
                       
        }
    } 
}
