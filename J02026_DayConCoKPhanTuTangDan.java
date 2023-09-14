
import java.util.Arrays;
import java.util.Scanner;


public class J02026_DayConCoKPhanTuTangDan {
    static int n,k;
    static int [] a=new int[16],b=new int[16];
    static void in(){
        for(int i=1;i<=k;i++){
            System.out.print(a[b[i]]+" ");
        }
        System.out.println();
    }
    static void Try(int i){
        for(int j=b[i-1]+1;j<=n-k+i;j++){
            b[i]=j;
            if(i==k){
                in();
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            n=sc.nextInt();
            k=sc.nextInt();
            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a,1,n+1);
            Try(1);
            
        }
    }
}
