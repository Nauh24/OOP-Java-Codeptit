
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J01020_DayDuCacChuSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if(n==0){
                System.out.println("Impossible");
                continue;
            }
            else{
                Set<Character> set=new HashSet<>();
                int i=1;
            
                while(set.size()<10){
                    int tmp=n*i;
                    String res=String.valueOf(tmp);
                    for(int j=0;j<res.length();j++){
                        set.add(res.charAt(j));
                    }
                    if(set.size()==10){
                        System.out.println(tmp);
                    }
                    i++;
                }
            }
        }
    }

}
/*
5
0
1
2
11
1692
*/
