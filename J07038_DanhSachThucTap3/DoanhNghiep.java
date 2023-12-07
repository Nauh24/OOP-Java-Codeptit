/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07038_DanhSachThucTap3;

/**
 *
 * @author Admin
 */
public class DoanhNghiep {
    private String id,name;
    private int soLuong;
    private SinhVien sv;

    public DoanhNghiep(String id, String name, int soLuong, SinhVien sv) {
        this.id = id;
        this.name = name;
        this.soLuong = soLuong;
        this.sv = sv;
    }

    public DoanhNghiep(String id, String name, int soLuong) {
        this.id = id;
        this.name = name;
        this.soLuong = soLuong;
    }
    
}
