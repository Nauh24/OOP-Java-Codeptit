
package J05025_SapXepDanhSachGiangVien;

public class GiangVien implements Comparable<GiangVien>{
    private String name ,id,mon;
    static int cnt=1;

    public GiangVien(String name,  String mon) {
        this.name = name;
        this.id ="GV"+String.format("%02d",cnt++);
        this.mon = mon;
    }
    public String toString(){
        return id +" "+name+" "+formatMon();
    }
    public String ten(){
        String[] s=name.split("\\s+");
        return s[s.length-1];
    }
    public String formatMon(){
        String res ="";
        mon=mon.toUpperCase();
        String ans[] =mon.split("\\s+");
        for(int i=0;i<ans.length;i++){
            res+=ans[i].charAt(0);
        }
        return res;
    }
    @Override
    public int compareTo(GiangVien o) {
        if(this.ten().compareTo(o.ten())==1){
            return this.id.compareTo(o.id);
        }
        else return this.ten().compareTo(o.ten());
    }
    
}
