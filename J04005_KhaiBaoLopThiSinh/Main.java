
package J04005_KhaiBaoLopThiSinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name =sc.nextLine();
        String birth =sc.nextLine();
        float d1 =sc.nextFloat();
        float d2 =sc.nextFloat();
        float d3 =sc.nextFloat();
        ThiSinh s =new ThiSinh(name, birth, d1, d2, d3);
        System.out.println(s);
    }
}
