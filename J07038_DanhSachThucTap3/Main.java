/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07038_DanhSachThucTap3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("src/SINHVIEN.in"));
        Scanner sc2=new Scanner(new File("src/DN.in"));
        Scanner sc3=new Scanner(new File("src/THUCTAP.in"));
        ArrayList<SinhVien> listsv=new ArrayList<>();
        int n=Integer.parseInt(sc1.nextLine());
        while(n-- >0){
            String id=sc1.nextLine();
            String name=sc1.nextLine();
            String lop=sc1.nextLine();
            String email=sc1.nextLine();
            SinhVien sv=new SinhVien(id, name, lop, email);
            listsv.add(sv);
        }
        Collections.sort(listsv);
        ArrayList<DoanhNghiep> listdn=new ArrayList<>();
        int m=Integer.parseInt(sc2.nextLine());
        while(m -- >0){
            String id=sc2.nextLine();
            String name=sc2.nextLine();
            int sl=Integer.parseInt(sc2.nextLine());
            DoanhNghiep dn=new DoanhNghiep(id, name, sl);
            listdn.add(dn);
        }
        
    }
}
