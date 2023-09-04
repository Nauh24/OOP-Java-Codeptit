
package codeptit;

import java.util.Scanner;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        for(int x=1;x<=t;x++){
            int n=ip.nextInt();
            int[] a=new int[n];
            int[] d=new int[100001];
            for(int i=0;i<n;i++){
                a[i]=ip.nextInt();
                d[a[i]]++;
            }
 
            System.out.println("Test "+x+":");
            for(int i=0;i<n;i++){
                if(d[a[i]]>0){
                    System.out.printf("%d xuat hien %d lan\n",a[i],d[a[i]]);
                    d[a[i]]=0;
                }
            }
        }
    }
}
