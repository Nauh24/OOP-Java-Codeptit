
package thuchanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class SanPham{
    private String name,loai;
    private int soLuong;
            private double donGia;
                   
                   
    private String id;
private static int cnt=1;
    public SanPham(String name, String loai, int soLuong, double donGia) {
        this.name = name;
        this.loai = loai;
        this.soLuong = soLuong;
        this.donGia = donGia*1000;
        this.id=loai+String.format("%03d", cnt++);
    }
    public double thanhTien(){
        double x= (soLuong*donGia);
        if(loai.equals("A")) return (x-x*0.1);
        else if(loai.equals("B")) return (x-x*0.05);
        else return x;
        //return x;
    }
    public String status(){
        if(soLuong<30 ) return "ngung ban";
        if(soLuong>=30 &&soLuong<=50) return "ban";
        if(soLuong>50 ) return "ban nhanh";
        return null;
        
    }
    public String toString(){
        return id+" "+name+" "+(int)soLuong+" "+(int)donGia+" "+(int)thanhTien()+" "+status();
              
    }
}
public class XepLoaiSanPham {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File ("sanpham.dat"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> list=new ArrayList<>();
        try{
            while(n-- >0){
            String name=sc.nextLine();
            String loai=sc.nextLine();
            String s=sc.nextLine();
            String res[] =s.split("\\s+");
            int soluong=Integer.parseInt(res[0]);
            double dongia=Double.parseDouble(res[1]);
            SanPham sp=new SanPham(name, loai, soluong, dongia);
            list.add(sp);
        }
        for(SanPham i : list){
            System.out.println(i);
        }
        }catch(Exception e){
            System.out.println(e);
                   
        }
        
    }
}
