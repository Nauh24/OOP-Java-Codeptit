/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06005_QuanLyBanHang1;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String name,sex,bd,add;
    private String id;
    private static int cnt=1;

   
    
    public KhachHang(String name, String sex, String bd, String add) {
        this.name = name;
        this.sex = sex;
        this.bd = bd;
        this.add = add;
        this.id="KH"+String.format("%03d",cnt++);
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getBd() {
        return bd;
    }

    public String getAdd() {
        return add;
    }

    public String getId() {
        return id;
    }

    public static int getCnt() {
        return cnt;
    }
    
}
