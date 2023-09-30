
package J05044_LietKeNhanVienTheoChucVu;

import java.util.ArrayList;
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
        String s =sc.nextLine();
        for(NhanVien i : list){
            if(s.equals(i.getChucVu()))
            System.out.println(i);
        }
    }
}
/*
4
Tran Thi Yen
NV
1000
24
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
TP
*/