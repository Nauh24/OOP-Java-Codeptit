/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05078_BangLuongTheoPhongBan;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<PhongBan> listpb=new ArrayList<>();
        ArrayList<NhanVien> listnv=new ArrayList<>();
        while(n-- >0){
            //String s[]=sc.nextLine().split("\\s+");
            //String id=s[0];
            //String name=s[1];
            String id=sc.next();
            String name=sc.nextLine();
            //sc.next();
            PhongBan pb=new PhongBan(id, name);
            listpb.add(pb);
        }
        int m=Integer.parseInt(sc.nextLine());
        while(m-- >0){
            String id=sc.nextLine();
            String idPb=id.substring(3);
            PhongBan j = null;
            for(PhongBan i:listpb){
                if(i.getId().equals(idPb)){
                    j=i;
                    break;
                }
            }
            String name=sc.nextLine();
            int hs=Integer.parseInt(sc.nextLine());
            int ngay=Integer.parseInt(sc.nextLine());
            NhanVien nv=new NhanVien(id, name, hs, ngay, j);
            listnv.add(nv);
        }
        String s=sc.next();
        String res = null;
        for(PhongBan i:listpb){
            if(i.getId().equals(s)){
                res=i.getName();
                break;
            }
        }
        System.out.println("Bang luong phong "+res+":");
        
        for(NhanVien i: listnv){
            if(i.getPb().getId().equals(s))
            System.out.println(i);
        }
    }
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
*/