
package J05006_DanhSachDoiTuongNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list =new ArrayList<>(n);
        for(int i=0;i<n;i++){
            String name =sc.nextLine();
            String sex =sc.nextLine();
            String bd =sc.nextLine();
            String add =sc.nextLine();
            String msThue =sc.nextLine();
            String dateKi =sc.nextLine();
            NhanVien nv =new NhanVien(name, sex, bd, add, msThue, dateKi);
            list.add(nv);
        }
            
        
        for (NhanVien i : list){
            System.out.println(i);
        }
    }
}
