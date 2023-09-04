
package codeptit;

import java.util.Scanner;

public class J03004_ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        ip.nextLine();
        while(t -- >0){
            String s =ip.nextLine().trim().toLowerCase();
            String[] a =s.split("\\s+");
            //System.out.println(s);
           for(String i :a){
               System.out.print(String.valueOf(i.charAt(0)).toUpperCase()+i.substring(1)+" ");
           }
                  System.out.println();
        }
    }
}
