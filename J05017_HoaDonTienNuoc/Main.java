/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05017_HoaDonTienNuoc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list=new ArrayList<>(n);
        while(n-- >0){
            String name=sc.nextLine();
            int chiSoCu=Integer.parseInt(sc.nextLine());
            int chiSoMoi=Integer.parseInt(sc.nextLine());
            KhachHang kh =new KhachHang(name, chiSoCu, chiSoMoi);
            list.add(kh);
        }
    }
}
/*
3
Le Thi Thanh
468
500
Le Duc Cong
160
230
Ha Hue Anh
410
612
*/