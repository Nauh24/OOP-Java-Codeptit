import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class J07016_SoNguyenToTrongHaiFileNhiPhan {
    public static boolean [] f=new boolean[10000];
    public static void sieve(){
        for(int i=0;i<10000;i++){
            f[i]=true;
        }
        f[0]=f[1]=false;
        for(int i=2;i<Math.sqrt(10000);i++){
            if(f[i]){
                for(int j=i*i;j<10000;j+=i) f[j]=false;
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> res = new TreeSet<>();
        
        sieve();
        for (int i : list1) {
            if (f[i]) {
                if (map1.containsKey(i)) {
                    map1.put(i, map1.get(i) + 1);
                } else {
                    map1.put(i, 1);
                }
                res.add(i);
            }
        }
        for (int i : list2) {
            if (res.contains(i) && f[i]) {
                set.add(i);
                if (map2.containsKey(i)) {
                    map2.put(i, map2.get(i) + 1);
                } else {
                    map2.put(i, 1);
                }
            }

        }
        for (int i : set) {
            System.out.println(i + " " + map1.get(i) + " " + map2.get(i));
        }
    }
}