
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class J07040_LietKeTheoThuTuXuatHien {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list=(ArrayList<String>) ois.readObject();
        Set<String> set=new LinkedHashSet<>();
        Scanner sc =new Scanner(new File("VANBAN.in"));
        try{
            Set<String> set1=new LinkedHashSet<>();
            for(String i: list){
                for(String j : i.split("\\s+")){
                    set1.add(j.toLowerCase());
                }
            }
            while(sc.hasNext()){
                String s=sc.next().toLowerCase();
                if(set1.contains(s)){
                    set.add(s);
                }
            }
            for(String i: set){
                System.out.println(i);
            }
        }catch(NullPointerException e){
        }
    }
}
