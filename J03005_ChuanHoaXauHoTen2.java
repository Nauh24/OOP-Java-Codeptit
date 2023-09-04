
package codeptit;

import java.util.Scanner;

public class J03005_ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        ip.nextLine();
        while(t -- >0){
            String s=ip.nextLine().trim().toUpperCase();
            String[] a =s.split("\\s+");
            for(int i=1;i<a.length;i++){
               // System.out.print(i+" ");
                System.out.print(a[i].charAt(0)+a[i].substring(1).toLowerCase());
                if(i!=a.length-1) System.out.print(" ");
                else System.out.print(", ");
            }
            System.out.print(a[0]);
            System.out.println();
        }
    }
}
