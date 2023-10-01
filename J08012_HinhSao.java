
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[] =new int [n+1];
        for(int i=0;i<n-1;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            a[x]++;
            a[y]++;
        }
        int ok=1;
        for(int i=1;i<=n;i++){
            if(a[i]!=1 && a[i]!=n-1){
                ok=0;
                break;
            }
        }
        if(ok==1) System.out.println("Yes");
        else System.out.println("No");
    }
}
