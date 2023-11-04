
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThiSinh implements Comparable<ThiSinh>{
    private String id,name;
    private double toan,ly,hoa;
    private static double diemChuan;
    public ThiSinh(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public static void setDiemChuan(double diemChuan){
        ThiSinh.diemChuan=diemChuan;
    }
    public double diemUuTien(){
        String s=id.substring(0,3);
        if(s.equals("KV1")) return 0.5;
        if(s.equals("KV2")) return 1.0;
        if(s.equals("KV3")) return 2.5;
        return 0;
    }
    public Double diemXetTuyen(){
        return toan*2+ly+hoa+diemUuTien();
    }

    public String getId() {
        return id;
    }

    public String status(){
        if(diemXetTuyen()>=diemChuan) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    public void chuanHoaName(){
        String [] res=name.split("\\s+");
        String ans="";
        for(String i:res){
            ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
        }
        name=ans;
    }
    public String removeZero(double x){
        DecimalFormat df=new DecimalFormat("#.#");
        return df.format(x);
    }
    @Override
    public int compareTo(ThiSinh o) {
        if(diemXetTuyen()==o.diemXetTuyen()){
            return (int)id.compareTo(o.id);
        }
        else return o.diemXetTuyen().compareTo(diemXetTuyen());
    }
    public String toString(){
        chuanHoaName();
        return id+" "+name+removeZero(diemUuTien())+" "
                +removeZero(diemXetTuyen())+" "+status();
    }
    
}
public class J07052_DanhSachTrungTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("THISINH.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list=new ArrayList<>();
        while(n-- >0){
            String id=sc.nextLine();
            String name=sc.nextLine().trim();
            double toan=Double.parseDouble(sc.nextLine());
            double ly=Double.parseDouble(sc.nextLine());
            double hoa=Double.parseDouble(sc.nextLine());
            ThiSinh ts=new ThiSinh(id, name, toan, ly, hoa);
            list.add(ts);
        }
        int chiTieu=sc.nextInt();
        Collections.sort(list);
//        Collections.sort(list, new Comparator<ThiSinh>(){
//            @Override
//            public int compare(ThiSinh o1, ThiSinh o2) {
//                if(o1.diemXetTuyen() == o2.diemXetTuyen())
//                    return o1.getId().compareTo(o2.getId());
//                if(o1.diemXetTuyen() < o2.diemXetTuyen())
//                    return 1;
//                return -1;
//            }
//        });
        double diemChuan = list.get(chiTieu-1).diemXetTuyen();
        ThiSinh.setDiemChuan(diemChuan);
        System.out.printf("%.1f",diemChuan);
        System.out.println();
        for(ThiSinh i :list){
            System.out.println(i);
        }
    }
}
