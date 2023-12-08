/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07038_DanhSachThucTap3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("src/SINHVIEN.in"));
        Scanner sc2=new Scanner(new File("src/DN.in"));
        Scanner sc3=new Scanner(new File("src/THUCTAP.in"));
        ArrayList<SinhVien> listsv=new ArrayList<>();
        int n=Integer.parseInt(sc1.nextLine());
        while(n-- >0){
            String id=sc1.nextLine();
            String name=sc1.nextLine();
            String lop=sc1.nextLine();
            String email=sc1.nextLine();
            SinhVien sv=new SinhVien(id, name, lop, email);
            listsv.add(sv);
        }
        sc1.close();
        Collections.sort(listsv);
        ArrayList<DoanhNghiep> listdn=new ArrayList<>();
        int m=Integer.parseInt(sc2.nextLine());
        while(m -- >0){
            String id=sc2.nextLine();
            String name=sc2.nextLine();
            int sl=Integer.parseInt(sc2.nextLine());
            DoanhNghiep dn=new DoanhNghiep(id, name, sl);
            listdn.add(dn);
        }
        sc2.close();

        int k=sc3.nextInt();
        while(k-- >0){
            String maSv=sc3.next();
            String maDn=sc3.next();
            SinhVien sv = null;
            for(SinhVien i: listsv){
                if(i.getId().equals(maSv)){
                    sv=i;
                    break;
                }
            }
            DoanhNghiep dn = null;
            for(DoanhNghiep i: listdn){
                if(i.getId().equals(maDn)){
                    dn=i;
                    break;
                }
            }
            dn.update(sv);
        }
        int v=sc3.nextInt();
        while(v -- >0){
            String maDn=sc3.next();
            DoanhNghiep dn = null;
            for(DoanhNghiep i: listdn){
                if(i.getId().equals(maDn)){
                    dn=i;
                    break;
                }
            }
            System.out.println("DANH SACH THUC TAP TAI "+dn.getName()+":");
            int cnt=dn.getSoLuong();
            ArrayList<SinhVien> list=dn.getList();
            Collections.sort(list,new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return o1.getId().compareTo(o2.getId());
                }
            });
            for(SinhVien i: list){
                if(cnt==0) break;
                System.out.println(i);
                cnt--;
            }
        }
        sc3.close();
    }
}
