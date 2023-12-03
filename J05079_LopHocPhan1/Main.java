/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05079_LopHocPhan1;

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
        int m=sc.nextInt();
        while(m-- >0){
            String s=sc.next();
            String res = null;
            for(LopHocPhan i: list){
                if(i.getId().equals(s)){
                    res=i.getName();
                    break;
                }
            }
            System.out.println("Danh sach nhom lop mon "+res+":");
            for(LopHocPhan i:list){
                if(i.getId().equals(s)){
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
THCS2D20
*/