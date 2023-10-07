/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06007_BangTinhGioChuan;

/**
 *
 * @author Admin
 */
public class GiangVien {
    private String maGiangVien,tenGiangVien;
    private double soGioChuan;
    public GiangVien(String maGiangVien, String tenGiangVien) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
    }

    
    public String getMaGiangVien() {
        return maGiangVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }
//    public int getSoGioChuan(double x){
//        return soGioChuan+x;
//    }

    public void getSoGioChuan(double x) {
         soGioChuan+=x;
    }
    
    public String toString(){
        return tenGiangVien+" "+String.format("%.2f",soGioChuan);
    }
}
