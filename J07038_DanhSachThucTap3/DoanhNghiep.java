/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07038_DanhSachThucTap3;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DoanhNghiep {
    private String id,name;
    private int soLuong;
    private SinhVien sv;
    private ArrayList<SinhVien> list=new ArrayList<>();
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
    public void update(SinhVien sv){
        list.add(sv);
    }

    public String getId() {
        return id;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public String getName() {
        return name;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public SinhVien getSv() {
        return sv;
    }
}
