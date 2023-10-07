/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06002_SapXepHoaDonBanQuanAo;

/**
 *
 * @author Admin
 */
public class HoaDon extends SanPham implements Comparable<HoaDon> {

    private String maHoaDon;
    private int soLuongMua;
    private static int cnt = 1;
    //private SanPham sp;

    public HoaDon(String maHoaDon, int soLuongMua, String maLoai, String tenSanPham, int donGiaLoai1, int donGiaLoai2) {
        super(maLoai, tenSanPham, donGiaLoai1, donGiaLoai2);
        this.maHoaDon = maHoaDon + String.format("-%03d", cnt++);
        this.soLuongMua = soLuongMua;
    }

    public long thanhTien() {
        if (maHoaDon.charAt(2) == '1') {
            return soLuongMua * super.getDonGiaLoai1();
        } else {
            return soLuongMua * super.getDonGiaLoai2();
        }
    }

    public long giamGia() {
        if (soLuongMua >= 150) {
            return (long) (0.5 * thanhTien());
        } else if (soLuongMua >= 100) {
            return (long) (0.3 * thanhTien());
        } else if (soLuongMua >= 50) {
            return (long) (0.15 * thanhTien());
        } else {
            return 0;
        }
    }

    public Long tongTien() {
        return thanhTien() - giamGia();
    }

    public String toString() {
        return maHoaDon + " " + getTenSanPham() + " " + giamGia() + " " + tongTien();
    }

    @Override
    public int compareTo(HoaDon o) {
        return o.tongTien().compareTo(this.tongTien());
    }
}
