
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String id,name;
    private int count;

    public DoanhNghiep(String id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return id.compareTo(o.id);
    }
    public String toString(){
        return id+" "+name+" "+count;
    }
}
public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        try{
            int n=Integer.parseInt(sc.nextLine());
            ArrayList<DoanhNghiep> list=new ArrayList<>();
            while(n-- >0){
                String id=sc.nextLine();
                String name=sc.nextLine();
                int count=Integer.parseInt(sc.nextLine());
                DoanhNghiep dn=new DoanhNghiep(id, name, count);
                list.add(dn);
            }
            Collections.sort(list);
            for(DoanhNghiep i : list){
                System.out.println(i);
            }
        }catch(NullPointerException e){
            System.out.println(e);
        }
               
    }
}
