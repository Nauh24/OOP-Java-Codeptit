
package codeptit;

import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long gt=1;
        long s=0;
        for(int i=1;i<=n;i++){
           gt*=i;
           s+=gt;
        }
        System.out.println(s);
    }
}
