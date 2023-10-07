/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06007_BangTinhGioChuan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> monHocs=new ArrayList<>(n);
        while(n-- >0){
            String ma =sc.next();
            String ten=sc.nextLine();
            MonHoc mh=new MonHoc(ma, ten);
            monHocs.add(mh);
        }
        int m=Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> giangViens=new ArrayList<>(m);
        while(m-- >0){
            String ma=sc.next();
            String ten=sc.nextLine();
            GiangVien gv=new GiangVien(ma,ten);
            giangViens.add(gv);
        }
        int k=Integer.parseInt(sc.nextLine());
        ArrayList<LopHocPhan> lopHocPhans=new ArrayList<>(k);
        while(k-- >0){
            String s=sc.nextLine();
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