
package J05005_DanhSachDoiTuongSinhVien3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Student> list =new ArrayList<>(n);
        for(int i=0;i<n;i++){
            String name =sc.nextLine();
            String grade =sc.nextLine();
            String bd =sc.nextLine();
            float gpa =Float.parseFloat(sc.nextLine());
           Student st =new Student(name, grade, bd, gpa);
           list.add(st);
        }
        Collections.sort(list);
        for (Student i : list){
            System.out.println(i);
        }
    }
}
