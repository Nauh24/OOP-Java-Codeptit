
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
class Pair{
    public int t;
    public int d;
    void input(Scanner sc){
        t=sc.nextInt();
        d=sc.nextInt();
    }
}
public class J02009_XepHang {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        Vector<Pair> v=new Vector<>();
        for(int i=0;i<n;i++){
            Pair x=new Pair();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v,new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.t-o2.t;
            }
        });

        int time=0;
        for(int i=0;i<n;i++){
            if(v.get(i).t>time){
                time=v.get(i).t;
            }
            time+=v.get(i).d;
        }
        System.out.println(time);
    }
}
