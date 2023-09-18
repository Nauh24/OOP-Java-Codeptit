
package thuchanh;

import java.util.Scanner;

class Fraction {
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
    public void mul(Fraction f){
        this.tu=this.tu*f.tu;
        this.mau=this.mau*f.mau;
        rutGon();
    }
    public String toString(){
        if(this.tu ==this.mau) return "1"; 
        return this.tu+"/"+this.mau;
    }
}
public class Tich2PhanSo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Fraction a=new Fraction(sc.nextLong(),sc.nextLong());
        Fraction b=new Fraction(sc.nextLong(),sc.nextLong());
        a.mul(b);
        System.out.println(a);
    }
}
