package thuchanh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class XuLyVanBan2 {
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) return true;
        }
        return false;
    }
    public static boolean check2(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'||s.charAt(i)==','||s.charAt(i)=='!'||
                    s.charAt(i)=='?'||s.charAt(i)==':') return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> list=new TreeSet<>();
        while(sc.hasNext()){
            String s=sc.next();
            if(check(s)&&check2(s)) list.add(s);
        }
        for(String i :list){
            System.out.println(i);
        }
    }
}
