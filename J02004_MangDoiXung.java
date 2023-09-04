
package codeptit;

import java.util.Scanner;

public class J02004_MangDoiXung {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
              
            }
            int ok=1;
            for(int i=0;i<n/2;i++){
                if(a[i]!=a[n-i-1]){
                    System.out.println("NO");
                    ok=0;
                    break;
                }
            }
            if(ok==1) System.out.println("YES");
        }
    }
}
