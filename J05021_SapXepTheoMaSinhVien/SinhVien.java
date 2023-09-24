
package J05021_SapXepTheoMaSinhVien;

public class SinhVien implements Comparable<SinhVien>{
    private String id ,name,grade,email;

    public SinhVien(String id, String name, String grade, String email) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }
    public String toString(){
        return id+" "+name+" "+grade+" "+email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.id.compareTo(o.id);
    }
    
}
