
package J05045_SapXepNhanVienTheoThuNhap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list =new ArrayList<>(n);
        
        while(n-- >0){
            String name =sc.nextLine();
            String chucVu =sc.nextLine();
            int luongCoBan=Integer.parseInt(sc.nextLine());
            int soNgayCong =Integer.parseInt(sc.nextLine());
            NhanVien nv=new NhanVien(name,chucVu, luongCoBan, soNgayCong);
            list.add(nv);
        }
         Collections.sort(list);
        for(NhanVien i : list){
            System.out.println(i);
        }
    }
}
/*
4
Tran Thi Yen
GD
5000
28
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
*/