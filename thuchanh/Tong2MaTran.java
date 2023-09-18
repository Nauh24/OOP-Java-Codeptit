package thuchanh;

import java.util.Scanner;

class Matran {
    private int [][] a;
    private int n;

    public Matran(int n) {
        this.n = n;
       
    }

    public Matran(int[][] a) {
        this.a = a;
    }

    public int[][] getMatran() {
        return a;
    }
    public int getKT(){
        return n;
    }
    public void tong(Matran b){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] =a[i][j]+b[i][j];   
            }
        }
    }
    public void input() {
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public void out(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class Tong2MaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //nhap kich thuoc
    int n = sc.nextInt();
    Matran m = new Matran(n);
    //nhap ma tran a

    m.input ();
    Matran b = new Matran(m.getKT());
    //nhap ma tran b

    b.input ();
    Matran t = m.tong(b.getMatran());
    //viet ra ma tran tong
    
    t.out ();
    }
    
}
