
import java.util.Scanner;


public class J02023_LuaChonThamLam {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int ok=0;
        int s2=s;
        if(s==0||9*n<s){
            System.out.printf("-1 -1\n");
            ok=1;
        }
        StringBuilder res =new StringBuilder();
        for(int i=0;i<n;i++){
            res.append("0");
        }
        for(int i=n-1;i>=0;i--){
            if(s>9){
                s-=9;
                res.setCharAt(i, '9');
            }
            else{
                if(i==0){
                    res.setCharAt(i, (char)(s+'0'));
                }
                else{
                    res.setCharAt(0, '1');
                    res.setCharAt(i, (char)(s-1+'0'));
                    break;
                }
            }
        }
        StringBuilder ans =new StringBuilder();
        for(int i=0;i<n;i++){
            ans.append("0");
        }
        for(int i=0;i<n;i++){
            if(s2>9){
                ans.setCharAt(i, '9');
                s2-=9;
            }
            else{
                ans.setCharAt(i, (char)(s2+'0'));
                break;
            }
        }
        if(ok==0) System.out.printf(res+" "+ans+"\n");
    }
}
