package thuchanh;
import java.util.Scanner;
class DaThuc {
    private int[] d;
    public DaThuc(String s) {
        this.d = new int[10001];
        for(String x : s.split("\\s\\+\\s")){
                String[] arr = x.split("[\\*\\^]");
            d[Integer.parseInt(arr[arr.length - 1])] = Integer.parseInt(arr[0]);
        }
    }
    public DaThuc(int[] d) {
        this.d = d;
    }
    public DaThuc() {
        this.d = new int[10001];
    }
    public DaThuc cong(DaThuc o){
        DaThuc r = new DaThuc();
        for(int i = 0; i <= 10000; i++){
            r.d[i] = this.d[i] + o.d[i];
        }
        return r;
    }
    public void out(){
        StringBuilder res = new StringBuilder();
        for(int i = 10000; i >= 0; i--){
            if(this.d[i] != 0){
                res.append(String.format("%d*x^%d + ", this.d[i], i));
            }
        }
        res.delete(res.length() - 3, res.length());
        String res2=res.toString();
        System.out.println(res2);
    }
}
public class TongDaThuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            r.out();
    }
}
/*
1
3*x^8 + 7*x^2 + 4*x^0
11*x^6 + 9*x^2 + 2*x^1 + 3*x^0
*/