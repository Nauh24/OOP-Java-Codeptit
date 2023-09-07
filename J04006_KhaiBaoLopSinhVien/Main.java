
package J04006_KhaiBaoLopSinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        Student s =new Student("B20DCCN001",sc.nextLine(),sc.next(),sc.next(),sc.nextFloat());
        s.formatBird();
        System.out.println(s);
    }
}
