/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05062_HocBongSinhVien;

import javax.tools.Tool;

/**
 *
 * @author PTIT
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private Float gpa;
    private int drl;
    private int rank;
    private String hb;
    private boolean check;
    public SinhVien(String ten, float gpa, int drl) {
        this.ten = ten;
        this.gpa = gpa;
        this.drl = drl;
    }

    public float getGpa() {
        return gpa;
    }

    public int getRank() {
        return rank;
    }
    public void setRank(int n){
        this.rank=n;
    }
    public void status(){
        if(check){
            if(gpa>=3.6&&drl>=90) hb="XUATSAC";
            else if(gpa>=3.2&&drl>=80) hb="GIOI";
            else if(gpa>=2.5&&drl>=70) hb="KHA";
            //hb="CO";
            else hb="KHONG";
        }
        else hb="KHONG";
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
    
    @Override
    public int compareTo(SinhVien o) {
        return o.gpa.compareTo(gpa);
    }
    public String toString(){
        status();
        return ten+": "+hb;
    }
}
