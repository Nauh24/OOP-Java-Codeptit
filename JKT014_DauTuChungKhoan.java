import java.util.Scanner;
import java.util.Stack;
public class JKT014_DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            int a[] =new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Stack<Integer> st=new Stack<>();
            st.add(0);
            System.out.print(1+" ");
            for(int i=1;i<n;i++){
                while(!st.empty()&&a[st.peek()]<=a[i]){
                    st.pop();
                }
                
                if(!st.empty()) System.out.print((i-st.peek())+" ");
                else System.out.print((i+1)+" ");
                st.add(i);
            }
            System.out.println();
        }
    }
}
/*
1
7
100 80 60 70 60 75 85
*/