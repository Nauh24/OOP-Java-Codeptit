
package J04012_BaiToanTinhCong;

public class NhanVien {
    private String id ,name,chucVu;
    private int salary,soNgayCong;
    private static int cnt=1;
    public NhanVien(String name, String chucVu, int salary, int soNgayCong) {
        this.id ="NV"+String.format("%02d",cnt++);
        this.name = name;
        this.chucVu = chucVu;
        this.salary = salary;
        this.soNgayCong = soNgayCong;
    }
    public int luongThang(){
        return salary*soNgayCong;
    }
    public int thuong(){
        if(soNgayCong>=25) return (int)luongThang()*20/100;
        else if(soNgayCong>=22) return (int)luongThang()*10/100;
        else return 0;
    }
    public int phuCap(){
        switch (this.chucVu) {
            case "GD":
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            case "NV":
                return 150000;
        }
        return 0;
    }
    public int thuNhap(){
        return luongThang()+thuong()+phuCap();
    }
    public String toString(){
        return id+" "+name+" "+luongThang()+" "+thuong()+" "+phuCap()+" "+thuNhap();
    }
}
