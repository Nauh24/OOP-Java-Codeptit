/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06008_TinhGioChuanChoTungGiangVien;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        HashMap<String,String> monMap=new HashMap<>(n);
        while (n-- > 0) {
            String ma = sc.next();
            String ten = sc.nextLine().trim();
      
            monMap.put(ma, ten);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> giangViens = new ArrayList<>(m);
        HashMap<String,String> giangVienMap=new HashMap<>(m);
        while (m-- > 0) {
            String ma = sc.next();
            String ten = sc.nextLine().trim();
            giangVienMap.put(ma, ten);
        }
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<LopHocPhan> lopHocPhans = new ArrayList<>(k);
        
        while (k-- > 0) {
            String s = sc.nextLine();
            String res[] = s.split("\\s+");
            String ma = res[0];
            String maMon = res[1];
            double gio = Double.parseDouble(res[2]);
            LopHocPhan lhp = new LopHocPhan(ma, maMon, gio);
            lopHocPhans.add(lhp);
        }
        String x = sc.next();
        double sum=0;
        System.out.println("Giang vien: "+giangVienMap.get(x));
        
        for(LopHocPhan i : lopHocPhans){
            if(i.getMaGiangVien().equals(x)){
                System.out.print(monMap.get(i.getMaMonHoc())+" ");
                System.out.print(i.getGioChuan());
                System.out.println();
                sum+=i.getGioChuan();
            }
        }
        System.out.print("Tong: ");
        System.out.printf("%.2f",sum);
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
GV01
*/