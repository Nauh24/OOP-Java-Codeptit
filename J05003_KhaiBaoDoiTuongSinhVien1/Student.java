
package J05003_KhaiBaoDoiTuongSinhVien1;

public class Student {
    private String id;
    private String name ,grade ,bd ;
    private double gpa;
    public static int cnt=1;

    public Student() {
    }
    
    public Student(String name, String grade, String bd, double gpa) {
        this.id ="B20DCCN"+String.format("%03d",cnt++);
        this.name = name;
        this.grade = grade;
        this.bd = bd;
        this.gpa = gpa;
    }
    public void chuanHoa(){
        StringBuilder sb =new StringBuilder(this.bd);
        if(sb.charAt(1)=='/') sb.insert(0, "0");
        if(sb.charAt(4)=='/') sb.insert(3, "0");
        this.bd=sb.toString();
        
    }
    public String toString(){
        chuanHoa();
        return id+" "+name+" "+grade+" "+bd+" "+String.format("%.2f", gpa);
    }
}
