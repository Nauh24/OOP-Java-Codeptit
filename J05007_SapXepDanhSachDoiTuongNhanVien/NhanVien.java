
package J05007_SapXepDanhSachDoiTuongNhanVien;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien>{
    private String id ,name ,gt  ,add ,msThue ;
    static int cnt=1;
    private Date bd ,dateKi;
    public NhanVien( String name, String gt, Date bd, String add, String msThue, Date dateKi) {
        this.id =String.format("%05d",cnt++);
        this.name = name;
        this.gt = gt;
        this.bd = bd;
        this.add = add;
        this.msThue = msThue;
        this.dateKi = dateKi;
    }
    public String formatDate(Date date){
        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
    public String toString(){
        return this.id+" "+name+" "+gt+" "+formatDate(bd)+" "+add+" "+msThue+" "+formatDate(dateKi);
    }
    public int compareTo(NhanVien other){
        return this.bd.compareTo(other.bd);
    }
}
