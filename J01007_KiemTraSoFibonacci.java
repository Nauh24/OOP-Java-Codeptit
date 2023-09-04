
import java.util.*;

public class J01007_KiemTraSoFibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        long f[] =new long[95];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=92;i++){
            f[i]=f[i-1]+f[i-2];
        }
         while(t -->0){
             long n=sc.nextLong();
             int idx= Arrays.binarySearch(f,0,92,n);
             if(idx<0) System.out.println("NO");
             else System.out.println("YES");
         }
}
}