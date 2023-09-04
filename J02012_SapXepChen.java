
package codeptit;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class J02012_SapXepChen {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n= ip.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(ip.nextInt());
            System.out.printf("Buoc %d: ",i);
            Collections.sort(a);
            for(int j:a){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
