/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05080_LopHocPhan2;

import J05079_LopHocPhan1.*;

/**
 *
 * @author Admin
 */
public class LopHocPhan implements Comparable<LopHocPhan>{
    private String id,name,nhom,tenGiangVien;

    public LopHocPhan(String id, String name, String nhom, String tenGiangVien) {
        this.id = id;
        this.name = name;
        this.nhom = nhom;
        this.tenGiangVien = tenGiangVien;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return id+" "+name+" "+nhom;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    @Override
    public int compareTo(LopHocPhan o) {
        if(id.compareTo(o.id)==0)
        return nhom.compareTo(o.nhom);
        else return id.compareTo(o.id);
    }
}
