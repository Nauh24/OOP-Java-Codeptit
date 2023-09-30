
package J05044_LietKeNhanVienTheoChucVu;

public class NhanVien {
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

    public String getChucVu() {
        return chucVu;
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
}
