
package J05004_DanhSachDoiTuongSinhVien2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while (n -- >0){
            String name =sc.nextLine();
            String grade =sc.nextLine();
            String bd =sc.nextLine();
            double gpa =Double.parseDouble(sc.nextLine());
            Student st =new Student(name, grade, bd, gpa);
            System.out.println(st);
        }
    }
}
