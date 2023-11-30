/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07084_ThoiGianOnlineLienTuc;

import java.io.File;
import java.io.FileNotFoundException;
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
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc =new Scanner(new File("src/ONLINE.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Student> list=new ArrayList<>();
        while(n-- >0){
            String name=sc.nextLine();
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date time1=sdf.parse(sc.nextLine());
            long m1=time1.getTime();
            Date time2=sdf.parse(sc.nextLine());
            long m2=time2.getTime();
            long minute=(m2-m1)/60000;
            Student st=new Student(name, minute);
            list.add(st);
        }
        Collections.sort(list);
        for(Student i: list){
            System.out.println(i);
        }
    }
}
