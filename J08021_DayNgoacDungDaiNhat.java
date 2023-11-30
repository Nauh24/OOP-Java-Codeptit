import java.util.Scanner;
import java.util.Stack;
public class J08021_DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            String s=sc.next();
            Stack<Integer> st=new Stack<>();
            st.push(-1);
            int ans=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(') st.push(i);
                else{
                    if(st.size()>1 &&s.charAt(st.peek())=='('){
                        st.pop();
                        ans=Math.max(ans, i-st.peek());
                    }
                    else st.push(i);
                }
            }
            System.out.println(ans);
        }
    }
}
/*
3
((()
)()())
()(()))))
*/