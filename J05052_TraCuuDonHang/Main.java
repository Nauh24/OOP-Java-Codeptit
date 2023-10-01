
package J05052_TraCuuDonHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> list=new ArrayList<>(n);
        while(n-- >0){
            String name=sc.nextLine();
            String id=sc.nextLine();
            int donGia=Integer.parseInt(sc.nextLine());
            int soLuong=Integer.parseInt(sc.nextLine());
            DonHang dh=new DonHang(name, id, donGia, soLuong);
            list.add(dh);
        }
        for(DonHang i: list){
            System.out.println(i);
        }
    }
}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
*/