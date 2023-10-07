
package thuchanh.TaoLopVanDongVienChay;

public class VanDongVien {
    private String ma;
    private String ten;
    private double luong;

    public VanDongVien() {
       
    }

    public VanDongVien(String ma, String ten, double luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }
    

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
