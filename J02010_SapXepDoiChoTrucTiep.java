
package codeptit;

import java.util.Scanner;

public class J02010_SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        for(int i=0;i<n-1;i++){
            System.out.printf("Buoc %d: ",i+1);
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
            for(int j=0;j<n;j++){
                System.out.printf(a[j]+" ");
            }
            System.out.println();
        }
    }
}
