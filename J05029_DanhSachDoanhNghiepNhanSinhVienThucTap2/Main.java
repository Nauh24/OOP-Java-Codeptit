
package J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> list =new ArrayList<>(n);
        while (n-- >0){
            String id =sc.nextLine();
            String name=sc.nextLine();
            int number =Integer.parseInt(sc.nextLine());
            DoanhNghiep dn =new DoanhNghiep(id, name, number);
            list.add(dn);
        }
        Collections.sort(list);
        int q=Integer.parseInt(sc.nextLine());
        while(q-- >0){
            int a = sc.nextInt(),b =sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(DoanhNghiep i : list){
                if(i.getNumber()>=a &&i.getNumber()<=b){
                    System.out.println(i);
                }
            }
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
1
30 50
*/
