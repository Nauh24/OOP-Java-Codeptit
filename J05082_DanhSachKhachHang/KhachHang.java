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
public class KhachHang implements Comparable<KhachHang>{
    private String id,name,sex,add;
    private String date;
    private static int cnt=1;

    public KhachHang(String name, String sex,  String date,String add) {
        this.name = name;
        this.sex = sex;
        this.add = add;
        this.date = date;
        this.id="KH"+String.format("%03d",cnt++);
    }
    public void chuanHoaTen(){
       name=name.toLowerCase().trim();
       String res="";
        String[] s=name.split("\\s+");
        for(String i: s){
            res+=i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        }
        this.name=res;
    }
    public void chuanHoaBd(){
        StringBuilder sb=new StringBuilder(date);
        if(sb.charAt(2)!='/') sb.insert(0, "0");
        if(sb.charAt(5)!='/') sb.insert(3, "0");
        date=sb.toString();
    }
    public String bd(){
        chuanHoaBd();
        String s="";
        s+=date.substring(6)+date.substring(3,5)+date.substring(0,2);
        return s;
    }
    public String toString(){
        chuanHoaTen();
        chuanHoaBd();
        return id+" "+name+" "+sex+" "+add+ " "+date;
    }

    @Override
    public int compareTo(KhachHang o) {
        return bd().compareTo(o.bd());
    }
    
}
