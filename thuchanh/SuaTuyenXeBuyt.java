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
class Bus {

    private String name, ngayDi;
    private int soHieuTuyen, soLuotDi;
    private String kieuNgay;
    private String id;
    private static int cnt = 1;

    public Bus(String name, String ngayDi, int soHieuTuyen, int soLuotDi, String kieuNgay) {
        this.name = name;
        this.ngayDi = ngayDi;
        this.soHieuTuyen = soHieuTuyen;
        this.soLuotDi = soLuotDi;
        this.kieuNgay = kieuNgay;
        this.id = "HN" + soHieuTuyen + String.format("%02d", cnt++);
    }

    public int loiNhuan() {
        switch (kieuNgay) {
            case "nghi":
                return (int) (doanhThu() + doanhThu() * 0.1);
            case "le":
                return (int) (doanhThu() + doanhThu() * 0.2);
            default:
                return doanhThu();
        }
    }

    public int doanhThu() {
        int dt = 0;
        if (soLuotDi < 5) {
            dt = soLuotDi * 800;
        } else if (soLuotDi <= 10) {
            dt = soLuotDi * 780;
        } else {
            dt = soLuotDi * 750;
        }
        return dt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setSoLuotDi(int soLuotDi) {
        this.soLuotDi = soLuotDi;
    }

    public void setKieuNgay(String kieuNgay) {
        this.kieuNgay = kieuNgay;
    }

    public String toString() {
        return id + " " + name + " " + ngayDi + " " + soHieuTuyen + " " + soLuotDi + " " + kieuNgay + " " + loiNhuan();
    }
}

public class SuaTuyenXeBuyt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Bus> list = new ArrayList<>(n);
        while (n-- > 0) {
            String name = sc.nextLine();
            String ngay = sc.nextLine();
            int soHieu = Integer.parseInt(sc.nextLine());
            int soLuot = Integer.parseInt(sc.nextLine());
            String loai = sc.nextLine();
            Bus b = new Bus(name, ngay, soHieu, soLuot, loai);
            list.add(b);
        }
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        int luot = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();
        boolean ok=false;
        for (Bus i : list) {
            if (i.getId().equals(ma)) {
                ok=true;
                System.out.println(i);
                i.setName(ten);
                i.setSoLuotDi(luot);
                i.setKieuNgay(type);
                System.out.println(i);
            }
        }
        if(!ok) System.out.println("khong tim thay");
    }
}
/*
2
To An An
21/03/2023
21
9
thuong
do trung tuan
28/03/2023
2
12
Le
HN2101
Le thuy
12
le
*/