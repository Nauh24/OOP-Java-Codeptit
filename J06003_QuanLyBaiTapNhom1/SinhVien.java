/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06003_QuanLyBaiTapNhom1;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String id,name,number;
    private int stt;

    public SinhVien(String id, String name, String number, int stt) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }
    public String toString(){
        return id+" "+name+" "+number;
    }
}
