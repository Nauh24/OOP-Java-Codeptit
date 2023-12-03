import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class J08024_So0VaSo9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            int n=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
            q.add(9);
            while(true){
                int x=q.poll();
                if(x%n==0) {
                    System.out.println(x);
                    break;
                }
                q.add(x*10);
                q.add(x*10+9);
            }
        }
    }
}
