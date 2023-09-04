
package codeptit;

import java.util.Scanner;

public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        while(t -->0){
            int n=ip.nextInt();
            int[] a=new int[n+1];
            int[] left=new int[n+1];
            int sum=0;
            for(int i=1;i<=n;i++){
                a[i]=ip.nextInt();
                left[i]=left[i-1]+a[i-1];
                sum+=a[i];
            }
            int ans=-1;
            for(int i=1;i<=n;i++){
                if(left[i]==sum-left[i]-a[i]){
                    ans=i;
                 
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
