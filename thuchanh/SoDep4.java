
package thuchanh;

import java.util.Scanner;

public class SoDep4 {
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='6'&&s.charAt(i)!='8') return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while (t -- >0){
            String s =sc.nextLine();
            String tmp =s;
            StringBuilder sb =new StringBuilder(s);
            tmp=sb.reverse().toString();
            //System.out.println(tmp+" "+s);
            if(s.equals(tmp)&&check(s)) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
