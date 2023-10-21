
package thuchanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
class MonHoc {
    private String maMonHoc,tenMonHoc;

    public MonHoc(String maMonHoc, String tenMonHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }
    
}
class GiangVien {
    private String maGiangVien,tenGiangVien;
    private double soGioChuan;
    public GiangVien(String maGiangVien, String tenGiangVien) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
    }

    
    public String getMaGiangVien() {
        return maGiangVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }
//    public int getSoGioChuan(double x){
//        return soGioChuan+x;
//    }

    public void getSoGioChuan(double x) {
         soGioChuan+=x;
    }
    
    public String toString(){
        return tenGiangVien+" "+String.format("%.2f",soGioChuan);
    }
}

class LopHocPhan {
    private String maGiangVien;
    private String maMonHoc;
    private double gioChuan;
    //private GiangVien gv;

    public LopHocPhan(String maGiangVien, String maMonHoc, double gioChuan) {
        this.maGiangVien = maGiangVien;
        this.maMonHoc = maMonHoc;
        this.gioChuan = gioChuan;
    }

    
    
    public String getMaMonHoc() {
        return maMonHoc;
    }

    public double getGioChuan() {
        return gioChuan;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }
    
}


public class TinhTongSoGioGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File("MONHOC.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> monHocs=new ArrayList<>(n);
        while(n-- >0){
            String ma =sc.next();
            String ten=sc.nextLine();
            MonHoc mh=new MonHoc(ma, ten);
            monHocs.add(mh);
        }
        Scanner sc2 =new Scanner(new File("GIANGVIEN.in"));
        int m=Integer.parseInt(sc2.nextLine());
        ArrayList<GiangVien> giangViens=new ArrayList<>(m);
        while(m-- >0){
            String ma=sc2.next();
            String ten=sc2.nextLine();
            GiangVien gv=new GiangVien(ma,ten);
            giangViens.add(gv);
        }
        Scanner sc3=new Scanner(new File("GIOCHUAN.in"));
        int k=Integer.parseInt(sc3.nextLine());
        ArrayList<LopHocPhan> lopHocPhans=new ArrayList<>(k);
        while(k-- >0){
            String s=sc3.nextLine();
            String res[] =s.split("\\s+");
            String ma=res[0];
            String maMon=res[1];
            double gio=Double.parseDouble(res[2]);
            for(GiangVien i : giangViens){
                if(i.getMaGiangVien().equals(ma)){
                    i.getSoGioChuan(gio);
                    break;
                }
            }
           
        }
        for(GiangVien i : giangViens){
            System.out.println(i);
        }
    }
}
/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113.2
GV02 INT1306 126.72
*/