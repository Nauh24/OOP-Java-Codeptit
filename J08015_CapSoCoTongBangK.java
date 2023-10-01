
import java.util.HashMap;
import java.util.Scanner;


public class J08015_CapSoCoTongBangK {
    static int countPairsWithSumK(long a[],int n,long k){
        HashMap<Long,Integer> map=new HashMap<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            long tmp=k-a[i];
            if(map.containsKey(tmp)){
                cnt+=map.get(tmp);
            }
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long  [] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println(countPairsWithSumK(a, n, k));
        }
    }
}
