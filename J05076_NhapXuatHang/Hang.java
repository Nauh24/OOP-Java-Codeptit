/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05076_NhapXuatHang;

/**
 *
 * @author Admin
 */
public class Hang {
    private String id,name,rank;
    private int nhap,xuat;
    public Hang(String id, String name, String rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    public void setNhap(int nhap) {
        this.nhap = nhap;
    }

    public void setXuat(int xuat) {
        double x;
        if(rank.equals("A")) x=0.08;
        else if(rank.equals("B")) x=0.05;
        else x=0.02;
        
        this.xuat = (int) (xuat+xuat*x);
    }
    
    public String getId() {
        return id;
    }
    public String toString(){
        return id+" "+name+" "+nhap+" "+xuat;
    }
}
