
package codeptit;

import java.util.Scanner;
import java.util.Stack;

public class J03027_RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==c) st.pop();
            else st.push(c);
        }
        if(st.isEmpty()) System.out.println("Empty String");
        else{
            StringBuilder result =new StringBuilder();
            while(!st.isEmpty()){
                result.insert(0, st.peek());
                st.pop();
            }
            System.out.println(result);
        }
    }
}
