
package J05048_BangTheoDoiNhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MaHang> list=new ArrayList<>(n);
        while (n-- >0){
            String id =sc.nextLine();
            int nhap=Integer.parseInt(sc.nextLine());
            MaHang mh=new MaHang(id, nhap);
            list.add(mh);
        }
        for(MaHang i : list){
            System.out.println(i);
        }
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
*/