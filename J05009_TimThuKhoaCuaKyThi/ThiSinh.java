
package J05009_TimThuKhoaCuaKyThi;

public class ThiSinh implements Comparable<ThiSinh>{
    private String name,bd ;
    static int cnt=1;
    private float d1,d2,d3;
    private int id;
    public ThiSinh(String name, String bd, float d1, float d2, float d3) {
        this.id =cnt++;
        this.name = name;
        this.bd = bd;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public Float tongDiem(){
        return d1+d2+d3;
    }
    public String toString(){
        return id+" "+name+" "+bd+" "+tongDiem();
    }
    public int compareTo(ThiSinh o){
        if(this.tongDiem()==o.tongDiem()){
            return this.id -o.id;
        }
        return -this.tongDiem().compareTo(o.tongDiem());
    }
}
