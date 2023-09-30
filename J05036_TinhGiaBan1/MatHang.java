
package J05036_TinhGiaBan1;

public class MatHang {
    private static int cnt=1;
    private String name ,unit;
    private int dgNhap ,count;
    private String id;
    public MatHang(String name, String unit, int dgNhap, int count) {
        this.id ="MH"+String.format("%02d",cnt++);
        this.name = name;
        this.unit = unit;
        this.dgNhap = dgNhap;
        this.count = count;
    }
    public int phiVanChuyen(){
        return (int) Math.round(dgNhap*count*0.05);
    }
    public int thanhTien(){
        return dgNhap*count+phiVanChuyen();
    }
    public int giaBan(){
        return (int) Math.round(thanhTien()+0.02*thanhTien());
    }
    public String toString(){
        return id+" "+name+" "+unit+" "+phiVanChuyen()+" "+thanhTien()+" "+giaBan();
    }
}
