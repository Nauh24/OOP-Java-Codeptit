/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06004_QuanLyBaiTapNhom2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> list =new ArrayList<>(n);
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String number=sc.nextLine();
            int stt=Integer.parseInt(sc.nextLine());
            SinhVien sv=new SinhVien(id, name, number, stt);
            list.add(sv);
        }
        ArrayList<String> baiTap =new ArrayList<>(m);
        while(m-- >0){
            baiTap.add(sc.nextLine());
        }
         Collections.sort(list);
         for(SinhVien i :list){
             System.out.print(i+" ");
             System.out.println(baiTap.get(i.getStt()-1));
             
         }
    }
}
/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
*/