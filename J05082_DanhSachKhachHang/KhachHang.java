/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05082_DanhSachKhachHang;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String id,name,sex,add;
    private Date date;
    private static int cnt=1;

    public KhachHang(String name, String sex,  Date date,String add) {
        this.name = name;
        this.sex = sex;
        this.add = add;
        this.date = date;
    }
    
    
}
