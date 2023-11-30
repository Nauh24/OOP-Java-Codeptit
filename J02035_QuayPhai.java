import java.util.Scanner;
public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            long a[] =new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            boolean ok=false;
            for(int i=1;i<n;i++){
                if(a[i]<a[i-1]){
                    ok=true;
                    System.out.println(i);
                    break;
                }
            }
            if(!ok) System.out.println(0);
        }
    }
}
/*
2
5
5 1 2 3 4
5
1 2 3 4 5
*/