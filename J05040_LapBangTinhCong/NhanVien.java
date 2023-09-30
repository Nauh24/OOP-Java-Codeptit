
package J05040_LapBangTinhCong;

public class NhanVien {
    private static int cnt=1;
    private String name,id;
    private int luongCoBan,soNgayCong;
    private String chucVu;

    public NhanVien(String name,  int luongCoBan, int soNgayCong, String chucVu) {
        this.name = name;
        this.id = "NV"+String.format("%02d",cnt++);
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }
    public int tienLuong(){
        return luongCoBan*soNgayCong;
    }
    public int tienThuong(){
        if(soNgayCong>=25) return (int) (0.2*tienLuong());
        else if(soNgayCong>=22) return (int) (0.1*tienLuong());
        else return 0;
    }
    public int phuCap(){
        switch(this.chucVu){
            case "GD":
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            case "NV":
                return 150000;
            default:return 0;
        }
    }
    public int thuNhap(){
        return tienLuong()+tienThuong()+phuCap();
    }
    public String toString(){
        return id+" "+name+" "+tienLuong()+" "+tienThuong()+" "+phuCap()+" "+thuNhap();
    }
}
