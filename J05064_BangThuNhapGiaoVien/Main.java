/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05064_BangThuNhapGiaoVien;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<GiaoVien> list=new ArrayList<>(n);
        int cntHT=0,cntHP=0;
        while ( n-- >0){
            String id=sc.nextLine();
            
            String name=sc.nextLine();
            int luong=Integer.parseInt(sc.nextLine());
            String cv=id.substring(0,2);
            if(cv.equals("HT")){
                if(cntHT==1) continue;
                else cntHT++;
            }
            if(cv.equals("HP")){
                if(cntHP==2) continue;
                else cntHP++;
            }
            GiaoVien gv=new GiaoVien(id, name, luong);
            
            list.add(gv);
        }
        for(GiaoVien i : list){
            System.out.println(i);
        }
    }
}
/*
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
*/