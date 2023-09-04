
package codeptit;

import java.util.Scanner;

public class J03024_SoUuThe {
    public static boolean check(String s) {
        if(s.charAt(0)=='0') return false;
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))) return false;
        }
        return true;         
    }
    public static String soUuThe(String s) {
        int len =s.length();
        int le=0;
        for(int i=0;i<len;i++){
            if((s.charAt(i)%2)==1) le++;
        }
        int chan=len-le;
        if((len%2==0&&chan>le)||(len%2==1&&le>chan)) return "YES";
        else return "NO";
//System.out.println(len+" "+chan+" "+le);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            String s =sc.next();
            if(!check(s)){
                System.out.println("INVALID");
                continue;
            }
            System.out.println(soUuThe(s));
            //soUuThe(s);
        }
    }
}
