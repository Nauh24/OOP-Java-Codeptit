
package codeptit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        Set<Character> res = new HashSet<>();
        for (char i: s.toCharArray()){
            res.add(i);
        }
        System.out.println(res.size());
    }
}
