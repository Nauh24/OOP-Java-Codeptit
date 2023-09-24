
package J05020_SapXepSinhVienTheoLop;

public class SinhVien implements Comparable<SinhVien> {
    private String id ,name, grade ,email;

    public SinhVien(String id, String name, String grade, String email) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.grade.compareTo(o.grade)==0){
            return this.id.compareTo(o.id);
        }
        return this.grade.compareTo(o.grade);
    }
    public String toString(){
        return id+" "+name+" "+grade+" "+email;
    }
}
