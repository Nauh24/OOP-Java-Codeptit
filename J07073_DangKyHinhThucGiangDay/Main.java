/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07073_DangKyHinhThucGiangDay;

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
        Scanner sc =new Scanner(new File("MONHOC.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> list=new ArrayList<>();
        while(n-- >0){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            int soTin=Integer.parseInt(sc.nextLine());
            String lt=sc.nextLine();
            String th=sc.nextLine();
            MonHoc mh=new MonHoc(ma, name, soTin, lt, th);
            list.add(mh);
        }
        Collections.sort(list);
        for(MonHoc i: list){
            if(!i.getTh().equals("Truc tiep")){
                System.out.println(i);
            }
        }
    }
}
