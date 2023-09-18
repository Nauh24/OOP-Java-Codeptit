
package thuchanh;

import java.util.Scanner;

public class TimHangNguyenToTrong1MaTran {
    public static boolean snt(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=1;x<=t;x++){
            
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] a=new int[n][m];
            int[] d=new int[1001];
            int cnt=0;
            for(int i=0;i<n;i++){
                cnt=0;
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                    if(snt(a[i][j])) cnt++;
                }
                if(cnt==m) d[i]++;
            }
            System.out.printf("Test %d:\n",x);
            for(int i=0;i<n;i++){
                if(d[i]>=1) System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
