
package codeptit;

import java.util.Scanner;

public class J03040_BienSoDep {
    public static boolean tangChat(String s) {
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)>=s.charAt(i)) return false;
        }
        return true;
    }
    public static boolean bangNhau(String s) {
        if(s.charAt(0)==s.charAt(1) &&s.charAt(1)==s.charAt(2)&&s.charAt(3)==s.charAt(4)) return true;
        else return false;
    }
    public static boolean locPhat(String s) {
      for(char i:s.toCharArray()){
          if(i!='6'&&i!='8') return false;
      }   
      return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t -- >0){
            String s = sc.next();
            String ans ="";
            for (int i=5;i<s.length();i++){
                if(i!=8) ans+=s.charAt(i);
            }
            if(tangChat(ans)||bangNhau(ans)||locPhat(ans)) System.out.println("YES");
            else System.out.println("NO");
            //System.out.println(ans);
        }
    }
}
