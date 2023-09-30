
package J05046_BangKeNhapKho;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list =new ArrayList<>(n);
        MatHang.initMap();
        while (n-- >0){
            String name =sc.nextLine();
            int soLuong =Integer.parseInt(sc.nextLine());
            int donGia=Integer.parseInt(sc.nextLine());
            MatHang mh =new MatHang(name, soLuong, donGia);
            list.add(mh);
        }
        for(MatHang i: list){
            System.out.println(i);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
*/