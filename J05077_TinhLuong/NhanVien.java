
package J05077_TinhLuong;

public class NhanVien {
    private String id,name;
    private int luongCoBan,soNgayCong;
    private PhongBan pb;

    public NhanVien(String id, String name, int luongCoBan, int soNgayCong, PhongBan pb) {
        this.id = id;
        this.name = name;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.pb = pb;
    }
    public char nhom(){
        return id.charAt(0);
    }
    public int heSoNhan(){
        int soNam=Integer.parseInt(id.substring(1, 3));
        if(nhom()=='A'){
            if(soNam<=3) return 10;
            else if(soNam<=8) return 12;
            else if(soNam<=15) return 14;
            else return 20;
        }
        if(nhom()=='B'){
            if(soNam<=3) return 10;
            else if(soNam<=8) return 11;
            else if(soNam<=15) return 13;
            else return 16;
        }
        if(nhom()=='C'){
            if(soNam<=3) return 9;
            else if(soNam<=8) return 10;
            else if(soNam<=15) return 12;
            else return 14;
        }
        if(nhom()=='D'){
            if(soNam<=3) return 8;
            else if(soNam<=8) return 9;
            else if(soNam<=15) return 11;
            else return 13;
        }
        return 0;
    }
    public int luongThang(){
        return luongCoBan*soNgayCong*heSoNhan()*1000;
    }
    public String toString(){
        return id+" "+name+" "+pb.getName()+" "+luongThang();
    }
}
