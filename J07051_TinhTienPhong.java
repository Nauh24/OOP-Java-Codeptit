
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class KhachHang implements Comparable<KhachHang>{

    private String id, name,soPhong;
    private int  phatSinh;
    private long time;
    private static int cnt = 1;

    public KhachHang(String name, String soPhong, int phatSinh, long time) {
        this.id = "KH" + String.format("%02d", cnt++);
        this.name = name;
        this.soPhong = soPhong;
        this.phatSinh = phatSinh;
        this.time = time+1;
    }
    public int gia(){
        switch (soPhong.charAt(0)) {
            case '1':
                return 25;
            case '2':
                return 34;
            case '3':
                return 50;
            case '4':
                return 80;
            default:
                return 0;
        }
    }
    public Integer thanhTien(){
        return gia()*(int)(time)+phatSinh;
    }
    void chuanHoaTen(){
        String[] res=name.toLowerCase().split("\\s+");
        String ans="";
        for(String i: res){
            ans+=i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        }
        name=ans;
    }
    @Override
    public int compareTo(KhachHang o) {
        return o.thanhTien().compareTo(thanhTien());
    }
    public String toString(){
        chuanHoaTen();
        return id+" "+name+" "+soPhong+" "+time+" "+thanhTien();
    }
}

public class J07051_TinhTienPhong {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc =new Scanner(new File("KHACHHANG.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list=new ArrayList<>();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        while(n-- >0){
            String name=sc.nextLine().trim();
            String soPhong=sc.nextLine();
            Date startDay=sdf.parse(sc.nextLine());
            Date endDay=sdf.parse(sc.nextLine());
            int phatSinh=Integer.parseInt(sc.nextLine());
            long time=(endDay.getTime()-startDay.getTime())/86400000;
            KhachHang kh=new KhachHang(name, soPhong, phatSinh, time);
            list.add(kh);
        }
        Collections.sort(list);
        for(KhachHang i : list){
            System.out.println(i);
        }
    }
}
