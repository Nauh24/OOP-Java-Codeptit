
import java.util.Arrays;
import java.util.Scanner;


public class J02016_BoBaSoPytago {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            boolean found =false;
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    long k=(long) Math.sqrt(a[i]*a[i]+a[j]*a[j]);
                    if(k*k!=a[i]*a[i]+a[j]*a[j]){
                        continue;
                    }
                    if(Arrays.binarySearch(a, k)>j){
                        found=true;
                        break;
                    }
                }
                if(found) break;
            }
            System.out.println(found ?"YES":"NO");
        }
    }
}
