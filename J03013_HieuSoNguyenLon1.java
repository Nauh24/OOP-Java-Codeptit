
package codeptit;

import java.math.BigInteger;
import java.util.Scanner;
public class J03013_HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
       int t=ip.nextInt();
        while(t -- >0){
            BigInteger a = ip.nextBigInteger();
            BigInteger b = ip.nextBigInteger();
            String c =String.valueOf(a.subtract(b).abs());
            int len=Math.max(a.toString().length(),b.toString().length());
            while(c.length()<len){
                c="0"+c;
            }
            System.out.println(c);
        }
    }
}
