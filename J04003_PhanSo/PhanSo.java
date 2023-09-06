
package J04003_PhanSo;


public class PhanSo {
    private long tu,mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    private long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    private void rutGon(){
        long x=gcd(this.tu, this.mau);
        this.tu/=x;
        this.mau/=x;
    }
    public String toString(){
        rutGon();
        return this.tu+"/"+this.mau;
    }
}
