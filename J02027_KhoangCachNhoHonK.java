
import java.util.Arrays;
import java.util.Scanner;


public class J02027_KhoangCachNhoHonK {
    private static int pos(int [] a,int x){
        int res=-1,l=0,r=a.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]<x) {
                res=m;
                l=m+1;
            }
            else r=m-1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            long cnt=0;
            for(int i=0;i<n;i++){
                int p=pos(a, a[i]+k);
                if(p!=-1) cnt+=(p-i);
            }
            System.out.println(cnt);
        }
    }
}
/*
2
4 3
1 10 4 2
3 5
2 3 4
*/