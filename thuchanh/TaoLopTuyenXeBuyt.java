/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Bus{
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
    public int tong(){
        return loiNhuan();
    }
    public String toString(){
        return id+" "+name+" "+ngayDi+" "+soHieuTuyen+" "+soLuotDi+" "+kieuNgay+" "+loiNhuan();
        //return kieuNgay;
    }
}
public class TaoLopTuyenXeBuyt {
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
        
        for(Bus i : list){
            System.out.println(i);
        }
    }
}
/*
2
To An An
12/09/2023
21
9
thuong
do trung tuan
01/10/2023
2
12
le
*/