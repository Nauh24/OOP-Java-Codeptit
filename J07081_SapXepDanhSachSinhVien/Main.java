/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07081_SapXepDanhSachSinhVien;

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
        Scanner sc=new Scanner(new File("src/SINHVIEN.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Student> list=new ArrayList<>();
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String sdt=sc.nextLine();
            String email=sc.nextLine();
            Student st=new Student(id, name, sdt, email);
            list.add(st);
        }
        Collections.sort(list);
        for(Student i: list){
            System.out.println(i);
        }
    }
}
