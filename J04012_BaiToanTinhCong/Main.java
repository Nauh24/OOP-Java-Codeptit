
package J04012_BaiToanTinhCong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name =sc.nextLine();
        int salary =Integer.parseInt(sc.nextLine());
        int soNgayCong =Integer.parseInt(sc.nextLine());
        String chucVu =sc.nextLine();
        NhanVien nv =new NhanVien(name, chucVu, salary, soNgayCong);
        System.out.println(nv);
    }
}
