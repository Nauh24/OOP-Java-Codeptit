/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06006_QuanLyBanHang2;

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
        ArrayList<KhachHang> khachHangs=new ArrayList<>(n);
        while(n-- >0){
            String name=sc.nextLine();
            String sex=sc.nextLine();
            String bd=sc.nextLine();
            String add=sc.nextLine();
            KhachHang kh=new KhachHang(name, sex, bd, add);
            khachHangs.add(kh);
        }
        int m=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> matHangs=new ArrayList<>(m);
        while(m-- >0){
            String tenMatHang=sc.nextLine();
            String donVi=sc.nextLine();
            int giaMua=Integer.parseInt(sc.nextLine());
            int giaBan=Integer.parseInt(sc.nextLine());
            MatHang mh=new MatHang(tenMatHang, donVi, giaMua, giaBan);
            matHangs.add(mh);
        }
        int k=sc.nextInt();
        ArrayList<HoaDon> hoaDons=new ArrayList<>(k);
        while(k-- >0){
            String maKhacHang=sc.next();
            String maMatHang=sc.next();
            int soLuong=sc.nextInt();
            KhachHang kh=khachHangs.get(0);
            MatHang mh=matHangs.get(0);
            for(KhachHang i : khachHangs){
                if(i.getId().equals(maKhacHang)){
                    kh=i;
                    break;
                }
            }
            for(MatHang i: matHangs){
                if(i.getMaMatHang().equals(maMatHang)){
                    mh=i;
                    break;
                }
            }
            HoaDon hd=new HoaDon(soLuong, kh, mh);
            hoaDons.add(hd);
        }
        Collections.sort(hoaDons);
        for(HoaDon i : hoaDons){
            System.out.println(i);
        }
    }
}
/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
*/