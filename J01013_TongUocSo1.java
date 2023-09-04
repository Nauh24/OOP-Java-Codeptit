
package codeptit;

import java.util.Scanner;

public class J01013_TongUocSo1 {
    public static final int N=(int) 2e6;
    public static int [] prime=new int[N+1];
    //tìm ước số nguyên tố nhỏ nhất của các số từ 2 đến N
    public static void snt() {
        for (int i=2;i<=Math.sqrt(N);i++){
            if(prime[i]==0){
                for(int j=i;j<=N;j+=i){
                    prime[j]=i;
                }
            }
        }
        for(int i=2;i<=N;i++){
            if(prime[i]==0) prime[i]=i;
        }
    }
    public static int tong(int n) {
        int sum=0;
        while(n!=1){
            sum+=prime[n];
            n/=prime[n];
        }
        return sum;
    }
    public static void main(String[] args) {
        snt();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            sum+=tong(x);
        }
        System.out.println(sum);
    }
}

