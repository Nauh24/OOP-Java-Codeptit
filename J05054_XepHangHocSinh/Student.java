/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05054_XepHangHocSinh;

public class Student {
    private String name,id;
    private double diemTB;
    private static int cnt=1;
    private int xepHang;
    public Student(String name, double diemTB) {
        this.name = name;
        this.id ="HS"+String.format("%02d",cnt++);
        this.diemTB = diemTB;
    }
    public String rank(){
        if(diemTB<5) return "Yeu";
        else if(diemTB<7) return "Trung Binh";
        else if(diemTB<9) return "Kha";
        else return "Gioi";
    }

    public String getId() {
        return id;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }
    
    public String toString(){
        return id+" "+name+" "+diemTB+" "+rank()+" "+xepHang;
    }
}
