
package codeptit;

import java.util.Scanner;

public class J02013_SapXepNoiBot {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        int cnt=0;
        while(true){
            
            cnt++;
            boolean isSorted=true;
            for(int i=0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    isSorted=false;
                    int tmp=a[i];
                    a[i]=a[i+1];
                    a[i +1]=tmp;
                }
            }
            if(isSorted) break;
            System.out.printf("Buoc %d: ",cnt);
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
