
package codeptit;

import java.util.Scanner;

public class J03032_DaoTu {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t=sc.nextInt();
         sc.nextLine();
         while(t -- >0){
             String a =sc.nextLine();
            String[] b = a.split("\\s+");
             for(String i: b){
                 String c =new StringBuilder(i).reverse().toString();
                 System.out.print(c+" ");
             }
             
             System.out.println();
         }
    }
}
