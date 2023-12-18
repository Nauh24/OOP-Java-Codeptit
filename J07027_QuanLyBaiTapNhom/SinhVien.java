/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07027_QuanLyBaiTapNhom;

/**
 *
 * @author PTIT
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ma,ten,sdt;
    private BaiTap bt;
    public SinhVien(String ma, String ten, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
    }
    public String toString(){
        return ma+" "+ten+" "+sdt+" "+bt.getStt()+" "+bt.getTen();
    }

    public void setBt(BaiTap bt) {
        this.bt = bt;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(ma.compareTo(o.ma)!=0)  return ma.compareTo(o.ma);
        else{
            if(bt.getStt().compareTo(o.bt.getStt())!=0) return bt.getStt().compareTo(o.bt.getStt());
            else{
                return bt.getTen().compareTo(o.bt.getTen());
                
            }
        }
        
    }
}
