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
public class J01010_CatDoi {
    static long catDoi(String s){
        long ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='1') ans=ans*10+1;
           else if(s.charAt(i)=='0'||s.charAt(i)=='8'||s.charAt(i)=='9') ans=ans*10;
           else return 0;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String n=sc.next();
            if(catDoi(n)==0) System.out.println("INVALID");
            else System.out.println(catDoi(n));
        }
    }
}
