
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class TienDien implements Comparable<TienDien>{
    private String id,name,loai;
    private static int cnt=1;
    private int dau,cuoi;

    public TienDien(String name, String loai, int dau, int cuoi) {
        this.name = name;
        this.loai = loai;
        this.dau = dau;
        this.cuoi = cuoi;
        this.id="KH"+String.format("%02d", cnt++);
    }
    public void chuanHoa(){
        String s[]=name.trim().split("\\s+");
        String ans="";
        for(String i: s){
            ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
        }
        name=ans;
    }
    public int dinhMuc(){
        if(loai.equals("A")) return 100;
        if(loai.equals("B")) return 500;
        return 200;
    }
    public int tienTrongDinhMuc(){
        int soDien=cuoi-dau;
        if(soDien<dinhMuc()) return soDien*450;
        if(soDien>dinhMuc()) return dinhMuc()*450;
        return 0;
    }
    public int tienVuotDinhMuc(){
                int soDien=cuoi-dau;
                if(soDien>dinhMuc()) return (soDien-dinhMuc())*1000;
                else return 0;
    }
    public int thue(){
        return (int) (0.05*tienVuotDinhMuc());
    }
    public Integer tienPhaiNop(){
        return tienTrongDinhMuc()+tienVuotDinhMuc()+thue();
    }
    public String toString(){
        chuanHoa();
        return id+" "+name+tienTrongDinhMuc()+" "+tienVuotDinhMuc()+" "+thue()+" "+tienPhaiNop();
    }

    @Override
    public int compareTo(TienDien o) {
        return o.tienPhaiNop().compareTo(tienPhaiNop());
    }
}
public class J07056_TinhTienDien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("KHACHHANG.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<TienDien> list=new ArrayList<>();
        while(n-- >0){
            String name=sc.nextLine();
            String s[]=sc.nextLine().split("\\s+");
            TienDien td=new TienDien(name, s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]));
            list.add(td);
        }
        Collections.sort(list);
        for(TienDien i: list){
            System.out.println(i);
        }
    }
}
