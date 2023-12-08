/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07074_LichGiangDayTheoMonHoc;

/**
 *
 * @author Admin
 */
public class MonHoc {
    private String maMon,tenMon;
    private  int soTin;

    public MonHoc(String maMon, String tenMon, int soTin) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTin = soTin;
    }

    public String getTenMon() {
        return tenMon;
    }
}
