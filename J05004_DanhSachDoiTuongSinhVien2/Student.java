
package J05004_DanhSachDoiTuongSinhVien2;

public class Student {
    private String id ,name ,grade ,bd ;
    private double gpa;
    static int cnt=1;

    public Student(String name, String grade, String bd, double gpa) {
        this.id ="B20DCCN"+String.format("%03d", cnt ++);
        this.name = name;
        this.grade = grade;
        this.bd = bd;
        this.gpa = gpa;
    }
    public void chuanHoaName(){
        String[] word =name.trim().split("\\s+");
        String res ="";
        for (String tmp : word){
            res+=tmp.substring(0,1).toUpperCase()+tmp.substring(1).toLowerCase()+" ";
        }
        this.name=res;
    }
    public void chuanHoaBd(){
        StringBuilder sb =new StringBuilder(this.bd);
        if(sb.charAt(1)=='/') sb.insert(0, "0");
        if(sb.charAt(4)=='/') sb.insert(3, "0");
        this.bd =sb.toString();
    }
    public String toString(){
        chuanHoaName();
        chuanHoaBd();
        return id+" "+name+" "+grade+" "+bd+" "+String.format("%.2f", gpa);
    }
}
