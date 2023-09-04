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
public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        for(int i=1;i<=t;i++){
            long n=sc.nextLong();
          
            System.out.print("Test "+i+": ");
            for(long j=2;j<=Math.sqrt(n);j++ ){
                int cnt=0;
                while(n%j==0){
                    cnt++;
                    n/=j;
                }
             if(cnt>=1)   System.out.print(j+"("+cnt+") ");
            }
                    if(n>1) System.out.println(n+"(1)");
            System.out.println();
        }
                
        
    }
}
