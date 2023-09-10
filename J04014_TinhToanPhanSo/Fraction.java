
package J04014_TinhToanPhanSo;

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
    public Fraction add(Fraction f){
        long tuSo=this.tu*f.mau+this.mau*f.tu;
        long mauSo=this.mau*f.mau;
        Fraction kq =new Fraction(tuSo, mauSo);
        kq.rutGon();
        return kq;
    }
    public Fraction mul(Fraction p){
       long tuSo=this.tu*p.tu;
       long mauSo=this.mau*p.mau;
       Fraction kq =new Fraction(tuSo, mauSo);
       kq.rutGon();
       return kq;
    }
    public String toString(){
        
        return tu+"/"+mau;
    }
}
