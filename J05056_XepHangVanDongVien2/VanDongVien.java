/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05056_XepHangVanDongVien2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class VanDongVien implements Comparable<VanDongVien>{
    private String id,name;
    private static int cnt=1;
    private Date bd;
    private Date thoiGianXuatPhat,thoiGianDenDich;
    private SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
    private int rank;
    public VanDongVien(String name, Date bd, Date thoiGianXuatPhat, Date thoiGianDenDich) {
        this.name = name;
        this.bd = bd;
        this.thoiGianXuatPhat = thoiGianXuatPhat;
        this.thoiGianDenDich = thoiGianDenDich;
        this.id="VDV"+String.format("%02d", cnt++);
    }
    public String formatDate(long x){
        long second=x/1000;
        long h=second/3600;
        long m=(second%3600)/60;
        long s=second%60;
        return String.format("%02d:%02d:%02d",h,m,s );
    }
    public int tuoi(){
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy");
        int namSinh=Integer.parseInt(sdf2.format(bd));
        return 2021-namSinh;
    }
    public long uuTien(){
        long x;
        if(tuoi()<18) x=0;
        else if(tuoi()<25) x=1;
        else if(tuoi()<32) x=2;
        else x=3;
        //return formatDate(x*1000);
        return x*1000;
    }
    public String thanhTichThucTe(){
        long x=thoiGianDenDich.getTime()-thoiGianXuatPhat.getTime();
        return formatDate(x);
    }
    public String thanhTichXepHang(){
        long x=thoiGianDenDich.getTime()-thoiGianXuatPhat.getTime()-uuTien();
        return formatDate(x);
    }
    public String toString(){
        return id+" "+name+" "+thanhTichThucTe()+" "+formatDate(uuTien())+" "+thanhTichXepHang()+" "+rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(VanDongVien o) {
        return this.thanhTichXepHang().compareTo(o.thanhTichXepHang());
    }
}
