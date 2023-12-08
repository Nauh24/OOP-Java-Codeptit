/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07074_LichGiangDayTheoMonHoc;

/**
 *
 * @author Admin
 */
public class LopHocPhan implements Comparable<LopHocPhan>{
    private String maNhom,maMon;
    private int thu,kip;
    private String tenGv,idPhong;
    private static int cnt=1;

    public LopHocPhan(String maMon, int thu, int kip, String tenGv, String idPhong) {
        this.maMon = maMon;
        this.thu = thu;
        this.kip = kip;
        this.tenGv = tenGv;
        this.idPhong = idPhong;
        this.maNhom="HP"+String.format("%03d",cnt++);
    }

    @Override
    public int compareTo(LopHocPhan o) {
        String s1=String.valueOf(thu)+String.valueOf(kip);
        String s2=String.valueOf(o.thu)+String.valueOf(o.kip);
        
        if(s1.equals(s2)){
            return tenGv.compareTo(o.tenGv);
        }
        else return s1.compareTo(s2);
    }

    public String getMaMon() {
        return maMon;
    }

    public String getMaNhom() {
        return maNhom;
    }
    public String toString(){
        return maNhom+" "+thu+" "+kip+" "+tenGv+" "+idPhong;
    }
    
}
