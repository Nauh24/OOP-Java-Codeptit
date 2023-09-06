
package J04004_TongPhanSo;

public class Fraction {
    private long tu,mau;

    public Fraction(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

 
    public long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public void rutGon(){
        long x=gcd(this.tu, this.mau);
        this.tu/=x;
        this.mau/=x;
    }
    public void sum(Fraction f){
        this.tu=this.tu*f.mau+this.mau*f.tu;
        this.mau=this.mau*f.mau;
        rutGon();
    }
    public String toString(){
        return this.tu+"/"+this.mau;
    }
}
