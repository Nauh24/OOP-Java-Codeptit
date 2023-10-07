/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05057_BangDiemTuyenSinh;

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
        ArrayList<ThiSinh> list=new ArrayList<>(n);
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            double toan=Double.parseDouble(sc.nextLine());
            double ly=Double.parseDouble(sc.nextLine());
            double hoa=Double.parseDouble(sc.nextLine());
            ThiSinh ts=new ThiSinh(id, name, toan, ly, hoa);
            list.add(ts);
        }
        for(ThiSinh i : list){
            System.out.println(i);
        }
    }
}
/*
2
KV2A002
Hoang Thanh Tuan
5
6
5
KV2B123
Ly Thi Thu Ha
8
6.5
7
*/