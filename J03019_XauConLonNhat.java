import java.util.Scanner;
public class J03019_XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        char x='a';
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>=x){
                x=s.charAt(i);
                ans=x+ans;
            }
        }
        System.out.println(ans);
    }
}
