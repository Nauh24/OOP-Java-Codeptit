/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06006_QuanLyBanHang2;

/**
 *
 * @author Admin
 */
public class HoaDon implements Comparable<HoaDon>{
    private String maHoaDon;
    private int soLuong;
    private KhachHang kh;
    private MatHang mh;
    private static int cnt=1;
    public HoaDon( int soLuong, KhachHang kh, MatHang mh) {
        this.maHoaDon ="HD"+String.format("%03d",cnt++);
        this.soLuong = soLuong;
        this.kh = kh;
        this.mh = mh;
    }
    public int thanhTien(){
        return mh.getGiaBan()*soLuong;
    }
    public Integer loiNhuan(){
        return thanhTien()-(soLuong*mh.getGiaMua());
    }
    public String toString(){
        return maHoaDon+" "+kh.getName()+" "+kh.getAdd()+" "+mh.getTenMatHang()+" "+soLuong+" "+thanhTien()+" "+loiNhuan();
    }

    @Override
    public int compareTo(HoaDon o) {
        return o.loiNhuan().compareTo(this.loiNhuan());
    }
}
