/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07027_QuanLyBaiTapNhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author PTIT
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("src/SINHVIEN.in"));
        Scanner sc2=new Scanner(new File("src/BAITAP.in"));
        Scanner sc3=new Scanner(new File("src/NHOM.in"));
        HashMap<String,SinhVien> mapsv =new HashMap<>();
        HashMap<Integer,BaiTap> mapbt =new HashMap<>();
        int n=Integer.parseInt(sc1.nextLine());
        ArrayList<SinhVien> listsv =new ArrayList<>();
        ArrayList<BaiTap> listbt =new ArrayList<>();
        ArrayList<SinhVien> listnhom =new ArrayList<>();
        while(n-- >0){
            String ma=sc1.nextLine();
            String ten =sc1.nextLine();
            String sdt =sc1.nextLine();
            SinhVien sv=new SinhVien(ma, ten, sdt);
            mapsv.put(ma, sv);
            listsv.add(sv);
        }
        int m=Integer.parseInt(sc2.nextLine());
        for(int i=0;i<m;i++){
            String ten=sc2.nextLine();
            BaiTap bt =new BaiTap(ten, i+1);
            mapbt.put(i+1, bt);
            listbt.add(bt);
        }
        while(sc3.hasNextLine()){
            String s[]=sc3.nextLine().split("\\s+");
            String ma=s[0];
            int stt=Integer.parseInt(s[1]);
            mapsv.get(ma).setBt(mapbt.get(stt));
            //listnhom.add(mapsv.get(ma));
        }
        Collections.sort(listsv);
        for(SinhVien i: listsv){
            System.out.println(i);
        }
    }
}
