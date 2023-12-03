import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            Queue<String> q=new LinkedList<>();
            ArrayList<String> list=new ArrayList<>();
            q.add("6");
            q.add("8");
            while(true ){
                String s=q.poll();
                if(s.length()>n) break;
               list.add(s);
                String s1=s+"6";
                String s2=s+"8";
                q.add(s1);
                q.add(s2);
            }
            System.out.println(list.size());
            for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}
