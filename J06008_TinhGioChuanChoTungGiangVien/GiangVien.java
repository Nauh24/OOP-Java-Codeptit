/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06008_TinhGioChuanChoTungGiangVien;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GiangVien {
    private String maGiangVien,tenGiangVien;
    //private double soGioChuan;
    //private ArrayList<MonHoc> monHocs=new ArrayList<>();
    public GiangVien(String maGiangVien, String tenGiangVien) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
      //  this.monHocs=monHocs;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

//    public double getSoGioChuan() {
//        return soGioChuan;
//    }
    
}
