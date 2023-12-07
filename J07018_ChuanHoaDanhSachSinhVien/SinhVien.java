/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07018_ChuanHoaDanhSachSinhVien;

/**
 *
 * @author Admin
 */
public class SinhVien {

    private String id, name, grade, bd;
    private float gpa;
    private static int cnt = 1;

    public SinhVien(String name, String grade, String bd, float gpa) {
        this.name = name;
        this.grade = grade;
        this.bd = bd;
        this.gpa = gpa;
        this.id = "B20DCCN" + String.format("%03d", cnt++);
    }

    public void chuanHoaName() {
        String s[] = name.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : s) {
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        name = res;
    }

    public void chuanHoaBd() {
        StringBuilder sb = new StringBuilder(bd);
        if (sb.charAt(2) != '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(5) != '/') {
            sb.insert(3, "0");
        }
        bd=sb.toString();
    }
    public String toString(){
        chuanHoaBd();
        chuanHoaName();
        return id+" "+name+" "+grade+" "+bd+" "+String.format("%.2f", gpa);
    }
}
