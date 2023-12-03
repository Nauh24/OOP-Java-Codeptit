import java.util.Scanner;
import java.util.Stack;
public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Stack<Integer> st=new Stack<>();
            for(int i=n-1;i>=0;i--){
                while(!st.empty()&&st.peek()<=a[i]){
                    st.pop();
                }
                if(st.isEmpty()) b[i]=-1;
                else b[i]=st.peek();
                st.push(a[i]);
            }
            for(int i=0 ;i<n;i++){
                System.out.print(b[i]+" ");
            }
            System.out.println();
        }
    }
}
/*
3
4
4 5 2 25
3
2 2 2
4
4 4 5 5
*/