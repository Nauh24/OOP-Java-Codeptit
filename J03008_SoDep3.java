
package codeptit;

import java.util.Scanner;

public class J03008_SoDep3 {
    
    public static boolean check(String s) {
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(c!='2'&&c!='3'&&c!='5'&&c!='7') return false;
        }
        String rev =new StringBuilder(s).reverse().toString();
        if(s.equals(rev)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        while(t -- >0){
            String s=ip.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
