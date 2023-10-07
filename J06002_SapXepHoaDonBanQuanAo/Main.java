/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06002_SapXepHoaDonBanQuanAo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> sanPhams =new ArrayList<>(n);
        while(n-- >0){
            String maSanPham=sc.nextLine();
            String tenSanPham=sc.nextLine();
            int donGiaLoai1=Integer.parseInt(sc.nextLine());
            int donGiaLoai2=Integer.parseInt(sc.nextLine());
            SanPham sp=new SanPham(maSanPham, tenSanPham, donGiaLoai1, donGiaLoai2);
            sanPhams.add(sp);
        }
        int m=sc.nextInt();
        ArrayList<HoaDon> hoaDons=new ArrayList<>(m);
        while(m-- >0){
            String maHoaDon=sc.next();
            int soLuong=sc.nextInt();
            for(SanPham i : sanPhams){
                if(maHoaDon.startsWith(i.getMaLoai())){
                    HoaDon hd=new HoaDon(maHoaDon, soLuong, i.getMaLoai(), i.getTenSanPham(), i.getDonGiaLoai1(), i.getDonGiaLoai2());
                    hoaDons.add(hd);
                }
            }
        }
        Collections.sort(hoaDons);
        for(HoaDon i : hoaDons){
            System.out.println(i);
        }
    }
}
/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
*/