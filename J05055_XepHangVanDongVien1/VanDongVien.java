package J05055_XepHangVanDongVien1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class VanDongVien {

    private String id, name;
    private static int cnt = 1;
    private Date bd;
    private Date thoiGianXuatPhat, thoiGianDenDich;
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private int rank;
    public VanDongVien(String name, Date bd, Date thoiGianXuatPhat, Date thoiGianDenDich) {
        this.id = "VDV" + String.format("%02d", cnt++);
        this.name = name;
        this.bd = bd;
        this.thoiGianXuatPhat = thoiGianXuatPhat;
        this.thoiGianDenDich = thoiGianDenDich;
    }

    public int tinhTuoi(Date bd) {
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
        int namSinh = Integer.parseInt(sdf2.format(bd));
        return 2021 - namSinh;
    }

    public int tinhUuTien() {
        int tuoi = tinhTuoi(bd);
        if(tuoi>=32) return 3;
        else if(tuoi>=25) return 2;
        else if(tuoi>=18) return 1;
        else return 0;
    }
    public String formatDate(long x){
        long second=x/1000;
        long h=second/3600;
        long m=(second%3600)/60;
        long s=second%60;
        return String.format("%02d:%02d:%02d",h,m,s);
    }
    public String thanhTichThucTe() {
        long x = thoiGianDenDich.getTime() - thoiGianXuatPhat.getTime();
        return formatDate(x);
    }
    public String thanhTichXepHang(){
        long x=thoiGianDenDich.getTime()-thoiGianXuatPhat.getTime()-tinhUuTien()*1000;
        return formatDate(x);
    }

    public String getId() {
        return id;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public String toString() {
        return id+" "+name+" "+thanhTichThucTe()+" "+formatDate(tinhUuTien()*1000)+" "+thanhTichXepHang()+" "+rank;
    }
}
