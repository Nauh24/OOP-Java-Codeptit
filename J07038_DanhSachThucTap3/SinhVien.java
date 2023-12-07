/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07038_DanhSachThucTap3;

/**
 *
 * @author Admin
 */
public class SinhVien implements Comparable<SinhVien>{
    private String id,name,lop,email;

    public SinhVien(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return id.compareTo(o.id);
    }
    
}
