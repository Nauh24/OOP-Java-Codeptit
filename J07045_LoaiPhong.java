
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class LoaiPhong implements Comparable<LoaiPhong>{
    private String kiHieu;
    private String name;
    private double donGia,phiPhucVu;

    public LoaiPhong(String kiHieu, String name, double donGia, double phiPhucVu) {
        this.kiHieu = kiHieu;
        this.name = name;
        this.donGia = donGia;
        this.phiPhucVu = phiPhucVu;
    }

    public LoaiPhong(String s) {
        String[] res=s.split("\\s+");
        kiHieu=res[0];
        name=res[1];
        donGia=Double.parseDouble(res[2]);
        phiPhucVu=Double.parseDouble(res[3]);
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.name);
    }
    public String toString(){
        return kiHieu+" "+name+" "+(int)donGia+" "+phiPhucVu;
    }
}
public class J07045_LoaiPhong {
public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
