
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class ThiSinh implements Comparable<ThiSinh>{
    private String id,name,dtoc;
    private static int cnt=1;
    private int khuVuc;
private double diemThi;
    public ThiSinh(String name,double diemThi, String dtoc, int khuVuc) {
        this.name = name;
        this.dtoc = dtoc;
        this.khuVuc = khuVuc;
        this.diemThi=diemThi;
        this.id="TS"+String.format("%02d",cnt++);
    }
    public void chuanHoa(){
        String s[]=name.trim().split("\\s+");
        String ans="";
              for(String i: s){
                  ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
              }
              name=ans;
    }
    public double diemUuTien(){
        double x=0;
        if(khuVuc==1) x+=1.5;
        if(khuVuc==2) x+=1;
        if(!dtoc.equals("Kinh")) x+=1.5;
        return x;
    }
    public Double tongDiem(){
        return diemThi+diemUuTien();
    }
    public String status(){
        if(tongDiem()>=20.5) return "Do";
        else return "Truot";
    }
    public String toString(){
        chuanHoa();
        return id+" "+name+String.format("%.1f", tongDiem())+" "+status();
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(tongDiem().compareTo(o.tongDiem())==0){
            return id.compareTo(o.id);
        }
        else return o.tongDiem().compareTo(tongDiem());
    }
    
}
public class J07057_DiemTuyenSinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File ("THISINH.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list=new ArrayList<>();
        while(n-- >0){
            String name=sc.nextLine();
            Double diem=Double.parseDouble(sc.nextLine());
            String dtoc=sc.nextLine();
            int kvuc=Integer.parseInt(sc.nextLine());
            ThiSinh ts=new ThiSinh(name, diem, dtoc, kvuc);
            list.add(ts);
        }
        Collections.sort(list);
        for(ThiSinh i: list){
            System.out.println(i);
        }
    }
}
