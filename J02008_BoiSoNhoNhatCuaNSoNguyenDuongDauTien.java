
package codeptit;


import java.util.Scanner;

public class J02008_BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static long gcd(long a,long b) {
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    public static long lcm(long a,long b) {
        return a*b/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        while(t -->0){
            int n=ip.nextInt();
            long ans=1;
            for(int i=2;i<=n;i++){
                ans=lcm(ans, i);
            }
            System.out.println(ans);
        }
    }
}
