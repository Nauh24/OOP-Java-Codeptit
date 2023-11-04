
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MonHoc implements Comparable<MonHoc>{
    private String id,name;
    private int soTin;

    public MonHoc(String id, String name, int soTin) {
        this.id = id;
        this.name = name;
        this.soTin = soTin;
    }

    @Override
    public int compareTo(MonHoc o) {
        return name.compareTo(o.name);
    }
    public String toString(){
        return id+" "+name+" "+soTin;
    }
}
public class J07034_DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File("MONHOC.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> list=new ArrayList<>();
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            Integer soTin=Integer.parseInt(sc.nextLine());
            MonHoc mh=new MonHoc(id, name, soTin);
            list.add(mh);
        }
        Collections.sort(list);
        for(MonHoc i : list){
            System.out.println(i);
        }
    }
}
