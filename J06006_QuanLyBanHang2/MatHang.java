/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06006_QuanLyBanHang2;

/**
 *
 * @author Admin
 */
public class MatHang {
    private String maMatHang,tenMatHang,donViTinh;
    private int giaMua,giaBan;
    private static int cnt=1;

   
    
    public MatHang(String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang ="MH"+String.format("%03d",cnt++);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getCnt() {
        return cnt;
    }
    public String toString(){
        return tenMatHang+" "+donViTinh+" "+giaMua+" "+giaBan+" ";
    }
}
