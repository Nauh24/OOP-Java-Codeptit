
package J05048_BangTheoDoiNhapXuatHang;

public class MaHang {
    private String id;
    private int nhap;

    public MaHang(String id, int nhap) {
        this.id = id;
        this.nhap = nhap;
    }
    public int xuat(){
        if(id.startsWith("A")) return (int) Math.round((double) 0.6*nhap);
        else return (int) Math.round((double) 0.7*nhap);
    }
    public int donGia(){
        if(id.endsWith("Y")) return 110000;
        else return 135000;
    }
    public int tien(){
        return xuat()*donGia();
    }
    public int thue(){
        if(id.startsWith("A")){
            if(id.endsWith("Y")) return (int) (0.08*tien());
            else return (int) (0.11*tien());
        }
        else {
            if(id.endsWith("Y")) return (int) (0.17*tien());
            else return (int) (0.22*tien());
        }
    }
    public String toString(){
        return id+" "+nhap+" "+xuat()+" "+donGia()+" "+tien()+" "+thue();
    }
}
