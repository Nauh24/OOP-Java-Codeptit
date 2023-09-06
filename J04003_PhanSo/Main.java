
package J04003_PhanSo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a =sc.nextLong();
        long b= sc.nextLong();
        PhanSo p =new PhanSo(a, b);
        System.out.println(p);
    }
}
