/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06002_SapXepHoaDonBanQuanAo;

/**
 *
 * @author Admin
 */
public class SanPham {
    String maLoai;
    private String tenSanPham;
    private int donGiaLoai1,donGiaLoai2;

    public SanPham(String maLoai, String tenSanPham, int donGiaLoai1, int donGiaLoai2) {
        this.maLoai = maLoai;
        this.tenSanPham = tenSanPham;
        this.donGiaLoai1 = donGiaLoai1;
        this.donGiaLoai2 = donGiaLoai2;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getDonGiaLoai1() {
        return donGiaLoai1;
    }

    public int getDonGiaLoai2() {
        return donGiaLoai2;
    }
    
}
