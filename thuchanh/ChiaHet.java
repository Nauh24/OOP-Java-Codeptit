
package thuchanh;

import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while(t -- >0){
           
            BigInteger a =new BigInteger(sc.next());
            BigInteger b =new BigInteger(sc.next());
            BigInteger c =new BigInteger(sc.next());
            if(a.mod(c).toString().equals("0")&&b.mod(c).toString().equals("0"))
                System.out.println("YES");
            else System.out.println("NO");
            }
        }
    }

