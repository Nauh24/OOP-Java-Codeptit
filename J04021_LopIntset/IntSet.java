
package J04021_LopIntset;

import java.util.Set;
import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> ts;

    public IntSet(TreeSet<Integer> ts) {
        this.ts = ts;
    }
    
    public IntSet(int[] a) {
        this.ts =new TreeSet<>();
        for(int i=0;i<a.length;i++){
            ts.add(a[i]);
        }
    }
    public IntSet union(IntSet b){
        TreeSet<Integer> t =new TreeSet<>();
        for(int x: this.ts){
            t.add(x);
        }
        for(int x:b.ts){
            t.add(x);
        }
        return new IntSet(t);
    }
    public String toString(){
        String ans ="";
        for(int x:this.ts){
            ans+=x+" ";
        }
        return ans;
    }
}
