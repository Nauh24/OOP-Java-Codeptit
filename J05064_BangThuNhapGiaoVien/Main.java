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
        while ( n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int luong=Integer.parseInt(sc.nextLine());
            String s=id.substring(0,2);
            
            GiaoVien gv=new GiaoVien(id, name, luong);
            
            list.add(gv);
        }
        for(GiaoVien i : list){
            System.out.println(i);
        }
    }
}
