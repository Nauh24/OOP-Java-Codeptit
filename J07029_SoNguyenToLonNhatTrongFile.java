
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
public class J07029_SoNguyenToLonNhatTrongFile {
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws  IOException, ClassNotFoundException {
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list=(ArrayList<Integer>) ois.readObject();
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i: list){
            if(isPrime(i)){
                if(map.containsKey(i)){
                    map.put(i, map.get(i)+1);
                }
                else{
                    map.put(i, 1);
                    res.add(i);
                }
            }
        }
        Collections.sort(res,Comparator.reverseOrder());
        int cnt=0;
        for(int i: res){
            System.out.println(i+" "+map.get(i));
            cnt++;
            if(cnt==10) break;
        }
    }
}
