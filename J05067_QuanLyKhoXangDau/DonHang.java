/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05067_QuanLyKhoXangDau;

/**
 *
 * @author Admin
 */
public class DonHang {
    private String id;
    private int count;

    public DonHang(String id, int count) {
        this.id = id;
        this.count = count;
    }
    public String hangSanXuat(){
        String s=this.id.substring(3,5);
        if(s.equals("BP")) return "British Petro";
        if(s.equals("ES")) return "Esso";
        if(s.equals("SH")) return "Shell";
        if(s.equals("CA")) return "Castrol";
        if(s.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
    public int donGia(){
        if(id.charAt(0)=='X') return 128000;
        if(id.charAt(0)=='D') return 11200;
        return 9700;
    }
    public long thue(){
        double fee=0;
        if(id.substring(3,5).equals("TN")) fee= 0;
        else if(id.charAt(0)=='X') fee= 0.03;
        else if(id.charAt(0)=='D') fee=0.035;
        else fee=0.02;
        return (long) (fee*donGia()*count);
    }
    public long thanhTien(){
        return  (thue()+1l*donGia()*count);
    }
    public String toString(){
        return id+" "+hangSanXuat()+" "+donGia()+" "+thue()+" "+thanhTien();
    }
}
