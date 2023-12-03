/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05075_DiemDanh2;

import J05074_DiemDanh1.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String grade = sc.nextLine();
            SinhVien sv = new SinhVien(id, name, grade);
            list.add(sv);
        }
            
        
        for(int i=0;i<n;i++){
            String id=sc.next();
            String dcc=sc.next();
            for(SinhVien j: list){
                if(j.getId().equals(id)){
                    j.setDcc(dcc);
                    break;
                }
            }
        }
        String maLop=sc.next();
        for (SinhVien i : list) {
            if(i.getGrade().equals(maLop))
            System.out.println(i);
        }
    }
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
*/
