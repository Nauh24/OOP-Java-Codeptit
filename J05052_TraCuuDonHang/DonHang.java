
package J05052_TraCuuDonHang;

public class DonHang {
    private String name,id;
    private int donGia,soLuong;

    public DonHang(String name, String id, int donGia, int soLuong) {
        this.name = name;
        this.id = id;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public String stt(){
        return id.substring(1,4);
    }
    public int discount(){
        if(id.endsWith("1")) return (int) (0.5*donGia*soLuong);
        else return (int) (0.3*donGia*soLuong);
    }
    public int thanhTien(){
        return donGia*soLuong-discount();
    }
    public String toString(){
        return name+" "+id+" "+stt()+" "+discount()+" "+thanhTien();
    }
}
