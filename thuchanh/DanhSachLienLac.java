package thuchanh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class SinhVien implements Comparable<SinhVien>{
    private String id,name,lop,email,sdt;

    public SinhVien(String id, String name, String lop, String email, String sdt) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.sdt = "0"+sdt;
    }
    @Override
    public int compareTo(SinhVien o) {
        if(o.lop.compareTo(this.lop)==0) return this.id.compareTo(o.id);
        else return this.lop.compareTo(o.lop);
    }
    public String toString(){
        return id+" "+name+" "+lop+" "+email+" "+sdt;
    }
}
public class DanhSachLienLac {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> list=new ArrayList<>();
        while(sc.hasNext()){
            String id=sc.nextLine();
            String name =sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            String sdt=sc.nextLine();
            SinhVien sv=new SinhVien(id, name, lop, email, sdt);
            list.add(sv);
        }
        Collections.sort(list);
        for(SinhVien i :list){
            System.out.println(i);
        }
    }
}
/*
B21DCCN123
Tran Van Toan
D21CQCN01-B
toantv@gmail.com
987654321
B21DCCN111
Ly Van Binh
D21CQCN01-B
binhlv@gmail.com
978652142
B21DCAT661
Hoang Tam Anh
D21CQAT01-B
anhht@gmail.com
966554321
*/