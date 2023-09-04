
package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011_UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        while(t -- >0){
            BigInteger a=new BigInteger(ip.next());
            BigInteger b = new BigInteger(ip.next());
            System.out.println(a.gcd(b));
        }
    }
}
