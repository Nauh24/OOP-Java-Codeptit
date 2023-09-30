
package J05036_TinhGiaBan1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list =new ArrayList<>(n);
        while (n -- >0){
            String name =sc.nextLine();
            String unit =sc.nextLine();
            int dgNhap=Integer.parseInt(sc.nextLine());
            int count =Integer.parseInt(sc.nextLine());
            MatHang mh =new MatHang(name, unit, dgNhap, count);
            list.add(mh);
        }
        for(MatHang i : list ){
            System.out.println(i);
        }
    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
*/