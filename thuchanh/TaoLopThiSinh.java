/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh;

import java.util.ArrayList;
import java.util.Scanner;

class ThiSinh{
    private String id,name,danToc;
    private double toan,ly,hoa;
    private int giaiQuocGia;

    public ThiSinh(String id, String name, String danToc, double toan, double ly, double hoa, int giaiQuocGia) {
        this.id = id;
        this.name = name;
        this.danToc = danToc;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.giaiQuocGia = giaiQuocGia;
    }
    public int diemUuTien(){
        if(id.charAt(2)=='2') return 1;
        else if(id.charAt(2)=='3') return 2;
        else return 0;
    }
    public double uuTienGiai(){
        if(giaiQuocGia==1) return 1.5;
        else if(giaiQuocGia==2) return 1;
        else if(giaiQuocGia==3 ) return 0.5;
        else return 0;
    }
    public double tongUuTien(){
        if(danToc.equals("kinh")) return diemUuTien()+uuTienGiai();
        else return diemUuTien()+uuTienGiai()+1;
    }
    public double tongDiem(){
        return toan+ly+hoa;
    }
    public String status(){
        if(tongDiem()+tongUuTien()>=26.8) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    public static boolean isInteger(double x){
        return Math.floor(x)==x;
    }
    public String toString(){
        String s="";
        s= id+" "+name+" ";
        if(isInteger(tongUuTien())){
            s+=String.format("%.0f",tongUuTien());
        }
        else s+=String.format("%.1f",tongUuTien());
        s+=" ";
        if(isInteger(tongDiem())){
            s+=String.format("%.0f",tongDiem());
        }
        else s+=String.format("%.1f",tongDiem());
        s+=" "+status();
        return s;
    }
}
public class TaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list=new ArrayList<>(n);
        while (n -- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String danToc=sc.nextLine();
            double toan=Double.parseDouble(sc.nextLine());
            double ly=Double.parseDouble(sc.nextLine());
            double hoa=Double.parseDouble(sc.nextLine());
            int giai=Integer.parseInt(sc.nextLine());
            ThiSinh ts=new ThiSinh(id, name, danToc, toan, ly, hoa, giai);
            list.add(ts);
        }
        for(ThiSinh i :list){
            System.out.println(i);
        }
    }
}
/*
2
KV2A002
To An An
kinh
9
9
7
0
KV3A004
Lo Van Lo
Tay
9
9
7
3
*/