import java.util.HashMap;
import java.util.Scanner;
public class J03023_SoLaMa {
    public static int romanToDecimal(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int d=0;
        int pre=0;
        for(int i=s.length()-1;i>=0;i--){
            int cur=map.get(s.charAt(i));
            if(cur<pre){
                d-=cur;
            }
            else d+=cur;
            pre=cur;
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t -- >0){
            String s=sc.next();
            System.out.println(romanToDecimal(s));
        }
    }
}
/*
3
XIX
DC
CD
*/