/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05080_LopHocPhan2;

import J05079_LopHocPhan1.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<LopHocPhan> list=new ArrayList<>();
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String nhom=sc.nextLine();
            String tengv=sc.nextLine();
            LopHocPhan lhp=new LopHocPhan(id, name, nhom, tengv);
            list.add(lhp);
        }
        Collections.sort(list);
        int m=Integer.parseInt(sc.nextLine());
        while(m-- >0){
            String s=sc.nextLine();
           
            System.out.println("Danh sach cho giang vien "+s+":");
            for(LopHocPhan i:list){
                if(i.getTenGiangVien().equals(s)){
                    System.out.println(i);
                }
            }
        }
    }
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
Nguyen Binh An
*/