
package codeptit;
import java.util.Scanner;
public class J03007_SoDep2 {
    static String soDep(String s){
        if(s.charAt(0)!='8'||s.charAt(s.length()-1)!='8') return "NO";
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
           
        }
        //if(sum%10!=0) return "NO";
        String rev =new StringBuilder(s).reverse().toString();
        if(s.equals(rev)&&sum%10==0) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int t=ip.nextInt();
        ip.nextLine();
        while(t -->0){
            String s=ip.nextLine();
            System.out.println(soDep(s));
        }
    }
}
