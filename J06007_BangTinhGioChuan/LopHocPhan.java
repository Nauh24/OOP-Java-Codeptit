/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06007_BangTinhGioChuan;

/**
 *
 * @author Admin
 */
public class LopHocPhan {
    private String maGiangVien;
    private String maMonHoc;
    private double gioChuan;
    //private GiangVien gv;

    public LopHocPhan(String maGiangVien, String maMonHoc, double gioChuan) {
        this.maGiangVien = maGiangVien;
        this.maMonHoc = maMonHoc;
        this.gioChuan = gioChuan;
    }
    public String getMaMonHoc() {
        return maMonHoc;
    }
    public double getGioChuan() {
        return gioChuan;
    }
    public String getMaGiangVien() {
        return maGiangVien;
    }
    
}
