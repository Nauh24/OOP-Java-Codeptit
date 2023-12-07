/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07013_DanhSachSinhVienTrongFileNhiPhan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String ma,ten,lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
        this.ma = "B20DCCN"+String.format("%03d",id);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh =sdf.parse(ngaysinh);
        this.gpa = gpa;
    }
    public String toString(){
        return ma+" "+ten+" "+lop+" "+ngaysinh+" "+String.format("%.2f",gpa);
    }
}
