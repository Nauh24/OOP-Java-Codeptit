
package thuchanh.TaoLopVanDongVienChay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VDVChay a =new VDVChay();
        Scanner in =new Scanner(System.in);
        a.input(in);
        System.out.println(a);
    }
}
/*
abc
vdvc-126
Nguyen Dinh Cuong 
200
ab
1500
bb
5

vdvc-126
Nguyen Dinh Cuong 
200
ab
1500
bb
2

vdvc-126
Nguyen Dinh Cuong
200
1500
0
*/