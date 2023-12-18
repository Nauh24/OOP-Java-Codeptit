/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05062_HocBongSinhVien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author PTIT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split("\\s+");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        ArrayList<SinhVien> list=new ArrayList<>();
        ArrayList<SinhVien> resArrayList=new ArrayList<>();

        while(n-- >0){
            String tenString=sc.nextLine();
            String resString[]=sc.nextLine().split("\\s+");
            float gpa=Float.parseFloat(resString[0]);
            int drl=Integer.parseInt(resString[1]);
            SinhVien sv=new SinhVien(tenString, gpa, drl);
            list.add(sv);
            resArrayList.add(sv);
        }
        Collections.sort(list);
        float k = 0;
        int diem=0;
        int cnt=0;
        for(SinhVien iSinhVien: list){
            k=iSinhVien.getGpa();
            cnt++;
            if(cnt>=m) break;
        }
        //System.out.println(k+" "+cnt);
        for(SinhVien iSinhVien: resArrayList){
            if(iSinhVien.getGpa()>=k){
                iSinhVien.setCheck(true);
                
            }
            else{
                iSinhVien.setCheck(false);
            }
            System.out.println(iSinhVien);
           // System.out.println(iSinhVien.getGpa());
        }
    }
}
/*
4 2
Nguyen Van Nam
3.59 75
Tran Hong Ngoc
3.61 90
Do Van An
3.22 90
Nguyen Van Nam
3.59 78
*/