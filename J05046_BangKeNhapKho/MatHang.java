
package J05046_BangKeNhapKho;

import java.util.HashMap;
import java.util.Map;

public class MatHang {
    private String name;
    private int soLuong,donGia;
    private String id ;
    private static Map<String,Integer> mp;
    public static void initMap(){
        MatHang.mp=new HashMap<>();
    }
    public MatHang(String name, int soLuong, int donGia) {
        this.name = name;
        this.soLuong = soLuong;
        this.donGia = donGia;
        String s[] =this.name.split("\\s+");
        String res="";
        res+=String.valueOf(s[0].charAt(0)).toUpperCase()+String.valueOf(s[1].charAt(0)).toUpperCase();
        if(mp.containsKey(res)){
            int cnt=mp.get(res);
            this.id=res+String.format("%02d", ++cnt);
            mp.put(res, cnt);
        }
        else {
            this.id=res+String.format("%02d",1);
            mp.put(res, 1);
        }
    }
    public double phanTramChietKhau(){
        if(soLuong>10) return 0.05;
        else if(soLuong>=8) return 0.02;
        else if (soLuong>=5) return 0.01;
        else return 0;
    }
    public int chietKhau(){
        return (int) (donGia*soLuong*phanTramChietKhau());
    }
    public int thanhTien(){
        return donGia*soLuong-chietKhau();
    }
    public String toString(){
        return id+" "+name+" "+chietKhau()+" "+thanhTien();
    }
}
