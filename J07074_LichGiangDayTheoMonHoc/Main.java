/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07074_LichGiangDayTheoMonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("src/MONHOC.in"));
        Scanner sc2=new Scanner(new File("src/LICHGD.in"));
        int n=Integer.parseInt(sc1.nextLine());
        ArrayList<MonHoc> listmh=new ArrayList<>();
        ArrayList<LopHocPhan> listlhp=new ArrayList<>();
        HashMap<String,MonHoc> map=new HashMap<>();
        while(n-- >0){
            String id=sc1.nextLine();
            String ten=sc1.nextLine();
            int tin=Integer.parseInt(sc1.nextLine());
            MonHoc mh=new MonHoc(ten, ten, tin);
            listmh.add(mh);
            map.put(id, mh);
        }
        int m=Integer.parseInt(sc2.nextLine());
        while(m-- >0){
            String id=sc2.nextLine();
            int thu=Integer.parseInt(sc2.nextLine());
            int kip=Integer.parseInt(sc2.nextLine());
            String gv=sc2.nextLine();
            String phong=sc2.nextLine();
            LopHocPhan lhp=new LopHocPhan(id, thu, kip, gv, phong);
            listlhp.add(lhp);
        }
        String maMon=sc2.nextLine();
        System.out.println("LICH GIANG DAY MON "+map.get(maMon).getTenMon()+":");
        Collections.sort(listlhp);
        for(LopHocPhan i: listlhp){
            if(i.getMaMon().equals(maMon)){
                System.out.println(i);
            }
        }
    }
}
