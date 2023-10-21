
package thuchanh;
//xu ly van ban 1
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class XuLiVanBan1 {
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.txt"));
        Set<String> list=new TreeSet<>();
        while(sc.hasNext()){
            String s=sc.next();
            if(check(s)) list.add(s);
        }
        for(String i :list){
            System.out.println(i);
        }
    }
    
}
