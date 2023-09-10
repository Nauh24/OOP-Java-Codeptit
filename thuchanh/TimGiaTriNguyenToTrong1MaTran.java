
package thuchanh;

import java.util.Scanner;

public class TimGiaTriNguyenToTrong1MaTran {
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
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                    d[a[i][j]]++;
                }
            }
            System.out.printf("Test %d:\n",x);
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(snt(a[i][j])==true&&d[a[i][j]]>0) {
                        System.out.print(a[i][j]+" ");
                        d[a[i][j]]=0;
                    }
                }
            }
        }
    }
}
