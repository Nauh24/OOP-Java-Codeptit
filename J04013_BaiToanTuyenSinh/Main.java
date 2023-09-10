
package J04013_BaiToanTuyenSinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String id =sc.nextLine();
        String name =sc.nextLine();
        double toan=Double.parseDouble(sc.nextLine());
        double ly=Double.parseDouble(sc.nextLine());
        double hoa=Double.parseDouble(sc.nextLine());
        ThiSinh ts =new ThiSinh(id, name, toan, ly, hoa);
        System.out.println(ts);
    }
}
