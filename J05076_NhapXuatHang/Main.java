
package J05076_NhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Hang> list=new ArrayList<>();
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String rank=sc.nextLine();
            Hang h=new Hang(id, name, rank);
            list.add(h);
        }
        int m=Integer.parseInt(sc.nextLine());
        while(m-- >0){
            String s=sc.nextLine();
            String res[]=s.split("\\s+");
            String id=res[0];
            int slNhap=Integer.parseInt(res[1]);
            int donGiaNhap=Integer.parseInt(res[2]);
            int slXuat=Integer.parseInt(res[3]);
            for(Hang i:list){
                if(i.getId().equals(id)){
                    i.setNhap(slNhap*donGiaNhap);
                    i.setXuat(slXuat*donGiaNhap);
                    System.out.println(i);
                    break;
                }
            }
            
        }
    }
}
/*
2
A001
Tu lanh
A
P002
May giat
B
2
A001 500 100 300
P002 1000 1000 500
*/