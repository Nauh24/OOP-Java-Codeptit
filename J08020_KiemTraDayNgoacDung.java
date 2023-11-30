import java.util.Scanner;
import java.util.Stack;
public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            String s=sc.next();
            Stack<Character> st=new Stack<>();
            for(int i=0;i<s.length();i++){
                char x=s.charAt(i);
                switch (x) {
                    case ')':
                        if(!st.empty()&&st.peek()=='(') st.pop();
                        break;
                    case ']':
                        if(!st.empty()&&st.peek()=='[') st.pop();
                        break;
                    case '}':
                        if(!st.empty()&&st.peek()=='{') st.pop();
                        break;
                    default:
                         st.push(x);
                }
                
            }
            if(!st.empty()) System.out.println("NO");
                else System.out.println("YES");
        }
    }
}
/*
2
[()]{}{[()()]()}
[(])
*/