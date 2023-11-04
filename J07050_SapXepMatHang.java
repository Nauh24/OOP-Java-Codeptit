
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MatHang implements Comparable<MatHang>{
    private String id,name,nhomHang;
    private double giaMua,giaBan;
    private static int cnt=1;

    public MatHang( String name, String nhomHang, double giaMua, double giaBan) {
        this.id = "MH"+String.format("%02d",cnt++);
        this.name = name;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public Double loiNhuan(){
        return giaBan-giaMua;
    }
    public String toString(){
        return id+" "+name+" "+nhomHang+" "+String.format("%.2f", loiNhuan());
    }

    @Override
    public int compareTo(MatHang o) {
        return o.loiNhuan().compareTo(loiNhuan());
    }
}
public class J07050_SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File("MATHANG.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list=new ArrayList<>();
        while(n-- >0){
            String name=sc.nextLine();
            String nhom=sc.nextLine();
            double mua=Double.parseDouble(sc.nextLine());
            double ban=Double.parseDouble(sc.nextLine());
            MatHang mh=new MatHang( name, nhom, mua, ban);
            list.add(mh);
        }
        Collections.sort(list);
        for(MatHang i: list){
            System.out.println(i);
        }
    }
}
