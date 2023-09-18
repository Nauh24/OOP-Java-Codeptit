package J05010_SapXepDanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list = new ArrayList<>(n);
        while (n-- > 0) {
            String name =sc.nextLine();
            String group =sc.nextLine();
            double buyCost =Double.parseDouble(sc.nextLine());
            double sellCost =Double.parseDouble(sc.nextLine());
            MatHang mh =new MatHang( name, group, buyCost, sellCost);
            list.add(mh);
        }
        Collections.sort(list);
        for(MatHang i : list){
            System.out.println(i);
        }
    }

}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
*/