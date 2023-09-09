
package thuchanh;

import java.util.Scanner;

public class SoCacSoNguyen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        int cnt3=0;
        int cnt5=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='3') cnt3++;
            if(s.charAt(i)=='5') cnt5++;
        }
        if(cnt3+cnt5==3||cnt3+cnt5==5) System.out.println("YES");
        else System.out.println("NO");
    }
         
}
