
package J06001_TinhToanHoaDonBanQuanAo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> sanPhams =new ArrayList<>(n);
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int donGiaLoai1=Integer.parseInt(sc.nextLine());
            int donGiaLoai2=Integer.parseInt(sc.nextLine());
            SanPham sp=new SanPham(id, name, donGiaLoai1, donGiaLoai2);
            sanPhams.add(sp);
        }
        int m=Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> hoaDons=new ArrayList<>(m);
        while(m-- >0){
            String ma =sc.next();
            int soLuong=sc.nextInt();
            for(SanPham i : sanPhams){
                if(ma.startsWith(i.getId())){
                    HoaDon hd =new HoaDon(ma,i, soLuong);
                    hoaDons.add(hd);
                    break;
                }
            }
        }
        for(HoaDon i : hoaDons){
            System.out.println(i);
        }
    }
}
/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
*/