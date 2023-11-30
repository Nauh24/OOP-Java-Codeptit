import java.util.Scanner;
public class J02028_DayConLienTiepCoTongBangK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            boolean ok=false;
            long sum=a[0];
            int l=0,r=1;
            while(r<=a.length){
                while(sum>k && l<r-1){
                    sum-=a[l];
                    l++;
                }
                if(sum==k){
                    ok=true;
                    break;
                }
                if(r<a.length)
                    sum+=a[r];
                r++;
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
/*
3
6 33
1 4 20 3 10 5
7 7
1 4 0 0 3 10 5
2 0
1 4
*/