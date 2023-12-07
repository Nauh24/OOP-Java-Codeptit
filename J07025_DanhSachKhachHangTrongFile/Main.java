/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07025_DanhSachKhachHangTrongFile;

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
        Scanner sc=new Scanner(new File("src/KHACHHANG.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list=new ArrayList<>();
        while(n-- >0){
            String name=sc.nextLine();
            String sex=sc.nextLine();
            String bd=sc.nextLine();
            String add=sc.nextLine();
            KhachHang kh=new KhachHang(name, sex, bd, add);
            list.add(kh);
        }
        Collections.sort(list);
        for(KhachHang i: list){
            System.out.println(i);
        }
    }
}
