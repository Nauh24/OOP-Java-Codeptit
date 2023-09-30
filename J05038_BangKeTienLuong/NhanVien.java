
package J05038_BangKeTienLuong;

public class NhanVien {
    private String id;
    private static int cnt=1;
    private String name;
    private int luongNgay;
    private int soNgayCong;
    private String chucVu;

    public NhanVien(String name, int luongNgay, int soNgayCong, String chucVu) {
        this.name = name;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        this.id="NV"+String.format("%02d",cnt++);
        
    }
    public int luongThang(){
        return this.luongNgay*this.soNgayCong;
    }
    public int thuong(){
        if(this.soNgayCong>=25) return (int) (0.2*this.luongThang());
        if(this.soNgayCong>=22) return (int) (0.1*this.luongThang());
        return 0;
    }
    public int phuCapChucVu(){
        switch (this.chucVu) {
            case "GD":
                return 250000; 
            case "PGD":
                return 200000;
            case "TP":
                return 180000; 
            case "NV":
                return 150000; 
            default: return 0;
        }
        
    }
    public int thucLinh(){
        return luongThang()+thuong()+phuCapChucVu();
    }
    public String toString(){
        return id+" "+name+" "+luongThang()+" "+thuong()+" "+phuCapChucVu()+" "+thucLinh();
    }
}
