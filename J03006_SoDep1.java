
package codeptit;

import java.util.*;

public class J03006_SoDep1 {
     static String check(String s) {
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)%2==1){
                return "NO";
            }
        }
        String rev =new StringBuilder(s).reverse().toString();
        if (s.equals(rev)) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        ip.nextLine();
        while(t -- >0){
            String s=ip.nextLine();
            System.out.println(check(s));
        }
    }
}
