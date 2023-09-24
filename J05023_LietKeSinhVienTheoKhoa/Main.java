
package J05023_LietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        ArrayList<Student> list =new ArrayList<>(n);
        while(n -- >0){
            list.add(new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q =sc.nextInt();
        
        for(int i=0;i<q;i++){
            String s =sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA "+s+":");
            for(Student j : list){
                if(j.getYear().equals(s.substring(2))){
                    System.out.println(j);
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
2015
*/