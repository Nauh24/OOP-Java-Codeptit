
package codeptit;

import java.util.Scanner;

public class J03021_DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            String s =sc.next();
            s=s.toUpperCase();
            String res="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A'||s.charAt(i)=='B'||s.charAt(i)=='C') res+="2";
                if(s.charAt(i)=='D'||s.charAt(i)=='E'||s.charAt(i)=='F') res+="3";
                if(s.charAt(i)=='G'||s.charAt(i)=='H'||s.charAt(i)=='I') res+="4";
                if(s.charAt(i)=='J'||s.charAt(i)=='K'||s.charAt(i)=='L') res+="5";
                if(s.charAt(i)=='M'||s.charAt(i)=='N'||s.charAt(i)=='O') res+="6";
                if(s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R'||s.charAt(i)=='S') res+="7";
                if(s.charAt(i)=='T'||s.charAt(i)=='U'||s.charAt(i)=='V') res+="8";
                if(s.charAt(i)=='W'||s.charAt(i)=='X'||s.charAt(i)=='Y'||s.charAt(i)=='Z') res+="9";
            }
            String ans = new StringBuilder(res).reverse().toString();
            if(res.equals(ans)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
