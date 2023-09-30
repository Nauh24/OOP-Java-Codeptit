package J05026_DanhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>(n);
        while (n-- > 0) {
            String name = sc.nextLine();
            String mon = sc.nextLine();
            GiangVien gv = new GiangVien(name, mon);
            list.add(gv);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            String res = "";
            s = s.toUpperCase();
            String[] ans = s.split("\\s+");
            for (String i : ans) {
                res += i.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+res+":");
            for(GiangVien i : list){
                if(i.formatMon().equals(res)) System.out.println(i);
            }
        }
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
Cong nghe phan mem
*/