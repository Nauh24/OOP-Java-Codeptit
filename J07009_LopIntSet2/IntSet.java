/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07009_LopIntSet2;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set;
    
    public IntSet(TreeSet<Integer> set){
        this.set=set;
    }
    public IntSet(int[] a) {
        set=new TreeSet<>();
        for(int i: a){
            set.add(i);
        }
    }
    public IntSet intersection(IntSet o){
        TreeSet<Integer> res=new TreeSet<>();
        for(int i:o.set){
            if(set.contains(i)){
                res.add(i);
            }
        }
        return new IntSet(res);
    }
    public String toString(){
      String s="";
      for(int i:set){
          s+=i+" ";
      }
      return s;
    }
}
