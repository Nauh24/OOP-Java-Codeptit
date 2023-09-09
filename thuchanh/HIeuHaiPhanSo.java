
package thuchanh;

import java.util.Scanner;
class Fraction {
    private long tu,mau;

    public Fraction(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
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
    public void sub(Fraction f){
        this.tu=this.tu*f.mau-this.mau*f.tu;
        this.mau=this.mau*f.mau;
        rutGon();
    }
    public String toString(){
///        if(this.tu==0) return "0";
        return this.tu+"/"+this.mau;
    }
}
public class HIeuHaiPhanSo {
      public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Fraction a=new Fraction(sc.nextLong(),sc.nextLong());
        Fraction b=new Fraction(sc.nextLong(),sc.nextLong());
        a.sub(b);
        if(a.getTu()==0) System.out.println("0");
        else 
          System.out.println(a);
    }
}
