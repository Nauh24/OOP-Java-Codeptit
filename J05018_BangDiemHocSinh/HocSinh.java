
package J05018_BangDiemHocSinh;

public class HocSinh implements Comparable<HocSinh>{
    private String name ,id;
    static int cnt=1;
    private float[] grades;

    public HocSinh(String name, float[] grades) {
        this.id="HS"+String.format("%02d",cnt++);
        this.name = name;
        this.grades = grades;
    }
    
    public Float tb(){
        float sum=0;
        for(int i=0;i<grades.length;i++){
            if(i<2){
                sum+=grades[i]*2;
            }
            else sum+=grades[i];
        }
        return sum/12;
    }
    public String xepHang(){
        if(this.tb()>=9f) return "XUAT SAC";
        else if(this.tb()>=8f) return "GIOI";
        else if(this.tb()>=7f) return "KHA";
        else if(this.tb()>=5f) return "TB";
        else return "YEU";
    }
    public String toString(){
        return id+" "+name+" "+String.format("%.1f", tb())+" "+xepHang();
    }

    @Override
    public int compareTo(HocSinh o) {
        if(o.tb()==this.tb()) return this.id.compareTo(o.id);
        return o.tb().compareTo(this.tb());
    }
    
}
