
package J05041_SapXepBangTinhCong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list =new ArrayList<>(n);
                
        while (n-- >0){
            String name=sc.nextLine();
            int luongCoBan=Integer.parseInt(sc.nextLine());
            int soNgayCong=Integer.parseInt(sc.nextLine());
            String chucVu=sc.nextLine();
            NhanVien nv=new NhanVien(name,luongCoBan,soNgayCong,chucVu);
            list.add(nv);
        }
        Collections.sort(list);
        for(NhanVien i :list){
            System.out.println(i);
        }
    }
}
/*
3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
*/