
import java.util.Date;

class XetTuyen{
    private String id,name;
    private Date ngay;
    private double lyThuyet,thucHanh;
private static int cnt=1;
    public XetTuyen(String name, Date ngay, double lyThuyet, double thucHanh) {
        this.name = name;
        this.ngay = ngay;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        this.id="PH"+String.format("%02d", cnt++);
    }
    public void chuanHoaName(){
        String res[]=name.trim().split("\\s+");
        String ans="";
        for(String i: res){
            ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
        }
        name=ans;
    }
    public int tuoi(){
        int year=Integer.parseInt(ngay.toString().substring(6));
        return 2021-year;
    }
}
public class J07053_XetTuyen {
    
}
