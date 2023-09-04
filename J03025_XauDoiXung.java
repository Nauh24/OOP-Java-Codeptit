
package codeptit;

import java.util.Scanner;

public class J03025_XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t -- >0){
            String s =sc.next();
            int len=s.length();
            int i=0;
            int j=s.length()-1;
            char[] a =s.toCharArray();
            int ok=0;
            while(i<j){
                if(a[i]!=a[j]){
                    a[i]=a[j];
                    ok=1;
                    break;
                }
                i++;
                j--;
            }
            s=new String(a);
            String res =new StringBuilder(s).reverse().toString();
            //System.out.println(s);
            if(res.equals(s)&&ok==1 ||(len%2==1&&res.equals(s))||len==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
