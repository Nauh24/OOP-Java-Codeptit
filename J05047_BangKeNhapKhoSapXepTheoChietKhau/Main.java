
package J05047_BangKeNhapKhoSapXepTheoChietKhau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list =new ArrayList<>(n);
        MatHang.initMap();
        while (n-- >0){
            String name =sc.nextLine();
            int soLuong =Integer.parseInt(sc.nextLine());
            int donGia=Integer.parseInt(sc.nextLine());
            MatHang mh =new MatHang(name, soLuong, donGia);
            list.add(mh);
        }
        Collections.sort(list);
        for(MatHang i: list){
            System.out.println(i);
        }
    }
}
