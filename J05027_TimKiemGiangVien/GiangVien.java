
package J05027_TimKiemGiangVien;

public class GiangVien {
    private String id ,name ,mon;
    static int cnt=1;
    public GiangVien(String name, String mon) {
        this.id ="GV"+String.format("%02d",cnt++);
        this.name = name;
        this.mon = mon;
    }

    public String getName() {
        return name.toLowerCase();
    }
    
    public String formatMon(){
        String res="";
        mon=mon.toUpperCase();
        String ans[] =mon.split("\\s+");
        for(String i :ans){
            res+=i.charAt(0);
        }
        return res;
    }
    public String toString(){
        return id +" "+name+" "+formatMon();
    }
}
