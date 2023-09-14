
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class J02024_DayConCoTongLe {
    static int n;
    static Integer [] a=new Integer[16],b=new Integer[16];
    static void check(){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=a[i]*b[i];
        }
        if(sum%2==1){
            for(int i=1;i<=n;i++){
                if(b[i]==1) System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
    static void Try(int i){
        for(int j=0;j<=1;j++){
            b[i]=j;
            if(i==n) check();
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
             n=sc.nextInt();
             for(int i=1;i<=n;i++){
                 a[i]=sc.nextInt();
             }
//             Arrays.sort(a, 1, n, new Comparator<Integer>(){
//                 @Override
//                 public int compare(Integer o1, Integer o2) {
//                     return o2.compareTo(o1);
//                 }
//             });
            Arrays.sort(a,1,n+1,Comparator.reverseOrder());
             Try(1);
//            
            System.out.println();
        }
    }
}
