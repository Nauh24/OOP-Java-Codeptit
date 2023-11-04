
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class SanPham implements Comparable<SanPham>{
    private String id,name;
    private Integer giaBan,baoHanh;

    public SanPham(String id, String name, Integer giaBan, Integer baoHanh) {
        this.id = id;
        this.name = name;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    @Override
    public int compareTo(SanPham o) {
        if(giaBan.compareTo(o.giaBan)==0){
            return id.compareTo(o.id);
        }
        else return o.giaBan.compareTo(giaBan);
    }
    public String toString(){
        return id+" "+name+" "+giaBan+" "+baoHanh;
    }
}
public class J07048_DanhSachSanPham2 {
    public static void main(String[] args) throws FileNotFoundException {
           Scanner sc =new Scanner(new File("SANPHAM.in"));
           int n=Integer.parseInt(sc.nextLine());
           ArrayList<SanPham> list=new ArrayList<>();
           while(n -- >0){
               String id=sc.nextLine();
               String name=sc.nextLine();
               int giaBan=Integer.parseInt(sc.nextLine());
               int baoHang=Integer.parseInt(sc.nextLine());
               SanPham sp=new SanPham(id, name, giaBan, baoHang);
               list.add(sp);
           }
           Collections.sort(list);
           for(SanPham i : list){
               System.out.println(i);
           }
    }
}
