
package J05007_SapXepDanhSachDoiTuongNhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc =new Scanner(System.in);
        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list =new ArrayList<>(n);
        while (n -- >0){
            String name =sc.nextLine();
            String gt =sc.nextLine();
            Date bd =sdf.parse(sc.nextLine());
            String add =sc.nextLine();
            String msThue =sc.nextLine();
            Date dateKi =sdf.parse(sc.nextLine());
            NhanVien nv =new NhanVien(name, gt, bd, add, msThue, dateKi);
            list.add(nv);
        }
        Collections.sort(list);
        for(NhanVien i : list){
            System.out.println(i);
        }
    }
}
