
package J05038_BangKeTienLuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list =new ArrayList<>(n);
        while(n-- >0){
            String name =sc.nextLine();
            int luongNgay=Integer.parseInt(sc.nextLine());
            int soNgayCong=Integer.parseInt(sc.nextLine());
            String chucVu=sc.nextLine();
            NhanVien nv =new NhanVien(name, luongNgay, soNgayCong, chucVu);
            list.add(nv);
        }
        int sum=0;
        for(NhanVien i : list){
            sum+=i.thucLinh();
            System.out.println(i);
        }
        System.out.print("Tong chi phi tien luong: ");
        System.out.println(sum);
    }
}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
*/