
package J05037_TinhGiaBan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list =new ArrayList<>(n);
        while (n-- >0){
            String name =sc.nextLine();
            String unit=sc.nextLine();
            int unitCost=Integer.parseInt(sc.nextLine());
            int amount =Integer.parseInt(sc.nextLine());
            MatHang mh =new MatHang(name, unit, unitCost, amount);
            list.add(mh);
        }
        Collections.sort(list);
        for(MatHang i : list){
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