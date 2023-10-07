/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05054_XepHangHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Student> list=new ArrayList<>(n);
        while(n-- >0){
            String name =sc.nextLine();
            double diemTB=Double.parseDouble(sc.nextLine());
            Student st=new Student(name, diemTB);
            list.add(st);
        }
        list.sort(Comparator.comparing(Student::getDiemTB).reversed());
//        for(Student i : list){
//            System.out.println(i);
//        }
        double curMark=list.get(0).getDiemTB();
        int rank=1,cnt=0;
        for(Student i : list){
            if(i.getDiemTB()==curMark){
                cnt++;
            }
            else {
                rank+=cnt;
                cnt=1;
            }
            curMark= i.getDiemTB();
            i.setXepHang(rank);
        }
        Collections.sort(list,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(Student i :list){
            System.out.println(i);
        }
    }
}
/*
3
Tran Minh Hieu
5.9
Nguyen Bao Trung
8.6
Le Hong Ha
9.2
*/