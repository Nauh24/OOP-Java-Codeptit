import java.math.BigInteger;
import java.util.Scanner;
public class J03016_ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            BigInteger n=new BigInteger(sc.next());
            if(n.mod(new BigInteger("11")).equals(BigInteger.ZERO)) System.out.println(1);
            else System.out.println(0);
            
        }
    }
}
/*
2
76945
363588395960667043875487
*/