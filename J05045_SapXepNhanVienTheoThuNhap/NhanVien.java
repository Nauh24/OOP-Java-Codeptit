
package J05045_SapXepNhanVienTheoThuNhap;

public class NhanVien implements Comparable<NhanVien>{
    private String id,name,chucVu;
    private int luongCoBan,soNgayCong;
    private static int cnt=1;

    public NhanVien(String name, String chucVu, int luongCoBan, int soNgayCong) {
        this.name = name;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.id ="NV"+String.format("%02d",cnt++);
    }
    public int phuCap(){
        switch (chucVu) {
            case "GD":
                return 500;
            case "PGD":
                return 400;
            case "TP":
                return 300;
            case "KT":
                return 250;
            
            default: return 100;
        }
    }
    
    public int luongChinh(){
        return luongCoBan*soNgayCong;
    }
    public int thuNhap(){
        return luongChinh()+this.phuCap();
    }
    public int tamUng(){
        int tmp=((phuCap()+luongChinh())*2)/3;
        if( tmp<25000) return (int) (Math.round((double)tmp/1000) *1000);
        else return 25000;
    }
    public int conLai(){
        return luongChinh()-tamUng()+phuCap();
    }
    public String toString(){
        return id+" "+name+" "+phuCap()+" "+luongChinh()+" "+tamUng()+" "+conLai();
    }

    @Override
    public int compareTo(NhanVien o) {
        return o.thuNhap()-this.thuNhap();
    }
}
