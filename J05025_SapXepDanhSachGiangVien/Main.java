
package J05025_SapXepDanhSachGiangVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list =new ArrayList<>(n);
        
        while (n -- >0){
            String name =sc.nextLine();
            String mon =sc.nextLine();
            GiangVien gv =new GiangVien(name, mon);
            list.add(gv);
        }
        Collections.sort(list);
        for(GiangVien i : list){
            System.out.println(i);
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
*/