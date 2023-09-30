
package J05034_DanhSachThucTap1;

public class Student implements Comparable<Student>{
    private static int cnt=1;
    private int stt;
    private String id ,name ,className ,email ,doanhNghiep ;

    public Student(String id, String name, String className, String email, String doanhNghiep) {
        this.stt=cnt++;
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }
    public String toString(){
        return stt+" "+id+" "+name+" "+className+" "+email+" "+doanhNghiep;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
