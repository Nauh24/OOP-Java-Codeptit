
package J05020_SapXepSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list =new ArrayList<>();
        while (n-- >0){
            String id =sc.nextLine();
            String name =sc.nextLine();
            String grade =sc.nextLine();
            String email= sc.nextLine();
            SinhVien sv =new SinhVien(id,name,grade,email);
            list.add(sv);
        }
        Collections.sort(list);
        for(SinhVien i : list){
            System.out.println(i);
        }
    }
}
/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT200
Nguyen Ngoc Son
D15CQKT03-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT03-B
sv4@stu.ptit.edu.vn

*/