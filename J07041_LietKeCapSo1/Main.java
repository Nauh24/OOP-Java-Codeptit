
package J07041_LietKeCapSo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list=(ArrayList<Pair>) ois.readObject();
        ArrayList<Pair> ans=new ArrayList<>();
        HashSet<Pair> hs=new HashSet<>();
        for(Pair i : list){
            if(i.getFirst()<i.getSecond() && !hs.contains(i)){
                hs.add(i);
                ans.add(i);
            }
        }
        Collections.sort(ans);
        for(Pair i: ans){
            System.out.println(i);
        }
    }
}
