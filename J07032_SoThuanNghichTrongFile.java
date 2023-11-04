
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class J07032_SoThuanNghichTrongFile {
    static boolean check(String s){
        StringBuilder sb=new StringBuilder(s).reverse();
        if(!s.equals(sb.toString())) return false;
        if(s.length()==1 || s.length()%2==0) return false;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0') %2==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 =new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1=(ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 =new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2=(ArrayList<Integer>) ois2.readObject();
        HashMap<Integer,Integer> map=new HashMap<>();
        TreeSet<Integer> ts=new TreeSet<>();
        for(Integer i: list1){
            if(check(i.toString()) && list2.contains(i)){
                if(map.containsKey(i)){
                    map.put(i, map.get(i)+1);
                }
                else{
                    ts.add(i);
                    map.put(i, 1);
                }
            }
        }
        for(Integer i: list2){
            if(check(i.toString()) && list1.contains(i)){
                if(map.containsKey(i)){
                    map.put(i, map.get(i)+1);
                }
                else{
                    ts.add(i);
                    map.put(i, 1);
                }
            }
        }
        
        int cnt=0;
        for(Integer i :ts){
            System.out.println(i+" "+map.get(i));
            cnt++;
            if(cnt==10) break;
        }
    }
}
