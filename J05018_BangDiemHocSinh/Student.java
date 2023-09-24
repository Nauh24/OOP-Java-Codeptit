
package J05018_BangDiemHocSinh;

public class Student implements Comparable<Student> {

    static int NUM = 1;
    private String id, name;
    private float[] grades;
    public Student(String name, float[] grades) {
        this.id = "HS"+String.format("%02d",NUM++);
        this.name = name;
        this.grades=grades;
        
    }
    public Float avg(){
        float sum=0;
        for(int i=0;i<grades.length;i++){
            if(i<2){
                sum+=grades[i]*2;
            }
            else sum+=grades[i];
        }
        sum/=12f;
        return Math.round(sum*10f)/10f;
    }
    private String xepLoai() {
        if (avg() >= 9) {
            return "XUAT SAC";
        }
        if (avg() >= 8) {
            return "GIOI";
        }
        if (avg() >= 7) {
            return "KHA";
        }
        if (avg() >= 5) {
            return "TB";
        }
        return "YEU";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", avg()) + " " + xepLoai();
    }

    @Override
    public int compareTo(Student o) {
        if (this.avg().compareTo(o.avg())==0) {
            return this.id.compareTo(o.id);
        }
        return -this.avg().compareTo(o.avg());
    }
}
