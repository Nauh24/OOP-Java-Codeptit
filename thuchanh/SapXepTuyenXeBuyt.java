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
    private Integer soHieuTuyen,soLuotDi;
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
    public Integer loiNhuan(){
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
        if(loiNhuan().compareTo(o.loiNhuan())==0){
            return o.soHieuTuyen.compareTo(this.soHieuTuyen);
        }
        else return o.loiNhuan().compareTo(this.loiNhuan());
    }
}
public class SapXepTuyenXeBuyt {
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
        for(Bus i : list){
            System.out.println(i);
        }
    }
}
/*
3
To An An
21/03/2023
1
9
thuong
do trung tuan
28/03/2023
21
9
thuong
Vu thi Hoa
10/10/2023
10
15
le
*/