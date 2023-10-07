/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05064_BangThuNhapGiaoVien;

/**
 *
 * @author Admin
 */
public class GiaoVien {
    private String id,name;
    private int luong ;

    public GiaoVien(String id, String name, int luong) {
        this.id = id;
        this.name = name;
        this.luong = luong;
    }
    public int phuCap(){
        String s=id.substring(0,2);
        if(s.equals("HT")) return 2000000;
        else if(s.equals("HP")) return 900000;
        else return 500000;
    }
    public int heSoLuong(){
        String s=id.substring(2);
        return Integer.parseInt(s);
    }
    public int thuNhap(){
        return luong*heSoLuong()+phuCap();
    }
    public String toString(){
        return id+" "+name+" "+heSoLuong()+" "+phuCap()+" "+thuNhap();
    }
}
/*
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
*/