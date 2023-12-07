/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07018_ChuanHoaDanhSachSinhVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("src/SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list=new ArrayList<>();
        while(n-- >0){
            String name=sc.nextLine();
            String grade=sc.nextLine();
            String bd=sc.nextLine();
            float gpa=Float.parseFloat(sc.nextLine());
            SinhVien sv=new SinhVien(name, grade, bd, gpa);
            list.add(sv);
        }
        for(SinhVien i: list){
            System.out.println(i);
        }
    }
}
