
import java.util.Scanner;

public class J02019_TongUocSo2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int f[] = new int [1000001];
        f[0]=0;
        f[1]=0;
        for(int i=2;i<=1000000;i++){
            f[i]=i;
        }
        for(int i=2;i<=1000;i++){
            if(f[i]==i){
                for(int j=i*2;j<=1000000;j+=i){
                    f[i]+=j;
                }
            }
        }
        int cnt = 0;
        for(int i=a;i<=b;i++){
            if(f[i]-i>i) cnt++;
        }
        System.out.println(cnt);

    }

}
