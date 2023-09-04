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
public class J01006_TinhSoFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        long[] f=new long[95];
        f[1]=f[2]=1;
        for(int i=3;i<=92;i++){
            f[i]=f[i-1]+f[i-2];
        }
        while(t -- >0){
            int n =sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
