import java.util.Scanner;
public class J03028_MaHoaDRM {
    public static String rotate(String s){
        int Sum=0;
        for(char i:s.toCharArray()){
            Sum+=i -'A';
        }
        String res="";
        for(char i:s.toCharArray()){
            int tmp=(i-'A'+Sum)%26;
            res+=(char)('A'+tmp);
        }
        return res;
    }
    public static String merge(String a,String b){
        String res="";
        for(int i=0;i<a.length();i++){
            int tmp=(a.charAt(i)-'A'+b.charAt(i)-'A')%26;
            res+=(char)(tmp+'A');
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            String s=sc.next();
            int halfLen=(int)s.length()/2;
            //divide
            String first=s.substring(0,halfLen);
            String second=s.substring(halfLen);
            //rotate
            String rFirst=rotate(first);
            String rSecond=rotate(second);
            //merge
            System.out.println(merge(rFirst, rSecond));
        }
    }
}
/*
3
EWPGAJRB
BB
TPQJDRJWSQXGRRIPXFMINTELHBJA
*/