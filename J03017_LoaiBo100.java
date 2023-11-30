
import java.util.Scanner;
import java.util.Stack;

public class J03017_LoaiBo100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           String s=sc.next();
           Stack<Character> st=new Stack<>();
           int len=0,res=0;
           for(int i=s.length()-1;i>=0;i--){
               if(s.charAt(i)=='1'){
                   if(st.size()>1){
                       len+=3;
                       st.pop();
                       st.pop();
                   }
                   else{
                       st.clear();
                       len=0;
                   }
                   res=Math.max(res, len);
               }
               else{
                   st.push('0');
                   if(st.size()>2) len=0;
               }
           }
            System.out.println(res);
        }
    }
}
/*
2
010010
1011110000
*/
