/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05061_SapXepKetQuaXetTuyen;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Person implements Comparable<Person>{
    private String id,name;
    private Date bd;
    private double lyThuyet,thucHanh;
    private static int cnt=1;
    public Person(String name, Date bd, double lyThuyet, double thucHanh) {
        this.name = name;
        this.bd = bd;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        this.id="PH"+String.format("%02d", cnt++);
    }
    public double diemThuong(){
        if(lyThuyet>=8 &&thucHanh>=8) return 1;
        if(lyThuyet>=7.5 && thucHanh>=7.5) return 0.5;
        return 0;
    }
    public Double diemXepLoai(){
        double sum=(lyThuyet+thucHanh)/2 +diemThuong();
        sum=Math.round(sum);
        if(sum>10) sum=10;
        return sum;
    }
    public String xepLoai(){
        if(diemXepLoai()<5) return "Truot";
        else if(diemXepLoai()<=6) return "Trung binh";
        else if (diemXepLoai()<=7) return "Kha";
        else if(diemXepLoai()<=8) return "Gioi";
        else return "Xuat sac";
    }
    public int tuoi(){
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy");
        int age=Integer.parseInt(sdf.format(bd));
        return 2021-age;
    }
    public String toString(){
        return id+ " "+name+" "+tuoi()+" "+String.format("%.0f", diemXepLoai())+" "+xepLoai();
    }

    @Override
    public int compareTo(Person o) {
        return o.diemXepLoai().compareTo(this.diemXepLoai());
    }
}
