package J05024_LietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>(n);
        while (n-- > 0) {
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            s = s.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            switch (s) {
               case "KE TOAN":
                    s="DCKT";
                    break;
                
                case "CONG NGHE THONG TIN":
                    s="DCCN";
                    break;
                
                case "AN TOAN THONG TIN":
                    s="DCAT";
                    break;
                
                case "VIEN THONG":
                    s="DCVT";
                    break;
                
                case "DIEN TU":
                    s="DCDT";
                    break;

            }
            for (Student i : list) {
                if (s.equals("DCCN") || s.equals("DCAT")) {
                    if (!i.getClassName().startsWith("E") && i.getId().contains(s)) {
                        System.out.println(i);
                    } else {
                    }
                } else if (i.getId().contains(s)) {
                    System.out.println(i);
                }
            }
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
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
Cong nghe thong tin
 */
