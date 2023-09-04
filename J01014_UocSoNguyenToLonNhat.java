
package codeptit;

import java.util.Scanner;

public class J01014_UocSoNguyenToLonNhat {

    public static long uocMax(long n) {
        long ans=0;
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                ans=i;
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1) ans=n;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    int t=sc.nextInt();
    while(t-- >0){
        long n=sc.nextLong();
        System.out.println(uocMax(n));
    }
    }
}
