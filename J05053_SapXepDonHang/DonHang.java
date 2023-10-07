/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05053_SapXepDonHang;

/**
 *
 * @author Admin
 */
public class DonHang implements Comparable<DonHang>{
    private String name,id;
    private int donGia,soLuong;

    public DonHang(String name, String id, int donGia, int soLuong) {
        this.name = name;
        this.id = id;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public String stt(){
        return id.substring(1,4);
    }
    public int discount(){
        if(id.endsWith("1")) return (int) (0.5*donGia*soLuong);
        else return (int) (0.3*donGia*soLuong);
    }
    public Integer thanhTien(){
        return donGia*soLuong-discount();
    }
    public String toString(){
        return name+" "+id+" "+stt()+" "+discount()+" "+thanhTien();
    }

    @Override
    public int compareTo(DonHang o) {
        //return this.thanhTien().compareTo(o.thanhTien());
          return this.stt().compareTo(o.stt());
    }
}
