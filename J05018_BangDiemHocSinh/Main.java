
package J05018_BangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> list =new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            float[] p = new float[10];
            for (int j = 0; j < 10; j++) {
                p[j] = sc.nextFloat();
            }
            Student st =new Student(name,p);
            list.add(st);
        }

        Collections.sort(list);
        for (Student e : list) {
            System.out.println(e);
        }
    }
}
/*
3
Luu Thuy Nhi
9.3 9.0 7.1 6.5 6.2 6.0 8.2 6.7 4.8 5.5
Le Van Tam
8.0 8.0 5.5 9.0 6.8 9.0 7.2 8.3 7.2 6.8
Nguyen Thai Binh
9.0 6.4 6.0 7.5 6.7 5.5 5.0 6.0 6.0 6.0
*/