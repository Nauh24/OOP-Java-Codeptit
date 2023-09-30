
package J05026_DanhSachGiangVienTheoBoMon;

public class GiangVien {
    private String name ,mon,id;
    static int cnt=1;

    public GiangVien(String name, String mon) {
        this.name = name;
        this.mon = mon;
        this.id ="GV"+String.format("%02d",cnt++);
    }
    public String formatMon(){
        String res="";
        mon=mon.toUpperCase();
        String[] s=mon.split("\\s+");
        for(String i:s){
            res+=i.charAt(0);
        }
        return res;
    }
    public String toString(){
        return id +" "+name+" "+formatMon();
    }
}
