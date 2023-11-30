
import java.util.HashMap;
import java.util.Scanner;
public class J08015_CapSoCoTongBangK {
    static long countPairsWithSumK(long a[],int n,long k){
        HashMap<Long,Integer> map=new HashMap<>();
        long cnt=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }
            else{
                map.put(a[i], 1);
            }
        }
        for(int i=0;i<n;i++){
            Long tmp= (k-a[i]);
            if(map.containsKey(tmp)){
                if(a[i]==tmp) cnt+=map.get(tmp)-1;
                else cnt+=map.get(tmp);
            }
            
        }
        return cnt/2;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long  [] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            System.out.println(countPairsWithSumK(a, n, k));
        }
    }
}
/*
4
4 6
1 5 7 -1
5 6
1 5 7 -1 5
4 2
1 1 1 1
13 11
10 12 10 15 -1 7 6 5 4 2 1 1 1
*/