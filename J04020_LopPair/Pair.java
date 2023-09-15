
package J04020_LopPair;

public class Pair<T,S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    public boolean snt(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean isPrime(){
        return snt((Integer)this.first)&&snt((Integer)this.second);
    }
    public String toString(){
        return this.first+" "+this.second;
    }
}
