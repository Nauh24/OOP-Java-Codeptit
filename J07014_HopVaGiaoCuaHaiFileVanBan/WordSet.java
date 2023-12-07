
package J07014_HopVaGiaoCuaHaiFileVanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;

    public WordSet(String s) throws FileNotFoundException {
        this.set = new TreeSet<>();
        Scanner sc=new Scanner(new File(s));
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }
    public WordSet(TreeSet<String> set){
        this.set=set;
    }
    public WordSet union(WordSet o){
        TreeSet<String> res=new TreeSet<>();
        for(String i:set){
            res.add(i);
        }
        for(String i:o.set){
            res.add(i);
        }
        return new WordSet(res);
    }
    public WordSet intersection(WordSet o){
        TreeSet<String> res=new TreeSet<>();
        for(String i:o.set){
            if(set.contains(i)) res.add(i);
        }
        return new WordSet(res);
    }
    public String toString(){
        String s="";
        for(String i:set){
            s+=i+" ";
        }
        return s;
    }
}
