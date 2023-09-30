
package J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> list =new ArrayList<>(n);
        while(n -- >0){
            String id =sc.nextLine();
            String name =sc.nextLine();
            int number=Integer.parseInt(sc.nextLine());
            DoanhNghiep dn =new DoanhNghiep(id, name, number);
            list.add(dn);
        }
        Collections.sort(list);
        for(DoanhNghiep i : list){
            System.out.println(i);
        }
    }
}
/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
*/