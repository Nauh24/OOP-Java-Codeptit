/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06005_QuanLyBanHang1;

/**
 *
 * @author Admin
 */
public class HoaDon{
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
    public String toString(){
        return maHoaDon+" "+kh.getName()+" "+kh.getAdd()+" "+this.mh+soLuong+" "+thanhTien();
    }
}
