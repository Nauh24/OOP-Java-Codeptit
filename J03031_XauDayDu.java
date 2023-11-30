import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class J03031_XauDayDu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -- >0){
            String s=sc.next();
            int k=sc.nextInt();
            Set<Character> set=new HashSet<>();
            for(char i:s.toCharArray()){
                set.add(i);
            }
            if(26-set.size()<=k) System.out.println("YES");
            else System.out.println("NO");
            //System.out.println(set.size());
        }
    }
}
/*
2
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
4
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
24
*/