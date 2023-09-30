
package J05050_TinhTienDien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<KhachHang> list=new ArrayList<>(n);
        while(n-- >0){
            String SD =sc.next();
            int chiSoCu=sc.nextInt();
            int chiSoMoi=sc.nextInt();
            KhachHang kh=new KhachHang(SD,chiSoCu,chiSoMoi);
            list.add(kh);
        }
        for(KhachHang i: list){
            System.out.println(i);
        }
    }
}
/*
3
KD
400
555
NN
58
400
CN
150
700
*/