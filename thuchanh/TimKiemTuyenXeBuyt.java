/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Bus implements Comparable<Bus>{
    private String name,ngayDi;
    private int soHieuTuyen,soLuotDi;
    private String kieuNgay;
    private String id;
    private static int cnt=1;

    public Bus(String name, String ngayDi, int soHieuTuyen, int soLuotDi, String kieuNgay) {
        this.name = name;
        this.ngayDi = ngayDi;
        this.soHieuTuyen = soHieuTuyen;
        this.soLuotDi = soLuotDi;
        this.kieuNgay = kieuNgay;
        this.id="HN"+soHieuTuyen+String.format("%02d", cnt++);
    }
    public int loiNhuan(){
        switch (kieuNgay) {
            case "nghi":
                return (int) (doanhThu()+doanhThu()*0.1);
            case "le":
                return (int) (doanhThu()+doanhThu()*0.2);
            default: return doanhThu();
        }
    }
    public int doanhThu(){
        int dt=0;
        if(soLuotDi<5) dt= soLuotDi*800;
        else if(soLuotDi<=10) dt= soLuotDi*780;
        else dt= soLuotDi*750;
        return dt;
    }
    
    public String toString(){
        return id+" "+name+" "+ngayDi+" "+soHieuTuyen+" "+soLuotDi+" "+kieuNgay+" "+loiNhuan();
    }

    public String getKieuNgay() {
        return kieuNgay;
    }

    public String getNgayDi() {
        return ngayDi;
    }
    
    @Override
    public int compareTo(Bus o) {
        return o.ngayDi.compareTo(this.ngayDi);
    }
}
public class TimKiemTuyenXeBuyt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Bus> list=new ArrayList<>(n);
        while (n -- >0){
            String name=sc.nextLine();
            String ngay=sc.nextLine();
            int soHieu=Integer.parseInt(sc.nextLine());
            int soLuot=Integer.parseInt(sc.nextLine());
            String loai=sc.nextLine();
            Bus b=new Bus(name, ngay, soHieu, soLuot, loai);
            list.add(b);
        }
        Collections.sort(list);
        boolean ok=false;
        int c=Integer.parseInt(sc.nextLine());
        for(Bus i : list){
            String s=i.getNgayDi().substring(3,5);
            int a=Integer.parseInt(s);
            if(c==a){
                ok=true;
                System.out.println(i);
                break;
            }
        }
        if(!ok) System.out.println("khong co");
    }
}
/*
3
To An An
20/03/2023
21
9
thuong
do trung tuan
12/09/2023
2
12
le
Vu thi Hoa
23/03/2023
10
10
thuong
3

*/