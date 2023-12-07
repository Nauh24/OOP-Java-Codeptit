/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05082_DanhSachKhachHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list=new ArrayList<>();
        while(n-- >0){
            String name=sc.nextLine().trim();
            String sex=sc.nextLine();
            String date=sc.nextLine();
            String add=sc.nextLine();
            KhachHang kh=new KhachHang(name, sex, date, add);
            list.add(kh);
        }
        Collections.sort(list);
        for(KhachHang i:list){
            System.out.println(i);
        }
    }
}
/*
2
 nGuyen VAN     nAm
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
 TRan    vAn     biNh
Nam
14/11/1995
Phung Khoang-Nam Tu Liem-Ha Noi
*/
