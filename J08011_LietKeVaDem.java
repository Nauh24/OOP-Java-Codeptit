import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
public class J08011_LietKeVaDem {
    public static boolean  check(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)<s.charAt(i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<String > list=new ArrayList<>();
        while(sc.hasNext()){
            String s=sc.next();
            if(s.equals("0")) break;
            if(check(s)){
                if(map.containsKey(s)){
                    map.put(s, map.get(s)+1);
                }
                else map.put(s, 1);
                list.add(s);
            }
            Collections.sort(list,new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return map.get(o2)-map.get(01);
                }
            });
            for(String i: list){
                System.out.println(i+" "+map.get(i));
            }
        }
    }
}
