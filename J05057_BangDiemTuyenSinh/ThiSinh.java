/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05057_BangDiemTuyenSinh;

/**
 *
 * @author Admin
 */
public class ThiSinh {
    private String id,name;
    private double toan,ly,hoa;

    public ThiSinh(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public double diemUuTien(){
        if(id.charAt(2)=='1') return 0.5;
        else if(id.charAt(2)=='2') return 1;
        else return 2.5;
    }
    public double tongDiem(){
        return 2*toan+ly+hoa;
    }
    public String status(){
        if(tongDiem()+diemUuTien()>=24) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    public String toString(){
        String s=id+" "+name+" ";
        if(diemUuTien()==(int)diemUuTien()){
            s+=String.format("%.0f", diemUuTien());
        }
        else s+=diemUuTien();
        s+=" ";
        if(tongDiem()==(int)tongDiem()){
            s+=String.format("%.0f",tongDiem());
        }
        else s+=tongDiem();
        s+=" "+status();
        return s;
    }
}
