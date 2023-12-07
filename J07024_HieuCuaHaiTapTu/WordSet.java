/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07024_HieuCuaHaiTapTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class WordSet {
    private TreeSet<String> set;
    public WordSet(TreeSet<String> res){
        set=new TreeSet<>(res);
    }
    public WordSet(String s) throws FileNotFoundException {
        set=new TreeSet<>();
        Scanner sc=new Scanner(new File(s));
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }
    public WordSet difference(WordSet o){
        TreeSet<String> res=new TreeSet<>();
        for(String i:set){
            if(!o.set.contains(i)) res.add(i);
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
