
package J05049_LietKeNhapXuatHangTheoNhom;

import java.util.ArrayList;
import java.util.Collections;
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
        String c =sc.next();
        Collections.sort(list);
        for(MaHang i : list){
            if(i.getId().startsWith(c))
            System.out.println(i);
        }
    }
}
